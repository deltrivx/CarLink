package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1327d;

    public f(int i7, int i10, Object obj) {
        this(obj, i7, i10, "");
    }

    public f(Object obj, int i7, int i10, String str) {
        this.f1324a = obj;
        this.f1325b = i7;
        this.f1326c = i10;
        this.f1327d = str;
        if (i7 <= i10) {
            return;
        }
        h3.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i9.l.a(this.f1324a, fVar.f1324a) && this.f1325b == fVar.f1325b && this.f1326c == fVar.f1326c && i9.l.a(this.f1327d, fVar.f1327d);
    }

    public final int hashCode() {
        Object obj = this.f1324a;
        return this.f1327d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f1325b) * 31) + this.f1326c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f1324a);
        sb2.append(", start=");
        sb2.append(this.f1325b);
        sb2.append(", end=");
        sb2.append(this.f1326c);
        sb2.append(", tag=");
        return a2.f.I(sb2, this.f1327d, ')');
    }
}
