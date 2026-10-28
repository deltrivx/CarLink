package y9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import nb.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f15137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f15138b;

    public l(h hVar, t tVar) {
        this.f15137a = hVar;
        this.f15138b = tVar;
    }

    @Override // y9.h
    public final b g(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        if (((Boolean) this.f15138b.invoke(cVar)).booleanValue()) {
            return this.f15137a.g(cVar);
        }
        return null;
    }

    @Override // y9.h
    public final boolean i(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        if (((Boolean) this.f15138b.invoke(cVar)).booleanValue()) {
            return this.f15137a.i(cVar);
        }
        return false;
    }

    @Override // y9.h
    public final boolean isEmpty() {
        h hVar = this.f15137a;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            wa.c cVarA = ((b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f15138b.invoke(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f15137a) {
            wa.c cVarA = ((b) obj).a();
            if (cVarA != null && ((Boolean) this.f15138b.invoke(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
