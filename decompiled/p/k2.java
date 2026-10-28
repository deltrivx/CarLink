package p;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends f2 implements g2 {
    public static final Method D;
    public l0.o0 C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.g2
    public final void d(o.m mVar, MenuItem menuItem) {
        l0.o0 o0Var = this.C;
        if (o0Var != null) {
            o0Var.d(mVar, menuItem);
        }
    }

    @Override // p.f2
    public final s1 p(Context context, boolean z10) {
        j2 j2Var = new j2(context, z10);
        j2Var.setHoverListener(this);
        return j2Var;
    }

    @Override // p.g2
    public final void z(o.m mVar, o.o oVar) {
        l0.o0 o0Var = this.C;
        if (o0Var != null) {
            o0Var.z(mVar, oVar);
        }
    }
}
