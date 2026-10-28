package o2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Collection, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9360a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9361b;

    public j1() {
        int i7 = s.n0.f12474a;
        this.f9361b = new s.e0(6);
    }

    public j1(s.h0 h0Var) {
        i9.l.e(h0Var, "parent");
        this.f9361b = h0Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f9360a) {
            case 0:
                return ((s.e0) this.f9361b).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f9360a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f9360a) {
            case 0:
                ((s.e0) this.f9361b).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9360a) {
            case 0:
                return ((s.e0) this.f9361b).c(obj);
            default:
                return ((s.h0) this.f9361b).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f9360a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((s.e0) this.f9361b).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                i9.l.e(collection, "elements");
                Collection collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (!((s.h0) this.f9361b).d(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f9360a) {
            case 0:
                return ((s.e0) this.f9361b).f12417g == 0;
            default:
                return ((s.h0) this.f9361b).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9360a) {
            case 0:
                s.e0 e0Var = (s.e0) this.f9361b;
                e0Var.getClass();
                return new l1.c(new s.g0(e0Var));
            default:
                return n3.u.E(new h1.g(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f9360a) {
            case 0:
                return ((s.e0) this.f9361b).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f9360a) {
            case 0:
                return ((s.e0) this.f9361b).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f9360a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f9360a) {
            case 0:
                return ((s.e0) this.f9361b).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f9360a) {
            case 0:
                return ((s.e0) this.f9361b).f12417g;
            default:
                return ((s.h0) this.f9361b).f12441e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f9360a) {
            case 0:
                break;
        }
        return i9.k.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f9360a) {
            case 0:
                break;
            default:
                i9.l.e(objArr, "array");
                break;
        }
        return i9.k.b(this, objArr);
    }
}
