package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f11586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11589f;

    public s(int i7, boolean z10) {
        z10 = (i7 & 4) != 0 ? true : z10;
        this.f11584a = true;
        this.f11585b = true;
        this.f11586c = a0.f11527a;
        this.f11587d = z10;
        this.f11588e = true;
        this.f11589f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f11584a == sVar.f11584a && this.f11585b == sVar.f11585b && this.f11586c == sVar.f11586c && this.f11587d == sVar.f11587d && this.f11588e == sVar.f11588e;
    }

    public final int hashCode() {
        return ((((this.f11586c.hashCode() + ((((this.f11584a ? 1231 : 1237) * 31) + (this.f11585b ? 1231 : 1237)) * 31)) * 31) + (this.f11587d ? 1231 : 1237)) * 31) + (this.f11588e ? 1231 : 1237);
    }
}
