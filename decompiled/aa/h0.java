package aa;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends q implements x9.y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.k f343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.i f344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x9.g0 f348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mb.e f350j;
    public final t8.o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(wa.e eVar, mb.k kVar, u9.i iVar, int i7) {
        super(y9.g.f15129a, eVar);
        i9.l.e(eVar, "moduleName");
        this.f343c = kVar;
        this.f344d = iVar;
        if (!eVar.f14248b) {
            throw new IllegalArgumentException("Module name must be special: " + eVar);
        }
        this.f345e = u8.x.f13123a;
        m0.f377a.getClass();
        m0 m0Var = (m0) V(k0.f369b);
        this.f346f = m0Var == null ? l0.f376b : m0Var;
        this.f349i = true;
        this.f350j = kVar.b(new a(2, this));
        this.k = t8.a.d(new g0(this, 0));
    }

    public final void B0() {
        if (this.f349i) {
            return;
        }
        if (V(x9.v.f14743a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        i9.l.e(str, "message");
        throw new ec.r(str);
    }

    @Override // x9.y
    public final x9.h0 F(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        B0();
        return (x9.h0) this.f350j.invoke(cVar);
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.o(this, obj);
    }

    @Override // x9.y
    public final Object V(hc.s sVar) {
        i9.l.e(sVar, "capability");
        Object obj = this.f345e.get(sVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // x9.y
    public final Collection h(wa.c cVar, h9.k kVar) {
        i9.l.e(cVar, "fqName");
        B0();
        B0();
        return ((p) this.k.getValue()).h(cVar, kVar);
    }

    @Override // x9.y
    public final u9.i k() {
        return this.f344d;
    }

    @Override // x9.y
    public final List k0() {
        if (this.f347g != null) {
            return u8.w.f13122a;
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = getName().f14247a;
        i9.l.d(str, "toString(...)");
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // x9.k
    public final x9.k l() {
        return null;
    }

    @Override // x9.y
    public final boolean r0(x9.y yVar) {
        i9.l.e(yVar, "targetModule");
        if (equals(yVar)) {
            return true;
        }
        i9.l.b(this.f347g);
        if (u8.p.g0(u8.y.f13124a, yVar)) {
            return true;
        }
        k0();
        return yVar.k0().contains(this);
    }

    @Override // aa.q
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q.w0(this));
        if (!this.f349i) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        x9.g0 g0Var = this.f348h;
        sb2.append(g0Var != null ? g0Var.getClass().getSimpleName() : null);
        return sb2.toString();
    }
}
