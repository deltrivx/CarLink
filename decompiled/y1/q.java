package y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f14948b = h0.d(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f14949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f14950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f14951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f14952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f14953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f14954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f14955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f14956j;
    public static final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f14957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f14958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f14959n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14960a;

    static {
        h0.d(4282664004L);
        f14949c = h0.d(4287137928L);
        f14950d = h0.d(4291611852L);
        f14951e = h0.d(4294967295L);
        f14952f = h0.d(4294901760L);
        f14953g = h0.d(4278255360L);
        f14954h = h0.d(4278190335L);
        f14955i = h0.d(4294967040L);
        f14956j = h0.d(4278255615L);
        k = h0.d(4294902015L);
        f14957l = h0.c(0);
        float[] fArr = z1.d.f15621a;
        f14958m = h0.b(0.0f, 0.0f, 0.0f, 0.0f, z1.d.f15640u);
    }

    public /* synthetic */ q(long j5) {
        this.f14960a = j5;
    }

    public static final long a(long j5, z1.c cVar) {
        z1.g gVarE;
        z1.c cVarF = f(j5);
        int i7 = cVarF.f15620c;
        int i10 = cVar.f15620c;
        if ((i7 | i10) < 0) {
            gVarE = z1.j.e(cVarF, cVar);
        } else {
            s.w wVar = z1.h.f15652a;
            int i11 = i7 | (i10 << 6);
            Object objB = wVar.b(i11);
            if (objB == null) {
                objB = z1.j.e(cVarF, cVar);
                wVar.h(i11, objB);
            }
            gVarE = (z1.g) objB;
        }
        return gVarE.a(j5);
    }

    public static long b(float f10, long j5) {
        return h0.b(h(j5), g(j5), e(j5), f10, f(j5));
    }

    public static final boolean c(long j5, long j10) {
        return j5 == j10;
    }

    public static final float d(long j5) {
        float f10;
        float f11;
        if ((63 & j5) == 0) {
            f10 = (float) t8.a.f((j5 >>> 56) & 255);
            f11 = 255.0f;
        } else {
            f10 = (float) t8.a.f((j5 >>> 6) & 1023);
            f11 = 1023.0f;
        }
        return f10 / f11;
    }

    public static final float e(long j5) {
        int i7;
        int i10;
        if ((63 & j5) == 0) {
            return ((float) t8.a.f((j5 >>> 32) & 255)) / 255.0f;
        }
        short s2 = (short) ((j5 >>> 16) & 65535);
        int i11 = Short.MIN_VALUE & s2;
        int i12 = ((65535 & s2) >>> 10) & 31;
        int i13 = s2 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                if (i14 != 0) {
                    i14 |= 4194304;
                }
                i7 = i14;
                i10 = 255;
            } else {
                int i15 = i12 + 112;
                i7 = i14;
                i10 = i15;
            }
        } else {
            if (i13 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - u.f14963a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i7);
    }

    public static final z1.c f(long j5) {
        float[] fArr = z1.d.f15621a;
        return z1.d.f15644y[(int) (j5 & 63)];
    }

    public static final float g(long j5) {
        int i7;
        int i10;
        if ((63 & j5) == 0) {
            return ((float) t8.a.f((j5 >>> 40) & 255)) / 255.0f;
        }
        short s2 = (short) ((j5 >>> 32) & 65535);
        int i11 = Short.MIN_VALUE & s2;
        int i12 = ((65535 & s2) >>> 10) & 31;
        int i13 = s2 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                if (i14 != 0) {
                    i14 |= 4194304;
                }
                i7 = i14;
                i10 = 255;
            } else {
                int i15 = i12 + 112;
                i7 = i14;
                i10 = i15;
            }
        } else {
            if (i13 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - u.f14963a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i7);
    }

    public static final float h(long j5) {
        int i7;
        int i10;
        if ((63 & j5) == 0) {
            return ((float) t8.a.f((j5 >>> 48) & 255)) / 255.0f;
        }
        short s2 = (short) ((j5 >>> 48) & 65535);
        int i11 = Short.MIN_VALUE & s2;
        int i12 = ((65535 & s2) >>> 10) & 31;
        int i13 = s2 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                if (i14 != 0) {
                    i14 |= 4194304;
                }
                i7 = i14;
                i10 = 255;
            } else {
                int i15 = i12 + 112;
                i7 = i14;
                i10 = i15;
            }
        } else {
            if (i13 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - u.f14963a;
                return i11 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i10 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i7);
    }

    public static String i(long j5) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j5));
        sb2.append(", ");
        sb2.append(g(j5));
        sb2.append(", ");
        sb2.append(e(j5));
        sb2.append(", ");
        sb2.append(d(j5));
        sb2.append(", ");
        return a2.f.I(sb2, f(j5).f15618a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f14960a == ((q) obj).f14960a;
        }
        return false;
    }

    public final int hashCode() {
        return t8.u.a(this.f14960a);
    }

    public final String toString() {
        return i(this.f14960a);
    }
}
