package s;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12486a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f12487b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12488c = new Object();

    public static final int a(g gVar, Object obj, int i7) {
        int i10 = gVar.f12432c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = t.a.a(i10, i7, gVar.f12430a);
            if (iA < 0 || i9.l.a(obj, gVar.f12431b[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && gVar.f12430a[i11] == i7) {
                if (i9.l.a(obj, gVar.f12431b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && gVar.f12430a[i12] == i7; i12--) {
                if (i9.l.a(obj, gVar.f12431b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
