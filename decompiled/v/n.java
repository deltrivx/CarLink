package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13414c;

    public n(float f10, float f11, float f12) {
        this.f13412a = f10;
        this.f13413b = f11;
        this.f13414c = f12;
    }

    @Override // v.p
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f13412a;
        }
        if (i7 == 1) {
            return this.f13413b;
        }
        if (i7 != 2) {
            return 0.0f;
        }
        return this.f13414c;
    }

    @Override // v.p
    public final int b() {
        return 3;
    }

    @Override // v.p
    public final p c() {
        return new n(0.0f, 0.0f, 0.0f);
    }

    @Override // v.p
    public final void d() {
        this.f13412a = 0.0f;
        this.f13413b = 0.0f;
        this.f13414c = 0.0f;
    }

    @Override // v.p
    public final void e(float f10, int i7) {
        if (i7 == 0) {
            this.f13412a = f10;
        } else if (i7 == 1) {
            this.f13413b = f10;
        } else {
            if (i7 != 2) {
                return;
            }
            this.f13414c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f13412a == this.f13412a && nVar.f13413b == this.f13413b && nVar.f13414c == this.f13414c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13414c) + ob.a.j(this.f13413b, Float.floatToIntBits(this.f13412a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f13412a + ", v2 = " + this.f13413b + ", v3 = " + this.f13414c;
    }
}
