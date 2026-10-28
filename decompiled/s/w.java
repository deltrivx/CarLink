package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12510f;

    public /* synthetic */ w() {
        this(6);
    }

    public w(int i7) {
        this.f12461a = o0.f12476a;
        this.f12462b = m.f12470a;
        this.f12463c = t.a.f12721c;
        if (i7 >= 0) {
            f(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f12465e = 0;
        long[] jArr = this.f12461a;
        if (jArr != o0.f12476a) {
            u8.l.u0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12461a;
            int i7 = this.f12464d;
            int i10 = i7 >> 3;
            long j5 = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j5)) | j5;
        }
        u8.l.t0(0, this.f12464d, null, this.f12463c);
        this.f12510f = o0.a(this.f12464d) - this.f12465e;
    }

    public final int d(int i7) {
        long j5;
        long j10;
        int i10;
        long[] jArr;
        int i11;
        int i12 = i7 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f12464d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr2 = this.f12461a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = i18;
            long j11 = (((-i20) >> 63) & (jArr2[i19 + 1] << (64 - i20))) | (jArr2[i19] >>> i20);
            long j12 = i15;
            int i22 = i15;
            int i23 = -862048943;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = -9187201950435737472L;
            long j15 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j15) >> 3)) & i16;
                long j16 = j14;
                if (this.f12462b[iNumberOfTrailingZeros] == i7) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                j14 = j16;
            }
            long j17 = j14;
            if ((((~j11) << 6) & j11 & j17) != 0) {
                int iE = e(i14);
                long j18 = 255;
                if (this.f12510f != 0 || ((this.f12461a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j10 = 128;
                    i10 = 0;
                } else {
                    int i24 = this.f12464d;
                    if (i24 > 8) {
                        j10 = 128;
                        if (Long.compare((((long) this.f12465e) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f12461a;
                            int i25 = this.f12464d;
                            int[] iArr = this.f12462b;
                            Object[] objArr = this.f12463c;
                            int i26 = 0;
                            for (int i27 = (i25 + 7) >> 3; i26 < i27; i27 = i27) {
                                long j19 = jArr3[i26] & j17;
                                jArr3[i26] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i26++;
                                j18 = j18;
                            }
                            j5 = j18;
                            int iZ0 = u8.l.z0(jArr3);
                            int i28 = iZ0 - 1;
                            jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ0] = jArr3[0];
                            int i29 = 0;
                            while (i29 != i25) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j20 = (jArr3[i30] >> i31) & j5;
                                if (j20 != 128 && j20 == 254) {
                                    int i32 = iArr[i29] * i23;
                                    int i33 = i32 ^ (i32 << 16);
                                    int i34 = i33 >>> 7;
                                    int iE2 = e(i34);
                                    int i35 = i34 & i25;
                                    if (((iE2 - i35) & i25) / 8 == ((i29 - i35) & i25) / 8) {
                                        jArr3[i30] = (((long) (i33 & 127)) << i31) | (jArr3[i30] & (~(j5 << i31)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i29++;
                                    } else {
                                        int i36 = iE2 >> 3;
                                        long j21 = jArr3[i36];
                                        int i37 = (iE2 & 7) << 3;
                                        if (((j21 >> i37) & j5) == 128) {
                                            int i38 = i29;
                                            jArr3[i36] = (j21 & (~(j5 << i37))) | (((long) (i33 & 127)) << i37);
                                            jArr3[i30] = (jArr3[i30] & (~(j5 << i31))) | (128 << i31);
                                            iArr[iE2] = iArr[i38];
                                            iArr[i38] = 0;
                                            objArr[iE2] = objArr[i38];
                                            objArr[i38] = null;
                                            i11 = i38;
                                        } else {
                                            int i39 = i29;
                                            jArr3[i36] = (((long) (i33 & 127)) << i37) | (j21 & (~(j5 << i37)));
                                            int i40 = iArr[iE2];
                                            iArr[iE2] = iArr[i39];
                                            iArr[i39] = i40;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i39];
                                            objArr[i39] = obj;
                                            i11 = i39 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i29 = i11 + 1;
                                        i25 = i25;
                                    }
                                    i23 = -862048943;
                                } else {
                                    i29++;
                                }
                            }
                            i10 = 0;
                            this.f12510f = o0.a(this.f12464d) - this.f12465e;
                        }
                        iE = e(i14);
                    } else {
                        j10 = 128;
                    }
                    j5 = 255;
                    i10 = 0;
                    int iB = o0.b(this.f12464d);
                    long[] jArr4 = this.f12461a;
                    int[] iArr2 = this.f12462b;
                    Object[] objArr2 = this.f12463c;
                    int i41 = this.f12464d;
                    f(iB);
                    long[] jArr5 = this.f12461a;
                    int[] iArr3 = this.f12462b;
                    Object[] objArr3 = this.f12463c;
                    int i42 = this.f12464d;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr4[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j10) {
                            int i44 = iArr2[i43];
                            int i45 = i44 * (-862048943);
                            int i46 = i45 ^ (i45 << 16);
                            int iE3 = e(i46 >>> 7);
                            jArr = jArr5;
                            long j22 = i46 & 127;
                            int i47 = iE3 >> 3;
                            int i48 = (iE3 & 7) << 3;
                            long j23 = (jArr[i47] & (~(255 << i48))) | (j22 << i48);
                            jArr[i47] = j23;
                            jArr[(((iE3 - 7) & i42) + (i42 & 7)) >> 3] = j23;
                            iArr3[iE3] = i44;
                            objArr3[iE3] = objArr2[i43];
                        } else {
                            jArr = jArr5;
                        }
                        i43++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i14);
                }
                this.f12465e++;
                int i49 = this.f12510f;
                long[] jArr6 = this.f12461a;
                int i50 = iE >> 3;
                long j24 = jArr6[i50];
                int i51 = (iE & 7) << 3;
                if (((j24 >> i51) & j5) == j10) {
                    i10 = 1;
                }
                this.f12510f = i49 - i10;
                int i52 = this.f12464d;
                long j25 = (j24 & (~(j5 << i51))) | (j12 << i51);
                jArr6[i50] = j25;
                jArr6[(((iE - 7) & i52) + (i52 & 7)) >> 3] = j25;
                return iE;
            }
            i18 = i21 + 8;
            i17 = (i17 + i18) & i16;
            i15 = i22;
        }
    }

    public final int e(int i7) {
        int i10 = this.f12464d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12461a;
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

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12464d = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12461a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12510f = o0.a(this.f12464d) - this.f12465e;
        this.f12462b = new int[iMax];
        this.f12463c = new Object[iMax];
    }

    public final Object g(int i7) {
        int iNumberOfTrailingZeros;
        int i10 = (-862048943) * i7;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f12464d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f12461a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j5 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f12462b[iNumberOfTrailingZeros] == i7) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f12465e--;
        long[] jArr2 = this.f12461a;
        int i18 = this.f12464d;
        int i19 = iNumberOfTrailingZeros >> 3;
        int i20 = (iNumberOfTrailingZeros & 7) << 3;
        long j12 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j12;
        jArr2[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j12;
        Object[] objArr = this.f12463c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void h(int i7, Object obj) {
        int iD = d(i7);
        this.f12462b[iD] = i7;
        this.f12463c[iD] = obj;
    }
}
