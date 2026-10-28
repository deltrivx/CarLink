package yb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator, y8.c, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y8.c f15280c;

    public final RuntimeException a() {
        int i7 = this.f15278a;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f15278a);
    }

    public final void b(Object obj, a9.h hVar) {
        this.f15279b = obj;
        this.f15278a = 3;
        this.f15280c = hVar;
    }

    @Override // y8.c
    public final y8.h getContext() {
        return y8.i.f15108a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.f15278a;
            if (i7 != 0) {
                break;
            }
            this.f15278a = 5;
            y8.c cVar = this.f15280c;
            i9.l.b(cVar);
            this.f15280c = null;
            cVar.resumeWith(z.f12851a);
        }
        if (i7 == 1) {
            i9.l.b(null);
            throw null;
        }
        if (i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f15278a;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f15278a = 1;
            i9.l.b(null);
            throw null;
        }
        if (i7 != 3) {
            throw a();
        }
        this.f15278a = 0;
        Object obj = this.f15279b;
        this.f15279b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        t8.a.e(obj);
        this.f15278a = 4;
    }
}
