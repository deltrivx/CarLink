package d0;

import q2.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends r1.o implements t1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3554p;

    @Override // q2.t1
    public final Object k0(Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        if (k0Var == null) {
            k0Var = new k0();
            k0Var.f3580a = 0.0f;
            k0Var.f3581b = true;
        }
        k0Var.f3580a = this.f3553o;
        k0Var.f3581b = this.f3554p;
        return k0Var;
    }
}
