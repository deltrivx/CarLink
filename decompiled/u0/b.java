package u0;

import a8.u0;
import android.graphics.Rect;
import android.view.View;
import b3.o0;
import b3.q0;
import cc.b0;
import cc.o1;
import fc.s;
import fc.x;
import fc.y;
import g3.r;
import g3.w;
import java.lang.ref.WeakReference;
import l0.c1;
import n3.u;
import r2.j1;
import r2.k1;
import r2.n2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f12967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o1 f12968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f12969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f12970d;

    @Override // g3.r
    public final void a() {
        j(null);
    }

    @Override // g3.r
    public final void b() {
        n2 n2Var;
        l lVar = this.f12967a;
        if (lVar == null || (n2Var = (n2) q2.f.i(lVar, j1.f11283p)) == null) {
            return;
        }
        ((k1) n2Var).b();
    }

    @Override // g3.r
    public final void c() {
        o1 o1Var = this.f12968b;
        if (o1Var != null) {
            o1Var.a(null);
        }
        this.f12968b = null;
        s sVarI = i();
        if (sVarI != null) {
            x xVar = (x) sVarI;
            synchronized (xVar) {
                xVar.u(xVar.o() + ((long) xVar.k), xVar.f5614j, xVar.o() + ((long) xVar.k), xVar.o() + ((long) xVar.k) + ((long) xVar.f5615l));
            }
        }
    }

    @Override // g3.r
    public final void d(w wVar, g3.k kVar, u0 u0Var, l0.s sVar) {
        j(new c1(wVar, this, kVar, u0Var, sVar));
    }

    @Override // g3.r
    public final void e(x1.c cVar) {
        Rect rect;
        p pVar = this.f12969c;
        if (pVar != null) {
            pVar.f13024l = new Rect(k9.a.M(cVar.f14523a), k9.a.M(cVar.f14524b), k9.a.M(cVar.f14525c), k9.a.M(cVar.f14526d));
            if (!pVar.f13023j.isEmpty() || (rect = pVar.f13024l) == null) {
                return;
            }
            pVar.f13014a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // g3.r
    public final void f() {
        n2 n2Var;
        l lVar = this.f12967a;
        if (lVar == null || (n2Var = (n2) q2.f.i(lVar, j1.f11283p)) == null) {
            return;
        }
        ((k1) n2Var).a();
    }

    @Override // g3.r
    public final void g(w wVar, g3.q qVar, o0 o0Var, aa.a aVar, x1.c cVar, x1.c cVar2) {
        p pVar = this.f12969c;
        if (pVar != null) {
            m mVar = pVar.f13025m;
            synchronized (mVar.f12998c) {
                try {
                    mVar.f13005j = wVar;
                    mVar.f13006l = qVar;
                    mVar.k = o0Var;
                    mVar.f13007m = cVar;
                    mVar.f13008n = cVar2;
                    if (mVar.f13000e || mVar.f12999d) {
                        mVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // g3.r
    public final void h(w wVar, w wVar2) {
        p pVar = this.f12969c;
        if (pVar != null) {
            boolean z10 = (q0.b(pVar.f13021h.f5890b, wVar2.f5890b) && i9.l.a(pVar.f13021h.f5891c, wVar2.f5891c)) ? false : true;
            pVar.f13021h = wVar2;
            int size = pVar.f13023j.size();
            for (int i7 = 0; i7 < size; i7++) {
                q qVar = (q) ((WeakReference) pVar.f13023j.get(i7)).get();
                if (qVar != null) {
                    qVar.f13032g = wVar2;
                }
            }
            m mVar = pVar.f13025m;
            synchronized (mVar.f12998c) {
                mVar.f13005j = null;
                mVar.f13006l = null;
                mVar.k = null;
                mVar.f13007m = null;
                mVar.f13008n = null;
            }
            if (i9.l.a(wVar, wVar2)) {
                if (z10) {
                    k kVar = pVar.f13015b;
                    int iF = q0.f(wVar2.f5890b);
                    int iE = q0.e(wVar2.f5890b);
                    q0 q0Var = pVar.f13021h.f5891c;
                    int iF2 = q0Var != null ? q0.f(q0Var.f1430a) : -1;
                    q0 q0Var2 = pVar.f13021h.f5891c;
                    kVar.U0().updateSelection((View) kVar.f12990b, iF, iE, iF2, q0Var2 != null ? q0.e(q0Var2.f1430a) : -1);
                    return;
                }
                return;
            }
            if (wVar != null && (!i9.l.a(wVar.f5889a.f1353b, wVar2.f5889a.f1353b) || (q0.b(wVar.f5890b, wVar2.f5890b) && !i9.l.a(wVar.f5891c, wVar2.f5891c)))) {
                k kVar2 = pVar.f13015b;
                kVar2.U0().restartInput((View) kVar2.f12990b);
                return;
            }
            int size2 = pVar.f13023j.size();
            for (int i10 = 0; i10 < size2; i10++) {
                q qVar2 = (q) ((WeakReference) pVar.f13023j.get(i10)).get();
                if (qVar2 != null) {
                    w wVar3 = pVar.f13021h;
                    k kVar3 = pVar.f13015b;
                    if (qVar2.k) {
                        qVar2.f13032g = wVar3;
                        if (qVar2.f13034i) {
                            kVar3.U0().updateExtractedText((View) kVar3.f12990b, qVar2.f13033h, u.g(wVar3));
                        }
                        q0 q0Var3 = wVar3.f5891c;
                        long j5 = wVar3.f5890b;
                        int iF3 = q0Var3 != null ? q0.f(q0Var3.f1430a) : -1;
                        q0 q0Var4 = wVar3.f5891c;
                        kVar3.U0().updateSelection((View) kVar3.f12990b, q0.f(j5), q0.e(j5), iF3, q0Var4 != null ? q0.e(q0Var4.f1430a) : -1);
                    }
                }
            }
        }
    }

    public final s i() {
        x xVar = this.f12970d;
        if (xVar != null) {
            return xVar;
        }
        if (!t0.b.f12725a) {
            return null;
        }
        x xVarA = y.a(0, 2, ec.a.f4687c);
        this.f12970d = xVarA;
        return xVarA;
    }

    public final void j(c1 c1Var) {
        l lVar = this.f12967a;
        if (lVar == null) {
            return;
        }
        o1 o1Var = null;
        this.f12968b = lVar.f11129n ? b0.s(lVar.m0(), null, new b0.g(lVar, new fc.i(c1Var, this, lVar, o1Var, 4), o1Var, 18), 1) : null;
    }

    public final void k(l lVar) {
        if (this.f12967a != lVar) {
            c0.b.c("Expected textInputModifierNode to be " + lVar + " but was " + this.f12967a);
        }
        this.f12967a = null;
    }
}
