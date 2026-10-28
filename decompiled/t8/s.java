package t8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12844a;

    public /* synthetic */ s(int i7) {
        this.f12844a = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i9.l.f(this.f12844a ^ Integer.MIN_VALUE, ((s) obj).f12844a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f12844a == ((s) obj).f12844a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12844a;
    }

    public final String toString() {
        return String.valueOf(((long) this.f12844a) & 4294967295L);
    }
}
