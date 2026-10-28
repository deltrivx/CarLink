package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends k1 implements o9.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f11689f;

    public h0(i0 i0Var) {
        this.f11689f = i0Var;
    }

    @Override // o9.o
    public final o9.u e() {
        return this.f11689f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, t8.h] */
    @Override // h9.k
    public final Object invoke(Object obj) throws n5.q {
        ((h0) this.f11689f.k.getValue()).f(obj);
        return t8.z.f12851a;
    }

    @Override // r9.g1
    public final l1 p() {
        return this.f11689f;
    }
}
