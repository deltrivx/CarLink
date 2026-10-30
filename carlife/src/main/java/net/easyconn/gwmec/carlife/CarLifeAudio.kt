package net.easyconn.gwmec.carlife

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioManager
import android.media.AudioRecord
import android.media.AudioTrack
import android.media.MediaRecorder
import android.util.Log
import java.util.concurrent.ConcurrentLinkedQueue

/**
 * CarLife 音频：三通道播放（媒体 / TTS / VR 回传）+ 麦克风录音。
 * 对齐原 APK（com.baidu.carlife SDK）的音频架构：AudioTrack 阻塞写入，焦点队列化管理。
 */
class CarLifeAudio(private val onLog: (String) -> Unit) {

    @Volatile private var musicTrack: AudioTrack? = null
    @Volatile private var ttsTrack: AudioTrack? = null
    @Volatile private var micRecord: AudioRecord? = null
    @Volatile private var micThread: Thread? = null
    @Volatile private var running = false

    private val micQueue = ConcurrentLinkedQueue<ByteArray>()

    /**
     * 对应原版 VehiclePCMPlayer.initial()：在版本匹配时先把播放器建好。
     *
     * 手机端只有确认车机侧音频通路就绪才会往音频通道推 PCM；等
     * MSG_MD_MUSIC_INIT 才建 AudioTrack 已经太晚，声音就一直留在手机上。
     * 这里按 48kHz 立体声 16bit 预建两条轨道，后续 INIT 若给别的参数再重建。
     */
    fun prepare() {
        if (musicTrack == null) {
            val fmt = buildAudioFormat(48000, 2, 1)
            createTrack(fmt)?.let { track ->
                musicTrack = track
                track.play()
                onLog("媒体音频已预建 48000Hz")
            }
        }
    }

    fun startMusic(sampleRate: Int, channelConfig: Int, sampleFormat: Int) {
        stopMusic()
        val fmt = buildAudioFormat(sampleRate, channelConfig, sampleFormat)
        val track = createTrack(fmt) ?: return
        musicTrack = track
        track.play()
        onLog("媒体音频已启动 ${sampleRate}Hz")
    }

    fun feedMusic(data: ByteArray) {
        val track = musicTrack ?: return
        try {
            track.write(data, 0, data.size)
        } catch (e: Exception) {
            onLog("媒体音频写入异常: ${e.message}")
        }
    }

    fun startTts(sampleRate: Int, channelConfig: Int, sampleFormat: Int) {
        stopTts()
        val fmt = buildAudioFormat(sampleRate, channelConfig, sampleFormat)
        val track = createTrack(fmt) ?: return
        ttsTrack = track
        track.play()
        onLog("TTS 语音已启动 ${sampleRate}Hz")
    }

    fun feedTts(data: ByteArray) {
        val track = ttsTrack ?: return
        try {
            track.write(data, 0, data.size)
        } catch (e: Exception) {
            onLog("TTS 写入异常: ${e.message}")
        }
    }

    fun startMic() {
        if (micThread != null) return
        val bufSize = AudioRecord.getMinBufferSize(
            16000,
            AudioFormat.CHANNEL_IN_MONO,
            AudioFormat.ENCODING_PCM_16BIT
        )
        if (bufSize <= 0) {
            onLog("麦克风缓冲区大小无效")
            return
        }
        try {
            val record = AudioRecord(
                MediaRecorder.AudioSource.MIC,
                16000,
                AudioFormat.CHANNEL_IN_MONO,
                AudioFormat.ENCODING_PCM_16BIT,
                bufSize * 2
            )
            micRecord = record
            record.startRecording()
            running = true
            micThread = Thread({
                val buf = ByteArray(bufSize)
                while (running) {
                    val n = record.read(buf, 0, buf.size)
                    if (n > 0) {
                        micQueue.add(buf.copyOf(n))
                    }
                }
            }, "CarLife-Mic")
            micThread?.start()
            onLog("麦克风录音已启动")
        } catch (e: SecurityException) {
            onLog("麦克风权限未授予")
        } catch (e: Exception) {
            onLog("麦克风启动失败: ${e.message}")
        }
    }

    fun pollMicData(): ByteArray? = micQueue.poll()

    
    fun pauseMusic() { try { musicTrack?.pause() } catch (_: Exception) {} }
    fun resumeMusic() { try { musicTrack?.play() } catch (_: Exception) {} }

    fun stopAll() {
        stopMusic()
        stopTts()
        stopMic()
    }

    fun stopMusic() {
        try { musicTrack?.stop(); musicTrack?.release() } catch (_: Exception) {}
        musicTrack = null
    }

    private fun stopTts() {
        try { ttsTrack?.stop(); ttsTrack?.release() } catch (_: Exception) {}
        ttsTrack = null
    }

    private fun stopMic() {
        running = false
        try { micRecord?.stop(); micRecord?.release() } catch (_: Exception) {}
        micRecord = null
        micThread = null
        micQueue.clear()
    }

    private fun buildAudioFormat(sampleRate: Int, channelConfig: Int, sampleFormat: Int): AudioFormat {
        val ch = when (channelConfig) {
            1 -> AudioFormat.CHANNEL_OUT_MONO
            2 -> AudioFormat.CHANNEL_OUT_STEREO
            else -> AudioFormat.CHANNEL_OUT_STEREO
        }
        val enc = when (sampleFormat) {
            1 -> AudioFormat.ENCODING_PCM_16BIT
            2 -> AudioFormat.ENCODING_PCM_8BIT
            else -> AudioFormat.ENCODING_PCM_16BIT
        }
        return AudioFormat.Builder()
            .setSampleRate(sampleRate)
            .setChannelMask(ch)
            .setEncoding(enc)
            .build()
    }

    private fun createTrack(fmt: AudioFormat): AudioTrack? {
        val bufSize = AudioTrack.getMinBufferSize(
            fmt.sampleRate, fmt.channelMask, fmt.encoding
        )
        if (bufSize <= 0) {
            onLog("AudioTrack 缓冲区大小无效")
            return null
        }
        return try {
            AudioTrack.Builder()
                .setAudioAttributes(
                    AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build()
                )
                .setAudioFormat(fmt)
                .setBufferSizeInBytes(bufSize * 2)
                .setTransferMode(AudioTrack.MODE_STREAM)
                .build()
        } catch (e: Exception) {
            onLog("AudioTrack 创建失败: ${e.message}")
            null
        }
    }

    data class AudioInitParams(val sampleRate: Int, val channelConfig: Int, val sampleFormat: Int)

    companion object {
        fun parseAudioInit(payload: ByteArray): AudioInitParams {
            var rate = 44100; var ch = 2; var fmt = 1
            Pb.forEachField(payload) { field, wt, v ->
                if (wt == 0) when (field) {
                    1 -> rate = Pb.asVarint(v).toInt()
                    2 -> ch = Pb.asVarint(v).toInt()
                    3 -> fmt = Pb.asVarint(v).toInt()
                }
            }
            return AudioInitParams(rate, ch, fmt)
        }
    }
}
