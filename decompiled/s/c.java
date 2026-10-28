package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12396a;

    public c(f fVar) {
        this.f12396a = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12396a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12396a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f12396a.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        f fVar = this.f12396a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return fVar.f12485c == set.size() && fVar.i(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        f fVar = this.f12396a;
        int iHashCode = 0;
        for (int i7 = fVar.f12485c - 1; i7 >= 0; i7--) {
            Object objE = fVar.e(i7);
            iHashCode += objE == null ? 0 : objE.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12396a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f12396a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f12396a;
        int iC = fVar.c(obj);
        if (iC < 0) {
            return false;
        }
        fVar.f(iC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f12396a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f12396a;
        int i7 = fVar.f12485c;
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            if (!collection.contains(fVar.e(i10))) {
                fVar.f(i10);
            }
        }
        return i7 != fVar.f12485c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12396a.f12485c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f12396a;
        int i7 = fVar.f12485c;
        Object[] objArr = new Object[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.e(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f12396a;
        int i7 = fVar.f12485c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.e(i10);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
