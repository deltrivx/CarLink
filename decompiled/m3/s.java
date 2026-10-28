package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f8433c = new s(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f8434d = new s(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8436b;

    public s(int i7, boolean z10) {
        this.f8435a = i7;
        this.f8436b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f8435a == sVar.f8435a && this.f8436b == sVar.f8436b;
    }

    public final int hashCode() {
        return (this.f8435a * 31) + (this.f8436b ? 1231 : 1237);
    }

    public final String toString() {
        if (equals(f8433c)) {
            return "TextMotion.Static";
        }
        return equals(f8434d) ? "TextMotion.Animated" : "Invalid";
    }
}
