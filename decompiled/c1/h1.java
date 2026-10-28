package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.x2 f1906a = new f1.x2(x.f2279i);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.c0 f1907b = new f1.c0(x.f2278h);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f1908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i1 f1909d;

    static {
        long j5 = y1.q.f14958m;
        f1908c = new i1(true, Float.NaN, j5);
        f1909d = new i1(false, Float.NaN, j5);
    }

    public static final x.n0 a(float f10, f1.s sVar, int i7, int i10) {
        x.n0 i1Var;
        boolean z10 = true;
        boolean z11 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        long j5 = y1.q.f14958m;
        sVar.W(-1280632857);
        if (((Boolean) sVar.j(f1906a)).booleanValue()) {
            v.v0 v0Var = b1.l.f1171a;
            f1.b1 b1VarV = f1.b.v(new y1.q(j5), sVar);
            boolean z12 = (((i7 & 14) ^ 6) > 4 && sVar.g(z11)) || (i7 & 6) == 4;
            if ((((i7 & 112) ^ 48) <= 32 || !sVar.c(f10)) && (i7 & 48) != 32) {
                z10 = false;
            }
            boolean z13 = z12 | z10;
            Object objK = sVar.K();
            if (z13 || objK == f1.n.f5051a) {
                objK = new b1.e(z11, f10, b1VarV);
                sVar.h0(objK);
            }
            i1Var = (b1.e) objK;
        } else if (n3.f.a(f10, Float.NaN) && y1.q.c(j5, j5)) {
            i1Var = z11 ? f1908c : f1909d;
        } else {
            i1Var = new i1(z11, f10, j5);
        }
        sVar.p(false);
        return i1Var;
    }
}
