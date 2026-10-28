package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f15451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f15452b;

    public p1(t1 t1Var, r1 r1Var) {
        this.f15451a = t1Var;
        this.f15452b = r1Var;
    }

    @Override // z.d1
    public final float a(float f10) {
        t1 t1Var = this.f15451a;
        boolean zBooleanValue = ((Boolean) t1Var.f15524h.invoke()).booleanValue();
        if (Math.abs(f10) != 0.0f && !zBooleanValue) {
            throw new x.w0(0, "The fling animation was cancelled");
        }
        return t1Var.d(t1Var.g(this.f15452b.a(2, t1Var.e(t1Var.h(f10)))));
    }
}
