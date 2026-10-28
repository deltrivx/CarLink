package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5888b;

    public v(int i7, int i10) {
        this.f5887a = i7;
        this.f5888b = i10;
    }

    @Override // g3.g
    public final void a(h hVar) {
        int iM = n3.r.m(this.f5887a, 0, hVar.f5859a.l());
        int iM2 = n3.r.m(this.f5888b, 0, hVar.f5859a.l());
        if (iM < iM2) {
            hVar.f(iM, iM2);
        } else {
            hVar.f(iM2, iM);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f5887a == vVar.f5887a && this.f5888b == vVar.f5888b;
    }

    public final int hashCode() {
        return (this.f5887a * 31) + this.f5888b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f5887a);
        sb2.append(", end=");
        return a2.f.H(sb2, this.f5888b, ')');
    }
}
