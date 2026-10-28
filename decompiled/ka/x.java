package ka;

import x9.k0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f7486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da.u f7487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i9.x f7488d;

    public /* synthetic */ x(a0 a0Var, da.u uVar, i9.x xVar, int i7) {
        this.f7485a = i7;
        this.f7486b = a0Var;
        this.f7487c = uVar;
        this.f7488d = xVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f7485a) {
            case 0:
                a0 a0Var = this.f7486b;
                mb.n nVar = ((ja.a) a0Var.f7390b.f3847b).f6964a;
                x xVar = new x(a0Var, this.f7487c, this.f7488d, 1);
                mb.k kVar = (mb.k) nVar;
                kVar.getClass();
                return new mb.h(kVar, xVar);
            default:
                ha.h hVar = ((ja.a) this.f7486b.f7390b.f3847b).f6971h;
                k0 k0Var = (k0) this.f7488d.f6688a;
                hVar.getClass();
                i9.l.e(this.f7487c, "field");
                i9.l.e(k0Var, "descriptor");
                return null;
        }
    }
}
