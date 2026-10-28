package u8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13102b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f13101a;
        if (i7 == 0) {
            this.f13101a = 3;
            a();
            return this.f13101a == 1;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f13101a;
        if (i7 == 1) {
            this.f13101a = 0;
            return this.f13102b;
        }
        if (i7 != 2) {
            this.f13101a = 3;
            a();
            if (this.f13101a == 1) {
                this.f13101a = 0;
                return this.f13102b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
