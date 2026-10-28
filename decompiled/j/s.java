package j;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlifevehicle.R;
import e4.d1;
import e4.e1;
import e4.f1;
import e4.g1;
import e4.h1;
import e4.l0;
import e4.o1;
import e4.s1;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p.j1;
import p.l3;
import p.m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements e4.o, j1, o.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f6851b;

    public /* synthetic */ s(b0 b0Var, int i7) {
        this.f6850a = i7;
        this.f6851b = b0Var;
    }

    @Override // o.x
    public boolean J(o.m mVar) {
        Window.Callback callback;
        switch (this.f6850a) {
            case 2:
                Window.Callback callback2 = this.f6851b.f6730l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                }
                break;
            default:
                if (mVar == mVar.k()) {
                    b0 b0Var = this.f6851b;
                    if (b0Var.F && (callback = b0Var.f6730l.getCallback()) != null && !b0Var.Q) {
                        callback.onMenuOpened(108, mVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // o.x
    public void b(o.m mVar, boolean z10) {
        a0 a0Var;
        switch (this.f6850a) {
            case 2:
                this.f6851b.o(mVar);
                break;
            default:
                o.m mVarK = mVar.k();
                int i7 = 0;
                boolean z11 = mVarK != mVar;
                if (z11) {
                    mVar = mVarK;
                }
                b0 b0Var = this.f6851b;
                a0[] a0VarArr = b0Var.L;
                int length = a0VarArr != null ? a0VarArr.length : 0;
                while (true) {
                    if (i7 >= length) {
                        a0Var = null;
                    } else {
                        a0Var = a0VarArr[i7];
                        if (a0Var == null || a0Var.f6710h != mVar) {
                            i7++;
                        }
                    }
                }
                if (a0Var != null) {
                    if (!z11) {
                        b0Var.p(a0Var, z10);
                    } else {
                        b0Var.n(a0Var.f6703a, a0Var, mVarK);
                        b0Var.p(a0Var, true);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // e4.o
    public s1 d(View view, s1 s1Var) {
        boolean z10;
        s1 s1VarB;
        h1 e1Var;
        boolean z11;
        Rect rect;
        boolean z12;
        int iC;
        o1 o1Var = s1Var.f4398a;
        int i7 = o1Var.l().f14564b;
        b0 b0Var = this.f6851b;
        Context context = b0Var.k;
        int i10 = o1Var.l().f14564b;
        ActionBarContextView actionBarContextView = b0Var.f6741v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.f6741v.getLayoutParams();
            if (b0Var.f6741v.isShown()) {
                if (b0Var.f6725h0 == null) {
                    b0Var.f6725h0 = new Rect();
                    b0Var.f6726i0 = new Rect();
                }
                Rect rect2 = b0Var.f6725h0;
                Rect rect3 = b0Var.f6726i0;
                rect2.set(o1Var.l().f14563a, o1Var.l().f14564b, o1Var.l().f14565c, o1Var.l().f14566d);
                ViewGroup viewGroup = b0Var.A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z13 = m3.f9836a;
                    l3.a(viewGroup, rect2, rect3);
                } else {
                    if (m3.f9836a) {
                        rect = rect3;
                    } else {
                        m3.f9836a = true;
                        rect = rect3;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            m3.f9837b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                m3.f9837b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = m3.f9837b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[0] = rect2;
                            try {
                                objArr[1] = rect;
                                method.invoke(viewGroup, objArr);
                            } catch (Exception e7) {
                                e = e7;
                                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                    }
                }
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                s1 s1VarF = l0.f(b0Var.A);
                int i14 = s1VarF == null ? 0 : s1VarF.f4398a.l().f14563a;
                int i15 = s1VarF == null ? 0 : s1VarF.f4398a.l().f14565c;
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z12 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z12 = true;
                }
                if (i11 <= 0 || b0Var.C != null) {
                    View view2 = b0Var.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != i14 || marginLayoutParams2.rightMargin != i15) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = i14;
                            marginLayoutParams2.rightMargin = i15;
                            b0Var.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    b0Var.C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i14;
                    layoutParams.rightMargin = i15;
                    b0Var.A.addView(b0Var.C, -1, layoutParams);
                }
                View view4 = b0Var.C;
                boolean z14 = view4 != null;
                if (z14 && view4.getVisibility() != 0) {
                    View view5 = b0Var.C;
                    if ((view5.getWindowSystemUiVisibility() & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0) {
                        iC = Build.VERSION.SDK_INT >= 23 ? i4.b.c(context, R.color.abc_decor_view_status_guard_light) : context.getResources().getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        iC = Build.VERSION.SDK_INT >= 23 ? i4.b.c(context, R.color.abc_decor_view_status_guard) : context.getResources().getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(iC);
                }
                if (!b0Var.H && z14) {
                    i10 = 0;
                }
                z11 = z12;
                z10 = z14;
            } else {
                z11 = true;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z10 = false;
                } else {
                    z10 = false;
                    z11 = false;
                }
            }
            if (z11) {
                b0Var.f6741v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = b0Var.C;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        if (i7 != i10) {
            int i18 = o1Var.l().f14563a;
            int i19 = o1Var.l().f14565c;
            int i20 = o1Var.l().f14566d;
            int i21 = Build.VERSION.SDK_INT;
            if (i21 >= 34) {
                e1Var = new g1(s1Var);
            } else if (i21 >= 30) {
                e1Var = new f1(s1Var);
            } else {
                e1Var = i21 >= 29 ? new e1(s1Var) : new d1(s1Var);
            }
            e1Var.g(x3.b.b(i18, i10, i19, i20));
            s1VarB = e1Var.b();
        } else {
            s1VarB = s1Var;
        }
        WeakHashMap weakHashMap = l0.f4369a;
        WindowInsets windowInsetsB = s1VarB.b();
        if (windowInsetsB == null) {
            return s1VarB;
        }
        WindowInsets windowInsetsB2 = e4.c0.b(view, windowInsetsB);
        return !windowInsetsB2.equals(windowInsetsB) ? s1.c(view, windowInsetsB2) : s1VarB;
    }
}
