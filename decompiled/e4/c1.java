package e4;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f4322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f4323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f4324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4325d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f4322a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f4323b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f4324c = declaredField3;
            declaredField3.setAccessible(true);
            f4325d = true;
        } catch (ReflectiveOperationException e7) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
        }
    }
}
