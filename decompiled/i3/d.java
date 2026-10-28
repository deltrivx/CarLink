package i3;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6616a;

    static {
        f6616a = Build.VERSION.SDK_INT >= 24 ? new a2.b(10) : new kb.d(20);
    }
}
