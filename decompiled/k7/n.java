package k7;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import b3.i0;
import cc.b0;
import cc.k0;
import cc.o1;
import cc.q1;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n3.u;
import t8.o;
import t8.z;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f7374a = t8.a.d(new i0(16));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioTrack f7375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o1 f7376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f7377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hc.c f7378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lc.c f7379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static File f7380g;

    static {
        jc.e eVar = k0.f2635a;
        jc.d dVar = jc.d.f7117c;
        q1 q1VarB = b0.b();
        dVar.getClass();
        f7378e = b0.a(u.G(dVar, q1VarB));
        f7379f = new lc.c();
    }

    public static final void a(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo) {
        o1 o1Var;
        MediaCodec mediaCodec2 = mediaCodec;
        boolean z10 = false;
        while (f7377d && !z10 && (o1Var = f7376c) != null && o1Var.b()) {
            try {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    i9.l.b(inputBuffer);
                    int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                    if (sampleData < 0) {
                        mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        Logger.INSTANCE.d(Constants.TAG, "【音频测试】输入流结束");
                        mediaCodec2 = mediaCodec;
                        z10 = true;
                    } else {
                        mediaCodec2 = mediaCodec;
                        mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                        mediaExtractor.advance();
                    }
                }
                int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L);
                while (iDequeueOutputBuffer >= 0) {
                    if (bufferInfo.size > 0) {
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                        i9.l.b(outputBuffer);
                        int i7 = bufferInfo.size;
                        byte[] bArr = new byte[i7];
                        outputBuffer.get(bArr);
                        AudioTrack audioTrack = f7375b;
                        if (audioTrack != null) {
                            audioTrack.write(bArr, 0, i7);
                        }
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                }
            } catch (IllegalStateException e7) {
                Logger.INSTANCE.e(Constants.TAG, ob.a.q("【音频测试】解码器异常: ", e7.getMessage()));
                return;
            }
        }
    }

    public static final MediaCodec b(MediaFormat mediaFormat) throws IOException {
        String string = mediaFormat.getString("mime");
        i9.l.b(string);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        i9.l.d(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
        mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
        return mediaCodecCreateDecoderByType;
    }

    public static final File c() throws IOException {
        o oVar = f7374a;
        File file = new File(((Context) oVar.getValue()).getFilesDir(), "audio_test.aac");
        if (file.exists()) {
            return file;
        }
        InputStream inputStreamOpen = ((Context) oVar.getValue()).getAssets().open("audio_test.aac");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                i9.l.b(inputStreamOpen);
                a.a.u(inputStreamOpen, fileOutputStream);
                fileOutputStream.close();
                inputStreamOpen.close();
                return file;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    g5.a.m(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                g5.a.m(inputStreamOpen, th3);
                throw th4;
            }
        }
    }

    public static final void d() {
        try {
            AudioTrack audioTrack = f7375b;
            if (audioTrack != null) {
                audioTrack.stop();
            }
        } catch (Exception unused) {
        }
        try {
            AudioTrack audioTrack2 = f7375b;
            if (audioTrack2 != null) {
                audioTrack2.release();
            }
        } catch (Exception unused2) {
        }
        f7375b = null;
        Logger.INSTANCE.d(Constants.TAG, "【音频测试】资源释放完成");
    }

    public static final MediaFormat e(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i7 = 0; i7 < trackCount; i7++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i7);
            i9.l.d(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (q.o0(string, "audio/")) {
                mediaExtractor.selectTrack(i7);
                return trackFormat;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(a9.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i7 = mVar.f7373b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                mVar.f7373b = i7 - Integer.MIN_VALUE;
            } else {
                mVar = new m(cVar);
            }
        } else {
            mVar = new m(cVar);
        }
        Object obj = mVar.f7372a;
        int i10 = mVar.f7373b;
        if (i10 == 0) {
            t8.a.e(obj);
            f7377d = false;
            o1 o1Var = f7376c;
            if (o1Var != null) {
                mVar.f7373b = 1;
                Object objF = b0.f(o1Var, mVar);
                z8.a aVar = z8.a.f15774a;
                if (objF == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        f7376c = null;
        try {
            AudioTrack audioTrack = f7375b;
            if (audioTrack != null) {
                audioTrack.stop();
            }
        } catch (Exception unused) {
        }
        try {
            AudioTrack audioTrack2 = f7375b;
            if (audioTrack2 != null) {
                audioTrack2.release();
            }
        } catch (Exception unused2) {
        }
        f7375b = null;
        Logger.INSTANCE.d(Constants.TAG, "【音频测试】播放已停止");
        return z.f12851a;
    }
}
