package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8738a;

    public static final float a(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final float b(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f8738a == ((h) obj).f8738a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f8738a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        long j5 = this.f8738a;
        if (j5 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.b(b(j5))) + " x " + ((Object) f.b(a(j5)));
    }
}
