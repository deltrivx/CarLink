package g1;

import f1.e2;
import f1.l2;
import f1.w1;
import java.util.Set;
import s.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f5816d = new x(0, 1, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        w1 w1Var = (w1) qVar.d(0);
        Set set = iVar.f8715a;
        if (set == null) {
            return;
        }
        n1.e eVar = new n1.e(set);
        s.h0 h0Var = iVar.f8723i;
        if (h0Var == null) {
            long[] jArr = o0.f12476a;
            h0Var = new s.h0();
            iVar.f8723i = h0Var;
        }
        h0Var.m(w1Var, eVar);
        iVar.f8719e.b(new e2(eVar, null));
    }
}
