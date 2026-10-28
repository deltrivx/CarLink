package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1428b = g0.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1429c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1430a;

    public /* synthetic */ q0(long j5) {
        this.f1430a = j5;
    }

    public static boolean a(long j5, Object obj) {
        return (obj instanceof q0) && j5 == ((q0) obj).f1430a;
    }

    public static final boolean b(long j5, long j10) {
        return j5 == j10;
    }

    public static final boolean c(long j5) {
        return ((int) (j5 >> 32)) == ((int) (j5 & 4294967295L));
    }

    public static final int d(long j5) {
        return e(j5) - f(j5);
    }

    public static final int e(long j5) {
        return Math.max((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    public static final int f(long j5) {
        return Math.min((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    public static final boolean g(long j5) {
        return ((int) (j5 >> 32)) > ((int) (j5 & 4294967295L));
    }

    public static String h(long j5) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j5 >> 32));
        sb2.append(", ");
        return a2.f.H(sb2, (int) (j5 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.f1430a, obj);
    }

    public final int hashCode() {
        long j5 = this.f1430a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return h(this.f1430a);
    }
}
