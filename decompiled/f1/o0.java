package f1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5067b;

    public o0() {
        this.f5066a = new int[10];
    }

    public o0(int i7) {
        this.f5066a = new int[i7];
    }

    public int a(int i7) {
        int i10 = this.f5067b - 1;
        return i10 >= 0 ? this.f5066a[i10] : i7;
    }

    public int b() {
        int[] iArr = this.f5066a;
        int i7 = this.f5067b - 1;
        this.f5067b = i7;
        return iArr[i7];
    }

    public void c(int i7) {
        int[] iArrCopyOf = this.f5066a;
        if (this.f5067b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f5066a = iArrCopyOf;
        }
        int i10 = this.f5067b;
        this.f5067b = i10 + 1;
        iArrCopyOf[i10] = i7;
    }

    public void d(int i7, int i10, int i11) {
        int i12 = this.f5067b;
        int[] iArrCopyOf = this.f5066a;
        int i13 = i12 + 3;
        if (i13 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f5066a = iArrCopyOf;
        }
        iArrCopyOf[i12] = i7 + i11;
        iArrCopyOf[i12 + 1] = i10 + i11;
        iArrCopyOf[i12 + 2] = i11;
        this.f5067b = i13;
    }

    public void e(int i7, int i10, int i11, int i12) {
        int i13 = this.f5067b;
        int[] iArrCopyOf = this.f5066a;
        int i14 = i13 + 4;
        if (i14 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f5066a = iArrCopyOf;
        }
        iArrCopyOf[i13] = i7;
        iArrCopyOf[i13 + 1] = i10;
        iArrCopyOf[i13 + 2] = i11;
        iArrCopyOf[i13 + 3] = i12;
        this.f5067b = i14;
    }

    public void f(int i7, int i10) {
        if (i7 < i10) {
            int i11 = i7 - 3;
            for (int i12 = i7; i12 < i10; i12 += 3) {
                int[] iArr = this.f5066a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    g(i11, i12);
                }
            }
            g(i11 + 3, i10);
            f(i7, i11);
            f(i11 + 6, i10);
        }
    }

    public void g(int i7, int i10) {
        int[] iArr = this.f5066a;
        int i11 = iArr[i7];
        iArr[i7] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i7 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i7 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }
}
