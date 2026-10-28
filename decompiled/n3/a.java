package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8730a;

    public /* synthetic */ a(long j5) {
        this.f8730a = j5;
    }

    public static long a(long j5, int i7, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i7 = j(j5);
        }
        if ((i13 & 2) != 0) {
            i10 = h(j5);
        }
        if ((i13 & 4) != 0) {
            i11 = i(j5);
        }
        if ((i13 & 8) != 0) {
            i12 = g(j5);
        }
        if (i10 < i7 || i12 < i11 || i7 < 0 || i11 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i7, i10, i11, i12);
    }

    public static final boolean b(long j5, long j10) {
        return j5 == j10;
    }

    public static final boolean c(long j5) {
        int i7 = (int) (3 & j5);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return (((int) (j5 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0;
    }

    public static final boolean d(long j5) {
        int i7 = (int) (3 & j5);
        return (((int) (j5 >> 33)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j5) {
        int i7 = (int) (3 & j5);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j5 >> (i10 + 15))) & i11;
        int i13 = ((int) (j5 >> (i10 + 46))) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final boolean f(long j5) {
        int i7 = (int) (3 & j5);
        int i10 = (1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1;
        int i11 = ((int) (j5 >> 2)) & i10;
        int i12 = ((int) (j5 >> 33)) & i10;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    public static final int g(long j5) {
        int i7 = (int) (3 & j5);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i11 = ((int) (j5 >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int h(long j5) {
        int i7 = (int) (3 & j5);
        int i10 = (int) (j5 >> 33);
        int i11 = i10 & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int i(long j5) {
        int i7 = (int) (3 & j5);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return ((int) (j5 >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    public static final int j(long j5) {
        int i7 = (int) (3 & j5);
        return ((int) (j5 >> 2)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j5) {
        int iH = h(j5);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j5);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j5));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j5));
        sb2.append(", maxHeight = ");
        return a2.f.I(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f8730a == ((a) obj).f8730a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f8730a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return k(this.f8730a);
    }
}
