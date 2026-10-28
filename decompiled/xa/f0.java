package xa;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ListIterator f14784a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14784a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14784a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f14784a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14784a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f14784a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14784a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
