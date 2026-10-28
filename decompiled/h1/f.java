package h1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(int i7, List list) {
        int size = list.size();
        if (i7 < 0 || i7 >= size) {
            c(i7, size);
        }
    }

    public static final void b(List list, int i7, int i10) {
        if (i7 > i10) {
            f(i7, i10);
        }
        if (i7 < 0) {
            d(i7);
        }
        if (i10 > list.size()) {
            e(i10, list.size());
        }
    }

    private static final void c(int i7, int i10) {
        throw new IndexOutOfBoundsException("Index " + i7 + " is out of bounds. The list has " + i10 + " elements.");
    }

    private static final void d(int i7) {
        throw new IndexOutOfBoundsException(a2.f.F("fromIndex (", ") is less than 0.", i7));
    }

    private static final void e(int i7, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is more than than the list size (" + i10 + ')');
    }

    private static final void f(int i7, int i10) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i7 + ") is greater than toIndex (" + i10 + ").");
    }
}
