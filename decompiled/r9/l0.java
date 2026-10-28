package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k1 implements h9.o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f11707f;

    public l0(m0 m0Var) {
        this.f11707f = m0Var;
    }

    @Override // o9.o
    public final o9.u e() {
        return this.f11707f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t8.h] */
    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws n5.q {
        ((l0) this.f11707f.k.getValue()).f(obj, obj2, obj3);
        return t8.z.f12851a;
    }

    @Override // r9.g1
    public final l1 p() {
        return this.f11707f;
    }
}
