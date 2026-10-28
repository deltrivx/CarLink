package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f8429c = new q(n3.r.D(0), n3.r.D(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8431b;

    public q(long j5, long j10) {
        this.f8430a = j5;
        this.f8431b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return n3.q.a(this.f8430a, qVar.f8430a) && n3.q.a(this.f8431b, qVar.f8431b);
    }

    public final int hashCode() {
        return n3.q.d(this.f8431b) + (n3.q.d(this.f8430a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) n3.q.e(this.f8430a)) + ", restLine=" + ((Object) n3.q.e(this.f8431b)) + ')';
    }
}
