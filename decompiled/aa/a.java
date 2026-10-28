package aa;

import android.view.KeyEvent;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.b1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.s1;
import o2.d1;
import p.i3;
import ra.f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f309b;

    public /* synthetic */ a() {
        this.f308a = 14;
    }

    public /* synthetic */ a(int i7, Object obj) {
        this.f308a = i7;
        this.f309b = obj;
    }

    public a(x9.e eVar, la.f fVar, nb.a0 a0Var, la.a aVar) {
        this.f308a = 20;
        this.f309b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x069d  */
    /* JADX WARN: Code duplicated, block: B:233:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:236:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:282:0x0779  */
    /* JADX WARN: Code duplicated, block: B:284:0x0794  */
    /* JADX WARN: Code duplicated, block: B:285:0x0797  */
    /* JADX WARN: Code duplicated, block: B:357:0x096a  */
    /* JADX WARN: Code duplicated, block: B:363:0x0985  */
    /* JADX WARN: Code duplicated, block: B:380:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, t8.h] */
    @Override // h9.k
    public final Object invoke(Object obj) throws InvocationTargetException {
        boolean z10;
        boolean z11;
        boolean zEquals;
        Object next;
        Object next2;
        x9.d0 d0Var;
        f1 f1Var;
        ta.g gVar;
        jb.k kVarA;
        x9.d0 d0Var2;
        boolean z12;
        boolean z13;
        boolean zIsEmpty;
        wa.c cVarC;
        nb.n0 n0VarA;
        nb.k0 k0VarW0;
        int i7 = this.f308a;
        t8.z zVar = t8.z.f12851a;
        nb.v vVar = null;
        boolean z14 = false;
        Object[] objArr = 0;
        int i10 = 1;
        switch (i7) {
            case 0:
                b bVar = (b) this.f309b;
                ((ob.g) obj).getClass();
                return (nb.a0) bVar.f314b.f318b.invoke();
            case 1:
                h hVar = (h) this.f309b;
                nb.w0 w0Var = (nb.w0) obj;
                i9.l.b(w0Var);
                if (nb.c.j(w0Var)) {
                    z10 = false;
                } else {
                    x9.h hVarL = w0Var.D0().l();
                    if (!(hVarL instanceof x9.r0) || i9.l.a(((x9.r0) hVarL).l(), hVar)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 2:
                h0 h0Var = (h0) this.f309b;
                wa.c cVar = (wa.c) obj;
                i9.l.e(cVar, "fqName");
                m0 m0Var = h0Var.f346f;
                mb.k kVar = h0Var.f343c;
                ((l0) m0Var).getClass();
                i9.l.e(kVar, "storageManager");
                return new c0(h0Var, cVar, kVar);
            case 3:
                u9.k kVar2 = (u9.k) this.f309b;
                x9.y yVar = (x9.y) obj;
                i9.l.e(yVar, "it");
                return yVar.k().r(kVar2);
            case 4:
                nb.w wVar = (nb.w) this.f309b;
                i9.l.e((x9.y) obj, "it");
                return wVar;
            case 5:
                da.o oVar = (da.o) this.f309b;
                Method method = (Method) obj;
                if (method.isSynthetic()) {
                    z11 = false;
                } else {
                    if (oVar.f3881a.isEnum()) {
                        String name = method.getName();
                        if (i9.l.a(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            i9.l.d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (i9.l.a(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (zEquals) {
                            z11 = false;
                        }
                    }
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 6:
                KeyEvent keyEvent = ((i2.b) obj).f6600a;
                i9.l.e(keyEvent, "event");
                ((b1) this.f309b).setValue(String.valueOf(keyEvent.getKeyCode()));
                return Boolean.TRUE;
            case 7:
                s0 s0Var = (s0) this.f309b;
                i9.l.e((x9.c) obj, "it");
                return Boolean.valueOf(ga.h0.f6090i.containsKey(n3.n.Z(s0Var)));
            case 8:
                u0.k kVar3 = (u0.k) this.f309b;
                wa.c cVar2 = (wa.c) obj;
                i9.l.b(cVar2);
                ?? r8 = kVar3.f12991c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r8.entrySet()) {
                    wa.c cVar3 = (wa.c) entry.getKey();
                    if (!cVar2.equals(cVar3)) {
                        i9.l.e(cVar3, "packageName");
                        if (i9.l.a(cVar2.f14240a.c() ? null : cVar2.b(), cVar3)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int length = n3.l.X((wa.c) ((Map.Entry) next).getKey(), cVar2).f14240a.f14243a.length();
                        do {
                            Object next3 = it.next();
                            int length2 = n3.l.X((wa.c) ((Map.Entry) next3).getKey(), cVar2).f14240a.f14243a.length();
                            if (length > length2) {
                                next = next3;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 9:
                x9.c cVar4 = (x9.c) obj;
                if (cVar4 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((ha.a) this.f309b).f6465c.a(cVar4);
                return zVar;
            case 10:
                ja.c cVar5 = (ja.c) this.f309b;
                da.e eVar = (da.e) obj;
                i9.l.e(eVar, "annotation");
                wa.e eVar2 = ha.c.f6473a;
                return ha.c.b(cVar5.f6989a, eVar, cVar5.f6991c);
            case 11:
                ja.e eVar3 = (ja.e) this.f309b;
                da.c0 c0Var = (da.c0) obj;
                i9.l.e(c0Var, "typeParameter");
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) eVar3.f6999e;
                x9.l lVar = (x9.l) eVar3.f6998d;
                Integer num = (Integer) linkedHashMap2.get(c0Var);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                da.a aVar = (da.a) eVar3.f6997c;
                i9.l.e(aVar, "<this>");
                return new ka.f0(a.a.v(new da.a((ja.a) aVar.f3847b, eVar3, (t8.h) aVar.f3849d), lVar.getAnnotations()), c0Var, eVar3.f6996b + iIntValue, lVar);
            case 12:
                w9.n nVar = (w9.n) this.f309b;
                wa.c cVar6 = (wa.c) obj;
                i9.l.e(cVar6, "fqName");
                kb.c cVarC2 = nVar.c(cVar6);
                if (cVarC2 == null) {
                    return null;
                }
                jb.i iVar = nVar.f14225c;
                if (iVar != null) {
                    cVarC2.D0(iVar);
                    return cVarC2;
                }
                i9.l.j("components");
                throw null;
            case 13:
                jb.g gVar2 = (jb.g) this.f309b;
                jb.f fVar = (jb.f) obj;
                i9.l.e(fVar, "key");
                wa.b bVar2 = fVar.f7012a;
                jb.i iVar2 = gVar2.f7015a;
                Iterator it2 = iVar2.k.iterator();
                while (it2.hasNext()) {
                    x9.e eVarC = ((z9.c) it2.next()).c(bVar2);
                    if (eVarC != null) {
                        return eVarC;
                    }
                }
                if (jb.g.f7014c.contains(bVar2)) {
                    return null;
                }
                jb.d dVarJ = fVar.f7013b;
                if (dVarJ == null && (dVarJ = iVar2.f7021d.j(bVar2)) == null) {
                    return null;
                }
                ta.f fVar2 = dVarJ.f7007a;
                ra.k kVar4 = dVarJ.f7008b;
                ta.a aVar2 = dVarJ.f7009c;
                x9.n0 n0Var = dVarJ.f7010d;
                wa.b bVarE = bVar2.e();
                if (bVarE != null) {
                    x9.e eVarA = gVar2.a(bVarE, null);
                    lb.h hVar2 = eVarA instanceof lb.h ? (lb.h) eVarA : null;
                    if (hVar2 == null || !hVar2.B0().m().contains(bVar2.f())) {
                        return null;
                    }
                    kVarA = hVar2.f8321l;
                } else {
                    Iterator it3 = x9.v.i(iVar2.f7023f, bVar2.f14236a).iterator();
                    do {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            d0Var2 = (x9.d0) next2;
                            if (d0Var2 instanceof kb.c) {
                            }
                        } else {
                            next2 = null;
                        }
                        d0Var = (x9.d0) next2;
                        if (d0Var == null) {
                            return null;
                        }
                        ra.y0 y0Var = kVar4.E;
                        i9.l.d(y0Var, "getTypeTable(...)");
                        f0 f0Var = new f0(y0Var);
                        f1Var = kVar4.G;
                        i9.l.d(f1Var, "getVersionRequirementTable(...)");
                        if (f1Var.f11942b.size() == 0) {
                            gVar = ta.g.f12888a;
                        } else {
                            i9.l.d(f1Var.f11942b, "getRequirementList(...)");
                            gVar = new ta.g();
                        }
                        kVarA = iVar2.a(d0Var, fVar2, f0Var, gVar, aVar2, null);
                        fVar2 = fVar2;
                    } while (!((lb.o) ((kb.c) d0Var2).U()).m().contains(bVar2.f()));
                    d0Var = (x9.d0) next2;
                    if (d0Var == null) {
                        return null;
                    }
                    ra.y0 y0Var2 = kVar4.E;
                    i9.l.d(y0Var2, "getTypeTable(...)");
                    f0 f0Var2 = new f0(y0Var2);
                    f1Var = kVar4.G;
                    i9.l.d(f1Var, "getVersionRequirementTable(...)");
                    if (f1Var.f11942b.size() == 0) {
                        gVar = ta.g.f12888a;
                    } else {
                        i9.l.d(f1Var.f11942b, "getRequirementList(...)");
                        gVar = new ta.g();
                    }
                    kVarA = iVar2.a(d0Var, fVar2, f0Var2, gVar, aVar2, null);
                    fVar2 = fVar2;
                }
                return new lb.h(kVarA, kVar4, fVar2, aVar2, n0Var);
            case 14:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                k2.c0 c0Var2 = (k2.c0) this.f309b;
                if (c0Var2 != null) {
                    c0Var2.f7195c = zBooleanValue;
                }
                return zVar;
            case 15:
                ka.a aVar3 = (ka.a) this.f309b;
                da.x xVar = (da.x) obj;
                i9.l.e(xVar, "m");
                if (((Boolean) aVar3.f7384b.invoke(xVar)).booleanValue()) {
                    Class<?> declaringClass = ((Method) xVar.b()).getDeclaringClass();
                    i9.l.d(declaringClass, "getDeclaringClass(...)");
                    if (declaringClass.isInterface()) {
                        String strB = xVar.c().b();
                        int iHashCode = strB.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) xVar.g()).isEmpty();
                                }
                            } else if (strB.equals("equals")) {
                                da.d0 d0Var3 = (da.d0) u8.p.C0(xVar.g());
                                da.b0 b0Var = d0Var3 != null ? d0Var3.f3864a : null;
                                da.q qVar = b0Var instanceof da.q ? (da.q) b0Var : null;
                                if (qVar != null) {
                                    da.s sVar = qVar.f3884b;
                                    if ((sVar instanceof da.o) && (cVarC = ((da.o) sVar).c()) != null && i9.l.a(cVarC.f14240a.f14243a, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB.equals("toString")) {
                            zIsEmpty = ((ArrayList) xVar.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 16:
                ka.j jVar = (ka.j) this.f309b;
                i9.l.e((ob.g) obj, "it");
                return new ka.o(jVar.f7432j, jVar, jVar.f7430h, jVar.f7431i != null, jVar.f7438q);
            case 17:
                wa.e eVar4 = (wa.e) this.f309b;
                gb.o oVar2 = (gb.o) obj;
                i9.l.e(oVar2, "it");
                return oVar2.b(eVar4, fa.b.f5506e);
            case 18:
                o2.w wVar2 = (o2.w) obj;
                s1 s1VarD = ((l0.u0) this.f309b).d();
                if (s1VarD != null) {
                    s1VarD.f7830c = wVar2;
                }
                return zVar;
            case 19:
                float[] fArr = ((y1.a0) obj).f14874a;
                o2.w wVar3 = (o2.w) this.f309b;
                if (wVar3.isAttached()) {
                    d1.g(wVar3).e(wVar3, fArr);
                }
                return zVar;
            case 20:
                x9.e eVar5 = (x9.e) this.f309b;
                i9.l.e((ob.g) obj, "kotlinTypeRefiner");
                db.e.f(eVar5);
                return null;
            case 21:
                nb.f fVar3 = (nb.f) this.f309b;
                nb.e eVar6 = (nb.e) obj;
                i9.l.e(eVar6, "supertypes");
                x9.o0 o0VarD = fVar3.d();
                Collection collection = eVar6.f8984a;
                o0VarD.getClass();
                i9.l.e(collection, "superTypes");
                if (collection.isEmpty()) {
                    nb.w wVarC = fVar3.c();
                    List listI = wVarC != null ? n3.l.I(wVarC) : null;
                    if (listI == null) {
                        listI = u8.w.f13122a;
                    }
                    collection = listI;
                }
                List listJ0 = collection instanceof List ? (List) collection : null;
                if (listJ0 == null) {
                    listJ0 = u8.p.J0(collection);
                }
                List listG = fVar3.g(listJ0);
                i9.l.e(listG, "<set-?>");
                eVar6.f8985b = listG;
                return zVar;
            case 22:
                nb.v vVar2 = (nb.v) this.f309b;
                ob.g gVar3 = (ob.g) obj;
                i9.l.e(gVar3, "kotlinTypeRefiner");
                LinkedHashSet linkedHashSet = vVar2.f9046b;
                ArrayList arrayList = new ArrayList(u8.q.a0(linkedHashSet, 10));
                Iterator it4 = linkedHashSet.iterator();
                boolean z15 = false;
                while (it4.hasNext()) {
                    arrayList.add(((nb.w) it4.next()).F0(gVar3));
                    z15 = true;
                }
                if (z15) {
                    nb.w wVar4 = vVar2.f9045a;
                    nb.w wVarF0 = wVar4 != null ? wVar4.F0(gVar3) : null;
                    arrayList.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                    linkedHashSet2.hashCode();
                    nb.v vVar3 = new nb.v(linkedHashSet2);
                    vVar3.f9045a = wVarF0;
                    vVar = vVar3;
                }
                if (vVar != null) {
                    vVar2 = vVar;
                }
                return vVar2.b();
            case 23:
                android.support.v4.media.session.r rVar = (android.support.v4.media.session.r) this.f309b;
                nb.m0 m0Var2 = (nb.m0) obj;
                x9.r0 r0Var = m0Var2.f9018a;
                la.a aVar4 = m0Var2.f9019b;
                Set set = aVar4.f8287e;
                if (set != null && set.contains(r0Var.a())) {
                    return rVar.y(aVar4);
                }
                nb.a0 a0VarN = r0Var.n();
                i9.l.d(a0VarN, "getDefaultType(...)");
                LinkedHashSet<x9.r0> linkedHashSet3 = new LinkedHashSet();
                n3.n.f0(a0VarN, a0VarN, linkedHashSet3, set);
                int iS0 = u8.c0.S0(u8.q.a0(linkedHashSet3, 10));
                if (iS0 < 16) {
                    iS0 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS0);
                for (x9.r0 r0Var2 : linkedHashSet3) {
                    if (set == null || !set.contains(r0Var2)) {
                        Set set2 = aVar4.f8287e;
                        n0VarA = la.e.a(r0Var2, aVar4, rVar, rVar.A(r0Var2, la.a.a(aVar4, null, false, set2 != null ? u8.f0.h0(set2, r0Var) : n3.r.W(r0Var), null, 47)));
                    } else {
                        n0VarA = nb.u0.k(r0Var2, aVar4);
                    }
                    linkedHashMap3.put(r0Var2.t(), n0VarA);
                }
                nb.r0 r0Var3 = new nb.r0(new nb.g0(i10, linkedHashMap3));
                List upperBounds = r0Var.getUpperBounds();
                i9.l.d(upperBounds, "getUpperBounds(...)");
                v8.g gVarM = rVar.M(r0Var3, upperBounds, aVar4);
                if (gVarM.f13683a.isEmpty()) {
                    return rVar.y(aVar4);
                }
                if (gVarM.f13683a.f13676i == 1) {
                    return (nb.w) u8.p.z0(gVarM);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 24:
                oa.r rVar2 = (oa.r) this.f309b;
                ob.f fVar4 = ob.f.f9639b;
                oa.a aVar5 = (oa.a) obj;
                i9.l.e(aVar5, "it");
                ga.v vVar4 = aVar5.f9576b;
                qb.d dVar = aVar5.f9575a;
                if (rVar2.f9623c && dVar != null) {
                    i9.l.e(dVar, "$receiver");
                    if (!(dVar instanceof nb.w)) {
                        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb2.append(dVar);
                        sb2.append(", ");
                        throw new IllegalArgumentException(ob.a.p(i9.y.f6689a, dVar.getClass(), sb2).toString());
                    }
                    if (dVar instanceof la.h) {
                        return null;
                    }
                }
                if (dVar == null || (k0VarW0 = fVar4.w0(dVar)) == null) {
                    return null;
                }
                if (!(k0VarW0 instanceof nb.k0)) {
                    StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb3.append(k0VarW0);
                    sb3.append(", ");
                    throw new IllegalArgumentException(ob.a.p(i9.y.f6689a, k0VarW0.getClass(), sb3).toString());
                }
                List listN = k0VarW0.n();
                i9.l.d(listN, "getParameters(...)");
                i9.l.e(dVar, "$receiver");
                if (!(dVar instanceof nb.w)) {
                    StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb4.append(dVar);
                    sb4.append(", ");
                    throw new IllegalArgumentException(ob.a.p(i9.y.f6689a, dVar.getClass(), sb4).toString());
                }
                List listB0 = ((nb.w) dVar).B0();
                Iterator it5 = listN.iterator();
                Iterator it6 = listB0.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(u8.q.a0(listN, 10), u8.q.a0(listB0, 10)));
                while (it5.hasNext() && it6.hasNext()) {
                    x9.r0 r0Var4 = (x9.r0) it5.next();
                    nb.w0 w0VarR = ob.h.r(fVar4, (nb.n0) it6.next());
                    arrayList2.add(w0VarR == null ? new oa.a(null, vVar4, r0Var4) : new oa.a(w0VarR, ((ja.a) ((da.a) rVar2.f9625e).f3847b).f6979q.b(vVar4, w0VarR.getAnnotations()), r0Var4));
                }
                return arrayList2;
            case 25:
                y0 y0Var3 = (y0) this.f309b;
                x9.c cVar7 = (x9.c) obj;
                i9.l.e(cVar7, "it");
                nb.w type = ((y0) cVar7.X().get(y0Var3.f471f)).getType();
                i9.l.d(type, "getType(...)");
                return type;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                p.t tVar = (p.t) this.f309b;
                ca.c cVar8 = (ca.c) obj;
                i9.l.e(cVar8, "kotlinClass");
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                u0.k kVar5 = new u0.k(tVar, map, map2);
                Class cls = cVar8.f2576a;
                i9.l.e(cls, "klass");
                i9.b bVarH = i9.l.h(cls.getDeclaredMethods());
                while (true) {
                    String str = "toString(...)";
                    if (!bVarH.hasNext()) {
                        Class cls2 = cls;
                        i9.b bVarH2 = i9.l.h(cls2.getDeclaredConstructors());
                        while (bVarH2.hasNext()) {
                            Constructor constructor = (Constructor) bVarH2.next();
                            wa.e eVar7 = wa.g.f14255e;
                            i9.l.b(constructor);
                            StringBuilder sb5 = new StringBuilder("(");
                            i9.b bVarH3 = i9.l.h(constructor.getParameterTypes());
                            while (bVarH3.hasNext()) {
                                Class cls3 = (Class) bVarH3.next();
                                i9.l.b(cls3);
                                sb5.append(da.d.b(cls3));
                            }
                            sb5.append(")V");
                            String string = sb5.toString();
                            i9.l.d(string, str);
                            da.a aVarJ1 = kVar5.j1(eVar7, string);
                            i9.b bVarH4 = i9.l.h(constructor.getDeclaredAnnotations());
                            while (bVarH4.hasNext()) {
                                Annotation annotation = (Annotation) bVarH4.next();
                                i9.l.b(annotation);
                                k9.a.I(aVarJ1, annotation);
                            }
                            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                            i9.l.b(parameterAnnotations);
                            if (parameterAnnotations.length != 0) {
                                int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                                int length4 = parameterAnnotations.length;
                                for (int i11 = 0; i11 < length4; i11++) {
                                    i9.b bVarH5 = i9.l.h(parameterAnnotations[i11]);
                                    while (bVarH5.hasNext()) {
                                        Annotation annotation2 = (Annotation) bVarH5.next();
                                        i9.b bVar3 = bVarH2;
                                        Class clsL = g5.a.L(g5.a.G(annotation2));
                                        int i12 = length3;
                                        String str2 = str;
                                        Annotation[][] annotationArr = parameterAnnotations;
                                        i3 i3VarH = aVarJ1.H(i11 + i12, da.d.a(clsL), new ca.a(annotation2));
                                        if (i3VarH != null) {
                                            k9.a.J(i3VarH, annotation2, clsL);
                                        }
                                        length3 = i12;
                                        bVarH2 = bVar3;
                                        str = str2;
                                        parameterAnnotations = annotationArr;
                                    }
                                }
                            }
                            i9.b bVar4 = bVarH2;
                            String str3 = str;
                            aVarJ1.b();
                            bVarH2 = bVar4;
                            str = str3;
                        }
                        i9.b bVarH6 = i9.l.h(cls2.getDeclaredFields());
                        while (bVarH6.hasNext()) {
                            Field field = (Field) bVarH6.next();
                            wa.e eVarE = wa.e.e(field.getName());
                            Class<?> type2 = field.getType();
                            i9.l.d(type2, "getType(...)");
                            String strB2 = da.d.b(type2);
                            i9.l.e(strB2, "desc");
                            String strB3 = eVarE.b();
                            i9.l.d(strB3, "asString(...)");
                            pa.p pVar = new pa.p(strB3 + '#' + strB2);
                            ArrayList arrayList3 = new ArrayList();
                            i9.b bVarH7 = i9.l.h(field.getDeclaredAnnotations());
                            while (bVarH7.hasNext()) {
                                Annotation annotation3 = (Annotation) bVarH7.next();
                                i9.l.b(annotation3);
                                Class clsL2 = g5.a.L(g5.a.G(annotation3));
                                i3 i3VarV = ((p.t) kVar5.f12990b).v(da.d.a(clsL2), new ca.a(annotation3), arrayList3);
                                if (i3VarV != null) {
                                    k9.a.J(i3VarV, annotation3, clsL2);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                ((HashMap) kVar5.f12991c).put(pVar, arrayList3);
                            }
                        }
                        return new pa.c(map, map2, map3);
                    }
                    Method method2 = (Method) bVarH.next();
                    wa.e eVarE2 = wa.e.e(method2.getName());
                    StringBuilder sb6 = new StringBuilder("(");
                    i9.b bVarH8 = i9.l.h(method2.getParameterTypes());
                    while (bVarH8.hasNext()) {
                        Class cls4 = (Class) bVarH8.next();
                        i9.l.b(cls4);
                        sb6.append(da.d.b(cls4));
                    }
                    sb6.append(")");
                    Class<?> returnType = method2.getReturnType();
                    i9.l.d(returnType, "getReturnType(...)");
                    sb6.append(da.d.b(returnType));
                    String string2 = sb6.toString();
                    i9.l.d(string2, "toString(...)");
                    da.a aVarJ2 = kVar5.j1(eVarE2, string2);
                    i9.b bVarH9 = i9.l.h(method2.getDeclaredAnnotations());
                    while (bVarH9.hasNext()) {
                        Annotation annotation4 = (Annotation) bVarH9.next();
                        i9.l.b(annotation4);
                        k9.a.I(aVarJ2, annotation4);
                    }
                    Annotation[][] parameterAnnotations2 = method2.getParameterAnnotations();
                    i9.l.d(parameterAnnotations2, "getParameterAnnotations(...)");
                    Annotation[][] annotationArr2 = parameterAnnotations2;
                    int length5 = annotationArr2.length;
                    for (int i13 = 0; i13 < length5; i13++) {
                        i9.b bVarH10 = i9.l.h(annotationArr2[i13]);
                        while (bVarH10.hasNext()) {
                            Annotation annotation5 = (Annotation) bVarH10.next();
                            Class clsL3 = g5.a.L(g5.a.G(annotation5));
                            Class cls5 = cls;
                            i3 i3VarH2 = aVarJ2.H(i13, da.d.a(clsL3), new ca.a(annotation5));
                            if (i3VarH2 != null) {
                                k9.a.J(i3VarH2, annotation5, clsL3);
                            }
                            cls = cls5;
                        }
                    }
                    aVarJ2.b();
                }
                break;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                if (l0.q0.f7799a.a(((i2.b) obj).f6600a) == l0.l0.COPY) {
                    ((w0.w0) this.f309b).c();
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                w9.l lVar2 = (w9.l) this.f309b;
                t8.j jVar2 = (t8.j) obj;
                i9.l.e(jVar2, "<destruct>");
                String str4 = (String) jVar2.f12830a;
                String str5 = (String) jVar2.f12831b;
                List listI2 = n3.l.I(y9.e.a(lVar2.f14214a.f344d, "'" + str4 + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str5 + "()' stdlib extension instead", str5 + "()", "HIDDEN"));
                return listI2.isEmpty() ? y9.g.f15129a : new y9.i(objArr == true ? 1 : 0, listI2);
            default:
                wb.i iVar3 = (wb.i) this.f309b;
                i9.l.b(obj);
                iVar3.add(obj);
                return zVar;
        }
    }
}
