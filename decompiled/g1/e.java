package g1;

import f1.e2;
import f1.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f5780d = new e(0, 2, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        f1.a aVar = (f1.a) qVar.d(0);
        Object objD = qVar.d(1);
        if (objD instanceof e2) {
            e2 e2Var = (e2) objD;
            iVar.f8719e.b(e2Var);
            iVar.f8718d.a(e2Var);
        }
        if (l2Var.f5030n != 0) {
            f1.t.c("Can only append a slot if not current inserting");
        }
        int i7 = l2Var.f5026i;
        int i10 = l2Var.f5027j;
        int iC = l2Var.c(aVar);
        int iG = l2Var.g(l2Var.f5019b, l2Var.r(iC + 1));
        l2Var.f5026i = iG;
        l2Var.f5027j = iG;
        l2Var.w(1, iC);
        if (i7 >= iG) {
            i7++;
            i10++;
        }
        l2Var.f5020c[iG] = objD;
        l2Var.f5026i = i7;
        l2Var.f5027j = i10;
    }
}
