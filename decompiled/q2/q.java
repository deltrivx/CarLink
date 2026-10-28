package q2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements List, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f10778c;

    public q(r rVar, int i7, int i10) {
        this.f10778c = rVar;
        this.f10776a = i7;
        this.f10777b = i10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof r1.o) && indexOf((r1.o) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((r1.o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object objE = this.f10778c.f10785a.e(i7 + this.f10776a);
        i9.l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (r1.o) objE;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof r1.o)) {
            return -1;
        }
        r1.o oVar = (r1.o) obj;
        int i7 = this.f10776a;
        int i10 = this.f10777b;
        if (i7 <= i10) {
            int i11 = i7;
            while (!i9.l.a(this.f10778c.f10785a.e(i11), oVar)) {
                if (i11 != i10) {
                    i11++;
                }
            }
            return i11 - i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i7 = this.f10776a;
        return new p1.v(this.f10778c, i7, i7, this.f10777b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof r1.o)) {
            return -1;
        }
        r1.o oVar = (r1.o) obj;
        int i7 = this.f10777b;
        int i10 = this.f10776a;
        if (i10 <= i7) {
            while (!i9.l.a(this.f10778c.f10785a.e(i7), oVar)) {
                if (i7 != i10) {
                    i7--;
                }
            }
            return i7 - i10;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i7 = this.f10776a;
        return new p1.v(this.f10778c, i7, i7, this.f10777b);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        int i10 = this.f10776a;
        int i11 = this.f10777b;
        return new p1.v(this.f10778c, i7 + i10, i10, i11);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f10777b - this.f10776a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        int i11 = this.f10776a;
        return new q(this.f10778c, i7 + i11, i11 + i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i9.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i9.k.b(this, objArr);
    }
}
