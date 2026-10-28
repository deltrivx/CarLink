package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import e4.t1;
import e4.u1;
import e4.v1;
import e4.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class w extends v {
    @Override // c.u, o9.e0
    public void P(o0 o0Var, o0 o0Var2, Window window, View view, boolean z10, boolean z11) {
        k9.a u1Var;
        i9.l.e(o0Var, "statusBarStyle");
        i9.l.e(o0Var2, "navigationBarStyle");
        i9.l.e(window, "window");
        i9.l.e(view, "view");
        g5.a.i0(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        a2.d dVar = new a2.d(view);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            u1Var = new w1(window, dVar, 1);
        } else if (i7 >= 30) {
            u1Var = new t1(window, dVar, 1);
        } else if (i7 >= 26) {
            u1Var = new v1(window, dVar, 0);
        } else {
            u1Var = i7 >= 23 ? new u1(window, dVar, 0) : new t1(window, dVar, 0);
        }
        u1Var.P(!z10);
        u1Var.O(!z11);
    }
}
