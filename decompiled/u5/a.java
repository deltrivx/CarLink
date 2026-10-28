package u5;

import n3.r;
import n5.i;
import n5.o;
import t5.b;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13069g;

    public a(b bVar) {
        this(bVar, 10, bVar.f12761a / 2, bVar.f12762b / 2);
    }

    public a(b bVar, int i7, int i10, int i11) throws i {
        this.f13063a = bVar;
        int i12 = bVar.f12762b;
        this.f13064b = i12;
        int i13 = bVar.f12761a;
        this.f13065c = i13;
        int i14 = i7 / 2;
        int i15 = i10 - i14;
        this.f13066d = i15;
        int i16 = i10 + i14;
        this.f13067e = i16;
        int i17 = i11 - i14;
        this.f13069g = i17;
        int i18 = i11 + i14;
        this.f13068f = i18;
        if (i17 < 0 || i15 < 0 || i18 >= i12 || i16 >= i13) {
            throw i.f8833c;
        }
    }

    public final boolean a(int i7, int i10, int i11, boolean z10) {
        b bVar = this.f13063a;
        if (z10) {
            while (i7 <= i10) {
                if (bVar.b(i7, i11)) {
                    return true;
                }
                i7++;
            }
            return false;
        }
        while (i7 <= i10) {
            if (bVar.b(i11, i7)) {
                return true;
            }
            i7++;
        }
        return false;
    }

    public final o[] b() throws i {
        int i7;
        boolean z10;
        int i10;
        int i11 = this.f13066d;
        int i12 = this.f13067e;
        int i13 = this.f13069g;
        int i14 = this.f13068f;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            i7 = this.f13065c;
            if (!z11) {
                z10 = false;
                break;
            }
            boolean zA = true;
            boolean z16 = false;
            while (true) {
                if ((!zA && z12) || i12 >= i7) {
                    break;
                }
                zA = a(i13, i14, i12, false);
                if (zA) {
                    i12++;
                    z12 = true;
                    z16 = true;
                } else if (!z12) {
                    i12++;
                }
            }
            if (i12 < i7) {
                boolean zA2 = true;
                while (true) {
                    i10 = this.f13064b;
                    if ((!zA2 && z13) || i14 >= i10) {
                        break;
                    }
                    zA2 = a(i11, i12, i14, true);
                    if (zA2) {
                        i14++;
                        z13 = true;
                        z16 = true;
                    } else if (!z13) {
                        i14++;
                    }
                }
                if (i14 < i10) {
                    boolean zA3 = true;
                    while (true) {
                        if ((!zA3 && z14) || i11 < 0) {
                            break;
                        }
                        zA3 = a(i13, i14, i11, false);
                        if (zA3) {
                            i11--;
                            z14 = true;
                            z16 = true;
                        } else if (!z14) {
                            i11--;
                        }
                    }
                    if (i11 >= 0) {
                        z11 = z16;
                        boolean zA4 = true;
                        while (true) {
                            if ((!zA4 && z15) || i13 < 0) {
                                break;
                            }
                            zA4 = a(i11, i12, i13, true);
                            if (zA4) {
                                i13--;
                                z11 = true;
                                z15 = true;
                            } else if (!z15) {
                                i13--;
                            }
                        }
                        if (i13 < 0) {
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10) {
            throw i.f8833c;
        }
        int i15 = i12 - i11;
        o oVarC = null;
        o oVarC2 = null;
        for (int i16 = 1; oVarC2 == null && i16 < i15; i16++) {
            oVarC2 = c(i11, i14 - i16, i11 + i16, i14);
        }
        if (oVarC2 == null) {
            throw i.f8833c;
        }
        o oVarC3 = null;
        for (int i17 = 1; oVarC3 == null && i17 < i15; i17++) {
            oVarC3 = c(i11, i13 + i17, i11 + i17, i13);
        }
        if (oVarC3 == null) {
            throw i.f8833c;
        }
        o oVarC4 = null;
        for (int i18 = 1; oVarC4 == null && i18 < i15; i18++) {
            oVarC4 = c(i12, i13 + i18, i12 - i18, i13);
        }
        if (oVarC4 == null) {
            throw i.f8833c;
        }
        for (int i19 = 1; oVarC == null && i19 < i15; i19++) {
            oVarC = c(i12, i14 - i19, i12 - i19, i14);
        }
        if (oVarC == null) {
            throw i.f8833c;
        }
        float f10 = oVarC.f8854a;
        float f11 = oVarC.f8855b;
        float f12 = oVarC2.f8854a;
        float f13 = oVarC2.f8855b;
        float f14 = oVarC4.f8854a;
        float f15 = oVarC4.f8855b;
        float f16 = oVarC3.f8854a;
        float f17 = oVarC3.f8855b;
        return f10 < ((float) i7) / 2.0f ? new o[]{new o(f16 - 1.0f, f17 + 1.0f), new o(f12 + 1.0f, f13 + 1.0f), new o(f14 - 1.0f, f15 - 1.0f), new o(f10 + 1.0f, f11 - 1.0f)} : new o[]{new o(f16 + 1.0f, f17 + 1.0f), new o(f12 + 1.0f, f13 - 1.0f), new o(f14 - 1.0f, f15 + 1.0f), new o(f10 - 1.0f, f11 - 1.0f)};
    }

    public final o c(float f10, float f11, float f12, float f13) {
        int iT = r.T(r.w(f10, f11, f12, f13));
        float f14 = iT;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i7 = 0; i7 < iT; i7++) {
            float f17 = i7;
            int iT2 = r.T((f17 * f15) + f10);
            int iT3 = r.T((f17 * f16) + f11);
            if (this.f13063a.b(iT2, iT3)) {
                return new o(iT2, iT3);
            }
        }
        return null;
    }
}
