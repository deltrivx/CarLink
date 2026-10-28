package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements j9.e, Set, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f12466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f12467b;

    public k0(i0 i0Var) {
        this.f12466a = i0Var;
        this.f12467b = i0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12467b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        i9.l.e(collection, "elements");
        i0 i0Var = this.f12467b;
        int i7 = i0Var.f12447d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i0Var.j(it.next());
        }
        return i7 != i0Var.f12447d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12467b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12466a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        i9.l.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12466a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        return i9.l.a(this.f12466a, ((k0) obj).f12466a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12466a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12466a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new l1.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12467b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        i9.l.e(collection, "elements");
        i0 i0Var = this.f12467b;
        i0Var.getClass();
        int i7 = i0Var.f12447d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i0Var.i(it.next());
        }
        return i7 != i0Var.f12447d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z10;
        i9.l.e(collection, "elements");
        i0 i0Var = this.f12467b;
        i0Var.getClass();
        Object[] objArr = i0Var.f12445b;
        int i7 = i0Var.f12447d;
        long[] jArr = i0Var.f12444a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j5 = jArr[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j5) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!u8.p.g0(collection, objArr[i13])) {
                                i0Var.m(i13);
                            }
                        }
                        j5 >>= 8;
                    }
                    z10 = false;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    z10 = false;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
        }
        if (i7 != i0Var.f12447d) {
            return true;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12466a.f12447d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return i9.k.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        i9.l.e(objArr, "array");
        return i9.k.b(this, objArr);
    }

    public final String toString() {
        return this.f12466a.toString();
    }
}
