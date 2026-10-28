package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.c0 f14344a = new f1.c0(new u7.d(29));

    public static final h a(f1.s sVar) {
        sVar.W(282942128);
        i iVar = (i) sVar.j(f14344a);
        if (iVar == null) {
            sVar.p(false);
            return null;
        }
        boolean zF = sVar.f(iVar);
        Object objK = sVar.K();
        if (zF || objK == f1.n.f5051a) {
            Object hVar = new h(iVar.f14387a, iVar.f14388b, iVar.f14389c, iVar.f14390d);
            sVar.h0(hVar);
            objK = hVar;
        }
        h hVar2 = (h) objK;
        sVar.p(false);
        return hVar2;
    }
}
