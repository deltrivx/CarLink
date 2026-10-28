package c1;

import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import r2.f3;
import r2.g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i7, Object obj, Object obj2) {
        super(1);
        this.f1806a = i7;
        this.f1807b = obj;
        this.f1808c = obj2;
    }

    private final Object e(Object obj) {
        r2.s0 s0Var = (r2.s0) this.f1807b;
        r2.t0 t0Var = (r2.t0) this.f1808c;
        synchronized (s0Var.f11393e) {
            s0Var.f11395g.remove(t0Var);
        }
        return t8.z.f12851a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.k
    public final Object invoke(Object obj) {
        u0.q qVar;
        switch (this.f1806a) {
            case 0:
                q2.j0 j0Var = (q2.j0) obj;
                long j5 = ((x1.e) ((d1.j) this.f1807b).get()).f14535a;
                float fD = x1.e.d(j5);
                if (fD > 0.0f) {
                    float fR = j0Var.R(b1.f1820a);
                    a2.c cVar = j0Var.f10720a;
                    float fR2 = j0Var.R(((d0.h0) this.f1808c).a(j0Var.getLayoutDirection())) - fR;
                    float f10 = 2;
                    float fD2 = (fR * f10) + fD + fR2;
                    n3.o layoutDirection = j0Var.getLayoutDirection();
                    int[] iArr = z0.f2362a;
                    float fD3 = iArr[layoutDirection.ordinal()] == 1 ? x1.e.d(cVar.f16b.J()) - fD2 : fR2 < 0.0f ? 0.0f : fR2;
                    if (iArr[j0Var.getLayoutDirection().ordinal()] == 1) {
                        fD2 = x1.e.d(cVar.f16b.J()) - (fR2 >= 0.0f ? fR2 : 0.0f);
                    }
                    float f11 = fD2;
                    float fB = x1.e.b(j5);
                    float f12 = (-fB) / f10;
                    float f13 = fB / f10;
                    a2.b bVar = cVar.f16b;
                    long J = bVar.J();
                    bVar.z().h();
                    try {
                        ((a2.b) ((a2.d) bVar.f12b).f20b).z().l(fD3, f12, f11, f13, 0);
                        j0Var.b();
                    } finally {
                        ob.a.y(bVar, J);
                    }
                } else {
                    j0Var.b();
                }
                return t8.z.f12851a;
            case 1:
                y1.h0.m((a2.g) obj, (y1.h0) this.f1807b, ((r2) this.f1808c).a());
                return t8.z.f12851a;
            case 2:
                v1.c cVar2 = (v1.c) obj;
                return cVar2.b(new b2.a(19, new a1(1, ((y1.l0) this.f1807b).a(cVar2.f13592a.g(), cVar2.f13592a.getLayoutDirection(), cVar2), (r2) this.f1808c)));
            case 3:
                MotionEvent motionEvent = (MotionEvent) obj;
                k2.c0 c0Var = (k2.c0) this.f1808c;
                if (motionEvent.getActionMasked() == 0) {
                    da.a aVar = (da.a) this.f1807b;
                    k2.d0 d0Var = c0Var.f7193a;
                    if (d0Var == null) {
                        i9.l.j("onTouchEvent");
                        throw null;
                    }
                    aVar.f3848c = ((Boolean) d0Var.invoke(motionEvent)).booleanValue() ? k2.a0.f7184b : k2.a0.f7185c;
                } else {
                    k2.d0 d0Var2 = c0Var.f7193a;
                    if (d0Var2 == null) {
                        i9.l.j("onTouchEvent");
                        throw null;
                    }
                    d0Var2.invoke(motionEvent);
                }
                return t8.z.f12851a;
            case 4:
                q2.m0 m0Var = (q2.m0) obj;
                o2.b1 b1Var = (o2.b1) this.f1807b;
                if (b1Var.f9300o.f9412g.f() > 0) {
                    m0Var.f10747a = true;
                    q2.p0 p0Var = m0Var.f10750d;
                    o2.w wVarL0 = p0Var.l0();
                    if (n3.j.a(m0Var.f10748b, 9223372034707292159L)) {
                        m0Var.f10748b = o9.e0.O(wVarL0.t(0L));
                        m0Var.f10749c = wVarL0.l();
                    }
                    p0Var.n0().F.b();
                    long jL = wVarL0.l();
                    s.h0 h0Var = ((o2.q) this.f1808c).f9411f;
                    int i7 = (int) (jL >> 32);
                    int i10 = (int) (jL & 4294967295L);
                    for (o2.m1 m1Var : androidx.compose.ui.layout.b.f962b) {
                        Object objG = h0Var.g(m1Var);
                        i9.l.b(objG);
                        o2.o1 o1Var = (o2.o1) objG;
                        o2.n1 n1Var = (o2.n1) m1Var;
                        androidx.compose.ui.layout.b.a(m0Var, n1Var.f9385c, o1Var.f9396h, i7, i10);
                        if (((Boolean) o1Var.f9390b.getValue()).booleanValue()) {
                            androidx.compose.ui.layout.b.a(m0Var, o1Var.f9394f, o1Var.f9398j, i7, i10);
                            androidx.compose.ui.layout.b.a(m0Var, o1Var.f9395g, o1Var.k, i7, i10);
                        }
                        androidx.compose.ui.layout.b.a(m0Var, n1Var.f9386d, o1Var.f9397i, i7, i10);
                    }
                    if (b1Var.f9300o.f9413h.h()) {
                        s.d0 d0Var3 = b1Var.f9300o.f9413h;
                        Object[] objArr = d0Var3.f12407a;
                        int i11 = d0Var3.f12408b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            f1.b1 b1Var2 = (f1.b1) objArr[i12];
                            o2.p pVar = (o2.p) b1Var.f9300o.f9414i.get(i12);
                            Rect rect = (Rect) b1Var2.getValue();
                            m0Var.b(pVar.b(), rect.left);
                            m0Var.b(pVar.d(), rect.top);
                            m0Var.b(pVar.c(), rect.right);
                            m0Var.b(pVar.a(), rect.bottom);
                        }
                    }
                }
                return t8.z.f12851a;
            case 5:
                ((q2.h0) this.f1807b).d0(((r1.p) obj).a((r1.p) this.f1808c));
                return t8.z.f12851a;
            case 6:
                Context context = (Context) this.f1807b;
                Context applicationContext = context.getApplicationContext();
                r2.l0 l0Var = (r2.l0) this.f1808c;
                applicationContext.registerComponentCallbacks(l0Var);
                return new d0.u0(4, context, l0Var);
            case 7:
                Context context2 = (Context) this.f1807b;
                Context applicationContext2 = context2.getApplicationContext();
                r2.m0 m0Var2 = (r2.m0) this.f1808c;
                applicationContext2.registerComponentCallbacks(m0Var2);
                return new d0.u0(5, context2, m0Var2);
            case 8:
                return new r2.v1((u0.p) this.f1807b, new b1.a(14, (r2.p0) this.f1808c));
            case 9:
                r2.v1 v1Var = (r2.v1) this.f1807b;
                synchronized (v1Var.f11497c) {
                    try {
                        v1Var.f11499e = true;
                        h1.e eVar = v1Var.f11498d;
                        Object[] objArr2 = eVar.f6421a;
                        int i13 = eVar.f6423c;
                        for (int i14 = 0; i14 < i13; i14++) {
                            g3.l lVar = (g3.l) ((q2.e2) objArr2[i14]).get();
                            if (lVar != null && (qVar = lVar.f5873b) != null) {
                                lVar.a(qVar);
                                lVar.f5873b = null;
                            }
                        }
                        v1Var.f11498d.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                g3.x xVar = ((r2.p0) this.f1808c).f11360b;
                xVar.f5893b.set(null);
                xVar.f5892a.c();
                return t8.z.f12851a;
            case 10:
                return e(obj);
            case 11:
                ((Choreographer) ((f1.m1) this.f1807b).f5048b).removeFrameCallback((r2.t0) this.f1808c);
                return t8.z.f12851a;
            case 12:
                View view = (View) obj;
                View view2 = (View) this.f1807b;
                r2.r rVar = new r2.r(view.getNextFocusForwardId(), 1);
                View view3 = null;
                View view4 = null;
                while (true) {
                    View viewJ = r2.j0.j(view, rVar, view4);
                    if (viewJ != null || view == view2) {
                        view3 = viewJ;
                    } else {
                        Object parent = view.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view;
                            view = view5;
                        }
                    }
                }
                return Boolean.valueOf(view3 == ((View) this.f1808c));
            case 13:
                r2.l lVar2 = (r2.l) obj;
                h9.n nVar = (h9.n) this.f1808c;
                g3 g3Var = (g3) this.f1807b;
                if (!g3Var.f11244c) {
                    androidx.lifecycle.v vVarG = lVar2.f11318a.g();
                    g3Var.f11246e = nVar;
                    if (g3Var.f11245d == null) {
                        g3Var.f11245d = vVarG;
                        vVarG.a(g3Var);
                    } else if (vVarG.f1072c.compareTo(androidx.lifecycle.o.f1058c) >= 0) {
                        g3Var.f11243b.B(new n1.c(new f3(g3Var, nVar, 1), 1330788943, true));
                    }
                }
                return t8.z.f12851a;
            case 14:
                r3.v vVar = (r3.v) this.f1807b;
                vVar.setPositionProvider((r3.y) this.f1808c);
                vVar.m();
                return new r3.i();
            case 15:
                o2.u0.l((o2.u0) obj, (o2.v0) this.f1807b, ((y1.l) this.f1808c).f14928o);
                return t8.z.f12851a;
            default:
                o2.u0.l((o2.u0) obj, (o2.v0) this.f1807b, ((y1.m0) this.f1808c).A);
                return t8.z.f12851a;
        }
    }
}
