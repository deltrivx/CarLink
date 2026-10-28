package x1;

import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14517a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14518b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14519c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14520d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f14517a = Math.max(f10, this.f14517a);
        this.f14518b = Math.max(f11, this.f14518b);
        this.f14519c = Math.min(f12, this.f14519c);
        this.f14520d = Math.min(f13, this.f14520d);
    }

    public final boolean b() {
        return (this.f14517a >= this.f14519c) | (this.f14518b >= this.f14520d);
    }

    public final String toString() {
        return "MutableRect(" + n.N0(this.f14517a) + ", " + n.N0(this.f14518b) + ", " + n.N0(this.f14519c) + ", " + n.N0(this.f14520d) + ')';
    }
}
