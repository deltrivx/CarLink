package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f12439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12442f;

    public /* synthetic */ h0() {
        this(6);
    }

    public h0(int i7) {
        this.f12437a = o0.f12476a;
        Object[] objArr = t.a.f12721c;
        this.f12438b = objArr;
        this.f12439c = objArr;
        if (i7 >= 0) {
            h(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12441e = 0;
        long[] jArr = this.f12437a;
        if (jArr != o0.f12476a) {
            u8.l.u0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12437a;
            int i7 = this.f12440d;
            int i10 = i7 >> 3;
            long j5 = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j5)) | j5;
        }
        u8.l.t0(0, this.f12440d, null, this.f12439c);
        u8.l.t0(0, this.f12440d, null, this.f12438b);
        this.f12442f = o0.a(this.f12440d) - this.f12441e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 & 127;
        int i11 = this.f12440d;
        int i12 = (i7 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f12437a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j5 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (i9.l.a(this.f12438b[iNumberOfTrailingZeros], obj)) {
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

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 & 127;
        int i11 = this.f12440d;
        int i12 = (i7 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f12437a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j5 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (i9.l.a(this.f12438b[iNumberOfTrailingZeros], obj)) {
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

    public final boolean d(Object obj) {
        Object[] objArr = this.f12439c;
        long[] jArr = this.f12437a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128 && i9.l.a(obj, objArr[(i7 << 3) + i11])) {
                            return true;
                        }
                        j5 >>= 8;
                    }
                    if (i10 == 8) {
                    }
                }
                if (i7 != length) {
                    i7++;
                }
            }
        }
        return false;
    }

    public final int e(int i7) {
        int i10 = this.f12440d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12437a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (h0Var.f12441e != this.f12441e) {
            return false;
        }
        Object[] objArr = this.f12438b;
        Object[] objArr2 = this.f12439c;
        long[] jArr = this.f12437a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i7 != length) {
                        break;
                        break;
                    }
                    i7++;
                } else {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            int i12 = (i7 << 3) + i11;
                            Object obj2 = objArr[i12];
                            Object obj3 = objArr2[i12];
                            if (obj3 == null) {
                                if (h0Var.g(obj2) != null || !h0Var.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(h0Var.g(obj2))) {
                                return false;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i7 != length) {
                        break;
                    }
                    i7++;
                }
            }
        }
        return true;
    }

    public final int f(Object obj) {
        long j5;
        long j10;
        long j11;
        long[] jArr;
        Object[] objArr;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 >>> 7;
        int i11 = i7 & 127;
        int i12 = this.f12440d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr2 = this.f12437a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j12 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
            long j13 = i11;
            int i17 = i11;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j15) >> 3)) & i12;
                if (i9.l.a(this.f12438b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i10);
                long j16 = 255;
                if (this.f12442f != 0 || ((this.f12437a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i18 = this.f12440d;
                    if (i18 <= 8 || Long.compare((((long) this.f12441e) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) > 0) {
                        j5 = 255;
                        j10 = j13;
                        j11 = 128;
                        int iB = o0.b(this.f12440d);
                        long[] jArr3 = this.f12437a;
                        Object[] objArr2 = this.f12438b;
                        Object[] objArr3 = this.f12439c;
                        int i19 = this.f12440d;
                        h(iB);
                        long[] jArr4 = this.f12437a;
                        Object[] objArr4 = this.f12438b;
                        Object[] objArr5 = this.f12439c;
                        int i20 = this.f12440d;
                        int i21 = 0;
                        while (i21 < i19) {
                            if (((jArr3[i21 >> 3] >> ((i21 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i21];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i22 >>> 7);
                                jArr = jArr4;
                                long j17 = i22 & 127;
                                int i23 = iE2 >> 3;
                                int i24 = (iE2 & 7) << 3;
                                long j18 = (jArr[i23] & (~(255 << i24))) | (j17 << i24);
                                jArr[i23] = j18;
                                jArr[(((iE2 - 7) & i20) + (i20 & 7)) >> 3] = j18;
                                objArr4[iE2] = obj2;
                                objArr5[iE2] = objArr3[i21];
                            } else {
                                jArr = jArr4;
                            }
                            i21++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f12437a;
                        int i25 = this.f12440d;
                        Object[] objArr6 = this.f12438b;
                        Object[] objArr7 = this.f12439c;
                        j11 = 128;
                        int i26 = (i25 + 7) >> 3;
                        int i27 = 0;
                        while (i27 < i26) {
                            long j19 = j16;
                            long j20 = jArr5[i27] & (-9187201950435737472L);
                            jArr5[i27] = (-72340172838076674L) & ((~j20) + (j20 >>> 7));
                            i27++;
                            j13 = j13;
                            j16 = j19;
                        }
                        j5 = j16;
                        j10 = j13;
                        int i28 = 8;
                        int iZ0 = u8.l.z0(jArr5);
                        int i29 = iZ0 - 1;
                        jArr5[i29] = (jArr5[i29] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iZ0] = jArr5[0];
                        int i30 = 0;
                        while (i30 != i25) {
                            int i31 = i30 >> 3;
                            int i32 = (i30 & 7) << 3;
                            long j21 = (jArr5[i31] >> i32) & j5;
                            if (j21 != 128 && j21 == 254) {
                                Object obj3 = objArr6[i30];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                                int i33 = iHashCode3 ^ (iHashCode3 << 16);
                                int i34 = i33 >>> 7;
                                int iE3 = e(i34);
                                int i35 = i34 & i25;
                                if (((iE3 - i35) & i25) / i28 == ((i30 - i35) & i25) / i28) {
                                    jArr5[i31] = (((long) (i33 & 127)) << i32) | (jArr5[i31] & (~(j5 << i32)));
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i30++;
                                } else {
                                    int i36 = iE3 >> 3;
                                    long j22 = jArr5[i36];
                                    int i37 = (iE3 & 7) << 3;
                                    if (((j22 >> i37) & j5) == 128) {
                                        objArr = objArr6;
                                        jArr5[i36] = ((~(j5 << i37)) & j22) | (((long) (i33 & 127)) << i37);
                                        jArr5[i31] = (jArr5[i31] & (~(j5 << i32))) | (128 << i32);
                                        objArr[iE3] = objArr[i30];
                                        objArr[i30] = null;
                                        objArr7[iE3] = objArr7[i30];
                                        objArr7[i30] = null;
                                    } else {
                                        objArr = objArr6;
                                        jArr5[i36] = (((long) (i33 & 127)) << i37) | ((~(j5 << i37)) & j22);
                                        Object obj4 = objArr[iE3];
                                        objArr[iE3] = objArr[i30];
                                        objArr[i30] = obj4;
                                        Object obj5 = objArr7[iE3];
                                        objArr7[iE3] = objArr7[i30];
                                        objArr7[i30] = obj5;
                                        i30--;
                                    }
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i30++;
                                    i25 = i25;
                                    objArr6 = objArr;
                                }
                                i28 = 8;
                            } else {
                                i30++;
                            }
                        }
                        this.f12442f = o0.a(this.f12440d) - this.f12441e;
                    }
                    iE = e(i10);
                }
                this.f12441e++;
                int i38 = this.f12442f;
                long[] jArr6 = this.f12437a;
                int i39 = iE >> 3;
                long j23 = jArr6[i39];
                int i40 = (iE & 7) << 3;
                this.f12442f = i38 - (((j23 >> i40) & j5) == j11 ? 1 : 0);
                int i41 = this.f12440d;
                long j24 = (j23 & (~(j5 << i40))) | (j10 << i40);
                jArr6[i39] = j24;
                jArr6[(((iE - 7) & i41) + (i41 & 7)) >> 3] = j24;
                return ~iE;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
        }
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12440d;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f12437a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j5 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (i9.l.a(this.f12438b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i13 = i14 + i7;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f12439c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12440d = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
            int i10 = iMax >> 3;
            long j5 = 255 << ((iMax & 7) << 3);
            jArr[i10] = (jArr[i10] & (~j5)) | j5;
        }
        this.f12437a = jArr;
        this.f12442f = o0.a(this.f12440d) - this.f12441e;
        Object[] objArr = t.a.f12721c;
        this.f12438b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f12439c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f12438b;
        Object[] objArr2 = this.f12439c;
        long[] jArr = this.f12437a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int iHashCode = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        int i12 = (i7 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f12441e == 0;
    }

    public final boolean j() {
        return this.f12441e != 0;
    }

    public final Object k(Object obj) {
        int iNumberOfTrailingZeros;
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12440d;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f12437a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j5 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (i9.l.a(this.f12438b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i13 = i14 + i7;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return l(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object l(int i7) {
        this.f12441e--;
        long[] jArr = this.f12437a;
        int i10 = this.f12440d;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j5 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j5;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j5;
        this.f12438b[i7] = null;
        Object[] objArr = this.f12439c;
        Object obj = objArr[i7];
        objArr[i7] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.f12438b[iF] = obj;
        this.f12439c[iF] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
      0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f12438b;
        Object[] objArr2 = this.f12439c;
        long[] jArr = this.f12437a;
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
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i10++;
                            if (i10 < this.f12441e) {
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
