package androidx.appcompat.widget;

import a2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.baidu.carlifevehicle.R;
import com.tencent.bugly.proguard.c0;
import e4.l0;
import i.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n.h;
import n3.u;
import o.m;
import o.o;
import o9.e0;
import p.a3;
import p.b3;
import p.c1;
import p.c3;
import p.d3;
import p.e3;
import p.k;
import p.l1;
import p.m3;
import p.p2;
import p.w2;
import p.x2;
import p.y;
import p.y2;
import p.z;
import p.z2;
import p4.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final b G;
    public ArrayList H;
    public final x2 I;
    public e3 J;
    public k K;
    public z2 L;
    public boolean M;
    public OnBackInvokedCallback N;
    public OnBackInvokedDispatcher O;
    public boolean P;
    public final c0 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c1 f716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c1 f717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f724j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f727n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p2 f733t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f734u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f735v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f738y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f739z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f736w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new b((Runnable) new w2(this, 1));
        this.H = new ArrayList();
        this.I = new x2(this);
        this.Q = new c0(6, this);
        Context context2 = getContext();
        int[] iArr = a.f6565w;
        b bVarP = b.P(context2, attributeSet, iArr, R.attr.toolbarStyle);
        l0.i(this, context, iArr, attributeSet, (TypedArray) bVarP.f13c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        this.f725l = typedArray.getResourceId(28, 0);
        this.f726m = typedArray.getResourceId(19, 0);
        this.f736w = typedArray.getInteger(0, 8388627);
        this.f727n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f732s = dimensionPixelOffset;
        this.f731r = dimensionPixelOffset;
        this.f730q = dimensionPixelOffset;
        this.f729p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f729p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f730q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f731r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f732s = dimensionPixelOffset5;
        }
        this.f728o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        p2 p2Var = this.f733t;
        p2Var.f9873h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p2Var.f9870e = dimensionPixelSize;
            p2Var.f9866a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p2Var.f9871f = dimensionPixelSize2;
            p2Var.f9867b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f734u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f735v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f720f = bVarP.D(4);
        this.f721g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f724j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableD = bVarP.D(16);
        if (drawableD != null) {
            setNavigationIcon(drawableD);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableD2 = bVarP.D(11);
        if (drawableD2 != null) {
            setLogo(drawableD2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(bVarP.A(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(bVarP.A(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        bVarP.V();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static a3 h() {
        a3 a3Var = new a3(-2, -2);
        a3Var.f9674b = 0;
        a3Var.f9673a = 8388627;
        return a3Var;
    }

    public static a3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof a3;
        if (z10) {
            a3 a3Var = (a3) layoutParams;
            a3 a3Var2 = new a3(a3Var);
            a3Var2.f9674b = 0;
            a3Var2.f9674b = a3Var.f9674b;
            return a3Var2;
        }
        if (z10) {
            a3 a3Var3 = new a3((a3) layoutParams);
            a3Var3.f9674b = 0;
            return a3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a3 a3Var4 = new a3(layoutParams);
            a3Var4.f9674b = 0;
            return a3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        a3 a3Var5 = new a3(marginLayoutParams);
        a3Var5.f9674b = 0;
        ((ViewGroup.MarginLayoutParams) a3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) a3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) a3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) a3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return a3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                a3 a3Var = (a3) childAt.getLayoutParams();
                if (a3Var.f9674b == 0 && s(childAt)) {
                    int i11 = a3Var.f9673a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            a3 a3Var2 = (a3) childAt2.getLayoutParams();
            if (a3Var2.f9674b == 0 && s(childAt2)) {
                int i13 = a3Var2.f9673a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        a3 a3VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            a3VarI = h();
        } else {
            a3VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (a3) layoutParams;
        }
        a3VarI.f9674b = 1;
        if (!z10 || this.f723i == null) {
            addView(view, a3VarI);
        } else {
            view.setLayoutParams(a3VarI);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.f722h == null) {
            y yVar = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f722h = yVar;
            yVar.setImageDrawable(this.f720f);
            this.f722h.setContentDescription(this.f721g);
            a3 a3VarH = h();
            a3VarH.f9673a = (this.f727n & 112) | 8388611;
            a3VarH.f9674b = 2;
            this.f722h.setLayoutParams(a3VarH);
            this.f722h.setOnClickListener(new j.a(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a3);
    }

    public final void d() {
        if (this.f733t == null) {
            p2 p2Var = new p2();
            p2Var.f9866a = 0;
            p2Var.f9867b = 0;
            p2Var.f9868c = Integer.MIN_VALUE;
            p2Var.f9869d = Integer.MIN_VALUE;
            p2Var.f9870e = 0;
            p2Var.f9871f = 0;
            p2Var.f9872g = false;
            p2Var.f9873h = false;
            this.f733t = p2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f715a;
        if (actionMenuView.f689p == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new z2(this);
            }
            this.f715a.setExpandedActionViewsExclusive(true);
            mVar.b(this.L, this.f724j);
            t();
        }
    }

    public final void f() {
        if (this.f715a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f715a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.f715a.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f715a;
            x2 x2Var = new x2(this);
            actionMenuView2.getClass();
            actionMenuView2.f694u = x2Var;
            a3 a3VarH = h();
            a3VarH.f9673a = (this.f727n & 112) | 8388613;
            this.f715a.setLayoutParams(a3VarH);
            b(this.f715a, false);
        }
    }

    public final void g() {
        if (this.f718d == null) {
            this.f718d = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a3 a3VarH = h();
            a3VarH.f9673a = (this.f727n & 112) | 8388611;
            this.f718d.setLayoutParams(a3VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a3 a3Var = new a3(context, attributeSet);
        a3Var.f9673a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6545b);
        a3Var.f9673a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        a3Var.f9674b = 0;
        return a3Var;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        y yVar = this.f722h;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        y yVar = this.f722h;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p2 p2Var = this.f733t;
        if (p2Var != null) {
            return p2Var.f9872g ? p2Var.f9866a : p2Var.f9867b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f735v;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p2 p2Var = this.f733t;
        if (p2Var != null) {
            return p2Var.f9866a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p2 p2Var = this.f733t;
        if (p2Var != null) {
            return p2Var.f9867b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p2 p2Var = this.f733t;
        if (p2Var != null) {
            return p2Var.f9872g ? p2Var.f9867b : p2Var.f9866a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f734u;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f715a;
        return (actionMenuView == null || (mVar = actionMenuView.f689p) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f735v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f734u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        z zVar = this.f719e;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        z zVar = this.f719e;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f715a.getMenu();
    }

    public View getNavButtonView() {
        return this.f718d;
    }

    public CharSequence getNavigationContentDescription() {
        y yVar = this.f718d;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        y yVar = this.f718d;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public k getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f715a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f724j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.f738y;
    }

    public final TextView getSubtitleTextView() {
        return this.f717c;
    }

    public CharSequence getTitle() {
        return this.f737x;
    }

    public int getTitleMarginBottom() {
        return this.f732s;
    }

    public int getTitleMarginEnd() {
        return this.f730q;
    }

    public int getTitleMarginStart() {
        return this.f729p;
    }

    public int getTitleMarginTop() {
        return this.f731r;
    }

    public final TextView getTitleTextView() {
        return this.f716b;
    }

    public l1 getWrapper() {
        Drawable drawable;
        if (this.J == null) {
            e3 e3Var = new e3();
            e3Var.f9716n = 0;
            e3Var.f9704a = this;
            e3Var.f9711h = getTitle();
            e3Var.f9712i = getSubtitle();
            e3Var.f9710g = e3Var.f9711h != null;
            e3Var.f9709f = getNavigationIcon();
            b bVarP = b.P(getContext(), null, a.f6544a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) bVarP.f13c;
            e3Var.f9717o = bVarP.D(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                e3Var.f9710g = true;
                e3Var.f9711h = text;
                if ((e3Var.f9705b & 8) != 0) {
                    setTitle(text);
                    if (e3Var.f9710g) {
                        l0.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                e3Var.f9712i = text2;
                if ((e3Var.f9705b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableD = bVarP.D(20);
            if (drawableD != null) {
                e3Var.f9708e = drawableD;
                e3Var.c();
            }
            Drawable drawableD2 = bVarP.D(17);
            if (drawableD2 != null) {
                e3Var.f9707d = drawableD2;
                e3Var.c();
            }
            if (e3Var.f9709f == null && (drawable = e3Var.f9717o) != null) {
                e3Var.f9709f = drawable;
                if ((e3Var.f9705b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            e3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = e3Var.f9706c;
                if (view != null && (e3Var.f9705b & 16) != 0) {
                    removeView(view);
                }
                e3Var.f9706c = viewInflate;
                if (viewInflate != null && (e3Var.f9705b & 16) != 0) {
                    addView(viewInflate);
                }
                e3Var.a(e3Var.f9705b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f733t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f725l = resourceId2;
                c1 c1Var = this.f716b;
                if (c1Var != null) {
                    c1Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f726m = resourceId3;
                c1 c1Var2 = this.f717c;
                if (c1Var2 != null) {
                    c1Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            bVarP.V();
            if (R.string.abc_action_bar_up_description != e3Var.f9716n) {
                e3Var.f9716n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i7 = e3Var.f9716n;
                    e3Var.f9713j = i7 != 0 ? getContext().getString(i7) : null;
                    e3Var.b();
                }
            }
            e3Var.f9713j = getNavigationContentDescription();
            setNavigationOnClickListener(new d3(e3Var));
            this.J = e3Var;
        }
        return this.J;
    }

    public final int j(View view, int i7) {
        a3 a3Var = (a3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i11 = a3Var.f9673a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f736w & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) a3Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) a3Var).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) a3Var).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.G.f13c).iterator();
        while (it2.hasNext()) {
            ((q) it2.next()).f10222a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int o(View view, int i7, int i10, int[] iArr) {
        a3 a3Var = (a3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) a3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i11) + i7;
        iArr[0] = Math.max(0, -i11);
        int iJ = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) a3Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c6 A[LOOP:2: B:108:0x02c4->B:109:0x02c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0312  */
    /* JADX WARN: Code duplicated, block: B:118:0x0319 A[LOOP:3: B:117:0x0317->B:118:0x0319, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        c1 c1Var;
        c1 c1Var2;
        a3 a3Var;
        a3 a3Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList;
        int size;
        int iO2;
        int i26;
        int size2;
        int i27;
        int i28;
        int size3;
        int i29;
        int i30;
        int measuredWidth;
        int i31;
        int i32;
        int i33;
        int size4;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i34 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = l0.f4369a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (s(this.f718d)) {
            if (z12) {
                iP = p(this.f718d, i34, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(this.f718d, paddingLeft, iMin2, iArr);
            }
            if (s(this.f722h)) {
                if (z12) {
                    iP = p(this.f722h, iP, iMin2, iArr);
                } else {
                    iO = o(this.f722h, iO, iMin2, iArr);
                }
            }
            if (s(this.f715a)) {
                if (z12) {
                    iO = o(this.f715a, iO, iMin2, iArr);
                } else {
                    iP = p(this.f715a, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i34 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i34 - currentContentInsetRight);
            if (s(this.f723i)) {
                if (z12) {
                    iMin = p(this.f723i, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f723i, iMax, iMin2, iArr);
                }
            }
            if (s(this.f719e)) {
                if (z12) {
                    iMin = p(this.f719e, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f719e, iMax, iMin2, iArr);
                }
            }
            zS = s(this.f716b);
            zS2 = s(this.f717c);
            if (zS) {
                a3 a3Var3 = (a3) this.f716b.getLayoutParams();
                measuredHeight = this.f716b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a3Var3).topMargin + ((ViewGroup.MarginLayoutParams) a3Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                a3 a3Var4 = (a3) this.f717c.getLayoutParams();
                measuredHeight = this.f717c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a3Var4).topMargin + ((ViewGroup.MarginLayoutParams) a3Var4).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    c1Var = this.f716b;
                } else {
                    c1Var = this.f717c;
                }
                if (zS2) {
                    c1Var2 = this.f717c;
                } else {
                    c1Var2 = this.f716b;
                }
                a3Var = (a3) c1Var.getLayoutParams();
                a3Var2 = (a3) c1Var2.getLayoutParams();
                i13 = measuredHeight;
                z11 = (!zS && this.f716b.getMeasuredWidth() > 0) || (zS2 && this.f717c.getMeasuredWidth() > 0);
                i14 = this.f736w & 112;
                i15 = iMax;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) a3Var).topMargin + this.f731r;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) a3Var).topMargin + this.f731r;
                    if (iMax2 < i22) {
                        iMax2 = i22;
                    } else {
                        i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) a3Var).bottomMargin;
                        i25 = this.f732s;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) a3Var2).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) a3Var2).bottomMargin) - this.f732s) - i13;
                }
                if (z12) {
                    if (z11) {
                        i19 = this.f729p;
                    } else {
                        i19 = 0;
                    }
                    int i35 = i19 - iArr[1];
                    iMin -= Math.max(0, i35);
                    iArr[1] = Math.max(0, -i35);
                    if (zS) {
                        a3 a3Var5 = (a3) this.f716b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f716b.getMeasuredWidth();
                        int measuredHeight2 = this.f716b.getMeasuredHeight() + paddingTop;
                        this.f716b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.f730q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) a3Var5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zS2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a3) this.f717c.getLayoutParams())).topMargin;
                        this.f717c.layout(iMin - this.f717c.getMeasuredWidth(), i36, iMin, this.f717c.getMeasuredHeight() + i36);
                        i21 = iMin - this.f730q;
                    } else {
                        i21 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i20, i21);
                    }
                    iMax = i15;
                } else {
                    if (z11) {
                        i16 = this.f729p;
                    } else {
                        i16 = 0;
                    }
                    int i37 = i16 - iArr[0];
                    iMax = Math.max(0, i37) + i15;
                    iArr[0] = Math.max(0, -i37);
                    if (zS) {
                        a3 a3Var6 = (a3) this.f716b.getLayoutParams();
                        int measuredWidth3 = this.f716b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f716b.getMeasuredHeight() + paddingTop;
                        this.f716b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.f730q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) a3Var6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zS2) {
                        int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a3) this.f717c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f717c.getMeasuredWidth() + iMax;
                        this.f717c.layout(iMax, i38, measuredWidth4, this.f717c.getMeasuredHeight() + i38);
                        i18 = measuredWidth4 + this.f730q;
                    } else {
                        i18 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i17, i18);
                    }
                }
            }
            arrayList = this.D;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i26 = 0; i26 < size; i26++) {
                iO2 = o((View) arrayList.get(i26), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i27 = 0; i27 < size2; i27++) {
                iMin = p((View) arrayList.get(i27), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i39 = iArr[0];
            i28 = iArr[1];
            size3 = arrayList.size();
            i29 = i39;
            i30 = 0;
            measuredWidth = 0;
            while (i30 < size3) {
                View view = (View) arrayList.get(i30);
                a3 a3Var7 = (a3) view.getLayoutParams();
                int i40 = i28;
                int i41 = ((ViewGroup.MarginLayoutParams) a3Var7).leftMargin - i29;
                int i42 = ((ViewGroup.MarginLayoutParams) a3Var7).rightMargin - i40;
                int iMax3 = Math.max(0, i41);
                int iMax4 = Math.max(0, i42);
                int iMax5 = Math.max(0, -i41);
                int iMax6 = Math.max(0, -i42);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i30++;
                i29 = iMax5;
                i28 = iMax6;
            }
            i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i33 = measuredWidth + i32;
            if (i32 >= iO2) {
                if (i33 > iMin) {
                    iO2 = i32 - (i33 - iMin);
                } else {
                    iO2 = i32;
                }
            }
            size4 = arrayList.size();
            for (i31 = 0; i31 < size4; i31++) {
                iO2 = o((View) arrayList.get(i31), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i34;
        if (s(this.f722h)) {
            if (z12) {
                iP = p(this.f722h, iP, iMin2, iArr);
            } else {
                iO = o(this.f722h, iO, iMin2, iArr);
            }
        }
        if (s(this.f715a)) {
            if (z12) {
                iO = o(this.f715a, iO, iMin2, iArr);
            } else {
                iP = p(this.f715a, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i34 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i34 - currentContentInsetRight2);
        if (s(this.f723i)) {
            if (z12) {
                iMin = p(this.f723i, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f723i, iMax, iMin2, iArr);
            }
        }
        if (s(this.f719e)) {
            if (z12) {
                iMin = p(this.f719e, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f719e, iMax, iMin2, iArr);
            }
        }
        zS = s(this.f716b);
        zS2 = s(this.f717c);
        if (zS) {
            a3 a3Var8 = (a3) this.f716b.getLayoutParams();
            measuredHeight = this.f716b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a3Var8).topMargin + ((ViewGroup.MarginLayoutParams) a3Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            a3 a3Var9 = (a3) this.f717c.getLayoutParams();
            measuredHeight = this.f717c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a3Var9).topMargin + ((ViewGroup.MarginLayoutParams) a3Var9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                c1Var = this.f716b;
            } else {
                c1Var = this.f717c;
            }
            if (zS2) {
                c1Var2 = this.f717c;
            } else {
                c1Var2 = this.f716b;
            }
            a3Var = (a3) c1Var.getLayoutParams();
            a3Var2 = (a3) c1Var2.getLayoutParams();
            i13 = measuredHeight;
            if (zS) {
            }
            i14 = this.f736w & 112;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) a3Var).topMargin + this.f731r;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) a3Var).topMargin + this.f731r;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) a3Var).bottomMargin;
                    i25 = this.f732s;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) a3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) a3Var2).bottomMargin) - this.f732s) - i13;
            }
            if (z12) {
                if (z11) {
                    i19 = this.f729p;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zS) {
                    a3 a3Var10 = (a3) this.f716b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f716b.getMeasuredWidth();
                    int measuredHeight4 = this.f716b.getMeasuredHeight() + paddingTop;
                    this.f716b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.f730q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) a3Var10).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zS2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a3) this.f717c.getLayoutParams())).topMargin;
                    this.f717c.layout(iMin - this.f717c.getMeasuredWidth(), i311, iMin, this.f717c.getMeasuredHeight() + i311);
                    i21 = iMin - this.f730q;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z11) {
                    i16 = this.f729p;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax = Math.max(0, i312) + i15;
                iArr[0] = Math.max(0, -i312);
                if (zS) {
                    a3 a3Var11 = (a3) this.f716b.getLayoutParams();
                    int measuredWidth6 = this.f716b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f716b.getMeasuredHeight() + paddingTop;
                    this.f716b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.f730q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) a3Var11).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zS2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a3) this.f717c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f717c.getMeasuredWidth() + iMax;
                    this.f717c.layout(iMax, i313, measuredWidth7, this.f717c.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.f730q;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zS) {
                c1Var = this.f716b;
            } else {
                c1Var = this.f717c;
            }
            if (zS2) {
                c1Var2 = this.f717c;
            } else {
                c1Var2 = this.f716b;
            }
            a3Var = (a3) c1Var.getLayoutParams();
            a3Var2 = (a3) c1Var2.getLayoutParams();
            i13 = measuredHeight;
            if (zS) {
            }
            i14 = this.f736w & 112;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) a3Var).topMargin + this.f731r;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) a3Var).topMargin + this.f731r;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) a3Var).bottomMargin;
                    i25 = this.f732s;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) a3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) a3Var2).bottomMargin) - this.f732s) - i13;
            }
            if (z12) {
                if (z11) {
                    i19 = this.f729p;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zS) {
                    a3 a3Var12 = (a3) this.f716b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f716b.getMeasuredWidth();
                    int measuredHeight6 = this.f716b.getMeasuredHeight() + paddingTop;
                    this.f716b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.f730q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) a3Var12).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zS2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a3) this.f717c.getLayoutParams())).topMargin;
                    this.f717c.layout(iMin - this.f717c.getMeasuredWidth(), i315, iMin, this.f717c.getMeasuredHeight() + i315);
                    i21 = iMin - this.f730q;
                } else {
                    i21 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z11) {
                    i16 = this.f729p;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax = Math.max(0, i316) + i15;
                iArr[0] = Math.max(0, -i316);
                if (zS) {
                    a3 a3Var13 = (a3) this.f716b.getLayoutParams();
                    int measuredWidth9 = this.f716b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f716b.getMeasuredHeight() + paddingTop;
                    this.f716b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.f730q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) a3Var13).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zS2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a3) this.f717c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f717c.getMeasuredWidth() + iMax;
                    this.f717c.layout(iMax, i317, measuredWidth10, this.f717c.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.f730q;
                } else {
                    i18 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        arrayList = this.D;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i26 < size) {
            iO2 = o((View) arrayList.get(i26), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i27 < size2) {
            iMin = p((View) arrayList.get(i27), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i318 = iArr[0];
        i28 = iArr[1];
        size3 = arrayList.size();
        i29 = i318;
        i30 = 0;
        measuredWidth = 0;
        while (i30 < size3) {
            View view2 = (View) arrayList.get(i30);
            a3 a3Var14 = (a3) view2.getLayoutParams();
            int i43 = i28;
            int i44 = ((ViewGroup.MarginLayoutParams) a3Var14).leftMargin - i29;
            int i45 = ((ViewGroup.MarginLayoutParams) a3Var14).rightMargin - i43;
            int iMax7 = Math.max(0, i44);
            int iMax8 = Math.max(0, i45);
            int iMax9 = Math.max(0, -i44);
            int iMax10 = Math.max(0, -i45);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i30++;
            i29 = iMax9;
            i28 = iMax10;
        }
        i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i33 = measuredWidth + i32;
        if (i32 >= iO2) {
            if (i33 > iMin) {
                iO2 = i32 - (i33 - iMin);
            } else {
                iO2 = i32;
            }
        }
        size4 = arrayList.size();
        while (i31 < size4) {
            iO2 = o((View) arrayList.get(i31), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        char c10;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iL;
        boolean z11 = m3.f9836a;
        int i11 = 0;
        if (getLayoutDirection() == 1) {
            z10 = true;
            c10 = 0;
        } else {
            z10 = false;
            c10 = 1;
        }
        if (s(this.f718d)) {
            r(this.f718d, i7, 0, i10, this.f728o);
            iK = k(this.f718d) + this.f718d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f718d) + this.f718d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f718d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.f722h)) {
            r(this.f722h, i7, 0, i10, this.f728o);
            iK = k(this.f722h) + this.f722h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f722h) + this.f722h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f722h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        boolean z12 = z10;
        int[] iArr = this.F;
        iArr[z12 ? 1 : 0] = iMax4;
        if (s(this.f715a)) {
            r(this.f715a, i7, iMax3, i10, this.f728o);
            iK2 = k(this.f715a) + this.f715a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f715a) + this.f715a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f715a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c10] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f723i)) {
            iMax5 += q(this.f723i, i7, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f723i) + this.f723i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f723i.getMeasuredState());
        }
        if (s(this.f719e)) {
            iMax5 += q(this.f719e, i7, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f719e) + this.f719e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f719e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((a3) childAt.getLayoutParams()).f9674b == 0 && s(childAt)) {
                iMax5 += q(childAt, i7, iMax5, i10, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i13 = iMax5;
        int i14 = this.f731r + this.f732s;
        int i15 = this.f729p + this.f730q;
        if (s(this.f716b)) {
            q(this.f716b, i7, i13 + i15, i10, i14, iArr);
            int iK3 = k(this.f716b) + this.f716b.getMeasuredWidth();
            iL = l(this.f716b) + this.f716b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f716b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iL = 0;
        }
        if (s(this.f717c)) {
            iMax2 = Math.max(iMax2, q(this.f717c, i7, i13 + i15, i10, i14 + iL, iArr));
            iL += l(this.f717c) + this.f717c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f717c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i13 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16);
        if (!this.M) {
            i11 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i11 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof c3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c3 c3Var = (c3) parcelable;
        super.onRestoreInstanceState(c3Var.f7309a);
        ActionMenuView actionMenuView = this.f715a;
        m mVar = actionMenuView != null ? actionMenuView.f689p : null;
        int i7 = c3Var.f9693c;
        if (i7 != 0 && this.L != null && mVar != null && (menuItemFindItem = mVar.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c3Var.f9694d) {
            c0 c0Var = this.Q;
            removeCallbacks(c0Var);
            post(c0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        p2 p2Var = this.f733t;
        boolean z10 = i7 == 1;
        if (z10 == p2Var.f9872g) {
            return;
        }
        p2Var.f9872g = z10;
        if (!p2Var.f9873h) {
            p2Var.f9866a = p2Var.f9870e;
            p2Var.f9867b = p2Var.f9871f;
            return;
        }
        if (z10) {
            int i10 = p2Var.f9869d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = p2Var.f9870e;
            }
            p2Var.f9866a = i10;
            int i11 = p2Var.f9868c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = p2Var.f9871f;
            }
            p2Var.f9867b = i11;
            return;
        }
        int i12 = p2Var.f9868c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = p2Var.f9870e;
        }
        p2Var.f9866a = i12;
        int i13 = p2Var.f9869d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = p2Var.f9871f;
        }
        p2Var.f9867b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar;
        o oVar;
        c3 c3Var = new c3(super.onSaveInstanceState());
        z2 z2Var = this.L;
        if (z2Var != null && (oVar = z2Var.f9990b) != null) {
            c3Var.f9693c = oVar.f9202a;
        }
        ActionMenuView actionMenuView = this.f715a;
        c3Var.f9694d = (actionMenuView == null || (kVar = actionMenuView.f693t) == null || !kVar.h()) ? false : true;
        return c3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i7, int i10, int[] iArr) {
        a3 a3Var = (a3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) a3Var).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int iJ = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) a3Var).leftMargin);
    }

    public final int q(View view, int i7, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            t();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        y yVar = this.f722h;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(e0.z(getContext(), i7));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f722h.setImageDrawable(drawable);
        } else {
            y yVar = this.f722h;
            if (yVar != null) {
                yVar.setImageDrawable(this.f720f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.M = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f735v) {
            this.f735v = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f734u) {
            this.f734u = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(e0.z(getContext(), i7));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f719e == null) {
                this.f719e = new z(getContext(), null, 0);
            }
            if (!n(this.f719e)) {
                b(this.f719e, true);
            }
        } else {
            z zVar = this.f719e;
            if (zVar != null && n(zVar)) {
                removeView(this.f719e);
                this.E.remove(this.f719e);
            }
        }
        z zVar2 = this.f719e;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f719e == null) {
            this.f719e = new z(getContext(), null, 0);
        }
        z zVar = this.f719e;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        y yVar = this.f718d;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
            u.I(this.f718d, charSequence);
        }
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(e0.z(getContext(), i7));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f718d)) {
                b(this.f718d, true);
            }
        } else {
            y yVar = this.f718d;
            if (yVar != null && n(yVar)) {
                removeView(this.f718d);
                this.E.remove(this.f718d);
            }
        }
        y yVar2 = this.f718d;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f718d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(b3 b3Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f715a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.k != i7) {
            this.k = i7;
            if (i7 == 0) {
                this.f724j = getContext();
            } else {
                this.f724j = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            c1 c1Var = this.f717c;
            if (c1Var != null && n(c1Var)) {
                removeView(this.f717c);
                this.E.remove(this.f717c);
            }
        } else {
            if (this.f717c == null) {
                Context context = getContext();
                c1 c1Var2 = new c1(context, null);
                this.f717c = c1Var2;
                c1Var2.setSingleLine();
                this.f717c.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f726m;
                if (i7 != 0) {
                    this.f717c.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f717c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f717c)) {
                b(this.f717c, true);
            }
        }
        c1 c1Var3 = this.f717c;
        if (c1Var3 != null) {
            c1Var3.setText(charSequence);
        }
        this.f738y = charSequence;
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        c1 c1Var = this.f717c;
        if (c1Var != null) {
            c1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            c1 c1Var = this.f716b;
            if (c1Var != null && n(c1Var)) {
                removeView(this.f716b);
                this.E.remove(this.f716b);
            }
        } else {
            if (this.f716b == null) {
                Context context = getContext();
                c1 c1Var2 = new c1(context, null);
                this.f716b = c1Var2;
                c1Var2.setSingleLine();
                this.f716b.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f725l;
                if (i7 != 0) {
                    this.f716b.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f739z;
                if (colorStateList != null) {
                    this.f716b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f716b)) {
                b(this.f716b, true);
            }
        }
        c1 c1Var3 = this.f716b;
        if (c1Var3 != null) {
            c1Var3.setText(charSequence);
        }
        this.f737x = charSequence;
    }

    public void setTitleMarginBottom(int i7) {
        this.f732s = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f730q = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f729p = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f731r = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f739z = colorStateList;
        c1 c1Var = this.f716b;
        if (c1Var != null) {
            c1Var.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = y2.a(this);
            z2 z2Var = this.L;
            boolean z10 = (z2Var == null || z2Var.f9990b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.P) ? false : true;
            if (z10 && this.O == null) {
                if (this.N == null) {
                    this.N = y2.b(new w2(this, 0));
                }
                y2.c(onBackInvokedDispatcherA, this.N);
                this.O = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.O) == null) {
                return;
            }
            y2.d(onBackInvokedDispatcher, this.N);
            this.O = null;
        }
    }
}
