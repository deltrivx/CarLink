package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends hc.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f2686e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public x1(y8.h hVar, a9.c cVar) {
        y1 y1Var = y1.f2688a;
        super(cVar, hVar.l(y1Var) == null ? hVar.s(y1Var) : hVar);
        this.f2686e = new ThreadLocal();
        if (cVar.getContext().l(y8.d.f15107a) instanceof u) {
            return;
        }
        Object objL = hc.a.l(hVar, null);
        hc.a.g(hVar, objL);
        i0(hVar, objL);
    }

    @Override // hc.p, cc.h1
    public final void A(Object obj) {
        if (this.threadLocalIsSet) {
            t8.j jVar = (t8.j) this.f2686e.get();
            if (jVar != null) {
                hc.a.g((y8.h) jVar.f12830a, jVar.f12831b);
            }
            this.f2686e.remove();
        }
        Object objU = b0.u(obj);
        y8.c cVar = this.f6533d;
        y8.h context = cVar.getContext();
        Object objL = hc.a.l(context, null);
        x1 x1VarZ = objL != hc.a.f6498d ? b0.z(cVar, context, objL) : null;
        try {
            this.f6533d.resumeWith(objU);
        } finally {
            if (x1VarZ == null || x1VarZ.h0()) {
                hc.a.g(context, objL);
            }
        }
    }

    public final boolean h0() {
        boolean z10 = this.threadLocalIsSet && this.f2686e.get() == null;
        this.f2686e.remove();
        return !z10;
    }

    public final void i0(y8.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f2686e.set(new t8.j(hVar, obj));
    }
}
