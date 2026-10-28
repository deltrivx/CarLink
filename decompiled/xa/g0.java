package xa;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f14787a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14787a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f14787a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
