package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12516a = o0.f12476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f12517b = p.f12477a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f12518c = m.f12470a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12521f;

    public y(int i7) {
        if (i7 >= 0) {
            d(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i7) {
        int i10 = this.f12519d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12516a;
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

    public final int b(long j5) {
        int i7 = ((int) ((j5 >>> 32) ^ j5)) * (-862048943);
        int i10 = (i7 << 16) ^ i7;
        int i11 = i10 & 127;
        int i12 = this.f12519d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f12516a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12517b[iNumberOfTrailingZeros] == j5) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int c(long j5) {
        int iB = b(j5);
        if (iB >= 0) {
            return this.f12518c[iB];
        }
        t.a.e("Cannot find value for key " + j5);
        throw null;
    }

    public final void d(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12519d = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12516a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12521f = o0.a(this.f12519d) - this.f12520e;
        this.f12517b = new long[iMax];
        this.f12518c = new int[iMax];
    }

    public final void e(int i7, long j5) {
        long j10;
        long j11;
        int i10;
        int i11;
        long[] jArr;
        int i12;
        int i13 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f12519d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f12516a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            char c10 = ' ';
            long j12 = (((-i21) >> 63) & (jArr2[i20 + 1] << (64 - i21))) | (jArr2[i20] >>> i21);
            long j13 = i16;
            int i22 = i19;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j16) >> 3)) & i17;
                long j17 = j15;
                if (this.f12517b[iNumberOfTrailingZeros] == j5) {
                    i11 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j16 &= j16 - 1;
                    j15 = j17;
                }
            }
            long j18 = j15;
            if ((j12 & ((~j12) << 6) & j18) != 0) {
                int iA = a(i15);
                long j19 = 255;
                if (this.f12521f != 0 || ((this.f12516a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = 128;
                    i10 = 0;
                } else {
                    int i23 = this.f12519d;
                    if (i23 > 8) {
                        j11 = 128;
                        if (Long.compare((((long) this.f12520e) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f12516a;
                            int i24 = this.f12519d;
                            long[] jArr4 = this.f12517b;
                            int[] iArr = this.f12518c;
                            int i25 = 0;
                            for (int i26 = (i24 + 7) >> 3; i25 < i26; i26 = i26) {
                                long j20 = jArr3[i25] & j18;
                                jArr3[i25] = (-72340172838076674L) & ((~j20) + (j20 >>> 7));
                                i25++;
                                j19 = j19;
                            }
                            j10 = j19;
                            int iZ0 = u8.l.z0(jArr3);
                            int i27 = iZ0 - 1;
                            jArr3[i27] = (jArr3[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ0] = jArr3[0];
                            int i28 = 0;
                            while (i28 != i24) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j21 = (jArr3[i29] >> i30) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    long j22 = jArr4[i28];
                                    int i31 = ((int) (j22 ^ (j22 >>> c10))) * (-862048943);
                                    int i32 = (i31 << 16) ^ i31;
                                    int i33 = i32 >>> 7;
                                    int iA2 = a(i33);
                                    int i34 = i33 & i24;
                                    if (((iA2 - i34) & i24) / 8 == ((i28 - i34) & i24) / 8) {
                                        jArr3[i29] = (((long) (i32 & 127)) << i30) | (jArr3[i29] & (~(j10 << i30)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                    } else {
                                        int i35 = iA2 >> 3;
                                        long j23 = jArr3[i35];
                                        int i36 = (iA2 & 7) << 3;
                                        if (((j23 >> i36) & j10) == 128) {
                                            int i37 = i28;
                                            jArr3[i35] = (j23 & (~(j10 << i36))) | (((long) (i32 & 127)) << i36);
                                            jArr3[i29] = (jArr3[i29] & (~(j10 << i30))) | (128 << i30);
                                            jArr4[iA2] = jArr4[i37];
                                            jArr4[i37] = 0;
                                            iArr[iA2] = iArr[i37];
                                            iArr[i37] = 0;
                                            i12 = i37;
                                        } else {
                                            int i38 = i28;
                                            jArr3[i35] = (((long) (i32 & 127)) << i36) | (j23 & (~(j10 << i36)));
                                            long j24 = jArr4[iA2];
                                            jArr4[iA2] = jArr4[i38];
                                            jArr4[i38] = j24;
                                            int i39 = iArr[iA2];
                                            iArr[iA2] = iArr[i38];
                                            iArr[i38] = i39;
                                            i12 = i38 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28 = i12 + 1;
                                        i24 = i24;
                                    }
                                    c10 = ' ';
                                } else {
                                    i28++;
                                }
                            }
                            i10 = 0;
                            this.f12521f = o0.a(this.f12519d) - this.f12520e;
                        }
                        iA = a(i15);
                    } else {
                        j11 = 128;
                    }
                    j10 = 255;
                    i10 = 0;
                    int iB = o0.b(this.f12519d);
                    long[] jArr5 = this.f12516a;
                    long[] jArr6 = this.f12517b;
                    int[] iArr2 = this.f12518c;
                    int i40 = this.f12519d;
                    d(iB);
                    long[] jArr7 = this.f12516a;
                    long[] jArr8 = this.f12517b;
                    int[] iArr3 = this.f12518c;
                    int i41 = this.f12519d;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr5[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < j11) {
                            long j25 = jArr6[i42];
                            jArr = jArr7;
                            int i43 = ((int) (j25 ^ (j25 >>> 32))) * (-862048943);
                            int i44 = (i43 << 16) ^ i43;
                            int iA3 = a(i44 >>> 7);
                            int i45 = iA3 >> 3;
                            int i46 = (iA3 & 7) << 3;
                            long j26 = (jArr[i45] & (~(255 << i46))) | (((long) (i44 & 127)) << i46);
                            jArr[i45] = j26;
                            jArr[(((iA3 - 7) & i41) + (i41 & 7)) >> 3] = j26;
                            jArr8[iA3] = j25;
                            iArr3[iA3] = iArr2[i42];
                        } else {
                            jArr = jArr7;
                        }
                        i42++;
                        jArr5 = jArr5;
                        jArr7 = jArr;
                    }
                    iA = a(i15);
                }
                this.f12520e++;
                int i47 = this.f12521f;
                long[] jArr9 = this.f12516a;
                int i48 = iA >> 3;
                long j27 = jArr9[i48];
                int i49 = (iA & 7) << 3;
                if (((j27 >> i49) & j10) == j11) {
                    i10 = 1;
                }
                this.f12521f = i47 - i10;
                int i50 = this.f12519d;
                long j28 = (j27 & (~(j10 << i49))) | (j13 << i49);
                jArr9[i48] = j28;
                jArr9[(((iA - 7) & i50) + (i50 & 7)) >> 3] = j28;
                i11 = ~iA;
                break;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
        }
        if (i11 < 0) {
            i11 = ~i11;
        }
        this.f12517b[i11] = j5;
        this.f12518c[i11] = i7;
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        boolean z10;
        long[] jArr2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f12520e != this.f12520e) {
            return false;
        }
        long[] jArr3 = this.f12517b;
        int[] iArr = this.f12518c;
        long[] jArr4 = this.f12516a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        loop0: while (true) {
            long j5 = jArr4[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j5) < 128) {
                        int i12 = (i7 << 3) + i11;
                        jArr2 = jArr3;
                        long j10 = jArr2[i12];
                        int i13 = iArr[i12];
                        int iB = yVar.b(j10);
                        if (iB < 0 || i13 != yVar.f12518c[iB]) {
                            break loop0;
                        }
                    } else {
                        jArr2 = jArr3;
                    }
                    j5 >>= 8;
                    i11++;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                z10 = true;
                if (i10 != 8) {
                    return true;
                }
            } else {
                jArr = jArr3;
                z10 = true;
            }
            if (i7 == length) {
                return z10;
            }
            i7++;
            jArr3 = jArr;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f12517b;
        int[] iArr = this.f12518c;
        long[] jArr2 = this.f12516a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            long j5 = jArr2[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i7 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j5) < 128) {
                        int i13 = (i7 << 3) + i12;
                        long j10 = jArr[i13];
                        i10 += iArr[i13] ^ ((int) (j10 ^ (j10 >>> 32)));
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

    public final String toString() {
        int i7;
        int i10;
        if (this.f12520e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f12517b;
        int[] iArr = this.f12518c;
        long[] jArr2 = this.f12516a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j5 = jArr2[i11];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j5) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j10 = jArr[i15];
                            int i16 = iArr[i15];
                            sb2.append(j10);
                            sb2.append("=");
                            sb2.append(i16);
                            i12++;
                            if (i12 < this.f12520e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j5 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i17 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i7 = i17;
                } else {
                    i7 = i11;
                }
                if (i7 == length) {
                    break;
                }
                i11 = i7 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
