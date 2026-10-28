package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3.a0 f3556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3557c;

    public f(float f10, b3.a0 a0Var) {
        this.f3555a = f10;
        this.f3556b = a0Var;
        this.f3557c = f10;
    }

    @Override // d0.e, d0.g
    public final float a() {
        return this.f3557c;
    }

    @Override // d0.g
    public final void b(int i7, o2.o0 o0Var, int[] iArr, int[] iArr2) {
        c(o0Var, i7, iArr, n3.o.f8749a, iArr2);
    }

    @Override // d0.e
    public final void c(n3.c cVar, int i7, int[] iArr, n3.o oVar, int[] iArr2) {
        int i10;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iA0 = cVar.a0(this.f3555a);
        boolean z10 = oVar == n3.o.f8750b;
        b bVar = h.f3566a;
        if (z10) {
            i10 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i11 = iArr[length];
                int iMin2 = Math.min(i10, i7 - i11);
                iArr2[length] = iMin2;
                iMin = Math.min(iA0, (i7 - iMin2) - i11);
                i10 = iArr2[length] + i11 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i12 = 0;
            i10 = 0;
            iMin = 0;
            int i13 = 0;
            while (i12 < length2) {
                int i14 = iArr[i12];
                int iMin3 = Math.min(i10, i7 - i14);
                iArr2[i13] = iMin3;
                int iMin4 = Math.min(iA0, (i7 - iMin3) - i14);
                int i15 = iArr2[i13] + i14 + iMin4;
                i12++;
                iMin = iMin4;
                i10 = i15;
                i13++;
            }
        }
        int i16 = i10 - iMin;
        if (i16 < i7) {
            int iIntValue = ((Number) this.f3556b.invoke(Integer.valueOf(i7 - i16), oVar)).intValue();
            int length3 = iArr2.length;
            for (int i17 = 0; i17 < length3; i17++) {
                iArr2[i17] = iArr2[i17] + iIntValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n3.f.a(this.f3555a, fVar.f3555a) && this.f3556b.equals(fVar.f3556b);
    }

    public final int hashCode() {
        return this.f3556b.hashCode() + (((Float.floatToIntBits(this.f3555a) * 31) + 1231) * 31);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) n3.f.b(this.f3555a)) + ", " + this.f3556b + ')';
    }
}
