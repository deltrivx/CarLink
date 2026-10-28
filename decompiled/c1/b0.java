package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements y1.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1819b;

    public /* synthetic */ b0(int i7, Object obj) {
        this.f1818a = i7;
        this.f1819b = obj;
    }

    @Override // y1.r
    public final long a() {
        switch (this.f1818a) {
            case 0:
                d0 d0Var = (d0) this.f1819b;
                long jA = d0Var.f1846t.a();
                if (jA != 16) {
                    return jA;
                }
                f1 f1Var = (f1) q2.f.i(d0Var, h1.f1907b);
                if (f1Var != null) {
                    long j5 = f1Var.f1881a;
                    if (j5 != 16) {
                        return j5;
                    }
                }
                return ((y1.q) q2.f.i(d0Var, a0.f1805a)).f14960a;
            default:
                return ((i1) this.f1819b).f1921c;
        }
    }
}
