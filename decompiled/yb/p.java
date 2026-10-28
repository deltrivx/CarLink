package yb;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f15283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f15284b;

    public p(q qVar) {
        this.f15284b = qVar;
        this.f15283a = qVar.f15285a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15283a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f15284b.f15286b.invoke(this.f15283a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
