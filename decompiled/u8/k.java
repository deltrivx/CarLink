package u8;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f13112d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13114b = f13112d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13115c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int length;
        int i10 = this.f13115c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        if (i7 == i10) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        s();
        m(this.f13115c + 1);
        int iR = r(this.f13113a + i7);
        int i11 = this.f13115c;
        if (i7 < ((i11 + 1) >> 1)) {
            if (iR == 0) {
                Object[] objArr = this.f13114b;
                i9.l.e(objArr, "<this>");
                iR = objArr.length;
            }
            int i12 = iR - 1;
            int i13 = this.f13113a;
            if (i13 == 0) {
                Object[] objArr2 = this.f13114b;
                i9.l.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i13 - 1;
            }
            int i14 = this.f13113a;
            if (i12 >= i14) {
                Object[] objArr3 = this.f13114b;
                objArr3[length] = objArr3[i14];
                l.p0(objArr3, objArr3, i14, i14 + 1, i12 + 1);
            } else {
                Object[] objArr4 = this.f13114b;
                l.p0(objArr4, objArr4, i14 - 1, i14, objArr4.length);
                Object[] objArr5 = this.f13114b;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.p0(objArr5, objArr5, 0, 1, i12 + 1);
            }
            this.f13114b[i12] = obj;
            this.f13113a = length;
        } else {
            int iR2 = r(i11 + this.f13113a);
            if (iR < iR2) {
                Object[] objArr6 = this.f13114b;
                l.p0(objArr6, objArr6, iR + 1, iR, iR2);
            } else {
                Object[] objArr7 = this.f13114b;
                l.p0(objArr7, objArr7, 1, 0, iR2);
                Object[] objArr8 = this.f13114b;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.p0(objArr8, objArr8, iR + 1, iR, objArr8.length - 1);
            }
            this.f13114b[iR] = obj;
        }
        this.f13115c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        i9.l.e(collection, "elements");
        int i10 = this.f13115c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == this.f13115c) {
            return addAll(collection);
        }
        s();
        m(collection.size() + this.f13115c);
        int iR = r(this.f13115c + this.f13113a);
        int iR2 = r(this.f13113a + i7);
        int size = collection.size();
        if (i7 >= ((this.f13115c + 1) >> 1)) {
            int i11 = iR2 + size;
            if (iR2 < iR) {
                int i12 = size + iR;
                Object[] objArr = this.f13114b;
                if (i12 <= objArr.length) {
                    l.p0(objArr, objArr, i11, iR2, iR);
                } else if (i11 >= objArr.length) {
                    l.p0(objArr, objArr, i11 - objArr.length, iR2, iR);
                } else {
                    int length = iR - (i12 - objArr.length);
                    l.p0(objArr, objArr, 0, length, iR);
                    Object[] objArr2 = this.f13114b;
                    l.p0(objArr2, objArr2, i11, iR2, length);
                }
            } else {
                Object[] objArr3 = this.f13114b;
                l.p0(objArr3, objArr3, size, 0, iR);
                Object[] objArr4 = this.f13114b;
                if (i11 >= objArr4.length) {
                    l.p0(objArr4, objArr4, i11 - objArr4.length, iR2, objArr4.length);
                } else {
                    l.p0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f13114b;
                    l.p0(objArr5, objArr5, i11, iR2, objArr5.length - size);
                }
            }
            k(iR2, collection);
            return true;
        }
        int i13 = this.f13113a;
        int length2 = i13 - size;
        if (iR2 < i13) {
            Object[] objArr6 = this.f13114b;
            l.p0(objArr6, objArr6, length2, i13, objArr6.length);
            if (size >= iR2) {
                Object[] objArr7 = this.f13114b;
                l.p0(objArr7, objArr7, objArr7.length - size, 0, iR2);
            } else {
                Object[] objArr8 = this.f13114b;
                l.p0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f13114b;
                l.p0(objArr9, objArr9, 0, size, iR2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f13114b;
            l.p0(objArr10, objArr10, length2, i13, iR2);
        } else {
            Object[] objArr11 = this.f13114b;
            length2 += objArr11.length;
            int i14 = iR2 - i13;
            int length3 = objArr11.length - length2;
            if (length3 >= i14) {
                l.p0(objArr11, objArr11, length2, i13, iR2);
            } else {
                l.p0(objArr11, objArr11, length2, i13, i13 + length3);
                Object[] objArr12 = this.f13114b;
                l.p0(objArr12, objArr12, 0, this.f13113a + length3, iR2);
            }
        }
        this.f13113a = length2;
        k(p(iR2 - size), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i9.l.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        s();
        m(collection.size() + c());
        k(r(c() + this.f13113a), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        s();
        m(this.f13115c + 1);
        int length = this.f13113a;
        if (length == 0) {
            Object[] objArr = this.f13114b;
            i9.l.e(objArr, "<this>");
            length = objArr.length;
        }
        int i7 = length - 1;
        this.f13113a = i7;
        this.f13114b[i7] = obj;
        this.f13115c++;
    }

    public final void addLast(Object obj) {
        s();
        m(c() + 1);
        this.f13114b[r(c() + this.f13113a)] = obj;
        this.f13115c = c() + 1;
    }

    @Override // u8.g
    public final int c() {
        return this.f13115c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            s();
            q(this.f13113a, r(c() + this.f13113a));
        }
        this.f13113a = 0;
        this.f13115c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // u8.g
    public final Object d(int i7) {
        int i10 = this.f13115c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, i10, "index: ", ", size: "));
        }
        if (i7 == n3.l.A(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        s();
        int iR = r(this.f13113a + i7);
        Object[] objArr = this.f13114b;
        Object obj = objArr[iR];
        if (i7 < (this.f13115c >> 1)) {
            int i11 = this.f13113a;
            if (iR >= i11) {
                l.p0(objArr, objArr, i11 + 1, i11, iR);
            } else {
                l.p0(objArr, objArr, 1, 0, iR);
                Object[] objArr2 = this.f13114b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f13113a;
                l.p0(objArr2, objArr2, i12 + 1, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f13114b;
            int i13 = this.f13113a;
            objArr3[i13] = null;
            this.f13113a = n(i13);
        } else {
            int iR2 = r(n3.l.A(this) + this.f13113a);
            if (iR <= iR2) {
                Object[] objArr4 = this.f13114b;
                l.p0(objArr4, objArr4, iR, iR + 1, iR2 + 1);
            } else {
                Object[] objArr5 = this.f13114b;
                l.p0(objArr5, objArr5, iR, iR + 1, objArr5.length);
                Object[] objArr6 = this.f13114b;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.p0(objArr6, objArr6, 0, 1, iR2 + 1);
            }
            this.f13114b[iR2] = null;
        }
        this.f13115c--;
        return obj;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f13114b[this.f13113a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int iC = c();
        if (i7 < 0 || i7 >= iC) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, iC, "index: ", ", size: "));
        }
        return this.f13114b[r(this.f13113a + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int iR = r(c() + this.f13113a);
        int length = this.f13113a;
        if (length < iR) {
            while (length < iR) {
                if (i9.l.a(obj, this.f13114b[length])) {
                    i7 = this.f13113a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iR) {
            return -1;
        }
        int length2 = this.f13114b.length;
        while (length < length2) {
            if (i9.l.a(obj, this.f13114b[length])) {
                i7 = this.f13113a;
            } else {
                length++;
            }
        }
        for (int i10 = 0; i10 < iR; i10++) {
            if (i9.l.a(obj, this.f13114b[i10])) {
                length = i10 + this.f13114b.length;
                i7 = this.f13113a;
            }
        }
        return -1;
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final void k(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13114b.length;
        while (i7 < length && it.hasNext()) {
            this.f13114b[i7] = it.next();
            i7++;
        }
        int i10 = this.f13113a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f13114b[i11] = it.next();
        }
        this.f13115c = collection.size() + this.f13115c;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f13114b[r(n3.l.A(this) + this.f13113a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int iR = r(this.f13115c + this.f13113a);
        int i10 = this.f13113a;
        if (i10 < iR) {
            length = iR - 1;
            if (i10 <= length) {
                while (!i9.l.a(obj, this.f13114b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i7 = this.f13113a;
                return length - i7;
            }
            return -1;
        }
        if (i10 > iR) {
            for (int i11 = iR - 1; -1 < i11; i11--) {
                if (i9.l.a(obj, this.f13114b[i11])) {
                    length = i11 + this.f13114b.length;
                    i7 = this.f13113a;
                    return length - i7;
                }
            }
            Object[] objArr = this.f13114b;
            i9.l.e(objArr, "<this>");
            length = objArr.length - 1;
            int i12 = this.f13113a;
            if (i12 <= length) {
                while (!i9.l.a(obj, this.f13114b[length])) {
                    if (length != i12) {
                        length--;
                    }
                }
                i7 = this.f13113a;
                return length - i7;
            }
        }
        return -1;
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f13114b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f13112d) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f13114b = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i7 < 0) {
            i10 = i7;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        l.p0(objArr, objArr2, 0, this.f13113a, objArr.length);
        Object[] objArr3 = this.f13114b;
        int length2 = objArr3.length;
        int i11 = this.f13113a;
        l.p0(objArr3, objArr2, length2 - i11, 0, i11);
        this.f13113a = 0;
        this.f13114b = objArr2;
    }

    public final int n(int i7) {
        Object[] objArr = this.f13114b;
        i9.l.e(objArr, "<this>");
        if (i7 == objArr.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.f13114b[r(n3.l.A(this) + this.f13113a)];
    }

    public final int p(int i7) {
        return i7 < 0 ? i7 + this.f13114b.length : i7;
    }

    public final void q(int i7, int i10) {
        if (i7 < i10) {
            l.t0(i7, i10, null, this.f13114b);
            return;
        }
        Object[] objArr = this.f13114b;
        l.t0(i7, objArr.length, null, objArr);
        l.t0(0, i10, null, this.f13114b);
    }

    public final int r(int i7) {
        Object[] objArr = this.f13114b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iR;
        i9.l.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f13114b.length != 0) {
            int iR2 = r(c() + this.f13113a);
            int i7 = this.f13113a;
            if (i7 < iR2) {
                iR = i7;
                while (i7 < iR2) {
                    Object obj = this.f13114b[i7];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f13114b[iR] = obj;
                        iR++;
                    }
                    i7++;
                }
                l.t0(iR, iR2, null, this.f13114b);
            } else {
                int length = this.f13114b.length;
                int i10 = i7;
                boolean z11 = false;
                while (i7 < length) {
                    Object[] objArr = this.f13114b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f13114b[i10] = obj2;
                        i10++;
                    }
                    i7++;
                }
                iR = r(i10);
                for (int i11 = 0; i11 < iR2; i11++) {
                    Object[] objArr2 = this.f13114b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f13114b[iR] = obj3;
                        iR = n(iR);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f13115c = p(iR - this.f13113a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        Object[] objArr = this.f13114b;
        int i7 = this.f13113a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f13113a = n(i7);
        this.f13115c = c() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        int iR = r(n3.l.A(this) + this.f13113a);
        Object[] objArr = this.f13114b;
        Object obj = objArr[iR];
        objArr[iR] = null;
        this.f13115c = c() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        n3.u.n(i7, i10, this.f13115c);
        int i11 = i10 - i7;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f13115c) {
            clear();
            return;
        }
        if (i11 == 1) {
            d(i7);
            return;
        }
        s();
        if (i7 < this.f13115c - i10) {
            int iR = r(this.f13113a + (i7 - 1));
            int iR2 = r(this.f13113a + (i10 - 1));
            while (i7 > 0) {
                int i12 = iR + 1;
                int iMin = Math.min(i7, Math.min(i12, iR2 + 1));
                Object[] objArr = this.f13114b;
                int i13 = iR2 - iMin;
                int i14 = iR - iMin;
                l.p0(objArr, objArr, i13 + 1, i14 + 1, i12);
                iR = p(i14);
                iR2 = p(i13);
                i7 -= iMin;
            }
            int iR3 = r(this.f13113a + i11);
            q(this.f13113a, iR3);
            this.f13113a = iR3;
        } else {
            int iR4 = r(this.f13113a + i10);
            int iR5 = r(this.f13113a + i7);
            int i15 = this.f13115c;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f13114b;
                i10 = Math.min(i15, Math.min(objArr2.length - iR4, objArr2.length - iR5));
                Object[] objArr3 = this.f13114b;
                int i16 = iR4 + i10;
                l.p0(objArr3, objArr3, iR5, iR4, i16);
                iR4 = r(i16);
                iR5 = r(iR5 + i10);
            }
            int iR6 = r(this.f13115c + this.f13113a);
            q(p(iR6 - i11), iR6);
        }
        this.f13115c -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iR;
        i9.l.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f13114b.length != 0) {
            int iR2 = r(c() + this.f13113a);
            int i7 = this.f13113a;
            if (i7 < iR2) {
                iR = i7;
                while (i7 < iR2) {
                    Object obj = this.f13114b[i7];
                    if (collection.contains(obj)) {
                        this.f13114b[iR] = obj;
                        iR++;
                    } else {
                        z10 = true;
                    }
                    i7++;
                }
                l.t0(iR, iR2, null, this.f13114b);
            } else {
                int length = this.f13114b.length;
                int i10 = i7;
                boolean z11 = false;
                while (i7 < length) {
                    Object[] objArr = this.f13114b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f13114b[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i7++;
                }
                iR = r(i10);
                for (int i11 = 0; i11 < iR2; i11++) {
                    Object[] objArr2 = this.f13114b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f13114b[iR] = obj3;
                        iR = n(iR);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                s();
                this.f13115c = p(iR - this.f13113a);
            }
        }
        return z10;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int iC = c();
        if (i7 < 0 || i7 >= iC) {
            throw new IndexOutOfBoundsException(a2.f.D(i7, iC, "index: ", ", size: "));
        }
        int iR = r(this.f13113a + i7);
        Object[] objArr = this.f13114b;
        Object obj2 = objArr[iR];
        objArr[iR] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i9.l.e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f13115c;
        if (length < i7) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            i9.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iR = r(this.f13115c + this.f13113a);
        int i10 = this.f13113a;
        if (i10 < iR) {
            l.r0(this.f13114b, objArr, i10, iR, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13114b;
            l.p0(objArr2, objArr, 0, this.f13113a, objArr2.length);
            Object[] objArr3 = this.f13114b;
            l.p0(objArr3, objArr, objArr3.length - this.f13113a, 0, iR);
        }
        int i11 = this.f13115c;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
