package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f12381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f12382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12385f;

    public /* synthetic */ a0() {
        this(6);
    }

    public a0(int i7) {
        this.f12380a = o0.f12476a;
        this.f12381b = p.f12477a;
        this.f12382c = t.a.f12721c;
        if (i7 >= 0) {
            f(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12384e = 0;
        long[] jArr = this.f12380a;
        if (jArr != o0.f12476a) {
            u8.l.u0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12380a;
            int i7 = this.f12383d;
            int i10 = i7 >> 3;
            long j5 = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j5)) | j5;
        }
        u8.l.t0(0, this.f12383d, null, this.f12382c);
        this.f12385f = o0.a(this.f12383d) - this.f12384e;
    }

    public final boolean b(long j5) {
        int iNumberOfTrailingZeros;
        int i7 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i10 = (i7 << 16) ^ i7;
        int i11 = i10 & 127;
        int i12 = this.f12383d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12380a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12381b[iNumberOfTrailingZeros] == j5) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(long j5) {
        long j10;
        long j11;
        int i7;
        long[] jArr;
        int i10;
        int i11 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f12383d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f12380a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            char c10 = ' ';
            long j12 = (((-i19) >> 63) & (jArr2[i18 + 1] << (64 - i19))) | (jArr2[i18] >>> i19);
            long j13 = i14;
            int i20 = i17;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j16) >> 3)) & i15;
                long j17 = j15;
                if (this.f12381b[iNumberOfTrailingZeros] == j5) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                j15 = j17;
            }
            long j18 = j15;
            if ((j12 & ((~j12) << 6) & j18) != 0) {
                int iD = d(i13);
                long j19 = 255;
                if (this.f12385f != 0 || ((this.f12380a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = 128;
                    i7 = 0;
                } else {
                    int i21 = this.f12383d;
                    if (i21 > 8) {
                        j11 = 128;
                        if (Long.compare((((long) this.f12384e) * 32) ^ Long.MIN_VALUE, (((long) i21) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f12380a;
                            int i22 = this.f12383d;
                            long[] jArr4 = this.f12381b;
                            Object[] objArr = this.f12382c;
                            int i23 = 0;
                            for (int i24 = (i22 + 7) >> 3; i23 < i24; i24 = i24) {
                                long j20 = jArr3[i23] & j18;
                                jArr3[i23] = (-72340172838076674L) & ((~j20) + (j20 >>> 7));
                                i23++;
                                j19 = j19;
                            }
                            j10 = j19;
                            int iZ0 = u8.l.z0(jArr3);
                            int i25 = iZ0 - 1;
                            jArr3[i25] = (jArr3[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ0] = jArr3[0];
                            int i26 = 0;
                            while (i26 != i22) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j21 = (jArr3[i27] >> i28) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    long j22 = jArr4[i26];
                                    int i29 = ((int) (j22 ^ (j22 >>> c10))) * (-862048943);
                                    int i30 = (i29 << 16) ^ i29;
                                    int i31 = i30 >>> 7;
                                    int iD2 = d(i31);
                                    int i32 = i31 & i22;
                                    if (((iD2 - i32) & i22) / 8 == ((i26 - i32) & i22) / 8) {
                                        jArr3[i27] = (((long) (i30 & 127)) << i28) | (jArr3[i27] & (~(j10 << i28)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                    } else {
                                        int i33 = iD2 >> 3;
                                        long j23 = jArr3[i33];
                                        int i34 = (iD2 & 7) << 3;
                                        if (((j23 >> i34) & j10) == 128) {
                                            int i35 = i26;
                                            jArr3[i33] = (j23 & (~(j10 << i34))) | (((long) (i30 & 127)) << i34);
                                            jArr3[i27] = (jArr3[i27] & (~(j10 << i28))) | (128 << i28);
                                            jArr4[iD2] = jArr4[i35];
                                            jArr4[i35] = 0;
                                            objArr[iD2] = objArr[i35];
                                            objArr[i35] = null;
                                            i10 = i35;
                                        } else {
                                            int i36 = i26;
                                            jArr3[i33] = (((long) (i30 & 127)) << i34) | (j23 & (~(j10 << i34)));
                                            long j24 = jArr4[iD2];
                                            jArr4[iD2] = jArr4[i36];
                                            jArr4[i36] = j24;
                                            Object obj = objArr[iD2];
                                            objArr[iD2] = objArr[i36];
                                            objArr[i36] = obj;
                                            i10 = i36 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26 = i10 + 1;
                                        i22 = i22;
                                    }
                                    c10 = ' ';
                                } else {
                                    i26++;
                                }
                            }
                            i7 = 0;
                            this.f12385f = o0.a(this.f12383d) - this.f12384e;
                        }
                        iD = d(i13);
                    } else {
                        j11 = 128;
                    }
                    j10 = 255;
                    i7 = 0;
                    int iB = o0.b(this.f12383d);
                    long[] jArr5 = this.f12380a;
                    long[] jArr6 = this.f12381b;
                    Object[] objArr2 = this.f12382c;
                    int i37 = this.f12383d;
                    f(iB);
                    long[] jArr7 = this.f12380a;
                    long[] jArr8 = this.f12381b;
                    Object[] objArr3 = this.f12382c;
                    int i38 = this.f12383d;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j11) {
                            long j25 = jArr6[i39];
                            jArr = jArr7;
                            int i40 = ((int) (j25 ^ (j25 >>> 32))) * (-862048943);
                            int i41 = (i40 << 16) ^ i40;
                            int iD3 = d(i41 >>> 7);
                            int i42 = iD3 >> 3;
                            int i43 = (iD3 & 7) << 3;
                            long j26 = (jArr[i42] & (~(255 << i43))) | (((long) (i41 & 127)) << i43);
                            jArr[i42] = j26;
                            jArr[(((iD3 - 7) & i38) + (i38 & 7)) >> 3] = j26;
                            jArr8[iD3] = j25;
                            objArr3[iD3] = objArr2[i39];
                        } else {
                            jArr = jArr7;
                        }
                        i39++;
                        jArr5 = jArr5;
                        jArr7 = jArr;
                    }
                    iD = d(i13);
                }
                this.f12384e++;
                int i44 = this.f12385f;
                long[] jArr9 = this.f12380a;
                int i45 = iD >> 3;
                long j27 = jArr9[i45];
                int i46 = (iD & 7) << 3;
                if (((j27 >> i46) & j10) == j11) {
                    i7 = 1;
                }
                this.f12385f = i44 - i7;
                int i47 = this.f12383d;
                long j28 = (j27 & (~(j10 << i46))) | (j13 << i46);
                jArr9[i45] = j28;
                jArr9[(((iD - 7) & i47) + (i47 & 7)) >> 3] = j28;
                return iD;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    public final int d(int i7) {
        int i10 = this.f12383d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12380a;
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

    public final Object e(long j5) {
        int iNumberOfTrailingZeros;
        int i7 = ((int) ((j5 >>> 32) ^ j5)) * (-862048943);
        int i10 = (i7 << 16) ^ i7;
        int i11 = i10 & 127;
        int i12 = this.f12383d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12380a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12381b[iNumberOfTrailingZeros] == j5) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f12382c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        boolean z10;
        long[] jArr2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.f12384e != this.f12384e) {
            return false;
        }
        long[] jArr3 = this.f12381b;
        Object[] objArr = this.f12382c;
        long[] jArr4 = this.f12380a;
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
                        Object obj2 = objArr[i12];
                        if (obj2 == null) {
                            if (a0Var.e(j10) != null || !a0Var.b(j10)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(a0Var.e(j10))) {
                            return false;
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

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12383d = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12380a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12385f = o0.a(this.f12383d) - this.f12384e;
        this.f12381b = new long[iMax];
        this.f12382c = new Object[iMax];
    }

    public final Object g(long j5) {
        int iNumberOfTrailingZeros;
        int i7 = ((int) ((j5 >>> 32) ^ j5)) * (-862048943);
        int i10 = (i7 << 16) ^ i7;
        int i11 = i10 & 127;
        int i12 = this.f12383d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12380a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12381b[iNumberOfTrailingZeros] == j5) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f12384e--;
        long[] jArr2 = this.f12380a;
        int i17 = this.f12383d;
        int i18 = iNumberOfTrailingZeros >> 3;
        int i19 = (iNumberOfTrailingZeros & 7) << 3;
        long j13 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j13;
        jArr2[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j13;
        Object[] objArr = this.f12382c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void h(long j5, Object obj) {
        int iC = c(j5);
        this.f12381b[iC] = j5;
        this.f12382c[iC] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f12381b;
        Object[] objArr = this.f12382c;
        long[] jArr2 = this.f12380a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int iHashCode = 0;
        while (true) {
            long j5 = jArr2[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        int i12 = (i7 << 3) + i11;
                        long j10 = jArr[i12];
                        Object obj = objArr[i12];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j10 ^ (j10 >>> 32)));
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i7 == length) {
                return iHashCode;
            }
            i7++;
        }
    }

    public final String toString() {
        int i7;
        int i10;
        if (this.f12384e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f12381b;
        Object[] objArr = this.f12382c;
        long[] jArr2 = this.f12380a;
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
                            Object obj = objArr[i15];
                            sb2.append(j10);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i12++;
                            if (i12 < this.f12384e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j5 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i7 = i16;
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
