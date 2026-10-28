package u6;

import android.app.Activity;
import android.view.Display;
import android.view.WindowManager;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13070a = new HashMap();

    public static boolean a(Activity activity) {
        Display defaultDisplay;
        if (d7.a.r()) {
            defaultDisplay = activity.getDisplay();
        } else {
            WindowManager windowManager = activity.getWindowManager();
            defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        }
        if (defaultDisplay == null) {
            return false;
        }
        int rotation = defaultDisplay.getRotation();
        return rotation == 2 || rotation == 3;
    }

    public static synchronized void b(Activity activity) {
        if (activity.getRequestedOrientation() == -1) {
            return;
        }
        Integer num = (Integer) f13070a.get(Integer.valueOf(activity.hashCode()));
        if (num == null) {
            return;
        }
        if (num.intValue() == -1) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }
}
