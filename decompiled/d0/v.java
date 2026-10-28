package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f3639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f3640b;

    public v(t0 t0Var, t0 t0Var2) {
        this.f3639a = t0Var;
        this.f3640b = t0Var2;
    }

    @Override // d0.t0
    public final int a(o2.o0 o0Var, n3.o oVar) {
        int iA = this.f3639a.a(o0Var, oVar) - this.f3640b.a(o0Var, oVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // d0.t0
    public final int b(o2.o0 o0Var) {
        int iB = this.f3639a.b(o0Var) - this.f3640b.b(o0Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // d0.t0
    public final int c(o2.o0 o0Var, n3.o oVar) {
        int iC = this.f3639a.c(o0Var, oVar) - this.f3640b.c(o0Var, oVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // d0.t0
    public final int d(o2.o0 o0Var) {
        int iD = this.f3639a.d(o0Var) - this.f3640b.d(o0Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i9.l.a(vVar.f3639a, this.f3639a) && i9.l.a(vVar.f3640b, this.f3640b);
    }

    public final int hashCode() {
        return this.f3640b.hashCode() + (this.f3639a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f3639a + " - " + this.f3640b + ')';
    }
}
