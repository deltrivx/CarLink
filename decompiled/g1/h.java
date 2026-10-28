package g1;

import f1.a1;
import f1.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f5786d = new h(0, 4, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        a1 a1Var = (a1) qVar.d(2);
        f1.v vVar = (f1.v) qVar.d(1);
        vVar.l(a1Var);
        f1.t.d("Could not resolve state for movable content");
        throw new cc.s();
    }
}
