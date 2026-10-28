package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4248f;

    public q(float f10, float f11, float f12, float f13) {
        super(2);
        this.f4245c = f10;
        this.f4246d = f11;
        this.f4247e = f12;
        this.f4248f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f4245c, qVar.f4245c) == 0 && Float.compare(this.f4246d, qVar.f4246d) == 0 && Float.compare(this.f4247e, qVar.f4247e) == 0 && Float.compare(this.f4248f, qVar.f4248f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4248f) + ob.a.j(this.f4247e, ob.a.j(this.f4246d, Float.floatToIntBits(this.f4245c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f4245c);
        sb2.append(", y1=");
        sb2.append(this.f4246d);
        sb2.append(", x2=");
        sb2.append(this.f4247e);
        sb2.append(", y2=");
        return ob.a.r(sb2, this.f4248f, ')');
    }
}
