package i3;

import i9.k;
import i9.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, j9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f6613c = new b(w.f13122a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6615b;

    public b(List list) {
        this.f6614a = list;
        this.f6615b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final a c() {
        return (a) this.f6614a.get(0);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f6614a.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f6614a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.a(this.f6614a, ((b) obj).f6614a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f6614a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f6614a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f6614a.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f6615b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f6614a + ')';
    }
}
