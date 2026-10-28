package i0;

import a8.j1;
import a8.t0;
import cc.b0;
import q2.h1;
import q2.w;
import r1.o;
import t8.z;
import z.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends o implements v2.a, w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f6580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6581p;

    public static final x1.c A0(e eVar, h1 h1Var, k2.d dVar) {
        x1.c cVar;
        if (eVar.f11129n && eVar.f6581p) {
            h1 h1VarU = q2.f.u(eVar);
            if (!h1Var.G0().f11129n) {
                h1Var = null;
            }
            if (h1Var != null && (cVar = (x1.c) dVar.invoke()) != null) {
                return cVar.i(h1VarU.h(h1Var, false).d());
            }
        }
        return null;
    }

    @Override // q2.w
    public final void T(o2.w wVar) {
        this.f6581p = true;
    }

    @Override // q2.w
    public final /* synthetic */ void n(long j5) {
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // v2.a
    public final Object v(h1 h1Var, k2.d dVar, a9.c cVar) {
        Object objG = b0.g(new t0(this, h1Var, dVar, new j1(this, h1Var, dVar, 6), null), cVar);
        return objG == z8.a.f15774a ? objG : z.f12851a;
    }
}
