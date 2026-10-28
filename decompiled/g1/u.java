package g1;

import f1.k2;
import f1.l2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f5813d = new u(1, 0, 2);

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        f1.a aVar;
        int iC;
        int iC2 = qVar.c(0);
        if (l2Var.f5030n != 0) {
            f1.t.c("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            f1.t.c("Parameter offset is out of bounds");
        }
        if (iC2 == 0) {
            return;
        }
        int i7 = l2Var.f5036t;
        int i10 = l2Var.f5038v;
        int i11 = l2Var.f5037u;
        int i12 = i7;
        while (iC2 > 0) {
            i12 += l2Var.f5019b[(l2Var.r(i12) * 5) + 3];
            if (i12 > i11) {
                f1.t.c("Parameter offset is out of bounds");
            }
            iC2--;
        }
        int i13 = l2Var.f5019b[(l2Var.r(i12) * 5) + 3];
        int iG = l2Var.g(l2Var.f5019b, l2Var.r(l2Var.f5036t));
        int iG2 = l2Var.g(l2Var.f5019b, l2Var.r(i12));
        int i14 = i12 + i13;
        int iG3 = l2Var.g(l2Var.f5019b, l2Var.r(i14));
        int i15 = iG3 - iG2;
        l2Var.w(i15, Math.max(l2Var.f5036t - 1, 0));
        l2Var.v(i13);
        int[] iArr = l2Var.f5019b;
        int iR = l2Var.r(i14) * 5;
        u8.l.m0(l2Var.r(i7) * 5, iR, (i13 * 5) + iR, iArr, iArr);
        if (i15 > 0) {
            Object[] objArr = l2Var.f5020c;
            int iH = l2Var.h(iG2 + i15);
            System.arraycopy(objArr, iH, objArr, iG, l2Var.h(iG3 + i15) - iH);
        }
        int i16 = iG2 + i15;
        int i17 = i16 - iG;
        int i18 = l2Var.k;
        int i19 = l2Var.f5028l;
        int length = l2Var.f5020c.length;
        int i20 = l2Var.f5029m;
        int i21 = i7 + i13;
        int i22 = i7;
        while (i22 < i21) {
            int iR2 = l2Var.r(i22);
            int i23 = i17;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = l2.i(l2.i(l2Var.g(iArr, iR2) - i23, i20 < iR2 ? 0 : i18, i19, length), l2Var.k, l2Var.f5028l, l2Var.f5020c.length);
            i22++;
            i17 = i23;
            iArr = iArr2;
            i18 = i18;
        }
        int i24 = i14 + i13;
        int iP = l2Var.p();
        int iB = k2.b(l2Var.f5021d, i14, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < l2Var.f5021d.size() && (iC = l2Var.c((aVar = (f1.a) l2Var.f5021d.get(iB)))) >= i14 && iC < i24) {
                arrayList.add(aVar);
            }
        }
        int i25 = i7 - i14;
        int size = arrayList.size();
        for (int i26 = 0; i26 < size; i26++) {
            f1.a aVar2 = (f1.a) arrayList.get(i26);
            int iC3 = l2Var.c(aVar2) + i25;
            if (iC3 >= l2Var.f5024g) {
                aVar2.f4875a = -(iP - iC3);
            } else {
                aVar2.f4875a = iC3;
            }
            l2Var.f5021d.add(k2.b(l2Var.f5021d, iC3, iP), aVar2);
        }
        if (l2Var.H(i14, i13)) {
            f1.t.c("Unexpectedly removed anchors");
        }
        l2Var.m(i10, l2Var.f5037u, i7);
        if (i15 > 0) {
            l2Var.I(i16, i15, i14 - 1);
        }
    }
}
