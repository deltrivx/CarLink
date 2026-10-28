package e4;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1 f4321a;

    public b1(int i7, Interpolator interpolator, long j5) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4321a = new z0(b2.k.i(i7, interpolator, j5));
        } else {
            this.f4321a = new x0(i7, interpolator, j5);
        }
    }
}
