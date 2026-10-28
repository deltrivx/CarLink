package ec;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4731a;

    public m(Throwable th) {
        this.f4731a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return i9.l.a(this.f4731a, ((m) obj).f4731a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4731a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // ec.n
    public final String toString() {
        return "Closed(" + this.f4731a + ')';
    }
}
