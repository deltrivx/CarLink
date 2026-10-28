package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c2 {
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1568c;

    public /* synthetic */ b0(int i7, int i10, boolean z10) {
        this.f1567b = (i7 & 1) == 0 ? true : z10;
        if ((i7 & 2) == 0) {
            this.f1568c = 0;
        } else {
            this.f1568c = i10;
        }
    }

    public b0(int i7, boolean z10) {
        this.f1567b = z10;
        this.f1568c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f1567b == b0Var.f1567b && this.f1568c == b0Var.f1568c;
    }

    public final int hashCode() {
        return ((this.f1567b ? 1231 : 1237) * 31) + this.f1568c;
    }

    public final String toString() {
        return "Brightness(isLowerThan=" + this.f1567b + ", code=" + this.f1568c + ")";
    }
}
