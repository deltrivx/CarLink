package k6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f7314c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f7316b;

    public d(int i7) {
        int i10 = (i7 >> 3) & 3;
        if (i10 < 0 || i10 >= 4) {
            throw new IllegalArgumentException();
        }
        this.f7315a = c.f7313a[i10];
        this.f7316b = (byte) (i7 & 7);
    }

    public static d a(int i7, int i10) {
        int iBitCount;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            int[] iArr = f7314c[i13];
            int i14 = iArr[0];
            if (i14 == i7 || i14 == i10) {
                return new d(iArr[1]);
            }
            int iBitCount2 = Integer.bitCount(i7 ^ i14);
            if (iBitCount2 < i11) {
                i12 = iArr[1];
                i11 = iBitCount2;
            }
            if (i7 != i10 && (iBitCount = Integer.bitCount(i14 ^ i10)) < i11) {
                i12 = iArr[1];
                i11 = iBitCount;
            }
        }
        if (i11 <= 3) {
            return new d(i12);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7315a == dVar.f7315a && this.f7316b == dVar.f7316b;
    }

    public final int hashCode() {
        return (e1.d.b(this.f7315a) << 3) | this.f7316b;
    }
}
