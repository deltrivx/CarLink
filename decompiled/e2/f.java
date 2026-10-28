package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kb.d f4146l = new kb.d(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f4152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4156j;

    public f(String str, float f10, float f11, float f12, float f13, h0 h0Var, long j5, int i7, boolean z10) {
        int i10;
        synchronized (f4146l) {
            i10 = k;
            k = i10 + 1;
        }
        this.f4147a = str;
        this.f4148b = f10;
        this.f4149c = f11;
        this.f4150d = f12;
        this.f4151e = f13;
        this.f4152f = h0Var;
        this.f4153g = j5;
        this.f4154h = i7;
        this.f4155i = z10;
        this.f4156j = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i9.l.a(this.f4147a, fVar.f4147a) && n3.f.a(this.f4148b, fVar.f4148b) && n3.f.a(this.f4149c, fVar.f4149c) && this.f4150d == fVar.f4150d && this.f4151e == fVar.f4151e && this.f4152f.equals(fVar.f4152f) && y1.q.c(this.f4153g, fVar.f4153g) && this.f4154h == fVar.f4154h && this.f4155i == fVar.f4155i;
    }

    public final int hashCode() {
        int iHashCode = (this.f4152f.hashCode() + ob.a.j(this.f4151e, ob.a.j(this.f4150d, ob.a.j(this.f4149c, ob.a.j(this.f4148b, this.f4147a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i7 = y1.q.f14959n;
        return ((ob.a.k(iHashCode, 31, this.f4153g) + this.f4154h) * 31) + (this.f4155i ? 1231 : 1237);
    }
}
