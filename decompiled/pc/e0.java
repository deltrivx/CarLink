package pc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f10439a;

    public e0() {
        x0 x0Var = x0.f10518a;
        qc.l lVar = qc.l.f11043a;
        this.f10439a = new d0(x0.f10519b, qc.l.f11044b);
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        h(obj);
        d0 d0Var = this.f10439a;
        i9.l.e(d0Var, "descriptor");
        rc.s sVarA = sVar.a(d0Var);
        Iterator itG = g(obj);
        int i7 = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i7 + 1;
            sVarA.o(d0Var, i7, x0.f10518a, key);
            i7 += 2;
            sVarA.o(d0Var, i10, qc.l.f11043a, value);
        }
        sVarA.t(d0Var);
    }

    @Override // mc.a
    public final nc.e d() {
        return this.f10439a;
    }

    @Override // pc.a
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // pc.a
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        i9.l.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // pc.a
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        i9.l.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // pc.a
    public final int h(Object obj) {
        Map map = (Map) obj;
        i9.l.e(map, "<this>");
        return map.size();
    }

    @Override // pc.a
    public final void j(oc.a aVar, int i7, Object obj) {
        Map map = (Map) obj;
        qc.l lVar = qc.l.f11043a;
        i9.l.e(map, "builder");
        x0 x0Var = x0.f10518a;
        d0 d0Var = this.f10439a;
        Object objT = aVar.t(d0Var, i7, x0Var, null);
        int iW = aVar.w(d0Var);
        if (iW != i7 + 1) {
            throw new IllegalArgumentException(a2.f.D(i7, iW, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        map.put(objT, (!map.containsKey(objT) || (qc.l.f11044b.f9078b instanceof nc.d)) ? aVar.t(d0Var, iW, lVar, null) : aVar.t(d0Var, iW, lVar, u8.b0.V0(objT, map)));
    }

    @Override // pc.a
    public final Object k(Object obj) {
        i9.l.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // pc.a
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        i9.l.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
