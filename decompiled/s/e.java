package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12410a;

    public e(f fVar) {
        this.f12410a = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f12410a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12410a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12410a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f12410a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f12410a;
        int iA = fVar.a(obj);
        if (iA < 0) {
            return false;
        }
        fVar.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f12410a;
        int i7 = fVar.f12485c;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i7) {
            if (collection.contains(fVar.h(i10))) {
                fVar.f(i10);
                i10--;
                i7--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f12410a;
        int i7 = fVar.f12485c;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i7) {
            if (!collection.contains(fVar.h(i10))) {
                fVar.f(i10);
                i10--;
                i7--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12410a.f12485c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f12410a;
        int i7 = fVar.f12485c;
        Object[] objArr = new Object[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.h(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f12410a;
        int i7 = fVar.f12485c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.h(i10);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
