package g1;

import f1.l2;
import f1.w1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f5803d = new o(0, 1, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        h1.e eVar;
        w1 w1Var = (w1) qVar.d(0);
        s.h0 h0Var = iVar.f8723i;
        if (h0Var == null || ((n1.e) h0Var.g(w1Var)) == null) {
            return;
        }
        ArrayList arrayList = iVar.f8724j;
        if (arrayList != null && (eVar = (h1.e) arrayList.remove(arrayList.size() - 1)) != null) {
            iVar.f8719e = eVar;
        }
        h0Var.k(w1Var);
    }
}
