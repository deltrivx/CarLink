package z2;

import android.os.Handler;
import g7.l;
import h1.e;
import n3.j;
import n3.u;
import o9.e0;
import q2.d1;
import q2.h0;
import q2.h1;
import q2.p1;
import q2.y0;
import s.d0;
import s.w;
import y1.a0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f15694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f15696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.baidu.carlife.sdk.internal.a f15700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b1.a f15702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x1.a f15703j;

    public a() {
        l lVar = new l(7);
        lVar.f5999c = new long[192];
        lVar.f6000d = new long[192];
        this.f15694a = lVar;
        this.f15695b = new b();
        this.f15696c = new d0();
        this.f15701h = -1L;
        this.f15702i = new b1.a(18, this);
        this.f15703j = new x1.a();
    }

    public static long g(h0 h0Var) {
        float[] fArrMo26getUnderlyingMatrixsQKQjiQ;
        int iE;
        d1 d1Var = h0Var.E;
        h1 h1Var = d1Var.f10615d;
        h1 h1Var2 = d1Var.f10614c;
        long jN = 0;
        while (h1Var2 != null && h1Var2 != h1Var) {
            p1 p1Var = h1Var2.I;
            jN = e0.N(jN, h1Var2.f10703z);
            h1Var2 = h1Var2.f10694q;
            if (p1Var != null && (iE = u.e((fArrMo26getUnderlyingMatrixsQKQjiQ = p1Var.mo26getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iE & 2) == 0) {
                    return 9223372034707292159L;
                }
                jN = a0.b(jN, fArrMo26getUnderlyingMatrixsQKQjiQ);
            }
        }
        return e0.O(jN);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static void h(h0 h0Var) {
        long jG;
        long jC = h0Var.E.f10615d.f10703z;
        h0 h0VarV = h0Var.v();
        if (h0VarV != null) {
            if (j.a(h0VarV.f10669c, 9223372034707292159L)) {
                h(h0VarV);
            }
            long j5 = h0VarV.f10669c;
            if (j.a(j5, 9223372034707292159L)) {
                jC = 9223372034707292159L;
            } else {
                if (h0VarV.f10672f) {
                    jG = g(h0VarV);
                    h0VarV.f10671e = jG;
                    h0VarV.f10672f = false;
                } else {
                    jG = h0VarV.f10671e;
                }
                if (j.a(jG, 9223372034707292159L)) {
                    jC = 9223372034707292159L;
                } else {
                    jC = j.c(j.c(j5, jG), jC);
                }
            }
        }
        h0Var.f10669c = jC;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c5 A[LOOP:8: B:92:0x0194->B:106:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x00c3 A[EDGE_INSN: B:117:0x00c3->B:45:0x00c3 BREAK  A[LOOP:2: B:29:0x0087->B:43:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0133 A[EDGE_INSN: B:124:0x0133->B:71:0x0133 BREAK  A[LOOP:5: B:56:0x00fe->B:70:0x0130], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb A[LOOP:2: B:29:0x0087->B:43:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0130 A[LOOP:5: B:56:0x00fe->B:70:0x0130, LOOP_END] */
    public final void a() {
        boolean z10;
        long j5;
        long j10;
        long j11;
        Handler handler = r1.b.f11091a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f15697d;
        boolean z12 = z11 || this.f15698e;
        l lVar = this.f15694a;
        b bVar = this.f15695b;
        if (z11) {
            this.f15697d = false;
            d0 d0Var = this.f15696c;
            j5 = 128;
            Object[] objArr = d0Var.f12407a;
            int i7 = d0Var.f12408b;
            for (int i10 = 0; i10 < i7; i10++) {
                ((h9.a) objArr[i10]).invoke();
            }
            long[] jArr = (long[]) lVar.f5999c;
            int i11 = lVar.f5998b;
            j10 = 255;
            for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
                long j12 = jArr[i12 + 2];
                if ((((int) (j12 >> 61)) & 1) != 0) {
                    long j13 = jArr[i12];
                    long j14 = jArr[i12 + 1];
                    if (bVar.f15704a.b(67108863 & ((int) j12)) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            j11 = -9187201950435737472L;
            w wVar = bVar.f15704a;
            Object[] objArr2 = wVar.f12463c;
            long[] jArr2 = wVar.f12461a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j15 = jArr2[i13];
                    z10 = z12;
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j15 & 255) < 128 && objArr2[(i13 << 3) + i15] != null) {
                                throw new ClassCastException();
                            }
                            j15 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                        if (i13 != length) {
                            break;
                        }
                        i13++;
                        z12 = z10;
                    } else if (i13 != length) {
                        break;
                        break;
                    } else {
                        i13++;
                        z12 = z10;
                    }
                }
            } else {
                z10 = z12;
            }
            long[] jArr3 = (long[]) lVar.f5999c;
            int i16 = lVar.f5998b;
            for (int i17 = 0; i17 < jArr3.length - 2 && i17 < i16; i17 += 3) {
                int i18 = i17 + 2;
                jArr3[i18] = jArr3[i18] & (-2305843009213693953L);
            }
        } else {
            z10 = z12;
            j5 = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
        }
        if (this.f15698e) {
            this.f15698e = false;
            w wVar2 = bVar.f15704a;
            Object[] objArr3 = wVar2.f12463c;
            long[] jArr4 = wVar2.f12461a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                while (true) {
                    long j16 = jArr4[i19];
                    if ((((~j16) << 7) & j16 & j11) == j11) {
                        if (i19 != length2) {
                            break;
                            break;
                        }
                        i19++;
                    } else {
                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                        for (int i21 = 0; i21 < i20; i21++) {
                            if ((j16 & j10) < j5 && objArr3[(i19 << 3) + i21] != null) {
                                throw new ClassCastException();
                            }
                            j16 >>= 8;
                        }
                        if (i20 != 8) {
                            break;
                        } else if (i19 != length2) {
                            break;
                        } else {
                            i19++;
                        }
                    }
                }
            }
        }
        if (z10) {
            bVar.getClass();
        }
        if (this.f15699f) {
            this.f15699f = false;
            long[] jArr5 = (long[]) lVar.f5999c;
            int i22 = lVar.f5998b;
            long[] jArr6 = (long[]) lVar.f6000d;
            int i23 = 0;
            for (int i24 = 0; i24 < jArr5.length - 2 && i23 < jArr6.length - 2 && i24 < i22; i24 += 3) {
                int i25 = i24 + 2;
                if (jArr5[i25] != 2305843009213693951L) {
                    jArr6[i23] = jArr5[i24];
                    jArr6[i23 + 1] = jArr5[i24 + 1];
                    jArr6[i23 + 2] = jArr5[i25];
                    i23 += 3;
                }
            }
            lVar.f5998b = i23;
            lVar.f5999c = jArr6;
            lVar.f6000d = jArr5;
        }
        if (bVar.f15705b > jCurrentTimeMillis) {
            return;
        }
        w wVar3 = bVar.f15704a;
        Object[] objArr4 = wVar3.f12463c;
        long[] jArr7 = wVar3.f12461a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i26 = 0;
            while (true) {
                long j17 = jArr7[i26];
                if ((((~j17) << 7) & j17 & j11) != j11) {
                    int i27 = 8 - ((~(i26 - length3)) >>> 31);
                    for (int i28 = 0; i28 < i27; i28++) {
                        if ((j17 & j10) < j5 && objArr4[(i26 << 3) + i28] != null) {
                            throw new ClassCastException();
                        }
                        j17 >>= 8;
                    }
                    if (i27 == 8) {
                        if (i26 != length3) {
                            i26++;
                        }
                    }
                } else if (i26 != length3) {
                    i26++;
                }
            }
        }
        bVar.f15705b = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    public final void b(h0 h0Var, boolean z10) {
        h0 h0VarV;
        int i7;
        d1 d1Var = h0Var.E;
        h1 h1Var = d1Var.f10615d;
        y0 y0Var = h0Var.F.f10743p;
        int iK = y0Var.K();
        float fI = y0Var.I();
        x1.a aVar = this.f15703j;
        aVar.f14517a = 0.0f;
        aVar.f14518b = 0.0f;
        aVar.f14519c = iK;
        aVar.f14520d = fI;
        while (h1Var != null) {
            p1 p1Var = h1Var.I;
            long j5 = h1Var.f10703z;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
            aVar.f14517a += fIntBitsToFloat;
            aVar.f14518b += fIntBitsToFloat2;
            aVar.f14519c += fIntBitsToFloat;
            aVar.f14520d += fIntBitsToFloat2;
            h1Var = h1Var.f10694q;
            if (p1Var != null) {
                float[] fArrMo26getUnderlyingMatrixsQKQjiQ = p1Var.mo26getUnderlyingMatrixsQKQjiQ();
                if (!y1.h0.p(fArrMo26getUnderlyingMatrixsQKQjiQ)) {
                    a0.c(fArrMo26getUnderlyingMatrixsQKQjiQ, aVar);
                }
            }
        }
        int i10 = (int) aVar.f14517a;
        int i11 = (int) aVar.f14518b;
        int i12 = (int) aVar.f14519c;
        int i13 = (int) aVar.f14520d;
        int i14 = h0Var.f10668b;
        l lVar = this.f15694a;
        if (z10) {
            l lVar2 = lVar;
            h0VarV = h0Var.v();
            if (h0VarV != null) {
                i7 = h0VarV.f10668b;
            } else {
                i7 = -1;
            }
            lVar2.f(i14, i10, i11, i12, i13, i7, d1Var.d(1024), d1Var.d(16));
        } else {
            int i15 = i14 & 67108863;
            long[] jArr = (long[]) lVar.f5999c;
            int i16 = lVar.f5998b;
            int i17 = 0;
            while (true) {
                if (i17 >= jArr.length - 2 || i17 >= i16) {
                    l lVar3 = lVar;
                    h0VarV = h0Var.v();
                    if (h0VarV != null) {
                        i7 = h0VarV.f10668b;
                    } else {
                        i7 = -1;
                    }
                    lVar3.f(i14, i10, i11, i12, i13, i7, d1Var.d(1024), d1Var.d(16));
                } else {
                    int i18 = i17 + 2;
                    l lVar4 = lVar;
                    long j10 = jArr[i18];
                    if ((((int) j10) & 67108863) == i15) {
                        jArr[i17] = (((long) i10) << 32) | (((long) i11) & 4294967295L);
                        jArr[i17 + 1] = (((long) i12) << 32) | (((long) i13) & 4294967295L);
                        jArr[i18] = 2305843009213693952L | j10;
                    } else {
                        i17 += 3;
                        lVar = lVar4;
                    }
                }
            }
        }
        this.f15697d = true;
    }

    public final void c(h0 h0Var) {
        e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            b(h0Var2, false);
            c(h0Var2);
        }
    }

    public final void d(h0 h0Var) {
        this.f15697d = true;
        int i7 = h0Var.f10668b & 67108863;
        l lVar = this.f15694a;
        long[] jArr = (long[]) lVar.f5999c;
        int i10 = lVar.f5998b;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            long j5 = jArr[i12];
            if ((((int) j5) & 67108863) == i7) {
                jArr[i12] = 2305843009213693952L | j5;
                break;
            }
        }
        com.baidu.carlife.sdk.internal.a aVar = this.f15700g;
        boolean z10 = aVar != null;
        long j10 = this.f15695b.f15705b;
        if (j10 >= 0 || !z10) {
            if (this.f15701h == j10 && z10) {
                return;
            }
            if (aVar != null) {
                Handler handler = r1.b.f11091a;
                r1.b.f11091a.removeCallbacks(aVar);
            }
            Handler handler2 = r1.b.f11091a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j10, ((long) 16) + jCurrentTimeMillis);
            this.f15701h = jMax;
            com.baidu.carlife.sdk.internal.a aVar2 = new com.baidu.carlife.sdk.internal.a(this.f15702i, 5);
            r1.b.f11091a.postDelayed(aVar2, jMax - jCurrentTimeMillis);
            this.f15700g = aVar2;
        }
    }

    public final void e(h0 h0Var) {
        long jG = g(h0Var);
        if (j.a(jG, 9223372034707292159L)) {
            c(h0Var);
            return;
        }
        h0Var.f10671e = jG;
        h0Var.f10672f = false;
        e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            f((h0) objArr[i10], false);
        }
        d(h0Var);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0173  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    public final void f(h0 h0Var, boolean z10) {
        h0 h0VarV;
        int i7;
        long j5;
        y0 y0Var = h0Var.F.f10743p;
        int iK = y0Var.K();
        int I = y0Var.I();
        long j10 = h0Var.f10669c;
        long j11 = h0Var.f10670d;
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        h(h0Var);
        long j12 = h0Var.f10669c;
        if (j.a(j12, 9223372034707292159L)) {
            b(h0Var, z10);
            return;
        }
        long j13 = 4294967295L;
        h0Var.f10670d = (((long) iK) << 32) | (((long) I) & 4294967295L);
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        int i14 = i12 + iK;
        int i15 = i13 + I;
        if (!z10 && j.a(j12, j10) && i10 == iK && i11 == I) {
            return;
        }
        int i16 = h0Var.f10668b;
        d1 d1Var = h0Var.E;
        l lVar = this.f15694a;
        if (z10) {
            h0VarV = h0Var.v();
            if (h0VarV != null) {
                i7 = h0VarV.f10668b;
            } else {
                i7 = -1;
            }
            lVar.f(i16, i12, i13, i14, i15, i7, d1Var.d(1024), d1Var.d(16));
        } else {
            int i17 = i16 & 67108863;
            long[] jArr = (long[]) lVar.f5999c;
            int i18 = lVar.f5998b;
            int i19 = 0;
            while (true) {
                if (i19 >= jArr.length - 2 || i19 >= i18) {
                    h0VarV = h0Var.v();
                    if (h0VarV != null) {
                        i7 = h0VarV.f10668b;
                    } else {
                        i7 = -1;
                    }
                    lVar.f(i16, i12, i13, i14, i15, i7, d1Var.d(1024), d1Var.d(16));
                } else {
                    int i20 = i19 + 2;
                    int i21 = i19;
                    long j14 = jArr[i20];
                    long j15 = j13;
                    if ((((int) j14) & 67108863) == i17) {
                        long j16 = jArr[i21];
                        jArr[i21] = (((long) i13) & j15) | (((long) i12) << 32);
                        jArr[i21 + 1] = (((long) i14) << 32) | (((long) i15) & j15);
                        long j17 = 2305843009213693952L;
                        jArr[i20] = j14 | 2305843009213693952L;
                        int i22 = i12 - ((int) (j16 >> 32));
                        int i23 = i13 - ((int) j16);
                        if ((i22 != 0) | (i23 != 0)) {
                            long j18 = -4503599560261633L;
                            long[] jArr2 = (long[]) lVar.f5999c;
                            long[] jArr3 = (long[]) lVar.f6000d;
                            int i24 = lVar.f5998b / 3;
                            jArr3[0] = (j14 & (-4503599560261633L)) | (((long) ((i21 + 3) & 67108863)) << 26);
                            int i25 = 1;
                            while (i25 > 0) {
                                i25--;
                                long j19 = jArr3[i25];
                                int i26 = ((int) j19) & 67108863;
                                long j20 = j18;
                                int i27 = ((int) (j19 >> 26)) & 67108863;
                                int i28 = ((int) (j19 >> 52)) & 511;
                                int i29 = i28 == 511 ? i24 : i28 + i27;
                                if (i27 < 0) {
                                    break;
                                }
                                while (i27 < jArr2.length - 2 && i27 < i29) {
                                    int i30 = i27 + 2;
                                    long j21 = jArr2[i30];
                                    int i31 = i29;
                                    if ((((int) (j21 >> 26)) & 67108863) == i26) {
                                        long j22 = jArr2[i27];
                                        int i32 = i27 + 1;
                                        j5 = j17;
                                        long j23 = jArr2[i32];
                                        jArr2[i27] = (((long) (((int) j22) + i23)) & j15) | (((long) (((int) (j22 >> 32)) + i22)) << 32);
                                        jArr2[i32] = (((long) (((int) j23) + i23)) & j15) | (((long) (((int) (j23 >> 32)) + i22)) << 32);
                                        jArr2[i30] = j21 | j5;
                                        if ((((int) (j21 >> 52)) & 511) > 0) {
                                            jArr3[i25] = (((long) ((i27 + 3) & 67108863)) << 26) | (j21 & j20);
                                            i25++;
                                        }
                                    } else {
                                        j5 = j17;
                                    }
                                    i27 += 3;
                                    i29 = i31;
                                    j17 = j5;
                                }
                                j18 = j20;
                                j17 = j17;
                            }
                        }
                    } else {
                        i19 = i21 + 3;
                        j13 = j15;
                    }
                }
            }
        }
        this.f15697d = true;
    }

    public final void i(h0 h0Var) {
        int i7 = h0Var.f10668b & 67108863;
        l lVar = this.f15694a;
        long[] jArr = (long[]) lVar.f5999c;
        int i10 = lVar.f5998b;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            if ((((int) jArr[i12]) & 67108863) == i7) {
                jArr[i11] = -1;
                jArr[i11 + 1] = -1;
                jArr[i12] = 2305843009213693951L;
                break;
            }
        }
        this.f15697d = true;
        this.f15699f = true;
    }
}
