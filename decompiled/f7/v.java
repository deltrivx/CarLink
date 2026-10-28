package f7;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5456b;

    public v(int i7, int i10) {
        this.f5455a = i7;
        this.f5456b = i10;
    }

    public final v a(v vVar) {
        int i7 = vVar.f5456b;
        int i10 = this.f5455a;
        int i11 = i10 * i7;
        int i12 = vVar.f5455a;
        int i13 = this.f5456b;
        return i11 <= i12 * i13 ? new v(i12, (i13 * i12) / i10) : new v((i10 * i7) / i13, i7);
    }

    public final v b(v vVar) {
        int i7 = vVar.f5456b;
        int i10 = this.f5455a;
        int i11 = i10 * i7;
        int i12 = vVar.f5455a;
        int i13 = this.f5456b;
        return i11 >= i12 * i13 ? new v(i12, (i13 * i12) / i10) : new v((i10 * i7) / i13, i7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i7 = this.f5456b * this.f5455a;
        int i10 = vVar.f5456b * vVar.f5455a;
        if (i10 < i7) {
            return 1;
        }
        return i10 > i7 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f5455a == vVar.f5455a && this.f5456b == vVar.f5456b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5455a * 31) + this.f5456b;
    }

    public final String toString() {
        return this.f5455a + "x" + this.f5456b;
    }
}
