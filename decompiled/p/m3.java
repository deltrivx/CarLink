package p;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f9836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f9837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f9838c;

    static {
        f9838c = Build.VERSION.SDK_INT >= 27;
    }
}
