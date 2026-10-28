package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5858b;

    public f(int i7, int i10) {
        this.f5857a = i7;
        this.f5858b = i10;
        if (i7 >= 0 && i10 >= 0) {
            return;
        }
        h3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i10 + " respectively.");
    }

    @Override // g3.g
    public final void a(h hVar) {
        int i7 = 0;
        for (int i10 = 0; i10 < this.f5857a; i10++) {
            int i11 = i7 + 1;
            int i12 = hVar.f5860b;
            if (i12 <= i11) {
                i7 = i12;
                break;
            }
            i7 = (Character.isHighSurrogate(hVar.b((i12 - i11) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.f5860b - i11))) ? i7 + 2 : i11;
        }
        int iL = 0;
        for (int i13 = 0; i13 < this.f5858b; i13++) {
            int i14 = iL + 1;
            int i15 = hVar.f5861c;
            d3.e eVar = hVar.f5859a;
            if (i15 + i14 >= eVar.l()) {
                iL = eVar.l() - hVar.f5861c;
                break;
            }
            iL = (Character.isHighSurrogate(hVar.b((hVar.f5861c + i14) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.f5861c + i14))) ? iL + 2 : i14;
        }
        int i16 = hVar.f5861c;
        hVar.a(i16, iL + i16);
        int i17 = hVar.f5860b;
        hVar.a(i17 - i7, i17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5857a == fVar.f5857a && this.f5858b == fVar.f5858b;
    }

    public final int hashCode() {
        return (this.f5857a * 31) + this.f5858b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f5857a);
        sb2.append(", lengthAfterCursor=");
        return a2.f.H(sb2, this.f5858b, ')');
    }
}
