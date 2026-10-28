package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12448e;

    public /* synthetic */ i0() {
        this(6);
    }

    public i0(int i7) {
        this.f12444a = o0.f12476a;
        this.f12445b = t.a.f12721c;
        if (i7 >= 0) {
            f(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i7 = this.f12447d;
        this.f12445b[d(obj)] = obj;
        return this.f12447d != i7;
    }

    public final void b() {
        this.f12447d = 0;
        long[] jArr = this.f12444a;
        if (jArr != o0.f12476a) {
            u8.l.u0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12444a;
            int i7 = this.f12446c;
            int i10 = i7 >> 3;
            long j5 = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j5)) | j5;
        }
        u8.l.t0(0, this.f12446c, null, this.f12445b);
        this.f12448e = o0.a(this.f12446c) - this.f12447d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 & 127;
        int i11 = this.f12446c;
        int i12 = (i7 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f12444a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j5 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (i9.l.a(this.f12445b[iNumberOfTrailingZeros], obj)) {
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
        long[] jArr;
        Object[] objArr;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 >>> 7;
        int i11 = i7 & 127;
        int i12 = this.f12446c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr2 = this.f12444a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j12 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
            long j13 = i11;
            int i17 = i11;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j15) >> 3)) & i12;
                if (i9.l.a(this.f12445b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i10);
                long j16 = 255;
                if (this.f12448e != 0 || ((this.f12444a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i18 = this.f12446c;
                    if (i18 <= 8 || Long.compare((((long) this.f12447d) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) > 0) {
                        j5 = 255;
                        j10 = j13;
                        j11 = 128;
                        int iB = o0.b(this.f12446c);
                        long[] jArr3 = this.f12444a;
                        Object[] objArr2 = this.f12445b;
                        int i19 = this.f12446c;
                        f(iB);
                        long[] jArr4 = this.f12444a;
                        Object[] objArr3 = this.f12445b;
                        int i20 = this.f12446c;
                        int i21 = 0;
                        while (i21 < i19) {
                            if (((jArr3[i21 >> 3] >> ((i21 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i21];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i22 >>> 7);
                                long j17 = i22 & 127;
                                int i23 = iE2 >> 3;
                                int i24 = (iE2 & 7) << 3;
                                jArr = jArr4;
                                long j18 = (jArr4[i23] & (~(255 << i24))) | (j17 << i24);
                                jArr[i23] = j18;
                                jArr[(((iE2 - 7) & i20) + (i20 & 7)) >> 3] = j18;
                                objArr3[iE2] = obj2;
                            } else {
                                jArr = jArr4;
                            }
                            i21++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f12444a;
                        int i25 = this.f12446c;
                        Object[] objArr4 = this.f12445b;
                        int i26 = (i25 + 7) >> 3;
                        int i27 = 0;
                        j11 = 128;
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
                        long j21 = 72057594037927935L;
                        jArr5[i29] = (jArr5[i29] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iZ0] = jArr5[0];
                        int i30 = 0;
                        while (i30 != i25) {
                            int i31 = i30 >> 3;
                            int i32 = (i30 & 7) << 3;
                            long j22 = (jArr5[i31] >> i32) & j5;
                            if (j22 != 128 && j22 == 254) {
                                Object obj3 = objArr4[i30];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                                int i33 = iHashCode3 ^ (iHashCode3 << 16);
                                int i34 = i33 >>> 7;
                                int iE3 = e(i34);
                                int i35 = i34 & i25;
                                if (((iE3 - i35) & i25) / i28 == ((i30 - i35) & i25) / i28) {
                                    long j23 = j21;
                                    jArr5[i31] = (((long) (i33 & 127)) << i32) | ((~(j5 << i32)) & jArr5[i31]);
                                    jArr5[jArr5.length - 1] = (jArr5[0] & j23) | Long.MIN_VALUE;
                                    i30++;
                                    j21 = j23;
                                } else {
                                    long j24 = j21;
                                    int i36 = iE3 >> 3;
                                    long j25 = jArr5[i36];
                                    int i37 = (iE3 & 7) << 3;
                                    if (((j25 >> i37) & j5) == 128) {
                                        objArr = objArr4;
                                        jArr5[i36] = ((~(j5 << i37)) & j25) | (((long) (i33 & 127)) << i37);
                                        jArr5[i31] = (jArr5[i31] & (~(j5 << i32))) | (128 << i32);
                                        objArr[iE3] = objArr[i30];
                                        objArr[i30] = null;
                                    } else {
                                        objArr = objArr4;
                                        jArr5[i36] = (((long) (i33 & 127)) << i37) | ((~(j5 << i37)) & j25);
                                        Object obj4 = objArr[iE3];
                                        objArr[iE3] = objArr[i30];
                                        objArr[i30] = obj4;
                                        i30--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & j24) | Long.MIN_VALUE;
                                    i30++;
                                    j21 = j24;
                                    i25 = i25;
                                    objArr4 = objArr;
                                    i28 = 8;
                                }
                            } else {
                                i30++;
                            }
                        }
                        this.f12448e = o0.a(this.f12446c) - this.f12447d;
                    }
                    iE = e(i10);
                }
                this.f12447d++;
                int i38 = this.f12448e;
                long[] jArr6 = this.f12444a;
                int i39 = iE >> 3;
                long j26 = jArr6[i39];
                int i40 = (iE & 7) << 3;
                this.f12448e = i38 - (((j26 >> i40) & j5) == j11 ? 1 : 0);
                int i41 = this.f12446c;
                long j27 = (j26 & (~(j5 << i40))) | (j10 << i40);
                jArr6[i39] = j27;
                jArr6[(((iE - 7) & i41) + (i41 & 7)) >> 3] = j27;
                return iE;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
        }
    }

    public final int e(int i7) {
        int i10 = this.f12446c;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12444a;
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (i0Var.f12447d != this.f12447d) {
            return false;
        }
        Object[] objArr = this.f12445b;
        long[] jArr = this.f12444a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128 && !i0Var.c(objArr[(i7 << 3) + i11])) {
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
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12446c = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12444a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12448e = o0.a(this.f12446c) - this.f12447d;
        this.f12445b = iMax == 0 ? t.a.f12721c : new Object[iMax];
    }

    public final boolean g() {
        return this.f12447d == 0;
    }

    public final boolean h() {
        return this.f12447d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f12446c * 31) + this.f12447d;
        Object[] objArr = this.f12445b;
        long[] jArr = this.f12444a;
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

    public final void i(Object obj) {
        int iNumberOfTrailingZeros;
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12446c;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f12444a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j5 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (i9.l.a(this.f12445b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i7 += 8;
                i13 = i14 + i7;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(Object obj) {
        this.f12445b[d(obj)] = obj;
    }

    public final void k(i0 i0Var) {
        i9.l.e(i0Var, "elements");
        Object[] objArr = i0Var.f12445b;
        long[] jArr = i0Var.f12444a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        j(objArr[(i7 << 3) + i11]);
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final boolean l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 & 127;
        int i11 = this.f12446c;
        int i12 = (i7 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f12444a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j5 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (i9.l.a(this.f12445b[iNumberOfTrailingZeros], obj)) {
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
            m(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void m(int i7) {
        this.f12447d--;
        long[] jArr = this.f12444a;
        int i10 = this.f12446c;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j5 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j5;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j5;
        this.f12445b[i7] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[DONT_INVERT, PHI: r8
      0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002a, B:18:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[LOOP:0: B:5:0x001c->B:20:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[SYNTHETIC] */
    public final String toString() {
        b2.a aVar = new b2.a(16, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f12445b;
        long[] jArr = this.f12444a;
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
                        Object obj = objArr[(i7 << 3) + i12];
                        if (i10 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i10 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append((CharSequence) aVar.invoke(obj));
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
