package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 extends g1 implements o9.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f11693e = {i9.y.f6689a.g(new i9.r(i1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f11694c = n4.h.R(null, new h1(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11695d = t8.a.c(t8.i.f12827a, new h1(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof i1) && i9.l.a(p(), ((i1) obj).p());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.r
    public final s9.g g() {
        return (s9.g) this.f11695d.getValue();
    }

    @Override // o9.b
    public final String getName() {
        return a2.f.I(new StringBuilder("<get-"), p().f11710d, '>');
    }

    public final int hashCode() {
        return p().hashCode();
    }

    @Override // r9.r
    public final x9.c j() {
        o9.u uVar = f11693e[0];
        Object objInvoke = this.f11694c.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return (aa.q0) objInvoke;
    }

    @Override // r9.g1
    public final x9.j0 n() {
        o9.u uVar = f11693e[0];
        Object objInvoke = this.f11694c.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return (aa.q0) objInvoke;
    }

    public final String toString() {
        return "getter of " + p();
    }
}
