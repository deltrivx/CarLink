package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8746a;

    public static final boolean a(long j5, long j10) {
        return j5 == j10;
    }

    public static String b(long j5) {
        return ((int) (j5 >> 32)) + " x " + ((int) (j5 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f8746a == ((m) obj).f8746a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f8746a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return b(this.f8746a);
    }
}
