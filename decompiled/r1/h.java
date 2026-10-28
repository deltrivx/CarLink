package r1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11110b;

    public h(float f10, float f11) {
        this.f11109a = f10;
        this.f11110b = f11;
    }

    @Override // r1.d
    public final long a(long j5, long j10, n3.o oVar) {
        float f10 = (((int) (j10 >> 32)) - ((int) (j5 >> 32))) / 2.0f;
        float f11 = (((int) (j10 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f;
        n3.o oVar2 = n3.o.f8749a;
        float f12 = this.f11109a;
        if (oVar != oVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        return (((long) Math.round((f13 + this.f11110b) * f11)) & 4294967295L) | (((long) Math.round(f14)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f11109a, hVar.f11109a) == 0 && Float.compare(this.f11110b, hVar.f11110b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11110b) + (Float.floatToIntBits(this.f11109a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f11109a);
        sb2.append(", verticalBias=");
        return ob.a.r(sb2, this.f11110b, ')');
    }
}
