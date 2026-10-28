package x;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14348b;

    public e0(Context context) {
        super(context);
        this.f14347a = a.a.e(context).f8733a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i7) {
        this.f14348b = 0.0f;
        super.onAbsorb(i7);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f14348b = 0.0f;
        super.onPull(f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f14348b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f14348b = 0.0f;
        super.onRelease();
    }
}
