package r2;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f11494a;

    public v0(ViewConfiguration viewConfiguration) {
        this.f11494a = viewConfiguration;
    }

    @Override // r2.r2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // r2.r2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // r2.r2
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f11494a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // r2.r2
    public final long d() {
        float f10 = 48;
        return k9.a.b(f10, f10);
    }

    @Override // r2.r2
    public final float e() {
        return this.f11494a.getScaledMaximumFlingVelocity();
    }

    @Override // r2.r2
    public final float f() {
        return this.f11494a.getScaledTouchSlop();
    }

    @Override // r2.r2
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f11494a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
