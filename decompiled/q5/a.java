package q5;

import e4.n;
import l0.o0;
import n3.l;
import n3.r;
import n5.i;
import n5.o;
import t5.b;
import t5.f;
import v5.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f10949g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10955f;

    public a(b bVar) {
        this.f10950a = bVar;
    }

    public static o[] b(o[] oVarArr, int i7, int i10) {
        float f10 = i10 / (i7 * 2.0f);
        o oVar = oVarArr[0];
        float f11 = oVar.f8854a;
        o oVar2 = oVarArr[2];
        float f12 = oVar2.f8854a;
        float f13 = f11 - f12;
        float f14 = oVar.f8855b;
        float f15 = oVar2.f8855b;
        float f16 = f14 - f15;
        float f17 = (f11 + f12) / 2.0f;
        float f18 = (f14 + f15) / 2.0f;
        float f19 = f13 * f10;
        float f20 = f16 * f10;
        o oVar3 = new o(f17 + f19, f18 + f20);
        o oVar4 = new o(f17 - f19, f18 - f20);
        o oVar5 = oVarArr[1];
        float f21 = oVar5.f8854a;
        o oVar6 = oVarArr[3];
        float f22 = oVar6.f8854a;
        float f23 = f21 - f22;
        float f24 = oVar5.f8855b;
        float f25 = oVar6.f8855b;
        float f26 = f24 - f25;
        float f27 = (f21 + f22) / 2.0f;
        float f28 = (f24 + f25) / 2.0f;
        float f29 = f23 * f10;
        float f30 = f10 * f26;
        return new o[]{oVar3, new o(f27 + f29, f28 + f30), oVar4, new o(f27 - f29, f28 - f30)};
    }

    public final o5.a a(boolean z10) throws i {
        o oVarC;
        o oVar;
        o oVar2;
        o oVar3;
        int iT;
        int iT2;
        char c10;
        o oVar4;
        o oVar5;
        o oVar6;
        o oVar7;
        n nVar;
        n nVar2;
        n nVar3;
        n nVar4;
        boolean z11;
        int i7;
        int i10;
        int i11;
        int i12;
        char c11;
        int i13;
        int i14;
        long j5;
        int i15;
        b bVar = this.f10950a;
        int i16 = -1;
        int i17 = 1;
        try {
            try {
                o[] oVarArrB = new u5.a(bVar).b();
                oVar2 = oVarArrB[0];
                oVar3 = oVarArrB[1];
                oVar = oVarArrB[2];
                oVarC = oVarArrB[3];
                while (true) {
                    i7 = nVar4.f4381c;
                    i10 = nVar4.f4380b;
                    i11 = nVar.f4381c;
                    i12 = nVar.f4380b;
                    if (this.f10954e >= 9) {
                        c11 = 1;
                        break;
                    }
                    n nVarE = e(nVar, z11, i17, i16);
                    int i18 = nVarE.f4381c;
                    int i19 = nVarE.f4380b;
                    n nVarE2 = e(nVar2, z11, i17, i17);
                    n nVarE3 = e(nVar3, z11, i16, i17);
                    n nVarE4 = e(nVar4, z11, i16, i16);
                    int i20 = nVarE4.f4381c;
                    c11 = 1;
                    int i21 = nVarE4.f4380b;
                    boolean z12 = z11;
                    if (this.f10954e > 2) {
                        double dX = (r.x(i21, i20, i19, i18) * this.f10954e) / (r.x(i10, i7, i12, i11) * (this.f10954e + 2));
                        if (dX < 0.75d || dX > 1.25d) {
                            break;
                        }
                        n nVar5 = new n(i19 - 3, i18 + 3, 4);
                        n nVar6 = new n(nVarE2.f4380b - 3, nVarE2.f4381c - 3, 4);
                        n nVar7 = new n(nVarE3.f4380b + 3, nVarE3.f4381c - 3, 4);
                        n nVar8 = new n(i21 + 3, i20 + 3, 4);
                        int iC = c(nVar8, nVar5);
                        if (iC == 0 || c(nVar5, nVar6) != iC || c(nVar6, nVar7) != iC || c(nVar7, nVar8) != iC) {
                            break;
                        }
                    }
                    z11 = !z12;
                    this.f10954e++;
                    nVar3 = nVarE3;
                    nVar = nVarE;
                    nVar4 = nVarE4;
                    nVar2 = nVarE2;
                    i16 = -1;
                    i17 = 1;
                }
            } catch (i unused) {
                int i22 = bVar.f12761a / 2;
                int i23 = bVar.f12762b / 2;
                int i24 = i22 + 7;
                int i25 = i23 - 7;
                o oVarC2 = e(new n(i24, i25, 4), false, 1, -1).c();
                int i26 = i23 + 7;
                o oVarC3 = e(new n(i24, i26, 4), false, 1, 1).c();
                int i27 = i22 - 7;
                o oVarC4 = e(new n(i27, i26, 4), false, -1, 1).c();
                oVarC = e(new n(i27, i25, 4), false, -1, -1).c();
                oVar = oVarC4;
                oVar2 = oVarC2;
                oVar3 = oVarC3;
            }
            o[] oVarArrB2 = new u5.a(bVar, 15, iT, iT2).b();
            oVar7 = oVarArrB2[0];
            oVar4 = oVarArrB2[1];
            o oVar8 = oVarArrB2[2];
            oVar6 = oVarArrB2[3];
            oVar5 = oVar8;
            c10 = 3;
        } catch (i unused2) {
            int i28 = iT + 7;
            int i29 = iT2 - 7;
            o oVarC5 = e(new n(i28, i29, 4), false, 1, -1).c();
            c10 = 3;
            int i30 = iT2 + 7;
            o oVarC6 = e(new n(i28, i30, 4), false, 1, 1).c();
            int i31 = iT - 7;
            o oVarC7 = e(new n(i31, i30, 4), false, -1, 1).c();
            o oVarC8 = e(new n(i31, i29, 4), false, -1, -1).c();
            oVar4 = oVarC6;
            oVar5 = oVarC7;
            oVar6 = oVarC8;
            oVar7 = oVarC5;
        }
        iT = r.T((((oVar2.f8854a + oVarC.f8854a) + oVar3.f8854a) + oVar.f8854a) / 4.0f);
        iT2 = r.T((((oVar2.f8855b + oVarC.f8855b) + oVar3.f8855b) + oVar.f8855b) / 4.0f);
        nVar = new n(r.T((((oVar7.f8854a + oVar6.f8854a) + oVar4.f8854a) + oVar5.f8854a) / 4.0f), r.T((((oVar7.f8855b + oVar6.f8855b) + oVar4.f8855b) + oVar5.f8855b) / 4.0f), 4);
        this.f10954e = 1;
        nVar2 = nVar;
        nVar3 = nVar2;
        nVar4 = nVar3;
        z11 = true;
        int i32 = this.f10954e;
        if (i32 != 5 && i32 != 7) {
            throw i.f8833c;
        }
        this.f10951b = i32 == 5;
        o oVar9 = new o(i12 + 0.5f, i11 - 0.5f);
        o oVar10 = new o(nVar2.f4380b + 0.5f, nVar2.f4381c + 0.5f);
        o oVar11 = new o(nVar3.f4380b - 0.5f, nVar3.f4381c + 0.5f);
        o oVar12 = new o(i10 - 0.5f, i7 - 0.5f);
        o[] oVarArr = new o[4];
        oVarArr[0] = oVar9;
        oVarArr[c11] = oVar10;
        oVarArr[2] = oVar11;
        oVarArr[c10] = oVar12;
        int i33 = i32 * 2;
        o[] oVarArrB3 = b(oVarArr, i33 - 3, i33);
        if (z10) {
            o oVar13 = oVarArrB3[0];
            oVarArrB3[0] = oVarArrB3[2];
            oVarArrB3[2] = oVar13;
        }
        if (!g(oVarArrB3[0]) || !g(oVarArrB3[c11]) || !g(oVarArrB3[2]) || !g(oVarArrB3[c10])) {
            throw i.f8833c;
        }
        int i34 = this.f10954e * 2;
        int[] iArr = {h(oVarArrB3[0], oVarArrB3[c11], i34), h(oVarArrB3[c11], oVarArrB3[2], i34), h(oVarArrB3[2], oVarArrB3[c10], i34), h(oVarArrB3[c10], oVarArrB3[0], i34)};
        int i35 = 0;
        for (int i36 = 0; i36 < 4; i36++) {
            int i37 = iArr[i36];
            i35 = (i35 << 3) + ((i37 >> (i34 - 2)) << 1) + (i37 & 1);
        }
        int i38 = ((i35 & 1) << 11) + (i35 >> 1);
        int i39 = 0;
        while (true) {
            int i40 = 4;
            if (i39 >= 4) {
                throw i.f8833c;
            }
            if (Integer.bitCount(f10949g[i39] ^ i38) <= 2) {
                this.f10955f = i39;
                long j10 = 0;
                int i41 = 0;
                while (true) {
                    i13 = 10;
                    if (i41 >= i40) {
                        break;
                    }
                    int i42 = iArr[(this.f10955f + i41) % i40];
                    if (this.f10951b) {
                        j5 = j10 << 7;
                        i15 = (i42 >> 1) & 127;
                    } else {
                        j5 = j10 << 10;
                        i15 = ((i42 >> 2) & 992) + ((i42 >> 1) & 31);
                    }
                    j10 = j5 + ((long) i15);
                    i41++;
                    i40 = 4;
                }
                if (this.f10951b) {
                    i13 = 7;
                    i14 = 2;
                } else {
                    i14 = 4;
                }
                int i43 = i13 - i14;
                int[] iArr2 = new int[i13];
                for (int i44 = i13 - 1; i44 >= 0; i44--) {
                    iArr2[i44] = ((int) j10) & 15;
                    j10 >>= 4;
                }
                try {
                    new o0(28, v5.a.k).V(iArr2, i43);
                    int i45 = 0;
                    for (int i46 = 0; i46 < i14; i46++) {
                        i45 = (i45 << 4) + iArr2[i46];
                    }
                    if (this.f10951b) {
                        this.f10952c = (i45 >> 6) + 1;
                        this.f10953d = (i45 & 63) + 1;
                    } else {
                        this.f10952c = (i45 >> 11) + 1;
                        this.f10953d = (i45 & 2047) + 1;
                    }
                    int i47 = this.f10955f;
                    o oVar14 = oVarArrB3[i47 % 4];
                    o oVar15 = oVarArrB3[(i47 + 1) % 4];
                    o oVar16 = oVarArrB3[(i47 + 2) % 4];
                    o oVar17 = oVarArrB3[(i47 + 3) % 4];
                    int iD = d();
                    float f10 = iD / 2.0f;
                    float f11 = this.f10954e;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    return new o5.a(l.R(bVar, iD, iD, f.a(f12, f12, f13, f12, f13, f13, f12, f13, oVar14.f8854a, oVar14.f8855b, oVar15.f8854a, oVar15.f8855b, oVar16.f8854a, oVar16.f8855b, oVar17.f8854a, oVar17.f8855b)), b(oVarArrB3, this.f10954e * 2, d()), this.f10951b, this.f10953d, this.f10952c);
                } catch (c unused3) {
                    throw i.f8833c;
                }
            }
            i39++;
        }
    }

    public final int c(n nVar, n nVar2) {
        int i7 = nVar.f4380b;
        int i10 = nVar.f4381c;
        int i11 = nVar2.f4380b;
        int i12 = nVar2.f4381c;
        float fX = r.x(i7, i10, i11, i12);
        float f10 = (i11 - i7) / fX;
        float f11 = (i12 - i10) / fX;
        float f12 = i7;
        float f13 = i10;
        b bVar = this.f10950a;
        boolean zB = bVar.b(i7, i10);
        int iCeil = (int) Math.ceil(fX);
        int i13 = 0;
        for (int i14 = 0; i14 < iCeil; i14++) {
            f12 += f10;
            f13 += f11;
            if (bVar.b(r.T(f12), r.T(f13)) != zB) {
                i13++;
            }
        }
        float f14 = i13 / fX;
        if (f14 <= 0.1f || f14 >= 0.9f) {
            return (f14 <= 0.1f) == zB ? 1 : -1;
        }
        return 0;
    }

    public final int d() {
        if (this.f10951b) {
            return (this.f10952c * 4) + 11;
        }
        int i7 = this.f10952c;
        if (i7 <= 4) {
            return (i7 * 4) + 15;
        }
        return ((((i7 - 4) / 8) + 1) * 2) + (i7 * 4) + 15;
    }

    public final n e(n nVar, boolean z10, int i7, int i10) {
        b bVar;
        int i11 = nVar.f4380b + i7;
        int i12 = nVar.f4381c;
        while (true) {
            i12 += i10;
            boolean zF = f(i11, i12);
            bVar = this.f10950a;
            if (!zF || bVar.b(i11, i12) != z10) {
                break;
            }
            i11 += i7;
        }
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        while (f(i13, i14) && bVar.b(i13, i14) == z10) {
            i13 += i7;
        }
        int i15 = i13 - i7;
        while (f(i15, i14) && bVar.b(i15, i14) == z10) {
            i14 += i10;
        }
        return new n(i15, i14 - i10, 4);
    }

    public final boolean f(int i7, int i10) {
        if (i7 < 0) {
            return false;
        }
        b bVar = this.f10950a;
        return i7 < bVar.f12761a && i10 > 0 && i10 < bVar.f12762b;
    }

    public final boolean g(o oVar) {
        return f(r.T(oVar.f8854a), r.T(oVar.f8855b));
    }

    public final int h(o oVar, o oVar2, int i7) {
        float f10 = oVar.f8854a;
        float f11 = oVar.f8855b;
        float f12 = oVar2.f8854a;
        float f13 = oVar2.f8855b;
        float fW = r.w(f10, f11, f12, f13);
        float f14 = fW / i7;
        float f15 = oVar.f8854a;
        float f16 = ((oVar2.f8854a - f15) * f14) / fW;
        float f17 = ((f13 - f11) * f14) / fW;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            float f18 = i11;
            if (this.f10950a.b(r.T((f18 * f16) + f15), r.T((f18 * f17) + f11))) {
                i10 |= 1 << ((i7 - i11) - 1);
            }
        }
        return i10;
    }
}
