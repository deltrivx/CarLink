package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3542d;

    public b0(int i7, int i10, int i11, int i12) {
        this.f3539a = i7;
        this.f3540b = i10;
        this.f3541c = i11;
        this.f3542d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f3539a == b0Var.f3539a && this.f3540b == b0Var.f3540b && this.f3541c == b0Var.f3541c && this.f3542d == b0Var.f3542d;
    }

    public final int hashCode() {
        return (((((this.f3539a * 31) + this.f3540b) * 31) + this.f3541c) * 31) + this.f3542d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f3539a);
        sb2.append(", top=");
        sb2.append(this.f3540b);
        sb2.append(", right=");
        sb2.append(this.f3541c);
        sb2.append(", bottom=");
        return a2.f.H(sb2, this.f3542d, ')');
    }
}
