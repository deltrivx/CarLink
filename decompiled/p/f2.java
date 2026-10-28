package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 implements o.c0 {
    public static final Method A;
    public static final Method B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Method f9718z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f9720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1 f9721c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9725g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9728j;
    public boolean k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c2 f9731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f9732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f9733p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f9738u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f9740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9741x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b0 f9742y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9722d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9723e = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9726h = 1002;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9729l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9730m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f9734q = new b2(this, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e2 f9735r = new e2(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d2 f9736s = new d2(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f9737t = new b2(this, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f9739v = new Rect();

    static {
        int i7 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i7 <= 28) {
            try {
                f9718z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                A = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public f2(Context context, AttributeSet attributeSet, int i7) {
        int resourceId;
        this.f9719a = context;
        this.f9738u = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f6557o, i7, 0);
        this.f9724f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f9725g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9727i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        b0 b0Var = new b0(context, attributeSet, i7, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f6561s, i7, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            a.a.S(b0Var, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        b0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : o9.e0.z(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f9742y = b0Var;
        b0Var.setInputMethodMode(1);
    }

    @Override // o.c0
    public final boolean a() {
        return this.f9742y.isShowing();
    }

    public final int b() {
        return this.f9724f;
    }

    public final void c(int i7) {
        this.f9724f = i7;
    }

    @Override // o.c0
    public final void dismiss() {
        b0 b0Var = this.f9742y;
        b0Var.dismiss();
        b0Var.setContentView(null);
        this.f9721c = null;
        this.f9738u.removeCallbacks(this.f9734q);
    }

    @Override // o.c0
    public final void f() {
        int i7;
        int iA;
        int iMakeMeasureSpec;
        int paddingBottom;
        s1 s1Var;
        s1 s1Var2 = this.f9721c;
        Context context = this.f9719a;
        b0 b0Var = this.f9742y;
        if (s1Var2 == null) {
            s1 s1VarP = p(context, !this.f9741x);
            this.f9721c = s1VarP;
            s1VarP.setAdapter(this.f9720b);
            this.f9721c.setOnItemClickListener(this.f9733p);
            this.f9721c.setFocusable(true);
            this.f9721c.setFocusableInTouchMode(true);
            this.f9721c.setOnItemSelectedListener(new y1(this));
            this.f9721c.setOnScrollListener(this.f9736s);
            b0Var.setContentView(this.f9721c);
        }
        Drawable background = b0Var.getBackground();
        Rect rect = this.f9739v;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i7 = rect.bottom + i10;
            if (!this.f9727i) {
                this.f9725g = -i10;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        boolean z10 = b0Var.getInputMethodMode() == 2;
        View view = this.f9732o;
        int i11 = this.f9725g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = A;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(b0Var, view, Integer.valueOf(i11), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = b0Var.getMaxAvailableHeight(view, i11);
                }
            } else {
                iA = b0Var.getMaxAvailableHeight(view, i11);
            }
        } else {
            iA = z1.a(b0Var, view, i11, z10);
        }
        int i12 = this.f9722d;
        if (i12 == -1) {
            paddingBottom = iA + i7;
        } else {
            int i13 = this.f9723e;
            if (i13 != -2) {
                iMakeMeasureSpec = i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f9721c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f9721c.getPaddingBottom() + this.f9721c.getPaddingTop() + i7 : 0);
        }
        boolean z11 = b0Var.getInputMethodMode() == 2;
        a.a.T(b0Var, this.f9726h);
        if (b0Var.isShowing()) {
            if (this.f9732o.isAttachedToWindow()) {
                int width = this.f9723e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f9732o.getWidth();
                }
                if (i12 == -1) {
                    i12 = z11 ? paddingBottom : -1;
                    if (z11) {
                        b0Var.setWidth(this.f9723e == -1 ? -1 : 0);
                        b0Var.setHeight(0);
                    } else {
                        b0Var.setWidth(this.f9723e == -1 ? -1 : 0);
                        b0Var.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                b0Var.setOutsideTouchable(true);
                int i14 = width;
                View view2 = this.f9732o;
                int i15 = this.f9724f;
                int i16 = this.f9725g;
                int i17 = i14 < 0 ? -1 : i14;
                if (i12 < 0) {
                    i12 = -1;
                }
                b0Var.update(view2, i15, i16, i17, i12);
                return;
            }
            return;
        }
        int width2 = this.f9723e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f9732o.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        b0Var.setWidth(width2);
        b0Var.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f9718z;
            if (method2 != null) {
                try {
                    method2.invoke(b0Var, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a2.b(b0Var, true);
        }
        b0Var.setOutsideTouchable(true);
        b0Var.setTouchInterceptor(this.f9735r);
        if (this.k) {
            a.a.S(b0Var, this.f9728j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = B;
            if (method3 != null) {
                try {
                    method3.invoke(b0Var, this.f9740w);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            a2.a(b0Var, this.f9740w);
        }
        b0Var.showAsDropDown(this.f9732o, this.f9724f, this.f9725g, this.f9729l);
        this.f9721c.setSelection(-1);
        if ((!this.f9741x || this.f9721c.isInTouchMode()) && (s1Var = this.f9721c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (this.f9741x) {
            return;
        }
        this.f9738u.post(this.f9737t);
    }

    public final Drawable g() {
        return this.f9742y.getBackground();
    }

    @Override // o.c0
    public final s1 h() {
        return this.f9721c;
    }

    public final void j(Drawable drawable) {
        this.f9742y.setBackgroundDrawable(drawable);
    }

    public final void k(int i7) {
        this.f9725g = i7;
        this.f9727i = true;
    }

    public final int n() {
        if (this.f9727i) {
            return this.f9725g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        c2 c2Var = this.f9731n;
        if (c2Var == null) {
            this.f9731n = new c2(this);
        } else {
            ListAdapter listAdapter2 = this.f9720b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2Var);
            }
        }
        this.f9720b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9731n);
        }
        s1 s1Var = this.f9721c;
        if (s1Var != null) {
            s1Var.setAdapter(this.f9720b);
        }
    }

    public s1 p(Context context, boolean z10) {
        return new s1(context, z10);
    }

    public final void q(int i7) {
        Drawable background = this.f9742y.getBackground();
        if (background == null) {
            this.f9723e = i7;
            return;
        }
        Rect rect = this.f9739v;
        background.getPadding(rect);
        this.f9723e = rect.left + rect.right + i7;
    }
}
