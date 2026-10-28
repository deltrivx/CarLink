package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13420d;

    public o(float f10, float f11, float f12, float f13) {
        this.f13417a = f10;
        this.f13418b = f11;
        this.f13419c = f12;
        this.f13420d = f13;
    }

    @Override // v.p
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f13417a;
        }
        if (i7 == 1) {
            return this.f13418b;
        }
        if (i7 == 2) {
            return this.f13419c;
        }
        if (i7 != 3) {
            return 0.0f;
        }
        return this.f13420d;
    }

    @Override // v.p
    public final int b() {
        return 4;
    }

    @Override // v.p
    public final p c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // v.p
    public final void d() {
        this.f13417a = 0.0f;
        this.f13418b = 0.0f;
        this.f13419c = 0.0f;
        this.f13420d = 0.0f;
    }

    @Override // v.p
    public final void e(float f10, int i7) {
        if (i7 == 0) {
            this.f13417a = f10;
            return;
        }
        if (i7 == 1) {
            this.f13418b = f10;
        } else if (i7 == 2) {
            this.f13419c = f10;
        } else {
            if (i7 != 3) {
                return;
            }
            this.f13420d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f13417a == this.f13417a && oVar.f13418b == this.f13418b && oVar.f13419c == this.f13419c && oVar.f13420d == this.f13420d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13420d) + ob.a.j(this.f13419c, ob.a.j(this.f13418b, Float.floatToIntBits(this.f13417a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f13417a + ", v2 = " + this.f13418b + ", v3 = " + this.f13419c + ", v4 = " + this.f13420d;
    }
}
