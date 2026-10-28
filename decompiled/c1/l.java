package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1977d;

    public l(long j5, long j10, long j11, long j12) {
        this.f1974a = j5;
        this.f1975b = j10;
        this.f1976c = j11;
        this.f1977d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return y1.q.c(this.f1974a, lVar.f1974a) && y1.q.c(this.f1975b, lVar.f1975b) && y1.q.c(this.f1976c, lVar.f1976c) && y1.q.c(this.f1977d, lVar.f1977d);
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return t8.u.a(this.f1977d) + ob.a.k(ob.a.k(t8.u.a(this.f1974a) * 31, 31, this.f1975b), 31, this.f1976c);
    }
}
