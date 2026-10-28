package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b1 extends l1 implements o9.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f11663j;

    public b1(e0 e0Var, String str, String str2, Object obj) {
        super(e0Var, str, str2, null, obj);
        z0 z0Var = new z0(this, 0);
        t8.i iVar = t8.i.f12827a;
        this.f11663j = t8.a.c(iVar, z0Var);
        t8.a.c(iVar, new z0(this, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e0 e0Var, x9.k0 k0Var) {
        super(e0Var, k0Var);
        i9.l.e(k0Var, "descriptor");
        z0 z0Var = new z0(this, 0);
        t8.i iVar = t8.i.f12827a;
        this.f11663j = t8.a.c(iVar, z0Var);
        t8.a.c(iVar, new z0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.u
    public final o9.p b() {
        return (a1) this.f11663j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.u
    public final o9.s b() {
        return (a1) this.f11663j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.t
    public final Object get(Object obj) {
        return ((a1) this.f11663j.getValue()).f(obj);
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.l1
    public final i1 q() {
        return (a1) this.f11663j.getValue();
    }
}
