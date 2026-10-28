package ka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends e0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final da.y f7479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f7480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mb.h f7481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f1.e f7482q;

    public v(da.a aVar, da.y yVar, q qVar) {
        super(aVar, null);
        this.f7479n = yVar;
        this.f7480o = qVar;
        mb.n nVar = ((ja.a) aVar.f3847b).f6964a;
        aa.j jVar = new aa.j(9, aVar, this);
        mb.k kVar = (mb.k) nVar;
        kVar.getClass();
        this.f7481p = new mb.h(kVar, jVar);
        this.f7482q = ((mb.k) nVar).c(new c8.y(4, this, aVar));
    }

    @Override // gb.p, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        return v(eVar, null);
    }

    @Override // ka.a0, gb.p, gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return u8.w.f13122a;
    }

    @Override // ka.a0, gb.p, gb.q
    public final Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        if (!fVar.a(gb.f.f6172l | gb.f.f6166e)) {
            return u8.w.f13122a;
        }
        Iterable iterable = (Iterable) this.f7392d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            x9.k kVar2 = (x9.k) obj;
            if (kVar2 instanceof x9.e) {
                wa.e name = ((x9.e) kVar2).getName();
                i9.l.d(name, "getName(...)");
                if (((Boolean) kVar.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // ka.a0
    public final Set h(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        if (!fVar.a(gb.f.f6166e)) {
            return u8.y.f13124a;
        }
        Set set = (Set) this.f7481p.invoke();
        if (set == null) {
            this.f7479n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(wa.e.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // ka.a0
    public final Set i(gb.f fVar, gb.l lVar) {
        i9.l.e(fVar, "kindFilter");
        return u8.y.f13124a;
    }

    @Override // ka.a0
    public final c k() {
        return b.f7400a;
    }

    @Override // ka.a0
    public final void m(LinkedHashSet linkedHashSet, wa.e eVar) {
        i9.l.e(eVar, "name");
    }

    @Override // ka.a0
    public final Set o(gb.f fVar) {
        i9.l.e(fVar, "kindFilter");
        return u8.y.f13124a;
    }

    @Override // ka.a0
    public final x9.k q() {
        return this.f7480o;
    }

    public final x9.e v(wa.e eVar, da.o oVar) {
        wa.e eVar2 = wa.g.f14251a;
        i9.l.e(eVar, "name");
        String strB = eVar.b();
        i9.l.d(strB, "asString(...)");
        if (strB.length() <= 0 || eVar.f14248b) {
            return null;
        }
        Set set = (Set) this.f7481p.invoke();
        if (oVar == null && set != null && !set.contains(eVar.b())) {
            return null;
        }
        return (x9.e) this.f7482q.invoke(new r(eVar, oVar));
    }
}
