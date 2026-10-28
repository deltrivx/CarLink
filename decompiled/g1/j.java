package g1;

import f1.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f5790d = new j(0, 2, 1);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        int i7;
        n1.d dVar = (n1.d) qVar.d(0);
        int iC = l2Var.c((f1.a) qVar.d(1));
        if (l2Var.f5036t >= iC) {
            f1.t.c("Check failed");
        }
        i2.c.Q(l2Var, cVar, iC);
        int i10 = l2Var.f5036t;
        int iD = l2Var.f5038v;
        while (iD >= 0 && !l2Var.x(iD)) {
            iD = l2Var.D(l2Var.f5019b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i10) {
            if (l2Var.u(i10, iT)) {
                if (l2Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += l2Var.x(iT) ? 1 : l2Var.f5019b[(l2Var.r(iT) * 5) + 1] & 67108863;
                iT += l2Var.t(iT);
            }
        }
        while (true) {
            i7 = l2Var.f5036t;
            if (i7 >= iC) {
                break;
            }
            if (l2Var.u(iC, i7)) {
                int i11 = l2Var.f5036t;
                if (i11 < l2Var.f5037u && (l2Var.f5019b[(l2Var.r(i11) * 5) + 1] & 1073741824) != 0) {
                    cVar.c(l2Var.C(l2Var.f5036t));
                    iK = 0;
                }
                l2Var.O();
            } else {
                iK += l2Var.K();
            }
        }
        if (i7 != iC) {
            f1.t.c("Check failed");
        }
        dVar.f8708a = iK;
    }
}
