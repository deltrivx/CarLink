package n7;

import android.media.MediaCodec;
import androidx.lifecycle.z;
import b3.i0;
import c8.k;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.util.Logger;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeContext f8876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f8878c = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f8879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f8881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread f8882g;

    public f(CarLifeContext carLifeContext, c cVar, int i7) {
        this.f8876a = carLifeContext;
        this.f8877b = cVar;
        this.f8879d = new g(i7, 2);
        Thread thread = new Thread(new z(16, this));
        thread.setName("Carlife-Audio-Source");
        thread.start();
        this.f8882g = thread;
    }

    public final void a() {
        CarLifeMessage carLifeMessage = (CarLifeMessage) this.f8878c.take();
        try {
            if (carLifeMessage.getServiceType() != 196615) {
                b(carLifeMessage.getBody(), carLifeMessage.getCommandSize(), carLifeMessage.getPayloadSize());
                carLifeMessage.recycle();
                return;
            }
            if (this.f8881f == null) {
                a aVar = new a(this.f8877b, new k(21, this));
                this.f8881f = aVar;
                aVar.f8867b.start();
            }
            a aVar2 = this.f8881f;
            if (aVar2 != null) {
                aVar2.a(carLifeMessage);
            }
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "【音频解码】写入失败", e7);
            carLifeMessage.recycle();
        }
    }

    public final void b(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return;
        }
        while (!this.f8880e && i10 > 0) {
            int iC = this.f8879d.c(bArr, i7, i10);
            if (iC > 0) {
                i7 += iC;
                i10 -= iC;
            } else {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8880e) {
            return;
        }
        this.f8880e = true;
        Thread thread = this.f8882g;
        if (thread != null) {
            thread.interrupt();
        }
        a aVar = this.f8881f;
        if (aVar != null) {
            MediaCodec mediaCodec = aVar.f8867b;
            aVar.f8869d = true;
            try {
                mediaCodec.stop();
            } catch (Exception unused) {
            }
            try {
                mediaCodec.release();
            } catch (Exception unused2) {
            }
        }
        this.f8881f = null;
        g gVar = this.f8879d;
        ReentrantLock reentrantLock = (ReentrantLock) gVar.f8889g;
        reentrantLock.lock();
        try {
            gVar.f8883a = true;
            ((Condition) gVar.f8890h).signalAll();
            ((Condition) gVar.f8891i).signalAll();
            reentrantLock.unlock();
            LinkedBlockingQueue linkedBlockingQueue = this.f8878c;
            Iterator it = linkedBlockingQueue.iterator();
            while (it.hasNext()) {
                ((CarLifeMessage) it.next()).recycle();
            }
            linkedBlockingQueue.clear();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // n7.d
    public final int f() {
        g gVar = this.f8879d;
        ReentrantLock reentrantLock = (ReentrantLock) gVar.f8889g;
        reentrantLock.lock();
        try {
            return gVar.f8885c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n7.d
    public final int i(k6.a aVar, i0 i0Var) {
        g gVar = this.f8879d;
        if (this.f8880e) {
            return -1;
        }
        try {
            ReentrantLock reentrantLock = (ReentrantLock) gVar.f8889g;
            reentrantLock.lock();
            try {
                boolean z10 = gVar.f8885c == 0;
                reentrantLock.unlock();
                if (z10) {
                    gVar.a(1, 3000L);
                }
                aVar.f7311b = 0;
                byte[] bArr = aVar.f7310a;
                int iB = gVar.b(0, bArr.length, 3000L, bArr);
                if (iB > 0) {
                    aVar.f7311b += iB;
                }
                return aVar.f7311b;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // n7.d
    public final boolean isClosed() {
        return this.f8880e;
    }

    @Override // n7.d
    public final c k() {
        g gVar = this.f8879d;
        gVar.a(gVar.f8884b / 2, 0L);
        return this.f8877b;
    }
}
