package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.baidu.carlifevehicle.R;
import e4.c0;
import e4.d1;
import e4.e0;
import e4.e1;
import e4.f1;
import e4.g1;
import e4.h1;
import e4.l;
import e4.l0;
import e4.m;
import e4.n;
import e4.o1;
import e4.s1;
import j.k0;
import java.util.WeakHashMap;
import n.j;
import o.x;
import p.b;
import p.c;
import p.d;
import p.e;
import p.e3;
import p.f;
import p.k;
import p.k1;
import p.l1;
import p.z2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k1, l, m {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final s1 D;
    public static final Rect E;
    public final n A;
    public final f B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l1 f668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f673j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s1 f679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s1 f680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s1 f681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s1 f682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OverScroller f684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f688z;

    static {
        h1 e1Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            e1Var = new g1();
        } else if (i7 >= 30) {
            e1Var = new f1();
        } else {
            e1Var = i7 >= 29 ? new e1() : new d1();
        }
        e1Var.g(x3.b.b(0, 1, 0, 1));
        D = e1Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f665b = 0;
        this.f675m = new Rect();
        this.f676n = new Rect();
        this.f677o = new Rect();
        this.f678p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        s1 s1Var = s1.f4397b;
        this.f679q = s1Var;
        this.f680r = s1Var;
        this.f681s = s1Var;
        this.f682t = s1Var;
        this.f686x = new b(this);
        this.f687y = new c(this, 0);
        this.f688z = new c(this, 1);
        d(context);
        this.A = new n(0);
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.B = fVar;
        addView(fVar);
    }

    public static boolean b(View view, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i10 = rect.left;
        if (i7 != i10) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    @Override // e4.l
    public final void a(NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(nestedScrollView, i7, i10, i11, i12);
        }
    }

    public final void c() {
        removeCallbacks(this.f687y);
        removeCallbacks(this.f688z);
        ViewPropertyAnimator viewPropertyAnimator = this.f685w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void d(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f664a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f669f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f684v = new OverScroller(context);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f669f != null) {
            if (this.f667d.getVisibility() == 0) {
                translationY = (int) (this.f667d.getTranslationY() + this.f667d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f669f.setBounds(0, translationY, getWidth(), this.f669f.getIntrinsicHeight() + translationY);
            this.f669f.draw(canvas);
        }
    }

    @Override // e4.l
    public final void e(int i7, int i10, int i11, int[] iArr) {
    }

    @Override // e4.l
    public final boolean f(View view, View view2, int i7, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // e4.l
    public final void g(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f667d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n nVar = this.A;
        return nVar.f4381c | nVar.f4380b;
    }

    public CharSequence getTitle() {
        k();
        return ((e3) this.f668e).f9704a.getTitle();
    }

    @Override // e4.l
    public final void h(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // e4.m
    public final void i(NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        a(nestedScrollView, i7, i10, i11, i12, i13);
    }

    public final void j(int i7) {
        k();
        if (i7 == 2) {
            ((e3) this.f668e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i7 == 5) {
            ((e3) this.f668e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        l1 wrapper;
        if (this.f666c == null) {
            this.f666c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f667d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof l1) {
                wrapper = (l1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f668e = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        e3 e3Var = (e3) this.f668e;
        Toolbar toolbar = e3Var.f9704a;
        if (e3Var.f9715m == null) {
            e3Var.f9715m = new k(toolbar.getContext());
        }
        k kVar = e3Var.f9715m;
        kVar.f9802e = xVar;
        o.m mVar = (o.m) menu;
        if (mVar == null && toolbar.f715a == null) {
            return;
        }
        toolbar.f();
        o.m mVar2 = toolbar.f715a.f689p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.K);
            mVar2.r(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new z2(toolbar);
        }
        kVar.f9813q = true;
        if (mVar != null) {
            mVar.b(kVar, toolbar.f724j);
            mVar.b(toolbar.L, toolbar.f724j);
        } else {
            kVar.c(toolbar.f724j, null);
            toolbar.L.c(toolbar.f724j, null);
            kVar.g();
            toolbar.L.g();
        }
        toolbar.f715a.setPopupTheme(toolbar.k);
        toolbar.f715a.setPresenter(kVar);
        toolbar.K = kVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        s1 s1VarC = s1.c(this, windowInsets);
        o1 o1Var = s1VarC.f4398a;
        boolean zB = b(this.f667d, new Rect(o1Var.l().f14563a, o1Var.l().f14564b, o1Var.l().f14565c, o1Var.l().f14566d), false);
        WeakHashMap weakHashMap = l0.f4369a;
        Rect rect = this.f675m;
        e0.b(this, s1VarC, rect);
        s1 s1VarN = o1Var.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f679q = s1VarN;
        boolean z10 = true;
        if (!this.f680r.equals(s1VarN)) {
            this.f680r = this.f679q;
            zB = true;
        }
        Rect rect2 = this.f676n;
        if (rect2.equals(rect)) {
            z10 = zB;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return o1Var.a().f4398a.c().f4398a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d(getContext());
        WeakHashMap weakHashMap = l0.f4369a;
        c0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f9  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        s1 s1Var;
        int i11;
        h1 d1Var;
        k();
        measureChildWithMargins(this.f667d, i7, 0, i10, 0);
        e eVar = (e) this.f667d.getLayoutParams();
        int iMax = Math.max(0, this.f667d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f667d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f667d.getMeasuredState());
        WeakHashMap weakHashMap = l0.f4369a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.f664a;
            if (this.f671h && this.f667d.getTabContainer() != null) {
                measuredHeight += this.f664a;
            }
        } else {
            measuredHeight = this.f667d.getVisibility() != 8 ? this.f667d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f675m;
        Rect rect2 = this.f677o;
        rect2.set(rect);
        this.f681s = this.f679q;
        if (this.f670g || z10) {
            x3.b bVarB = x3.b.b(this.f681s.f4398a.l().f14563a, this.f681s.f4398a.l().f14564b + measuredHeight, this.f681s.f4398a.l().f14565c, this.f681s.f4398a.l().f14566d);
            s1Var = this.f681s;
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                d1Var = new g1(s1Var);
            } else if (i11 >= 30) {
                d1Var = new f1(s1Var);
            } else if (i11 >= 29) {
                d1Var = new e1(s1Var);
            } else {
                d1Var = new d1(s1Var);
            }
            d1Var.g(bVarB);
            this.f681s = d1Var.b();
        } else {
            f fVar = this.B;
            s1 s1Var2 = D;
            Rect rect3 = this.f678p;
            e0.b(fVar, s1Var2, rect3);
            if (rect3.equals(E)) {
                x3.b bVarB2 = x3.b.b(this.f681s.f4398a.l().f14563a, this.f681s.f4398a.l().f14564b + measuredHeight, this.f681s.f4398a.l().f14565c, this.f681s.f4398a.l().f14566d);
                s1Var = this.f681s;
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 34) {
                    d1Var = new g1(s1Var);
                } else if (i11 >= 30) {
                    d1Var = new f1(s1Var);
                } else if (i11 >= 29) {
                    d1Var = new e1(s1Var);
                } else {
                    d1Var = new d1(s1Var);
                }
                d1Var.g(bVarB2);
                this.f681s = d1Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f681s = this.f681s.f4398a.n(0, measuredHeight, 0, 0);
            }
        }
        b(this.f666c, rect2, true);
        if (!this.f682t.equals(this.f681s)) {
            s1 s1Var3 = this.f681s;
            this.f682t = s1Var3;
            l0.b(this.f666c, s1Var3);
        }
        measureChildWithMargins(this.f666c, i7, 0, i10, 0);
        e eVar2 = (e) this.f666c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f666c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f666c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f666c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i7, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f672i || !z10) {
            return false;
        }
        this.f684v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f684v.getFinalY() > this.f667d.getHeight()) {
            c();
            this.f688z.run();
        } else {
            c();
            this.f687y.run();
        }
        this.f673j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        int i13 = this.k + i10;
        this.k = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        k0 k0Var;
        j jVar;
        this.A.f4380b = i7;
        this.k = getActionBarHideOffset();
        c();
        d dVar = this.f683u;
        if (dVar == null || (jVar = (k0Var = (k0) dVar).f6830x) == null) {
            return;
        }
        jVar.a();
        k0Var.f6830x = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f667d.getVisibility() != 0) {
            return false;
        }
        return this.f672i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f672i || this.f673j) {
            return;
        }
        if (this.k <= this.f667d.getHeight()) {
            c();
            postDelayed(this.f687y, 600L);
        } else {
            c();
            postDelayed(this.f688z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        k();
        int i10 = this.f674l ^ i7;
        this.f674l = i7;
        boolean z10 = (i7 & 4) == 0;
        boolean z11 = (i7 & 256) != 0;
        d dVar = this.f683u;
        if (dVar != null) {
            k0 k0Var = (k0) dVar;
            k0Var.f6826t = !z11;
            if (z10 || !z11) {
                if (k0Var.f6827u) {
                    k0Var.f6827u = false;
                    k0Var.b0(true);
                }
            } else if (!k0Var.f6827u) {
                k0Var.f6827u = true;
                k0Var.b0(true);
            }
        }
        if ((i10 & 256) == 0 || this.f683u == null) {
            return;
        }
        WeakHashMap weakHashMap = l0.f4369a;
        c0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f665b = i7;
        d dVar = this.f683u;
        if (dVar != null) {
            ((k0) dVar).f6825s = i7;
        }
    }

    public void setActionBarHideOffset(int i7) {
        c();
        this.f667d.setTranslationY(-Math.max(0, Math.min(i7, this.f667d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f683u = dVar;
        if (getWindowToken() != null) {
            ((k0) this.f683u).f6825s = this.f665b;
            int i7 = this.f674l;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap weakHashMap = l0.f4369a;
                c0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f671h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f672i) {
            this.f672i = z10;
            if (z10) {
                return;
            }
            c();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        k();
        e3 e3Var = (e3) this.f668e;
        e3Var.f9707d = i7 != 0 ? o9.e0.z(e3Var.f9704a.getContext(), i7) : null;
        e3Var.c();
    }

    public void setIcon(Drawable drawable) {
        k();
        e3 e3Var = (e3) this.f668e;
        e3Var.f9707d = drawable;
        e3Var.c();
    }

    public void setLogo(int i7) {
        k();
        e3 e3Var = (e3) this.f668e;
        e3Var.f9708e = i7 != 0 ? o9.e0.z(e3Var.f9704a.getContext(), i7) : null;
        e3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.f670g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // p.k1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((e3) this.f668e).k = callback;
    }

    @Override // p.k1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        e3 e3Var = (e3) this.f668e;
        if (e3Var.f9710g) {
            return;
        }
        Toolbar toolbar = e3Var.f9704a;
        e3Var.f9711h = charSequence;
        if ((e3Var.f9705b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (e3Var.f9710g) {
                l0.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
