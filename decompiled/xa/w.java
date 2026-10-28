package xa;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Stack f14828a = new Stack();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f14829b;

    public w(d dVar) {
        while (dVar instanceof y) {
            y yVar = (y) dVar;
            this.f14828a.push(yVar);
            dVar = yVar.f14835c;
        }
        this.f14829b = (t) dVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t next() {
        t tVar;
        t tVar2 = this.f14829b;
        if (tVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            Stack stack = this.f14828a;
            if (stack.isEmpty()) {
                tVar = null;
                break;
            }
            d dVar = ((y) stack.pop()).f14836d;
            while (dVar instanceof y) {
                y yVar = (y) dVar;
                stack.push(yVar);
                dVar = yVar.f14835c;
            }
            tVar = (t) dVar;
        } while (tVar.f14826b.length == 0);
        this.f14829b = tVar;
        return tVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14829b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
