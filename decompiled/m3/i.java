package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f8413c = new i(f.f8409c, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8415b;

    public i(float f10, int i7) {
        this.f8414a = f10;
        this.f8415b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f10 = iVar.f8414a;
        float f11 = f.f8408b;
        return Float.compare(this.f8414a, f10) == 0 && this.f8415b == iVar.f8415b;
    }

    public final int hashCode() {
        float f10 = f.f8408b;
        return ((Float.floatToIntBits(this.f8414a) * 31) + this.f8415b) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f8414a));
        sb2.append(", trim=");
        int i7 = this.f8415b;
        if (i7 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i7 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i7 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i7 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(",mode=Mode(value=0))");
        return sb2.toString();
    }
}
