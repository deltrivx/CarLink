package wb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import tb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14294b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14295c;

    public /* synthetic */ h(int i7, Object obj) {
        this.f14293a = i7;
        this.f14295c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14293a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f14294b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14293a) {
            case 0:
                if (!this.f14294b) {
                    throw new NoSuchElementException();
                }
                this.f14294b = false;
                return this.f14295c;
            case 1:
                if (!this.f14294b) {
                    throw new NoSuchElementException();
                }
                this.f14294b = false;
                return this.f14295c;
            default:
                if (!this.f14294b) {
                    throw new NoSuchElementException();
                }
                this.f14294b = false;
                return ((q) this.f14295c).f12923a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14293a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
