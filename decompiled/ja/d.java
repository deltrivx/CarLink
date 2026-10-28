package ja;

import aa.j;
import da.y;
import i9.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ka.q;
import mb.g;
import mb.k;
import u8.w;
import x9.g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da.a f6993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.e f6994b;

    public d(a aVar) {
        this.f6993a = new da.a(aVar, b.f6988b, new t8.f());
        k kVar = (k) aVar.f6964a;
        kVar.getClass();
        this.f6994b = new mb.e(kVar, new ConcurrentHashMap(3, 1.0f, 2), new mb.f(), 0);
    }

    @Override // x9.g0
    public final boolean a(wa.c cVar) {
        l.e(cVar, "fqName");
        ((a) this.f6993a.f3847b).f6965b.getClass();
        return false;
    }

    @Override // x9.g0
    public final void b(wa.c cVar, ArrayList arrayList) {
        l.e(cVar, "fqName");
        arrayList.add(c(cVar));
    }

    public final q c(wa.c cVar) throws Throwable {
        ((a) this.f6993a.f3847b).f6965b.getClass();
        l.e(cVar, "fqName");
        j jVar = new j(7, this, new y(cVar));
        mb.e eVar = this.f6994b;
        eVar.getClass();
        Object objInvoke = eVar.invoke(new g(cVar, jVar));
        if (objInvoke != null) {
            return (q) objInvoke;
        }
        mb.e.e(3);
        throw null;
    }

    @Override // x9.g0
    public final Collection h(wa.c cVar, h9.k kVar) {
        l.e(cVar, "fqName");
        List list = (List) c(cVar).k.invoke();
        return list == null ? w.f13122a : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f6993a.f3847b).f6977o;
    }
}
