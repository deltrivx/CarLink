package ab;

import i9.l;
import nb.n0;
import nb.p0;
import nb.w;
import nb.x0;
import x9.r0;
import y9.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f505c;

    public /* synthetic */ d(p0 p0Var, int i7) {
        this.f504b = i7;
        this.f505c = p0Var;
    }

    @Override // nb.p0
    public boolean a() {
        switch (this.f504b) {
            case 0:
                return this.f505c.a();
            default:
                return super.a();
        }
    }

    @Override // nb.p0
    public boolean b() {
        switch (this.f504b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // nb.p0
    public final h c(h hVar) {
        switch (this.f504b) {
            case 0:
                l.e(hVar, "annotations");
                break;
            default:
                l.e(hVar, "annotations");
                break;
        }
        return this.f505c.c(hVar);
    }

    @Override // nb.p0
    public final n0 d(w wVar) {
        switch (this.f504b) {
            case 0:
                n0 n0VarD = this.f505c.d(wVar);
                if (n0VarD == null) {
                    return null;
                }
                x9.h hVarL = wVar.D0().l();
                return i2.c.v(n0VarD, hVarL instanceof r0 ? (r0) hVarL : null);
            default:
                return this.f505c.d(wVar);
        }
    }

    @Override // nb.p0
    public final boolean e() {
        switch (this.f504b) {
            case 0:
                break;
        }
        return this.f505c.e();
    }

    @Override // nb.p0
    public final w f(w wVar, x0 x0Var) {
        switch (this.f504b) {
            case 0:
                l.e(wVar, "topLevelType");
                l.e(x0Var, "position");
                break;
            default:
                l.e(wVar, "topLevelType");
                l.e(x0Var, "position");
                break;
        }
        return this.f505c.f(wVar, x0Var);
    }
}
