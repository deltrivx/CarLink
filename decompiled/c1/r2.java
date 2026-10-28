package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r2 implements y1.r, i9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f2125a;

    public r2(q0 q0Var) {
        this.f2125a = q0Var;
    }

    @Override // y1.r
    public final long a() {
        return ((y1.q) this.f2125a.get()).f14960a;
    }

    @Override // i9.h
    public final t8.e b() {
        return this.f2125a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1.r) || !(obj instanceof i9.h)) {
            return false;
        }
        return this.f2125a.equals(((i9.h) obj).b());
    }

    public final int hashCode() {
        return this.f2125a.hashCode();
    }
}
