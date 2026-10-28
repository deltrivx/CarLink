package n3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f8740e = new k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8744d;

    public k(int i7, int i10, int i11, int i12) {
        this.f8741a = i7;
        this.f8742b = i10;
        this.f8743c = i11;
        this.f8744d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8741a == kVar.f8741a && this.f8742b == kVar.f8742b && this.f8743c == kVar.f8743c && this.f8744d == kVar.f8744d;
    }

    public final int hashCode() {
        return (((((this.f8741a * 31) + this.f8742b) * 31) + this.f8743c) * 31) + this.f8744d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f8741a);
        sb2.append(", ");
        sb2.append(this.f8742b);
        sb2.append(", ");
        sb2.append(this.f8743c);
        sb2.append(", ");
        return a2.f.H(sb2, this.f8744d, ')');
    }
}
