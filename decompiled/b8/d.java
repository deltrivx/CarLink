package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c2 {
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1573c;

    public d(int i7, int i10) {
        this.f1572b = i7;
        this.f1573c = i10;
    }

    public /* synthetic */ d(int i7, int i10, int i11) {
        if ((i7 & 1) == 0) {
            this.f1572b = 0;
        } else {
            this.f1572b = i10;
        }
        if ((i7 & 2) == 0) {
            this.f1573c = 0;
        } else {
            this.f1573c = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1572b == dVar.f1572b && this.f1573c == dVar.f1573c;
    }

    public final int hashCode() {
        return (this.f1572b * 31) + this.f1573c;
    }

    public final String toString() {
        return "Amap(keyType=" + this.f1572b + ", code=" + this.f1573c + ")";
    }
}
