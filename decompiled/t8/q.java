package t8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f12842a;

    public /* synthetic */ q(byte b10) {
        this.f12842a = b10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return i9.l.f(this.f12842a & 255, ((q) obj).f12842a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f12842a == ((q) obj).f12842a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12842a;
    }

    public final String toString() {
        return String.valueOf(this.f12842a & 255);
    }
}
