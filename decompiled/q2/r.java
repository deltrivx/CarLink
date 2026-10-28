package q2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements List, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.d0 f10785a = new s.d0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.z f10786b = new s.z(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10787c = -1;

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

    public final long c() {
        long jA = f.a(Float.POSITIVE_INFINITY, false, false);
        int i7 = this.f10787c + 1;
        int iA = n3.l.A(this);
        if (i7 > iA) {
            return jA;
        }
        while (true) {
            s.z zVar = this.f10786b;
            if (i7 < 0) {
                zVar.getClass();
                break;
            }
            if (i7 >= zVar.f12523b) {
                break;
            }
            long j5 = zVar.f12522a[i7];
            if (f.h(j5, jA) < 0) {
                jA = j5;
            }
            if ((f.k(jA) < 0.0f && f.p(jA)) || i7 == iA) {
                return jA;
            }
            i7++;
        }
        t.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f10787c = -1;
        this.f10785a.c();
        this.f10786b.f12523b = 0;
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

    public final void d(int i7, int i10) {
        if (i7 >= i10) {
            return;
        }
        this.f10785a.k(i7, i10);
        s.z zVar = this.f10786b;
        if (i7 >= 0) {
            int i11 = zVar.f12523b;
            if (i7 <= i11 && i10 >= 0 && i10 <= i11) {
                if (i10 < i7) {
                    t.a.c("The end index must be < start index");
                    throw null;
                }
                if (i10 != i7) {
                    if (i10 < i11) {
                        long[] jArr = zVar.f12522a;
                        u8.l.o0(jArr, jArr, i7, i10, i11);
                    }
                    zVar.f12523b -= i10 - i7;
                    return;
                }
                return;
            }
        } else {
            zVar.getClass();
        }
        t.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object objE = this.f10785a.e(i7);
        i9.l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (r1.o) objE;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof r1.o)) {
            return -1;
        }
        r1.o oVar = (r1.o) obj;
        int iA = n3.l.A(this);
        if (iA >= 0) {
            int i7 = 0;
            while (!i9.l.a(this.f10785a.e(i7), oVar)) {
                if (i7 != iA) {
                    i7++;
                }
            }
            return i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f10785a.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new p1.v(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof r1.o)) {
            return -1;
        }
        r1.o oVar = (r1.o) obj;
        for (int iA = n3.l.A(this); -1 < iA; iA--) {
            if (i9.l.a(this.f10785a.e(iA), oVar)) {
                return iA;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new p1.v(this, 0, 7);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new p1.v(this, i7, 6);
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
        return this.f10785a.f12408b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        return new q(this, i7, i10);
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
