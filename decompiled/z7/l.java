package z7;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.Window;
import androidx.lifecycle.z;
import e4.t1;
import e4.u1;
import e4.v1;
import e4.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static boolean a(String str) {
        int color = Color.parseColor(str);
        ThreadLocal threadLocal = x3.a.f14561a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(color);
        int iGreen = Color.green(color);
        int iBlue = Color.blue(color);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) iRed) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static void b(Activity activity, k kVar) {
        k9.a u1Var;
        i9.l.e(activity, "activity");
        i9.l.e(kVar, "state");
        String str = kVar.f15771h;
        String str2 = kVar.f15767d;
        Window window = activity.getWindow();
        if (kVar.k) {
            g5.a.i0(window, false);
            window.getDecorView().post(new z(25, window));
        } else {
            g5.a.i0(window, true);
        }
        a2.d dVar = new a2.d(window.getDecorView());
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
        u1Var.S();
        if (kVar.f15768e) {
            u1Var.T(2);
        } else {
            u1Var.C(2);
        }
        if (kVar.f15765b) {
            u1Var.T(1);
        } else {
            u1Var.C(1);
        }
        window.setStatusBarColor(Color.parseColor(str2));
        u1Var.P(a(str2));
        window.setNavigationBarColor(Color.parseColor(str));
        u1Var.O(a(str));
    }
}
