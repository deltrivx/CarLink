package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f3618b;

    public q0(t0 t0Var, t0 t0Var2) {
        this.f3617a = t0Var;
        this.f3618b = t0Var2;
    }

    @Override // d0.t0
    public final int a(o2.o0 o0Var, n3.o oVar) {
        return Math.max(this.f3617a.a(o0Var, oVar), this.f3618b.a(o0Var, oVar));
    }

    @Override // d0.t0
    public final int b(o2.o0 o0Var) {
        return Math.max(this.f3617a.b(o0Var), this.f3618b.b(o0Var));
    }

    @Override // d0.t0
    public final int c(o2.o0 o0Var, n3.o oVar) {
        return Math.max(this.f3617a.c(o0Var, oVar), this.f3618b.c(o0Var, oVar));
    }

    @Override // d0.t0
    public final int d(o2.o0 o0Var) {
        return Math.max(this.f3617a.d(o0Var), this.f3618b.d(o0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return i9.l.a(q0Var.f3617a, this.f3617a) && i9.l.a(q0Var.f3618b, this.f3618b);
    }

    public final int hashCode() {
        return (this.f3618b.hashCode() * 31) + this.f3617a.hashCode();
    }

    public final String toString() {
        return "(" + this.f3617a + " ∪ " + this.f3618b + ')';
    }
}
