package pb;

import aa.o;
import java.util.List;
import n3.r;
import nb.p0;
import nb.r0;
import u8.w;
import x9.n0;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(wa.e eVar) {
        l lVar = l.f10415a;
        e eVar2 = l.f10416b;
        mb.b bVar = mb.k.f8627e;
        x xVar = x.f14749d;
        x9.f fVar = x9.f.f14701a;
        List list = w.f13122a;
        super(eVar2, eVar, xVar, fVar, list, bVar);
        aa.m mVar = new aa.m(this, null, y9.g.f15129a, true, 1, n0.f14716e0);
        mVar.Q0(list, x9.o.f14720d);
        g gVarB = l.b(h.SCOPE_FOR_ERROR_CLASS, mVar.getName().f14247a, "");
        k kVar = k.ERROR_CLASS;
        mVar.f478g = new i(l.d(kVar, new String[0]), gVarB, kVar, list, false, new String[0]);
        B0(gVarB, r.W(mVar), mVar);
    }

    @Override // aa.c, aa.e0
    public final gb.o D(p0 p0Var, ob.g gVar) {
        return l.b(h.SCOPE_FOR_ERROR_CLASS, getName().f14247a, p0Var.toString());
    }

    @Override // aa.c, x9.p0
    public final x9.l e(r0 r0Var) {
        i9.l.e(r0Var, "substitutor");
        return this;
    }

    @Override // aa.o
    public final String toString() {
        String strB = getName().b();
        i9.l.d(strB, "asString(...)");
        return strB;
    }

    @Override // aa.c
    /* JADX INFO: renamed from: w0 */
    public final x9.e e(r0 r0Var) {
        i9.l.e(r0Var, "substitutor");
        return this;
    }
}
