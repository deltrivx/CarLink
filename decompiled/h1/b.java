package h1;

import i9.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import s.d0;
import s.m0;
import u8.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements List, j9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6413b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f6412a = i7;
        this.f6413b = obj;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        switch (this.f6412a) {
            case 0:
                ((e) this.f6413b).a(i7, obj);
                return;
            default:
                d0 d0Var = (d0) this.f6413b;
                if (i7 < 0 || i7 > (i10 = d0Var.f12408b)) {
                    StringBuilder sbT = ob.a.t("Index ", " must be in 0..", i7);
                    sbT.append(d0Var.f12408b);
                    t.a.d(sbT.toString());
                    throw null;
                }
                int i11 = i10 + 1;
                Object[] objArr = d0Var.f12407a;
                if (objArr.length < i11) {
                    d0Var.l(objArr, i11);
                }
                Object[] objArr2 = d0Var.f12407a;
                int i12 = d0Var.f12408b;
                if (i7 != i12) {
                    l.p0(objArr2, objArr2, i7 + 1, i7, i12);
                }
                objArr2[i7] = obj;
                d0Var.f12408b++;
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f6412a) {
            case 0:
                ((e) this.f6413b).b(obj);
                break;
            default:
                ((d0) this.f6413b).a(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        switch (this.f6412a) {
            case 0:
                return ((e) this.f6413b).f(i7, collection);
            default:
                i9.l.e(collection, "elements");
                d0 d0Var = (d0) this.f6413b;
                if (i7 < 0 || i7 > d0Var.f12408b) {
                    StringBuilder sbT = ob.a.t("Index ", " must be in 0..", i7);
                    sbT.append(d0Var.f12408b);
                    t.a.d(sbT.toString());
                    throw null;
                }
                int i10 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + d0Var.f12408b;
                Object[] objArr = d0Var.f12407a;
                if (objArr.length < size) {
                    d0Var.l(objArr, size);
                }
                Object[] objArr2 = d0Var.f12407a;
                if (i7 != d0Var.f12408b) {
                    l.p0(objArr2, objArr2, collection.size() + i7, i7, d0Var.f12408b);
                }
                for (Object obj : collection) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        n3.l.Y();
                        throw null;
                    }
                    objArr2[i10 + i7] = obj;
                    i10 = i11;
                }
                d0Var.f12408b = collection.size() + d0Var.f12408b;
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f6412a) {
            case 0:
                e eVar = (e) this.f6413b;
                return eVar.f(eVar.f6423c, collection);
            default:
                i9.l.e(collection, "elements");
                d0 d0Var = (d0) this.f6413b;
                int i7 = d0Var.f12408b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    d0Var.a(it.next());
                }
                return i7 != d0Var.f12408b;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f6412a) {
            case 0:
                ((e) this.f6413b).h();
                break;
            default:
                ((d0) this.f6413b).c();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f6412a) {
            case 0:
                return ((e) this.f6413b).i(obj);
            default:
                return ((d0) this.f6413b).f(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f6412a) {
            case 0:
                e eVar = (e) this.f6413b;
                eVar.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!eVar.i(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                i9.l.e(collection, "elements");
                d0 d0Var = (d0) this.f6413b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (d0Var.f(it2.next()) < 0) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f6412a) {
            case 0:
                f.a(i7, this);
                return ((e) this.f6413b).f6421a[i7];
            default:
                m0.a(i7, this);
                return ((d0) this.f6413b).e(i7);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f6412a) {
            case 0:
                return ((e) this.f6413b).j(obj);
            default:
                return ((d0) this.f6413b).f(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f6412a) {
            case 0:
                return ((e) this.f6413b).f6423c == 0;
            default:
                return ((d0) this.f6413b).g();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6412a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        switch (this.f6412a) {
            case 0:
                e eVar = (e) this.f6413b;
                Object[] objArr = eVar.f6421a;
                for (int i10 = eVar.f6423c - 1; i10 >= 0; i10--) {
                    if (i9.l.a(obj, objArr[i10])) {
                        return i10;
                    }
                }
                return -1;
            default:
                d0 d0Var = (d0) this.f6413b;
                if (obj == null) {
                    Object[] objArr2 = d0Var.f12407a;
                    i7 = d0Var.f12408b - 1;
                    while (-1 < i7) {
                        if (objArr2[i7] != null) {
                            i7--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = d0Var.f12407a;
                i7 = d0Var.f12408b - 1;
                while (-1 < i7) {
                    if (!obj.equals(objArr3[i7])) {
                        i7--;
                    }
                }
                return -1;
                return i7;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f6412a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        switch (this.f6412a) {
            case 0:
                return new d(this, i7, 0);
            default:
                return new d(this, i7, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        switch (this.f6412a) {
            case 0:
                f.a(i7, this);
                return ((e) this.f6413b).l(i7);
            default:
                m0.a(i7, this);
                return ((d0) this.f6413b).j(i7);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f6412a) {
            case 0:
                return ((e) this.f6413b).k(obj);
            default:
                return ((d0) this.f6413b).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f6412a) {
            case 0:
                e eVar = (e) this.f6413b;
                eVar.getClass();
                if (!collection.isEmpty()) {
                    int i7 = eVar.f6423c;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eVar.k(it.next());
                    }
                    if (i7 != eVar.f6423c) {
                        return true;
                    }
                }
                return false;
            default:
                i9.l.e(collection, "elements");
                d0 d0Var = (d0) this.f6413b;
                d0Var.getClass();
                int i10 = d0Var.f12408b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    d0Var.i(it2.next());
                }
                return i10 != d0Var.f12408b;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f6412a) {
            case 0:
                e eVar = (e) this.f6413b;
                int i7 = eVar.f6423c;
                for (int i10 = i7 - 1; -1 < i10; i10--) {
                    if (!collection.contains(eVar.f6421a[i10])) {
                        eVar.l(i10);
                    }
                }
                return i7 != eVar.f6423c;
            default:
                i9.l.e(collection, "elements");
                d0 d0Var = (d0) this.f6413b;
                d0Var.getClass();
                int i11 = d0Var.f12408b;
                Object[] objArr = d0Var.f12407a;
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    if (!collection.contains(objArr[i12])) {
                        d0Var.j(i12);
                    }
                }
                return i11 != d0Var.f12408b;
        }
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        switch (this.f6412a) {
            case 0:
                f.a(i7, this);
                Object[] objArr = ((e) this.f6413b).f6421a;
                Object obj2 = objArr[i7];
                objArr[i7] = obj;
                return obj2;
            default:
                m0.a(i7, this);
                d0 d0Var = (d0) this.f6413b;
                if (i7 < 0 || i7 >= d0Var.f12408b) {
                    d0Var.m(i7);
                    throw null;
                }
                Object[] objArr2 = d0Var.f12407a;
                Object obj3 = objArr2[i7];
                objArr2[i7] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f6412a) {
            case 0:
                return ((e) this.f6413b).f6423c;
            default:
                return ((d0) this.f6413b).f12408b;
        }
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        switch (this.f6412a) {
            case 0:
                f.b(this, i7, i10);
                return new c(this, i7, i10, 0);
            default:
                m0.b(this, i7, i10);
                return new c(this, i7, i10, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f6412a) {
            case 0:
                break;
        }
        return k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f6412a) {
            case 0:
                break;
            default:
                i9.l.e(objArr, "array");
                break;
        }
        return k.b(this, objArr);
    }
}
