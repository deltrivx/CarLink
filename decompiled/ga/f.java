package ga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f6072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f6073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f6074d;

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    static {
        wa.d dVar = u9.n.f13181j;
        t8.j jVar = new t8.j(dVar.a(wa.e.e("name")).g(), u9.o.f13200d);
        t8.j jVar2 = new t8.j(dVar.a(wa.e.e("ordinal")).g(), wa.e.e("ordinal"));
        t8.j jVar3 = new t8.j(i2.c.r("size", u9.n.C), wa.e.e("size"));
        wa.c cVar = u9.n.G;
        Map mapW0 = u8.b0.W0(jVar, jVar2, jVar3, new t8.j(i2.c.r("size", cVar), wa.e.e("size")), new t8.j(u9.n.f13173e.a(wa.e.e("length")).g(), wa.e.e("length")), new t8.j(i2.c.r("keys", cVar), wa.e.e("keySet")), new t8.j(i2.c.r("values", cVar), wa.e.e("values")), new t8.j(i2.c.r("entries", cVar), wa.e.e("entrySet")), new t8.j(i2.c.r("size", u9.n.a0), wa.e.e("length")), new t8.j(i2.c.r("size", u9.n.f13168b0), wa.e.e("length")), new t8.j(i2.c.r("size", u9.n.f13170c0), wa.e.e("length")));
        f6071a = mapW0;
        Set<Map.Entry> setEntrySet = mapW0.entrySet();
        ArrayList<t8.j> arrayList = new ArrayList(u8.q.a0(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new t8.j(((wa.c) entry.getKey()).f14240a.f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (t8.j jVar4 : arrayList) {
            wa.e eVar = (wa.e) jVar4.f12831b;
            Object arrayList2 = linkedHashMap.get(eVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(eVar, arrayList2);
            }
            ((List) arrayList2).add((wa.e) jVar4.f12830a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(u8.c0.S0(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            i9.l.e(iterable, "<this>");
            linkedHashMap2.put(key, u8.p.J0(u8.p.L0(iterable)));
        }
        f6072b = linkedHashMap2;
        ?? r8 = f6071a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r8.entrySet()) {
            String str = w9.d.f14177a;
            wa.b bVarF = w9.d.f(((wa.c) entry3.getKey()).b().f14240a);
            i9.l.b(bVarF);
            linkedHashSet.add(bVarF.a().a((wa.e) entry3.getValue()));
        }
        Set setKeySet = f6071a.keySet();
        f6073c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(u8.q.a0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((wa.c) it.next()).f14240a.f());
        }
        f6074d = u8.p.M0(arrayList3);
    }
}
