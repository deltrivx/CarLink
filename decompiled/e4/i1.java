package e4;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class i1 extends o1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f4354i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f4355j;
    public static Class k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f4356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Field f4357m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f4358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x3.b[] f4359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x3.b f4360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f4361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x3.b f4362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4363h;

    public i1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var);
        this.f4360e = null;
        this.f4358c = windowInsets;
    }

    public i1(s1 s1Var, i1 i1Var) {
        this(s1Var, new WindowInsets(i1Var.f4358c));
    }

    private static void B() {
        try {
            f4355j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            f4356l = cls.getDeclaredField("mVisibleInsets");
            f4357m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4356l.setAccessible(true);
            f4357m.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f4354i = true;
    }

    public static boolean C(int i7, int i10) {
        return (i7 & 6) == (i10 & 6);
    }

    private x3.b w(int i7, boolean z10) {
        x3.b bVarA = x3.b.f14562e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                bVarA = x3.b.a(bVarA, x(i10, z10));
            }
        }
        return bVarA;
    }

    private x3.b y() {
        s1 s1Var = this.f4361f;
        return s1Var != null ? s1Var.f4398a.j() : x3.b.f14562e;
    }

    private x3.b z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f4354i) {
            B();
        }
        Method method = f4355j;
        if (method != null && k != null && f4356l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4356l.get(f4357m.get(objInvoke));
                if (rect != null) {
                    return x3.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    public boolean A(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !x(i7, false).equals(x3.b.f14562e);
    }

    @Override // e4.o1
    public void d(View view) {
        x3.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = x3.b.f14562e;
        }
        s(bVarZ);
    }

    @Override // e4.o1
    public void e(s1 s1Var) {
        s1Var.f4398a.t(this.f4361f);
        x3.b bVar = this.f4362g;
        o1 o1Var = s1Var.f4398a;
        o1Var.s(bVar);
        o1Var.v(this.f4363h);
    }

    @Override // e4.o1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Objects.equals(this.f4362g, i1Var.f4362g) && C(this.f4363h, i1Var.f4363h);
    }

    @Override // e4.o1
    public x3.b g(int i7) {
        return w(i7, false);
    }

    @Override // e4.o1
    public x3.b h(int i7) {
        return w(i7, true);
    }

    @Override // e4.o1
    public final x3.b l() {
        if (this.f4360e == null) {
            WindowInsets windowInsets = this.f4358c;
            this.f4360e = x3.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4360e;
    }

    @Override // e4.o1
    public s1 n(int i7, int i10, int i11, int i12) {
        h1 e1Var;
        s1 s1VarC = s1.c(null, this.f4358c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            e1Var = new g1(s1VarC);
        } else if (i13 >= 30) {
            e1Var = new f1(s1VarC);
        } else {
            e1Var = i13 >= 29 ? new e1(s1VarC) : new d1(s1VarC);
        }
        e1Var.g(s1.a(l(), i7, i10, i11, i12));
        e1Var.e(s1.a(j(), i7, i10, i11, i12));
        return e1Var.b();
    }

    @Override // e4.o1
    public boolean p() {
        return this.f4358c.isRound();
    }

    @Override // e4.o1
    public boolean q(int i7) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0 && !A(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // e4.o1
    public void r(x3.b[] bVarArr) {
        this.f4359d = bVarArr;
    }

    @Override // e4.o1
    public void s(x3.b bVar) {
        this.f4362g = bVar;
    }

    @Override // e4.o1
    public void t(s1 s1Var) {
        this.f4361f = s1Var;
    }

    @Override // e4.o1
    public void v(int i7) {
        this.f4363h = i7;
    }

    public x3.b x(int i7, boolean z10) {
        x3.b bVarJ;
        int i10;
        x3.b bVar = x3.b.f14562e;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 8) {
                    x3.b[] bVarArr = this.f4359d;
                    bVarJ = bVarArr != null ? bVarArr[i2.c.M(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    x3.b bVarL = l();
                    x3.b bVarY = y();
                    int i11 = bVarL.f14566d;
                    if (i11 > bVarY.f14566d) {
                        return x3.b.b(0, 0, 0, i11);
                    }
                    x3.b bVar2 = this.f4362g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i10 = this.f4362g.f14566d) > bVarY.f14566d) {
                        return x3.b.b(0, 0, 0, i10);
                    }
                } else {
                    if (i7 == 16) {
                        return k();
                    }
                    if (i7 == 32) {
                        return i();
                    }
                    if (i7 == 64) {
                        return m();
                    }
                    if (i7 == 128) {
                        s1 s1Var = this.f4361f;
                        i iVarF = s1Var != null ? s1Var.f4398a.f() : f();
                        if (iVarF != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return x3.b.b(i12 >= 28 ? a4.b.f(iVarF.f4353a) : 0, i12 >= 28 ? a4.b.h(iVarF.f4353a) : 0, i12 >= 28 ? a4.b.g(iVarF.f4353a) : 0, i12 >= 28 ? a4.b.e(iVarF.f4353a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    x3.b bVarY2 = y();
                    x3.b bVarJ2 = j();
                    return x3.b.b(Math.max(bVarY2.f14563a, bVarJ2.f14563a), 0, Math.max(bVarY2.f14565c, bVarJ2.f14565c), Math.max(bVarY2.f14566d, bVarJ2.f14566d));
                }
                if ((this.f4363h & 2) == 0) {
                    x3.b bVarL2 = l();
                    s1 s1Var2 = this.f4361f;
                    bVarJ = s1Var2 != null ? s1Var2.f4398a.j() : null;
                    int iMin = bVarL2.f14566d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f14566d);
                    }
                    return x3.b.b(bVarL2.f14563a, 0, bVarL2.f14565c, iMin);
                }
            }
        } else {
            if (z10) {
                return x3.b.b(0, Math.max(y().f14564b, l().f14564b), 0, 0);
            }
            if ((this.f4363h & 4) == 0) {
                return x3.b.b(0, l().f14564b, 0, 0);
            }
        }
        return bVar;
    }
}
