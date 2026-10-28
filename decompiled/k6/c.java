package k6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7313a = {2, 1, 4, 3};

    public static boolean a(int i7, int i10, int i11) {
        switch (i7) {
            case 1:
                return ((i10 + i11) & 1) == 0;
            case 2:
                return (i10 & 1) == 0;
            case 3:
                return i11 % 3 == 0;
            case 4:
                return (i10 + i11) % 3 == 0;
            case 5:
                return (((i11 / 3) + (i10 / 2)) & 1) == 0;
            case 6:
                return (i10 * i11) % 6 == 0;
            case 7:
                return (i10 * i11) % 6 < 3;
            default:
                return ((((i10 * i11) % 3) + (i10 + i11)) & 1) == 0;
        }
    }
}
