package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends c2 {
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1658d;

    public /* synthetic */ u0(int i7, int i10, int i11, boolean z10) {
        if ((i7 & 1) == 0) {
            this.f1656b = 0;
        } else {
            this.f1656b = i10;
        }
        if ((i7 & 2) == 0) {
            this.f1657c = 0;
        } else {
            this.f1657c = i11;
        }
        if ((i7 & 4) == 0) {
            this.f1658d = true;
        } else {
            this.f1658d = z10;
        }
    }

    public u0(int i7, int i10, boolean z10) {
        this.f1656b = i7;
        this.f1657c = i10;
        this.f1658d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f1656b == u0Var.f1656b && this.f1657c == u0Var.f1657c && this.f1658d == u0Var.f1658d;
    }

    public final int hashCode() {
        return (((this.f1656b * 31) + this.f1657c) * 31) + (this.f1658d ? 1231 : 1237);
    }

    public final String toString() {
        return "KeyBoard(keyCode=" + this.f1656b + ", action=" + this.f1657c + ", consumed=" + this.f1658d + ")";
    }
}
