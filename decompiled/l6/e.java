package l6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import n5.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f8071f = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.b f8072a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8074c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f8076e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8073b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f8075d = new int[5];

    public e(t5.b bVar, p pVar) {
        this.f8072a = bVar;
        this.f8076e = pVar;
    }

    public static float a(int[] iArr, int i7) {
        return ((i7 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                return false;
            }
            i7 += i11;
        }
        if (i7 >= 7) {
            float f10 = i7 / 7.0f;
            float f11 = f10 / 2.0f;
            if (Math.abs(f10 - iArr[0]) < f11 && Math.abs(f10 - iArr[1]) < f11 && Math.abs((f10 * 3.0f) - iArr[2]) < 3.0f * f11 && Math.abs(f10 - iArr[3]) < f11 && Math.abs(f10 - iArr[4]) < f11) {
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d10 = cVar.f8854a - cVar2.f8854a;
        double d11 = cVar.f8855b - cVar2.f8855b;
        return (d11 * d11) + (d10 * d10);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final boolean c(int i7, int i10, int[] iArr) {
        char c10;
        float fA;
        float fA2;
        ?? r16;
        int i11;
        int i12;
        int i13;
        int i14 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i10);
        int i15 = iArr[2];
        t5.b bVar = this.f8072a;
        int i16 = bVar.f12762b;
        int i17 = bVar.f12761a;
        int[] iArr2 = this.f8075d;
        Arrays.fill(iArr2, 0);
        int i18 = i7;
        while (i18 >= 0 && bVar.b(iA, i18)) {
            iArr2[2] = iArr2[2] + 1;
            i18--;
        }
        if (i18 < 0) {
            fA = Float.NaN;
            c10 = 2;
        } else {
            while (true) {
                if (i18 < 0 || bVar.b(iA, i18)) {
                    c10 = 2;
                    break;
                }
                c10 = 2;
                int i19 = iArr2[1];
                if (i19 > i15) {
                    break;
                }
                iArr2[1] = i19 + 1;
                i18--;
            }
            if (i18 < 0 || iArr2[1] > i15) {
                fA = Float.NaN;
            } else {
                while (i18 >= 0 && bVar.b(iA, i18)) {
                    int i20 = iArr2[0];
                    if (i20 > i15) {
                        break;
                    }
                    iArr2[0] = i20 + 1;
                    i18--;
                }
                if (iArr2[0] > i15) {
                    fA = Float.NaN;
                } else {
                    int i21 = i7 + 1;
                    while (i21 < i16 && bVar.b(iA, i21)) {
                        iArr2[c10] = iArr2[c10] + 1;
                        i21++;
                    }
                    if (i21 == i16) {
                        fA = Float.NaN;
                    } else {
                        while (i21 < i16 && !bVar.b(iA, i21)) {
                            int i22 = iArr2[3];
                            if (i22 >= i15) {
                                break;
                            }
                            iArr2[3] = i22 + 1;
                            i21++;
                        }
                        if (i21 == i16 || iArr2[3] >= i15) {
                            fA = Float.NaN;
                        } else {
                            while (i21 < i16 && bVar.b(iA, i21)) {
                                int i23 = iArr2[4];
                                if (i23 >= i15) {
                                    break;
                                }
                                iArr2[4] = i23 + 1;
                                i21++;
                            }
                            int i24 = iArr2[4];
                            if (i24 < i15 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[3]) + i24) - i14) * 5 < i14 * 2 && b(iArr2)) {
                                fA = a(iArr2, i21);
                            } else {
                                fA = Float.NaN;
                            }
                        }
                    }
                }
            }
        }
        if (!Float.isNaN(fA)) {
            int i25 = (int) fA;
            int i26 = iArr[c10];
            Arrays.fill(iArr2, 0);
            int i27 = iA;
            while (i27 >= 0 && bVar.b(i27, i25)) {
                iArr2[c10] = iArr2[c10] + 1;
                i27--;
            }
            if (i27 < 0) {
                fA2 = Float.NaN;
            } else {
                while (i27 >= 0 && !bVar.b(i27, i25)) {
                    int i28 = iArr2[1];
                    if (i28 > i26) {
                        break;
                    }
                    iArr2[1] = i28 + 1;
                    i27--;
                }
                if (i27 < 0 || iArr2[1] > i26) {
                    fA2 = Float.NaN;
                } else {
                    while (i27 >= 0 && bVar.b(i27, i25)) {
                        int i29 = iArr2[0];
                        if (i29 > i26) {
                            break;
                        }
                        iArr2[0] = i29 + 1;
                        i27--;
                    }
                    if (iArr2[0] > i26) {
                        fA2 = Float.NaN;
                    } else {
                        int i30 = iA + 1;
                        while (i30 < i17 && bVar.b(i30, i25)) {
                            iArr2[c10] = iArr2[c10] + 1;
                            i30++;
                        }
                        if (i30 == i17) {
                            fA2 = Float.NaN;
                        } else {
                            while (i30 < i17 && !bVar.b(i30, i25)) {
                                int i31 = iArr2[3];
                                if (i31 >= i26) {
                                    break;
                                }
                                iArr2[3] = i31 + 1;
                                i30++;
                            }
                            if (i30 == i17 || iArr2[3] >= i26) {
                                fA2 = Float.NaN;
                            } else {
                                while (i30 < i17 && bVar.b(i30, i25)) {
                                    int i32 = iArr2[4];
                                    if (i32 >= i26) {
                                        break;
                                    }
                                    iArr2[4] = i32 + 1;
                                    i30++;
                                }
                                int i33 = iArr2[4];
                                if (i33 < i26 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[3]) + i33) - i14) * 5 < i14 && b(iArr2)) {
                                    fA2 = a(iArr2, i30);
                                } else {
                                    fA2 = Float.NaN;
                                }
                            }
                        }
                    }
                }
            }
            if (!Float.isNaN(fA2)) {
                int i34 = (int) fA2;
                Arrays.fill(iArr2, 0);
                int i35 = 0;
                while (true) {
                    if (i25 < i35 || i34 < i35) {
                        r16 = 0;
                        break;
                    }
                    r16 = 0;
                    if (!bVar.b(i34 - i35, i25 - i35)) {
                        break;
                    }
                    iArr2[c10] = iArr2[c10] + 1;
                    i35++;
                }
                if (iArr2[c10] == 0) {
                    return r16;
                }
                while (i25 >= i35 && i34 >= i35 && !bVar.b(i34 - i35, i25 - i35)) {
                    iArr2[1] = iArr2[1] + 1;
                    i35++;
                }
                if (iArr2[1] == 0) {
                    return r16;
                }
                while (i25 >= i35 && i34 >= i35 && bVar.b(i34 - i35, i25 - i35)) {
                    iArr2[r16] = iArr2[r16] + 1;
                    i35++;
                }
                if (iArr2[r16] == 0) {
                    return r16;
                }
                int i36 = bVar.f12762b;
                int i37 = 1;
                while (true) {
                    int i38 = i25 + i37;
                    if (i38 >= i36 || (i13 = i34 + i37) >= i17 || !bVar.b(i13, i38)) {
                        break;
                    }
                    iArr2[c10] = iArr2[c10] + 1;
                    i37++;
                }
                while (true) {
                    int i39 = i25 + i37;
                    if (i39 >= i36 || (i12 = i34 + i37) >= i17 || bVar.b(i12, i39)) {
                        break;
                    }
                    iArr2[3] = iArr2[3] + 1;
                    i37++;
                }
                if (iArr2[3] == 0) {
                    return r16;
                }
                while (true) {
                    int i40 = i25 + i37;
                    if (i40 >= i36 || (i11 = i34 + i37) >= i17 || !bVar.b(i11, i40)) {
                        break;
                    }
                    iArr2[4] = iArr2[4] + 1;
                    i37++;
                }
                if (iArr2[4] == 0) {
                    return r16;
                }
                int i41 = 0;
                for (int i42 = 0; i42 < 5; i42++) {
                    int i43 = iArr2[i42];
                    if (i43 == 0) {
                        return r16;
                    }
                    i41 += i43;
                }
                if (i41 < 7) {
                    return r16;
                }
                float f10 = i41 / 7.0f;
                float f11 = f10 / 1.333f;
                if (Math.abs(f10 - iArr2[r16]) >= f11 || Math.abs(f10 - iArr2[1]) >= f11 || Math.abs((f10 * 3.0f) - iArr2[c10]) >= 3.0f * f11 || Math.abs(f10 - iArr2[3]) >= f11 || Math.abs(f10 - iArr2[4]) >= f11) {
                    return r16;
                }
                float f12 = i14 / 7.0f;
                int i44 = 0;
                while (true) {
                    ArrayList arrayList = this.f8073b;
                    if (i44 >= arrayList.size()) {
                        c cVar = new c(fA2, fA, f12, 1);
                        arrayList.add(cVar);
                        p pVar = this.f8076e;
                        if (pVar != null) {
                            pVar.a(cVar);
                        }
                        return true;
                    }
                    c cVar2 = (c) arrayList.get(i44);
                    float f13 = cVar2.f8069c;
                    float f14 = cVar2.f8854a;
                    float f15 = cVar2.f8855b;
                    if (Math.abs(fA - f15) <= f12 && Math.abs(fA2 - f14) <= f12) {
                        float fAbs = Math.abs(f12 - f13);
                        if (fAbs <= 1.0f || fAbs <= f13) {
                            int i45 = cVar2.f8070d;
                            int i46 = i45 + 1;
                            float f16 = i45;
                            float f17 = (f14 * f16) + fA2;
                            float f18 = i46;
                            arrayList.set(i44, new c(f17 / f18, ((f15 * f16) + fA) / f18, ((f16 * cVar2.f8069c) + f12) / f18, i46));
                            return true;
                        }
                    }
                    i44++;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        ArrayList<c> arrayList = this.f8073b;
        int size = arrayList.size();
        float fAbs = 0.0f;
        int i7 = 0;
        float f10 = 0.0f;
        for (c cVar : arrayList) {
            if (cVar.f8070d >= 2) {
                i7++;
                f10 += cVar.f8069c;
            }
        }
        if (i7 >= 3) {
            float f11 = f10 / size;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fAbs += Math.abs(((c) it.next()).f8069c - f11);
            }
            if (fAbs <= f10 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
