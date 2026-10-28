package e4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static s1 b(View view, s1 s1Var, Rect rect) {
        WindowInsets windowInsetsB = s1Var.b();
        if (windowInsetsB != null) {
            return s1.c(view, view.computeSystemWindowInsets(windowInsetsB, rect));
        }
        rect.setEmpty();
        return s1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static s1 e(View view) {
        h1 e1Var;
        if (c1.f4325d && view.isAttachedToWindow()) {
            try {
                Object obj = c1.f4322a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) c1.f4323b.get(obj);
                    Rect rect2 = (Rect) c1.f4324c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 34) {
                            e1Var = new g1();
                        } else if (i7 >= 30) {
                            e1Var = new f1();
                        } else {
                            e1Var = i7 >= 29 ? new e1() : new d1();
                        }
                        e1Var.e(x3.b.b(rect.left, rect.top, rect.right, rect.bottom));
                        e1Var.g(x3.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        s1 s1VarB = e1Var.b();
                        s1VarB.f4398a.t(s1VarB);
                        s1VarB.f4398a.d(view.getRootView());
                        return s1VarB;
                    }
                }
            } catch (IllegalAccessException e7) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f10) {
        view.setElevation(f10);
    }

    public static void i(View view, o oVar) {
        d0 d0Var = oVar != null ? new d0(view, oVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, d0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (d0Var != null) {
            view.setOnApplyWindowInsetsListener(d0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
