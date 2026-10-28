package j1;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6867b;

    public a(int i7, int i10) {
        this.f6866a = i7;
        this.f6867b = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f6866a < this.f6867b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6866a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6866a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6866a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
