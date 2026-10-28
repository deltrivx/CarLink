package t8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Collection, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12843a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        byte b10 = ((q) obj).f12842a;
        byte[] bArr = this.f12843a;
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            if (b10 == bArr[i7]) {
                if (i7 >= 0) {
                    return true;
                }
                return false;
            }
            i7++;
        }
        i7 = -1;
        if (i7 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        i9.l.e(collection, "elements");
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof q) {
                    byte b10 = ((q) obj).f12842a;
                    byte[] bArr = this.f12843a;
                    int length = bArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i7 = -1;
                            break;
                        }
                        if (b10 == bArr[i7]) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return i9.l.a(this.f12843a, ((r) obj).f12843a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f12843a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12843a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new i9.b(2, this.f12843a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12843a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return i9.k.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        i9.l.e(objArr, "array");
        return i9.k.b(this, objArr);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f12843a) + ')';
    }
}
