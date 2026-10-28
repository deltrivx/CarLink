package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13402b;

    public m(float f10, float f11) {
        this.f13401a = f10;
        this.f13402b = f11;
    }

    @Override // v.p
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f13401a;
        }
        if (i7 != 1) {
            return 0.0f;
        }
        return this.f13402b;
    }

    @Override // v.p
    public final int b() {
        return 2;
    }

    @Override // v.p
    public final p c() {
        return new m(0.0f, 0.0f);
    }

    @Override // v.p
    public final void d() {
        this.f13401a = 0.0f;
        this.f13402b = 0.0f;
    }

    @Override // v.p
    public final void e(float f10, int i7) {
        if (i7 == 0) {
            this.f13401a = f10;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f13402b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f13401a == this.f13401a && mVar.f13402b == this.f13402b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13402b) + (Float.floatToIntBits(this.f13401a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f13401a + ", v2 = " + this.f13402b;
    }
}
