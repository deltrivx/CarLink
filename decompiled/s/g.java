package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Collection, Set, j9.b, j9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f12430a = t.a.f12719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12431b = t.a.f12721c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12432c;

    public g(int i7) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int iA;
        int i10 = this.f12432c;
        if (obj == null) {
            iA = r.a(this, null, 0);
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iA = r.a(this, obj, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i11 = ~iA;
        int[] iArr = this.f12430a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f12431b;
            int[] iArr2 = new int[i12];
            this.f12430a = iArr2;
            this.f12431b = new Object[i12];
            if (i10 != this.f12432c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                u8.l.q0(0, iArr.length, 6, iArr, iArr2);
                u8.l.r0(objArr, this.f12431b, 0, objArr.length, 6);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f12430a;
            int i13 = i11 + 1;
            u8.l.m0(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f12431b;
            u8.l.p0(objArr2, objArr2, i13, i11, i10);
        }
        int i14 = this.f12432c;
        if (i10 == i14) {
            int[] iArr4 = this.f12430a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i7;
                this.f12431b[i11] = obj;
                this.f12432c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        i9.l.e(collection, "elements");
        int size = collection.size() + this.f12432c;
        int i7 = this.f12432c;
        int[] iArr = this.f12430a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12431b;
            int[] iArr2 = new int[size];
            this.f12430a = iArr2;
            this.f12431b = new Object[size];
            if (i7 > 0) {
                u8.l.q0(0, i7, 6, iArr, iArr2);
                u8.l.r0(objArr, this.f12431b, 0, this.f12432c, 6);
            }
        }
        if (this.f12432c != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object c(int i7) {
        int i10 = this.f12432c;
        Object[] objArr = this.f12431b;
        Object obj = objArr[i7];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f12430a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i7 < i11) {
                int i12 = i7 + 1;
                u8.l.m0(i7, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f12431b;
                u8.l.p0(objArr2, objArr2, i7, i12, i10);
            }
            this.f12431b[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.f12430a = iArr2;
            this.f12431b = new Object[i13];
            if (i7 > 0) {
                u8.l.q0(0, i7, 6, iArr, iArr2);
                u8.l.r0(objArr, this.f12431b, 0, i7, 6);
            }
            if (i7 < i11) {
                int i14 = i7 + 1;
                u8.l.m0(i7, i14, i10, iArr, this.f12430a);
                u8.l.p0(objArr, this.f12431b, i7, i14, i10);
            }
        }
        if (i10 != this.f12432c) {
            throw new ConcurrentModificationException();
        }
        this.f12432c = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f12432c != 0) {
            this.f12430a = t.a.f12719a;
            this.f12431b = t.a.f12721c;
            this.f12432c = 0;
        }
        if (this.f12432c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? r.a(this, null, 0) : r.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        i9.l.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f12432c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.f12432c;
            for (int i10 = 0; i10 < i7; i10++) {
                if (!((Set) obj).contains(this.f12431b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f12430a;
        int i7 = this.f12432c;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12432c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = obj == null ? r.a(this, null, 0) : r.a(this, obj, obj.hashCode());
        if (iA < 0) {
            return false;
        }
        c(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        i9.l.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        i9.l.e(collection, "elements");
        boolean z10 = false;
        for (int i7 = this.f12432c - 1; -1 < i7; i7--) {
            if (!u8.p.g0(collection, this.f12431b[i7])) {
                c(i7);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f12432c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u8.l.s0(this.f12431b, 0, this.f12432c);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        i9.l.e(objArr, "array");
        int i7 = this.f12432c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        } else if (objArr.length > i7) {
            objArr[i7] = null;
        }
        u8.l.p0(this.f12431b, objArr, 0, 0, this.f12432c);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12432c * 14);
        sb2.append('{');
        int i7 = this.f12432c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f12431b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
