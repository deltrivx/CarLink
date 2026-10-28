package t5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f12764d;

    public b(int i7, int i10) {
        if (i7 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f12761a = i7;
        this.f12762b = i10;
        int i11 = (i7 + 31) / 32;
        this.f12763c = i11;
        this.f12764d = new int[i11 * i10];
    }

    public b(int i7, int i10, int i11, int[] iArr) {
        this.f12761a = i7;
        this.f12762b = i10;
        this.f12763c = i11;
        this.f12764d = iArr;
    }

    public final void a(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f12763c);
        int[] iArr = this.f12764d;
        iArr[i11] = (1 << (i7 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i7, int i10) {
        return ((this.f12764d[(i7 / 32) + (i10 * this.f12763c)] >>> (i7 & 31)) & 1) != 0;
    }

    public final int[] c() {
        int[] iArr = this.f12764d;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i7 = this.f12763c;
        int i10 = length / i7;
        int i11 = (length % i7) << 5;
        int i12 = iArr[length];
        int i13 = 31;
        while ((i12 >>> i13) == 0) {
            i13--;
        }
        return new int[]{i11 + i13, i10};
    }

    public final Object clone() {
        return new b(this.f12761a, this.f12762b, this.f12763c, (int[]) this.f12764d.clone());
    }

    public final a d(a aVar, int i7) {
        int i10 = aVar.f12760b;
        int i11 = this.f12761a;
        if (i10 < i11) {
            aVar = new a(i11);
        } else {
            int length = aVar.f12759a.length;
            for (int i12 = 0; i12 < length; i12++) {
                aVar.f12759a[i12] = 0;
            }
        }
        int i13 = this.f12763c;
        int i14 = i7 * i13;
        for (int i15 = 0; i15 < i13; i15++) {
            aVar.f12759a[(i15 << 5) / 32] = this.f12764d[i14 + i15];
        }
        return aVar;
    }

    public final int[] e() {
        int[] iArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            iArr = this.f12764d;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f12763c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        while ((iArr[i10] << (31 - i7)) == 0) {
            i7++;
        }
        return new int[]{i13 + i7, i12};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12761a == bVar.f12761a && this.f12762b == bVar.f12762b && this.f12763c == bVar.f12763c && Arrays.equals(this.f12764d, bVar.f12764d);
    }

    public final void f(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f12763c);
        int[] iArr = this.f12764d;
        iArr[i11] = (1 << (i7 & 31)) | iArr[i11];
    }

    public final void g(int i7, int i10, int i11, int i12) {
        if (i10 < 0 || i7 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i12 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i13 = i11 + i7;
        int i14 = i12 + i10;
        if (i14 > this.f12762b || i13 > this.f12761a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i10 < i14) {
            int i15 = this.f12763c * i10;
            for (int i16 = i7; i16 < i13; i16++) {
                int i17 = (i16 / 32) + i15;
                int[] iArr = this.f12764d;
                iArr[i17] = iArr[i17] | (1 << (i16 & 31));
            }
            i10++;
        }
    }

    public final int hashCode() {
        int i7 = this.f12761a;
        return Arrays.hashCode(this.f12764d) + (((((((i7 * 31) + i7) * 31) + this.f12762b) * 31) + this.f12763c) * 31);
    }

    public final String toString() {
        int i7 = this.f12761a;
        int i10 = this.f12762b;
        StringBuilder sb2 = new StringBuilder((i7 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i7; i12++) {
                sb2.append(b(i12, i11) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
