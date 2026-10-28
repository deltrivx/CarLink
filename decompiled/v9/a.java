package v9;

import aa.c0;
import aa.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import u8.p;
import x9.y;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements z9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.k f13684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f13685b;

    public a(mb.k kVar, h0 h0Var) {
        i9.l.e(h0Var, "module");
        this.f13684a = kVar;
        this.f13685b = h0Var;
    }

    @Override // z9.c
    public final Collection a(wa.c cVar) {
        i9.l.e(cVar, "packageFqName");
        return u8.y.f13124a;
    }

    @Override // z9.c
    public final boolean b(wa.c cVar, wa.e eVar) {
        i9.l.e(cVar, "packageFqName");
        i9.l.e(eVar, "name");
        String strB = eVar.b();
        i9.l.d(strB, "asString(...)");
        return (q.o0(strB, "Function") || q.o0(strB, "KFunction") || q.o0(strB, "SuspendFunction") || q.o0(strB, "KSuspendFunction")) && m.f13705b.a(strB, cVar) != null;
    }

    @Override // z9.c
    public final x9.e c(wa.b bVar) {
        wa.c cVar;
        l lVarA;
        i9.l.e(bVar, "classId");
        if (bVar.f14238c || bVar.g()) {
            return null;
        }
        String str = bVar.f14237b.f14240a.f14243a;
        if (!zb.j.r0(str, "Function", false) || (lVarA = m.f13705b.a(str, (cVar = bVar.f14236a))) == null) {
            return null;
        }
        k kVar = lVarA.f13703a;
        int i7 = lVarA.f13704b;
        List list = (List) k9.a.z(((c0) this.f13685b.F(cVar)).f324e, c0.f321h[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof kb.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (p.m0(arrayList2) == null) {
            return new c(this.f13684a, (kb.c) p.k0(arrayList), kVar, i7);
        }
        throw new ClassCastException();
    }
}
