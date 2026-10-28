package rc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f12318a = new char[117];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12319b = new byte[126];

    static {
        for (int i7 = 0; i7 < 32; i7++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = f12319b;
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(char c10, int i7) {
        if (c10 != 'u') {
            f12318a[c10] = (char) i7;
        }
    }
}
