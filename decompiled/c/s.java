package c;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends o9.e0 {
    @Override // o9.e0
    public void P(o0 o0Var, o0 o0Var2, Window window, View view, boolean z10, boolean z11) {
        i9.l.e(o0Var, "statusBarStyle");
        i9.l.e(o0Var2, "navigationBarStyle");
        i9.l.e(window, "window");
        i9.l.e(view, "view");
        g5.a.i0(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
