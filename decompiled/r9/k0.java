package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b1 implements o9.k {
    public final Object k;

    public k0(e0 e0Var, String str, String str2, Object obj) {
        super(e0Var, str, str2, obj);
        this.k = t8.a.c(t8.i.f12827a, new aa.e(25, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e0 e0Var, x9.k0 k0Var) {
        super(e0Var, k0Var);
        i9.l.e(k0Var, "descriptor");
        this.k = t8.a.c(t8.i.f12827a, new aa.e(25, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.l
    public final o9.g c() {
        return (j0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.k, o9.l
    public final o9.j c() {
        return (j0) this.k.getValue();
    }
}
