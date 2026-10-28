package n7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import c8.k;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f8866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec f8867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f8868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8869d;

    public a(c cVar, k kVar) throws Exception {
        int i7 = cVar.f8872a;
        int i10 = cVar.f8873b;
        this.f8866a = kVar;
        try {
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType("audio/mp4a-latm");
            l.d(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("channel-count", i10);
            mediaFormat.setInteger("sample-rate", i7);
            mediaFormat.setInteger("bitrate", i7 * 4);
            mediaFormat.setInteger("is-adts", 1);
            mediaFormat.setInteger("aac-profile", 2);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            byteBufferAllocate.put(0, (byte) 18);
            byteBufferAllocate.put(1, (byte) (i10 << 3));
            mediaFormat.setByteBuffer("csd-0", byteBufferAllocate);
            mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            this.f8867b = mediaCodecCreateDecoderByType;
            this.f8868c = new MediaCodec.BufferInfo();
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【解码状态】createDecoder 异常: " + e7);
            throw e7;
        }
    }

    public final void a(CarLifeMessage carLifeMessage) {
        int i7;
        ByteBuffer outputBuffer;
        if (this.f8869d || carLifeMessage.getPayloadSize() == 0) {
            return;
        }
        int commandSize = carLifeMessage.getCommandSize();
        int payloadSize = carLifeMessage.getPayloadSize() + carLifeMessage.getCommandSize();
        while (commandSize < payloadSize && !this.f8869d && payloadSize - commandSize >= 7) {
            int i10 = carLifeMessage.getBody()[commandSize] & 255;
            byte b10 = carLifeMessage.getBody()[commandSize + 1];
            if (i10 != 255 || (b10 & 240) != 240) {
                Logger.INSTANCE.w(Constants.TAG, a2.f.E(commandSize, "【解码状态】ADTS sync lost at offset="));
                return;
            }
            int i11 = ((carLifeMessage.getBody()[commandSize + 3] & 3) << 11) | ((255 & carLifeMessage.getBody()[commandSize + 4]) << 3) | ((carLifeMessage.getBody()[commandSize + 5] & 224) >> 5);
            if (i11 < 7 || (i7 = commandSize + i11) > payloadSize) {
                Logger.INSTANCE.w(Constants.TAG, a2.f.D(i11, commandSize, "【解码状态】Invalid ADTS frameLen=", " at offset="));
                return;
            }
            MediaCodec mediaCodec = this.f8867b;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer != null) {
                    inputBuffer.clear();
                    inputBuffer.put(carLifeMessage.getBody(), commandSize, i11);
                }
                this.f8867b.queueInputBuffer(iDequeueInputBuffer, 0, i11, 0L, 0);
            }
            MediaCodec.BufferInfo bufferInfo = this.f8868c;
            for (int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L); iDequeueOutputBuffer >= 0; iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000L)) {
                if ((bufferInfo.flags & 2) != 0) {
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                } else if (bufferInfo.size > 0 && (outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer)) != null) {
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    byte[] bArr = new byte[bufferInfo.size];
                    outputBuffer.get(bArr);
                    this.f8866a.invoke(bArr);
                }
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            commandSize = i7;
        }
    }
}
