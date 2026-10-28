package q3;

import android.view.View;
import android.view.ViewTreeObserver;
import q2.q1;
import r2.u;
import w1.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends r1.o implements w1.n, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f10941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f10942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f10943q = new n(this, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f10944r = new n(this, 1);

    public final s A0() {
        if (!this.f11117a.f11129n) {
            n2.a.b("visitLocalDescendants called on an unattached node");
        }
        r1.o oVar = this.f11117a;
        if ((oVar.f11120d & 1024) != 0) {
            boolean z10 = false;
            for (r1.o oVar2 = oVar.f11122f; oVar2 != null; oVar2 = oVar2.f11122f) {
                if ((oVar2.f11119c & 1024) != 0) {
                    r1.o oVarF = oVar2;
                    h1.e eVar = null;
                    while (oVarF != null) {
                        if (oVarF instanceof s) {
                            s sVar = (s) oVarF;
                            if (z10) {
                                return sVar;
                            }
                            z10 = true;
                        } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                            int i7 = 0;
                            for (r1.o oVar3 = ((q2.m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                                if ((oVar3.f11119c & 1024) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        oVarF = oVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new h1.e(new r1.o[16]);
                                        }
                                        if (oVarF != null) {
                                            eVar.b(oVarF);
                                            oVarF = null;
                                        }
                                        eVar.b(oVar3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        oVarF = q2.f.f(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (q2.f.v(this).f10678m == null) {
            return;
        }
        View viewC = j.c(this);
        w1.i focusOwner = ((u) q2.f.w(this)).getFocusOwner();
        q1 q1VarW = q2.f.w(this);
        boolean z10 = (view == null || view.equals(q1VarW) || !j.a(viewC, view)) ? false : true;
        boolean z11 = (view2 == null || view2.equals(q1VarW) || !j.a(viewC, view2)) ? false : true;
        if (z10 && z11) {
            this.f10941o = view2;
            return;
        }
        if (z11) {
            this.f10941o = view2;
            s sVarA0 = A0();
            if (sVarA0.C0().a()) {
                return;
            }
            w1.f.v(sVarA0);
            return;
        }
        if (!z10) {
            this.f10941o = null;
            return;
        }
        this.f10941o = null;
        if (A0().C0().b()) {
            ((w1.j) focusOwner).b(8, false, false);
        }
    }

    @Override // r1.o
    public final void q0() {
        ViewTreeObserver viewTreeObserver = q2.f.x(this).getViewTreeObserver();
        this.f10942p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // r1.o
    public final void s0() {
        ViewTreeObserver viewTreeObserver = this.f10942p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f10942p = null;
        q2.f.x(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f10941o = null;
    }

    @Override // w1.n
    public final void t(w1.k kVar) {
        kVar.c(false);
        kVar.b(this.f10943q);
        kVar.d(this.f10944r);
    }
}
