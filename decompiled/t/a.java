package t;

import i9.l;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12719a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f12720b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f12721c = new Object[0];

    public static final int a(int i7, int i10, int[] iArr) {
        l.e(iArr, "array");
        int i11 = i7 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] jArr, int i7, long j5) {
        l.e(jArr, "array");
        int i10 = i7 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = jArr[i12];
            if (j10 < j5) {
                i11 = i12 + 1;
            } else {
                if (j10 <= j5) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final void c(String str) {
        l.e(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        l.e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        l.e(str, "message");
        throw new NoSuchElementException(str);
    }
}
