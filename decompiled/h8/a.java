package h8;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.lifecycle.z;
import com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.util.Logger;
import g8.i;
import i9.l;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f6451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaCodec f6452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Surface f6453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo f6454h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6447a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6448b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f6449c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6450d = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedBlockingQueue f6455i = new LinkedBlockingQueue();

    public static boolean f(byte[] bArr, int i7) {
        int i10;
        int i11;
        if (bArr != null && bArr.length >= i7 + 5) {
            byte b10 = bArr[i7];
            if (b10 == 0 && bArr[i7 + 1] == 0 && bArr[i7 + 2] == 0 && bArr[i7 + 3] == 1) {
                i10 = 4;
            } else {
                i10 = (b10 == 0 && bArr[i7 + 1] == 0 && bArr[i7 + 2] == 1) ? 3 : 0;
            }
            if (i10 != 0 && ((i11 = bArr[i7 + i10] & 31) == 5 || i11 == 7 || i11 == 8)) {
                return true;
            }
        }
        return false;
    }

    public final void a(CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo carlifeVideoEncoderInfo, Surface surface) {
        MediaCodec mediaCodecCreateByCodecName;
        if (!surface.isValid()) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】Surface无效，跳过创建");
            return;
        }
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", carlifeVideoEncoderInfo.getWidth(), carlifeVideoEncoderInfo.getHeight());
            l.d(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            try {
                mediaCodecCreateByCodecName = MediaCodec.createDecoderByType("video/avc");
                mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, surface, (MediaCrypto) null, 0);
                mediaCodecCreateByCodecName.start();
            } catch (Exception e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】硬解失败，尝试软解", e7);
                try {
                    mediaCodecCreateByCodecName = MediaCodec.createByCodecName("OMX.google.h264.decoder");
                    mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, surface, (MediaCrypto) null, 0);
                    mediaCodecCreateByCodecName.start();
                } catch (Exception e10) {
                    Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】软解也失败了: " + e10.getMessage(), e10);
                    mediaCodecCreateByCodecName = null;
                }
            }
            this.f6452f = mediaCodecCreateByCodecName;
            if (mediaCodecCreateByCodecName != null) {
                this.f6448b.set(false);
                this.f6449c.set(true);
                CarLife.receiver().postMessage(1, ServiceTypes.MSG_CMD_VIDEO_ENCODER_PAUSE);
                CarLife.receiver().postMessage(1, ServiceTypes.MSG_CMD_VIDEO_ENCODER_START);
                j();
                Logger.INSTANCE.w("CarLife_Vehicle", "【视频解码】解码器创建成功");
            }
        } catch (Exception e11) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】createCodec 致命错误", e11);
            this.f6452f = null;
        }
    }

    public final void b(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo) {
        try {
            if (this.f6447a.get()) {
                int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                while (true) {
                    boolean z10 = false;
                    if (iDequeueOutputBuffer < 0 || !this.f6447a.get()) {
                        break;
                    }
                    Surface surface = this.f6453g;
                    if (surface != null && surface.isValid()) {
                        z10 = true;
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z10);
                    iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                }
                if (iDequeueOutputBuffer == -2) {
                    Logger.INSTANCE.w("CarLife_Vehicle", "【视频解码】输出格式变更: " + mediaCodec.getOutputFormat());
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void c(CarLifeMessage carLifeMessage) {
        while (true) {
            LinkedBlockingQueue linkedBlockingQueue = this.f6455i;
            if (linkedBlockingQueue.isEmpty() || ((CarLifeMessage) linkedBlockingQueue.peek()) == carLifeMessage) {
                return;
            }
            CarLifeMessage carLifeMessage2 = (CarLifeMessage) linkedBlockingQueue.poll();
            if (carLifeMessage2 != null) {
                carLifeMessage2.recycle();
            }
        }
    }

    public final CarLifeMessage d() {
        Iterator it = this.f6455i.iterator();
        l.d(it, "iterator(...)");
        CarLifeMessage carLifeMessage = null;
        while (it.hasNext()) {
            CarLifeMessage carLifeMessage2 = (CarLifeMessage) it.next();
            if (f(carLifeMessage2.getBody(), carLifeMessage2.getCommandSize())) {
                carLifeMessage = carLifeMessage2;
            }
        }
        return carLifeMessage;
    }

    public final void e(CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo carlifeVideoEncoderInfo) {
        synchronized (this.f6450d) {
            k();
            h();
            this.f6454h = carlifeVideoEncoderInfo;
            Surface surface = this.f6453g;
            if (surface != null) {
                a(carlifeVideoEncoderInfo, surface);
            }
        }
    }

    public final void g() {
        Logger.INSTANCE.d("CarLife_Vehicle", "【视频解码】release 被调用");
        synchronized (this.f6450d) {
            this.f6454h = null;
            k();
            try {
                h();
            } catch (Exception e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】releaseInternal 异常: " + e7.getMessage());
            }
        }
    }

    public final void h() {
        LinkedBlockingQueue linkedBlockingQueue = this.f6455i;
        if (this.f6448b.compareAndSet(false, true)) {
            CarLife.receiver().postMessage(1, ServiceTypes.MSG_CMD_VIDEO_ENCODER_PAUSE);
            MediaCodec mediaCodec = this.f6452f;
            this.f6452f = null;
            try {
                Iterator it = linkedBlockingQueue.iterator();
                while (it.hasNext()) {
                    ((CarLifeMessage) it.next()).recycle();
                }
                linkedBlockingQueue.clear();
            } catch (Exception unused) {
            }
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                } catch (Exception unused2) {
                }
                try {
                    mediaCodec.release();
                } catch (Exception unused3) {
                }
                Logger.INSTANCE.w("CarLife_Vehicle", "【视频解码】解码器释放成功");
            }
        }
    }

    public final void i(Surface surface) {
        synchronized (this.f6450d) {
            try {
                this.f6453g = surface;
                if (surface == null) {
                    if (((i) i.f6025j.getValue()).f6033h || Build.VERSION.SDK_INT < 23) {
                        k();
                        h();
                    }
                    return;
                }
                if (this.f6454h == null) {
                    return;
                }
                if (this.f6452f != null && !((i) i.f6025j.getValue()).f6033h && Build.VERSION.SDK_INT >= 23) {
                    try {
                        if (surface.isValid()) {
                            MediaCodec mediaCodec = this.f6452f;
                            if (mediaCodec != null) {
                                mediaCodec.setOutputSurface(surface);
                            }
                            Logger.INSTANCE.w("CarLife_Vehicle", "【视频解码】Surface热切换成功");
                            return;
                        }
                    } catch (Exception e7) {
                        Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】Surface热切换失败: " + e7.getMessage());
                    }
                }
                k();
                h();
                CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo carlifeVideoEncoderInfo = this.f6454h;
                l.b(carlifeVideoEncoderInfo);
                a(carlifeVideoEncoderInfo, surface);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        Thread thread = this.f6451e;
        AtomicBoolean atomicBoolean = this.f6447a;
        if (thread != null && thread.isAlive() && atomicBoolean.get()) {
            return;
        }
        this.f6449c.set(true);
        atomicBoolean.set(true);
        Thread thread2 = new Thread(new z(11, this));
        thread2.setName("VideoDecoder");
        thread2.start();
        this.f6451e = thread2;
    }

    public final void k() {
        this.f6447a.set(false);
        Thread thread = this.f6451e;
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
            try {
                thread.join(1000L);
            } catch (InterruptedException unused) {
                Logger.INSTANCE.e("CarLife_Vehicle", "【视频解码】等待线程结束时被中断");
            }
        }
        this.f6451e = null;
    }
}
