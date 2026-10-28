package lb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ob.g f8311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mb.i f8312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mb.i f8313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f8314j;

    public g(h hVar, ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        this.f8314j = hVar;
        jb.k kVar = hVar.f8321l;
        ra.k kVar2 = hVar.f8315e;
        List list = kVar2.f12051q;
        i9.l.d(list, "getFunctionList(...)");
        List list2 = kVar2.f12052r;
        i9.l.d(list2, "getPropertyList(...)");
        List list3 = kVar2.f12053s;
        i9.l.d(list3, "getTypeAliasList(...)");
        List list4 = kVar2.k;
        i9.l.d(list4, "getNestedClassNameList(...)");
        ta.f fVar = hVar.f8321l.f7044b;
        ArrayList arrayList = new ArrayList(u8.q.a0(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(i2.c.G(fVar, ((Number) it.next()).intValue()));
        }
        super(kVar, list, list2, list3, new e(0, arrayList));
        jb.i iVar = kVar.f7043a;
        this.f8311g = gVar;
        mb.k kVar3 = iVar.f7018a;
        f fVar2 = new f(this, 0);
        kVar3.getClass();
        this.f8312h = new mb.i(kVar3, fVar2);
        mb.k kVar4 = iVar.f7018a;
        f fVar3 = new f(this, 1);
        kVar4.getClass();
        this.f8313i = new mb.i(kVar4, fVar3);
    }

    @Override // lb.o, gb.p, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        x9.e eVar2;
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        s(eVar, bVar);
        da.a aVar = this.f8314j.f8325p;
        return (aVar == null || (eVar2 = (x9.e) ((f1.e) aVar.f3848c).invoke(eVar)) == null) ? super.a(eVar, bVar) : eVar2;
    }

    @Override // lb.o, gb.p, gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        s(eVar, bVar);
        return super.b(eVar, bVar);
    }

    @Override // gb.p, gb.q
    public final Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return (Collection) this.f8312h.invoke();
    }

    @Override // lb.o, gb.p, gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        s(eVar, bVar);
        return super.f(eVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [u8.w] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // lb.o
    public final void h(ArrayList arrayList, h9.k kVar) {
        ?? arrayList2;
        da.a aVar = this.f8314j.f8325p;
        if (aVar != null) {
            Set<wa.e> setKeySet = ((LinkedHashMap) aVar.f3847b).keySet();
            arrayList2 = new ArrayList();
            for (wa.e eVar : setKeySet) {
                i9.l.e(eVar, "name");
                x9.e eVar2 = (x9.e) ((f1.e) aVar.f3848c).invoke(eVar);
                if (eVar2 != null) {
                    arrayList2.add(eVar2);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = w.f13122a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // lb.o
    public final void j(ArrayList arrayList, wa.e eVar) {
        i9.l.e(eVar, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f8313i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((nb.w) it.next()).U().f(eVar, fa.b.f5504c));
        }
        jb.k kVar = this.f8352b;
        arrayList.addAll(kVar.f7043a.f7030n.c(eVar, this.f8314j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((ob.m) kVar.f7043a.f7033q).f9657d.h(eVar, arrayList2, arrayList3, this.f8314j, new aa.u(arrayList, 1));
    }

    @Override // lb.o
    public final void k(ArrayList arrayList, wa.e eVar) {
        i9.l.e(eVar, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f8313i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((nb.w) it.next()).U().b(eVar, fa.b.f5504c));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((ob.m) this.f8352b.f7043a.f7033q).f9657d.h(eVar, arrayList2, arrayList3, this.f8314j, new aa.u(arrayList, 1));
    }

    @Override // lb.o
    public final wa.b l(wa.e eVar) {
        i9.l.e(eVar, "name");
        return this.f8314j.f8318h.d(eVar);
    }

    @Override // lb.o
    public final Set n() {
        List listM = this.f8314j.f8323n.m();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            Set setE = ((nb.w) it.next()).U().e();
            if (setE == null) {
                return null;
            }
            u8.u.c0(setE, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // lb.o
    public final Set o() {
        h hVar = this.f8314j;
        List listM = hVar.f8323n.m();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            u8.u.c0(((nb.w) it.next()).U().c(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f8352b.f7043a.f7030n.e(hVar));
        return linkedHashSet;
    }

    @Override // lb.o
    public final Set p() {
        List listM = this.f8314j.f8323n.m();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            u8.u.c0(((nb.w) it.next()).U().g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // lb.o
    public final boolean r(r rVar) {
        return this.f8352b.f7043a.f7031o.a(this.f8314j, rVar);
    }

    public final void s(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        i9.l.e(this.f8352b.f7043a.f7026i, "<this>");
        i9.l.e(this.f8314j, "scopeOwner");
    }
}
