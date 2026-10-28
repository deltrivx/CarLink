package u8;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends n3.l {
    public static int a0(Iterable iterable, int i7) {
        i9.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
