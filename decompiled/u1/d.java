package u1;

import i9.x;
import l0.o0;
import n3.l;
import n4.h;
import q2.d2;
import q2.f;
import q2.w;
import q3.e;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o implements d2, w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f13040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f13041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f13042q;

    public final boolean A0(o0 o0Var) {
        d dVar = this.f13040o;
        if (dVar != null) {
            return dVar.A0(o0Var);
        }
        d dVar2 = this.f13041p;
        if (dVar2 != null) {
            return dVar2.A0(o0Var);
        }
        return false;
    }

    public final void B0(o0 o0Var) {
        d dVar = this.f13041p;
        if (dVar != null) {
            dVar.B0(o0Var);
            return;
        }
        d dVar2 = this.f13040o;
        if (dVar2 != null) {
            dVar2.B0(o0Var);
        }
    }

    public final void C0(o0 o0Var) {
        d dVar = this.f13041p;
        if (dVar != null) {
            dVar.C0(o0Var);
        }
        d dVar2 = this.f13040o;
        if (dVar2 != null) {
            dVar2.C0(o0Var);
        }
        this.f13040o = null;
    }

    public final void D0(o0 o0Var) {
        d2 d2Var;
        d dVar;
        d dVar2 = this.f13040o;
        if (dVar2 == null || !h.i(dVar2, l.B(o0Var))) {
            if (this.f11117a.f11129n) {
                x xVar = new x();
                f.A(this, new e(xVar, this, o0Var));
                d2Var = (d2) xVar.f6688a;
            } else {
                d2Var = null;
            }
            dVar = (d) d2Var;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            dVar.B0(o0Var);
            dVar.D0(o0Var);
            d dVar3 = this.f13041p;
            if (dVar3 != null) {
                dVar3.C0(o0Var);
            }
        } else if (dVar == null && dVar2 != null) {
            d dVar4 = this.f13041p;
            if (dVar4 != null) {
                dVar4.B0(o0Var);
                dVar4.D0(o0Var);
            }
            dVar2.C0(o0Var);
        } else if (!i9.l.a(dVar, dVar2)) {
            if (dVar != null) {
                dVar.B0(o0Var);
                dVar.D0(o0Var);
            }
            if (dVar2 != null) {
                dVar2.C0(o0Var);
            }
        } else if (dVar != null) {
            dVar.D0(o0Var);
        } else {
            d dVar5 = this.f13041p;
            if (dVar5 != null) {
                dVar5.D0(o0Var);
            }
        }
        this.f13040o = dVar;
    }

    public final void E0(o0 o0Var) {
        d dVar = this.f13041p;
        if (dVar != null) {
            dVar.E0(o0Var);
            return;
        }
        d dVar2 = this.f13040o;
        if (dVar2 != null) {
            dVar2.E0(o0Var);
        }
    }

    @Override // q2.w
    public final /* synthetic */ void T(o2.w wVar) {
    }

    @Override // q2.d2
    public final Object k() {
        return c.f13039a;
    }

    @Override // q2.w
    public final void n(long j5) {
        this.f13042q = j5;
    }

    @Override // r1.o
    public final void s0() {
        this.f13041p = null;
        this.f13040o = null;
    }
}
