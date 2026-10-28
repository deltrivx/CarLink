package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 extends g1 implements o9.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f11703e = {i9.y.f6689a.g(new i9.r(k1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f11704c = n4.h.R(null, new j1(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11705d = t8.a.c(t8.i.f12827a, new j1(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof k1) && i9.l.a(p(), ((k1) obj).p());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.r
    public final s9.g g() {
        return (s9.g) this.f11705d.getValue();
    }

    @Override // o9.b
    public final String getName() {
        return a2.f.I(new StringBuilder("<set-"), p().f11710d, '>');
    }

    public final int hashCode() {
        return p().hashCode();
    }

    @Override // r9.r
    public final x9.c j() {
        o9.u uVar = f11703e[0];
        Object objInvoke = this.f11704c.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return (aa.r0) objInvoke;
    }

    @Override // r9.g1
    public final x9.j0 n() {
        o9.u uVar = f11703e[0];
        Object objInvoke = this.f11704c.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return (aa.r0) objInvoke;
    }

    public final String toString() {
        return "setter of " + p();
    }
}
