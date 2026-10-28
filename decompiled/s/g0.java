package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements j9.e, Set, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f12433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f12434b;

    public g0(e0 e0Var) {
        i9.l.e(e0Var, "parent");
        this.f12433a = e0Var;
        this.f12434b = e0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12434b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        i9.l.e(collection, "elements");
        e0 e0Var = this.f12434b;
        e0Var.getClass();
        int i7 = e0Var.f12417g;
        for (Object obj : collection) {
            int iD = e0Var.d(obj);
            e0Var.f12412b[iD] = obj;
            long[] jArr = e0Var.f12413c;
            int i10 = e0Var.f12414d;
            jArr[iD] = (((long) i10) & 2147483647L) | 4611686016279904256L;
            if (i10 != Integer.MAX_VALUE) {
                jArr[i10] = ((2147483647L & ((long) iD)) << 31) | (jArr[i10] & (-4611686016279904257L));
            }
            e0Var.f12414d = iD;
            if (e0Var.f12415e == Integer.MAX_VALUE) {
                e0Var.f12415e = iD;
            }
        }
        return i7 != e0Var.f12417g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12434b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12433a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        i9.l.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12433a.c(it.next())) {
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
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        return i9.l.a(this.f12433a, ((g0) obj).f12433a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12433a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12433a.f12417g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new l1.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12434b.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        i9.l.e(collection, "elements");
        e0 e0Var = this.f12434b;
        e0Var.getClass();
        int i7 = e0Var.f12417g;
        Iterator it = collection.iterator();
        while (true) {
            int i10 = 1;
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i12 = iHashCode ^ (iHashCode << 16);
            int i13 = i12 & 127;
            int i14 = e0Var.f12416f;
            int i15 = (i12 >>> 7) & i14;
            while (true) {
                long[] jArr = e0Var.f12411a;
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                int i18 = i11;
                long j5 = (((-i17) >> 63) & (jArr[i16 + i10] << (64 - i17))) | (jArr[i16] >>> i17);
                long j10 = (((long) i13) * 72340172838076673L) ^ j5;
                long j11 = -9187201950435737472L;
                long j12 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
                while (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                    long j13 = j11;
                    if (i9.l.a(e0Var.f12412b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j12 &= j12 - 1;
                    j11 = j13;
                }
                if ((j5 & ((~j5) << 6) & j11) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i11 = i18 + 8;
                i15 = (i15 + i11) & i14;
                i10 = 1;
            }
            if (iNumberOfTrailingZeros >= 0) {
                e0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i7 != e0Var.f12417g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        i9.l.e(collection, "elements");
        return this.f12434b.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12433a.f12417g;
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
        return this.f12433a.toString();
    }
}
