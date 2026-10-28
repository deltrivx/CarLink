package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends c2 {
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1565c;

    public a1(int i7, int i10) {
        this.f1564b = i7;
        this.f1565c = i10;
    }

    public /* synthetic */ a1(int i7, int i10, int i11) {
        if ((i7 & 1) == 0) {
            this.f1564b = 0;
        } else {
            this.f1564b = i10;
        }
        if ((i7 & 2) == 0) {
            this.f1565c = 0;
        } else {
            this.f1565c = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f1564b == a1Var.f1564b && this.f1565c == a1Var.f1565c;
    }

    public final int hashCode() {
        return (this.f1564b * 31) + this.f1565c;
    }

    public final String toString() {
        return "MediaButton(keyCode=" + this.f1564b + ", action=" + this.f1565c + ")";
    }
}
