package g3;

import a8.u0;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b3.o0;
import b3.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.b f5900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f5901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h9.k f5903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h9.k f5904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f5905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f5906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f5907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f5908j;
    public Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f5909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1.e f5910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.lifecycle.z f5911n;

    public z(View view, r2.u uVar) {
        a2.b bVar = new a2.b(view);
        a0 a0Var = new a0(Choreographer.getInstance());
        this.f5899a = view;
        this.f5900b = bVar;
        this.f5901c = a0Var;
        this.f5903e = b.f5826d;
        this.f5904f = b.f5827e;
        this.f5905g = new w("", q0.f1428b, 4);
        this.f5906h = k.f5865g;
        this.f5907i = new ArrayList();
        this.f5908j = t8.a.c(t8.i.f12828b, new b1.a(6, this));
        this.f5909l = new c(uVar, bVar);
        this.f5910m = new h1.e(new y[16]);
    }

    @Override // g3.r
    public final void a() {
        i(y.f5894a);
    }

    @Override // g3.r
    public final void b() {
        i(y.f5896c);
    }

    @Override // g3.r
    public final void c() {
        this.f5902d = false;
        this.f5903e = b.f5828f;
        this.f5904f = b.f5829g;
        this.k = null;
        i(y.f5895b);
    }

    @Override // g3.r
    public final void d(w wVar, k kVar, u0 u0Var, l0.s sVar) {
        this.f5902d = true;
        this.f5905g = wVar;
        this.f5906h = kVar;
        this.f5903e = u0Var;
        this.f5904f = sVar;
        i(y.f5894a);
    }

    @Override // g3.r
    public final void e(x1.c cVar) {
        Rect rect;
        this.k = new Rect(k9.a.M(cVar.f14523a), k9.a.M(cVar.f14524b), k9.a.M(cVar.f14525c), k9.a.M(cVar.f14526d));
        if (!this.f5907i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.f5899a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // g3.r
    public final void f() {
        i(y.f5897d);
    }

    @Override // g3.r
    public final void g(w wVar, q qVar, o0 o0Var, aa.a aVar, x1.c cVar, x1.c cVar2) {
        c cVar3 = this.f5909l;
        synchronized (cVar3.f5835c) {
            try {
                cVar3.f5842j = wVar;
                cVar3.f5843l = qVar;
                cVar3.k = o0Var;
                cVar3.f5844m = aVar;
                cVar3.f5845n = cVar;
                cVar3.f5846o = cVar2;
                if (cVar3.f5837e || cVar3.f5836d) {
                    cVar3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, t8.h] */
    @Override // g3.r
    public final void h(w wVar, w wVar2) {
        boolean z10 = (q0.b(this.f5905g.f5890b, wVar2.f5890b) && i9.l.a(this.f5905g.f5891c, wVar2.f5891c)) ? false : true;
        this.f5905g = wVar2;
        int size = this.f5907i.size();
        for (int i7 = 0; i7 < size; i7++) {
            s sVar = (s) ((WeakReference) this.f5907i.get(i7)).get();
            if (sVar != null) {
                sVar.f5878d = wVar2;
            }
        }
        c cVar = this.f5909l;
        synchronized (cVar.f5835c) {
            cVar.f5842j = null;
            cVar.f5843l = null;
            cVar.k = null;
            cVar.f5844m = b.f5824b;
            cVar.f5845n = null;
            cVar.f5846o = null;
        }
        if (i9.l.a(wVar, wVar2)) {
            if (z10) {
                a2.b bVar = this.f5900b;
                int iF = q0.f(wVar2.f5890b);
                int iE = q0.e(wVar2.f5890b);
                q0 q0Var = this.f5905g.f5891c;
                int iF2 = q0Var != null ? q0.f(q0Var.f1430a) : -1;
                q0 q0Var2 = this.f5905g.f5891c;
                ((InputMethodManager) bVar.f13c.getValue()).updateSelection((View) bVar.f12b, iF, iE, iF2, q0Var2 != null ? q0.e(q0Var2.f1430a) : -1);
                return;
            }
            return;
        }
        if (wVar != null && (!i9.l.a(wVar.f5889a.f1353b, wVar2.f5889a.f1353b) || (q0.b(wVar.f5890b, wVar2.f5890b) && !i9.l.a(wVar.f5891c, wVar2.f5891c)))) {
            a2.b bVar2 = this.f5900b;
            ((InputMethodManager) bVar2.f13c.getValue()).restartInput((View) bVar2.f12b);
            return;
        }
        int size2 = this.f5907i.size();
        for (int i10 = 0; i10 < size2; i10++) {
            s sVar2 = (s) ((WeakReference) this.f5907i.get(i10)).get();
            if (sVar2 != null) {
                w wVar3 = this.f5905g;
                a2.b bVar3 = this.f5900b;
                if (sVar2.f5882h) {
                    sVar2.f5878d = wVar3;
                    if (sVar2.f5880f) {
                        ((InputMethodManager) bVar3.f13c.getValue()).updateExtractedText((View) bVar3.f12b, sVar2.f5879e, i2.c.S(wVar3));
                    }
                    q0 q0Var3 = wVar3.f5891c;
                    long j5 = wVar3.f5890b;
                    int iF3 = q0Var3 != null ? q0.f(q0Var3.f1430a) : -1;
                    q0 q0Var4 = wVar3.f5891c;
                    ((InputMethodManager) bVar3.f13c.getValue()).updateSelection((View) bVar3.f12b, q0.f(j5), q0.e(j5), iF3, q0Var4 != null ? q0.e(q0Var4.f1430a) : -1);
                }
            }
        }
    }

    public final void i(y yVar) {
        this.f5910m.b(yVar);
        if (this.f5911n == null) {
            androidx.lifecycle.z zVar = new androidx.lifecycle.z(9, this);
            this.f5901c.execute(zVar);
            this.f5911n = zVar;
        }
    }
}
