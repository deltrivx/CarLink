package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f12504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12507f;

    public /* synthetic */ u() {
        this(6);
    }

    public u(int i7) {
        this.f12502a = o0.f12476a;
        int[] iArr = m.f12470a;
        this.f12503b = iArr;
        this.f12504c = iArr;
        if (i7 >= 0) {
            e(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12506e = 0;
        long[] jArr = this.f12502a;
        if (jArr != o0.f12476a) {
            u8.l.u0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12502a;
            int i7 = this.f12505d;
            int i10 = i7 >> 3;
            long j5 = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j5)) | j5;
        }
        this.f12507f = o0.a(this.f12505d) - this.f12506e;
    }

    public final int b(int i7) {
        int i10 = this.f12505d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12502a;
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

    public final int c(int i7) {
        int i10 = (-862048943) * i7;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f12505d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f12502a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j5 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f12503b[iNumberOfTrailingZeros] == i7) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int d(int i7) {
        int iC = c(i7);
        if (iC >= 0) {
            return this.f12504c[iC];
        }
        return -1;
    }

    public final void e(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12505d = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12502a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12507f = o0.a(this.f12505d) - this.f12506e;
        this.f12503b = new int[iMax];
        this.f12504c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f12506e != this.f12506e) {
            return false;
        }
        int[] iArr = this.f12503b;
        int[] iArr2 = this.f12504c;
        long[] jArr = this.f12502a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        loop0: while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        int i12 = (i7 << 3) + i11;
                        int i13 = iArr[i12];
                        int i14 = iArr2[i12];
                        int iC = uVar.c(i13);
                        if (iC < 0 || i14 != uVar.f12504c[iC]) {
                            break loop0;
                        }
                    }
                    j5 >>= 8;
                }
                z10 = true;
                if (i10 != 8) {
                    return true;
                }
            } else {
                z10 = true;
            }
            if (i7 == length) {
                return z10;
            }
            i7++;
        }
        return false;
    }

    public final void f(int i7, int i10) {
        long j5;
        long j10;
        int i11;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i12 = i7;
        int i13 = i12 * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f12505d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f12502a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = i19;
            long j11 = (((-i21) >> 63) & (jArr2[i20 + 1] << (64 - i21))) | (jArr2[i20] >>> i21);
            long j12 = i16;
            int i23 = i16;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = -9187201950435737472L;
            long j15 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j15) >> 3)) & i17;
                long j16 = j14;
                if (this.f12503b[iNumberOfTrailingZeros] == i12) {
                    i11 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j15 &= j15 - 1;
                    j14 = j16;
                }
            }
            long j17 = j14;
            if ((((~j11) << 6) & j11 & j17) != 0) {
                int iB = b(i15);
                long j18 = 255;
                if (this.f12507f != 0 || ((this.f12502a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j10 = 128;
                } else {
                    int i24 = this.f12505d;
                    if (i24 > 8) {
                        j10 = 128;
                        if (Long.compare((((long) this.f12506e) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f12502a;
                            int i25 = this.f12505d;
                            int[] iArr3 = this.f12503b;
                            int[] iArr4 = this.f12504c;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            while (i27 < i26) {
                                long j19 = j18;
                                long j20 = jArr3[i27] & j17;
                                jArr3[i27] = (-72340172838076674L) & ((~j20) + (j20 >>> 7));
                                i27++;
                                j18 = j19;
                            }
                            j5 = j18;
                            int iZ0 = u8.l.z0(jArr3);
                            int i28 = iZ0 - 1;
                            long j21 = 72057594037927935L;
                            jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ0] = jArr3[0];
                            int i29 = 0;
                            while (i29 != i25) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j22 = (jArr3[i30] >> i31) & j5;
                                if (j22 != 128 && j22 == 254) {
                                    int i32 = iArr3[i29] * (-862048943);
                                    int i33 = i32 ^ (i32 << 16);
                                    int i34 = i33 >>> 7;
                                    int iB2 = b(i34);
                                    int i35 = i34 & i25;
                                    long j23 = j21;
                                    if (((iB2 - i35) & i25) / 8 == ((i29 - i35) & i25) / 8) {
                                        iArr = iArr3;
                                        iArr2 = iArr4;
                                        jArr3[i30] = ((~(j5 << i31)) & jArr3[i30]) | (((long) (i33 & 127)) << i31);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j23) | Long.MIN_VALUE;
                                    } else {
                                        iArr = iArr3;
                                        iArr2 = iArr4;
                                        int i36 = iB2 >> 3;
                                        long j24 = jArr3[i36];
                                        int i37 = (iB2 & 7) << 3;
                                        if (((j24 >> i37) & j5) == 128) {
                                            jArr3[i36] = ((~(j5 << i37)) & j24) | (((long) (i33 & 127)) << i37);
                                            jArr3[i30] = (jArr3[i30] & (~(j5 << i31))) | (128 << i31);
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = 0;
                                            iArr2[iB2] = iArr2[i29];
                                            iArr2[i29] = 0;
                                        } else {
                                            jArr3[i36] = ((~(j5 << i37)) & j24) | (((long) (i33 & 127)) << i37);
                                            int i38 = iArr[iB2];
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = i38;
                                            int i39 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i29];
                                            iArr2[i29] = i39;
                                            i29--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j23) | Long.MIN_VALUE;
                                    }
                                    i29++;
                                    iArr3 = iArr;
                                    j21 = j23;
                                    iArr4 = iArr2;
                                } else {
                                    i29++;
                                }
                            }
                            this.f12507f = o0.a(this.f12505d) - this.f12506e;
                        }
                        iB = b(i15);
                    } else {
                        j10 = 128;
                    }
                    j5 = 255;
                    int iB3 = o0.b(this.f12505d);
                    long[] jArr4 = this.f12502a;
                    int[] iArr5 = this.f12503b;
                    int[] iArr6 = this.f12504c;
                    int i40 = this.f12505d;
                    e(iB3);
                    long[] jArr5 = this.f12502a;
                    int[] iArr7 = this.f12503b;
                    int[] iArr8 = this.f12504c;
                    int i41 = this.f12505d;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr4[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < j10) {
                            int i43 = iArr5[i42];
                            int i44 = i43 * (-862048943);
                            int i45 = i44 ^ (i44 << 16);
                            int iB4 = b(i45 >>> 7);
                            int i46 = i45 & 127;
                            jArr = jArr5;
                            int i47 = iB4 >> 3;
                            int i48 = (iB4 & 7) << 3;
                            long j25 = (jArr[i47] & (~(255 << i48))) | (((long) i46) << i48);
                            jArr[i47] = j25;
                            jArr[(((iB4 - 7) & i41) + (i41 & 7)) >> 3] = j25;
                            iArr7[iB4] = i43;
                            iArr8[iB4] = iArr6[i42];
                        } else {
                            jArr = jArr5;
                        }
                        i42++;
                        jArr5 = jArr;
                    }
                    iB = b(i15);
                }
                this.f12506e++;
                int i49 = this.f12507f;
                long[] jArr6 = this.f12502a;
                int i50 = iB >> 3;
                long j26 = jArr6[i50];
                int i51 = (iB & 7) << 3;
                this.f12507f = i49 - (((j26 >> i51) & j5) == j10 ? 1 : 0);
                int i52 = this.f12505d;
                long j27 = (j26 & (~(j5 << i51))) | (j12 << i51);
                jArr6[i50] = j27;
                jArr6[(((iB - 7) & i52) + (i52 & 7)) >> 3] = j27;
                i11 = ~iB;
                break;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
            i12 = i7;
            i16 = i23;
        }
        if (i11 < 0) {
            i11 = ~i11;
        }
        this.f12503b[i11] = i7;
        this.f12504c[i11] = i10;
    }

    public final int hashCode() {
        int[] iArr = this.f12503b;
        int[] iArr2 = this.f12504c;
        long[] jArr = this.f12502a;
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
                        int i13 = (i7 << 3) + i12;
                        i10 += iArr2[i13] ^ iArr[i13];
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f12506e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f12503b;
        int[] iArr2 = this.f12504c;
        long[] jArr = this.f12502a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i7 != length) {
                        break;
                        break;
                    }
                    i7++;
                } else {
                    int i11 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j5) < 128) {
                            int i13 = (i7 << 3) + i12;
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            sb2.append(i15);
                            i10++;
                            if (i10 < this.f12506e) {
                                sb2.append(", ");
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i7 != length) {
                        break;
                    }
                    i7++;
                }
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
