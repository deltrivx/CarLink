package b1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1157d;

    public g(float f10, float f11, float f12, float f13) {
        this.f1154a = f10;
        this.f1155b = f11;
        this.f1156c = f12;
        this.f1157d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1154a == gVar.f1154a && this.f1155b == gVar.f1155b && this.f1156c == gVar.f1156c && this.f1157d == gVar.f1157d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1157d) + ob.a.j(this.f1156c, ob.a.j(this.f1155b, Float.floatToIntBits(this.f1154a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f1154a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f1155b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f1156c);
        sb2.append(", pressedAlpha=");
        return ob.a.r(sb2, this.f1157d, ')');
    }
}
