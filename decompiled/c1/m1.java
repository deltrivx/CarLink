package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f2007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f2008j;

    public m1(long j5, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f1999a = j5;
        this.f2000b = j10;
        this.f2001c = j11;
        this.f2002d = j12;
        this.f2003e = j13;
        this.f2004f = j14;
        this.f2005g = j15;
        this.f2006h = j16;
        this.f2007i = j17;
        this.f2008j = j18;
    }

    public final long a(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.f2000b : this.f2002d;
        }
        return z11 ? this.f2005g : this.f2007i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return y1.q.c(this.f1999a, m1Var.f1999a) && y1.q.c(this.f2000b, m1Var.f2000b) && y1.q.c(this.f2001c, m1Var.f2001c) && y1.q.c(this.f2002d, m1Var.f2002d) && y1.q.c(this.f2003e, m1Var.f2003e) && y1.q.c(this.f2004f, m1Var.f2004f) && y1.q.c(this.f2005g, m1Var.f2005g) && y1.q.c(this.f2006h, m1Var.f2006h) && y1.q.c(this.f2007i, m1Var.f2007i) && y1.q.c(this.f2008j, m1Var.f2008j);
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return t8.u.a(this.f2008j) + ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(ob.a.k(t8.u.a(this.f1999a) * 31, 31, this.f2000b), 31, this.f2001c), 31, this.f2002d), 31, this.f2003e), 31, this.f2004f), 31, this.f2005g), 31, this.f2006h), 31, this.f2007i);
    }
}
