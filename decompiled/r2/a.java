package r2;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.baidu.carlifevehicle.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f11132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f11133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g3 f11134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1.v f11135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p2 f11136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11139h;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        o.e eVar = new o.e(3, this);
        addOnAttachStateChangeListener(eVar);
        b3.l0 l0Var = new b3.l0(7);
        o9.e0.D(this).f6952a.add(l0Var);
        this.f11136e = new p2(this, eVar, l0Var);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(f1.v vVar) {
        if (this.f11135d != vVar) {
            this.f11135d = vVar;
            if (vVar != null) {
                this.f11132a = null;
            }
            g3 g3Var = this.f11134c;
            if (g3Var != null) {
                g3Var.f();
                this.f11134c = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f11133b != iBinder) {
            this.f11133b = iBinder;
            this.f11132a = null;
        }
    }

    public abstract void a(int i7, f1.s sVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        b();
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i10) {
        b();
        super.addView(view, i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i7, layoutParams, z10);
    }

    public final void b() {
        if (this.f11138g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f11134c == null) {
            try {
                this.f11138g = true;
                this.f11134c = h3.a(this, g(), new n1.c(new c1.n(2, this), -656146368, true));
            } finally {
                this.f11138g = false;
            }
        }
    }

    public void e(boolean z10, int i7, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i7) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    public void f(int i7, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i7, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i7)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final f1.v g() {
        f1.c2 c2Var;
        y8.h hVar;
        f1.m1 m1Var;
        Object parent;
        f1.v vVarB = this.f11135d;
        if (vVarB == null) {
            vVarB = d3.b(this);
            if (vVarB == null) {
                ViewParent parent2 = getParent();
                while (true) {
                    if (vVarB != null || !(parent instanceof View)) {
                        parent = parent2;
                        break;
                    }
                    parent = parent2;
                    View view = (View) parent;
                    vVarB = d3.b(view);
                    parent = view.getParent();
                }
            }
            boolean z10 = false;
            if (vVarB != null) {
                f1.v vVar = (!(vVarB instanceof f1.c2) || ((f1.x1) ((f1.c2) vVarB).f4921t.getValue()).compareTo(f1.x1.f5198b) > 0) ? vVarB : null;
                if (vVar != null) {
                    this.f11132a = new WeakReference(vVar);
                }
            } else {
                vVarB = null;
            }
            if (vVarB == null) {
                WeakReference weakReference = this.f11132a;
                if (weakReference == null || (vVarB = (f1.v) weakReference.get()) == null || ((vVarB instanceof f1.c2) && ((f1.x1) ((f1.c2) vVarB).f4921t.getValue()).compareTo(f1.x1.f5198b) <= 0)) {
                    vVarB = null;
                }
                if (vVarB == null) {
                    if (!isAttachedToWindow()) {
                        n2.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent3 = getParent();
                    while (parent3 instanceof View) {
                        View view3 = (View) parent3;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent3 = view3.getParent();
                    }
                    f1.v vVarB2 = d3.b(view2);
                    if (vVarB2 == null) {
                        ((w2) x2.f11508a.get()).getClass();
                        y8.h hVar2 = y8.i.f15108a;
                        t8.o oVar = s0.f11389m;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (y8.h) s0.f11389m.getValue();
                        } else {
                            hVar = (y8.h) s0.f11390n.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        y8.h hVarS = hVar.s(hVar2);
                        f1.x0 x0Var = (f1.x0) hVarS.l(f1.w0.f5183b);
                        if (x0Var != null) {
                            m1Var = new f1.m1(x0Var);
                            f1.t0 t0Var = (f1.t0) m1Var.f5049c;
                            synchronized (t0Var.f5149b) {
                                t0Var.f5148a = false;
                            }
                        } else {
                            m1Var = null;
                        }
                        i9.x xVar = new i9.x();
                        y8.h x1Var = (r1.q) hVarS.l(r1.c.f11105o);
                        if (x1Var == null) {
                            x1Var = new x1();
                            xVar.f6688a = x1Var;
                        }
                        if (m1Var != null) {
                            hVar2 = m1Var;
                        }
                        y8.h hVarS2 = hVarS.s(hVar2).s(x1Var);
                        c2Var = new f1.c2(hVarS2);
                        c2Var.F();
                        hc.c cVarA = cc.b0.a(hVarS2);
                        androidx.lifecycle.t tVarE = androidx.lifecycle.i0.e(view2);
                        androidx.lifecycle.v vVarG = tVarE != null ? tVarE.g() : null;
                        if (vVarG == null) {
                            n2.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new cc.s();
                        }
                        view2.addOnAttachStateChangeListener(new y2(view2, c2Var));
                        vVarG.a(new b3(cVarA, m1Var, c2Var, xVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c2Var);
                        cc.v0 v0Var = cc.v0.f2679a;
                        Handler handler = view2.getHandler();
                        int i7 = dc.e.f3907a;
                        view2.addOnAttachStateChangeListener(new o.e(4, cc.b0.s(v0Var, new dc.d(handler, "windowRecomposer cleanup", false).f3906f, new b0.g(c2Var, view2, z10 ? 1 : 0, 13), 2)));
                    } else {
                        if (!(vVarB2 instanceof f1.c2)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c2Var = (f1.c2) vVarB2;
                    }
                    f1.c2 c2Var2 = ((f1.x1) c2Var.f4921t.getValue()).compareTo(f1.x1.f5198b) > 0 ? c2Var : null;
                    if (c2Var2 != null) {
                        this.f11132a = new WeakReference(c2Var2);
                    }
                    return c2Var;
                }
            }
        }
        return vVarB;
    }

    public final boolean getHasComposition() {
        return this.f11134c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f11137f;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f11139h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        e(z10, i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        c();
        f(i7, i10);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i7);
        }
    }

    public final void setParentCompositionContext(f1.v vVar) {
        setParentContext(vVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f11137f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((u) ((q2.q1) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f11139h = true;
    }

    public final void setViewCompositionStrategy(q2 q2Var) {
        p2 p2Var = this.f11136e;
        if (p2Var != null) {
            p2Var.invoke();
        }
        ((j0) q2Var).getClass();
        o.e eVar = new o.e(3, this);
        addOnAttachStateChangeListener(eVar);
        b3.l0 l0Var = new b3.l0(7);
        o9.e0.D(this).f6952a.add(l0Var);
        this.f11136e = new p2(this, eVar, l0Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
