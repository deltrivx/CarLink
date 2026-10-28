package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0.d f1963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0.d f1964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0.d f1965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0.d f1966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0.d f1967e;

    public k1() {
        k0.d dVar = j1.f1948a;
        k0.d dVar2 = j1.f1949b;
        k0.d dVar3 = j1.f1950c;
        k0.d dVar4 = j1.f1951d;
        k0.d dVar5 = j1.f1952e;
        this.f1963a = dVar;
        this.f1964b = dVar2;
        this.f1965c = dVar3;
        this.f1966d = dVar4;
        this.f1967e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return i9.l.a(this.f1963a, k1Var.f1963a) && i9.l.a(this.f1964b, k1Var.f1964b) && i9.l.a(this.f1965c, k1Var.f1965c) && i9.l.a(this.f1966d, k1Var.f1966d) && i9.l.a(this.f1967e, k1Var.f1967e);
    }

    public final int hashCode() {
        return this.f1967e.hashCode() + ((this.f1966d.hashCode() + ((this.f1965c.hashCode() + ((this.f1964b.hashCode() + (this.f1963a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f1963a + ", small=" + this.f1964b + ", medium=" + this.f1965c + ", large=" + this.f1966d + ", extraLarge=" + this.f1967e + ')';
    }
}
