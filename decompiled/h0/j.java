package h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6330b;

    public j(int i7, int i10) {
        this.f6329a = i7;
        this.f6330b = i10;
        if (!(i7 >= 0)) {
            c0.b.a("negative start index");
        }
        if (i10 >= i7) {
            return;
        }
        c0.b.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6329a == jVar.f6329a && this.f6330b == jVar.f6330b;
    }

    public final int hashCode() {
        return (this.f6329a * 31) + this.f6330b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f6329a);
        sb2.append(", end=");
        return a2.f.H(sb2, this.f6330b, ')');
    }
}
