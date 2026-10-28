package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12515e;

    public /* synthetic */ x() {
        this(6);
    }

    public x(int i7) {
        this.f12511a = o0.f12476a;
        this.f12512b = m.f12470a;
        if (i7 >= 0) {
            d(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i7) {
        long j5;
        long j10;
        long j11;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i10;
        int i11 = this.f12514d;
        int i12 = i7 * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f12513c;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f12511a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = i18;
            long j12 = (((-i20) >> 63) & (jArr2[i19 + 1] << (64 - i20))) | (jArr2[i19] >>> i20);
            long j13 = i15;
            int i22 = i15;
            int i23 = -862048943;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                long j17 = j15;
                if (this.f12512b[iNumberOfTrailingZeros] == i7) {
                    break loop0;
                }
                j16 &= j16 - 1;
                j15 = j17;
            }
            long j18 = j15;
            if ((((~j12) << 6) & j12 & j18) != 0) {
                int iC = c(i14);
                long j19 = 255;
                if (this.f12515e != 0 || ((this.f12511a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j5 = j13;
                    j10 = 255;
                    j11 = 128;
                } else {
                    int i24 = this.f12513c;
                    if (i24 > 8) {
                        j11 = 128;
                        if (Long.compare((((long) this.f12514d) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f12511a;
                            int i25 = this.f12513c;
                            int[] iArr2 = this.f12512b;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            while (i27 < i26) {
                                long j20 = jArr3[i27] & j18;
                                jArr3[i27] = (-72340172838076674L) & ((~j20) + (j20 >>> 7));
                                i27++;
                                j19 = j19;
                                j13 = j13;
                            }
                            j5 = j13;
                            j10 = j19;
                            int iZ0 = u8.l.z0(jArr3);
                            int i28 = iZ0 - 1;
                            long j21 = 72057594037927935L;
                            jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ0] = jArr3[0];
                            int i29 = 0;
                            while (i29 != i25) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j22 = (jArr3[i30] >> i31) & j10;
                                if (j22 != 128 && j22 == 254) {
                                    int i32 = iArr2[i29] * i23;
                                    int i33 = i32 ^ (i32 << 16);
                                    int i34 = i33 >>> 7;
                                    int iC2 = c(i34);
                                    int i35 = i34 & i25;
                                    long j23 = j21;
                                    if (((iC2 - i35) & i25) / 8 == ((i29 - i35) & i25) / 8) {
                                        jArr3[i30] = (((long) (i33 & 127)) << i31) | (jArr3[i30] & (~(j10 << i31)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j23) | Long.MIN_VALUE;
                                        i29++;
                                    } else {
                                        int i36 = iC2 >> 3;
                                        long j24 = jArr3[i36];
                                        int i37 = (iC2 & 7) << 3;
                                        if (((j24 >> i37) & j10) == 128) {
                                            iArr = iArr2;
                                            int i38 = i29;
                                            jArr3[i36] = ((~(j10 << i37)) & j24) | (((long) (i33 & 127)) << i37);
                                            jArr3[i30] = (jArr3[i30] & (~(j10 << i31))) | (128 << i31);
                                            iArr[iC2] = iArr[i38];
                                            iArr[i38] = 0;
                                            i10 = i38;
                                        } else {
                                            iArr = iArr2;
                                            int i39 = i29;
                                            jArr3[i36] = (((long) (i33 & 127)) << i37) | ((~(j10 << i37)) & j24);
                                            int i40 = iArr[iC2];
                                            iArr[iC2] = iArr[i39];
                                            iArr[i39] = i40;
                                            i10 = i39 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j23) | Long.MIN_VALUE;
                                        i29 = i10 + 1;
                                        iArr2 = iArr;
                                    }
                                    j21 = j23;
                                    i23 = -862048943;
                                } else {
                                    i29++;
                                }
                            }
                            this.f12515e = o0.a(this.f12513c) - this.f12514d;
                        }
                        iC = c(i14);
                    } else {
                        j11 = 128;
                    }
                    j5 = j13;
                    j10 = 255;
                    int iB = o0.b(this.f12513c);
                    long[] jArr4 = this.f12511a;
                    int[] iArr3 = this.f12512b;
                    int i41 = this.f12513c;
                    d(iB);
                    long[] jArr5 = this.f12511a;
                    int[] iArr4 = this.f12512b;
                    int i42 = this.f12513c;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr4[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j11) {
                            int i44 = iArr3[i43];
                            int i45 = i44 * (-862048943);
                            int i46 = i45 ^ (i45 << 16);
                            int iC3 = c(i46 >>> 7);
                            jArr = jArr5;
                            long j25 = i46 & 127;
                            int i47 = iC3 >> 3;
                            int i48 = (iC3 & 7) << 3;
                            long j26 = (jArr[i47] & (~(255 << i48))) | (j25 << i48);
                            jArr[i47] = j26;
                            jArr[(((iC3 - 7) & i42) + (i42 & 7)) >> 3] = j26;
                            iArr4[iC3] = i44;
                        } else {
                            jArr = jArr5;
                        }
                        i43++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iC = c(i14);
                }
                this.f12514d++;
                int i49 = this.f12515e;
                long[] jArr6 = this.f12511a;
                int i50 = iC >> 3;
                long j27 = jArr6[i50];
                int i51 = (iC & 7) << 3;
                this.f12515e = i49 - (((j27 >> i51) & j10) == j11 ? 1 : 0);
                int i52 = this.f12513c;
                long j28 = (j27 & (~(j10 << i51))) | (j5 << i51);
                jArr6[i50] = j28;
                jArr6[(((iC - 7) & i52) + (i52 & 7)) >> 3] = j28;
                iNumberOfTrailingZeros = iC;
                break;
            }
            i18 = i21 + 8;
            i17 = (i17 + i18) & i16;
            i15 = i22;
        }
        this.f12512b[iNumberOfTrailingZeros] = i7;
        return this.f12514d != i11;
    }

    public final boolean b(int i7) {
        int iNumberOfTrailingZeros;
        int i10 = (-862048943) * i7;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f12513c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f12511a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j5 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f12512b[iNumberOfTrailingZeros] == i7) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i7) {
        int i10 = this.f12513c;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12511a;
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

    public final void d(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12513c = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12511a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12515e = o0.a(this.f12513c) - this.f12514d;
        this.f12512b = new int[iMax];
    }

    public final boolean e(int i7) {
        int iNumberOfTrailingZeros;
        int i10 = (-862048943) * i7;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f12513c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f12511a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j5 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f12512b[iNumberOfTrailingZeros] == i7) {
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
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            f(iNumberOfTrailingZeros);
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f12514d != this.f12514d) {
            return false;
        }
        int[] iArr = this.f12512b;
        long[] jArr = this.f12511a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128 && !xVar.b(iArr[(i7 << 3) + i11])) {
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
        this.f12514d--;
        long[] jArr = this.f12511a;
        int i10 = this.f12513c;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j5 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j5;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j5;
    }

    public final int hashCode() {
        int[] iArr = this.f12512b;
        long[] jArr = this.f12511a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i7 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j5) < 128) {
                        i10 += iArr[(i7 << 3) + i12];
                    }
                    j5 >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i7 == length) {
                return i10;
            }
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f12512b;
        long[] jArr = this.f12511a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "]");
            break;
        }
        int i7 = 0;
        int i10 = 0;
        loop0: while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i7 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j5) < 128) {
                        int i13 = iArr[(i7 << 3) + i12];
                        if (i10 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i10 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(i13);
                        i10++;
                    }
                    j5 >>= 8;
                }
                if (i11 == 8) {
                    if (i7 == length) {
                        i7++;
                    }
                }
                sb2.append((CharSequence) "]");
                break;
            }
            if (i7 == length) {
                sb2.append((CharSequence) "]");
                break;
            }
            i7++;
        }
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
