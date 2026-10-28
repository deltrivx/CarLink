package r9;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f11760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11761c;

    public s0(Class cls) {
        i9.l.e(cls, "jClass");
        this.f11760b = cls;
        this.f11761c = t8.a.c(t8.i.f12827a, new n0(this, 0));
    }

    @Override // i9.e
    public final Class a() {
        return this.f11760b;
    }

    @Override // r9.e0
    public final Collection e() {
        return u8.w.f13122a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return i9.l.a(this.f11760b, ((s0) obj).f11760b);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.e0
    public final Collection f(wa.e eVar) {
        r1 r1Var = ((q0) this.f11761c.getValue()).f11748d;
        o9.u uVar = q0.f11746g[1];
        Object objInvoke = r1Var.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return ((gb.o) objInvoke).f(eVar, fa.b.f5503b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, t8.h] */
    @Override // r9.e0
    public final x9.k0 g(int i7) {
        t8.p pVar = (t8.p) ((q0) this.f11761c.getValue()).f11750f.getValue();
        if (pVar == null) {
            return null;
        }
        va.f fVar = (va.f) pVar.f12839a;
        ra.e0 e0Var = (ra.e0) pVar.f12840b;
        ta.e eVar = (ta.e) pVar.f12841c;
        xa.m mVar = ua.k.f13312n;
        i9.l.d(mVar, "packageLocalVariable");
        ra.i0 i0Var = (ra.i0) n3.n.o0(e0Var, mVar, i7);
        if (i0Var == null) {
            return null;
        }
        ra.y0 y0Var = e0Var.f11911g;
        i9.l.d(y0Var, "getTypeTable(...)");
        return (x9.k0) x1.f(this.f11760b, i0Var, fVar, new aa.f0(y0Var), eVar, r0.f11754i);
    }

    public final int hashCode() {
        return this.f11760b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, t8.h] */
    @Override // r9.e0
    public final Class i() {
        Class cls = (Class) ((q0) this.f11761c.getValue()).f11749e.getValue();
        return cls == null ? this.f11760b : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.e0
    public final Collection n(wa.e eVar) {
        r1 r1Var = ((q0) this.f11761c.getValue()).f11748d;
        o9.u uVar = q0.f11746g[1];
        Object objInvoke = r1Var.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return ((gb.o) objInvoke).b(eVar, fa.b.f5503b);
    }

    public final String toString() {
        return "file class " + da.d.a(this.f11760b).a();
    }
}
