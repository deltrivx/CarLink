package x9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14708a;

    public f0(ArrayList arrayList) {
        this.f14708a = arrayList;
    }

    @Override // x9.g0
    public final boolean a(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        ArrayList arrayList = this.f14708a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (i9.l.a(((aa.j0) ((d0) it.next())).f364e, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // x9.g0
    public final void b(wa.c cVar, ArrayList arrayList) {
        i9.l.e(cVar, "fqName");
        for (Object obj : this.f14708a) {
            if (i9.l.a(((aa.j0) ((d0) obj)).f364e, cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // x9.g0
    public final Collection h(wa.c cVar, h9.k kVar) {
        i9.l.e(cVar, "fqName");
        return yb.l.U(new yb.h(yb.l.S(u8.p.f0(this.f14708a), q.f14736c), true, new e0(cVar, 0)));
    }
}
