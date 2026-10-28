package u8;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13098a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f13099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13100c;

    public a0(Iterator it) {
        i9.l.e(it, "iterator");
        this.f13099b = it;
    }

    public a0(yb.d dVar) {
        this.f13099b = dVar.f15264a.iterator();
        this.f13100c = dVar.f15265b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f13098a) {
            case 0:
                return this.f13099b.hasNext();
        }
        while (true) {
            int i7 = this.f13100c;
            it = this.f13099b;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f13100c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f13098a) {
            case 0:
                int i7 = this.f13100c;
                this.f13100c = i7 + 1;
                if (i7 >= 0) {
                    return new z(i7, this.f13099b.next());
                }
                n3.l.Y();
                throw null;
        }
        while (true) {
            int i10 = this.f13100c;
            it = this.f13099b;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f13100c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13098a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
