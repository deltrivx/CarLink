package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8739a;

    public /* synthetic */ j(long j5) {
        this.f8739a = j5;
    }

    public static final boolean a(long j5, long j10) {
        return j5 == j10;
    }

    public static final long b(long j5, long j10) {
        int i7 = ((int) (j5 >> 32)) - ((int) (j10 >> 32));
        return (((long) (((int) (j5 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) i7) << 32);
    }

    public static final long c(long j5, long j10) {
        int i7 = ((int) (j5 >> 32)) + ((int) (j10 >> 32));
        return (((long) (((int) (j5 & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) i7) << 32);
    }

    public static String d(long j5) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j5 >> 32));
        sb2.append(", ");
        return a2.f.H(sb2, (int) (j5 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f8739a == ((j) obj).f8739a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f8739a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return d(this.f8739a);
    }
}
