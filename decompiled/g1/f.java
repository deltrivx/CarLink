package g1;

import f1.d1;
import f1.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f5782d = new f(0, 2, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        n1.d dVar = (n1.d) qVar.d(1);
        int i7 = dVar != null ? dVar.f8708a : 0;
        a aVar = (a) qVar.d(0);
        if (i7 > 0) {
            cVar = new d1(cVar, i7);
        }
        aVar.W(cVar, l2Var, iVar, k0Var != null ? new u0.k(8, k0Var, l2Var) : null);
    }
}
