package v5;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f13623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f13624b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f13623a = aVar;
        int length = iArr.length;
        int i7 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f13624b = iArr;
            return;
        }
        while (i7 < length && iArr[i7] == 0) {
            i7++;
        }
        if (i7 == length) {
            this.f13624b = new int[]{0};
            return;
        }
        int i10 = length - i7;
        int[] iArr2 = new int[i10];
        this.f13624b = iArr2;
        System.arraycopy(iArr, i7, iArr2, 0, i10);
    }

    public final b a(b bVar) {
        a aVar = bVar.f13623a;
        a aVar2 = this.f13623a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return bVar;
        }
        if (bVar.e()) {
            return this;
        }
        int[] iArr = bVar.f13624b;
        int[] iArr2 = this.f13624b;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i7 = length; i7 < iArr.length; i7++) {
            iArr3[i7] = iArr2[i7 - length] ^ iArr[i7];
        }
        return new b(aVar2, iArr3);
    }

    public final int b(int i7) {
        if (i7 == 0) {
            return c(0);
        }
        int[] iArr = this.f13624b;
        if (i7 != 1) {
            int iC = iArr[0];
            int length = iArr.length;
            for (int i10 = 1; i10 < length; i10++) {
                iC = this.f13623a.c(i7, iC) ^ iArr[i10];
            }
            return iC;
        }
        int i11 = 0;
        for (int i12 : iArr) {
            a aVar = a.f13609h;
            i11 ^= i12;
        }
        return i11;
    }

    public final int c(int i7) {
        int[] iArr = this.f13624b;
        return iArr[(iArr.length - 1) - i7];
    }

    public final int d() {
        return this.f13624b.length - 1;
    }

    public final boolean e() {
        return this.f13624b[0] == 0;
    }

    public final b f(int i7) {
        a aVar = this.f13623a;
        if (i7 == 0) {
            return aVar.f13618c;
        }
        if (i7 == 1) {
            return this;
        }
        int[] iArr = this.f13624b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i7);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f13623a;
        a aVar2 = this.f13623a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e() || bVar.e()) {
            return aVar2.f13618c;
        }
        int[] iArr = this.f13624b;
        int length = iArr.length;
        int[] iArr2 = bVar.f13624b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i7 + i11;
                iArr3[i12] = iArr3[i12] ^ aVar2.c(i10, iArr2[i11]);
            }
        }
        return new b(aVar2, iArr3);
    }

    public final b h(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        a aVar = this.f13623a;
        if (i10 == 0) {
            return aVar.f13618c;
        }
        int[] iArr = this.f13624b;
        int length = iArr.length;
        int[] iArr2 = new int[i7 + length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = aVar.c(iArr[i11], i10);
        }
        return new b(aVar, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    if (iD == d()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    iC = -iC;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    a aVar = this.f13623a;
                    if (iC == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i7 = aVar.f13617b[iC];
                    if (i7 == 0) {
                        sb2.append('1');
                    } else if (i7 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i7);
                    }
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iD);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
