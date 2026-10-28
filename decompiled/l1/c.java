package l1;

import h9.k;
import i9.l;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import n3.u;
import s.f0;
import s.g0;
import s.j0;
import s.k0;
import u8.o;
import yb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7974d;

    public c(Object obj, Map map) {
        this.f7971a = 0;
        this.f7973c = obj;
        this.f7974d = map;
    }

    public c(g0 g0Var) {
        this.f7971a = 1;
        this.f7974d = g0Var;
        this.f7972b = -1;
        this.f7973c = u.E(new f0(g0Var, this, null));
    }

    public c(k0 k0Var) {
        this.f7971a = 2;
        this.f7974d = k0Var;
        this.f7972b = -1;
        this.f7973c = u.E(new j0(k0Var, this, null));
    }

    public c(o oVar) {
        this.f7971a = 4;
        this.f7974d = ((j) oVar.f13120b).iterator();
        this.f7972b = -1;
    }

    public c(yb.c cVar) {
        this.f7971a = 3;
        this.f7974d = cVar;
        this.f7972b = -2;
    }

    public void a() {
        Object objInvoke;
        yb.c cVar = (yb.c) this.f7974d;
        if (this.f7972b == -2) {
            objInvoke = ((h9.a) cVar.f15263c).invoke();
        } else {
            k kVar = (k) cVar.f15262b;
            Object obj = this.f7973c;
            l.b(obj);
            objInvoke = kVar.invoke(obj);
        }
        this.f7973c = objInvoke;
        this.f7972b = objInvoke == null ? 0 : 1;
    }

    public void b() {
        Iterator it = (Iterator) this.f7974d;
        if (it.hasNext()) {
            Object next = it.next();
            x9.k kVar = (x9.k) next;
            l.e(kVar, "it");
            if (kVar instanceof x9.b) {
                this.f7972b = 1;
                this.f7973c = next;
                return;
            }
        }
        this.f7972b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7971a) {
            case 0:
                return this.f7972b < ((Map) this.f7974d).size();
            case 1:
                return ((yb.k) this.f7973c).hasNext();
            case 2:
                return ((yb.k) this.f7973c).hasNext();
            case 3:
                if (this.f7972b < 0) {
                    a();
                }
                return this.f7972b == 1;
            default:
                if (this.f7972b == -1) {
                    b();
                }
                return this.f7972b == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7971a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f7973c;
                this.f7972b++;
                Object obj2 = ((Map) this.f7974d).get(obj);
                if (obj2 != null) {
                    this.f7973c = ((a) obj2).f7966b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                return ((yb.k) this.f7973c).next();
            case 2:
                return ((yb.k) this.f7973c).next();
            case 3:
                if (this.f7972b < 0) {
                    a();
                }
                if (this.f7972b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f7973c;
                l.c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f7972b = -1;
                return obj3;
            default:
                if (this.f7972b == -1) {
                    b();
                }
                if (this.f7972b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj4 = this.f7973c;
                this.f7973c = null;
                this.f7972b = -1;
                return obj4;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7971a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i7 = this.f7972b;
                if (i7 != -1) {
                    ((g0) this.f7974d).f12434b.h(i7);
                    this.f7972b = -1;
                    return;
                }
                return;
            case 2:
                int i10 = this.f7972b;
                if (i10 != -1) {
                    ((k0) this.f7974d).f12467b.m(i10);
                    this.f7972b = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
