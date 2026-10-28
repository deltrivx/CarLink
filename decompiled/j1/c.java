package j1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends u8.e implements List, Collection, j9.a {
    @Override // u8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // u8.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c d(int i7, Object obj);

    @Override // u8.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c k(Object obj);

    @Override // u8.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public c m(Collection collection) {
        f fVarN = n();
        fVarN.addAll(collection);
        return fVarN.k();
    }

    public abstract f n();

    public abstract c o(b bVar);

    public abstract c p(int i7);

    public abstract c q(int i7, Object obj);

    @Override // u8.e, java.util.List
    public final List subList(int i7, int i10) {
        return new i1.a(this, i7, i10);
    }
}
