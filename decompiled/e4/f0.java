package e4;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    public static s1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        s1 s1VarC = s1.c(null, rootWindowInsets);
        o1 o1Var = s1VarC.f4398a;
        o1Var.t(s1VarC);
        o1Var.d(view.getRootView());
        return s1VarC;
    }

    public static void b(View view, int i7, int i10) {
        view.setScrollIndicators(i7, i10);
    }
}
