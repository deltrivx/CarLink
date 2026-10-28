package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f3616a = new s(h.f3568c, r1.c.f11103m);

    public static final s a(g gVar, r1.f fVar, f1.s sVar, int i7) {
        if (i9.l.a(gVar, h.f3568c) && fVar.equals(r1.c.f11103m)) {
            sVar.W(-1446569784);
            sVar.p(false);
            return f3616a;
        }
        sVar.W(-1446515937);
        boolean z10 = true;
        boolean z11 = (((i7 & 14) ^ 6) > 4 && sVar.f(gVar)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !sVar.f(fVar)) && (i7 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objK = sVar.K();
        if (z12 || objK == f1.n.f5051a) {
            objK = new s(gVar, fVar);
            sVar.h0(objK);
        }
        s sVar2 = (s) objK;
        sVar.p(false);
        return sVar2;
    }
}
