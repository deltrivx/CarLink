package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f12399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12402f;

    public /* synthetic */ c0() {
        this(6);
    }

    public c0(int i7) {
        this.f12397a = o0.f12476a;
        this.f12398b = t.a.f12721c;
        this.f12399c = m.f12470a;
        if (i7 >= 0) {
            f(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12401e = 0;
        long[] jArr = this.f12397a;
        if (jArr != o0.f12476a) {
            u8.l.u0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f12397a;
            int i7 = this.f12400d;
            int i10 = i7 >> 3;
            long j5 = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j5)) | j5;
        }
        u8.l.t0(0, this.f12400d, null, this.f12398b);
        this.f12402f = o0.a(this.f12400d) - this.f12401e;
    }

    public final int b(int i7) {
        int i10 = this.f12400d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12397a;
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

    public final int c(Object obj) {
        long j5;
        long j10;
        long j11;
        long[] jArr;
        Object[] objArr;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i10 = i7 >>> 7;
        int i11 = i7 & 127;
        int i12 = this.f12400d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr2 = this.f12397a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j12 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
            long j13 = i11;
            int i17 = i11;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j15) >> 3)) & i12;
                if (i9.l.a(this.f12398b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iB = b(i10);
                long j16 = 255;
                if (this.f12402f != 0 || ((this.f12397a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i18 = this.f12400d;
                    if (i18 <= 8 || Long.compare((((long) this.f12401e) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) > 0) {
                        j5 = 255;
                        j10 = j13;
                        j11 = 128;
                        int iB2 = o0.b(this.f12400d);
                        long[] jArr3 = this.f12397a;
                        Object[] objArr2 = this.f12398b;
                        int[] iArr = this.f12399c;
                        int i19 = this.f12400d;
                        f(iB2);
                        long[] jArr4 = this.f12397a;
                        Object[] objArr3 = this.f12398b;
                        int[] iArr2 = this.f12399c;
                        int i20 = this.f12400d;
                        int i21 = 0;
                        while (i21 < i19) {
                            if (((jArr3[i21 >> 3] >> ((i21 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i21];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                int iB3 = b(i22 >>> 7);
                                jArr = jArr4;
                                long j17 = i22 & 127;
                                int i23 = iB3 >> 3;
                                int i24 = (iB3 & 7) << 3;
                                long j18 = (jArr[i23] & (~(255 << i24))) | (j17 << i24);
                                jArr[i23] = j18;
                                jArr[(((iB3 - 7) & i20) + (i20 & 7)) >> 3] = j18;
                                objArr3[iB3] = obj2;
                                iArr2[iB3] = iArr[i21];
                            } else {
                                jArr = jArr4;
                            }
                            i21++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f12397a;
                        int i25 = this.f12400d;
                        Object[] objArr4 = this.f12398b;
                        int[] iArr3 = this.f12399c;
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
                                int iB4 = b(i34);
                                int i35 = i34 & i25;
                                j21 = j21;
                                if (((iB4 - i35) & i25) / 8 == ((i30 - i35) & i25) / i28) {
                                    jArr5[i31] = (((long) (i33 & 127)) << i32) | (jArr5[i31] & (~(j5 << i32)));
                                    jArr5[jArr5.length - 1] = (jArr5[0] & j21) | Long.MIN_VALUE;
                                    i30++;
                                } else {
                                    int i36 = iB4 >> 3;
                                    long j23 = jArr5[i36];
                                    int i37 = (iB4 & 7) << 3;
                                    if (((j23 >> i37) & j5) == 128) {
                                        objArr = objArr4;
                                        jArr5[i36] = ((~(j5 << i37)) & j23) | (((long) (i33 & 127)) << i37);
                                        jArr5[i31] = (jArr5[i31] & (~(j5 << i32))) | (128 << i32);
                                        objArr[iB4] = objArr[i30];
                                        objArr[i30] = null;
                                        iArr3[iB4] = iArr3[i30];
                                        iArr3[i30] = 0;
                                    } else {
                                        objArr = objArr4;
                                        jArr5[i36] = (((long) (i33 & 127)) << i37) | ((~(j5 << i37)) & j23);
                                        Object obj4 = objArr[iB4];
                                        objArr[iB4] = objArr[i30];
                                        objArr[i30] = obj4;
                                        int i38 = iArr3[iB4];
                                        iArr3[iB4] = iArr3[i30];
                                        iArr3[i30] = i38;
                                        i30--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & j21) | Long.MIN_VALUE;
                                    i30++;
                                    i25 = i25;
                                    objArr4 = objArr;
                                }
                                i28 = 8;
                            } else {
                                i30++;
                            }
                        }
                        this.f12402f = o0.a(this.f12400d) - this.f12401e;
                    }
                    iB = b(i10);
                }
                this.f12401e++;
                int i39 = this.f12402f;
                long[] jArr6 = this.f12397a;
                int i40 = iB >> 3;
                long j24 = jArr6[i40];
                int i41 = (iB & 7) << 3;
                this.f12402f = i39 - (((j24 >> i41) & j5) == j11 ? 1 : 0);
                int i42 = this.f12400d;
                long j25 = (j24 & (~(j5 << i41))) | (j10 << i41);
                jArr6[i40] = j25;
                jArr6[(((iB - 7) & i42) + (i42 & 7)) >> 3] = j25;
                return ~iB;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
        }
    }

    public final int d(Object obj) {
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f12400d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f12397a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j5 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j5;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (i9.l.a(this.f12398b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i13 = i14 + i7;
        }
    }

    public final int e(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f12399c[iD];
        }
        t.a.e("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f12401e != this.f12401e) {
            return false;
        }
        Object[] objArr = this.f12398b;
        int[] iArr = this.f12399c;
        long[] jArr = this.f12397a;
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
                        Object obj2 = objArr[i12];
                        int i13 = iArr[i12];
                        int iD = c0Var.d(obj2);
                        if (iD < 0 || i13 != c0Var.f12399c[iD]) {
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

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12400d = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12397a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12402f = o0.a(this.f12400d) - this.f12401e;
        this.f12398b = new Object[iMax];
        this.f12399c = new int[iMax];
    }

    public final void g(int i7) {
        this.f12401e--;
        long[] jArr = this.f12397a;
        int i10 = this.f12400d;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j5 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j5;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j5;
        this.f12398b[i7] = null;
    }

    public final void h(int i7, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f12398b[iC] = obj;
        this.f12399c[iC] = i7;
    }

    public final int hashCode() {
        Object[] objArr = this.f12398b;
        int[] iArr = this.f12399c;
        long[] jArr = this.f12397a;
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
                        iHashCode += iArr[i12] ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f12401e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f12398b;
        int[] iArr = this.f12399c;
        long[] jArr = this.f12397a;
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
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i14);
                            i10++;
                            if (i10 < this.f12401e) {
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
