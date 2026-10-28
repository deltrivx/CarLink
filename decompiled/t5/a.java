package t5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f12759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12760b;

    public a() {
        this.f12760b = 0;
        this.f12759a = new int[1];
    }

    public a(int i7) {
        this.f12760b = i7;
        this.f12759a = new int[(i7 + 31) / 32];
    }

    public final void a(boolean z10) {
        c(this.f12760b + 1);
        if (z10) {
            int[] iArr = this.f12759a;
            int i7 = this.f12760b;
            int i10 = i7 / 32;
            iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
        }
        this.f12760b++;
    }

    public final void b(int i7, int i10) {
        if (i10 < 0 || i10 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f12760b + i10);
        while (i10 > 0) {
            boolean z10 = true;
            if (((i7 >> (i10 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i10--;
        }
    }

    public final void c(int i7) {
        int[] iArr = this.f12759a;
        if (i7 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i7 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f12759a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f12759a.clone();
        int i7 = this.f12760b;
        a aVar = new a();
        aVar.f12759a = iArr;
        aVar.f12760b = i7;
        return aVar;
    }

    public final boolean d(int i7) {
        return ((1 << (i7 & 31)) & this.f12759a[i7 / 32]) != 0;
    }

    public final int e(int i7) {
        int i10 = this.f12760b;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (-(1 << (i7 & 31))) & this.f12759a[i11];
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f12759a;
            if (i11 == iArr.length) {
                return this.f12760b;
            }
            i12 = iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 << 5), this.f12760b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12760b == aVar.f12760b && Arrays.equals(this.f12759a, aVar.f12759a);
    }

    public final int f(int i7) {
        int i10 = this.f12760b;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (-(1 << (i7 & 31))) & (~this.f12759a[i11]);
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f12759a;
            if (i11 == iArr.length) {
                return this.f12760b;
            }
            i12 = ~iArr[i11];
        }
        return Math.min(Integer.numberOfTrailingZeros(i12) + (i11 << 5), this.f12760b);
    }

    public final int g() {
        return (this.f12760b + 7) / 8;
    }

    public final boolean h(int i7, int i10) {
        if (i10 < i7 || i7 < 0 || i10 > this.f12760b) {
            throw new IllegalArgumentException();
        }
        if (i10 != i7) {
            int i11 = i10 - 1;
            int i12 = i7 / 32;
            int i13 = i11 / 32;
            int i14 = i12;
            while (i14 <= i13) {
                if ((((2 << (i14 >= i13 ? 31 & i11 : 31)) - (1 << (i14 > i12 ? 0 : i7 & 31))) & this.f12759a[i14]) != 0) {
                    return false;
                }
                i14++;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12759a) + (this.f12760b * 31);
    }

    public final void i() {
        int[] iArr = new int[this.f12759a.length];
        int i7 = (this.f12760b - 1) / 32;
        int i10 = i7 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            long j5 = this.f12759a[i11];
            long j10 = ((j5 & 1431655765) << 1) | ((j5 >> 1) & 1431655765);
            long j11 = ((j10 & 858993459) << 2) | ((j10 >> 2) & 858993459);
            long j12 = ((j11 & 252645135) << 4) | ((j11 >> 4) & 252645135);
            long j13 = ((j12 & 16711935) << 8) | ((j12 >> 8) & 16711935);
            iArr[i7 - i11] = (int) (((j13 & 65535) << 16) | ((j13 >> 16) & 65535));
        }
        int i12 = this.f12760b;
        int i13 = i10 << 5;
        if (i12 != i13) {
            int i14 = i13 - i12;
            int i15 = iArr[0] >>> i14;
            for (int i16 = 1; i16 < i10; i16++) {
                int i17 = iArr[i16];
                iArr[i16 - 1] = i15 | (i17 << (32 - i14));
                i15 = i17 >>> i14;
            }
            iArr[i7] = i15;
        }
        this.f12759a = iArr;
    }

    public final void j(int i7) {
        int[] iArr = this.f12759a;
        int i10 = i7 / 32;
        iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
    }

    public final String toString() {
        int i7 = this.f12760b;
        StringBuilder sb2 = new StringBuilder((i7 / 8) + i7 + 1);
        for (int i10 = 0; i10 < this.f12760b; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i10) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
