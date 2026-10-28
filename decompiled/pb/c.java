package pb;

import aa.s0;
import aa.z;
import ga.o;
import java.util.Collection;
import l0.o0;
import x9.n0;
import x9.s;
import x9.t;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends s0 {
    @Override // aa.z
    /* JADX INFO: renamed from: C0 */
    public final s0 W(x9.k kVar, x xVar, o oVar) {
        i9.l.e(kVar, "newOwner");
        i9.l.e(oVar, "visibility");
        a2.f.M(2, "kind");
        return this;
    }

    @Override // aa.s0, aa.z
    public final z E0(int i7, wa.e eVar, x9.k kVar, t tVar, n0 n0Var, y9.h hVar) {
        i9.l.e(kVar, "newOwner");
        a2.f.M(i7, "kind");
        i9.l.e(hVar, "annotations");
        return this;
    }

    @Override // aa.z, x9.b
    public final Object K(x9.a aVar) {
        return null;
    }

    @Override // aa.z, x9.c
    public final /* bridge */ /* synthetic */ x9.c W(x9.e eVar, x xVar, o oVar) {
        W(eVar, xVar, oVar);
        return this;
    }

    @Override // aa.z, x9.c
    public final void m0(Collection collection) {
        i9.l.e(collection, "overriddenDescriptors");
    }

    @Override // aa.z, x9.t
    public final boolean o() {
        return false;
    }

    @Override // aa.s0, aa.z, x9.t
    public final s s0() {
        return new o0(14, this);
    }
}
