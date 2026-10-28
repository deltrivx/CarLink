package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends i1 implements h9.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f11672f;

    public d1(e1 e1Var) {
        this.f11672f = e1Var;
    }

    @Override // o9.o
    public final o9.u e() {
        return this.f11672f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t8.h] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) this.f11672f.f11674j.getValue()).f(obj, obj2);
    }

    @Override // r9.g1
    public final l1 p() {
        return this.f11672f;
    }
}
