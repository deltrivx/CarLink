package z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f15615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f15616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15617e = 0;

    static {
        long j5 = 3;
        long j10 = j5 << 32;
        f15613a = (((long) 0) & 4294967295L) | j10;
        f15614b = (((long) 1) & 4294967295L) | j10;
        f15615c = j10 | (((long) 2) & 4294967295L);
        f15616d = (j5 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j5, long j10) {
        return j5 == j10;
    }

    public static String b(long j5) {
        if (a(j5, f15613a)) {
            return "Rgb";
        }
        if (a(j5, f15614b)) {
            return "Xyz";
        }
        if (a(j5, f15615c)) {
            return "Lab";
        }
        return a(j5, f15616d) ? "Cmyk" : "Unknown";
    }
}
