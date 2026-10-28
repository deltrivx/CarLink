package v9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f13703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13704b;

    public l(k kVar, int i7) {
        this.f13703a = kVar;
        this.f13704b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i9.l.a(this.f13703a, lVar.f13703a) && this.f13704b == lVar.f13704b;
    }

    public final int hashCode() {
        return (this.f13703a.hashCode() * 31) + this.f13704b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
        sb2.append(this.f13703a);
        sb2.append(", arity=");
        return a2.f.H(sb2, this.f13704b, ')');
    }
}
