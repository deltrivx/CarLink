package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends c2 {
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1603c;

    public /* synthetic */ j1(int i7, int i10, boolean z10) {
        this.f1602b = (i7 & 1) == 0 ? true : z10;
        if ((i7 & 2) == 0) {
            this.f1603c = 0;
        } else {
            this.f1603c = i10;
        }
    }

    public j1(int i7, boolean z10) {
        this.f1602b = z10;
        this.f1603c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f1602b == j1Var.f1602b && this.f1603c == j1Var.f1603c;
    }

    public final int hashCode() {
        return ((this.f1602b ? 1231 : 1237) * 31) + this.f1603c;
    }

    public final String toString() {
        return "Sensor(isLowerThan=" + this.f1602b + ", code=" + this.f1603c + ")";
    }
}
