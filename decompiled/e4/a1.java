package e4;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f4312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4313d;

    public a1(int i7, Interpolator interpolator, long j5) {
        this.f4310a = i7;
        this.f4312c = interpolator;
        this.f4313d = j5;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f4313d;
    }

    public float c() {
        Interpolator interpolator = this.f4312c;
        return interpolator != null ? interpolator.getInterpolation(this.f4311b) : this.f4311b;
    }

    public int d() {
        return this.f4310a;
    }

    public void e(float f10) {
        this.f4311b = f10;
    }
}
