package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8762a;

    public static final boolean a(long j5, long j10) {
        return j5 == j10;
    }

    public static String b(long j5) {
        if (a(j5, 0L)) {
            return "Unspecified";
        }
        if (a(j5, 4294967296L)) {
            return "Sp";
        }
        return a(j5, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f8762a == ((s) obj).f8762a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f8762a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return b(this.f8762a);
    }
}
