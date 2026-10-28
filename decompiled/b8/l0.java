package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends c2 {
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1607b;

    public /* synthetic */ l0(int i7, long j5) {
        if (1 == (i7 & 1)) {
            this.f1607b = j5;
        } else {
            pc.m0.e(i7, 1, j0.f1601a.d());
            throw null;
        }
    }

    public l0(long j5) {
        this.f1607b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.f1607b == ((l0) obj).f1607b;
    }

    public final int hashCode() {
        long j5 = this.f1607b;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return "Delay(millis=" + this.f1607b + ")";
    }
}
