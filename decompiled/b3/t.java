package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.d f1449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1451c;

    public t(j3.d dVar, int i7, int i10) {
        this.f1449a = dVar;
        this.f1450b = i7;
        this.f1451c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1449a.equals(tVar.f1449a) && this.f1450b == tVar.f1450b && this.f1451c == tVar.f1451c;
    }

    public final int hashCode() {
        return (((this.f1449a.hashCode() * 31) + this.f1450b) * 31) + this.f1451c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f1449a);
        sb2.append(", startIndex=");
        sb2.append(this.f1450b);
        sb2.append(", endIndex=");
        return a2.f.H(sb2, this.f1451c, ')');
    }
}
