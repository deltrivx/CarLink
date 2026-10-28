package f1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k2 {
    public static final int a(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i7, int i10) {
        int iE = e(arrayList, i7, i10);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int c(int[] iArr, int i7) {
        int i10 = i7 * 5;
        return Integer.bitCount(iArr[i10 + 1] >> 28) + iArr[i10 + 4];
    }

    public static final void d(int i7, int i10, int[] iArr) {
        if (i10 >= 0) {
        }
        int i11 = (i7 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i7, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((a) arrayList.get(i12)).f4875a;
            if (i13 < 0) {
                i13 += i10;
            }
            int iF = i9.l.f(i13, i7);
            if (iF < 0) {
                i11 = i12 + 1;
            } else {
                if (iF <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
