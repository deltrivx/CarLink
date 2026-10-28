package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends k1 implements o9.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f11698f;

    public j0(k0 k0Var) {
        this.f11698f = k0Var;
    }

    @Override // o9.o
    public final o9.u e() {
        return this.f11698f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t8.h] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws n5.q {
        ((j0) this.f11698f.k.getValue()).f(obj, obj2);
        return t8.z.f12851a;
    }

    @Override // r9.g1
    public final l1 p() {
        return this.f11698f;
    }
}
