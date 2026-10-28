package e4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.baidu.carlifevehicle.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f4425e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r4.a f4426f = new r4.a(r4.a.f11622c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f4427g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f4428h = new AccelerateInterpolator(1.5f);

    public static void f(View view, b1 b1Var) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            t0VarK.a(b1Var);
            if (t0VarK.f4400a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                f(viewGroup.getChildAt(i7), b1Var);
            }
        }
    }

    public static void g(View view, b1 b1Var, s1 s1Var, boolean z10) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            t0VarK.f4401b = s1Var;
            if (!z10) {
                t0VarK.b();
                z10 = t0VarK.f4400a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                g(viewGroup.getChildAt(i7), b1Var, s1Var, z10);
            }
        }
    }

    public static void h(View view, s1 s1Var, List list) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            s1Var = t0VarK.c(s1Var, list);
            if (t0VarK.f4400a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                h(viewGroup.getChildAt(i7), s1Var, list);
            }
        }
    }

    public static void i(View view, b1 b1Var, android.support.v4.media.session.r rVar) {
        t0 t0VarK = k(view);
        if (t0VarK != null) {
            t0VarK.e(b1Var, rVar);
            if (t0VarK.f4400a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                i(viewGroup.getChildAt(i7), b1Var, rVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static t0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof w0) {
            return ((w0) tag).f4418a;
        }
        return null;
    }
}
