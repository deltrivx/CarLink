package j;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, b0 b0Var) {
        Objects.requireNonNull(b0Var);
        c.g0 g0Var = new c.g0(1, b0Var);
        c.p.m(obj).registerOnBackInvokedCallback(1000000, g0Var);
        return g0Var;
    }

    public static void c(Object obj, Object obj2) {
        c.p.m(obj).unregisterOnBackInvokedCallback(c.p.j(obj2));
    }
}
