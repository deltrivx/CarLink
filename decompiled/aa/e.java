package aa;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.b1;
import f1.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r9.n1;
import r9.o1;
import r9.q1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f334b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f333a = i7;
        this.f334b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:251:0x065a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [s.d0] */
    /* JADX WARN: Type inference failed for: r12v8, types: [s.d0] */
    /* JADX WARN: Type inference failed for: r14v0, types: [nb.r0] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3, types: [aa.z] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [aa.a0] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v10, types: [f1.s0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [aa.m, java.lang.Object] */
    @Override // h9.a
    public final Object invoke() throws Throwable {
        nb.r0 r0VarD;
        Object obj;
        Throwable th;
        List list;
        lb.s sVar;
        ?? r15;
        Throwable th2;
        Collection collection;
        bb.i iVar;
        y9.m mVar;
        bb.b bVarA;
        int iHashCode;
        int i7 = this.f333a;
        u8.w wVar = u8.w.f13122a;
        u8.x xVar = u8.x.f13123a;
        int i10 = 10;
        int iHashCode2 = 0;
        Throwable th3 = null;
        Object obj2 = this.f334b;
        switch (i7) {
            case 0:
                h hVar = (h) obj2;
                lb.s sVar2 = (lb.s) hVar;
                x9.e eVarC0 = sVar2.C0();
                if (eVarC0 == null) {
                    return wVar;
                }
                Collection<??> collectionW = eVarC0.w();
                i9.l.d(collectionW, "getConstructors(...)");
                ArrayList arrayList = new ArrayList();
                for (?? r8 : collectionW) {
                    k0 k0Var = v0.G;
                    mb.n nVar = hVar.f339e;
                    i9.l.b(r8);
                    k0Var.getClass();
                    i9.l.e(nVar, "storageManager");
                    if (sVar2.C0() == null) {
                        obj = th3;
                    } else {
                        r0VarD = nb.r0.d(sVar2.D0());
                    }
                    if (obj == null) {
                        obj = r0VarD;
                        sVar = sVar2;
                        Throwable th4 = th3;
                        th2 = th4;
                        r15 = th4;
                    } else {
                        obj = r0VarD;
                        ?? r14 = obj;
                        m mVarE = r8.e(r14);
                        if (mVarE == null) {
                            obj = r0VarD;
                            sVar = sVar2;
                            Throwable th5 = th3;
                            th2 = th5;
                            r15 = th5;
                        } else {
                            y9.h annotations = ((h0.a0) r8).getAnnotations();
                            z zVar = (z) r8;
                            int iF = zVar.f();
                            a2.f.O(iF, "getKind(...)");
                            x9.n0 source = hVar.getSource();
                            th = th3;
                            i9.l.d(source, "getSource(...)");
                            v0 v0Var = new v0(nVar, hVar, mVarE, null, annotations, iF, source);
                            List listX = zVar.X();
                            if (listX == null) {
                                z.D(28);
                                throw th;
                            }
                            ArrayList arrayListG0 = z.G0(v0Var, listX, r14, false, false, null);
                            if (arrayListG0 == null) {
                                sVar = sVar2;
                                r15 = th;
                            } else {
                                nb.a0 a0VarE = nb.c.E(nb.c.l(mVarE.f478g.G0()), sVar2.n());
                                a0 a0Var = zVar.f481j;
                                nb.x0 x0Var = nb.x0.INVARIANT;
                                y9.f fVar = y9.g.f15129a;
                                ?? K = a0Var != null ? za.k.k(v0Var, r14.g(a0Var.getType(), x0Var), fVar) : th;
                                x9.e eVarC1 = sVar2.C0();
                                if (eVarC1 != null) {
                                    List listI0 = zVar.i0();
                                    i9.l.d(listI0, "getContextReceiverParameters(...)");
                                    ArrayList arrayList2 = new ArrayList(u8.q.a0(listI0, i10));
                                    int i11 = 0;
                                    for (Object obj3 : listI0) {
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            n3.l.Y();
                                            throw th;
                                        }
                                        a0 a0Var2 = (a0) obj3;
                                        nb.w wVarG = r14.g(a0Var2.getType(), x0Var);
                                        hb.d dVarC0 = a0Var2.C0();
                                        i9.l.c(dVarC0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                        lb.s sVar3 = sVar2;
                                        hb.a aVar = new hb.a(eVarC1, wVarG, ((hb.a) dVarC0).w0());
                                        zb.i iVar2 = wa.f.f14249a;
                                        arrayList2.add(new a0(eVarC1, aVar, fVar, wa.e.e(wa.f.f14250b + '_' + i11)));
                                        i11 = i12;
                                        sVar2 = sVar3;
                                    }
                                    list = arrayList2;
                                } else {
                                    list = wVar;
                                }
                                sVar = sVar2;
                                ?? r16 = v0Var;
                                r16.H0(K, null, list, hVar.q(), arrayListG0, a0VarE, x9.x.f14747b, hVar.f340f);
                                r15 = r16;
                                th2 = th;
                            }
                        }
                    }
                    if (r15 != 0) {
                        th2 = th;
                        arrayList.add(r15);
                    } else {
                        th2 = th;
                    }
                    th3 = th2;
                    sVar2 = sVar;
                    i10 = 10;
                }
                return arrayList;
            case 1:
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                j jVar = (j) obj2;
                sb2.append(((wa.e) jVar.f362b).b());
                return i2.c.t(((l) jVar.f363c).getUpperBounds(), sb2.toString());
            case 2:
                v vVar = (v) obj2;
                HashSet hashSet = new HashSet();
                for (wa.e eVar : (Set) vVar.f441e.f444i.invoke()) {
                    fa.b bVar = fa.b.f5507f;
                    hashSet.addAll(vVar.f(eVar, bVar));
                    hashSet.addAll(vVar.b(eVar, bVar));
                }
                return hashSet;
            case 3:
                return (List) obj2;
            case 4:
                return (List) ((x0) obj2).f447l.getValue();
            case 5:
                nb.w wVarB = ((nb.n0) obj2).b();
                i9.l.d(wVarB, "getType(...)");
                return wVarB;
            case 6:
                ((b1) obj2).setValue(null);
                return t8.z.f12851a;
            case 7:
                ArrayList arrayList3 = ((p1) obj2).f5081a;
                s.h0 h0Var = new s.h0(arrayList3.size());
                int size = arrayList3.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ?? r10 = (f1.s0) arrayList3.get(i13);
                    Object obj4 = r10.f5132b;
                    int i14 = r10.f5131a;
                    Object r0Var = obj4 != null ? new f1.r0(Integer.valueOf(i14), r10.f5132b) : Integer.valueOf(i14);
                    int iF2 = h0Var.f(r0Var);
                    boolean z10 = iF2 < 0;
                    Object obj5 = z10 ? null : h0Var.f12439c[iF2];
                    if (obj5 != null) {
                        if (obj5 instanceof s.d0) {
                            ?? r11 = (s.d0) obj5;
                            r11.a(r10);
                            r10 = r11;
                        } else {
                            Object[] objArr = s.m0.f12471a;
                            ?? d0Var = new s.d0(2);
                            d0Var.a(obj5);
                            d0Var.a(r10);
                            r10 = d0Var;
                        }
                    }
                    if (z10) {
                        int i15 = ~iF2;
                        h0Var.f12438b[i15] = r0Var;
                        h0Var.f12439c[i15] = r10;
                    } else {
                        h0Var.f12439c[iF2] = r10;
                    }
                }
                return new h1.a(h0Var);
            case 8:
                ga.w wVar2 = (ga.w) obj2;
                v8.b bVar2 = new v8.b(10);
                bVar2.add(wVar2.f6120a.f6052a);
                ga.c0 c0Var = wVar2.f6121b;
                if (c0Var != null) {
                    bVar2.add("under-migration:".concat(c0Var.f6052a));
                }
                for (Map.Entry entry : wVar2.f6122c.entrySet()) {
                    bVar2.add("@" + entry.getKey() + ':' + ((ga.c0) entry.getValue()).f6052a);
                }
                return (String[]) n3.l.n(bVar2).toArray(new String[0]);
            case 9:
                gb.h hVar2 = (gb.h) obj2;
                List listH = hVar2.h();
                ArrayList arrayList4 = new ArrayList(3);
                c cVar = hVar2.f6185b;
                Collection collectionM = cVar.t().m();
                i9.l.d(collectionM, "getSupertypes(...)");
                ArrayList arrayList5 = new ArrayList();
                Iterator it = collectionM.iterator();
                while (it.hasNext()) {
                    u8.u.c0(g5.a.I(((nb.w) it.next()).U(), null, 3), arrayList5);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : arrayList5) {
                    if (obj6 instanceof x9.c) {
                        arrayList6.add(obj6);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : arrayList6) {
                    wa.e name = ((x9.c) obj7).getName();
                    Object arrayList7 = linkedHashMap.get(name);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap.put(name, arrayList7);
                    }
                    ((List) arrayList7).add(obj7);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    i9.l.d(key, "component1(...)");
                    wa.e eVar2 = (wa.e) key;
                    List list2 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj8 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((x9.c) obj8) instanceof x9.t);
                        Object arrayList8 = linkedHashMap2.get(boolValueOf);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList8);
                        }
                        ((List) arrayList8).add(obj8);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list3 = (List) entry3.getValue();
                        za.j jVar2 = za.j.f15799c;
                        if (zBooleanValue) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj9 : listH) {
                                if (i9.l.a(((q) ((x9.t) obj9)).getName(), eVar2)) {
                                    arrayList9.add(obj9);
                                }
                            }
                            collection = arrayList9;
                        } else {
                            collection = wVar;
                        }
                        jVar2.h(eVar2, list3, collection, cVar, new gb.g(arrayList4, hVar2));
                    }
                }
                return u8.p.x0(wb.l.d(arrayList4), listH);
            case 10:
                nb.p0 p0VarF = ((nb.r0) obj2).f();
                p0VarF.getClass();
                return new nb.r0(p0VarF);
            case 11:
                gb.t tVar = (gb.t) obj2;
                return tVar.h(g5.a.I(tVar.f6207b, null, 3));
            case 12:
                Object obj10 = ha.e.f6478a;
                na.a aVar2 = ((ha.i) obj2).f6472d;
                da.t tVar2 = aVar2 instanceof da.t ? (da.t) aVar2 : null;
                if (tVar2 == null || (mVar = (y9.m) ha.e.f6479b.get(wa.e.e(tVar2.f3886b.name()).b())) == null) {
                    iVar = null;
                } else {
                    wa.c cVar2 = u9.n.f13192v;
                    i9.l.e(cVar2, "topLevelFqName");
                    iVar = new bb.i(new wa.b(cVar2.b(), cVar2.f14240a.f()), wa.e.e(mVar.name()));
                }
                Map mapT0 = iVar != null ? u8.c0.T0(new t8.j(ha.c.f6475c, iVar)) : null;
                return mapT0 == null ? xVar : mapT0;
            case 13:
                na.a aVar3 = ((ha.j) obj2).f6472d;
                if (aVar3 instanceof da.h) {
                    Object obj11 = ha.e.f6478a;
                    bVarA = ha.e.a(((da.h) aVar3).a());
                } else if (aVar3 instanceof da.t) {
                    Object obj12 = ha.e.f6478a;
                    bVarA = ha.e.a(n3.l.I(aVar3));
                } else {
                    bVarA = null;
                }
                Map mapT1 = bVarA != null ? u8.c0.T0(new t8.j(ha.c.f6474b, bVarA)) : null;
                return mapT1 == null ? xVar : mapT1;
            case 14:
                Set setKeySet = ((LinkedHashMap) ((kb.c) obj2).f7498i.f3850e).keySet();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj13 : setKeySet) {
                    wa.b bVar3 = (wa.b) obj13;
                    if (!bVar3.g() && !jb.g.f7014c.contains(bVar3)) {
                        arrayList10.add(obj13);
                    }
                }
                ArrayList arrayList11 = new ArrayList(u8.q.a0(arrayList10, 10));
                Iterator it2 = arrayList10.iterator();
                while (it2.hasNext()) {
                    arrayList11.add(((wa.b) it2.next()).f());
                }
                return arrayList11;
            case 15:
                ka.d dVar = (ka.d) obj2;
                ka.q qVar = dVar.f7407c;
                Collection collectionValues = ((Map) k9.a.z(qVar.f7471i, ka.q.f7468m[0])).values();
                ArrayList arrayList12 = new ArrayList();
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    lb.p pVarA = ((ja.a) dVar.f7406b.f3847b).f6967d.a(qVar, (ca.c) it3.next());
                    if (pVarA != null) {
                        arrayList12.add(pVarA);
                    }
                }
                return (gb.o[]) n4.h.S(arrayList12).toArray(new gb.o[0]);
            case 16:
                HashSet hashSet2 = new HashSet();
                lb.h hVar3 = (lb.h) ((da.a) obj2).f3850e;
                ka.h hVar4 = hVar3.f8323n;
                jb.k kVar = hVar3.f8321l;
                ra.k kVar2 = hVar3.f8315e;
                Iterator it4 = hVar4.m().iterator();
                while (it4.hasNext()) {
                    for (x9.k kVar3 : g5.a.I(((nb.w) it4.next()).U(), null, 3)) {
                        if ((kVar3 instanceof s0) || (kVar3 instanceof x9.k0)) {
                            hashSet2.add(((x9.c) kVar3).getName());
                        }
                    }
                }
                List list4 = kVar2.f12051q;
                i9.l.d(list4, "getFunctionList(...)");
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    hashSet2.add(i2.c.G(kVar.f7044b, ((ra.a0) it5.next()).f11807f));
                }
                List list5 = kVar2.f12052r;
                i9.l.d(list5, "getPropertyList(...)");
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    hashSet2.add(i2.c.G(kVar.f7044b, ((ra.i0) it6.next()).f12011f));
                }
                return u8.f0.g0(hashSet2, hashSet2);
            case 17:
                lb.o oVar = (lb.o) obj2;
                Set setN = oVar.n();
                if (setN == null) {
                    return null;
                }
                return u8.f0.g0(u8.f0.g0(oVar.m(), oVar.f8353c.f8344c.keySet()), setN);
            case 18:
                lb.t tVar3 = (lb.t) obj2;
                jb.k kVar4 = tVar3.k;
                return u8.p.J0(kVar4.f7043a.f7022e.f(tVar3.f8367l, kVar4.f7044b));
            case 19:
                return new nb.e(((nb.f) obj2).b());
            case 20:
                return nb.c.w((x9.r0) ((nb.f0) obj2).f8990b);
            case 21:
                return pb.l.c(pb.k.CANNOT_COMPUTE_ERASED_BOUND, ((android.support.v4.media.session.r) obj2).toString());
            case 22:
                h9.a aVar4 = ((ob.j) obj2).f9649b;
                if (aVar4 != null) {
                    return (List) aVar4.invoke();
                }
                return null;
            case 23:
                return q1.a(((r9.e0) obj2).a());
            case 24:
                return new r9.h0((r9.i0) obj2);
            case 25:
                return new r9.j0((r9.k0) obj2);
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return new r9.l0((r9.m0) obj2);
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                List upperBounds = ((o1) obj2).f11736a.getUpperBounds();
                i9.l.d(upperBounds, "getUpperBounds(...)");
                ArrayList arrayList13 = new ArrayList(u8.q.a0(upperBounds, 10));
                Iterator it7 = upperBounds.iterator();
                while (it7.hasNext()) {
                    arrayList13.add(new n1((nb.w) it7.next(), null));
                }
                return arrayList13;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                for (Map.Entry entry4 : ((Map) obj2).entrySet()) {
                    String str = (String) entry4.getKey();
                    Object value = entry4.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            default:
                w9.i iVar3 = (w9.i) obj2;
                g0 g0Var = iVar3.f14203f;
                if (g0Var == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                w9.h hVar5 = (w9.h) g0Var.invoke();
                iVar3.f14203f = null;
                return hVar5;
        }
    }
}
