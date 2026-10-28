package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends y0 implements o9.i {
    public final Object k;

    public i0(e0 e0Var, String str, String str2, Object obj) {
        super(e0Var, str, str2, obj);
        this.k = t8.a.c(t8.i.f12827a, new aa.e(24, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e0 e0Var, x9.k0 k0Var) {
        super(e0Var, k0Var);
        i9.l.e(k0Var, "descriptor");
        this.k = t8.a.c(t8.i.f12827a, new aa.e(24, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.l
    public final o9.g c() {
        return (h0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.i, o9.l
    public final o9.h c() {
        return (h0) this.k.getValue();
    }
}
