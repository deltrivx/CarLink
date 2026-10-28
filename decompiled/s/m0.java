package s;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f12471a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f12472b = new d0(0);

    public static final void a(int i7, List list) {
        int size = list.size();
        if (i7 < 0 || i7 >= size) {
            t.a.d("Index " + i7 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(List list, int i7, int i10) {
        int size = list.size();
        if (i7 > i10) {
            t.a.c("Indices are out of order. fromIndex (" + i7 + ") is greater than toIndex (" + i10 + ").");
            throw null;
        }
        if (i7 < 0) {
            t.a.d("fromIndex (" + i7 + ") is less than 0.");
            throw null;
        }
        if (i10 <= size) {
            return;
        }
        t.a.d("toIndex (" + i10 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
