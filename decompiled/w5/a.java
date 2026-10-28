package w5;

import a6.b;
import java.util.List;
import java.util.Map;
import n3.l;
import n5.c;
import n5.f;
import n5.i;
import n5.k;
import n5.m;
import n5.n;
import n5.o;
import t5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o[] f14137b = new o[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14138a = new b(2);

    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    @Override // n5.k
    public final m a(n5.b bVar, Map map) throws i, f, c {
        d dVarC;
        o[] oVarArr;
        b bVar2 = this.f14138a;
        if (map == null || !map.containsKey(n5.d.PURE_BARCODE)) {
            t5.b bVarA = bVar.a();
            u0.k kVar = new u0.k(bVarA);
            o[] oVarArrB = ((u5.a) kVar.f12991c).b();
            o oVar = oVarArrB[0];
            o oVar2 = oVarArrB[1];
            o oVar3 = oVarArrB[3];
            o oVar4 = oVarArrB[2];
            int iF1 = kVar.f1(oVar, oVar2);
            int iF2 = kVar.f1(oVar2, oVar3);
            int iF3 = kVar.f1(oVar3, oVar4);
            int iF4 = kVar.f1(oVar4, oVar);
            o[] oVarArr2 = {oVar4, oVar, oVar2, oVar3};
            if (iF1 > iF2) {
                oVarArr2[0] = oVar;
                oVarArr2[1] = oVar2;
                oVarArr2[2] = oVar3;
                oVarArr2[3] = oVar4;
                iF1 = iF2;
            }
            if (iF1 > iF3) {
                oVarArr2[0] = oVar2;
                oVarArr2[1] = oVar3;
                oVarArr2[2] = oVar4;
                oVarArr2[3] = oVar;
            } else {
                iF3 = iF1;
            }
            if (iF3 > iF4) {
                oVarArr2[0] = oVar3;
                oVarArr2[1] = oVar4;
                oVarArr2[2] = oVar;
                oVarArr2[3] = oVar2;
            }
            o oVar5 = oVarArr2[0];
            o oVar6 = oVarArr2[1];
            o oVar7 = oVarArr2[2];
            o oVar8 = oVarArr2[3];
            int iF5 = (kVar.f1(oVar5, oVar8) + 1) << 2;
            if (kVar.f1(u0.k.e1(oVar6, oVar7, iF5), oVar5) < kVar.f1(u0.k.e1(oVar7, oVar6, iF5), oVar8)) {
                oVarArr2[0] = oVar5;
                oVarArr2[1] = oVar6;
                oVarArr2[2] = oVar7;
                oVarArr2[3] = oVar8;
            } else {
                oVarArr2[0] = oVar6;
                oVarArr2[1] = oVar7;
                oVarArr2[2] = oVar8;
                oVarArr2[3] = oVar5;
            }
            o oVar9 = oVarArr2[0];
            o oVar10 = oVarArr2[1];
            o oVar11 = oVarArr2[2];
            o oVar12 = oVarArr2[3];
            int iF6 = kVar.f1(oVar9, oVar12);
            o oVarE1 = u0.k.e1(oVar9, oVar10, (kVar.f1(oVar10, oVar12) + 1) << 2);
            o oVarE2 = u0.k.e1(oVar11, oVar10, (iF6 + 1) << 2);
            int iF7 = kVar.f1(oVarE1, oVar12);
            int iF8 = kVar.f1(oVarE2, oVar12);
            float f10 = oVar12.f8854a;
            float f11 = oVar11.f8854a;
            float f12 = oVar10.f8854a;
            float f13 = iF7 + 1;
            float f14 = oVar12.f8855b;
            float f15 = oVar11.f8855b;
            float f16 = oVar10.f8855b;
            o oVar13 = new o(((f11 - f12) / f13) + f10, ((f15 - f16) / f13) + f14);
            float f17 = oVar9.f8854a - f12;
            float f18 = iF8 + 1;
            o oVar14 = new o((f17 / f18) + f10, ((oVar9.f8855b - f16) / f18) + f14);
            if (kVar.X0(oVar13)) {
                if (kVar.X0(oVar14) && kVar.f1(oVarE2, oVar13) + kVar.f1(oVarE1, oVar13) <= kVar.f1(oVarE2, oVar14) + kVar.f1(oVarE1, oVar14)) {
                    oVar13 = oVar14;
                }
            } else if (kVar.X0(oVar14)) {
                oVar13 = oVar14;
            } else {
                oVar13 = null;
            }
            oVarArr2[3] = oVar13;
            if (oVar13 == null) {
                throw i.f8833c;
            }
            o oVar15 = oVarArr2[0];
            o oVar16 = oVarArr2[1];
            o oVar17 = oVarArr2[2];
            int iF9 = kVar.f1(oVar15, oVar13) + 1;
            o oVarE3 = u0.k.e1(oVar15, oVar16, (kVar.f1(oVar17, oVar13) + 1) << 2);
            o oVarE4 = u0.k.e1(oVar17, oVar16, iF9 << 2);
            int iF10 = kVar.f1(oVarE3, oVar13);
            int i7 = iF10 + 1;
            int iF11 = kVar.f1(oVarE4, oVar13);
            int i10 = iF11 + 1;
            if ((i7 & 1) == 1) {
                i7 = iF10 + 2;
            }
            if ((i10 & 1) == 1) {
                i10 = iF11 + 2;
            }
            float f19 = (((oVar15.f8854a + oVar16.f8854a) + oVar17.f8854a) + oVar13.f8854a) / 4.0f;
            float f20 = (((oVar15.f8855b + oVar16.f8855b) + oVar17.f8855b) + oVar13.f8855b) / 4.0f;
            o oVarY0 = u0.k.Y0(oVar15, f19, f20);
            o oVarY1 = u0.k.Y0(oVar16, f19, f20);
            o oVarY2 = u0.k.Y0(oVar17, f19, f20);
            o oVarY3 = u0.k.Y0(oVar13, f19, f20);
            int i11 = i10 << 2;
            int i12 = i7 << 2;
            o[] oVarArr3 = {u0.k.e1(u0.k.e1(oVarY0, oVarY1, i11), oVarY3, i12), u0.k.e1(u0.k.e1(oVarY1, oVarY0, i11), oVarY2, i12), u0.k.e1(u0.k.e1(oVarY2, oVarY3, i11), oVarY1, i12), u0.k.e1(u0.k.e1(oVarY3, oVarY2, i11), oVarY0, i12)};
            o oVar18 = oVarArr3[0];
            o oVar19 = oVarArr3[1];
            o oVar20 = oVarArr3[2];
            o oVar21 = oVarArr3[3];
            int iF12 = kVar.f1(oVar18, oVar21);
            int iMax = iF12 + 1;
            int iF13 = kVar.f1(oVar20, oVar21);
            int i13 = iF13 + 1;
            if ((iMax & 1) == 1) {
                iMax = iF12 + 2;
            }
            if ((i13 & 1) == 1) {
                i13 = iF13 + 2;
            }
            if (iMax * 4 < i13 * 7 && i13 * 4 < iMax * 7) {
                iMax = Math.max(iMax, i13);
                i13 = iMax;
            }
            float f21 = iMax - 0.5f;
            float f22 = i13 - 0.5f;
            dVarC = bVar2.c(l.R(bVarA, iMax, i13, t5.f.a(0.5f, 0.5f, f21, 0.5f, f21, f22, 0.5f, f22, oVar18.f8854a, oVar18.f8855b, oVar21.f8854a, oVar21.f8855b, oVar20.f8854a, oVar20.f8855b, oVar19.f8854a, oVar19.f8855b)));
            oVarArr = new o[]{oVar18, oVar19, oVar20, oVar21};
        } else {
            t5.b bVarA2 = bVar.a();
            int[] iArrE = bVarA2.e();
            int[] iArrC = bVarA2.c();
            if (iArrE == null || iArrC == null) {
                throw i.f8833c;
            }
            int i14 = bVarA2.f12761a;
            int i15 = iArrE[0];
            int i16 = iArrE[1];
            while (i15 < i14 && bVarA2.b(i15, i16)) {
                i15++;
            }
            if (i15 == i14) {
                throw i.f8833c;
            }
            int i17 = iArrE[0];
            int i18 = i15 - i17;
            if (i18 == 0) {
                throw i.f8833c;
            }
            int i19 = iArrE[1];
            int i20 = iArrC[1];
            int i21 = ((iArrC[0] - i17) + 1) / i18;
            int i22 = ((i20 - i19) + 1) / i18;
            if (i21 <= 0 || i22 <= 0) {
                throw i.f8833c;
            }
            int i23 = i18 / 2;
            int i24 = i19 + i23;
            int i25 = i17 + i23;
            t5.b bVar3 = new t5.b(i21, i22);
            for (int i26 = 0; i26 < i22; i26++) {
                int i27 = (i26 * i18) + i24;
                for (int i28 = 0; i28 < i21; i28++) {
                    if (bVarA2.b((i28 * i18) + i25, i27)) {
                        bVar3.f(i28, i26);
                    }
                }
            }
            dVarC = bVar2.c(bVar3);
            oVarArr = f14137b;
        }
        m mVar = new m(dVarC.f12771b, dVarC.f12770a, oVarArr, n5.a.f8795f);
        List list = dVarC.f12772c;
        if (list != null) {
            mVar.b(n.f8845b, list);
        }
        String str = dVarC.f12773d;
        if (str != null) {
            mVar.b(n.f8846c, str);
        }
        return mVar;
    }

    @Override // n5.k
    public final void reset() {
    }
}
