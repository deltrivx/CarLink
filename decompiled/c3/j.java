package c3;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kb.d f2385a;

    static {
        f2385a = Build.VERSION.SDK_INT >= 23 ? new kb.d(10) : new kb.d(11);
    }
}
