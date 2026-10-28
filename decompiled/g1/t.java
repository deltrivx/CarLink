package g1;

import f1.i2;
import f1.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f5812d = new t(0, 3, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        u0.k kVar;
        i2 i2Var = (i2) qVar.d(1);
        f1.a aVar = (f1.a) qVar.d(0);
        c cVar2 = (c) qVar.d(2);
        l2 l2VarM = i2Var.m();
        if (k0Var != null) {
            try {
                kVar = new u0.k(8, k0Var, l2Var);
            } catch (Throwable th) {
                l2VarM.e(false);
                throw th;
            }
        } else {
            kVar = null;
        }
        if (!cVar2.f5776h.Y()) {
            f1.t.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.f5775g.X(cVar, l2VarM, iVar, kVar);
        l2VarM.e(true);
        l2Var.d();
        aVar.getClass();
        l2Var.z(i2Var, i2Var.c(aVar));
        l2Var.k();
    }
}
