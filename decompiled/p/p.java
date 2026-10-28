package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9864f;

    public p() {
        this.f9860b = new o2.o[32];
        this.f9861c = new float[32];
        this.f9862d = new byte[32];
        s.i0 i0Var = s.p0.f12478a;
        this.f9863e = new s.i0();
        this.f9864f = new s.i0();
    }

    public p(View view) {
        this.f9859a = -1;
        this.f9860b = view;
        this.f9861c = u.a();
    }

    public void a() {
        View view = (View) this.f9860b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 <= 21 ? i7 == 21 : ((u2) this.f9862d) != null) {
                if (((u2) this.f9864f) == null) {
                    this.f9864f = new u2();
                }
                u2 u2Var = (u2) this.f9864f;
                u2Var.f9931a = null;
                u2Var.f9934d = false;
                u2Var.f9932b = null;
                u2Var.f9933c = false;
                WeakHashMap weakHashMap = e4.l0.f4369a;
                ColorStateList colorStateListC = e4.e0.c(view);
                if (colorStateListC != null) {
                    u2Var.f9934d = true;
                    u2Var.f9931a = colorStateListC;
                }
                PorterDuff.Mode modeD = e4.e0.d(view);
                if (modeD != null) {
                    u2Var.f9933c = true;
                    u2Var.f9932b = modeD;
                }
                if (u2Var.f9934d || u2Var.f9933c) {
                    u.d(background, u2Var, view.getDrawableState());
                    return;
                }
            }
            u2 u2Var2 = (u2) this.f9863e;
            if (u2Var2 != null) {
                u.d(background, u2Var2, view.getDrawableState());
                return;
            }
            u2 u2Var3 = (u2) this.f9862d;
            if (u2Var3 != null) {
                u.d(background, u2Var3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        u2 u2Var = (u2) this.f9863e;
        if (u2Var != null) {
            return u2Var.f9931a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        u2 u2Var = (u2) this.f9863e;
        if (u2Var != null) {
            return u2Var.f9932b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListI;
        View view = (View) this.f9860b;
        Context context = view.getContext();
        int[] iArr = i.a.f6567y;
        a2.b bVarP = a2.b.P(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        View view2 = (View) this.f9860b;
        e4.l0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) bVarP.f13c, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.f9859a = typedArray.getResourceId(0, -1);
                u uVar = (u) this.f9861c;
                Context context2 = view.getContext();
                int i10 = this.f9859a;
                synchronized (uVar) {
                    colorStateListI = uVar.f9928a.i(context2, i10);
                }
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList colorStateListA = bVarP.A(1);
                int i11 = Build.VERSION.SDK_INT;
                e4.e0.f(view, colorStateListA);
                if (i11 == 21) {
                    Drawable background = view.getBackground();
                    boolean z10 = (e4.e0.c(view) == null && e4.e0.d(view) == null) ? false : true;
                    if (background != null && z10) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeB = m1.b(typedArray.getInt(2, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                e4.e0.g(view, modeB);
                if (i12 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z11 = (e4.e0.c(view) == null && e4.e0.d(view) == null) ? false : true;
                    if (background2 != null && z11) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            bVarP.V();
        } catch (Throwable th) {
            bVarP.V();
            throw th;
        }
    }

    public void e() {
        this.f9859a = -1;
        g(null);
        a();
    }

    public void f(int i7) {
        ColorStateList colorStateListI;
        this.f9859a = i7;
        u uVar = (u) this.f9861c;
        if (uVar != null) {
            Context context = ((View) this.f9860b).getContext();
            synchronized (uVar) {
                colorStateListI = uVar.f9928a.i(context, i7);
            }
        } else {
            colorStateListI = null;
        }
        g(colorStateListI);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((u2) this.f9862d) == null) {
                this.f9862d = new u2();
            }
            u2 u2Var = (u2) this.f9862d;
            u2Var.f9931a = colorStateList;
            u2Var.f9934d = true;
        } else {
            this.f9862d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((u2) this.f9863e) == null) {
            this.f9863e = new u2();
        }
        u2 u2Var = (u2) this.f9863e;
        u2Var.f9931a = colorStateList;
        u2Var.f9934d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((u2) this.f9863e) == null) {
            this.f9863e = new u2();
        }
        u2 u2Var = (u2) this.f9863e;
        u2Var.f9932b = mode;
        u2Var.f9933c = true;
        a();
    }
}
