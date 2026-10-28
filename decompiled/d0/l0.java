package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f3585a = new n0(h.f3566a, r1.c.f11101j);

    public static final n0 a(e eVar, r1.g gVar, f1.s sVar, int i7) {
        if (i9.l.a(eVar, h.f3566a) && i9.l.a(gVar, r1.c.f11101j)) {
            sVar.W(-1073795767);
            sVar.p(false);
            return f3585a;
        }
        sVar.W(-1073744896);
        boolean z10 = true;
        boolean z11 = (((i7 & 14) ^ 6) > 4 && sVar.f(eVar)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !sVar.f(gVar)) && (i7 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objK = sVar.K();
        if (z12 || objK == f1.n.f5051a) {
            objK = new n0(eVar, gVar);
            sVar.h0(objK);
        }
        n0 n0Var = (n0) objK;
        sVar.p(false);
        return n0Var;
    }
}
