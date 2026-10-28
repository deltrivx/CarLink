package b2;

import android.os.Build;
import android.view.Surface;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f1222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f1223d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f1225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f1226g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f1220a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f1221b = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f1224e = new d();

    public boolean a() {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 23) {
            return true;
        }
        if (i7 != 22) {
            return false;
        }
        synchronized (this) {
            method = null;
            try {
                Method declaredMethod = f1225f;
                if (!f1226g) {
                    f1226g = true;
                    declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    f1225f = declaredMethod;
                }
                method = declaredMethod;
            } catch (Throwable unused) {
                f1225f = null;
            }
        }
        return method != null;
    }
}
