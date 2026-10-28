package s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f12476a = {-9187201950435737345L, -1};

    static {
        new h0(0);
    }

    public static final int a(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return i7 - (i7 / 8);
    }

    public static final int b(int i7) {
        if (i7 == 0) {
            return 6;
        }
        return (i7 * 2) + 1;
    }

    public static final int c(int i7) {
        if (i7 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i7);
        }
        return 0;
    }

    public static final int d(int i7) {
        if (i7 == 7) {
            return 8;
        }
        return ((i7 - 1) / 7) + i7;
    }
}
