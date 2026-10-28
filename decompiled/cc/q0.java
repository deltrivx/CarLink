package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements Runnable, Comparable, l0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2660b = -1;

    public q0(long j5) {
        this.f2659a = j5;
    }

    @Override // cc.l0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                hc.s sVar = b0.f2591b;
                if (obj == sVar) {
                    return;
                }
                r0 r0Var = obj instanceof r0 ? (r0) obj : null;
                if (r0Var != null) {
                    r0Var.b(this);
                }
                this._heap = sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final hc.u b() {
        Object obj = this._heap;
        if (obj instanceof hc.u) {
            return (hc.u) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j5 = this.f2659a - ((q0) obj).f2659a;
        if (j5 > 0) {
            return 1;
        }
        return j5 < 0 ? -1 : 0;
    }

    public final int d(long j5, r0 r0Var, s0 s0Var) {
        synchronized (this) {
            if (this._heap == b0.f2591b) {
                return 2;
            }
            synchronized (r0Var) {
                try {
                    q0[] q0VarArr = r0Var.f6541a;
                    q0 q0Var = q0VarArr != null ? q0VarArr[0] : null;
                    if (s0.f2666i.get(s0Var) != 0) {
                        return 1;
                    }
                    if (q0Var == null) {
                        r0Var.f2663c = j5;
                    } else {
                        long j10 = q0Var.f2659a;
                        if (j10 - j5 < 0) {
                            j5 = j10;
                        }
                        if (j5 - r0Var.f2663c > 0) {
                            r0Var.f2663c = j5;
                        }
                    }
                    long j11 = this.f2659a;
                    long j12 = r0Var.f2663c;
                    if (j11 - j12 < 0) {
                        this.f2659a = j12;
                    }
                    r0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(r0 r0Var) {
        if (this._heap == b0.f2591b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = r0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2659a + ']';
    }
}
