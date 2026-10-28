package aa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements x9.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f403b;

    public p(List list, String str) {
        i9.l.e(str, "debugName");
        this.f402a = list;
        this.f403b = str;
        list.size();
        u8.p.M0(list).size();
    }

    @Override // x9.g0
    public final boolean a(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        List list = this.f402a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!x9.v.h((x9.g0) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // x9.g0
    public final void b(wa.c cVar, ArrayList arrayList) {
        i9.l.e(cVar, "fqName");
        Iterator it = this.f402a.iterator();
        while (it.hasNext()) {
            x9.v.b((x9.g0) it.next(), cVar, arrayList);
        }
    }

    @Override // x9.g0
    public final Collection h(wa.c cVar, h9.k kVar) {
        i9.l.e(cVar, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f402a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((x9.g0) it.next()).h(cVar, kVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f403b;
    }
}
