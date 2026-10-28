package y9;

import java.util.Iterator;
import java.util.List;
import u8.p;
import u8.v;
import x9.e0;
import yb.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15131b;

    public /* synthetic */ i(int i7, List list) {
        this.f15130a = i7;
        this.f15131b = list;
    }

    public i(wa.c cVar) {
        this.f15130a = 2;
        i9.l.e(cVar, "fqNameToMatch");
        this.f15131b = cVar;
    }

    public i(h[] hVarArr) {
        this.f15130a = 1;
        this.f15131b = u8.l.L0(hVarArr);
    }

    @Override // y9.h
    public final b g(wa.c cVar) {
        switch (this.f15130a) {
            case 0:
                return n4.h.C(this, cVar);
            case 1:
                i9.l.e(cVar, "fqName");
                yb.g gVar = new yb.g(yb.l.T(p.f0((List) this.f15131b), new e0(cVar, 1)));
                return (b) (!gVar.hasNext() ? null : gVar.next());
            default:
                i9.l.e(cVar, "fqName");
                if (cVar.equals((wa.c) this.f15131b)) {
                    return oa.b.f9578a;
                }
                return null;
        }
    }

    @Override // y9.h
    public final boolean i(wa.c cVar) {
        switch (this.f15130a) {
            case 0:
                return n4.h.K(this, cVar);
            case 1:
                i9.l.e(cVar, "fqName");
                Iterator it = ((Iterable) p.f0((List) this.f15131b).f13120b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).i(cVar)) {
                        return true;
                    }
                }
                return false;
            default:
                return n4.h.K(this, cVar);
        }
    }

    @Override // y9.h
    public final boolean isEmpty() {
        switch (this.f15130a) {
            case 0:
                return ((List) this.f15131b).isEmpty();
            case 1:
                List list = (List) this.f15131b;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((h) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15130a) {
            case 0:
                return ((List) this.f15131b).iterator();
            case 1:
                return new yb.g(new yb.i(p.f0((List) this.f15131b), k.f15136a, o.f15282i));
            default:
                return v.f13121a;
        }
    }

    public String toString() {
        switch (this.f15130a) {
            case 0:
                return ((List) this.f15131b).toString();
            default:
                return super.toString();
        }
    }
}
