package e4;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f4434e;

    public z0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f4434e = windowInsetsAnimation;
    }

    @Override // e4.a1
    public final float a() {
        return this.f4434e.getAlpha();
    }

    @Override // e4.a1
    public final long b() {
        return this.f4434e.getDurationMillis();
    }

    @Override // e4.a1
    public final float c() {
        return this.f4434e.getInterpolatedFraction();
    }

    @Override // e4.a1
    public final int d() {
        return this.f4434e.getTypeMask();
    }

    @Override // e4.a1
    public final void e(float f10) {
        this.f4434e.setFraction(f10);
    }
}
