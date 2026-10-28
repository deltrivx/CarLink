package u3;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Object a(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static int b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String c(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static void d(Activity activity, String[] strArr, int i7) {
        activity.requestPermissions(strArr, i7);
    }
}
