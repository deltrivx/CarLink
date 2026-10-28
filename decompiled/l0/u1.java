package l0;

import f1.v1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements o2.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f7873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3.d0 f7875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9.a f7876d;

    public u1(q1 q1Var, int i7, g3.d0 d0Var, h9.a aVar) {
        this.f7873a = q1Var;
        this.f7874b = i7;
        this.f7875c = d0Var;
        this.f7876d = aVar;
    }

    @Override // r1.p
    public final /* synthetic */ r1.p a(r1.p pVar) {
        return ob.a.g(this, pVar);
    }

    @Override // o2.y
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        o2.v0 v0VarU = l0Var.u(n3.a.a(j5, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(v0VarU.f9436b, n3.a.g(j5));
        return o0Var.i(v0VarU.f9435a, iMin, u8.x.f13123a, new v1(this, v0VarU, iMin));
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
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return i9.l.a(this.f7873a, u1Var.f7873a) && this.f7874b == u1Var.f7874b && i9.l.a(this.f7875c, u1Var.f7875c) && i9.l.a(this.f7876d, u1Var.f7876d);
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
        return this.f7876d.hashCode() + ((this.f7875c.hashCode() + (((this.f7873a.hashCode() * 31) + this.f7874b) * 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f7873a + ", cursorOffset=" + this.f7874b + ", transformedText=" + this.f7875c + ", textLayoutResultProvider=" + this.f7876d + ')';
    }
}
