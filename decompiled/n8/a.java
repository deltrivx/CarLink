package n8;

import android.content.Context;
import b3.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8.o f8892a = t8.a.d(new i0(20));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t8.o f8893b = t8.a.d(new i0(21));

    public static String a() {
        Object objB;
        try {
            int i7 = b().getApplicationInfo().labelRes;
            objB = i7 != 0 ? b().getString(i7) : b().getPackageManager().getApplicationLabel(b().getApplicationInfo()).toString();
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        if (objB instanceof t8.l) {
            objB = "未知应用";
        }
        return (String) objB;
    }

    public static Context b() {
        return (Context) f8892a.getValue();
    }
}
