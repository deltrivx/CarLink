package g1;

import f1.e2;
import f1.l2;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f5781d = new e0(1, 0, 2);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        int iC = qVar.c(0);
        int i7 = l2Var.f5038v;
        int iM = l2Var.M(l2Var.f5019b, l2Var.r(i7));
        int iG = l2Var.g(l2Var.f5019b, l2Var.r(i7 + 1));
        for (int iMax = Math.max(iM, iG - iC); iMax < iG; iMax++) {
            Object obj = l2Var.f5020c[l2Var.h(iMax)];
            if (obj instanceof e2) {
                iVar.e((e2) obj);
            } else if (obj instanceof w1) {
                ((w1) obj).d();
            }
        }
        if (iC <= 0) {
            f1.t.c("Check failed");
        }
        int i10 = l2Var.f5038v;
        int iM2 = l2Var.M(l2Var.f5019b, l2Var.r(i10));
        int iG2 = l2Var.g(l2Var.f5019b, l2Var.r(i10 + 1)) - iC;
        if (iG2 < iM2) {
            f1.t.c("Check failed");
        }
        l2Var.I(iG2, iC, i10);
        int i11 = l2Var.f5026i;
        if (i11 >= iM2) {
            l2Var.f5026i = i11 - iC;
        }
    }
}
