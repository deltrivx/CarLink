package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements o2.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f7705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3.d0 f7707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9.a f7708d;

    public k0(q1 q1Var, int i7, g3.d0 d0Var, h9.a aVar) {
        this.f7705a = q1Var;
        this.f7706b = i7;
        this.f7707c = d0Var;
        this.f7708d = aVar;
    }

    @Override // r1.p
    public final /* synthetic */ r1.p a(r1.p pVar) {
        return ob.a.g(this, pVar);
    }

    @Override // o2.y
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        long j10;
        if (l0Var.r(n3.a.g(j5)) < n3.a.h(j5)) {
            j10 = j5;
        } else {
            j10 = j5;
            j5 = n3.a.a(j10, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        o2.v0 v0VarU = l0Var.u(j5);
        int iMin = Math.min(v0VarU.f9435a, n3.a.h(j10));
        return o0Var.i(iMin, v0VarU.f9436b, u8.x.f13123a, new d0.m0(this, o0Var, v0VarU, iMin, 2));
    }

    @Override // o2.y
    public final /* synthetic */ int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.h(this, p0Var, l0Var, i7);
    }

    @Override // o2.y
    public final /* synthetic */ int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.f(this, p0Var, l0Var, i7);
    }

    @Override // o2.y
    public final /* synthetic */ int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.a(this, p0Var, l0Var, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return i9.l.a(this.f7705a, k0Var.f7705a) && this.f7706b == k0Var.f7706b && i9.l.a(this.f7707c, k0Var.f7707c) && i9.l.a(this.f7708d, k0Var.f7708d);
    }

    @Override // o2.y
    public final /* synthetic */ int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return a2.f.c(this, p0Var, l0Var, i7);
    }

    @Override // r1.p
    public final Object g(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // r1.p
    public final boolean h(h9.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public final int hashCode() {
        return this.f7708d.hashCode() + ((this.f7707c.hashCode() + (((this.f7705a.hashCode() * 31) + this.f7706b) * 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f7705a + ", cursorOffset=" + this.f7706b + ", transformedText=" + this.f7707c + ", textLayoutResultProvider=" + this.f7708d + ')';
    }
}
