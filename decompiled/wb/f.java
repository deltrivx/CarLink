package wb;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f14290c;

    public f(g gVar) {
        this.f14290c = gVar;
        this.f14289b = ((AbstractList) gVar).modCount;
    }

    public final void a() {
        g gVar = this.f14290c;
        int i7 = ((AbstractList) gVar).modCount;
        int i10 = this.f14289b;
        if (i7 == i10) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) gVar).modCount + "; expected: " + i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14288a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14288a) {
            throw new NoSuchElementException();
        }
        this.f14288a = true;
        a();
        return this.f14290c.f14292b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f14290c.clear();
    }
}
