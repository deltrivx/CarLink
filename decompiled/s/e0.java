package s;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12411a = o0.f12476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12412b = t.a.f12721c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f12413c = r.f12487b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12414d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12415e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12418h;

    public e0(int i7) {
        if (i7 >= 0) {
            f(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i7 = this.f12417g;
        int iD = d(obj);
        this.f12412b[iD] = obj;
        long[] jArr = this.f12413c;
        int i10 = this.f12414d;
        jArr[iD] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((2147483647L & ((long) iD)) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f12414d = iD;
        if (this.f12415e == Integer.MAX_VALUE) {
            this.f12415e = iD;
        }
        return this.f12417g != i7;
    }

    public final void b() {
        this.f12417g = 0;
        long[] jArr = this.f12411a;
        if (jArr != o0.f12476a) {
            u8.l.u0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12411a;
            int i7 = this.f12416f;
            int i10 = i7 >> 3;
            long j5 = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j5)) | j5;
        }
        u8.l.t0(0, this.f12416f, null, this.f12412b);
        u8.l.u0(this.f12413c, 4611686018427387903L);
        this.f12414d = Integer.MAX_VALUE;
        this.f12415e = Integer.MAX_VALUE;
        this.f12418h = o0.a(this.f12416f) - this.f12417g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 & 127;
        int i11 = this.f12416f;
        int i12 = (i7 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f12411a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j5 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (i9.l.a(this.f12412b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        long j5;
        long j10;
        long j11;
        int i7;
        char c10;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f12416f;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f12411a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j13 = i13;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            for (long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i15) & i14;
                if (i9.l.a(this.f12412b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                if (this.f12418h != 0 || ((this.f12411a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j10 = j13;
                    j11 = 128;
                    i7 = 0;
                } else {
                    int i19 = this.f12416f;
                    if (i19 > 8) {
                        c10 = 31;
                        j11 = 128;
                        j5 = 255;
                        if (Long.compare((((long) this.f12417g) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f12411a;
                            if (jArr4 == null) {
                                j10 = j13;
                                i7 = 0;
                            } else {
                                int i20 = this.f12416f;
                                Object[] objArr2 = this.f12412b;
                                long[] jArr5 = this.f12413c;
                                long[] jArr6 = new long[i20];
                                j10 = j13;
                                long j16 = 9223372034707292159L;
                                Arrays.fill(jArr6, i10, i20, 9223372034707292159L);
                                int i21 = (i20 + 7) >> 3;
                                i7 = 0;
                                while (i10 < i21) {
                                    long j17 = jArr4[i10] & (-9187201950435737472L);
                                    jArr4[i10] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                    i10++;
                                    j16 = j16;
                                }
                                long j18 = j16;
                                int length = jArr4.length;
                                int i22 = length - 1;
                                int i23 = length - 2;
                                jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i22] = jArr4[0];
                                int i24 = 0;
                                while (i24 != i20) {
                                    int i25 = i24 >> 3;
                                    int i26 = (i24 & 7) << 3;
                                    long j19 = (jArr4[i25] >> i26) & 255;
                                    if (j19 != 128 && j19 == 254) {
                                        Object obj2 = objArr2[i24];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                        int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i28 = i27 >>> 7;
                                        int iE2 = e(i28);
                                        int i29 = i28 & i20;
                                        if (((iE2 - i29) & i20) / 8 == ((i24 - i29) & i20) / 8) {
                                            jArr4[i25] = (((long) (i27 & 127)) << i26) | (jArr4[i25] & (~(255 << i26)));
                                            if (jArr6[i24] == j18) {
                                                long j20 = i24;
                                                jArr6[i24] = j20 | (j20 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i24++;
                                        } else {
                                            int i30 = iE2 >> 3;
                                            long j21 = jArr4[i30];
                                            int i31 = (iE2 & 7) << 3;
                                            if (((j21 >> i31) & 255) == 128) {
                                                objArr = objArr2;
                                                jArr2 = jArr5;
                                                jArr4[i30] = ((~(255 << i31)) & j21) | (((long) (i27 & 127)) << i31);
                                                jArr4[i25] = (jArr4[i25] & (~(255 << i26))) | (128 << i26);
                                                objArr[iE2] = objArr[i24];
                                                objArr[i24] = null;
                                                jArr2[iE2] = jArr2[i24];
                                                jArr2[i24] = 4611686018427387903L;
                                                int i32 = (int) ((jArr6[i24] >> 32) & 4294967295L);
                                                if (i32 != Integer.MAX_VALUE) {
                                                    jArr6[i32] = (jArr6[i32] & (-4294967296L)) | ((long) iE2);
                                                    jArr6[i24] = (jArr6[i24] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr6[i24] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr6[iE2] = (((long) i24) << 32) | ((long) Integer.MAX_VALUE);
                                            } else {
                                                objArr = objArr2;
                                                jArr2 = jArr5;
                                                jArr4[i30] = (((long) (i27 & 127)) << i31) | ((~(255 << i31)) & j21);
                                                Object obj3 = objArr[iE2];
                                                objArr[iE2] = objArr[i24];
                                                objArr[i24] = obj3;
                                                long j22 = jArr2[iE2];
                                                jArr2[iE2] = jArr2[i24];
                                                jArr2[i24] = j22;
                                                int i33 = (int) ((jArr6[i24] >> 32) & 4294967295L);
                                                if (i33 != Integer.MAX_VALUE) {
                                                    long j23 = iE2;
                                                    jArr6[i33] = (jArr6[i33] & (-4294967296L)) | j23;
                                                    jArr6[i24] = (jArr6[i24] & 4294967295L) | (j23 << 32);
                                                } else {
                                                    long j24 = iE2;
                                                    jArr6[i24] = j24 | (j24 << 32);
                                                    i33 = i24;
                                                }
                                                jArr6[iE2] = (((long) i33) << 32) | ((long) i24);
                                                i24--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i24++;
                                            objArr2 = objArr;
                                            jArr5 = jArr2;
                                        }
                                    } else {
                                        i24++;
                                    }
                                }
                                this.f12418h = o0.a(this.f12416f) - this.f12417g;
                                long[] jArr7 = this.f12413c;
                                int length2 = jArr7.length;
                                for (int i34 = 0; i34 < length2; i34++) {
                                    long j25 = jArr7[i34];
                                    int i35 = (int) ((j25 >> 31) & 2147483647L);
                                    int i36 = (int) (j25 & 2147483647L);
                                    jArr7[i34] = (((j25 & (-4611686018427387904L)) | ((long) (i35 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i35] & 4294967295L)))) << 31) | ((long) (i36 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i36] & 4294967295L)));
                                }
                                int i37 = this.f12414d;
                                if (i37 != Integer.MAX_VALUE) {
                                    this.f12414d = (int) (jArr6[i37] & 4294967295L);
                                }
                                int i38 = this.f12415e;
                                if (i38 != Integer.MAX_VALUE) {
                                    this.f12415e = (int) (jArr6[i38] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i12);
                    } else {
                        j5 = 255;
                        c10 = 31;
                        j11 = 128;
                    }
                    j10 = j13;
                    i7 = 0;
                    int iB = o0.b(this.f12416f);
                    long[] jArr8 = this.f12411a;
                    Object[] objArr3 = this.f12412b;
                    long[] jArr9 = this.f12413c;
                    int i39 = this.f12416f;
                    int[] iArr = new int[i39];
                    f(iB);
                    long[] jArr10 = this.f12411a;
                    Object[] objArr4 = this.f12412b;
                    long[] jArr11 = this.f12413c;
                    int i40 = this.f12416f;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr8[i41 >> 3] >> ((i41 & 7) << 3)) & j5) < j11) {
                            Object obj4 = objArr3[i41];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * (-862048943);
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i42 >>> 7);
                            jArr = jArr10;
                            long j26 = i42 & 127;
                            int i43 = iE3 >> 3;
                            int i44 = (iE3 & 7) << 3;
                            long j27 = (jArr[i43] & (~(j5 << i44))) | (j26 << i44);
                            jArr[i43] = j27;
                            jArr[(((iE3 - 7) & i40) + (i40 & 7)) >> 3] = j27;
                            objArr4[iE3] = obj4;
                            jArr11[iE3] = jArr9[i41];
                            iArr[i41] = iE3;
                        } else {
                            jArr = jArr10;
                        }
                        i41++;
                        jArr8 = jArr8;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f12413c;
                    int length3 = jArr12.length;
                    for (int i45 = 0; i45 < length3; i45++) {
                        long j28 = jArr12[i45];
                        int i46 = (int) ((j28 >> c10) & 2147483647L);
                        int i47 = (int) (j28 & 2147483647L);
                        jArr12[i45] = (((j28 & (-4611686018427387904L)) | ((long) (i46 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i46]))) << c10) | ((long) (i47 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i47]));
                    }
                    int i48 = this.f12414d;
                    if (i48 != Integer.MAX_VALUE) {
                        this.f12414d = iArr[i48];
                    }
                    int i49 = this.f12415e;
                    if (i49 != Integer.MAX_VALUE) {
                        this.f12415e = iArr[i49];
                    }
                    iE = e(i12);
                }
                this.f12417g++;
                int i50 = this.f12418h;
                long[] jArr13 = this.f12411a;
                int i51 = iE >> 3;
                long j29 = jArr13[i51];
                int i52 = (iE & 7) << 3;
                if (((j29 >> i52) & j5) == j11) {
                    i7 = 1;
                }
                this.f12418h = i50 - i7;
                int i53 = this.f12416f;
                long j30 = (j29 & (~(j5 << i52))) | (j10 << i52);
                jArr13[i51] = j30;
                jArr13[(((iE - 7) & i53) + (i53 & 7)) >> 3] = j30;
                return iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i10 = 0;
        }
    }

    public final int e(int i7) {
        int i10 = this.f12416f;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12411a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j5 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = j5 & ((~j5) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.f12417g != this.f12417g) {
            return false;
        }
        Object[] objArr = this.f12412b;
        long[] jArr = this.f12411a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128 && !e0Var.c(objArr[(i7 << 3) + i11])) {
                            return false;
                        }
                        j5 >>= 8;
                    }
                    if (i10 == 8) {
                        if (i7 != length) {
                            i7++;
                        }
                    }
                } else if (i7 != length) {
                    i7++;
                }
            }
        }
        return true;
    }

    public final void f(int i7) {
        long[] jArr;
        long[] jArr2;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12416f = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12411a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12418h = o0.a(this.f12416f) - this.f12417g;
        this.f12412b = iMax == 0 ? t.a.f12721c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = r.f12487b;
        } else {
            jArr2 = new long[iMax];
            u8.l.u0(jArr2, 4611686018427387903L);
        }
        this.f12413c = jArr2;
    }

    public final boolean g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 & 127;
        int i11 = this.f12416f;
        int i12 = (i7 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f12411a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j5 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (i9.l.a(this.f12412b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            h(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void h(int i7) {
        this.f12417g--;
        long[] jArr = this.f12411a;
        int i10 = this.f12416f;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j5 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j5;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j5;
        this.f12412b[i7] = null;
        long[] jArr2 = this.f12413c;
        long j10 = jArr2[i7];
        int i13 = (int) ((j10 >> 31) & 2147483647L);
        int i14 = (int) (j10 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (((long) i14) & 2147483647L);
        } else {
            this.f12414d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((((long) i13) & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.f12415e = i13;
        }
        jArr2[i7] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f12416f * 31) + this.f12417g;
        Object[] objArr = this.f12412b;
        long[] jArr = this.f12411a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i7 << 3) + i11];
                            if (!i9.l.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        return iHashCode;
                    }
                }
                if (i7 != length) {
                    i7++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean i(Collection collection) {
        i9.l.e(collection, "elements");
        Object[] objArr = this.f12412b;
        int i7 = this.f12417g;
        long[] jArr = this.f12411a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j5 = jArr[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j5) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!u8.p.g0(collection, objArr[i13])) {
                                h(i13);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return i7 != this.f12417g;
    }

    public final String toString() {
        b2.a aVar = new b2.a(15, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f12412b;
        long[] jArr = this.f12413c;
        int i7 = this.f12415e;
        int i10 = 0;
        while (i7 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i7] >> 31) & 2147483647L);
            Object obj = objArr[i7];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                i9.l.d(string, "toString(...)");
                return string;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) aVar.invoke(obj));
            i10++;
            i7 = i11;
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        i9.l.d(string2, "toString(...)");
        return string2;
    }
}
