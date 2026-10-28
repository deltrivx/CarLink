package pc;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f10498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(mc.a aVar) {
        super(aVar);
        i9.l.e(aVar, "primitiveSerializer");
        this.f10498b = new q0(aVar.d());
    }

    @Override // pc.n, mc.a
    public final void a(rc.s sVar, Object obj) {
        int iH = h(obj);
        q0 q0Var = this.f10498b;
        i9.l.e(q0Var, "descriptor");
        rc.s sVarA = sVar.a(q0Var);
        o(sVarA, obj, iH);
        sVarA.t(q0Var);
    }

    @Override // pc.a, mc.a
    public final Object c(oc.b bVar) {
        return i(bVar);
    }

    @Override // mc.a
    public final nc.e d() {
        return this.f10498b;
    }

    @Override // pc.a
    public final Object e() {
        return (p0) k(n());
    }

    @Override // pc.a
    public final int f(Object obj) {
        p0 p0Var = (p0) obj;
        i9.l.e(p0Var, "<this>");
        return p0Var.d();
    }

    @Override // pc.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // pc.a
    public final Object l(Object obj) {
        p0 p0Var = (p0) obj;
        i9.l.e(p0Var, "<this>");
        return p0Var.a();
    }

    @Override // pc.n
    public final void m(int i7, Object obj, Object obj2) {
        i9.l.e((p0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(rc.s sVar, Object obj, int i7);
}
