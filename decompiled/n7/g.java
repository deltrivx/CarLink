package n7;

import i9.l;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f8889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f8890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f8891i;

    public g(int i7, int i10) {
        i7 = (i10 & 1) != 0 ? 24576 : i7;
        this.f8884b = i7;
        this.f8888f = new byte[i7];
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f8889g = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        l.d(conditionNewCondition, "newCondition(...)");
        this.f8890h = conditionNewCondition;
        Condition conditionNewCondition2 = reentrantLock.newCondition();
        l.d(conditionNewCondition2, "newCondition(...)");
        this.f8891i = conditionNewCondition2;
    }

    public int a(int i7, long j5) {
        Condition condition = (Condition) this.f8890h;
        ReentrantLock reentrantLock = (ReentrantLock) this.f8889g;
        reentrantLock.lock();
        try {
            long jNanoTime = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(j5);
            while (this.f8885c < i7 && !this.f8883a) {
                if (j5 != 0) {
                    long jNanoTime2 = jNanoTime - System.nanoTime();
                    if (jNanoTime2 <= 0) {
                        break;
                    }
                    condition.awaitNanos(jNanoTime2);
                } else {
                    condition.await();
                }
            }
            return this.f8885c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int b(int i7, int i10, long j5, byte[] bArr) {
        l.e(bArr, "buffer");
        ReentrantLock reentrantLock = (ReentrantLock) this.f8889g;
        reentrantLock.lock();
        try {
            if (this.f8885c == 0 && !this.f8883a) {
                if (j5 <= 0) {
                    return 0;
                }
                ((Condition) this.f8890h).await(j5, TimeUnit.MILLISECONDS);
            }
            int i11 = this.f8885c;
            if (i11 == 0) {
                return this.f8883a ? -1 : 0;
            }
            int iMin = Math.min(i10, i11);
            int i12 = this.f8884b;
            int iMin2 = Math.min(iMin, i12 - this.f8886d);
            byte[] bArr2 = (byte[]) this.f8888f;
            System.arraycopy(bArr2, this.f8886d, bArr, i7, iMin2);
            int i13 = (this.f8886d + iMin2) % i12;
            this.f8886d = i13;
            int i14 = iMin - iMin2;
            if (i14 > 0) {
                System.arraycopy(bArr2, i13, bArr, i7 + iMin2, i14);
                this.f8886d = i14;
            }
            this.f8885c -= iMin;
            ((Condition) this.f8891i).signal();
            return iMin;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int c(byte[] bArr, int i7, int i10) {
        int i11 = this.f8884b;
        l.e(bArr, "buffer");
        ReentrantLock reentrantLock = (ReentrantLock) this.f8889g;
        reentrantLock.lock();
        try {
            if (this.f8883a) {
                return 0;
            }
            int iMin = Math.min(i10, i11 - this.f8885c);
            if (iMin == 0) {
                return 0;
            }
            int iMin2 = Math.min(iMin, i11 - this.f8887e);
            byte[] bArr2 = (byte[]) this.f8888f;
            System.arraycopy(bArr, i7, bArr2, this.f8887e, iMin2);
            this.f8887e = (this.f8887e + iMin2) % i11;
            int i12 = iMin - iMin2;
            if (i12 > 0) {
                System.arraycopy(bArr, i7 + iMin2, bArr2, 0, i12);
                this.f8887e = i12;
            }
            this.f8885c += iMin;
            ((Condition) this.f8890h).signal();
            return iMin;
        } finally {
            reentrantLock.unlock();
        }
    }
}
