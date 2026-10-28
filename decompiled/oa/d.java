package oa;

import aa.p0;
import aa.q0;
import aa.y0;
import c8.y;
import ga.c0;
import ga.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nb.a0;
import nb.f0;
import nb.h0;
import nb.k0;
import nb.n0;
import nb.u0;
import nb.w;
import nb.w0;
import nb.x0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static c c(a0 a0Var, y yVar, int i7, s sVar, boolean z10, boolean z11) {
        x9.h hVarL;
        x9.e eVarA;
        Boolean bool;
        k0 k0VarD0;
        Boolean bool2;
        j.g gVar;
        f0 f0VarJ;
        ?? r8 = 0;
        s sVar2 = s.f9629c;
        boolean z12 = sVar != sVar2;
        boolean z13 = (z11 && z10) ? false : true;
        Object obj = null;
        if ((z12 || !a0Var.B0().isEmpty()) && (hVarL = a0Var.D0().l()) != null) {
            e eVar = (e) yVar.invoke(Integer.valueOf(i7));
            y9.i iVar = v.f9633a;
            if (sVar == sVar2 || !(hVarL instanceof x9.e)) {
                eVarA = null;
            } else if (eVar.f9584b == f.f9587a && sVar == s.f9627a) {
                x9.e eVar2 = (x9.e) hVarL;
                String str = w9.d.f14177a;
                wa.d dVarG = za.d.g(eVar2);
                HashMap map = w9.d.f14186j;
                if (map.containsKey(dVarG)) {
                    wa.c cVar = (wa.c) map.get(za.d.g(eVar2));
                    if (cVar == null) {
                        throw new IllegalArgumentException("Given class " + eVar2 + " is not a mutable collection");
                    }
                    eVarA = db.e.e(eVar2).j(cVar);
                } else if (eVar.f9584b == f.f9588b) {
                    eVarA = null;
                } else {
                    eVarA = null;
                }
            } else if (eVar.f9584b == f.f9588b || sVar != s.f9628b) {
                eVarA = null;
            } else {
                x9.e eVar3 = (x9.e) hVarL;
                String str2 = w9.d.f14177a;
                if (w9.d.k.containsKey(za.d.g(eVar3))) {
                    eVarA = w9.e.a(eVar3);
                } else {
                    eVarA = null;
                }
            }
            if (sVar == sVar2) {
                bool = null;
            } else {
                h hVar = eVar.f9583a;
                int i10 = hVar == null ? -1 : u.f9632a[hVar.ordinal()];
                if (i10 == 1) {
                    bool = Boolean.TRUE;
                } else if (i10 != 2) {
                    bool = null;
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (eVarA == null || (k0VarD0 = eVarA.t()) == null) {
                k0VarD0 = a0Var.D0();
            }
            int i11 = i7 + 1;
            List listB0 = a0Var.B0();
            List listN = k0VarD0.n();
            i9.l.d(listN, "getParameters(...)");
            Iterator it = listB0.iterator();
            Iterator it2 = listN.iterator();
            ArrayList arrayList = new ArrayList(Math.min(u8.q.a0(listB0, 10), u8.q.a0(listN, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                r0 r0Var = (r0) it2.next();
                n0 n0Var = (n0) next;
                if (z13) {
                    bool2 = bool;
                    if (!n0Var.c()) {
                        gVar = d(n0Var.b().G0(), yVar, i11, z11);
                    } else if (((e) yVar.invoke(Integer.valueOf(i11))).f9583a == h.f9591a) {
                        w0 w0VarG0 = n0Var.b().G0();
                        gVar = new j.g(1, 4, nb.c.e(nb.c.l(w0VarG0).H0(r8), nb.c.D(w0VarG0).H0(true)));
                    } else {
                        gVar = new j.g(1, 4, null);
                    }
                } else {
                    bool2 = bool;
                    gVar = new j.g(r8, 4, obj);
                }
                i11 += gVar.f6794b;
                w wVar = (w) gVar.f6795c;
                if (wVar != null) {
                    x0 x0VarA = n0Var.a();
                    i9.l.d(x0VarA, "getProjectionKind(...)");
                    f0VarJ = n3.n.b0(wVar, x0VarA, r0Var);
                } else if (eVarA == null || n0Var.c()) {
                    f0VarJ = eVarA != null ? u0.j(r0Var) : null;
                } else {
                    w wVarB = n0Var.b();
                    i9.l.d(wVarB, "getType(...)");
                    x0 x0VarA2 = n0Var.a();
                    i9.l.d(x0VarA2, "getProjectionKind(...)");
                    f0VarJ = n3.n.b0(wVarB, x0VarA2, r0Var);
                }
                arrayList.add(f0VarJ);
                bool = bool2;
                r8 = 0;
                obj = null;
            }
            Boolean bool3 = bool;
            int i12 = i11 - i7;
            if (eVarA == null && bool3 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (((n0) it3.next()) == null);
                }
                return new c(null, i12, false);
            }
            y9.h annotations = a0Var.getAnnotations();
            y9.i iVar2 = v.f9634b;
            if (eVarA == null) {
                iVar2 = null;
            }
            ArrayList arrayListV0 = u8.l.v0(new y9.h[]{annotations, iVar2, bool3 != null ? v.f9633a : null});
            int size = arrayListV0.size();
            if (size == 0) {
                throw new IllegalStateException("At least one Annotations object expected");
            }
            h0 h0VarB = nb.c.B(size != 1 ? new y9.i(1, u8.p.J0(arrayListV0)) : (y9.h) u8.p.A0(arrayListV0));
            List listB1 = a0Var.B0();
            Iterator it4 = arrayList.iterator();
            Iterator it5 = listB1.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(u8.q.a0(arrayList, 10), u8.q.a0(listB1, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                n0 n0Var2 = (n0) it5.next();
                n0 n0Var3 = (n0) next2;
                if (n0Var3 != null) {
                    n0Var2 = n0Var3;
                }
                arrayList2.add(n0Var2);
            }
            a0 a0VarT = nb.c.t(arrayList2, h0VarB, k0VarD0, bool3 != null ? bool3.booleanValue() : a0Var.E0());
            if (eVar.f9585c) {
                a0VarT = new g(a0VarT);
            }
            return new c(a0VarT, i12, bool3 != null && eVar.f9586d);
        }
        return new c(null, 1, false);
    }

    public static j.g d(w0 w0Var, y yVar, int i7, boolean z10) {
        w0 w0VarE;
        a0 a0Var;
        Object objF = null;
        if (nb.c.j(w0Var)) {
            return new j.g(1, 4, null);
        }
        if (!(w0Var instanceof nb.p)) {
            if (!(w0Var instanceof a0)) {
                throw new cc.s();
            }
            c cVarC = c((a0) w0Var, yVar, i7, s.f9629c, false, z10);
            w0 w0VarF = (a0) cVarC.f9581c;
            if (cVarC.f9579a) {
                w0VarF = nb.c.F(w0Var, w0VarF);
            }
            return new j.g(cVarC.f9580b, 4, w0VarF);
        }
        boolean z11 = w0Var instanceof la.h;
        nb.p pVar = (nb.p) w0Var;
        a0 a0Var2 = pVar.f9024c;
        a0 a0Var3 = pVar.f9023b;
        c cVarC2 = c(a0Var3, yVar, i7, s.f9627a, z11, z10);
        c cVarC3 = c(pVar.f9024c, yVar, i7, s.f9628b, z11, z10);
        a0 a0Var4 = (a0) cVarC3.f9581c;
        a0 a0Var5 = (a0) cVarC2.f9581c;
        if (a0Var5 != null || a0Var4 != null) {
            if (cVarC2.f9579a || cVarC3.f9579a) {
                if (a0Var4 != null) {
                    if (a0Var5 == null) {
                        a0Var5 = a0Var4;
                    }
                    w0VarE = nb.c.e(a0Var5, a0Var4);
                } else {
                    i9.l.b(a0Var5);
                    w0VarE = a0Var5;
                }
                objF = nb.c.F(w0Var, w0VarE);
            } else if (z11) {
                a0 a0Var6 = a0Var5;
                if (a0Var5 == null) {
                }
                if (a0Var4 != null) {
                    a0Var6 = a0Var3;
                    a0Var2 = a0Var4;
                }
                a0Var6 = a0Var3;
                objF = new la.h(a0Var6, a0Var2);
            } else {
                if (a0Var5 == null) {
                }
                if (a0Var4 != null) {
                    a0Var = a0Var3;
                    a0Var2 = a0Var4;
                }
                a0Var = a0Var3;
                objF = nb.c.e(a0Var, a0Var2);
            }
        }
        return new j.g(cVarC2.f9580b, 4, objF);
    }

    public w a(ia.a aVar, x9.b bVar, boolean z10, da.a aVar2, ga.a aVar3, t tVar, boolean z11, h9.k kVar) {
        r rVar = new r(bVar, z10, aVar2, aVar3, false);
        w wVar = (w) kVar.invoke(aVar);
        Collection collectionM = aVar.m();
        i9.l.d(collectionM, "getOverriddenDescriptors(...)");
        Collection<x9.c> collection = collectionM;
        ArrayList arrayList = new ArrayList(u8.q.a0(collection, 10));
        for (x9.c cVar : collection) {
            i9.l.b(cVar);
            arrayList.add((w) kVar.invoke(cVar));
        }
        return b(rVar, wVar, arrayList, tVar, z11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01de  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:176:0x0298  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:221:0x0334  */
    /* JADX WARN: Code duplicated, block: B:223:0x0339  */
    /* JADX WARN: Code duplicated, block: B:228:0x0347  */
    /* JADX WARN: Code duplicated, block: B:235:0x0357  */
    /* JADX WARN: Code duplicated, block: B:239:0x0369  */
    /* JADX WARN: Code duplicated, block: B:241:0x0379  */
    /* JADX WARN: Code duplicated, block: B:242:0x037b  */
    /* JADX WARN: Code duplicated, block: B:244:0x037f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0391  */
    /* JADX WARN: Code duplicated, block: B:249:0x0393  */
    /* JADX WARN: Code duplicated, block: B:251:0x0396  */
    /* JADX WARN: Code duplicated, block: B:252:0x0398  */
    /* JADX WARN: Code duplicated, block: B:254:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:257:0x03af  */
    /* JADX WARN: Code duplicated, block: B:263:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:264:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:268:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:276:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:280:0x0405  */
    /* JADX WARN: Code duplicated, block: B:282:0x0408  */
    /* JADX WARN: Code duplicated, block: B:286:0x040f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0416  */
    /* JADX WARN: Code duplicated, block: B:292:0x0420  */
    /* JADX WARN: Code duplicated, block: B:297:0x0430  */
    /* JADX WARN: Code duplicated, block: B:310:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x041a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x01f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public w b(r rVar, w wVar, List list, t tVar, boolean z10) {
        int size;
        Iterable annotations;
        ga.a aVar;
        da.a aVar2;
        e[] eVarArr;
        r0 r0Var;
        h hVar;
        i iVar;
        ga.m mVar;
        i iVarB;
        i iVar2;
        i iVar3;
        h hVar2;
        boolean z11;
        i iVarA;
        e eVar;
        i iVarB2;
        i iVarA2;
        ga.m mVar2;
        i iVar4;
        i iVarA3;
        boolean z12;
        f fVar;
        k0 k0VarW0;
        boolean z13;
        ArrayList<e> arrayList;
        Iterator it;
        boolean z14;
        boolean z15;
        h hVar3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Set setM0;
        h hVar4;
        h hVar5;
        ArrayList arrayList4;
        Iterator it2;
        boolean z16;
        boolean z17;
        Iterator it3;
        e eVar2;
        f fVar2;
        ArrayList arrayList5;
        Iterator it4;
        Set setM1;
        h hVar6;
        h hVar7;
        a aVar3;
        e eVar3;
        qb.d dVar;
        h hVarD;
        qb.i iVarQ;
        r rVar2 = rVar;
        y9.a aVar4 = (y9.a) rVar2.f9624d;
        da.a aVar5 = (da.a) rVar2.f9625e;
        ob.f fVar3 = ob.f.f9639b;
        boolean z18 = rVar2.f9622b;
        i9.l.e(wVar, "<this>");
        ArrayList arrayListE = rVar.e(wVar);
        ArrayList arrayList6 = new ArrayList(u8.q.a0(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList6.add(rVar2.e((qb.d) it5.next()));
        }
        if (!z18 || list.isEmpty()) {
            size = arrayListE.size();
            break;
        }
        Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                size = arrayListE.size();
                break;
            }
            qb.d dVar2 = (qb.d) it6.next();
            i9.l.e(dVar2, "other");
            if (!((ob.m) ((ja.a) aVar5.f3847b).f6983u).a(wVar, (w) dVar2)) {
                size = 1;
                break;
            }
        }
        e[] eVarArr2 = new e[size];
        int i7 = 0;
        while (i7 < size) {
            a aVar6 = (a) arrayListE.get(i7);
            ga.a aVar7 = (ga.a) rVar2.f9626f;
            qb.d dVar3 = aVar6.f9575a;
            r0 r0Var2 = aVar6.f9577c;
            h hVar8 = h.f9591a;
            f fVar4 = f.f9588b;
            boolean z19 = z18;
            f fVar5 = f.f9587a;
            ArrayList arrayList7 = arrayListE;
            h hVar9 = h.f9592b;
            ArrayList arrayList8 = arrayList6;
            h hVar10 = h.f9593c;
            int i10 = size;
            if (dVar3 == null) {
                if (r0Var2 != null) {
                    x0 x0VarI = r0Var2.I();
                    i9.l.d(x0VarI, "getVariance(...)");
                    iVarQ = n3.r.q(x0VarI);
                } else {
                    iVarQ = null;
                }
                if (iVarQ == qb.i.IN) {
                    eVar = e.f9582e;
                    aVar2 = aVar5;
                    eVarArr = eVarArr2;
                }
                z13 = eVar.f9586d;
                arrayList = new ArrayList();
                for (it = arrayList8.iterator(); it.hasNext(); it = it) {
                    aVar3 = (a) u8.p.n0(i7, (List) it.next());
                    if (aVar3 != null || (dVar = aVar3.f9575a) == null) {
                        eVar3 = null;
                    } else {
                        h hVarD2 = r.d(dVar);
                        if (hVarD2 == null) {
                            w wVarF = nb.c.f((w) dVar);
                            hVarD = wVarF != null ? r.d(wVarF) : null;
                        } else {
                            hVarD = hVarD2;
                        }
                        String str = w9.d.f14177a;
                        eVar3 = new e(hVarD, w9.d.k.containsKey(r.c(fVar3.C(dVar))) ? fVar5 : w9.d.f14186j.containsKey(r.c(fVar3.D(dVar))) ? fVar4 : null, fVar3.V(dVar) || (((w) dVar).G0() instanceof g), hVarD != hVarD2);
                    }
                    if (eVar3 != null) {
                        arrayList.add(eVar3);
                    }
                }
                if (i7 == 0 || !z19) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (i7 == 0 || !(aVar4 instanceof y0) || ((y0) aVar4).f475j == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                hVar3 = eVar.f9583a;
                arrayList2 = new ArrayList();
                for (e eVar4 : arrayList) {
                    y9.a aVar8 = aVar4;
                    ArrayList arrayList9 = arrayList;
                    if (eVar4.f9586d) {
                        hVar7 = null;
                    } else {
                        hVar7 = eVar4.f9583a;
                    }
                    if (hVar7 != null) {
                        arrayList2.add(hVar7);
                    }
                    arrayList = arrayList9;
                    aVar4 = aVar8;
                }
                y9.a aVar9 = aVar4;
                arrayList3 = arrayList;
                setM0 = u8.p.M0(arrayList2);
                if (z13) {
                    hVar4 = null;
                } else {
                    hVar4 = hVar3;
                }
                if (hVar4 == hVar8) {
                    hVar5 = hVar8;
                } else {
                    hVar5 = (h) n3.l.T(setM0, hVar10, hVar9, hVar4, z14);
                }
                if (hVar5 == null) {
                    arrayList5 = new ArrayList();
                    it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        hVar6 = ((e) it4.next()).f9583a;
                        if (hVar6 != null) {
                            arrayList5.add(hVar6);
                        }
                    }
                    setM1 = u8.p.M0(arrayList5);
                    if (hVar3 != hVar8) {
                        hVar8 = (h) n3.l.T(setM1, hVar10, hVar9, hVar3, z14);
                    }
                } else {
                    hVar8 = hVar5;
                }
                arrayList4 = new ArrayList();
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    fVar2 = ((e) it2.next()).f9584b;
                    if (fVar2 != null) {
                        arrayList4.add(fVar2);
                    }
                }
                f fVar6 = (f) n3.l.T(u8.p.M0(arrayList4), fVar4, fVar5, eVar.f9584b, z14);
                if (hVar8 != null || z10 || (z15 && hVar8 == hVar9)) {
                    hVar8 = null;
                }
                if (hVar8 == null && hVar5 == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (hVar8 != hVar10) {
                    z17 = false;
                } else {
                    if (z13 == z16 || !eVar.f9585c) {
                        if (!arrayList3.isEmpty()) {
                            it3 = arrayList3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    eVar2 = (e) it3.next();
                                    if (eVar2.f9586d == z16 || !eVar2.f9585c) {
                                    }
                                }
                            }
                        }
                        z17 = false;
                    }
                    z17 = true;
                }
                eVarArr[i7] = new e(hVar8, fVar6, z17, z16);
                i7++;
                rVar2 = rVar;
                z18 = z19;
                arrayListE = arrayList7;
                arrayList6 = arrayList8;
                size = i10;
                aVar4 = aVar9;
                aVar5 = aVar2;
                eVarArr2 = eVarArr;
            } else {
                r0Var2 = r0Var2;
            }
            boolean z20 = r0Var2 == null;
            u8.w wVar2 = u8.w.f13122a;
            Iterable annotations2 = dVar3 != null ? ((w) dVar3).getAnnotations() : wVar2;
            r0 r0VarS = (dVar3 == null || (k0VarW0 = fVar3.w0(dVar3)) == null) ? null : ob.h.s(k0VarW0);
            boolean z21 = aVar7 == ga.a.TYPE_PARAMETER_BOUNDS;
            if (z20 != 0) {
                if (!z21) {
                    ((ja.a) aVar5.f3847b).f6982t.getClass();
                }
                if (aVar4 == null || (annotations = aVar4.getAnnotations()) == null) {
                    annotations = wVar2;
                }
                annotations2 = u8.p.v0(annotations, annotations2);
            }
            ((ja.a) aVar5.f3847b).f6979q.getClass();
            Iterator it7 = annotations2.iterator();
            Iterable iterable = annotations2;
            f fVar7 = null;
            while (true) {
                if (!it7.hasNext()) {
                    aVar = aVar7;
                    break;
                }
                Iterator it8 = it7;
                wa.c cVarD = ga.b.d(it7.next());
                aVar = aVar7;
                if (u8.p.g0(z.f6154n, cVarD)) {
                    fVar = fVar5;
                } else {
                    if (u8.p.g0(z.f6155o, cVarD)) {
                        fVar = fVar4;
                    } else {
                        continue;
                    }
                    it7 = it8;
                    aVar7 = aVar;
                }
                if (fVar7 != null && fVar7 != fVar) {
                    fVar7 = null;
                    break;
                }
                fVar7 = fVar;
                it7 = it8;
                aVar7 = aVar;
            }
            ga.b bVar = ((ja.a) aVar5.f3847b).f6979q;
            aVar2 = aVar5;
            y yVar = new y(8, rVar2, aVar6);
            bVar.getClass();
            Iterator it9 = iterable.iterator();
            i iVar5 = null;
            while (true) {
                if (!it9.hasNext()) {
                    eVarArr = eVarArr2;
                    r0Var = r0VarS;
                    hVar = null;
                    iVar = iVar5;
                    break;
                }
                r0Var = r0VarS;
                Object next = it9.next();
                i iVarG = bVar.g(next, ((Boolean) yVar.invoke(next)).booleanValue());
                if (iVarG != null) {
                    eVarArr = eVarArr2;
                    iVar4 = iVarG;
                } else {
                    Object objI = bVar.i(next);
                    if (objI == null) {
                        eVarArr = eVarArr2;
                    } else {
                        c0 c0VarH = bVar.h(next);
                        if (c0VarH == null) {
                            c0VarH = bVar.f6044a.f6117a.f6120a;
                        }
                        eVarArr = eVarArr2;
                        if (c0VarH == c0.IGNORE) {
                            iVar4 = null;
                        } else {
                            i iVarG2 = bVar.g(objI, ((Boolean) yVar.invoke(objI)).booleanValue());
                            if (iVarG2 != null) {
                                boolean z22 = c0VarH == c0.WARN;
                                bVar = bVar;
                                hVar = null;
                                iVarA3 = i.a(iVarG2, null, z22, 1);
                            }
                        }
                        if (iVar5 == null) {
                            iVar5 = iVarA3;
                        } else {
                            boolean z23 = iVar5.f9596b;
                            if (iVarA3 == null && !iVarA3.equals(iVar5) && (!(z12 = iVarA3.f9596b) || z23)) {
                                if (z12 || !z23) {
                                    iVar = hVar;
                                    break;
                                }
                                iVar5 = iVarA3;
                            }
                        }
                        bVar = bVar;
                        r0VarS = r0Var;
                        eVarArr2 = eVarArr;
                        iVar5 = iVar5;
                    }
                    bVar = bVar;
                    hVar = null;
                    iVarA3 = null;
                    if (iVar5 == null) {
                        iVar5 = iVarA3;
                    } else {
                        boolean z24 = iVar5.f9596b;
                        if (iVarA3 == null) {
                            continue;
                        }
                    }
                    bVar = bVar;
                    r0VarS = r0Var;
                    eVarArr2 = eVarArr;
                    iVar5 = iVar5;
                }
                hVar = null;
                iVarA3 = iVar4;
                if (iVar5 == null) {
                    iVar5 = iVarA3;
                } else {
                    boolean z25 = iVar5.f9596b;
                    if (iVarA3 == null) {
                        continue;
                    }
                }
                bVar = bVar;
                r0VarS = r0Var;
                eVarArr2 = eVarArr;
                iVar5 = iVar5;
            }
            if (iVar != 0) {
                h hVar11 = iVar.f9595a;
                eVar = new e(hVar11, fVar7, hVar11 == hVar10 && r0Var != null, iVar.f9596b);
            } else {
                ga.a aVar10 = (z20 || z21) ? aVar : ga.a.TYPE_USE;
                ga.v vVar = aVar6.f9576b;
                if (vVar != null) {
                    mVar2 = (ga.m) vVar.f6119a.get(aVar10);
                } else {
                    mVar = hVar;
                }
                if (r0Var != null) {
                    mVar = mVar2;
                    iVarB = r.b(r0Var);
                } else {
                    mVar = mVar2;
                    iVarB = hVar;
                }
                if (iVarB != 0) {
                    iVarA2 = i.a(iVarB, hVar10, false, 2);
                } else if (mVar != 0) {
                    iVar3 = mVar.f6095a;
                } else {
                    iVar2 = hVar;
                }
                if (iVarB != 0) {
                    iVar2 = iVar3;
                    hVar2 = iVarB.f9595a;
                } else {
                    iVar2 = iVar3;
                    hVar2 = hVar;
                }
                if (hVar2 == hVar10 || !(r0Var == null || mVar == 0 || !mVar.f6097c)) {
                    iVar2 = iVarA2;
                    iVar2 = iVarA2;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (r0Var2 == null || (iVarB2 = r.b(r0Var2)) == null) {
                    iVarA = hVar;
                } else if (iVarB2.f9595a == hVar9) {
                    iVarA = iVarB2;
                    iVarA = i.a(iVarB2, hVar8, false, 2);
                }
                if (iVarA != 0) {
                    h hVar12 = iVarA.f9595a;
                    if (iVar2 == 0) {
                        iVar2 = iVarA;
                    } else {
                        h hVar13 = iVar2.f9595a;
                        boolean z26 = iVar2.f9596b;
                        boolean z27 = iVarA.f9596b;
                        if ((!z27 || z26) && ((!z27 && z26) || (hVar12.compareTo(hVar13) >= 0 && hVar12.compareTo(hVar13) > 0))) {
                            iVar2 = iVarA;
                        }
                    }
                }
                eVar = new e(iVar2 != 0 ? iVar2.f9595a : null, fVar7, z11, iVar2 != 0 && iVar2.f9596b);
            }
            z13 = eVar.f9586d;
            arrayList = new ArrayList();
            while (it.hasNext()) {
                aVar3 = (a) u8.p.n0(i7, (List) it.next());
                if (aVar3 != null) {
                    eVar3 = null;
                } else {
                    eVar3 = null;
                }
                if (eVar3 != null) {
                    arrayList.add(eVar3);
                }
            }
            if (i7 == 0) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (i7 == 0) {
                z15 = false;
            } else {
                z15 = false;
            }
            hVar3 = eVar.f9583a;
            arrayList2 = new ArrayList();
            while (r15.hasNext()) {
                y9.a aVar11 = aVar4;
                ArrayList arrayList10 = arrayList;
                if (eVar4.f9586d) {
                    hVar7 = null;
                } else {
                    hVar7 = eVar4.f9583a;
                }
                if (hVar7 != null) {
                    arrayList2.add(hVar7);
                }
                arrayList = arrayList10;
                aVar4 = aVar11;
            }
            y9.a aVar12 = aVar4;
            arrayList3 = arrayList;
            setM0 = u8.p.M0(arrayList2);
            if (z13) {
                hVar4 = null;
            } else {
                hVar4 = hVar3;
            }
            if (hVar4 == hVar8) {
                hVar5 = hVar8;
            } else {
                hVar5 = (h) n3.l.T(setM0, hVar10, hVar9, hVar4, z14);
            }
            if (hVar5 == null) {
                arrayList5 = new ArrayList();
                it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    hVar6 = ((e) it4.next()).f9583a;
                    if (hVar6 != null) {
                        arrayList5.add(hVar6);
                    }
                }
                setM1 = u8.p.M0(arrayList5);
                if (hVar3 != hVar8) {
                    hVar8 = (h) n3.l.T(setM1, hVar10, hVar9, hVar3, z14);
                }
            } else {
                hVar8 = hVar5;
            }
            arrayList4 = new ArrayList();
            it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                fVar2 = ((e) it2.next()).f9584b;
                if (fVar2 != null) {
                    arrayList4.add(fVar2);
                }
            }
            f fVar8 = (f) n3.l.T(u8.p.M0(arrayList4), fVar4, fVar5, eVar.f9584b, z14);
            if (hVar8 != null) {
                hVar8 = null;
            } else {
                hVar8 = null;
            }
            if (hVar8 == null) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (hVar8 != hVar10) {
                z17 = false;
            } else if (z13 == z16) {
                if (!arrayList3.isEmpty()) {
                    it3 = arrayList3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            eVar2 = (e) it3.next();
                            if (eVar2.f9586d == z16) {
                            }
                        }
                    }
                }
                z17 = false;
            } else {
                if (!arrayList3.isEmpty()) {
                    it3 = arrayList3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            eVar2 = (e) it3.next();
                            if (eVar2.f9586d == z16) {
                            }
                        }
                    }
                }
                z17 = false;
            }
            eVarArr[i7] = new e(hVar8, fVar8, z17, z16);
            i7++;
            rVar2 = rVar;
            z18 = z19;
            arrayListE = arrayList7;
            arrayList6 = arrayList8;
            size = i10;
            aVar4 = aVar12;
            aVar5 = aVar2;
            eVarArr2 = eVarArr;
        }
        return (w) d(wVar.G0(), new y(9, tVar, eVarArr2), 0, rVar.f9623c).f6795c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:104:0x020d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0211  */
    /* JADX WARN: Code duplicated, block: B:111:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0223  */
    /* JADX WARN: Code duplicated, block: B:114:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:0x0247  */
    /* JADX WARN: Code duplicated, block: B:119:0x024d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0256  */
    /* JADX WARN: Code duplicated, block: B:122:0x0259  */
    /* JADX WARN: Code duplicated, block: B:124:0x0266 A[EDGE_INSN: B:124:0x0266->B:131:0x0289 BREAK  A[LOOP:4: B:126:0x026c->B:192:?]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:128:0x0272  */
    /* JADX WARN: Code duplicated, block: B:133:0x028c  */
    /* JADX WARN: Code duplicated, block: B:134:0x028e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0291  */
    /* JADX WARN: Code duplicated, block: B:137:0x029e  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a9 A[EDGE_INSN: B:142:0x02a9->B:151:0x02c2 BREAK  A[LOOP:2: B:144:0x02af->B:186:?]] */
    /* JADX WARN: Code duplicated, block: B:143:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:170:0x0317  */
    /* JADX WARN: Code duplicated, block: B:176:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[LOOP:4: B:126:0x026c->B:192:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [x9.b] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r25v0, types: [oa.d] */
    /* JADX WARN: Type inference failed for: r5v3, types: [x9.b, x9.c, x9.k] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ia.a] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    public ArrayList e(da.a aVar, Collection collection) {
        y9.h annotations;
        w type;
        n nVar;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        x9.k0 k0Var;
        ga.a aVar2;
        t tVar;
        w wVarA;
        w wVarP;
        boolean z11;
        t8.j jVar;
        ArrayList arrayList3;
        int i7;
        int i10;
        w type2;
        aa.a0 a0VarE0;
        Iterator it;
        boolean z12;
        aa.a0 a0VarE1;
        boolean zC;
        List listX;
        Iterator it2;
        w type3;
        boolean z13;
        t tVar2;
        da.a aVarV;
        q0 q0Var;
        o oVar = o.f9615e;
        i9.l.e(aVar, "c");
        Collection<??> collection2 = collection;
        int i11 = 10;
        ArrayList arrayList4 = new ArrayList(u8.q.a0(collection2, 10));
        for (?? L : collection2) {
            if (L instanceof ia.a) {
                boolean z14 = true;
                if (L.f() != 2 || L.a().m().size() != 1) {
                    x9.h hVarG = x9.v.g(L);
                    if (hVarG == null) {
                        annotations = ((h0.a0) L).getAnnotations();
                    } else {
                        ka.j jVar2 = hVarG instanceof ka.j ? (ka.j) hVarG : null;
                        List list = jVar2 != null ? (List) jVar2.k.getValue() : null;
                        if (list == null || list.isEmpty()) {
                            annotations = ((h0.a0) L).getAnnotations();
                        } else {
                            ArrayList arrayList5 = new ArrayList(u8.q.a0(list, i11));
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(new ka.f(aVar, (da.e) it3.next(), true));
                            }
                            ArrayList arrayListV0 = u8.p.v0(((h0.a0) L).getAnnotations(), arrayList5);
                            annotations = arrayListV0.isEmpty() ? y9.g.f15129a : new y9.i(0, arrayListV0);
                        }
                    }
                    da.a aVarV2 = a.a.v(aVar, annotations);
                    ?? r11 = (!(L instanceof ia.f) || (q0Var = ((p0) L).f420w) == null || q0Var.f380e) ? L : q0Var;
                    aa.a0 a0VarE2 = L.e0();
                    ga.a aVar3 = ga.a.VALUE_PARAMETER;
                    if (a0VarE2 != null) {
                        x9.t tVar3 = r11 instanceof x9.t ? (x9.t) r11 : null;
                        y0 y0Var = tVar3 != null ? (y0) tVar3.K(ia.e.F) : null;
                        type = a((ia.a) L, y0Var, false, y0Var != null ? a.a.v(aVarV2, y0Var.getAnnotations()) : aVarV2, aVar3, null, false, o.f9612b);
                    } else {
                        type = null;
                    }
                    ia.e eVar = L instanceof ia.e ? (ia.e) L : null;
                    if (eVar != null) {
                        x9.k kVarL = eVar.l();
                        i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strW = n3.l.W((x9.e) kVarL, n3.n.Y(eVar, 3));
                        if (strW == null || (nVar = (n) m.f9607d.get(strW)) == null) {
                            nVar = null;
                        } else {
                            String str = nVar.f9610c;
                            if (str != null && !zb.q.o0(str, "2.")) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (str != null) {
                                nVar = nVar.f9611d;
                            }
                        }
                    } else {
                        nVar = null;
                    }
                    if (nVar != null) {
                        nVar.f9609b.size();
                        ((ia.e) L).X().size();
                    }
                    i9.l.e(((ja.a) aVar.f3847b).f6984v, "javaTypeEnhancementState");
                    if (ga.t.f6115i.invoke(ga.r.f6107a) == c0.STRICT) {
                        if ((L instanceof x9.t) && i9.l.a(L.K(ia.e.G), Boolean.TRUE)) {
                            z10 = true;
                        }
                        List<y0> listX2 = r11.X();
                        i9.l.d(listX2, "getValueParameters(...)");
                        arrayList = new ArrayList(u8.q.a0(listX2, i11));
                        for (y0 y0Var2 : listX2) {
                            if (nVar != null) {
                                tVar2 = (t) u8.p.n0(y0Var2.f471f, nVar.f9609b);
                            } else {
                                tVar2 = null;
                            }
                            aa.a aVar4 = new aa.a(25, y0Var2);
                            ia.a aVar5 = (ia.a) L;
                            if (y0Var2 != null) {
                                aVarV = a.a.v(aVarV2, y0Var2.getAnnotations());
                            } else {
                                aVarV = aVarV2;
                            }
                            ArrayList arrayList6 = arrayList;
                            arrayList6.add(a(aVar5, y0Var2, false, aVarV, aVar3, tVar2, z10, aVar4));
                            arrayList = arrayList6;
                        }
                        arrayList2 = arrayList;
                        if (L instanceof x9.k0) {
                            k0Var = (x9.k0) L;
                        } else {
                            k0Var = null;
                        }
                        if (k0Var == null && i2.c.N(k0Var)) {
                            aVar2 = ga.a.FIELD;
                        } else {
                            aVar2 = ga.a.METHOD_RETURN_TYPE;
                        }
                        ga.a aVar6 = aVar2;
                        if (nVar != null) {
                            tVar = nVar.f9608a;
                        } else {
                            tVar = null;
                        }
                        ia.a aVar7 = (ia.a) L;
                        wVarA = a(aVar7, r11, true, aVarV2, aVar6, tVar, false, o.f9613c);
                        wVarP = L.p();
                        i9.l.b(wVarP);
                        if (u0.c(wVarP, oVar, null)) {
                            z11 = true;
                        } else {
                            a0VarE1 = L.e0();
                            if (a0VarE1 != null) {
                                zC = u0.c(a0VarE1.getType(), oVar, null);
                            } else {
                                zC = false;
                            }
                            if (zC) {
                                z11 = true;
                            } else {
                                listX = L.X();
                                i9.l.d(listX, "getValueParameters(...)");
                                if (listX.isEmpty()) {
                                    z13 = false;
                                    break;
                                }
                                it2 = listX.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        z13 = false;
                                        break;
                                    }
                                    type3 = ((y0) it2.next()).getType();
                                    i9.l.d(type3, "getType(...)");
                                    if (u0.c(type3, oVar, null)) {
                                        z13 = true;
                                        break;
                                    }
                                }
                                if (z13) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            }
                        }
                        if (z11) {
                            jVar = new t8.j(cb.c.f2586a, new ga.g());
                        } else {
                            jVar = null;
                        }
                        if (type == null && wVarA == null) {
                            if (arrayList2.isEmpty()) {
                                z14 = false;
                                break;
                            }
                            it = arrayList2.iterator();
                            do {
                                if (it.hasNext()) {
                                    z14 = false;
                                    break;
                                }
                                if (((w) it.next()) != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } while (!z12);
                            if (!z14 || jVar != null) {
                            }
                        }
                        if (type == null) {
                            a0VarE0 = L.e0();
                            if (a0VarE0 != null) {
                                type = a0VarE0.getType();
                            } else {
                                type = null;
                            }
                        }
                        arrayList3 = new ArrayList(u8.q.a0(arrayList2, 10));
                        i7 = 0;
                        for (Object obj : arrayList2) {
                            i10 = i7 + 1;
                            if (i7 >= 0) {
                                n3.l.Y();
                                throw null;
                            }
                            type2 = (w) obj;
                            if (type2 == null) {
                                type2 = ((y0) L.X().get(i7)).getType();
                                i9.l.d(type2, "getType(...)");
                            }
                            arrayList3.add(type2);
                            i7 = i10;
                        }
                        if (wVarA == null) {
                            wVarA = L.p();
                            i9.l.b(wVarA);
                        }
                        L = aVar7.L(type, arrayList3, wVarA, jVar);
                    } else {
                        ((ja.a) aVarV2.f3847b).f6982t.getClass();
                    }
                    z10 = false;
                    List<y0> listX3 = r11.X();
                    i9.l.d(listX3, "getValueParameters(...)");
                    arrayList = new ArrayList(u8.q.a0(listX3, i11));
                    while (r10.hasNext()) {
                        if (nVar != null) {
                            tVar2 = (t) u8.p.n0(y0Var2.f471f, nVar.f9609b);
                        } else {
                            tVar2 = null;
                        }
                        aa.a aVar8 = new aa.a(25, y0Var2);
                        ia.a aVar9 = (ia.a) L;
                        if (y0Var2 != null) {
                            aVarV = a.a.v(aVarV2, y0Var2.getAnnotations());
                        } else {
                            aVarV = aVarV2;
                        }
                        ArrayList arrayList7 = arrayList;
                        arrayList7.add(a(aVar9, y0Var2, false, aVarV, aVar3, tVar2, z10, aVar8));
                        arrayList = arrayList7;
                    }
                    arrayList2 = arrayList;
                    if (L instanceof x9.k0) {
                        k0Var = (x9.k0) L;
                    } else {
                        k0Var = null;
                    }
                    if (k0Var == null) {
                        aVar2 = ga.a.METHOD_RETURN_TYPE;
                    } else {
                        aVar2 = ga.a.METHOD_RETURN_TYPE;
                    }
                    ga.a aVar10 = aVar2;
                    if (nVar != null) {
                        tVar = nVar.f9608a;
                    } else {
                        tVar = null;
                    }
                    ia.a aVar11 = (ia.a) L;
                    wVarA = a(aVar11, r11, true, aVarV2, aVar10, tVar, false, o.f9613c);
                    wVarP = L.p();
                    i9.l.b(wVarP);
                    if (u0.c(wVarP, oVar, null)) {
                        z11 = true;
                    } else {
                        a0VarE1 = L.e0();
                        if (a0VarE1 != null) {
                            zC = u0.c(a0VarE1.getType(), oVar, null);
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            listX = L.X();
                            i9.l.d(listX, "getValueParameters(...)");
                            if (listX.isEmpty()) {
                                z13 = false;
                                break;
                            }
                            it2 = listX.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    z13 = false;
                                    break;
                                }
                                type3 = ((y0) it2.next()).getType();
                                i9.l.d(type3, "getType(...)");
                                if (u0.c(type3, oVar, null)) {
                                    z13 = true;
                                    break;
                                }
                            }
                            if (z13) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        jVar = new t8.j(cb.c.f2586a, new ga.g());
                    } else {
                        jVar = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z14 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z14 = false;
                                break;
                            }
                            if (((w) it.next()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } while (!z12);
                        if (!z14) {
                        }
                    }
                    if (type == null) {
                        a0VarE0 = L.e0();
                        if (a0VarE0 != null) {
                            type = a0VarE0.getType();
                        } else {
                            type = null;
                        }
                    }
                    arrayList3 = new ArrayList(u8.q.a0(arrayList2, 10));
                    i7 = 0;
                    while (r4.hasNext()) {
                        i10 = i7 + 1;
                        if (i7 >= 0) {
                            n3.l.Y();
                            throw null;
                        }
                        type2 = (w) obj;
                        if (type2 == null) {
                            type2 = ((y0) L.X().get(i7)).getType();
                            i9.l.d(type2, "getType(...)");
                        }
                        arrayList3.add(type2);
                        i7 = i10;
                    }
                    if (wVarA == null) {
                        wVarA = L.p();
                        i9.l.b(wVarA);
                    }
                    L = aVar11.L(type, arrayList3, wVarA, jVar);
                }
            }
            arrayList4.add(L);
            i11 = 10;
        }
        return arrayList4;
    }
}
