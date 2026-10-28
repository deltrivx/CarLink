package v0;

import t8.z;
import x.d1;
import x.p1;
import x.x;
import z.m1;
import z.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13572b;

    public /* synthetic */ p(int i7, Object obj) {
        this.f13571a = i7;
        this.f13572b = obj;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f13571a) {
            case 0:
                r rVar = (r) this.f13572b;
                rVar.f13588z = null;
                q2.f.n(rVar);
                q2.f.m(rVar);
                q2.f.l(rVar);
                return Boolean.TRUE;
            case 1:
                h9.a aVar = ((x) this.f13572b).K;
                if (aVar != null) {
                    aVar.invoke();
                }
                return Boolean.TRUE;
            case 2:
                p1 p1Var = (p1) this.f13572b;
                x.i iVar = (x.i) q2.f.i(p1Var, d1.f14344a);
                p1Var.f14468z = iVar;
                p1Var.A = iVar != null ? new x.h(iVar.f14387a, iVar.f14388b, iVar.f14389c, iVar.f14390d) : null;
                return z.f12851a;
            case 3:
                return (q0) ec.o.a(((ec.l) this.f13572b).k());
            default:
                return Boolean.valueOf(((m1) this.f13572b).f11129n);
        }
    }
}
