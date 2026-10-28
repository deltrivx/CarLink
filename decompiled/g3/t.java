package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5884b;

    public t(int i7, int i10) {
        this.f5883a = i7;
        this.f5884b = i10;
    }

    @Override // g3.g
    public final void a(h hVar) {
        boolean z10 = hVar.f5862d != -1;
        d3.e eVar = hVar.f5859a;
        if (z10) {
            hVar.f5862d = -1;
            hVar.f5863e = -1;
        }
        int iM = n3.r.m(this.f5883a, 0, eVar.l());
        int iM2 = n3.r.m(this.f5884b, 0, eVar.l());
        if (iM != iM2) {
            if (iM < iM2) {
                hVar.e(iM, iM2);
            } else {
                hVar.e(iM2, iM);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f5883a == tVar.f5883a && this.f5884b == tVar.f5884b;
    }

    public final int hashCode() {
        return (this.f5883a * 31) + this.f5884b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f5883a);
        sb2.append(", end=");
        return a2.f.H(sb2, this.f5884b, ')');
    }
}
