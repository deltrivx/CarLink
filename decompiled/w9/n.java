package w9;

import aa.h0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import o9.e0;
import u8.y;
import x9.d0;
import x9.g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.k f14223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f14224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jb.i f14225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.e f14226d;

    public n(mb.k kVar, ca.b bVar, h0 h0Var) {
        this.f14223a = kVar;
        this.f14224b = h0Var;
        this.f14226d = kVar.c(new aa.a(12, this));
    }

    @Override // x9.g0
    public final boolean a(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        f1.e eVar = this.f14226d;
        Object obj = ((ConcurrentHashMap) eVar.f4935c).get(cVar);
        return ((obj == null || obj == mb.j.f8623b) ? c(cVar) : (d0) eVar.invoke(cVar)) == null;
    }

    @Override // x9.g0
    public final void b(wa.c cVar, ArrayList arrayList) {
        i9.l.e(cVar, "fqName");
        wb.l.a(arrayList, this.f14226d.invoke(cVar));
    }

    public final kb.c c(wa.c cVar) {
        InputStream inputStreamL;
        i9.l.e(cVar, "fqName");
        if (cVar.c(u9.o.f13206j)) {
            kb.a.f7495m.getClass();
            inputStreamL = kb.d.l(kb.a.a(cVar));
        } else {
            inputStreamL = null;
        }
        if (inputStreamL != null) {
            return e0.p(cVar, this.f14223a, this.f14224b, inputStreamL);
        }
        return null;
    }

    @Override // x9.g0
    public final Collection h(wa.c cVar, h9.k kVar) {
        i9.l.e(cVar, "fqName");
        return y.f13124a;
    }
}
