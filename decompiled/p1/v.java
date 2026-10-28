package p1;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements ListIterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10102e;

    public v(p pVar, int i7) {
        this.f10098a = 0;
        this.f10102e = pVar;
        this.f10099b = i7 - 1;
        this.f10100c = -1;
        this.f10101d = q.f(pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(q2.r rVar, int i7, int i10) {
        this(rVar, (i10 & 1) != 0 ? 0 : i7, 0, rVar.f10785a.f12408b);
        this.f10098a = 1;
    }

    public v(q2.r rVar, int i7, int i10, int i11) {
        this.f10098a = 1;
        this.f10102e = rVar;
        this.f10099b = i7;
        this.f10100c = i10;
        this.f10101d = i11;
    }

    public v(v8.a aVar, int i7) {
        this.f10098a = 2;
        this.f10102e = aVar;
        this.f10099b = i7;
        this.f10100c = -1;
        this.f10101d = ((AbstractList) aVar).modCount;
    }

    public v(v8.b bVar, int i7) {
        this.f10098a = 3;
        this.f10102e = bVar;
        this.f10099b = i7;
        this.f10100c = -1;
        this.f10101d = ((AbstractList) bVar).modCount;
    }

    public void a() {
        if (((AbstractList) ((v8.a) this.f10102e).f13658e).modCount != this.f10101d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f10098a) {
            case 0:
                c();
                p pVar = (p) this.f10102e;
                pVar.add(this.f10099b + 1, obj);
                this.f10100c = -1;
                this.f10099b++;
                this.f10101d = q.f(pVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                v8.a aVar = (v8.a) this.f10102e;
                int i7 = this.f10099b;
                this.f10099b = i7 + 1;
                aVar.add(i7, obj);
                this.f10100c = -1;
                this.f10101d = ((AbstractList) aVar).modCount;
                return;
            default:
                b();
                v8.b bVar = (v8.b) this.f10102e;
                int i10 = this.f10099b;
                this.f10099b = i10 + 1;
                bVar.add(i10, obj);
                this.f10100c = -1;
                this.f10101d = ((AbstractList) bVar).modCount;
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((v8.b) this.f10102e)).modCount != this.f10101d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (q.f((p) this.f10102e) != this.f10101d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10098a) {
            case 0:
                return this.f10099b < ((p) this.f10102e).size() - 1;
            case 1:
                return this.f10099b < this.f10101d;
            case 2:
                return this.f10099b < ((v8.a) this.f10102e).f13656c;
            default:
                return this.f10099b < ((v8.b) this.f10102e).f13661b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f10098a) {
            case 0:
                return this.f10099b >= 0;
            case 1:
                return this.f10099b > this.f10100c;
            case 2:
                return this.f10099b > 0;
            default:
                return this.f10099b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f10098a) {
            case 0:
                c();
                int i7 = this.f10099b + 1;
                this.f10100c = i7;
                p pVar = (p) this.f10102e;
                q.a(i7, pVar.size());
                Object obj = pVar.get(i7);
                this.f10099b = i7;
                return obj;
            case 1:
                s.d0 d0Var = ((q2.r) this.f10102e).f10785a;
                int i10 = this.f10099b;
                this.f10099b = i10 + 1;
                Object objE = d0Var.e(i10);
                i9.l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (r1.o) objE;
            case 2:
                a();
                int i11 = this.f10099b;
                v8.a aVar = (v8.a) this.f10102e;
                if (i11 >= aVar.f13656c) {
                    throw new NoSuchElementException();
                }
                this.f10099b = i11 + 1;
                this.f10100c = i11;
                return aVar.f13654a[aVar.f13655b + i11];
            default:
                b();
                int i12 = this.f10099b;
                v8.b bVar = (v8.b) this.f10102e;
                if (i12 >= bVar.f13661b) {
                    throw new NoSuchElementException();
                }
                this.f10099b = i12 + 1;
                this.f10100c = i12;
                return bVar.f13660a[i12];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f10098a) {
            case 0:
                return this.f10099b + 1;
            case 1:
                return this.f10099b - this.f10100c;
            case 2:
                return this.f10099b;
            default:
                return this.f10099b;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f10098a) {
            case 0:
                c();
                int i7 = this.f10099b;
                p pVar = (p) this.f10102e;
                q.a(i7, pVar.size());
                int i10 = this.f10099b;
                this.f10100c = i10;
                Object obj = pVar.get(i10);
                this.f10099b--;
                return obj;
            case 1:
                s.d0 d0Var = ((q2.r) this.f10102e).f10785a;
                int i11 = this.f10099b - 1;
                this.f10099b = i11;
                Object objE = d0Var.e(i11);
                i9.l.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (r1.o) objE;
            case 2:
                a();
                int i12 = this.f10099b;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f10099b = i13;
                this.f10100c = i13;
                v8.a aVar = (v8.a) this.f10102e;
                return aVar.f13654a[aVar.f13655b + i13];
            default:
                b();
                int i14 = this.f10099b;
                if (i14 <= 0) {
                    throw new NoSuchElementException();
                }
                int i15 = i14 - 1;
                this.f10099b = i15;
                this.f10100c = i15;
                return ((v8.b) this.f10102e).f13660a[i15];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i7;
        switch (this.f10098a) {
            case 0:
                return this.f10099b;
            case 1:
                i7 = this.f10099b - this.f10100c;
                break;
            case 2:
                i7 = this.f10099b;
                break;
            default:
                i7 = this.f10099b;
                break;
        }
        return i7 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f10098a) {
            case 0:
                c();
                p pVar = (p) this.f10102e;
                pVar.remove(this.f10100c);
                this.f10099b--;
                this.f10100c = -1;
                this.f10101d = q.f(pVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                v8.a aVar = (v8.a) this.f10102e;
                a();
                int i7 = this.f10100c;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                aVar.d(i7);
                this.f10099b = this.f10100c;
                this.f10100c = -1;
                this.f10101d = ((AbstractList) aVar).modCount;
                return;
            default:
                v8.b bVar = (v8.b) this.f10102e;
                b();
                int i10 = this.f10100c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.d(i10);
                this.f10099b = this.f10100c;
                this.f10100c = -1;
                this.f10101d = ((AbstractList) bVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f10098a) {
            case 0:
                p pVar = (p) this.f10102e;
                c();
                int i7 = this.f10100c;
                if (i7 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                pVar.set(i7, obj);
                this.f10101d = q.f(pVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                int i10 = this.f10100c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((v8.a) this.f10102e).set(i10, obj);
                return;
            default:
                b();
                int i11 = this.f10100c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((v8.b) this.f10102e).set(i11, obj);
                return;
        }
    }
}
