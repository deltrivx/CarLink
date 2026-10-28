package n9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f8972d = new d(1, 0, 1);

    @Override // n9.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f8965a == dVar.f8965a && this.f8966b == dVar.f8966b;
    }

    @Override // n9.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f8965a * 31) + this.f8966b;
    }

    @Override // n9.b
    public final boolean isEmpty() {
        return this.f8965a > this.f8966b;
    }

    @Override // n9.b
    public final String toString() {
        return this.f8965a + ".." + this.f8966b;
    }
}
