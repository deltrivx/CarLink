package x3;

import android.graphics.Path;
import android.util.Log;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f14568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f14569b;

    public d(char c10, float[] fArr) {
        this.f14568a = c10;
        this.f14569b = fArr;
    }

    public d(d dVar) {
        this.f14568a = dVar.f14568a;
        float[] fArr = dVar.f14569b;
        this.f14569b = r.r(fArr, fArr.length);
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        double d10;
        double d11;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = f14;
        double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
        double d16 = f15;
        double d17 = ((d13 * dCos) + (((double) (-f10)) * dSin)) / d16;
        double d18 = f13;
        double d19 = ((d18 * dSin) + (((double) f12) * dCos)) / d14;
        double d20 = ((d18 * dCos) + (((double) (-f12)) * dSin)) / d16;
        double d21 = d15 - d19;
        double d22 = d17 - d20;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d17 + d20) / 2.0d;
        double d25 = (d22 * d22) + (d21 * d21);
        if (d25 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d25);
            float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z10, z11);
            return;
        }
        double dSqrt = Math.sqrt(d26);
        double d27 = dSqrt * d21;
        double d28 = dSqrt * d22;
        if (z10 == z11) {
            d10 = d23 - d28;
            d11 = d24 + d27;
        } else {
            d10 = d23 + d28;
            d11 = d24 - d27;
        }
        double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
        double dAtan3 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d29 = d10 * d14;
        double d30 = d11 * d16;
        double d31 = (d29 * dCos) - (d30 * dSin);
        double d32 = (d30 * dCos) + (d29 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d33 = d13;
        double d34 = -d14;
        double d35 = d34 * dCos2;
        double d36 = d16 * dSin2;
        double d37 = (d35 * dSin3) - (d36 * dCos3);
        double d38 = d34 * dSin2;
        double d39 = d16 * dCos2;
        double d40 = (dCos3 * d39) + (dSin3 * d38);
        double d41 = dAtan3 / ((double) iCeil);
        double d42 = dAtan2;
        int i7 = 0;
        while (i7 < iCeil) {
            double d43 = d42 + d41;
            double dSin4 = Math.sin(d43);
            double dCos4 = Math.cos(d43);
            int i10 = iCeil;
            double d44 = (((d14 * dCos2) * dCos4) + d31) - (d36 * dSin4);
            double d45 = d38;
            double d46 = (d39 * dSin4) + (d14 * dSin2 * dCos4) + d32;
            double d47 = (d35 * dSin4) - (d36 * dCos4);
            double d48 = (dCos4 * d39) + (dSin4 * d45);
            double d49 = d43 - d42;
            double dTan = Math.tan(d49 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d37 * dSqrt2) + d12), (float) ((d40 * dSqrt2) + d33), (float) (d44 - (dSqrt2 * d47)), (float) (d46 - (dSqrt2 * d48)), (float) d44, (float) d46);
            i7++;
            d12 = d44;
            d33 = d46;
            d31 = d31;
            d42 = d43;
            dCos2 = dCos2;
            d40 = d48;
            d37 = d47;
            iCeil = i10;
            d41 = d41;
            d38 = d45;
        }
    }

    public static void b(d[] dVarArr, Path path) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        d[] dVarArr2 = dVarArr;
        float[] fArr = new float[6];
        int length = dVarArr2.length;
        char c10 = 0;
        char c11 = 'm';
        int i10 = 0;
        while (i10 < length) {
            d dVar = dVarArr2[i10];
            char c12 = dVar.f14568a;
            float[] fArr2 = dVar.f14569b;
            float f20 = fArr[c10];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i7 = 7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i7 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i7 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f24, f25);
                    f20 = f24;
                    f22 = f20;
                    f21 = f25;
                    f23 = f21;
                default:
                    i7 = 2;
                    break;
            }
            float f26 = f24;
            float f27 = f25;
            float f28 = f20;
            float f29 = f21;
            int i11 = 0;
            while (i11 < fArr2.length) {
                if (c12 == 'A') {
                    fArr2 = fArr2;
                    i11 = i11;
                    dVar = dVar;
                    float f30 = f29;
                    i10 = i10;
                    int i12 = i11 + 5;
                    int i13 = i11 + 6;
                    a(path, f28, f30, fArr2[i12], fArr2[i13], fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                    f22 = fArr2[i12];
                    f10 = fArr2[i13];
                    f23 = f10;
                    f11 = f22;
                } else if (c12 == 'C') {
                    fArr2 = fArr2;
                    i11 = i11;
                    i10 = i10;
                    dVar = dVar;
                    int i14 = i11 + 2;
                    int i15 = i11 + 3;
                    int i16 = i11 + 4;
                    int i17 = i11 + 5;
                    path.cubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                    float f31 = fArr2[i16];
                    float f32 = fArr2[i17];
                    f22 = fArr2[i14];
                    f23 = fArr2[i15];
                    f10 = f32;
                    f11 = f31;
                } else if (c12 == 'H') {
                    fArr2 = fArr2;
                    i11 = i11;
                    dVar = dVar;
                    f10 = f29;
                    i10 = i10;
                    path.lineTo(fArr2[i11], f10);
                    f11 = fArr2[i11];
                } else if (c12 == 'Q') {
                    fArr2 = fArr2;
                    i11 = i11;
                    i10 = i10;
                    dVar = dVar;
                    int i18 = i11 + 1;
                    int i19 = i11 + 2;
                    int i20 = i11 + 3;
                    path.quadTo(fArr2[i11], fArr2[i18], fArr2[i19], fArr2[i20]);
                    float f33 = fArr2[i11];
                    float f34 = fArr2[i18];
                    float f35 = fArr2[i19];
                    float f36 = fArr2[i20];
                    f22 = f33;
                    f23 = f34;
                    f11 = f35;
                    f10 = f36;
                } else if (c12 == 'V') {
                    fArr2 = fArr2;
                    i11 = i11;
                    i10 = i10;
                    dVar = dVar;
                    f11 = f28;
                    path.lineTo(f11, fArr2[i11]);
                    f10 = fArr2[i11];
                } else if (c12 != 'a') {
                    if (c12 == 'c') {
                        fArr2 = fArr2;
                        i11 = i11;
                        int i21 = i11 + 2;
                        int i22 = i11 + 3;
                        int i23 = i11 + 4;
                        int i24 = i11 + 5;
                        path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                        float f37 = fArr2[i21] + f28;
                        float f38 = fArr2[i22] + f29;
                        f28 += fArr2[i23];
                        f29 += fArr2[i24];
                        f22 = f37;
                        f23 = f38;
                    } else if (c12 != 'h') {
                        if (c12 != 'q') {
                            if (c12 != 'v') {
                                if (c12 == 'L') {
                                    fArr2 = fArr2;
                                    i11 = i11;
                                    int i25 = i11 + 1;
                                    path.lineTo(fArr2[i11], fArr2[i25]);
                                    f11 = fArr2[i11];
                                    f10 = fArr2[i25];
                                } else if (c12 == 'M') {
                                    fArr2 = fArr2;
                                    i11 = i11;
                                    f11 = fArr2[i11];
                                    f10 = fArr2[i11 + 1];
                                    if (i11 > 0) {
                                        path.lineTo(f11, f10);
                                    } else {
                                        path.moveTo(f11, f10);
                                        f26 = f11;
                                        f27 = f10;
                                    }
                                } else if (c12 == 'S') {
                                    fArr2 = fArr2;
                                    i11 = i11;
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f28 = (f28 * 2.0f) - f22;
                                        f29 = (f29 * 2.0f) - f23;
                                    }
                                    float f39 = f28;
                                    float f40 = f29;
                                    int i26 = i11 + 1;
                                    int i27 = i11 + 2;
                                    int i28 = i11 + 3;
                                    path.cubicTo(f39, f40, fArr2[i11], fArr2[i26], fArr2[i27], fArr2[i28]);
                                    float f41 = fArr2[i11];
                                    f22 = f41;
                                    f23 = fArr2[i26];
                                    f11 = fArr2[i27];
                                    f10 = fArr2[i28];
                                } else if (c12 == 'T') {
                                    fArr2 = fArr2;
                                    i11 = i11;
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f28 = (f28 * 2.0f) - f22;
                                        f29 = (f29 * 2.0f) - f23;
                                    }
                                    int i29 = i11 + 1;
                                    path.quadTo(f28, f29, fArr2[i11], fArr2[i29]);
                                    f11 = fArr2[i11];
                                    f10 = fArr2[i29];
                                    dVar = dVar;
                                    f22 = f28;
                                    f23 = f29;
                                } else if (c12 == 'l') {
                                    fArr2 = fArr2;
                                    i11 = i11;
                                    int i30 = i11 + 1;
                                    path.rLineTo(fArr2[i11], fArr2[i30]);
                                    f28 += fArr2[i11];
                                    f15 = fArr2[i30];
                                } else if (c12 == 'm') {
                                    fArr2 = fArr2;
                                    i11 = i11;
                                    float f42 = fArr2[i11];
                                    f28 += f42;
                                    float f43 = fArr2[i11 + 1];
                                    f29 += f43;
                                    if (i11 > 0) {
                                        path.rLineTo(f42, f43);
                                    } else {
                                        path.rMoveTo(f42, f43);
                                        dVar = dVar;
                                        f11 = f28;
                                        f26 = f11;
                                        f10 = f29;
                                        f27 = f10;
                                    }
                                } else if (c12 != 's') {
                                    if (c12 != 't') {
                                        f11 = f28;
                                    } else {
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f18 = f28 - f22;
                                            f19 = f29 - f23;
                                        } else {
                                            f19 = 0.0f;
                                            f18 = 0.0f;
                                        }
                                        int i31 = i11 + 1;
                                        path.rQuadTo(f18, f19, fArr2[i11], fArr2[i31]);
                                        float f44 = f18 + f28;
                                        float f45 = f19 + f29;
                                        float f46 = f28 + fArr2[i11];
                                        f29 += fArr2[i31];
                                        f23 = f45;
                                        f11 = f46;
                                        f22 = f44;
                                    }
                                    f10 = f29;
                                } else {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f16 = f29 - f23;
                                        f17 = f28 - f22;
                                    } else {
                                        f17 = 0.0f;
                                        f16 = 0.0f;
                                    }
                                    int i32 = i11;
                                    int i33 = i32 + 1;
                                    int i34 = i32 + 2;
                                    int i35 = i32 + 3;
                                    fArr2 = fArr2;
                                    i11 = i32;
                                    path.rCubicTo(f17, f16, fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                                    f12 = fArr2[i11] + f28;
                                    f13 = fArr2[i33] + f29;
                                    f28 += fArr2[i34];
                                    f14 = fArr2[i35];
                                }
                                dVar = dVar;
                            } else {
                                fArr2 = fArr2;
                                i11 = i11;
                                path.rLineTo(0.0f, fArr2[i11]);
                                f15 = fArr2[i11];
                            }
                            f29 += f15;
                        } else {
                            fArr2 = fArr2;
                            i11 = i11;
                            int i36 = i11 + 1;
                            int i37 = i11 + 2;
                            int i38 = i11 + 3;
                            path.rQuadTo(fArr2[i11], fArr2[i36], fArr2[i37], fArr2[i38]);
                            f12 = fArr2[i11] + f28;
                            f13 = fArr2[i36] + f29;
                            f28 += fArr2[i37];
                            f14 = fArr2[i38];
                        }
                        f29 += f14;
                        f22 = f12;
                        f23 = f13;
                    } else {
                        fArr2 = fArr2;
                        i11 = i11;
                        path.rLineTo(fArr2[i11], 0.0f);
                        f28 += fArr2[i11];
                    }
                    dVar = dVar;
                    f11 = f28;
                    f10 = f29;
                } else {
                    fArr2 = fArr2;
                    i11 = i11;
                    int i39 = i11 + 5;
                    float f47 = fArr2[i39] + f28;
                    int i40 = i11 + 6;
                    float f48 = fArr2[i40] + f29;
                    dVar = dVar;
                    float f49 = f28;
                    float f50 = f29;
                    i10 = i10;
                    a(path, f49, f50, f47, f48, fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                    f11 = f49 + fArr2[i39];
                    f10 = f50 + fArr2[i40];
                    f22 = f11;
                    f23 = f10;
                }
                i11 += i7;
                path = path;
                dVar = dVar;
                c12 = c12;
                i10 = i10;
                f28 = f11;
                f29 = f10;
                c11 = c12;
                fArr2 = fArr2;
            }
            fArr[0] = f28;
            fArr[1] = f29;
            fArr[2] = f22;
            fArr[3] = f23;
            fArr[4] = f26;
            fArr[5] = f27;
            c11 = dVar.f14568a;
            i10++;
            dVarArr2 = dVarArr;
            c10 = 0;
        }
    }
}
