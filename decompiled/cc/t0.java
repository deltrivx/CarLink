package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2670f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u8.k f2673e;

    public final void A(boolean z10) {
        this.f2671c = (z10 ? 4294967296L : 1L) + this.f2671c;
        if (z10) {
            return;
        }
        this.f2672d = true;
    }

    public abstract long B();

    public final boolean C() {
        u8.k kVar = this.f2673e;
        if (kVar == null) {
            return false;
        }
        j0 j0Var = (j0) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (j0Var == null) {
            return false;
        }
        j0Var.run();
        return true;
    }

    public void D(long j5, q0 q0Var) {
        c0.f2605j.I(j5, q0Var);
    }

    public abstract void shutdown();

    public final void x(boolean z10) {
        long j5 = this.f2671c - (z10 ? 4294967296L : 1L);
        this.f2671c = j5;
        if (j5 <= 0 && this.f2672d) {
            shutdown();
        }
    }

    public final void y(j0 j0Var) {
        u8.k kVar = this.f2673e;
        if (kVar == null) {
            kVar = new u8.k();
            this.f2673e = kVar;
        }
        kVar.addLast(j0Var);
    }

    public abstract Thread z();
}
