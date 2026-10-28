package p1;

import f1.r1;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements List, j9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10021d;

    public d0(p pVar, int i7, int i10) {
        this.f10018a = pVar;
        this.f10019b = i7;
        this.f10020c = q.f(pVar);
        this.f10021d = i10 - i7;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        c();
        int i10 = this.f10019b + i7;
        p pVar = this.f10018a;
        pVar.add(i10, obj);
        this.f10021d++;
        this.f10020c = q.f(pVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c();
        int i7 = this.f10019b + this.f10021d;
        p pVar = this.f10018a;
        pVar.add(i7, obj);
        this.f10021d++;
        this.f10020c = q.f(pVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        c();
        int i10 = i7 + this.f10019b;
        p pVar = this.f10018a;
        boolean zAddAll = pVar.addAll(i10, collection);
        if (zAddAll) {
            this.f10021d = collection.size() + this.f10021d;
            this.f10020c = q.f(pVar);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f10021d, collection);
    }

    public final void c() {
        if (q.f(this.f10018a) != this.f10020c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f10021d > 0) {
            c();
            int i7 = this.f10021d;
            int i10 = this.f10019b;
            p pVar = this.f10018a;
            pVar.m(i10, i7 + i10);
            this.f10021d = 0;
            this.f10020c = q.f(pVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final Object get(int i7) {
        c();
        q.a(i7, this.f10021d);
        return this.f10018a.get(this.f10019b + i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i7 = this.f10021d;
        int i10 = this.f10019b;
        Iterator it = n3.r.e0(i10, i7 + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((n9.c) it).nextInt();
            if (i9.l.a(obj, this.f10018a.get(iNextInt))) {
                return iNextInt - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f10021d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i7 = this.f10021d;
        int i10 = this.f10019b;
        for (int i11 = (i7 + i10) - 1; i11 >= i10; i11--) {
            if (i9.l.a(obj, this.f10018a.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        c();
        i9.v vVar = new i9.v();
        vVar.f6686a = i7 - 1;
        return new c0(vVar, this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        c();
        int i10 = this.f10019b + i7;
        p pVar = this.f10018a;
        Object objRemove = pVar.remove(i10);
        this.f10021d--;
        this.f10020c = q.f(pVar);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7;
        j1.c cVar;
        f fVarK;
        boolean zB;
        c();
        p pVar = this.f10018a;
        int i10 = this.f10019b;
        int i11 = this.f10021d + i10;
        int size = pVar.size();
        do {
            synchronized (q.f10069a) {
                w wVar = pVar.f10068a;
                i9.l.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.i(wVar);
                i7 = wVar2.f10104d;
                cVar = wVar2.f10103c;
            }
            i9.l.b(cVar);
            j1.f fVarN = cVar.n();
            fVarN.subList(i10, i11).retainAll(collection);
            j1.c cVarK = fVarN.k();
            if (i9.l.a(cVarK, cVar)) {
                break;
            }
            w wVar3 = pVar.f10068a;
            i9.l.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                zB = q.b((w) l.x(wVar3, pVar, fVarK), i7, cVarK, true);
            }
            l.o(fVarK, pVar);
        } while (!zB);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.f10020c = q.f(this.f10018a);
            this.f10021d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        q.a(i7, this.f10021d);
        c();
        int i10 = i7 + this.f10019b;
        p pVar = this.f10018a;
        Object obj2 = pVar.set(i10, obj);
        this.f10020c = q.f(pVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f10021d;
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        if (!(i7 >= 0 && i7 <= i10 && i10 <= this.f10021d)) {
            r1.a("fromIndex or toIndex are out of bounds");
        }
        c();
        int i11 = this.f10019b;
        return new d0(this.f10018a, i7 + i11, i10 + i11);
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
