package c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1792a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1793b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s f1794c;

    public static void a(j.j jVar) {
        n0 n0Var = n0.f1770a;
        o0 o0Var = new o0(0, 0, n0Var);
        o0 o0Var2 = new o0(f1792a, f1793b, n0Var);
        View decorView = jVar.getWindow().getDecorView();
        i9.l.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        i9.l.d(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) n0Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        i9.l.d(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) n0Var.invoke(resources2)).booleanValue();
        s sVar = f1794c;
        o9.e0 tVar = sVar;
        if (sVar == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                tVar = new x();
            } else if (i7 >= 29) {
                tVar = new w();
            } else if (i7 >= 28) {
                tVar = new v();
            } else if (i7 >= 26) {
                tVar = new u();
            } else if (i7 >= 23) {
                tVar = new t();
            } else {
                s sVar2 = new s();
                f1794c = sVar2;
                tVar = sVar2;
            }
        }
        Window window = jVar.getWindow();
        i9.l.d(window, "window");
        tVar.P(o0Var, o0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = jVar.getWindow();
        i9.l.d(window2, "window");
        tVar.k(window2);
    }
}
