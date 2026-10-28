package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1318d;

    public d(Object obj, int i7, int i10, String str) {
        this.f1315a = obj;
        this.f1316b = i7;
        this.f1317c = i10;
        this.f1318d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i9.l.a(this.f1315a, dVar.f1315a) && this.f1316b == dVar.f1316b && this.f1317c == dVar.f1317c && i9.l.a(this.f1318d, dVar.f1318d);
    }

    public final int hashCode() {
        Object obj = this.f1315a;
        return this.f1318d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f1316b) * 31) + this.f1317c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f1315a);
        sb2.append(", start=");
        sb2.append(this.f1316b);
        sb2.append(", end=");
        sb2.append(this.f1317c);
        sb2.append(", tag=");
        return a2.f.I(sb2, this.f1318d, ')');
    }
}
