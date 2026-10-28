package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12391a = o0.f12476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f12392b = p.f12477a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12395e;

    public b0(int i7) {
        if (i7 >= 0) {
            c(o0.d(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(long j5) {
        int iNumberOfTrailingZeros;
        int i7 = ((int) (j5 ^ (j5 >>> 32))) * (-862048943);
        int i10 = (i7 << 16) ^ i7;
        int i11 = i10 & 127;
        int i12 = this.f12393c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f12391a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f12392b[iNumberOfTrailingZeros] == j5) {
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

    public final int b(int i7) {
        int i10 = this.f12393c;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f12391a;
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

    public final void c(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, o0.c(i7)) : 0;
        this.f12393c = iMax;
        if (iMax == 0) {
            jArr = o0.f12476a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            u8.l.u0(jArr, -9187201950435737472L);
        }
        this.f12391a = jArr;
        int i10 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j5)) | j5;
        this.f12395e = o0.a(this.f12393c) - this.f12394d;
        this.f12392b = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.f12394d != this.f12394d) {
            return false;
        }
        long[] jArr = this.f12392b;
        long[] jArr2 = this.f12391a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr2[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128 && !b0Var.a(jArr[(i7 << 3) + i11])) {
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

    public final int hashCode() {
        long[] jArr = this.f12392b;
        long[] jArr2 = this.f12391a;
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
                        long j10 = jArr[(i7 << 3) + i12];
                        i10 += (int) (j10 ^ (j10 >>> 32));
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
        long[] jArr = this.f12392b;
        long[] jArr2 = this.f12391a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "]");
            break;
        }
        int i7 = 0;
        int i10 = 0;
        loop0: while (true) {
            long j5 = jArr2[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i7 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j5) < 128) {
                        long j10 = jArr[(i7 << 3) + i12];
                        if (i10 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i10 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(j10);
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
