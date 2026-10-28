package e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4276f;

    public y(float f10, float f11, float f12, float f13) {
        super(2);
        this.f4273c = f10;
        this.f4274d = f11;
        this.f4275e = f12;
        this.f4276f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f4273c, yVar.f4273c) == 0 && Float.compare(this.f4274d, yVar.f4274d) == 0 && Float.compare(this.f4275e, yVar.f4275e) == 0 && Float.compare(this.f4276f, yVar.f4276f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4276f) + ob.a.j(this.f4275e, ob.a.j(this.f4274d, Float.floatToIntBits(this.f4273c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f4273c);
        sb2.append(", dy1=");
        sb2.append(this.f4274d);
        sb2.append(", dx2=");
        sb2.append(this.f4275e);
        sb2.append(", dy2=");
        return ob.a.r(sb2, this.f4276f, ')');
    }
}
