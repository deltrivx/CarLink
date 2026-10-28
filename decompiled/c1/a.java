package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1804d;

    public a(long j5, long j10, long j11, long j12) {
        this.f1801a = j5;
        this.f1802b = j10;
        this.f1803c = j11;
        this.f1804d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y1.q.c(this.f1801a, aVar.f1801a) && y1.q.c(this.f1802b, aVar.f1802b) && y1.q.c(this.f1803c, aVar.f1803c) && y1.q.c(this.f1804d, aVar.f1804d);
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return t8.u.a(this.f1804d) + ob.a.k(ob.a.k(t8.u.a(this.f1801a) * 31, 31, this.f1802b), 31, this.f1803c);
    }
}
