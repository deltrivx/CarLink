package zb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f15815b;

    static {
        int[] iArr = new int[256];
        int i7 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f15814a = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i7)] = i20;
            i7++;
            i20++;
        }
        f15815b = jArr;
    }

    public static final void a(String str, int i7, int i10) {
        int i11 = i10 - i7;
        if (i11 < 1) {
            String strSubstring = str.substring(i7, i10);
            i9.l.d(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i7 + ", but was \"" + strSubstring + "\" of length " + i11);
        }
        if (i11 > 16) {
            int i12 = (i11 + i7) - 16;
            while (i7 < i12) {
                if (str.charAt(i7) != '0') {
                    StringBuilder sbT = ob.a.t("Expected the hexadecimal digit '0' at index ", ", but was '", i7);
                    sbT.append(str.charAt(i7));
                    sbT.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbT.toString());
                }
                i7++;
            }
        }
    }

    public static long b(String str, int i7, int i10) {
        g gVar = g.f15819d;
        i9.l.e(gVar, "format");
        int length = str.length();
        if (i7 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException("startIndex: " + i7 + ", endIndex: " + i10 + ", size: " + length);
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(a2.f.D(i7, i10, "startIndex: ", " > endIndex: "));
        }
        if (gVar.f15822c.f15818a) {
            a(str, i7, i10);
            return c(str, i7, i10);
        }
        if (i10 - i7 > 0) {
            a(str, i7, i10);
            return c(str, i7, i10);
        }
        String strSubstring = str.substring(i7, i10);
        i9.l.d(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(String str, int i7, int i10) {
        long j5 = 0;
        while (i7 < i10) {
            long j10 = j5 << 4;
            char cCharAt = str.charAt(i7);
            if ((cCharAt >>> '\b') == 0) {
                long j11 = f15815b[cCharAt];
                if (j11 >= 0) {
                    j5 = j10 | j11;
                    i7++;
                }
            }
            StringBuilder sbT = ob.a.t("Expected a hexadecimal digit at index ", ", but was ", i7);
            sbT.append(str.charAt(i7));
            throw new NumberFormatException(sbT.toString());
        }
        return j5;
    }
}
