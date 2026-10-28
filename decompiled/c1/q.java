package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f2072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f2073j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2074l;

    public q(long j5, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.f2064a = j5;
        this.f2065b = j10;
        this.f2066c = j11;
        this.f2067d = j12;
        this.f2068e = j13;
        this.f2069f = j14;
        this.f2070g = j15;
        this.f2071h = j16;
        this.f2072i = j17;
        this.f2073j = j18;
        this.k = j19;
        this.f2074l = j20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return y1.q.c(this.f2064a, qVar.f2064a) && y1.q.c(this.f2065b, qVar.f2065b) && y1.q.c(this.f2066c, qVar.f2066c) && y1.q.c(this.f2067d, qVar.f2067d) && y1.q.c(this.f2068e, qVar.f2068e) && y1.q.c(this.f2069f, qVar.f2069f) && y1.q.c(this.f2070g, qVar.f2070g) && y1.q.c(this.f2071h, qVar.f2071h) && y1.q.c(this.f2072i, qVar.f2072i) && y1.q.c(this.f2073j, qVar.f2073j) && y1.q.c(this.k, qVar.k) && y1.q.c(this.f2074l, qVar.f2074l);
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return t8.u.a(this.f2074l) + ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(t8.u.a(this.f2064a) * 31, 31, this.f2065b), 31, this.f2066c), 31, this.f2067d), 31, this.f2068e), 31, this.f2069f), 31, this.f2070g), 31, this.f2071h), 31, this.f2072i), 31, this.f2073j), 31, this.k);
    }
}
