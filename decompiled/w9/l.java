package w9;

import aa.h0;
import aa.s;
import aa.s0;
import aa.y0;
import i9.r;
import i9.y;
import i9.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l0.o0;
import nb.a0;
import nb.p0;
import nb.r0;
import o9.u;
import u8.p;
import u8.q;
import u8.w;
import x9.t;
import x9.v;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements z9.b, z9.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f14213h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f14214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.i f14215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f14216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f14217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.e f14218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mb.i f14219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mb.e f14220g;

    static {
        r rVar = new r(l.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        z zVar = y.f6689a;
        f14213h = new u[]{zVar.g(rVar), ob.a.v(l.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, zVar), ob.a.v(l.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, zVar)};
    }

    public l(h0 h0Var, mb.k kVar, aa.e eVar) {
        this.f14214a = h0Var;
        this.f14215b = new mb.i(kVar, eVar);
        aa.o oVar = new aa.o(new s(h0Var, new wa.c("java.io"), 1), wa.e.e("Serializable"), x.f14750e, x9.f.f14702b, n3.l.I(new nb.y(kVar, new j(this, 1))), kVar);
        oVar.B0(gb.n.f6198b, u8.y.f13124a, null);
        this.f14216c = oVar.n();
        this.f14217d = new mb.i(kVar, new aa.j(19, this, kVar));
        this.f14218e = new mb.e(kVar, new ConcurrentHashMap(3, 1.0f, 2), new mb.f(), 0);
        this.f14219f = new mb.i(kVar, new j(this, 0));
        this.f14220g = kVar.b(new aa.a(28, this));
    }

    @Override // z9.d
    public final boolean a(x9.e eVar, lb.r rVar) {
        i9.l.e(eVar, "classDescriptor");
        ka.j jVarF = f(eVar);
        if (jVarF == null || !rVar.getAnnotations().i(z9.e.f15788a)) {
            return true;
        }
        g().getClass();
        String strY = n3.n.Y(rVar, 3);
        ka.o oVarB0 = jVarF.B0();
        wa.e name = rVar.getName();
        i9.l.d(name, "getName(...)");
        Collection collectionF = oVarB0.f(name, fa.b.f5502a);
        if ((collectionF instanceof Collection) && collectionF.isEmpty()) {
            return false;
        }
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            if (i9.l.a(n3.n.Y((s0) it.next(), 3), strY)) {
                return true;
            }
        }
        return false;
    }

    @Override // z9.b
    public final Collection b(x9.e eVar) {
        x9.e eVarB;
        if (eVar.f() == x9.f.f14701a) {
            g().getClass();
            ka.j jVarF = f(eVar);
            if (jVarF != null && (eVarB = e.b(db.e.g(jVarF), b.f14173f)) != null) {
                r0 r0Var = new r0(n3.r.t(eVarB, jVarF));
                List list = (List) jVarF.f7438q.f7461q.invoke();
                ArrayList<aa.m> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    aa.m mVar = (aa.m) next;
                    aa.m mVar2 = mVar;
                    if (mVar2.d().f6101a.f8640b) {
                        Collection collectionW = eVarB.w();
                        i9.l.d(collectionW, "getConstructors(...)");
                        Collection collection = collectionW;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    aa.m mVar3 = (aa.m) it2.next();
                                    i9.l.b(mVar3);
                                    if (za.j.j(mVar3, mVar.e(r0Var)) == 1) {
                                    }
                                }
                            }
                        }
                        if (mVar2.X().size() == 1) {
                            List listX = mVar2.X();
                            i9.l.d(listX, "getValueParameters(...)");
                            x9.h hVarL = ((y0) p.A0(listX)).getType().D0().l();
                            if (i9.l.a(hVarL != null ? db.e.h(hVarL) : null, db.e.h(eVar))) {
                            }
                        }
                        if (!u9.i.D(mVar) && !o.f14232f.contains(n3.l.W(jVarF, n3.n.Y(mVar, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(q.a0(arrayList, 10));
                for (aa.m mVar4 : arrayList) {
                    aa.m mVar5 = mVar4;
                    mVar5.getClass();
                    aa.y yVarI0 = mVar5.I0(r0.f9028b);
                    yVarI0.f449b = eVar;
                    yVarI0.e(eVar.n());
                    yVarI0.f461o = true;
                    p0 p0VarF = r0Var.f();
                    if (p0VarF == null) {
                        aa.y.a(37);
                        throw null;
                    }
                    yVarI0.f448a = p0VarF;
                    if (!o.f14233g.contains(n3.l.W(jVarF, n3.n.Y(mVar4, 3)))) {
                        yVarI0.c((y9.h) k9.a.z(this.f14219f, f14213h[2]));
                    }
                    aa.z zVarF0 = yVarI0.f470x.F0(yVarI0);
                    i9.l.c(zVarF0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((aa.m) zVarF0);
                }
                return arrayList2;
            }
        }
        return w.f13122a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x0221  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223  */
    /* JADX WARN: Code duplicated, block: B:82:0x023d  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x01ba, please report this as an issue */
    @Override // z9.b
    public final Collection c(wa.e eVar, x9.e eVar2) throws Throwable {
        Throwable th;
        Set setW;
        Object obj;
        x9.k kVarL;
        boolean zBooleanValue;
        boolean z10;
        Object obj2;
        y9.h hVar;
        i9.l.e(eVar, "name");
        i9.l.e(eVar2, "classDescriptor");
        boolean zEquals = eVar.equals(a.f14172e);
        fa.b bVar = fa.b.f5502a;
        u[] uVarArr = f14213h;
        List<s0> list = w.f13122a;
        if (zEquals && (eVar2 instanceof lb.h) && (u9.i.b(eVar2, u9.n.f13177g) || u9.i.s(eVar2) != null)) {
            lb.h hVar2 = (lb.h) eVar2;
            List list2 = hVar2.f8315e.f12051q;
            i9.l.d(list2, "getFunctionList(...)");
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (i2.c.G(hVar2.f8321l.f7044b, ((ra.a0) it.next()).f11807f).equals(a.f14172e)) {
                        return list;
                    }
                }
            }
            x9.s sVarS0 = ((s0) p.z0(((a0) k9.a.z(this.f14217d, uVarArr[1])).U().f(eVar, bVar))).s0();
            sVarS0.j(hVar2);
            sVarS0.m(x9.o.f14721e);
            sVarS0.e(hVar2.n());
            sVarS0.x(hVar2.A0());
            t tVarBuild = sVarS0.build();
            i9.l.b(tVarBuild);
            return n3.l.I((s0) tVarBuild);
        }
        g().getClass();
        ka.j jVarF = f(eVar2);
        if (jVarF == null) {
            th = null;
        } else {
            wa.c cVarG = db.e.g(jVarF);
            b bVar2 = b.f14173f;
            i9.l.e(bVar2, "builtIns");
            x9.e eVarB = e.b(cVarG, bVar2);
            if (eVarB == null) {
                setW = u8.y.f13124a;
                th = null;
            } else {
                String str = d.f14177a;
                th = null;
                wa.c cVar = (wa.c) d.k.get(db.e.h(eVarB));
                setW = cVar == null ? n3.r.W(eVarB) : n3.l.J(eVarB, bVar2.j(cVar));
            }
            Iterable iterable = setW;
            if (iterable instanceof List) {
                List list3 = (List) iterable;
                if (list3.isEmpty()) {
                    obj = th;
                } else {
                    obj = list3.get(list3.size() - 1);
                }
            } else {
                Iterator it2 = iterable.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                } else {
                    obj = th;
                }
            }
            x9.e eVar3 = (x9.e) obj;
            if (eVar3 != null) {
                int i7 = wb.i.f14296c;
                ArrayList arrayList = new ArrayList(q.a0(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(db.e.g((x9.e) it3.next()));
                }
                wb.i iVar = new wb.i(0);
                iVar.addAll(arrayList);
                String str2 = d.f14177a;
                boolean zContainsKey = d.f14186j.containsKey(za.d.g(eVar2));
                wa.c cVarG2 = db.e.g(jVarF);
                aa.j jVar = new aa.j(20, jVarF, eVar3);
                mb.e eVar4 = this.f14218e;
                eVar4.getClass();
                Object objInvoke = eVar4.invoke(new mb.g(cVarG2, jVar));
                if (objInvoke == null) {
                    mb.e.e(3);
                    throw th;
                }
                gb.o oVarT0 = ((x9.e) objInvoke).t0();
                i9.l.d(oVarT0, "getUnsubstitutedMemberScope(...)");
                Collection collectionF = oVarT0.f(eVar, bVar);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : collectionF) {
                    s0 s0Var = (s0) obj3;
                    if (s0Var.f() == 1 && s0Var.d().f6101a.f8640b && !u9.i.D(s0Var)) {
                        Collection collectionM = s0Var.m();
                        if ((collectionM instanceof Collection) && collectionM.isEmpty()) {
                            kVarL = s0Var.l();
                            i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (o.f14231e.contains(n3.l.W((x9.e) kVarL, n3.n.Y(s0Var, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolH = wb.l.h(n3.l.I(s0Var), e.f14190a, new f(this));
                                i9.l.d(boolH, "ifAny(...)");
                                zBooleanValue = boolH.booleanValue();
                            }
                            if (zBooleanValue) {
                            }
                        } else {
                            Iterator it4 = collectionM.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    x9.k kVarL2 = ((t) it4.next()).l();
                                    i9.l.d(kVarL2, "getContainingDeclaration(...)");
                                    if (iVar.contains(db.e.g(kVarL2))) {
                                    }
                                } else {
                                    kVarL = s0Var.l();
                                    i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (o.f14231e.contains(n3.l.W((x9.e) kVarL, n3.n.Y(s0Var, 3))) ^ zContainsKey) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolH2 = wb.l.h(n3.l.I(s0Var), e.f14190a, new f(this));
                                        i9.l.d(boolH2, "ifAny(...)");
                                        zBooleanValue = boolH2.booleanValue();
                                    }
                                    z10 = zBooleanValue ? false : true;
                                }
                            }
                        }
                    }
                    if (z10) {
                        arrayList2.add(obj3);
                    }
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (s0 s0Var2 : list) {
            x9.k kVarL3 = s0Var2.l();
            i9.l.c(kVarL3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            t tVarE = s0Var2.e(new r0(n3.r.t((x9.e) kVarL3, eVar2)));
            i9.l.c(tVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            x9.s sVarS1 = ((s0) tVarE).s0();
            sVarS1.j(eVar2);
            sVarS1.x(eVar2.A0());
            sVarS1.n();
            x9.k kVarL4 = s0Var2.l();
            i9.l.c(kVarL4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objF = wb.l.f(n3.l.I((x9.e) kVarL4), new o0(29, this), new db.d(n3.n.Y(s0Var2, 3), new i9.x(), 1));
            i9.l.d(objF, "dfs(...)");
            int iOrdinal = ((k) objF).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        wa.e name = s0Var2.getName();
                        boolean zA = i9.l.a(name, m.f14221a);
                        mb.e eVar5 = this.f14220g;
                        if (zA) {
                            hVar = (y9.h) eVar5.invoke(new t8.j(s0Var2.getName().b(), "first"));
                        } else {
                            if (!i9.l.a(name, m.f14222b)) {
                                throw new IllegalStateException(("Unexpected name: " + s0Var2.getName()).toString());
                            }
                            hVar = (y9.h) eVar5.invoke(new t8.j(s0Var2.getName().b(), "last"));
                        }
                        sVarS1.c(hVar);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new cc.s();
                        }
                        obj2 = th;
                    } else {
                        sVarS1.c((y9.h) k9.a.z(this.f14219f, uVarArr[2]));
                    }
                }
                Object objBuild = sVarS1.build();
                i9.l.b(objBuild);
                obj2 = (s0) objBuild;
            } else if (eVar2.i() == x.f14747b && eVar2.f() != x9.f.f14703c) {
                obj2 = th;
            } else {
                sVarS1.u();
                Object objBuild2 = sVarS1.build();
                i9.l.b(objBuild2);
                obj2 = (s0) objBuild2;
            }
            if (obj2 != null) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    @Override // z9.b
    public final Collection d(x9.e eVar) {
        wa.d dVarH = db.e.h(eVar);
        LinkedHashSet linkedHashSet = o.f14227a;
        wa.d dVar = u9.n.f13177g;
        boolean zEquals = dVarH.equals(dVar);
        boolean zIsAssignableFrom = false;
        a0 a0Var = this.f14216c;
        if (!zEquals) {
            HashMap map = u9.n.f13178g0;
            if (map.get(dVarH) == null) {
                if (dVarH.equals(dVar) || map.get(dVarH) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = d.f14177a;
                    wa.b bVarF = d.f(dVarH);
                    if (bVarF != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.a().f14240a.f14243a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? n3.l.I(a0Var) : w.f13122a;
            }
        }
        return n3.l.J((a0) k9.a.z(this.f14217d, f14213h[1]), a0Var);
    }

    @Override // z9.b
    public final Collection e(x9.e eVar) {
        Set setC;
        i9.l.e(eVar, "classDescriptor");
        g().getClass();
        ka.j jVarF = f(eVar);
        if (jVarF == null || (setC = jVarF.B0().c()) == null) {
            setC = u8.y.f13124a;
        }
        return setC;
    }

    public final ka.j f(x9.e eVar) {
        wa.c cVarA;
        if (eVar == null) {
            u9.i.a(108);
            throw null;
        }
        if (!u9.i.b(eVar, u9.n.f13166a) && u9.i.J(eVar)) {
            wa.d dVarH = db.e.h(eVar);
            if (dVarH.d()) {
                String str = d.f14177a;
                wa.b bVarF = d.f(dVarH);
                if (bVarF != null && (cVarA = bVarF.a()) != null) {
                    x9.e eVarJ = v.j(g().f14201a, cVarA);
                    if (eVarJ instanceof ka.j) {
                        return (ka.j) eVarJ;
                    }
                }
            }
        }
        return null;
    }

    public final h g() {
        return (h) k9.a.z(this.f14215b, f14213h[0]);
    }
}
