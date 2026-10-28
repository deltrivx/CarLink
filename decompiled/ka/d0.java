package ka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x9.k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends e0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f7410p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final da.o f7411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f7412o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(da.a aVar, da.o oVar, j jVar) {
        super(aVar, null);
        i9.l.e(oVar, "jClass");
        this.f7411n = oVar;
        this.f7412o = jVar;
    }

    public static k0 v(k0 k0Var) {
        if (k0Var.f() != 2) {
            return k0Var;
        }
        Collection collectionM = k0Var.m();
        i9.l.d(collectionM, "getOverriddenDescriptors(...)");
        Collection<k0> collection = collectionM;
        ArrayList arrayList = new ArrayList(u8.q.a0(collection, 10));
        for (k0 k0Var2 : collection) {
            i9.l.b(k0Var2);
            arrayList.add(v(k0Var2));
        }
        return (k0) u8.p.A0(u8.p.J0(u8.p.L0(arrayList)));
    }

    @Override // gb.p, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        return null;
    }

    @Override // ka.a0
    public final Set h(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return u8.y.f13124a;
    }

    @Override // ka.a0
    public final Set i(gb.f fVar, gb.l lVar) {
        i9.l.e(fVar, "kindFilter");
        Set setL0 = u8.p.L0(((c) this.f7393e.invoke()).a());
        j jVar = this.f7412o;
        d0 d0VarX = k9.a.x(jVar);
        Set setC = d0VarX != null ? d0VarX.c() : null;
        if (setC == null) {
            setC = u8.y.f13124a;
        }
        setL0.addAll(setC);
        if (this.f7411n.f3881a.isEnum()) {
            setL0.addAll(n3.l.J(u9.o.f13199c, u9.o.f13197a));
        }
        da.a aVar = this.f7390b;
        ((eb.a) ((ja.a) aVar.f3847b).f6986x).getClass();
        i9.l.e(jVar, "thisDescriptor");
        i9.l.e(aVar, "c");
        setL0.addAll(new ArrayList());
        return setL0;
    }

    @Override // ka.a0
    public final void j(ArrayList arrayList, wa.e eVar) {
        i9.l.e(eVar, "name");
        da.a aVar = this.f7390b;
        ((eb.a) ((ja.a) aVar.f3847b).f6986x).getClass();
        i9.l.e(this.f7412o, "thisDescriptor");
        i9.l.e(eVar, "name");
        i9.l.e(aVar, "c");
    }

    @Override // ka.a0
    public final c k() {
        return new a(this.f7411n, m.f7451d);
    }

    @Override // ka.a0
    public final void m(LinkedHashSet linkedHashSet, wa.e eVar) {
        i9.l.e(eVar, "name");
        j jVar = this.f7412o;
        d0 d0VarX = k9.a.x(jVar);
        Collection collectionM0 = d0VarX == null ? u8.y.f13124a : u8.p.M0(d0VarX.f(eVar, fa.b.f5506e));
        ja.a aVar = (ja.a) this.f7390b.f3847b;
        linkedHashSet.addAll(g5.a.f0(eVar, collectionM0, linkedHashSet, this.f7412o, aVar.f6969f, ((ob.m) aVar.f6983u).f9657d));
        if (this.f7411n.f3881a.isEnum()) {
            if (eVar.equals(u9.o.f13199c)) {
                linkedHashSet.add(za.k.i(jVar));
            } else if (eVar.equals(u9.o.f13197a)) {
                linkedHashSet.add(za.k.j(jVar));
            }
        }
    }

    @Override // ka.e0, ka.a0
    public final void n(ArrayList arrayList, wa.e eVar) {
        i9.l.e(eVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        aa.a aVar = new aa.a(17, eVar);
        j jVar = this.f7412o;
        wb.l.f(n3.l.I(jVar), b0.f7401a, new c0(jVar, linkedHashSet, aVar));
        boolean zIsEmpty = arrayList.isEmpty();
        da.a aVar2 = this.f7390b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                k0 k0VarV = v((k0) obj);
                Object arrayList2 = linkedHashMap.get(k0VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(k0VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                ja.a aVar3 = (ja.a) aVar2.f3847b;
                u8.u.c0(g5.a.f0(eVar, collection, arrayList, this.f7412o, aVar3.f6969f, ((ob.m) aVar3.f6983u).f9657d), arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            ja.a aVar4 = (ja.a) aVar2.f3847b;
            arrayList.addAll(g5.a.f0(eVar, linkedHashSet, arrayList, this.f7412o, aVar4.f6969f, ((ob.m) aVar4.f6983u).f9657d));
        }
        if (this.f7411n.f3881a.isEnum() && eVar.equals(u9.o.f13198b)) {
            wb.l.a(arrayList, za.k.h(jVar));
        }
    }

    @Override // ka.a0
    public final Set o(gb.f fVar) {
        i9.l.e(fVar, "kindFilter");
        Set setL0 = u8.p.L0(((c) this.f7393e.invoke()).f());
        m mVar = m.f7452e;
        j jVar = this.f7412o;
        wb.l.f(n3.l.I(jVar), b0.f7401a, new c0(jVar, setL0, mVar));
        if (this.f7411n.f3881a.isEnum()) {
            setL0.add(u9.o.f13198b);
        }
        return setL0;
    }

    @Override // ka.a0
    public final x9.k q() {
        return this.f7412o;
    }
}
