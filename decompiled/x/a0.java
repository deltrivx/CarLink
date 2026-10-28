package x;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f14303a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f14304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f14305c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f14304b = dLog;
        f14305c = dLog - 1.0d;
    }
}
