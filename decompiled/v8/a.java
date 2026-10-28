package v8;

import i9.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n3.n;
import n3.u;
import p1.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u8.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f13654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f13657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f13658e;

    public a(Object[] objArr, int i7, int i10, a aVar, b bVar) {
        l.e(objArr, "backing");
        l.e(bVar, "root");
        this.f13654a = objArr;
        this.f13655b = i7;
        this.f13656c = i10;
        this.f13657d = aVar;
        this.f13658e = bVar;
        ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        p();
        o();
        int i10 = this.f13656c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        n(this.f13655b + i7, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        p();
        o();
        n(this.f13655b + this.f13656c, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        l.e(collection, "elements");
        p();
        o();
        int i10 = this.f13656c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        int size = collection.size();
        m(this.f13655b + i7, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        p();
        o();
        int size = collection.size();
        m(this.f13655b + this.f13656c, collection, size);
        return size > 0;
    }

    @Override // u8.g
    public final int c() {
        o();
        return this.f13656c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        p();
        o();
        r(this.f13655b, this.f13656c);
    }

    @Override // u8.g
    public final Object d(int i7) {
        p();
        o();
        int i10 = this.f13656c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        return q(this.f13655b + i7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        o();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f13654a;
            int i7 = this.f13656c;
            if (i7 == list.size()) {
                for (int i10 = 0; i10 < i7; i10++) {
                    if (l.a(objArr[this.f13655b + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        o();
        int i10 = this.f13656c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        return this.f13654a[this.f13655b + i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        o();
        Object[] objArr = this.f13654a;
        int i7 = this.f13656c;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[this.f13655b + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        o();
        for (int i7 = 0; i7 < this.f13656c; i7++) {
            if (l.a(this.f13654a[this.f13655b + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        o();
        return this.f13656c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        o();
        for (int i7 = this.f13656c - 1; i7 >= 0; i7--) {
            if (l.a(this.f13654a[this.f13655b + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        o();
        int i10 = this.f13656c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        return new v(this, i7);
    }

    public final void m(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        b bVar = this.f13658e;
        a aVar = this.f13657d;
        if (aVar != null) {
            aVar.m(i7, collection, i10);
        } else {
            b bVar2 = b.f13659d;
            bVar.m(i7, collection, i10);
        }
        this.f13654a = bVar.f13660a;
        this.f13656c += i10;
    }

    public final void n(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f13658e;
        a aVar = this.f13657d;
        if (aVar != null) {
            aVar.n(i7, obj);
        } else {
            b bVar2 = b.f13659d;
            bVar.n(i7, obj);
        }
        this.f13654a = bVar.f13660a;
        this.f13656c++;
    }

    public final void o() {
        if (((AbstractList) this.f13658e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void p() {
        if (this.f13658e.f13662c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object q(int i7) {
        Object objQ;
        ((AbstractList) this).modCount++;
        a aVar = this.f13657d;
        if (aVar != null) {
            objQ = aVar.q(i7);
        } else {
            b bVar = b.f13659d;
            objQ = this.f13658e.q(i7);
        }
        this.f13656c--;
        return objQ;
    }

    public final void r(int i7, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f13657d;
        if (aVar != null) {
            aVar.r(i7, i10);
        } else {
            b bVar = b.f13659d;
            this.f13658e.r(i7, i10);
        }
        this.f13656c -= i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        p();
        o();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        p();
        o();
        return s(this.f13655b, this.f13656c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        p();
        o();
        return s(this.f13655b, this.f13656c, collection, true) > 0;
    }

    public final int s(int i7, int i10, Collection collection, boolean z10) {
        int iS;
        a aVar = this.f13657d;
        if (aVar != null) {
            iS = aVar.s(i7, i10, collection, z10);
        } else {
            b bVar = b.f13659d;
            iS = this.f13658e.s(i7, i10, collection, z10);
        }
        if (iS > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f13656c -= iS;
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        p();
        o();
        int i10 = this.f13656c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        Object[] objArr = this.f13654a;
        int i11 = this.f13655b;
        Object obj2 = objArr[i11 + i7];
        objArr[i11 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        u.n(i7, i10, this.f13656c);
        return new a(this.f13654a, this.f13655b + i7, i10 - i7, this, this.f13658e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        o();
        Object[] objArr = this.f13654a;
        int i7 = this.f13656c;
        int i10 = this.f13655b;
        return u8.l.s0(objArr, i10, i7 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        o();
        int length = objArr.length;
        int i7 = this.f13656c;
        int i10 = this.f13655b;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f13654a, i10, i7 + i10, objArr.getClass());
            l.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        u8.l.p0(this.f13654a, objArr, 0, i10, i7 + i10);
        int i11 = this.f13656c;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        o();
        return n.M(this.f13654a, this.f13655b, this.f13656c, this);
    }
}
