package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f11947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11948e;

    public /* synthetic */ g(int i7) {
        this.f11945b = i7;
    }

    public static g f() {
        g gVar = new g(1);
        gVar.f11947d = Collections.EMPTY_LIST;
        gVar.f11948e = -1;
        return gVar;
    }

    @Override // xa.i
    public final xa.a a() {
        switch (this.f11945b) {
            case 0:
                h hVarD = d();
                if (hVarD.isInitialized()) {
                    return hVarD;
                }
                throw new cc.s();
            default:
                y0 y0VarE = e();
                if (y0VarE.isInitialized()) {
                    return y0VarE;
                }
                throw new cc.s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        switch (this.f11945b) {
            case 0:
                h hVar = null;
                try {
                    try {
                        g((h) h.f11961h.a(eVar, gVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (hVar != null) {
                            g(hVar);
                        }
                        throw th;
                    }
                } catch (xa.q e7) {
                    h hVar2 = (h) e7.f14823a;
                    try {
                        throw e7;
                    } catch (Throwable th2) {
                        th = th2;
                        hVar = hVar2;
                        if (hVar != null) {
                            g(hVar);
                        }
                        throw th;
                    }
                }
            default:
                y0 y0Var = null;
                try {
                    try {
                        y0.f12279h.getClass();
                        h(new y0(eVar, gVar));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (y0Var != null) {
                            h(y0Var);
                        }
                        throw th;
                    }
                } catch (xa.q e10) {
                    y0 y0Var2 = (y0) e10.f14823a;
                    try {
                        throw e10;
                    } catch (Throwable th4) {
                        th = th4;
                        y0Var = y0Var2;
                        if (y0Var != null) {
                            h(y0Var);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        switch (this.f11945b) {
            case 0:
                g((h) nVar);
                break;
            default:
                h((y0) nVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f11945b) {
            case 0:
                g gVar = new g(0);
                gVar.f11947d = Collections.EMPTY_LIST;
                gVar.g(d());
                return gVar;
            default:
                g gVarF = f();
                gVarF.h(e());
                return gVarF;
        }
    }

    public h d() {
        h hVar = new h(this);
        int i7 = this.f11946c;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        hVar.f11964c = this.f11948e;
        if ((i7 & 2) == 2) {
            this.f11947d = Collections.unmodifiableList(this.f11947d);
            this.f11946c &= -3;
        }
        hVar.f11965d = this.f11947d;
        hVar.f11963b = i10;
        return hVar;
    }

    public y0 e() {
        y0 y0Var = new y0(this);
        int i7 = this.f11946c;
        if ((i7 & 1) == 1) {
            this.f11947d = Collections.unmodifiableList(this.f11947d);
            this.f11946c &= -2;
        }
        y0Var.f12282c = this.f11947d;
        int i10 = (i7 & 2) != 2 ? 0 : 1;
        y0Var.f12283d = this.f11948e;
        y0Var.f12281b = i10;
        return y0Var;
    }

    public void g(h hVar) {
        if (hVar == h.f11960g) {
            return;
        }
        if ((hVar.f11963b & 1) == 1) {
            int i7 = hVar.f11964c;
            this.f11946c = 1 | this.f11946c;
            this.f11948e = i7;
        }
        if (!hVar.f11965d.isEmpty()) {
            if (this.f11947d.isEmpty()) {
                this.f11947d = hVar.f11965d;
                this.f11946c &= -3;
            } else {
                if ((this.f11946c & 2) != 2) {
                    this.f11947d = new ArrayList(this.f11947d);
                    this.f11946c |= 2;
                }
                this.f11947d.addAll(hVar.f11965d);
            }
        }
        this.f14792a = this.f14792a.d(hVar.f11962a);
    }

    public void h(y0 y0Var) {
        if (y0Var == y0.f12278g) {
            return;
        }
        if (!y0Var.f12282c.isEmpty()) {
            if (this.f11947d.isEmpty()) {
                this.f11947d = y0Var.f12282c;
                this.f11946c &= -2;
            } else {
                if ((this.f11946c & 1) != 1) {
                    this.f11947d = new ArrayList(this.f11947d);
                    this.f11946c |= 1;
                }
                this.f11947d.addAll(y0Var.f12282c);
            }
        }
        if ((y0Var.f12281b & 1) == 1) {
            int i7 = y0Var.f12283d;
            this.f11946c |= 2;
            this.f11948e = i7;
        }
        this.f14792a = this.f14792a.d(y0Var.f12280a);
    }
}
