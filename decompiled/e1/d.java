package e1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3966a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static /* synthetic */ boolean a(int i7, int i10) {
        if (i7 != 0) {
            return i7 == i10;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i7) {
        if (i7 != 0) {
            return i7 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i7) {
        int[] iArr = new int[i7];
        System.arraycopy(f3966a, 0, iArr, 0, i7);
        return iArr;
    }
}
