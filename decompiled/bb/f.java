package bb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.b f1681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1682b;

    public f(wa.b bVar, int i7) {
        this.f1681a = bVar;
        this.f1682b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i9.l.a(this.f1681a, fVar.f1681a) && this.f1682b == fVar.f1682b;
    }

    public final int hashCode() {
        return (this.f1681a.hashCode() * 31) + this.f1682b;
    }

    public final String toString() {
        int i7;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            i7 = this.f1682b;
            if (i10 >= i7) {
                break;
            }
            sb2.append("kotlin/Array<");
            i10++;
        }
        sb2.append(this.f1681a);
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
