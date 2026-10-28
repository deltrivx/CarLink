package z1;

import b3.l0;
import java.util.Arrays;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l0 f15671r = new l0(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f15672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f15675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f15676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f15677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f15678j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f15679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f15680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f15681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f15682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f15683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f15684q;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d10, float f10, float f11, int i7) {
        i iVar;
        i iVar2 = f15671r;
        if (d10 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i10 = 0;
            iVar = new i() { // from class: z1.n
                @Override // z1.i
                public final double b(double d11) {
                    switch (i10) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i11 = 1;
            iVar2 = new i() { // from class: z1.n
                @Override // z1.i
                public final double b(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f10, f11, new r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i7);
    }

    public q(String str, float[] fArr, s sVar, final r rVar, int i7) {
        i iVar;
        i iVar2;
        double d10 = rVar.f15685a;
        boolean z10 = d10 == -3.0d;
        double d11 = rVar.f15691g;
        double d12 = rVar.f15690f;
        if (z10) {
            final int i10 = 4;
            iVar = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i11 = i10;
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i11 = 5;
            iVar = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i12 = 6;
            iVar = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i13 = i12;
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        } else {
            final int i13 = 7;
            iVar = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i14 = i13;
                    r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        }
        if (d10 == -3.0d) {
            final int i14 = 0;
            iVar2 = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i15 = i14;
                    r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i15 = 1;
            iVar2 = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i16 = i15;
                    r rVar2 = rVar;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i16 = 2;
            iVar2 = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i17 = i16;
                    r rVar2 = rVar;
                    switch (i17) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        } else {
            final int i17 = 3;
            iVar2 = new i() { // from class: z1.o
                @Override // z1.i
                public final double b(double d13) {
                    int i18 = i17;
                    r rVar2 = rVar;
                    switch (i18) {
                        case 0:
                            float[] fArr2 = d.f15621a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f15621a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f15686b;
                            return d13 >= rVar2.f15689e ? Math.pow((d14 * d13) + rVar2.f15687c, rVar2.f15685a) : d13 * rVar2.f15688d;
                        case 3:
                            double d15 = rVar2.f15686b;
                            double d16 = rVar2.f15687c;
                            double d17 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e ? Math.pow((d15 * d13) + d16, rVar2.f15685a) + rVar2.f15690f : (d17 * d13) + rVar2.f15691g;
                        case 4:
                            float[] fArr4 = d.f15621a;
                            return d.b(rVar2, d13);
                        case 5:
                            float[] fArr5 = d.f15621a;
                            return d.d(rVar2, d13);
                        case 6:
                            double d18 = rVar2.f15686b;
                            double d19 = rVar2.f15687c;
                            double d20 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d20 ? (Math.pow(d13, 1.0d / rVar2.f15685a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f15686b;
                            double d22 = rVar2.f15687c;
                            double d23 = rVar2.f15688d;
                            return d13 >= rVar2.f15689e * d23 ? (Math.pow(d13 - rVar2.f15690f, 1.0d / rVar2.f15685a) - d22) / d21 : (d13 - rVar2.f15691g) / d23;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i7);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0216  */
    /* JADX WARN: Code duplicated, block: B:56:0x021f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0233  */
    /* JADX WARN: Code duplicated, block: B:65:0x024b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0265  */
    /* JADX WARN: Code duplicated, block: B:77:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0267 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0265 A[SYNTHETIC] */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f10, float f11, r rVar, int i7) {
        float f12;
        char c10;
        boolean z10;
        float[] fArr3;
        q qVar;
        double d10;
        int i10;
        super(str, b.f15613a, i7);
        this.f15672d = sVar;
        this.f15673e = f10;
        this.f15674f = f11;
        this.f15675g = rVar;
        this.k = iVar;
        int i11 = 1;
        this.f15679l = new p(this, i11);
        int i12 = 0;
        this.f15680m = new m(this, i12);
        this.f15681n = iVar2;
        this.f15682o = new p(this, i12);
        this.f15683p = new m(this, i11);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = f13 + f14 + fArr[2];
            fArr4[0] = f13 / f15;
            fArr4[1] = f14 / f15;
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = f16 + f17 + fArr[5];
            fArr4[2] = f16 / f18;
            fArr4[3] = f17 / f18;
            float f19 = fArr[6];
            float f20 = fArr[7];
            float f21 = f19 + f20 + fArr[8];
            fArr4[4] = f19 / f21;
            fArr4[5] = f20 / f21;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.f15676h = fArr4;
        if (fArr2 == null) {
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            float f24 = fArr4[2];
            float f25 = fArr4[3];
            float f26 = fArr4[4];
            float f27 = fArr4[5];
            f12 = 1.0f;
            float f28 = sVar.f15692a;
            c10 = 0;
            float f29 = sVar.f15693b;
            float f30 = 1;
            float f31 = (f30 - f22) / f23;
            float f32 = (f30 - f24) / f25;
            float f33 = (f30 - f26) / f27;
            float f34 = (f30 - f28) / f29;
            float f35 = f22 / f23;
            float f36 = (f24 / f25) - f35;
            float f37 = (f28 / f29) - f35;
            float f38 = f32 - f31;
            float f39 = (f26 / f27) - f35;
            float f40 = (((f34 - f31) * f36) - (f37 * f38)) / (((f33 - f31) * f36) - (f38 * f39));
            float f41 = (f37 - (f39 * f40)) / f36;
            float f42 = (1.0f - f41) - f40;
            float f43 = f42 / f23;
            float f44 = f41 / f25;
            float f45 = f40 / f27;
            this.f15677i = new float[]{f43 * f22, f42, ((1.0f - f22) - f23) * f43, f44 * f24, f41, ((1.0f - f24) - f25) * f44, f45 * f26, f40, ((1.0f - f26) - f27) * f45};
        } else {
            f12 = 1.0f;
            c10 = 0;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f15677i = fArr2;
        }
        this.f15678j = j.f(this.f15677i);
        float fB = j.b(fArr4);
        float[] fArr5 = d.f15621a;
        if (fB / j.b(d.f15622b) > 0.9f) {
            float[] fArr6 = d.f15621a;
            float f46 = fArr4[c10];
            float f47 = fArr6[c10];
            float f48 = fArr4[1];
            float f49 = fArr6[1];
            float f50 = fArr4[2];
            float f51 = fArr6[2];
            float f52 = fArr4[3];
            float f53 = fArr6[3];
            float f54 = fArr4[4];
            float f55 = fArr6[4];
            float f56 = fArr4[5];
            float f57 = fArr6[5];
            float[] fArr7 = new float[6];
            fArr7[c10] = f46 - f47;
            fArr7[1] = f48 - f49;
            fArr7[2] = f50 - f51;
            fArr7[3] = f52 - f53;
            fArr7[4] = f54 - f55;
            fArr7[5] = f56 - f57;
            float f58 = fArr7[c10];
            float f59 = fArr7[1];
            if (((f49 - f57) * f58) - ((f47 - f55) * f59) >= 0.0f && ((f47 - f51) * f59) - ((f49 - f53) * f58) >= 0.0f) {
                float f60 = fArr7[2];
                float f61 = fArr7[3];
                if (((f53 - f49) * f60) - ((f51 - f47) * f61) >= 0.0f && ((f51 - f55) * f61) - ((f53 - f57) * f60) >= 0.0f) {
                    float f62 = fArr7[4];
                    float f63 = fArr7[5];
                    if (((f57 - f53) * f62) - ((f55 - f51) * f63) < 0.0f || ((f55 - f47) * f63) - ((f57 - f49) * f62) < 0.0f) {
                    }
                }
            }
            if (i7 != 0) {
                fArr3 = d.f15621a;
                if (fArr4 == fArr3) {
                    i10 = 0;
                    while (true) {
                        if (i10 < 6) {
                            if (Float.compare(fArr4[i10], fArr3[i10]) != 0 || Math.abs(fArr4[i10] - fArr3[i10]) <= 0.001f) {
                                i10++;
                            }
                        } else if (j.d(sVar, j.f15656d)) {
                            float[] fArr8 = d.f15621a;
                            qVar = d.f15625e;
                            d10 = 0.0d;
                            while (true) {
                                if (d10 <= 1.0d) {
                                    z10 = true;
                                } else if (Math.abs(iVar.b(d10) - qVar.k.b(d10)) > 0.001d) {
                                }
                                d10 += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (j.d(sVar, j.f15656d) && f10 == 0.0f && f11 == f12) {
                    float[] fArr9 = d.f15621a;
                    qVar = d.f15625e;
                    d10 = 0.0d;
                    while (true) {
                        if (d10 <= 1.0d) {
                            z10 = true;
                        } else if (Math.abs(iVar.b(d10) - qVar.k.b(d10)) > 0.001d && Math.abs(iVar2.b(d10) - qVar.f15681n.b(d10)) <= 0.001d) {
                            d10 += 0.00392156862745098d;
                        }
                    }
                }
                z10 = false;
            } else {
                z10 = true;
            }
            this.f15684q = z10;
        }
        int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 != 0) {
            fArr3 = d.f15621a;
            if (fArr4 == fArr3) {
                i10 = 0;
                while (true) {
                    if (i10 < 6) {
                        if (Float.compare(fArr4[i10], fArr3[i10]) != 0) {
                        }
                        i10++;
                    } else if (j.d(sVar, j.f15656d)) {
                        float[] fArr10 = d.f15621a;
                        qVar = d.f15625e;
                        d10 = 0.0d;
                        while (true) {
                            if (d10 <= 1.0d) {
                                z10 = true;
                            } else if (Math.abs(iVar.b(d10) - qVar.k.b(d10)) > 0.001d) {
                            }
                            d10 += 0.00392156862745098d;
                        }
                    }
                }
            } else if (j.d(sVar, j.f15656d)) {
                float[] fArr11 = d.f15621a;
                qVar = d.f15625e;
                d10 = 0.0d;
                while (true) {
                    if (d10 <= 1.0d) {
                        z10 = true;
                    } else if (Math.abs(iVar.b(d10) - qVar.k.b(d10)) > 0.001d) {
                    }
                    d10 += 0.00392156862745098d;
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        this.f15684q = z10;
    }

    @Override // z1.c
    public final float a(int i7) {
        return this.f15674f;
    }

    @Override // z1.c
    public final float b(int i7) {
        return this.f15673e;
    }

    @Override // z1.c
    public final boolean c() {
        return this.f15684q;
    }

    @Override // z1.c
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f15683p;
        float fB = (float) mVar.b(d10);
        float fB2 = (float) mVar.b(f11);
        float fB3 = (float) mVar.b(f12);
        float[] fArr = this.f15677i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        return (((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // z1.c
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f15683p;
        float fB = (float) mVar.b(d10);
        float fB2 = (float) mVar.b(f11);
        float fB3 = (float) mVar.b(f12);
        float[] fArr = this.f15677i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // z1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f15675g;
        if (Float.compare(qVar.f15673e, this.f15673e) != 0 || Float.compare(qVar.f15674f, this.f15674f) != 0 || !i9.l.a(this.f15672d, qVar.f15672d) || !Arrays.equals(this.f15676h, qVar.f15676h)) {
            return false;
        }
        r rVar2 = this.f15675g;
        if (rVar2 != null) {
            return i9.l.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (i9.l.a(this.k, qVar.k)) {
            return i9.l.a(this.f15681n, qVar.f15681n);
        }
        return false;
    }

    @Override // z1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.f15678j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f15680m;
        return h0.b((float) mVar.b(f14), (float) mVar.b(f15), (float) mVar.b(f16), f13, cVar);
    }

    @Override // z1.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f15676h) + ((this.f15672d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f15673e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f15674f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.f15675g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f15681n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }
}
