package u9;

import aa.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import nb.u0;
import nb.w;
import u8.b0;
import u8.c0;
import x9.d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f13224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f13225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f13226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f13227d;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.f13222b);
        }
        f13224a = u8.p.M0(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.f13219a);
        }
        u8.p.M0(arrayList2);
        f13225b = new HashMap();
        f13226c = new HashMap();
        b0.X0(new HashMap(c0.S0(4)), new t8.j[]{new t8.j(q.UBYTEARRAY, wa.e.e("ubyteArrayOf")), new t8.j(q.USHORTARRAY, wa.e.e("ushortArrayOf")), new t8.j(q.UINTARRAY, wa.e.e("uintArrayOf")), new t8.j(q.ULONGARRAY, wa.e.e("ulongArrayOf"))});
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.f13223c.f());
        }
        f13227d = linkedHashSet;
        for (r rVar3 : r.values()) {
            HashMap map = f13225b;
            wa.b bVar = rVar3.f13223c;
            wa.b bVar2 = rVar3.f13221a;
            map.put(bVar, bVar2);
            f13226c.put(bVar2, rVar3.f13223c);
        }
    }

    public static final boolean a(w wVar) {
        x9.h hVarL;
        if (u0.l(wVar) || (hVarL = wVar.D0().l()) == null) {
            return false;
        }
        x9.k kVarL = hVarL.l();
        return (kVarL instanceof d0) && i9.l.a(((j0) ((d0) kVarL)).f364e, o.k) && f13224a.contains(hVarL.getName());
    }
}
