package ab;

import i9.l;
import java.util.Collection;
import java.util.List;
import nb.n0;
import nb.w;
import nb.x0;
import ob.j;
import u9.i;
import x9.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f503b;

    public c(n0 n0Var) {
        l.e(n0Var, "projection");
        this.f502a = n0Var;
        n0Var.a();
    }

    @Override // ab.b
    public final n0 a() {
        return this.f502a;
    }

    @Override // nb.k0
    public final i k() {
        i iVarK = this.f502a.b().D0().k();
        l.d(iVarK, "getBuiltIns(...)");
        return iVarK;
    }

    @Override // nb.k0
    public final /* bridge */ /* synthetic */ h l() {
        return null;
    }

    @Override // nb.k0
    public final Collection m() {
        n0 n0Var = this.f502a;
        w wVarB = n0Var.a() == x0.OUT_VARIANCE ? n0Var.b() : k().p();
        l.b(wVarB);
        return n3.l.I(wVarB);
    }

    @Override // nb.k0
    public final List n() {
        return u8.w.f13122a;
    }

    @Override // nb.k0
    public final boolean o() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f502a + ')';
    }
}
