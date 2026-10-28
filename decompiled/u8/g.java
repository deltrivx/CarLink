package u8;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends AbstractList implements List, j9.b {
    public abstract int c();

    public abstract Object d(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return d(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
