package t8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f12822e = new g(2, 2, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12826d;

    public g(int i7, int i10, int i11) {
        this.f12823a = i7;
        this.f12824b = i10;
        this.f12825c = i11;
        if (i7 >= 0 && i7 < 256 && i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256) {
            this.f12826d = (i7 << 16) + (i10 << 8) + i11;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i10 + '.' + i11).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        i9.l.e(gVar, "other");
        return this.f12826d - gVar.f12826d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f12826d == gVar.f12826d;
    }

    public final int hashCode() {
        return this.f12826d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12823a);
        sb2.append('.');
        sb2.append(this.f12824b);
        sb2.append('.');
        sb2.append(this.f12825c);
        return sb2.toString();
    }
}
