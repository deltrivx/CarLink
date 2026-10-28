package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13438d;

    public q(float f10, float f11) {
        int iJ;
        this.f13435a = f10;
        this.f13436b = f11;
        if (Float.isNaN(f10) || Float.isNaN(0.0f) || Float.isNaN(f11) || Float.isNaN(1.0f)) {
            d0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", 0.0, " + f11 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d10 = 0.0f;
        double d11 = 3.0f;
        double d12 = 0.0f;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iJ = d11 == d12 ? 0 : y1.h0.J((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iJ2 = y1.h0.J((float) ((-(d15 + d16)) / d14), fArr, 0);
            iJ = y1.h0.J((float) ((d15 - d16) / d14), fArr, iJ2) + iJ2;
            if (iJ > 1) {
                float f12 = fArr[0];
                float f13 = fArr[1];
                if (f12 > f13) {
                    fArr[0] = f13;
                    fArr[1] = f12;
                } else if (f12 == f13) {
                    iJ--;
                }
            }
        }
        int iJ3 = y1.h0.J(0.5f, fArr, iJ) + iJ;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i7 = 0; i7 < iJ3; i7++) {
            float f14 = fArr[i7];
            float f15 = ((((((-2.0f) * f14) + 3.0f) * f14) + 0.0f) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f13437c = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f13438d = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f A[PHI: r3
      0x008f: PHI (r3v24 float) = (r3v5 float), (r3v12 float), (r3v18 float), (r3v28 float), (r3v34 float) binds: [B:123:0x022f, B:113:0x0202, B:89:0x01b8, B:45:0x00e0, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4 A[PHI: r11
      0x00c4: PHI (r11v16 float) = (r11v4 float), (r11v9 float), (r11v21 float) binds: [B:66:0x015e, B:79:0x018f, B:35:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v.t
    public final float a(float f10) {
        float f11;
        float f12;
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float fMax = Math.max(f10, 1.1920929E-7f);
        float f13 = 0.0f - fMax;
        float f14 = this.f13435a;
        float f15 = f14 - fMax;
        float f16 = this.f13436b;
        float f17 = f16 - fMax;
        double d10 = f13;
        double d11 = ((d10 - (((double) f15) * 2.0d)) + ((double) f17)) * 3.0d;
        double d12 = ((double) (f15 - f13)) * 3.0d;
        double d13 = (((double) (f15 - f17)) * 3.0d) + ((double) (-f13)) + ((double) (1.0f - fMax));
        float f18 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d10 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double dSqrt = Math.sqrt(-d19);
                double d22 = (-d18) / dSqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double dAcos = Math.acos(d22);
                double dY = n3.r.y((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dY) - d21);
                f12 = fCos < 0.0f ? 0.0f : fCos;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (Math.abs(f12 - fCos) > 1.05E-6f) {
                    f12 = Float.NaN;
                }
                if (Float.isNaN(f12)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dY) - d21);
                    f12 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (Math.abs(f12 - fCos2) > 1.05E-6f) {
                        f12 = Float.NaN;
                    }
                    if (Float.isNaN(f12)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dY) - d21);
                        f11 = fCos3 < 0.0f ? 0.0f : fCos3;
                        if (f11 > 1.0f) {
                            f11 = 1.0f;
                        }
                        if (Math.abs(f11 - fCos3) <= 1.05E-6f) {
                            f18 = f11;
                        }
                    } else {
                        f18 = f12;
                    }
                } else {
                    f18 = f12;
                }
            } else if (d20 == 0.0d) {
                float f19 = -n3.r.y((float) d18);
                float f20 = (float) d21;
                float f21 = (2.0f * f19) - f20;
                float f22 = f21 < 0.0f ? 0.0f : f21;
                if (f22 > 1.0f) {
                    f22 = 1.0f;
                }
                if (Math.abs(f22 - f21) > 1.05E-6f) {
                    f22 = Float.NaN;
                }
                if (Float.isNaN(f22)) {
                    float f23 = (-f19) - f20;
                    f11 = f23 < 0.0f ? 0.0f : f23;
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    if (Math.abs(f11 - f23) <= 1.05E-6f) {
                        f18 = f11;
                    }
                } else {
                    f18 = f22;
                }
            } else {
                double dSqrt2 = Math.sqrt(d20);
                float fY = (float) (((double) (n3.r.y((float) ((-d18) + dSqrt2)) - n3.r.y((float) (d18 + dSqrt2)))) - d21);
                f11 = fY < 0.0f ? 0.0f : fY;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (Math.abs(f11 - fY) <= 1.05E-6f) {
                    f18 = f11;
                }
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d23 = d11 * 2.0d;
            float f24 = (float) ((dSqrt3 - d12) / d23);
            f12 = f24 < 0.0f ? 0.0f : f24;
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
            if (Math.abs(f12 - f24) > 1.05E-6f) {
                f12 = Float.NaN;
            }
            if (Float.isNaN(f12)) {
                float f25 = (float) (((-d12) - dSqrt3) / d23);
                f11 = f25 < 0.0f ? 0.0f : f25;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (Math.abs(f11 - f25) <= 1.05E-6f) {
                    f18 = f11;
                }
            } else {
                f18 = f12;
            }
        } else if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
            float f26 = (float) ((-d10) / d12);
            f11 = f26 < 0.0f ? 0.0f : f26;
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            if (Math.abs(f11 - f26) <= 1.05E-6f) {
                f18 = f11;
            }
        }
        if (!Float.isNaN(f18)) {
            float f27 = (((((-0.6666666f) * f18) + 1.0f) * f18) + 0.0f) * 3.0f * f18;
            float f28 = this.f13437c;
            if (f27 < f28) {
                f27 = f28;
            }
            float f29 = this.f13438d;
            return f27 > f29 ? f29 : f27;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f14 + ", 0.0, " + f16 + ", 1.0) has no solution at " + f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f13435a == qVar.f13435a && this.f13436b == qVar.f13436b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + ob.a.j(this.f13436b, ob.a.j(0.0f, Float.floatToIntBits(this.f13435a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f13435a + ", b=0.0, c=" + this.f13436b + ", d=1.0)";
    }
}
