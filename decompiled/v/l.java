package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13394a;

    public l(float f10) {
        this.f13394a = f10;
    }

    @Override // v.p
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f13394a;
        }
        return 0.0f;
    }

    @Override // v.p
    public final int b() {
        return 1;
    }

    @Override // v.p
    public final p c() {
        return new l(0.0f);
    }

    @Override // v.p
    public final void d() {
        this.f13394a = 0.0f;
    }

    @Override // v.p
    public final void e(float f10, int i7) {
        if (i7 == 0) {
            this.f13394a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && ((l) obj).f13394a == this.f13394a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13394a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f13394a;
    }
}
