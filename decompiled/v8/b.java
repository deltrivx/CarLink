package v8;

import i9.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n3.n;
import n3.u;
import p1.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends u8.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13659d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f13660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13662c;

    static {
        b bVar = new b(0);
        bVar.f13662c = true;
        f13659d = bVar;
    }

    public b(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f13660a = new Object[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        o();
        int i10 = this.f13661b;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        p(i7, 1);
        this.f13660a[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        o();
        int i7 = this.f13661b;
        ((AbstractList) this).modCount++;
        p(i7, 1);
        this.f13660a[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        l.e(collection, "elements");
        o();
        int i10 = this.f13661b;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        int size = collection.size();
        m(i7, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        o();
        int size = collection.size();
        m(this.f13661b, collection, size);
        return size > 0;
    }

    @Override // u8.g
    public final int c() {
        return this.f13661b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        r(0, this.f13661b);
    }

    @Override // u8.g
    public final Object d(int i7) {
        o();
        int i10 = this.f13661b;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        return q(i7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f13660a;
            int i7 = this.f13661b;
            if (i7 == list.size()) {
                for (int i10 = 0; i10 < i7; i10++) {
                    if (l.a(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i10 = this.f13661b;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        return this.f13660a[i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f13660a;
        int i7 = this.f13661b;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f13661b; i7++) {
            if (l.a(this.f13660a[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f13661b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f13661b - 1; i7 >= 0; i7--) {
            if (l.a(this.f13660a[i7], obj)) {
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
        int i10 = this.f13661b;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        return new v(this, i7);
    }

    public final void m(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        p(i7, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f13660a[i7 + i11] = it.next();
        }
    }

    public final void n(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        p(i7, 1);
        this.f13660a[i7] = obj;
    }

    public final void o() {
        if (this.f13662c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void p(int i7, int i10) {
        int i11 = this.f13661b + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f13660a;
        if (i11 > objArr.length) {
            int length = objArr.length;
            int i12 = length + (length >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i12);
            l.d(objArrCopyOf, "copyOf(...)");
            this.f13660a = objArrCopyOf;
        }
        Object[] objArr2 = this.f13660a;
        u8.l.p0(objArr2, objArr2, i7 + i10, i7, this.f13661b);
        this.f13661b += i10;
    }

    public final Object q(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f13660a;
        Object obj = objArr[i7];
        u8.l.p0(objArr, objArr, i7, i7 + 1, this.f13661b);
        Object[] objArr2 = this.f13660a;
        int i10 = this.f13661b - 1;
        l.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f13661b--;
        return obj;
    }

    public final void r(int i7, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f13660a;
        u8.l.p0(objArr, objArr, i7, i7 + i10, this.f13661b);
        Object[] objArr2 = this.f13660a;
        int i11 = this.f13661b;
        n.J0(objArr2, i11 - i10, i11);
        this.f13661b -= i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        o();
        return s(0, this.f13661b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        o();
        return s(0, this.f13661b, collection, true) > 0;
    }

    public final int s(int i7, int i10, Collection collection, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i7 + i11;
            if (collection.contains(this.f13660a[i13]) == z10) {
                Object[] objArr = this.f13660a;
                i11++;
                objArr[i12 + i7] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f13660a;
        u8.l.p0(objArr2, objArr2, i7 + i12, i10 + i7, this.f13661b);
        Object[] objArr3 = this.f13660a;
        int i15 = this.f13661b;
        n.J0(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f13661b -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        o();
        int i10 = this.f13661b;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        Object[] objArr = this.f13660a;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        u.n(i7, i10, this.f13661b);
        return new a(this.f13660a, i7, i10 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return u8.l.s0(this.f13660a, 0, this.f13661b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f13661b;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f13660a, 0, i7, objArr.getClass());
            l.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        u8.l.p0(this.f13660a, objArr, 0, 0, i7);
        int i10 = this.f13661b;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return n.M(this.f13660a, 0, this.f13661b, this);
    }
}
