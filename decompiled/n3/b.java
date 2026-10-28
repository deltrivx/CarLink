package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(int i7, int i10, int i11, int i12) {
        if (!((i11 >= 0) & (i10 >= i7) & (i12 >= i11) & (i7 >= 0))) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i7, i10, i11, i12);
    }

    public static /* synthetic */ long b(int i7, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(0, i7, 0, i10);
    }

    public static final int c(int i7) {
        if (i7 < 8191) {
            return 13;
        }
        if (i7 < 32767) {
            return 15;
        }
        if (i7 < 65535) {
            return 16;
        }
        return i7 < 262143 ? 18 : 255;
    }

    public static final long d(long j5, long j10) {
        int i7 = (int) (j10 >> 32);
        int iJ = a.j(j5);
        int iH = a.h(j5);
        if (i7 < iJ) {
            i7 = iJ;
        }
        if (i7 <= iH) {
            iH = i7;
        }
        int i10 = (int) (j10 & 4294967295L);
        int i11 = a.i(j5);
        int iG = a.g(j5);
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 <= iG) {
            iG = i10;
        }
        return (((long) iH) << 32) | (4294967295L & ((long) iG));
    }

    public static final long e(long j5, long j10) {
        int iJ = a.j(j5);
        int iH = a.h(j5);
        int i7 = a.i(j5);
        int iG = a.g(j5);
        int iJ2 = a.j(j10);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = a.h(j10);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        int i10 = a.i(j10);
        if (i10 < i7) {
            i10 = i7;
        }
        if (i10 > iG) {
            i10 = iG;
        }
        int iG2 = a.g(j10);
        if (iG2 >= i7) {
            i7 = iG2;
        }
        if (i7 <= iG) {
            iG = i7;
        }
        return a(iJ2, iH, i10, iG);
    }

    public static final int f(int i7, long j5) {
        int i10 = a.i(j5);
        int iG = a.g(j5);
        if (i7 < i10) {
            i7 = i10;
        }
        return i7 > iG ? iG : i7;
    }

    public static final int g(int i7, long j5) {
        int iJ = a.j(j5);
        int iH = a.h(j5);
        if (i7 < iJ) {
            i7 = iJ;
        }
        return i7 > iH ? iH : i7;
    }

    public static final long h(int i7, int i10, int i11, int i12) {
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iC = c(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i7 : i10;
        int iC2 = c(i14);
        if (iC + iC2 > 31) {
            k(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = iC2 - 13;
        return (((long) (i15 & (~(i15 >> 31)))) << 33) | ((long) ((i17 >> 1) + (i17 & 1))) | (((long) i7) << 2) | (((long) i11) << (iC2 + 2)) | (((long) (i16 & (~(i16 >> 31)))) << (iC2 + 33));
    }

    public static final long i(int i7, int i10, long j5) {
        int iJ = a.j(j5) + i7;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = a.h(j5);
        if (iH != Integer.MAX_VALUE && (iH = iH + i7) < 0) {
            iH = 0;
        }
        int i11 = a.i(j5) + i10;
        if (i11 < 0) {
            i11 = 0;
        }
        int iG = a.g(j5);
        return a(iJ, iH, i11, (iG == Integer.MAX_VALUE || (iG = iG + i10) >= 0) ? iG : 0);
    }

    public static /* synthetic */ long j(int i7, int i10, int i11, long j5) {
        if ((i11 & 1) != 0) {
            i7 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return i(i7, i10, j5);
    }

    public static final void k(int i7, int i10) {
        throw new IllegalArgumentException("Can't represent a width of " + i7 + " and height of " + i10 + " in Constraints");
    }

    public static final Void l(int i7) {
        throw new IllegalArgumentException(a2.f.F("Can't represent a size of ", " in Constraints", i7));
    }
}
