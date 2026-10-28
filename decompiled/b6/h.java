package b6;

import g1.j0;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import n5.l;
import n5.m;
import n5.n;
import n5.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements n5.k {
    public static float d(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i7;
        float f12 = f11 / i10;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            float f15 = iArr2[i12] * f12;
            float f16 = i13;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void e(int i7, t5.a aVar, int[] iArr) throws n5.i {
        int length = iArr.length;
        int i10 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i11 = aVar.f12760b;
        if (i7 >= i11) {
            throw n5.i.f8833c;
        }
        boolean z10 = !aVar.d(i7);
        while (i7 < i11) {
            if (aVar.d(i7) == z10) {
                i10++;
                if (i10 == length) {
                    break;
                }
                iArr[i10] = 1;
                z10 = !z10;
            } else {
                iArr[i10] = iArr[i10] + 1;
            }
            i7++;
        }
        if (i10 != length) {
            if (i10 != length - 1 || i7 != i11) {
                throw n5.i.f8833c;
            }
        }
    }

    public static void f(int i7, t5.a aVar, int[] iArr) throws n5.i {
        int length = iArr.length;
        boolean zD = aVar.d(i7);
        while (i7 > 0 && length >= 0) {
            i7--;
            if (aVar.d(i7) != zD) {
                length--;
                zD = !zD;
            }
        }
        if (length >= 0) {
            throw n5.i.f8833c;
        }
        e(i7 + 1, aVar, iArr);
    }

    @Override // n5.k
    public m a(n5.b bVar, Map map) throws n5.i {
        try {
            return c(bVar, map);
        } catch (n5.i e7) {
            if (map == null || !map.containsKey(n5.d.TRY_HARDER) || !bVar.f8807a.f12778a.g()) {
                throw e7;
            }
            j0 j0VarH = bVar.f8807a.f12778a.h();
            m mVarC = c(new n5.b(new t5.e(j0VarH)), map);
            Map map2 = mVarC.f8843e;
            n nVar = n.f8844a;
            int iIntValue = 270;
            if (map2 != null && map2.containsKey(nVar)) {
                iIntValue = (((Integer) map2.get(nVar)).intValue() + 270) % 360;
            }
            mVarC.b(nVar, Integer.valueOf(iIntValue));
            o[] oVarArr = mVarC.f8841c;
            if (oVarArr != null) {
                int i7 = j0VarH.f5793c;
                for (int i10 = 0; i10 < oVarArr.length; i10++) {
                    o oVar = oVarArr[i10];
                    oVarArr[i10] = new o((i7 - oVar.f8855b) - 1.0f, oVar.f8854a);
                }
            }
            return mVarC;
        }
    }

    public abstract m b(int i7, t5.a aVar, Map map);

    public final m c(n5.b bVar, Map map) throws n5.i {
        n5.b bVar2 = bVar;
        Map map2 = map;
        j0 j0Var = bVar2.f8807a.f12778a;
        int i7 = j0Var.f5792b;
        int i10 = j0Var.f5793c;
        t5.a aVar = new t5.a(i7);
        int i11 = 1;
        boolean z10 = map2 != null && map2.containsKey(n5.d.TRY_HARDER);
        int iMax = Math.max(1, i10 >> (z10 ? 8 : 5));
        int i12 = z10 ? i10 : 15;
        int i13 = i10 / 2;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = i14 + 1;
            int i16 = i15 / 2;
            if ((i14 & 1) != 0) {
                i16 = -i16;
            }
            int i17 = (i16 * iMax) + i13;
            if (i17 < 0 || i17 >= i10) {
                break;
            }
            try {
                aVar = bVar2.b(aVar, i17);
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == i11) {
                        aVar.i();
                        if (map2 != null) {
                            Object obj = n5.d.NEED_RESULT_POINT_CALLBACK;
                            if (map2.containsKey(obj)) {
                                EnumMap enumMap = new EnumMap(n5.d.class);
                                enumMap.putAll(map2);
                                enumMap.remove(obj);
                                map2 = enumMap;
                            }
                        }
                    }
                    try {
                        m mVarB = b(i17, aVar, map2);
                        if (i18 == i11) {
                            try {
                                mVarB.b(n.f8844a, 180);
                                o[] oVarArr = mVarB.f8841c;
                                if (oVarArr != null) {
                                    float f10 = i7;
                                    try {
                                        o oVar = oVarArr[0];
                                        try {
                                            oVarArr[0] = new o((f10 - oVar.f8854a) - 1.0f, oVar.f8855b);
                                            o oVar2 = oVarArr[1];
                                            oVarArr[1] = new o((f10 - oVar2.f8854a) - 1.0f, oVar2.f8855b);
                                        } catch (l unused) {
                                            continue;
                                            i18++;
                                            map2 = map2;
                                            i11 = 1;
                                        }
                                    } catch (l unused2) {
                                    }
                                }
                            } catch (l unused3) {
                            }
                        }
                        return mVarB;
                    } catch (l unused4) {
                    }
                }
            } catch (n5.i unused5) {
                continue;
            }
            bVar2 = bVar;
            i14 = i15;
            i11 = 1;
        }
        throw n5.i.f8833c;
    }

    @Override // n5.k
    public void reset() {
    }
}
