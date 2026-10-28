package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5855b;

    public e(int i7, int i10) {
        this.f5854a = i7;
        this.f5855b = i10;
        if (i7 >= 0 && i10 >= 0) {
            return;
        }
        h3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i10 + " respectively.");
    }

    @Override // g3.g
    public final void a(h hVar) {
        int i7 = hVar.f5861c;
        d3.e eVar = hVar.f5859a;
        int i10 = this.f5855b;
        int iL = i7 + i10;
        if (((i7 ^ iL) & (i10 ^ iL)) < 0) {
            iL = eVar.l();
        }
        hVar.a(hVar.f5861c, Math.min(iL, eVar.l()));
        int i11 = hVar.f5860b;
        int i12 = this.f5854a;
        int i13 = i11 - i12;
        if (((i11 ^ i13) & (i12 ^ i11)) < 0) {
            i13 = 0;
        }
        hVar.a(Math.max(0, i13), hVar.f5860b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5854a == eVar.f5854a && this.f5855b == eVar.f5855b;
    }

    public final int hashCode() {
        return (this.f5854a * 31) + this.f5855b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f5854a);
        sb2.append(", lengthAfterCursor=");
        return a2.f.H(sb2, this.f5855b, ')');
    }
}
