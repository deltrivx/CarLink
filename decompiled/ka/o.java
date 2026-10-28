package ka;

import aa.q0;
import aa.r0;
import aa.s0;
import aa.y0;
import cc.d1;
import ga.h0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nb.n0;
import nb.u0;
import nb.w0;
import x9.k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f7457v = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x9.e f7458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final da.o f7459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mb.i f7461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mb.i f7462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mb.i f7463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mb.i f7464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f1.e f7465u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(da.a aVar, x9.e eVar, da.o oVar, boolean z10, o oVar2) {
        super(aVar, oVar2);
        i9.l.e(aVar, "c");
        i9.l.e(oVar, "jClass");
        this.f7458n = eVar;
        this.f7459o = oVar;
        this.f7460p = z10;
        mb.n nVar = ((ja.a) aVar.f3847b).f6964a;
        k kVar = new k(this, aVar);
        mb.k kVar2 = (mb.k) nVar;
        kVar2.getClass();
        this.f7461q = new mb.i(kVar2, kVar);
        l lVar = new l(this, 0);
        mb.k kVar3 = (mb.k) nVar;
        kVar3.getClass();
        this.f7462r = new mb.i(kVar3, lVar);
        k kVar4 = new k(aVar, this);
        mb.k kVar5 = (mb.k) nVar;
        kVar5.getClass();
        this.f7463s = new mb.i(kVar5, kVar4);
        l lVar2 = new l(this, 1);
        mb.k kVar6 = (mb.k) nVar;
        kVar6.getClass();
        this.f7464t = new mb.i(kVar6, lVar2);
        this.f7465u = ((mb.k) nVar).c(new c8.y(2, this, aVar));
    }

    public static s0 A(s0 s0Var, x9.t tVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return s0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            s0 s0Var2 = (s0) it.next();
            if (!s0Var.equals(s0Var2) && s0Var2.B == null && D(s0Var2, tVar)) {
                x9.t tVarBuild = s0Var.s0().H().build();
                i9.l.b(tVarBuild);
                return (s0) tVarBuild;
            }
        }
        return s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static s0 B(s0 s0Var) {
        wa.c cVarG;
        List listX = s0Var.X();
        i9.l.d(listX, "getValueParameters(...)");
        y0 y0Var = (y0) u8.p.t0(listX);
        if (y0Var != null) {
            x9.h hVarL = y0Var.getType().D0().l();
            if (hVarL != null) {
                wa.d dVarH = db.e.h(hVarL);
                if (!dVarH.d()) {
                    dVarH = null;
                }
                if (dVarH != null) {
                    cVarG = dVarH.g();
                } else {
                    cVarG = null;
                }
            } else {
                cVarG = null;
            }
            if (!i9.l.a(cVarG, u9.o.f13203g)) {
                y0Var = null;
            }
            if (y0Var != null) {
                x9.s sVarS0 = s0Var.s0();
                List listX2 = s0Var.X();
                i9.l.d(listX2, "getValueParameters(...)");
                s0 s0Var2 = (s0) sVarS0.f(u8.p.i0(listX2)).e(((n0) y0Var.getType().B0().get(0)).b()).build();
                if (s0Var2 != null) {
                    s0Var2.f491u = true;
                }
                return s0Var2;
            }
        }
        return null;
    }

    public static boolean D(x9.t tVar, x9.t tVar2) {
        int iB = za.j.f15799c.n(tVar2, tVar, true).b();
        a2.f.O(iB, "getResult(...)");
        return iB == 1 && !a.a.A(tVar2, tVar);
    }

    public static boolean E(s0 s0Var, s0 s0Var2) {
        int i7 = ga.c.f6047l;
        i9.l.e(s0Var, "<this>");
        if (i9.l.a(s0Var.getName().b(), "removeAt") && i9.l.a(n3.n.Z(s0Var), h0.f6088g.f6065e)) {
            s0Var2 = s0Var2.a();
        }
        i9.l.b(s0Var2);
        return D(s0Var2, s0Var);
    }

    public static s0 F(k0 k0Var, String str, h9.k kVar) {
        s0 s0Var;
        Iterator it = ((Iterable) kVar.invoke(wa.e.e(str))).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.X().size() == 0) {
                ob.m mVar = ob.e.f9637a;
                nb.w wVar = s0Var2.f478g;
                if (wVar == null ? false : mVar.b(wVar, k0Var.getType())) {
                    s0Var = s0Var2;
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    public static s0 H(k0 k0Var, h9.k kVar) {
        s0 s0Var;
        nb.w wVar;
        String strB = k0Var.getName().b();
        i9.l.d(strB, "asString(...)");
        Iterator it = ((Iterable) kVar.invoke(wa.e.e(ga.x.b(strB)))).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.X().size() == 1 && (wVar = s0Var2.f478g) != null) {
                wa.e eVar = u9.i.f13141e;
                if (u9.i.E(wVar, u9.n.f13171d)) {
                    ob.m mVar = ob.e.f9637a;
                    List listX = s0Var2.X();
                    i9.l.d(listX, "getValueParameters(...)");
                    if (mVar.a(((y0) u8.p.A0(listX)).getType(), k0Var.getType())) {
                        s0Var = s0Var2;
                    }
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    public static boolean K(s0 s0Var, x9.t tVar) {
        String strY = n3.n.Y(s0Var, 2);
        x9.t tVarA = tVar.a();
        i9.l.d(tVarA, "getOriginal(...)");
        return i9.l.a(strY, n3.n.Y(tVarA, 2)) && !D(s0Var, tVar);
    }

    public final boolean C(k0 k0Var, h9.k kVar) {
        if (i2.c.N(k0Var)) {
            return false;
        }
        s0 s0VarG = G(k0Var, kVar);
        s0 s0VarH = H(k0Var, kVar);
        if (s0VarG == null) {
            return false;
        }
        if (k0Var.d0()) {
            return s0VarH != null && s0VarH.i() == s0VarG.i();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final s0 G(k0 k0Var, h9.k kVar) {
        wa.e eVar;
        q0 q0VarB = k0Var.b();
        String strB = null;
        q0 q0Var = q0VarB != null ? (q0) i2.c.H(q0VarB) : null;
        if (q0Var != null) {
            u9.i.A(q0Var);
            x9.c cVarB = db.e.b(db.e.k(q0Var), ga.d.f6055d);
            if (cVarB != null && (eVar = (wa.e) ga.f.f6071a.get(db.e.g(cVarB))) != null) {
                strB = eVar.b();
            }
        }
        if (strB != null && !i2.c.L(this.f7458n, q0Var)) {
            return F(k0Var, strB, kVar);
        }
        String strB2 = k0Var.getName().b();
        i9.l.d(strB2, "asString(...)");
        return F(k0Var, ga.x.a(strB2), kVar);
    }

    public final LinkedHashSet I(wa.e eVar) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            u8.u.c0(((nb.w) it.next()).U().f(eVar, fa.b.f5506e), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set J(wa.e eVar) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionB = ((nb.w) it.next()).U().b(eVar, fa.b.f5506e);
            ArrayList arrayList2 = new ArrayList(u8.q.a0(collectionB, 10));
            Iterator it2 = collectionB.iterator();
            while (it2.hasNext()) {
                arrayList2.add((k0) it2.next());
            }
            u8.u.c0(arrayList2, arrayList);
        }
        return u8.p.M0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:3: B:54:0x0129->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[LOOP:5: B:72:0x0182->B:119:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01b2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:71:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x0195  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b8  */
    public final boolean L(s0 s0Var) {
        Collection collectionK;
        wa.e eVar;
        wa.e name;
        s0 s0VarB;
        LinkedHashSet<s0> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        x9.t tVarA;
        ArrayList arrayList2;
        s0 s0Var2;
        Iterator it3;
        s0 s0Var3;
        wa.e name2 = s0Var.getName();
        i9.l.d(name2, "getName(...)");
        String strB = name2.b();
        i9.l.d(strB, "asString(...)");
        wa.c cVar = ga.x.f6124a;
        if (zb.q.o0(strB, "get") || zb.q.o0(strB, "is")) {
            wa.e eVarZ = g5.a.Z(name2, "get", null, 12);
            if (eVarZ == null) {
                eVarZ = g5.a.Z(name2, "is", null, 8);
            }
            collectionK = n3.l.K(eVarZ);
        } else if (zb.q.o0(strB, "set")) {
            collectionK = u8.l.v0(new wa.e[]{g5.a.Z(name2, "set", null, 4), g5.a.Z(name2, "set", "is", 4)});
        } else {
            collectionK = (List) ga.f.f6072b.get(name2);
            if (collectionK == null) {
                collectionK = u8.w.f13122a;
            }
        }
        if (collectionK.isEmpty()) {
            ArrayList arrayList3 = h0.f6082a;
            wa.e name3 = s0Var.getName();
            i9.l.d(name3, "getName(...)");
            eVar = (wa.e) h0.k.get(name3);
            if (eVar == null) {
                int i7 = ga.e.f6066l;
                name = s0Var.getName();
                i9.l.d(name, "getName(...)");
                if (!ga.e.b(name)) {
                    s0VarB = B(s0Var);
                    if (s0VarB != null) {
                        wa.e name4 = s0Var.getName();
                        i9.l.d(name4, "getName(...)");
                        linkedHashSetI = I(name4);
                        if (!linkedHashSetI.isEmpty()) {
                            for (s0 s0Var4 : linkedHashSetI) {
                                if (s0Var4.o() || !D(s0VarB, s0Var4)) {
                                }
                            }
                        }
                    }
                    return true;
                }
                wa.e name5 = s0Var.getName();
                i9.l.d(name5, "getName(...)");
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    tVarA = ga.e.a((s0) it.next());
                    if (tVarA != null) {
                        arrayList.add(tVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    s0VarB = B(s0Var);
                    if (s0VarB != null) {
                        wa.e name6 = s0Var.getName();
                        i9.l.d(name6, "getName(...)");
                        linkedHashSetI = I(name6);
                        if (!linkedHashSetI.isEmpty()) {
                            while (r12.hasNext()) {
                                if (s0Var4.o()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(s0Var, (x9.t) it2.next())) {
                    }
                }
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name7 = s0Var.getName();
                    i9.l.d(name7, "getName(...)");
                    linkedHashSetI = I(name7);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(eVar);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI3) {
                s0Var3 = (s0) obj;
                i9.l.e(s0Var3, "<this>");
                if (i2.c.H(s0Var3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i10 = ga.e.f6066l;
                name = s0Var.getName();
                i9.l.d(name, "getName(...)");
                if (!ga.e.b(name)) {
                    s0VarB = B(s0Var);
                    if (s0VarB != null) {
                        wa.e name8 = s0Var.getName();
                        i9.l.d(name8, "getName(...)");
                        linkedHashSetI = I(name8);
                        if (!linkedHashSetI.isEmpty()) {
                            while (r12.hasNext()) {
                                if (s0Var4.o()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                wa.e name9 = s0Var.getName();
                i9.l.d(name9, "getName(...)");
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    tVarA = ga.e.a((s0) it.next());
                    if (tVarA != null) {
                        arrayList.add(tVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    s0VarB = B(s0Var);
                    if (s0VarB != null) {
                        wa.e name10 = s0Var.getName();
                        i9.l.d(name10, "getName(...)");
                        linkedHashSetI = I(name10);
                        if (!linkedHashSetI.isEmpty()) {
                            while (r12.hasNext()) {
                                if (s0Var4.o()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(s0Var, (x9.t) it2.next())) {
                    }
                }
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name11 = s0Var.getName();
                    i9.l.d(name11, "getName(...)");
                    linkedHashSetI = I(name11);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            x9.s sVarS0 = s0Var.s0();
            sVarS0.P(eVar);
            sVarS0.S();
            sVarS0.n();
            x9.t tVarBuild = sVarS0.build();
            i9.l.b(tVarBuild);
            s0Var2 = (s0) tVarBuild;
            if (arrayList2.isEmpty()) {
                int i11 = ga.e.f6066l;
                name = s0Var.getName();
                i9.l.d(name, "getName(...)");
                if (!ga.e.b(name)) {
                    s0VarB = B(s0Var);
                    if (s0VarB != null) {
                        wa.e name12 = s0Var.getName();
                        i9.l.d(name12, "getName(...)");
                        linkedHashSetI = I(name12);
                        if (!linkedHashSetI.isEmpty()) {
                            while (r12.hasNext()) {
                                if (s0Var4.o()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                wa.e name13 = s0Var.getName();
                i9.l.d(name13, "getName(...)");
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    tVarA = ga.e.a((s0) it.next());
                    if (tVarA != null) {
                        arrayList.add(tVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    s0VarB = B(s0Var);
                    if (s0VarB != null) {
                        wa.e name14 = s0Var.getName();
                        i9.l.d(name14, "getName(...)");
                        linkedHashSetI = I(name14);
                        if (!linkedHashSetI.isEmpty()) {
                            while (r12.hasNext()) {
                                if (s0Var4.o()) {
                                }
                            }
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(s0Var, (x9.t) it2.next())) {
                    }
                }
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name15 = s0Var.getName();
                    i9.l.d(name15, "getName(...)");
                    linkedHashSetI = I(name15);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((s0) it3.next(), s0Var2)) {
                }
            }
            int i12 = ga.e.f6066l;
            name = s0Var.getName();
            i9.l.d(name, "getName(...)");
            if (!ga.e.b(name)) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name16 = s0Var.getName();
                    i9.l.d(name16, "getName(...)");
                    linkedHashSetI = I(name16);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            wa.e name17 = s0Var.getName();
            i9.l.d(name17, "getName(...)");
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                tVarA = ga.e.a((s0) it.next());
                if (tVarA != null) {
                    arrayList.add(tVarA);
                }
            }
            if (arrayList.isEmpty()) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name18 = s0Var.getName();
                    i9.l.d(name18, "getName(...)");
                    linkedHashSetI = I(name18);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(s0Var, (x9.t) it2.next())) {
                }
            }
            s0VarB = B(s0Var);
            if (s0VarB != null) {
                wa.e name19 = s0Var.getName();
                i9.l.d(name19, "getName(...)");
                linkedHashSetI = I(name19);
                if (!linkedHashSetI.isEmpty()) {
                    while (r12.hasNext()) {
                        if (s0Var4.o()) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it4 = collectionK.iterator();
        while (it4.hasNext()) {
            Set<k0> setJ = J((wa.e) it4.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (k0 k0Var : setJ) {
                    if (C(k0Var, new c8.y(3, s0Var, this))) {
                        if (!k0Var.d0()) {
                            String strB2 = s0Var.getName().b();
                            i9.l.d(strB2, "asString(...)");
                            if (!zb.q.o0(strB2, "set")) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = h0.f6082a;
        wa.e name20 = s0Var.getName();
        i9.l.d(name20, "getName(...)");
        eVar = (wa.e) h0.k.get(name20);
        if (eVar == null) {
            int i13 = ga.e.f6066l;
            name = s0Var.getName();
            i9.l.d(name, "getName(...)");
            if (!ga.e.b(name)) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name110 = s0Var.getName();
                    i9.l.d(name110, "getName(...)");
                    linkedHashSetI = I(name110);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            wa.e name111 = s0Var.getName();
            i9.l.d(name111, "getName(...)");
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                tVarA = ga.e.a((s0) it.next());
                if (tVarA != null) {
                    arrayList.add(tVarA);
                }
            }
            if (arrayList.isEmpty()) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name112 = s0Var.getName();
                    i9.l.d(name112, "getName(...)");
                    linkedHashSetI = I(name112);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(s0Var, (x9.t) it2.next())) {
                }
            }
            s0VarB = B(s0Var);
            if (s0VarB != null) {
                wa.e name113 = s0Var.getName();
                i9.l.d(name113, "getName(...)");
                linkedHashSetI = I(name113);
                if (!linkedHashSetI.isEmpty()) {
                    while (r12.hasNext()) {
                        if (s0Var4.o()) {
                        }
                    }
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(eVar);
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            s0Var3 = (s0) obj;
            i9.l.e(s0Var3, "<this>");
            if (i2.c.H(s0Var3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i14 = ga.e.f6066l;
            name = s0Var.getName();
            i9.l.d(name, "getName(...)");
            if (!ga.e.b(name)) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name114 = s0Var.getName();
                    i9.l.d(name114, "getName(...)");
                    linkedHashSetI = I(name114);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            wa.e name115 = s0Var.getName();
            i9.l.d(name115, "getName(...)");
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                tVarA = ga.e.a((s0) it.next());
                if (tVarA != null) {
                    arrayList.add(tVarA);
                }
            }
            if (arrayList.isEmpty()) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name116 = s0Var.getName();
                    i9.l.d(name116, "getName(...)");
                    linkedHashSetI = I(name116);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(s0Var, (x9.t) it2.next())) {
                }
            }
            s0VarB = B(s0Var);
            if (s0VarB != null) {
                wa.e name117 = s0Var.getName();
                i9.l.d(name117, "getName(...)");
                linkedHashSetI = I(name117);
                if (!linkedHashSetI.isEmpty()) {
                    while (r12.hasNext()) {
                        if (s0Var4.o()) {
                        }
                    }
                }
            }
            return true;
        }
        x9.s sVarS1 = s0Var.s0();
        sVarS1.P(eVar);
        sVarS1.S();
        sVarS1.n();
        x9.t tVarBuild2 = sVarS1.build();
        i9.l.b(tVarBuild2);
        s0Var2 = (s0) tVarBuild2;
        if (arrayList2.isEmpty()) {
            int i15 = ga.e.f6066l;
            name = s0Var.getName();
            i9.l.d(name, "getName(...)");
            if (!ga.e.b(name)) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name118 = s0Var.getName();
                    i9.l.d(name118, "getName(...)");
                    linkedHashSetI = I(name118);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            wa.e name119 = s0Var.getName();
            i9.l.d(name119, "getName(...)");
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                tVarA = ga.e.a((s0) it.next());
                if (tVarA != null) {
                    arrayList.add(tVarA);
                }
            }
            if (arrayList.isEmpty()) {
                s0VarB = B(s0Var);
                if (s0VarB != null) {
                    wa.e name1110 = s0Var.getName();
                    i9.l.d(name1110, "getName(...)");
                    linkedHashSetI = I(name1110);
                    if (!linkedHashSetI.isEmpty()) {
                        while (r12.hasNext()) {
                            if (s0Var4.o()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(s0Var, (x9.t) it2.next())) {
                }
            }
            s0VarB = B(s0Var);
            if (s0VarB != null) {
                wa.e name1111 = s0Var.getName();
                i9.l.d(name1111, "getName(...)");
                linkedHashSetI = I(name1111);
                if (!linkedHashSetI.isEmpty()) {
                    while (r12.hasNext()) {
                        if (s0Var4.o()) {
                        }
                    }
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((s0) it3.next(), s0Var2)) {
            }
        }
        int i16 = ga.e.f6066l;
        name = s0Var.getName();
        i9.l.d(name, "getName(...)");
        if (!ga.e.b(name)) {
            s0VarB = B(s0Var);
            if (s0VarB != null) {
                wa.e name1112 = s0Var.getName();
                i9.l.d(name1112, "getName(...)");
                linkedHashSetI = I(name1112);
                if (!linkedHashSetI.isEmpty()) {
                    while (r12.hasNext()) {
                        if (s0Var4.o()) {
                        }
                    }
                }
            }
            return true;
        }
        wa.e name1113 = s0Var.getName();
        i9.l.d(name1113, "getName(...)");
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            tVarA = ga.e.a((s0) it.next());
            if (tVarA != null) {
                arrayList.add(tVarA);
            }
        }
        if (arrayList.isEmpty()) {
            s0VarB = B(s0Var);
            if (s0VarB != null) {
                wa.e name1114 = s0Var.getName();
                i9.l.d(name1114, "getName(...)");
                linkedHashSetI = I(name1114);
                if (!linkedHashSetI.isEmpty()) {
                    while (r12.hasNext()) {
                        if (s0Var4.o()) {
                        }
                    }
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(s0Var, (x9.t) it2.next())) {
            }
        }
        s0VarB = B(s0Var);
        if (s0VarB != null) {
            wa.e name1115 = s0Var.getName();
            i9.l.d(name1115, "getName(...)");
            linkedHashSetI = I(name1115);
            if (!linkedHashSetI.isEmpty()) {
                while (r12.hasNext()) {
                    if (s0Var4.o()) {
                    }
                }
            }
        }
        return true;
        return false;
    }

    public final void M(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        i9.l.e(((ja.a) this.f7390b.f3847b).f6976n, "<this>");
        i9.l.e(this.f7458n, "scopeOwner");
    }

    public final ArrayList N(wa.e eVar) {
        Collection collectionB = ((c) this.f7393e.invoke()).b(eVar);
        ArrayList arrayList = new ArrayList(u8.q.a0(collectionB, 10));
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(t((da.x) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(wa.e eVar) {
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            s0 s0Var = (s0) obj;
            i9.l.e(s0Var, "<this>");
            if (i2.c.H(s0Var) == null && ga.e.a(s0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // gb.p, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        f1.e eVar2;
        x9.e eVar3;
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        M(eVar, bVar);
        o oVar = (o) this.f7391c;
        return (oVar == null || (eVar2 = oVar.f7465u) == null || (eVar3 = (x9.e) eVar2.invoke(eVar)) == null) ? (x9.h) this.f7465u.invoke(eVar) : eVar3;
    }

    @Override // ka.a0, gb.p, gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        M(eVar, bVar);
        return super.b(eVar, bVar);
    }

    @Override // ka.a0, gb.p, gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        M(eVar, bVar);
        return super.f(eVar, bVar);
    }

    @Override // ka.a0
    public final Set h(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return u8.f0.g0((Set) this.f7462r.invoke(), ((Map) this.f7464t.invoke()).keySet());
    }

    @Override // ka.a0
    public final Set i(gb.f fVar, gb.l lVar) {
        i9.l.e(fVar, "kindFilter");
        x9.e eVar = this.f7458n;
        Collection collectionM = eVar.t().m();
        i9.l.d(collectionM, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionM.iterator();
        while (it.hasNext()) {
            u8.u.c0(((nb.w) it.next()).U().c(), linkedHashSet);
        }
        mb.i iVar = this.f7393e;
        linkedHashSet.addAll(((c) iVar.invoke()).a());
        linkedHashSet.addAll(((c) iVar.invoke()).e());
        linkedHashSet.addAll(h(fVar, lVar));
        da.a aVar = this.f7390b;
        ((eb.a) ((ja.a) aVar.f3847b).f6986x).getClass();
        i9.l.e(eVar, "thisDescriptor");
        i9.l.e(aVar, "c");
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // ka.a0
    public final void j(ArrayList arrayList, wa.e eVar) throws IllegalAccessException, InvocationTargetException {
        i9.l.e(eVar, "name");
        boolean zG = this.f7459o.g();
        x9.e eVar2 = this.f7458n;
        da.a aVar = this.f7390b;
        if (zG) {
            mb.i iVar = this.f7393e;
            if (((c) iVar.invoke()).d(eVar) != null) {
                if (arrayList.isEmpty()) {
                    da.a0 a0VarD = ((c) iVar.invoke()).d(eVar);
                    i9.l.b(a0VarD);
                    ja.c cVarB0 = g5.a.b0(aVar, a0VarD);
                    ja.a aVar2 = (ja.a) aVar.f3847b;
                    ia.e eVarR0 = ia.e.R0(eVar2, cVarB0, a0VarD.c(), aVar2.f6973j.c(a0VarD), true);
                    nb.w wVarD0 = ((a2.b) aVar.f3850e).d0(a0VarD.f(), o9.e0.R(nb.s0.f9034b, false, null, 6));
                    aa.a0 a0VarP = p();
                    x9.x.f14746a.getClass();
                    ga.o oVar = x9.o.f14721e;
                    u8.w wVar = u8.w.f13122a;
                    eVarR0.Q0(null, a0VarP, wVar, wVar, wVar, wVarD0, x9.x.f14749d, oVar, null);
                    eVarR0.D = 1;
                    aVar2.f6970g.getClass();
                    arrayList.add(eVarR0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((s0) it.next()).X().isEmpty()) {
                        }
                    }
                    da.a0 a0VarD2 = ((c) iVar.invoke()).d(eVar);
                    i9.l.b(a0VarD2);
                    ja.c cVarB1 = g5.a.b0(aVar, a0VarD2);
                    ja.a aVar3 = (ja.a) aVar.f3847b;
                    ia.e eVarR1 = ia.e.R0(eVar2, cVarB1, a0VarD2.c(), aVar3.f6973j.c(a0VarD2), true);
                    nb.w wVarD1 = ((a2.b) aVar.f3850e).d0(a0VarD2.f(), o9.e0.R(nb.s0.f9034b, false, null, 6));
                    aa.a0 a0VarP2 = p();
                    x9.x.f14746a.getClass();
                    ga.o oVar2 = x9.o.f14721e;
                    u8.w wVar2 = u8.w.f13122a;
                    eVarR1.Q0(null, a0VarP2, wVar2, wVar2, wVar2, wVarD1, x9.x.f14749d, oVar2, null);
                    eVarR1.D = 1;
                    aVar3.f6970g.getClass();
                    arrayList.add(eVarR1);
                }
            }
        }
        ((eb.a) ((ja.a) aVar.f3847b).f6986x).getClass();
        i9.l.e(eVar2, "thisDescriptor");
        i9.l.e(eVar, "name");
        i9.l.e(aVar, "c");
    }

    @Override // ka.a0
    public final c k() {
        return new a(this.f7459o, m.f7449b);
    }

    @Override // ka.a0
    public final void m(LinkedHashSet linkedHashSet, wa.e eVar) {
        i9.l.e(eVar, "name");
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = h0.f6082a;
        if (!h0.f6091j.contains(eVar) && !ga.e.b(eVar)) {
            if (!linkedHashSetI.isEmpty()) {
                Iterator it = linkedHashSetI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((x9.t) it.next()).o()) {
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (L((s0) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(linkedHashSet, eVar, arrayList2, false);
            return;
        }
        int i7 = wb.i.f14296c;
        wb.i iVarE = wb.l.e();
        LinkedHashSet linkedHashSetE0 = g5.a.e0(eVar, linkedHashSetI, u8.w.f13122a, this.f7458n, jb.m.f7052a, ((ob.m) ((ja.a) this.f7390b.f3847b).f6983u).f9657d);
        x(eVar, linkedHashSet, linkedHashSetE0, linkedHashSet, new d1(1, this, o.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 1));
        x(eVar, linkedHashSet, linkedHashSetE0, iVarE, new d1(1, this, o.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 2));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((s0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, eVar, u8.p.x0(iVarE, arrayList3), true);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, t8.h] */
    @Override // ka.a0
    public final void n(ArrayList arrayList, wa.e eVar) {
        Set setM0;
        da.x xVar;
        i9.l.e(eVar, "name");
        boolean zIsAnnotation = this.f7459o.f3881a.isAnnotation();
        da.a aVar = this.f7390b;
        if (zIsAnnotation && (xVar = (da.x) u8.p.B0(((c) this.f7393e.invoke()).b(eVar))) != null) {
            ia.f fVarK0 = ia.f.K0(this.f7458n, g5.a.b0(aVar, xVar), k9.a.U(xVar.e()), false, xVar.c(), ((ja.a) aVar.f3847b).f6973j.c(xVar), false);
            q0 q0VarF = za.k.f(fVarK0, y9.g.f15129a);
            fVarK0.G0(q0VarF, null, null, null);
            i9.l.e(aVar, "<this>");
            nb.w wVarL = a0.l(xVar, new da.a((ja.a) aVar.f3847b, new ja.e(aVar, fVarK0, xVar, 0), (t8.h) aVar.f3849d));
            aa.a0 a0VarP = p();
            u8.w wVar = u8.w.f13122a;
            fVarK0.J0(wVarL, wVar, a0VarP, null, wVar);
            q0VarF.f425m = wVarL;
            arrayList.add(fVarK0);
        }
        Set setJ = J(eVar);
        if (setJ.isEmpty()) {
            return;
        }
        int i7 = wb.i.f14296c;
        wb.i iVarE = wb.l.e();
        AbstractCollection abstractCollectionE = wb.l.e();
        y(setJ, arrayList, iVarE, new n(this, 0));
        if (iVarE.isEmpty()) {
            setM0 = u8.p.M0(setJ);
        } else if (iVarE instanceof Set) {
            Set linkedHashSet = new LinkedHashSet();
            for (Object obj : setJ) {
                if (!iVarE.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setM0 = linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(setJ);
            linkedHashSet2.removeAll(iVarE);
            setM0 = linkedHashSet2;
        }
        y(setM0, abstractCollectionE, null, new n(this, 1));
        LinkedHashSet linkedHashSetG0 = u8.f0.g0(setJ, abstractCollectionE);
        ja.a aVar2 = (ja.a) aVar.f3847b;
        arrayList.addAll(g5.a.e0(eVar, linkedHashSetG0, arrayList, this.f7458n, aVar2.f6969f, ((ob.m) aVar2.f6983u).f9657d));
    }

    @Override // ka.a0
    public final Set o(gb.f fVar) {
        i9.l.e(fVar, "kindFilter");
        if (this.f7459o.f3881a.isAnnotation()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.f7393e.invoke()).f());
        Collection collectionM = this.f7458n.t().m();
        i9.l.d(collectionM, "getSupertypes(...)");
        Iterator it = collectionM.iterator();
        while (it.hasNext()) {
            u8.u.c0(((nb.w) it.next()).U().g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // ka.a0
    public final aa.a0 p() {
        x9.e eVar = this.f7458n;
        if (eVar != null) {
            int i7 = za.d.f15791a;
            return eVar.A0();
        }
        za.d.a(0);
        throw null;
    }

    @Override // ka.a0
    public final x9.k q() {
        return this.f7458n;
    }

    @Override // ka.a0
    public final boolean r(ia.e eVar) {
        if (this.f7459o.f3881a.isAnnotation()) {
            return false;
        }
        return L(eVar);
    }

    @Override // ka.a0
    public final z s(da.x xVar, ArrayList arrayList, nb.w wVar, List list) {
        i9.l.e(xVar, "method");
        ((ja.a) this.f7390b.f3847b).f6968e.getClass();
        if (this.f7458n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new z(wVar, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ka.a0
    public final String toString() {
        return "Lazy Java member scope for " + this.f7459o.c();
    }

    public final void v(ArrayList arrayList, ia.b bVar, int i7, da.x xVar, nb.w wVar, nb.w wVar2) {
        na.a pVar;
        wa.e eVarC = xVar.c();
        if (wVar == null) {
            u0.a(2);
            throw null;
        }
        w0 w0VarG = u0.g(wVar, false);
        Object defaultValue = xVar.f3889a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = da.d.f3860a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new da.t(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                pVar = new da.g(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                pVar = new da.h(null, (Object[]) defaultValue);
            } else {
                pVar = defaultValue instanceof Class ? new da.p(null, (Class) defaultValue) : new da.v(null, defaultValue);
            }
        } else {
            pVar = null;
        }
        arrayList.add(new y0(bVar, null, i7, y9.g.f15129a, eVarC, w0VarG, pVar != null, false, false, wVar2 != null ? u0.g(wVar2, false) : null, ((ja.a) this.f7390b.f3847b).f6973j.c(xVar)));
    }

    public final void w(LinkedHashSet linkedHashSet, wa.e eVar, ArrayList arrayList, boolean z10) {
        ja.a aVar = (ja.a) this.f7390b.f3847b;
        LinkedHashSet<s0> linkedHashSetE0 = g5.a.e0(eVar, arrayList, linkedHashSet, this.f7458n, aVar.f6969f, ((ob.m) aVar.f6983u).f9657d);
        if (!z10) {
            linkedHashSet.addAll(linkedHashSetE0);
            return;
        }
        ArrayList arrayListX0 = u8.p.x0(linkedHashSetE0, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(u8.q.a0(linkedHashSetE0, 10));
        for (s0 s0VarA : linkedHashSetE0) {
            s0 s0Var = (s0) i2.c.I(s0VarA);
            if (s0Var != null) {
                s0VarA = A(s0VarA, s0Var, arrayListX0);
            }
            arrayList2.add(s0VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(wa.e eVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, h9.k kVar) {
        s0 s0VarA;
        Object next;
        s0 s0Var;
        s0 s0VarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            s0 s0Var2 = (s0) it.next();
            s0 s0Var3 = (s0) i2.c.H(s0Var2);
            s0 s0Var4 = null;
            if (s0Var3 != null) {
                String strE = i2.c.E(s0Var3);
                i9.l.b(strE);
                Iterator it2 = ((Collection) kVar.invoke(wa.e.e(strE))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        s0VarA = null;
                        break;
                    }
                    x9.s sVarS0 = ((s0) it2.next()).s0();
                    sVarS0.P(eVar);
                    sVarS0.S();
                    sVarS0.n();
                    x9.t tVarBuild = sVarS0.build();
                    i9.l.b(tVarBuild);
                    s0 s0Var5 = (s0) tVarBuild;
                    if (E(s0Var3, s0Var5)) {
                        s0VarA = A(s0Var5, s0Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                s0VarA = null;
                break;
            }
            wb.l.a(abstractSet, s0VarA);
            x9.t tVarA = ga.e.a(s0Var2);
            if (tVarA == 0) {
                s0VarA2 = null;
            } else {
                wa.e name = ((aa.q) tVarA).getName();
                i9.l.d(name, "getName(...)");
                Iterator it3 = ((Iterable) kVar.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((s0) next, tVarA));
                s0 s0Var6 = (s0) next;
                if (s0Var6 != null) {
                    x9.s sVarS1 = s0Var6.s0();
                    List listX = tVarA.X();
                    i9.l.d(listX, "getValueParameters(...)");
                    ArrayList arrayList = new ArrayList(u8.q.a0(listX, 10));
                    Iterator it4 = listX.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((y0) it4.next()).getType());
                    }
                    List listX2 = s0Var6.X();
                    i9.l.d(listX2, "getValueParameters(...)");
                    sVarS1.f(k9.a.p(arrayList, listX2, tVarA));
                    sVarS1.S();
                    sVarS1.n();
                    sVarS1.t();
                    s0Var = (s0) sVarS1.build();
                } else {
                    s0Var = null;
                }
                if (s0Var == null) {
                    s0VarA2 = null;
                } else {
                    if (!L(s0Var)) {
                        s0Var = null;
                    }
                    if (s0Var != null) {
                        s0VarA2 = A(s0Var, tVarA, linkedHashSet);
                    } else {
                        s0VarA2 = null;
                    }
                }
            }
            wb.l.a(abstractSet, s0VarA2);
            if (s0Var2.o()) {
                wa.e name2 = s0Var2.getName();
                i9.l.d(name2, "getName(...)");
                Iterator it5 = ((Iterable) kVar.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    s0 s0VarB = B((s0) it5.next());
                    if (s0VarB == null || !D(s0VarB, s0Var2)) {
                        s0VarB = null;
                    }
                    if (s0VarB != null) {
                        s0Var4 = s0VarB;
                        break;
                    }
                }
            }
            wb.l.a(abstractSet, s0Var4);
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, wb.i iVar, h9.k kVar) {
        s0 s0VarH;
        r0 r0VarM;
        ia.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            if (C(k0Var, kVar)) {
                s0 s0VarG = G(k0Var, kVar);
                i9.l.b(s0VarG);
                if (k0Var.d0()) {
                    s0VarH = H(k0Var, kVar);
                    i9.l.b(s0VarH);
                } else {
                    s0VarH = null;
                }
                if (s0VarH != null) {
                    s0VarH.i();
                    s0VarG.i();
                }
                x9.e eVar = this.f7458n;
                i9.l.e(eVar, "ownerDescriptor");
                ia.d dVar2 = new ia.d(eVar, y9.g.f15129a, s0VarG.i(), s0VarG.d(), s0VarH != null, k0Var.getName(), s0VarG.getSource(), null, 1, false, null);
                nb.w wVar = s0VarG.f478g;
                i9.l.b(wVar);
                aa.a0 a0VarP = p();
                u8.w wVar2 = u8.w.f13122a;
                dVar2.J0(wVar, wVar2, a0VarP, null, wVar2);
                q0 q0VarL = za.k.l(dVar2, s0VarG.getAnnotations(), false, s0VarG.getSource());
                q0VarL.f386l = s0VarG;
                q0VarL.F0(dVar2.getType());
                if (s0VarH != null) {
                    List listX = s0VarH.X();
                    i9.l.d(listX, "getValueParameters(...)");
                    y0 y0Var = (y0) u8.p.m0(listX);
                    if (y0Var == null) {
                        throw new AssertionError("No parameter found for " + s0VarH);
                    }
                    r0VarM = za.k.m(dVar2, s0VarH.getAnnotations(), y0Var.getAnnotations(), false, s0VarH.d(), s0VarH.getSource());
                    r0VarM.f386l = s0VarH;
                } else {
                    r0VarM = null;
                }
                dVar2.G0(q0VarL, r0VarM, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (iVar != null) {
                    iVar.add(k0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z10 = this.f7460p;
        x9.e eVar = this.f7458n;
        if (z10) {
            Collection collectionM = eVar.t().m();
            i9.l.d(collectionM, "getSupertypes(...)");
            return collectionM;
        }
        ((ob.m) ((ja.a) this.f7390b.f3847b).f6983u).getClass();
        i9.l.e(eVar, "classDescriptor");
        Collection collectionM2 = eVar.t().m();
        i9.l.d(collectionM2, "getSupertypes(...)");
        return collectionM2;
    }
}
