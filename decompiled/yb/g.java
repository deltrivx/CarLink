package yb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f15268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f15271e;

    public g(h hVar) {
        this.f15267a = 0;
        this.f15271e = hVar;
        this.f15268b = hVar.f15272a.iterator();
        this.f15269c = -1;
    }

    public g(i iVar) {
        this.f15267a = 1;
        this.f15271e = iVar;
        this.f15268b = iVar.f15275a.iterator();
    }

    public void a() {
        Object next;
        h hVar = (h) this.f15271e;
        do {
            Iterator it = this.f15268b;
            if (!it.hasNext()) {
                this.f15269c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) hVar.f15274c.invoke(next)).booleanValue() != hVar.f15273b);
        this.f15270d = next;
        this.f15269c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f15270d;
        if (it2 != null && it2.hasNext()) {
            this.f15269c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f15268b;
            if (!it3.hasNext()) {
                this.f15269c = 2;
                this.f15270d = null;
                return false;
            }
            Object next = it3.next();
            i iVar = (i) this.f15271e;
            it = (Iterator) iVar.f15277c.invoke(iVar.f15276b.invoke(next));
        } while (!it.hasNext());
        this.f15270d = it;
        this.f15269c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15267a) {
            case 0:
                if (this.f15269c == -1) {
                    a();
                }
                return this.f15269c == 1;
            default:
                int i7 = this.f15269c;
                if (i7 == 1) {
                    return true;
                }
                if (i7 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15267a) {
            case 0:
                if (this.f15269c == -1) {
                    a();
                }
                if (this.f15269c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f15270d;
                this.f15270d = null;
                this.f15269c = -1;
                return obj;
            default:
                int i7 = this.f15269c;
                if (i7 == 2) {
                    throw new NoSuchElementException();
                }
                if (i7 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f15269c = 0;
                Iterator it = (Iterator) this.f15270d;
                i9.l.b(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15267a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
