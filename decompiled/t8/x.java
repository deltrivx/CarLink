package t8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f12849a;

    public /* synthetic */ x(short s2) {
        this.f12849a = s2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return i9.l.f(this.f12849a & 65535, ((x) obj).f12849a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f12849a == ((x) obj).f12849a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12849a;
    }

    public final String toString() {
        return String.valueOf(this.f12849a & 65535);
    }
}
