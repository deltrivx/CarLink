package k6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum e {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7328b;

    e(int[] iArr, int i7) {
        this.f7327a = iArr;
        this.f7328b = i7;
    }

    public final int a(g gVar) {
        char c10;
        int i7 = gVar.f7331a;
        if (i7 <= 9) {
            c10 = 0;
        } else {
            c10 = i7 <= 26 ? (char) 1 : (char) 2;
        }
        return this.f7327a[c10];
    }
}
