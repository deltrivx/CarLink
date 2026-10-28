package a2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27d;

    public k(float f10, float f11, int i7, int i10, int i11) {
        f11 = (i11 & 2) != 0 ? 4.0f : f11;
        i7 = (i11 & 4) != 0 ? 0 : i7;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        this.f24a = f10;
        this.f25b = f11;
        this.f26c = i7;
        this.f27d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24a == kVar.f24a && this.f25b == kVar.f25b && this.f26c == kVar.f26c && this.f27d == kVar.f27d;
    }

    public final int hashCode() {
        return (((ob.a.j(this.f25b, Float.floatToIntBits(this.f24a) * 31, 31) + this.f26c) * 31) + this.f27d) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f24a);
        sb2.append(", miter=");
        sb2.append(this.f25b);
        sb2.append(", cap=");
        String str2 = "Unknown";
        int i7 = this.f26c;
        if (i7 == 0) {
            str = "Butt";
        } else if (i7 == 1) {
            str = "Round";
        } else {
            str = i7 == 2 ? "Square" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i10 = this.f27d;
        if (i10 == 0) {
            str2 = "Miter";
        } else if (i10 == 1) {
            str2 = "Round";
        } else if (i10 == 2) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
