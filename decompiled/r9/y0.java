package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends l1 implements o9.r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f11794j;

    public y0(e0 e0Var, String str, String str2, Object obj) {
        super(e0Var, str, str2, null, obj);
        w0 w0Var = new w0(this, 0);
        t8.i iVar = t8.i.f12827a;
        this.f11794j = t8.a.c(iVar, w0Var);
        t8.a.c(iVar, new w0(this, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e0 e0Var, x9.k0 k0Var) {
        super(e0Var, k0Var);
        i9.l.e(k0Var, "descriptor");
        w0 w0Var = new w0(this, 0);
        t8.i iVar = t8.i.f12827a;
        this.f11794j = t8.a.c(iVar, w0Var);
        t8.a.c(iVar, new w0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.u
    public final o9.p b() {
        return (x0) this.f11794j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.u
    public final o9.q b() {
        return (x0) this.f11794j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.r
    public final Object get() {
        return ((x0) this.f11794j.getValue()).f(new Object[0]);
    }

    @Override // h9.a
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.l1
    public final i1 q() {
        return (x0) this.f11794j.getValue();
    }
}
