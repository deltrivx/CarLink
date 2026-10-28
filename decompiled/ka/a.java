package ka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da.o f7383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f7384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.a f7385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f7387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f7388f;

    public a(da.o oVar, h9.k kVar) {
        i9.l.e(oVar, "jClass");
        this.f7383a = oVar;
        this.f7384b = kVar;
        aa.a aVar = new aa.a(15, this);
        this.f7385c = aVar;
        yb.h hVar = new yb.h(u8.p.f0(oVar.d()), true, aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yb.g gVar = new yb.g(hVar);
        while (gVar.hasNext()) {
            Object next = gVar.next();
            wa.e eVarC = ((da.x) next).c();
            Object arrayList = linkedHashMap.get(eVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f7386d = linkedHashMap;
        yb.h hVar2 = new yb.h(u8.p.f0(this.f7383a.b()), true, this.f7384b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        yb.g gVar2 = new yb.g(hVar2);
        while (gVar2.hasNext()) {
            Object next2 = gVar2.next();
            linkedHashMap2.put(((da.u) next2).c(), next2);
        }
        this.f7387e = linkedHashMap2;
        ArrayList arrayListF = this.f7383a.f();
        h9.k kVar2 = this.f7384b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) kVar2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iS0 = u8.c0.S0(u8.q.a0(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS0 < 16 ? 16 : iS0);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((da.a0) obj2).c(), obj2);
        }
        this.f7388f = linkedHashMap3;
    }

    @Override // ka.c
    public final Set a() {
        yb.h hVar = new yb.h(u8.p.f0(this.f7383a.d()), true, this.f7385c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        yb.g gVar = new yb.g(hVar);
        while (gVar.hasNext()) {
            linkedHashSet.add(((da.x) gVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // ka.c
    public final Collection b(wa.e eVar) {
        i9.l.e(eVar, "name");
        List list = (List) this.f7386d.get(eVar);
        return list != null ? list : u8.w.f13122a;
    }

    @Override // ka.c
    public final da.u c(wa.e eVar) {
        i9.l.e(eVar, "name");
        return (da.u) this.f7387e.get(eVar);
    }

    @Override // ka.c
    public final da.a0 d(wa.e eVar) {
        i9.l.e(eVar, "name");
        return (da.a0) this.f7388f.get(eVar);
    }

    @Override // ka.c
    public final Set e() {
        return this.f7388f.keySet();
    }

    @Override // ka.c
    public final Set f() {
        yb.h hVar = new yb.h(u8.p.f0(this.f7383a.b()), true, this.f7384b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        yb.g gVar = new yb.g(hVar);
        while (gVar.hasNext()) {
            linkedHashSet.add(((da.u) gVar.next()).c());
        }
        return linkedHashSet;
    }
}
