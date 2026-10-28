package nb;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static r0 A(List list, p0 p0Var, x9.k kVar, List list2, boolean[] zArr) {
        if (p0Var == null) {
            a(6);
            throw null;
        }
        if (kVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            x9.r0 r0Var = (x9.r0) it.next();
            aa.w0 w0VarE0 = aa.w0.E0(kVar, r0Var.getAnnotations(), r0Var.B(), r0Var.I(), r0Var.getName(), i7, r0Var.c0());
            map.put(r0Var.t(), new f0(w0VarE0.n()));
            map2.put(r0Var, w0VarE0);
            list2.add(w0VarE0);
            i7++;
        }
        g0 g0Var = new g0(1, map);
        r0 r0VarE = r0.e(p0Var, g0Var);
        r0 r0VarE2 = r0.e(new ab.d(p0Var, 1), g0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            x9.r0 r0Var2 = (x9.r0) it2.next();
            aa.w0 w0Var = (aa.w0) map2.get(r0Var2);
            for (w wVar : r0Var2.getUpperBounds()) {
                x9.h hVarL = wVar.D0().l();
                w wVarI = (((hVarL instanceof x9.r0) && n3.n.A0((x9.r0) hVarL, null, 6)) ? r0VarE : r0VarE2).i(wVar, x0.OUT_VARIANCE);
                if (wVarI == null) {
                    return null;
                }
                if (wVarI != wVar && zArr != null) {
                    zArr[0] = true;
                }
                if (w0Var.f446l) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0Var.G0());
                }
                if (!j(wVarI)) {
                    w0Var.k.add(wVarI);
                }
            }
            if (w0Var.f446l) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0Var.G0());
            }
            w0Var.f446l = true;
        }
        return r0VarE;
    }

    public static final h0 B(y9.h hVar) {
        i9.l.e(hVar, "<this>");
        if (hVar.isEmpty()) {
            h0.f8997b.getClass();
            return h0.f8998c;
        }
        u0.k kVar = h0.f8997b;
        List listI = n3.l.I(new g(hVar));
        kVar.getClass();
        return u0.k.B0(listI);
    }

    public static final a0 D(w wVar) {
        i9.l.e(wVar, "<this>");
        w0 w0VarG0 = wVar.G0();
        if (w0VarG0 instanceof p) {
            return ((p) w0VarG0).f9024c;
        }
        if (w0VarG0 instanceof a0) {
            return (a0) w0VarG0;
        }
        throw new cc.s();
    }

    public static final a0 E(a0 a0Var, a0 a0Var2) {
        i9.l.e(a0Var, "<this>");
        i9.l.e(a0Var2, "abbreviatedType");
        return j(a0Var) ? a0Var : new a(a0Var, a0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w0 F(w0 w0Var, w wVar) {
        i9.l.e(w0Var, "<this>");
        if (w0Var instanceof v0) {
            return F(((v0) w0Var).w0(), wVar);
        }
        if (wVar == null || wVar.equals(w0Var)) {
            return w0Var;
        }
        if (w0Var instanceof a0) {
            return new d0((a0) w0Var, wVar);
        }
        if (w0Var instanceof p) {
            return new r((p) w0Var, wVar);
        }
        throw new cc.s();
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 4 ? 3 : 2];
        switch (i7) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i7 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final a0 b(w wVar) {
        i9.l.e(wVar, "<this>");
        w0 w0VarG0 = wVar.G0();
        a0 a0Var = w0VarG0 instanceof a0 ? (a0) w0VarG0 : null;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + wVar).toString());
    }

    public static final w c(ArrayList arrayList, List list, u9.i iVar) {
        w wVarI = new r0(new g0(0, arrayList)).i((w) u8.p.k0(list), x0.OUT_VARIANCE);
        return wVarI == null ? iVar.n() : wVarI;
    }

    public static final qb.d d(qb.d dVar, HashSet hashSet) {
        qb.d dVarD;
        ob.f fVar = ob.f.f9639b;
        k0 k0VarW0 = fVar.w0(dVar);
        if (!hashSet.add(k0VarW0)) {
            return null;
        }
        x9.r0 r0VarS = ob.h.s(k0VarW0);
        if (r0VarS != null) {
            qb.d dVarY0 = n3.n.y0(r0VarS);
            qb.d dVarD2 = d(dVarY0, hashSet);
            if (dVarD2 == null) {
                return null;
            }
            boolean z10 = ob.h.C(fVar.w0(dVarY0)) || ((dVarY0 instanceof qb.f) && ob.h.I((qb.f) dVarY0));
            if ((dVarD2 instanceof qb.f) && ob.h.I((qb.f) dVarD2) && ob.h.H(dVar) && z10) {
                return fVar.m(dVarY0);
            }
            return (ob.h.H(dVarD2) || !ob.h.F(dVar)) ? dVarD2 : fVar.m(dVarD2);
        }
        if (ob.h.C(k0VarW0)) {
            i9.l.e(dVar, "$receiver");
            if (!(dVar instanceof w)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(dVar);
                sb2.append(", ");
                throw new IllegalArgumentException(ob.a.p(i9.y.f6689a, dVar.getClass(), sb2).toString());
            }
            a0 a0VarI = za.f.i((w) dVar);
            if (a0VarI == null || (dVarD = d(a0VarI, hashSet)) == null) {
                return null;
            }
            if (!ob.h.H(dVar)) {
                return dVarD;
            }
            if (!ob.h.H(dVarD) && (!(dVarD instanceof qb.f) || !ob.h.I((qb.f) dVarD))) {
                return fVar.m(dVarD);
            }
        }
        return dVar;
    }

    public static final w0 e(a0 a0Var, a0 a0Var2) {
        i9.l.e(a0Var, "lowerBound");
        i9.l.e(a0Var2, "upperBound");
        return a0Var.equals(a0Var2) ? a0Var : new q(a0Var, a0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w f(w wVar) {
        i9.l.e(wVar, "<this>");
        if (wVar instanceof v0) {
            return ((v0) wVar).D();
        }
        return null;
    }

    public static boolean g(j0 j0Var, qb.e eVar, c cVar) {
        i0 i0Var = i0.f9003c;
        i9.l.e(j0Var, "<this>");
        i9.l.e(eVar, "type");
        ob.c cVar2 = j0Var.f9008c;
        if ((cVar2.v0(eVar) && !cVar2.l(eVar)) || cVar2.e0(eVar)) {
            return true;
        }
        j0Var.c();
        ArrayDeque arrayDeque = j0Var.f9012g;
        i9.l.b(arrayDeque);
        wb.i iVar = j0Var.f9013h;
        i9.l.b(iVar);
        arrayDeque.push(eVar);
        while (!arrayDeque.isEmpty()) {
            qb.e eVar2 = (qb.e) arrayDeque.pop();
            i9.l.b(eVar2);
            if (iVar.add(eVar2)) {
                c cVar3 = cVar2.l(eVar2) ? i0Var : cVar;
                if (cVar3.equals(i0Var)) {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    continue;
                } else {
                    Iterator it = cVar2.s(cVar2.u(eVar2)).iterator();
                    while (it.hasNext()) {
                        qb.e eVarC = cVar3.C(j0Var, (qb.d) it.next());
                        if ((cVar2.v0(eVarC) && !cVar2.l(eVarC)) || cVar2.e0(eVarC)) {
                            j0Var.a();
                            return true;
                        }
                        arrayDeque.add(eVarC);
                    }
                }
            }
        }
        j0Var.a();
        return false;
    }

    public static final w0 h(w0 w0Var, w wVar) {
        i9.l.e(w0Var, "<this>");
        i9.l.e(wVar, "origin");
        return F(w0Var, f(wVar));
    }

    public static boolean i(j0 j0Var, qb.e eVar, qb.h hVar) {
        ob.c cVar = j0Var.f9008c;
        if (cVar.o0(eVar)) {
            return true;
        }
        if (cVar.l(eVar)) {
            return false;
        }
        if (j0Var.f9007b) {
            cVar.u0(eVar);
        }
        return cVar.i(cVar.u(eVar), hVar);
    }

    public static final boolean j(w wVar) {
        i9.l.e(wVar, "<this>");
        w0 w0VarG0 = wVar.G0();
        if (w0VarG0 instanceof pb.i) {
            return true;
        }
        return (w0VarG0 instanceof p) && (((p) w0VarG0).K0() instanceof pb.i);
    }

    public static final boolean k(w wVar) {
        i9.l.e(wVar, "<this>");
        return wVar.G0() instanceof p;
    }

    public static final a0 l(w wVar) {
        i9.l.e(wVar, "<this>");
        w0 w0VarG0 = wVar.G0();
        if (w0VarG0 instanceof p) {
            return ((p) w0VarG0).f9023b;
        }
        if (w0VarG0 instanceof a0) {
            return (a0) w0VarG0;
        }
        throw new cc.s();
    }

    public static final w0 m(w0 w0Var, boolean z10) {
        i9.l.e(w0Var, "<this>");
        l lVarP = d.p(w0Var, z10);
        if (lVarP != null) {
            return lVarP;
        }
        a0 a0VarN = n(w0Var);
        return a0VarN != null ? a0VarN : w0Var.H0(false);
    }

    public static final a0 n(w0 w0Var) {
        v vVar;
        k0 k0VarD0 = w0Var.D0();
        v vVar2 = k0VarD0 instanceof v ? (v) k0VarD0 : null;
        if (vVar2 != null) {
            LinkedHashSet<w> linkedHashSet = vVar2.f9046b;
            ArrayList arrayList = new ArrayList(u8.q.a0(linkedHashSet, 10));
            boolean z10 = false;
            for (w wVarM : linkedHashSet) {
                if (u0.e(wVarM)) {
                    wVarM = m(wVarM.G0(), false);
                    z10 = true;
                }
                arrayList.add(wVarM);
            }
            if (z10) {
                w wVarM2 = vVar2.f9045a;
                if (wVarM2 == null) {
                    wVarM2 = null;
                } else if (u0.e(wVarM2)) {
                    wVarM2 = m(wVarM2.G0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                vVar = new v(linkedHashSet2);
                vVar.f9045a = wVarM2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                return vVar.b();
            }
        }
        return null;
    }

    public static final a0 o(a0 a0Var, List list, h0 h0Var) {
        i9.l.e(a0Var, "<this>");
        i9.l.e(list, "newArguments");
        i9.l.e(h0Var, "newAttributes");
        if (list.isEmpty() && h0Var == a0Var.C0()) {
            return a0Var;
        }
        if (list.isEmpty()) {
            return a0Var.J0(h0Var);
        }
        if (!(a0Var instanceof pb.i)) {
            return t(list, h0Var, a0Var.D0(), a0Var.E0());
        }
        pb.i iVar = (pb.i) a0Var;
        k0 k0Var = iVar.f10380b;
        pb.g gVar = iVar.f10381c;
        pb.k kVar = iVar.f10382d;
        boolean z10 = iVar.f10384f;
        String[] strArr = iVar.f10385g;
        return new pb.i(k0Var, gVar, kVar, list, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static w p(w wVar, List list, y9.h hVar, int i7) {
        if ((i7 & 2) != 0) {
            hVar = wVar.getAnnotations();
        }
        i9.l.e(wVar, "<this>");
        if ((list.isEmpty() || list == wVar.B0()) && hVar == wVar.getAnnotations()) {
            return wVar;
        }
        h0 h0VarC0 = wVar.C0();
        if ((hVar instanceof y9.l) && ((y9.l) hVar).isEmpty()) {
            hVar = y9.g.f15129a;
        }
        h0 h0VarR = r(h0VarC0, hVar);
        w0 w0VarG0 = wVar.G0();
        if (w0VarG0 instanceof p) {
            p pVar = (p) w0VarG0;
            return e(o(pVar.f9023b, list, h0VarR), o(pVar.f9024c, list, h0VarR));
        }
        if (w0VarG0 instanceof a0) {
            return o((a0) w0VarG0, list, h0VarR);
        }
        throw new cc.s();
    }

    public static /* synthetic */ a0 q(a0 a0Var, List list, h0 h0Var, int i7) {
        if ((i7 & 1) != 0) {
            list = a0Var.B0();
        }
        if ((i7 & 2) != 0) {
            h0Var = a0Var.C0();
        }
        return o(a0Var, list, h0Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    public static final h0 r(h0 h0Var, y9.h hVar) {
        h0 h0VarB0;
        i9.l.e(h0Var, "<this>");
        if (h.a(h0Var) == hVar) {
            return h0Var;
        }
        tb.p pVar = h.f8996b;
        o9.u uVar = h.f8995a[0];
        pVar.getClass();
        i9.l.e(uVar, "property");
        g gVar = (g) h0Var.f12893a.get(pVar.f12922a);
        if (gVar != null) {
            if (h0Var.isEmpty()) {
                h0VarB0 = h0Var;
            } else {
                tb.a aVar = h0Var.f12893a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : aVar) {
                    if (!i9.l.a((g) obj, gVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == h0Var.f12893a.c()) {
                    h0VarB0 = h0Var;
                } else {
                    h0.f8997b.getClass();
                    h0VarB0 = u0.k.B0(arrayList);
                }
            }
            if (h0VarB0 != null) {
                h0Var = h0VarB0;
            }
        }
        if (hVar.iterator().hasNext() || !hVar.isEmpty()) {
            g gVar2 = new g(hVar);
            u0.k kVar = h0.f8997b;
            o9.c cVarB = i9.y.f6689a.b(g.class);
            kVar.getClass();
            String strK = cVarB.k();
            i9.l.b(strK);
            if (h0Var.f12893a.get(kVar.T0(strK)) == null) {
                return h0Var.isEmpty() ? new h0(n3.l.I(gVar2)) : u0.k.B0(u8.p.y0(u8.p.J0(h0Var), gVar2));
            }
        }
        return h0Var;
    }

    public static final a0 s(h0 h0Var, x9.e eVar, List list) {
        i9.l.e(h0Var, "attributes");
        i9.l.e(eVar, "descriptor");
        i9.l.e(list, "arguments");
        k0 k0VarT = eVar.t();
        i9.l.d(k0VarT, "getTypeConstructor(...)");
        return t(list, h0Var, k0VarT, false);
    }

    public static a0 t(List list, h0 h0Var, k0 k0Var, boolean z10) {
        gb.o oVarT;
        aa.e0 e0Var;
        gb.o oVarD;
        gb.o oVar;
        gb.o oVarP0;
        i9.l.e(h0Var, "attributes");
        i9.l.e(k0Var, "constructor");
        i9.l.e(list, "arguments");
        if (h0Var.isEmpty() && list.isEmpty() && !z10 && k0Var.l() != null) {
            x9.h hVarL = k0Var.l();
            i9.l.b(hVarL);
            a0 a0VarN = hVarL.n();
            i9.l.d(a0VarN, "getDefaultType(...)");
            return a0VarN;
        }
        x9.h hVarL2 = k0Var.l();
        if (hVarL2 instanceof x9.r0) {
            oVarT = ((x9.r0) hVarL2).n().U();
        } else {
            if (hVarL2 instanceof x9.e) {
                db.e.i(db.e.j(hVarL2));
                boolean zIsEmpty = list.isEmpty();
                ob.g gVar = ob.g.f9640a;
                if (zIsEmpty) {
                    x9.e eVar = (x9.e) hVarL2;
                    e0Var = eVar instanceof aa.e0 ? (aa.e0) eVar : null;
                    if (e0Var == null || (oVarP0 = e0Var.p0(gVar)) == null) {
                        oVarT = eVar.t0();
                        i9.l.d(oVarT, "getUnsubstitutedMemberScope(...)");
                    } else {
                        oVar = oVarP0;
                    }
                } else {
                    x9.e eVar2 = (x9.e) hVarL2;
                    p0 p0VarG = l0.f9017b.g(k0Var, list);
                    e0Var = eVar2 instanceof aa.e0 ? (aa.e0) eVar2 : null;
                    if (e0Var == null || (oVarD = e0Var.D(p0VarG, gVar)) == null) {
                        oVarT = eVar2.S(p0VarG);
                        i9.l.d(oVarT, "getMemberScope(...)");
                    } else {
                        oVar = oVarD;
                    }
                }
                return v(h0Var, k0Var, list, z10, oVar, new x(list, h0Var, k0Var, z10));
            }
            if (hVarL2 instanceof x9.q0) {
                oVarT = pb.l.a(pb.h.SCOPE_FOR_ABBREVIATION_TYPE, true, ((aa.q) ((x9.q0) hVarL2)).getName().f14247a);
            } else {
                if (!(k0Var instanceof v)) {
                    throw new IllegalStateException("Unsupported classifier: " + hVarL2 + " for constructor: " + k0Var);
                }
                oVarT = i2.c.t(((v) k0Var).f9046b, "member scope for intersection type");
            }
        }
        oVar = oVarT;
        return v(h0Var, k0Var, list, z10, oVar, new x(list, h0Var, k0Var, z10));
    }

    public static final a0 u(gb.o oVar, List list, h0 h0Var, k0 k0Var, boolean z10) {
        i9.l.e(h0Var, "attributes");
        i9.l.e(k0Var, "constructor");
        i9.l.e(list, "arguments");
        i9.l.e(oVar, "memberScope");
        b0 b0Var = new b0(k0Var, list, z10, oVar, new x(oVar, list, h0Var, k0Var, z10));
        return h0Var.isEmpty() ? b0Var : new c0(b0Var, h0Var);
    }

    public static final a0 v(h0 h0Var, k0 k0Var, List list, boolean z10, gb.o oVar, h9.k kVar) {
        i9.l.e(h0Var, "attributes");
        i9.l.e(k0Var, "constructor");
        i9.l.e(list, "arguments");
        i9.l.e(oVar, "memberScope");
        b0 b0Var = new b0(k0Var, list, z10, oVar, kVar);
        return h0Var.isEmpty() ? b0Var : new c0(b0Var, h0Var);
    }

    public static final w w(x9.r0 r0Var) {
        i9.l.e(r0Var, "<this>");
        x9.k kVarL = r0Var.l();
        i9.l.d(kVarL, "getContainingDeclaration(...)");
        if (kVarL instanceof x9.i) {
            List listN = ((x9.i) kVarL).t().n();
            i9.l.d(listN, "getParameters(...)");
            ArrayList arrayList = new ArrayList(u8.q.a0(listN, 10));
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                k0 k0VarT = ((x9.r0) it.next()).t();
                i9.l.d(k0VarT, "getTypeConstructor(...)");
                arrayList.add(k0VarT);
            }
            List upperBounds = r0Var.getUpperBounds();
            i9.l.d(upperBounds, "getUpperBounds(...)");
            return c(arrayList, upperBounds, db.e.e(r0Var));
        }
        if (!(kVarL instanceof x9.t)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((x9.t) kVarL).getTypeParameters();
        i9.l.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(u8.q.a0(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            k0 k0VarT2 = ((x9.r0) it2.next()).t();
            i9.l.d(k0VarT2, "getTypeConstructor(...)");
            arrayList2.add(k0VarT2);
        }
        List upperBounds2 = r0Var.getUpperBounds();
        i9.l.d(upperBounds2, "getUpperBounds(...)");
        return c(arrayList2, upperBounds2, db.e.e(r0Var));
    }

    public static boolean x(ob.c cVar, qb.e eVar, qb.e eVar2) {
        if (cVar.n0(eVar) == cVar.n0(eVar2) && cVar.l(eVar) == cVar.l(eVar2) && cVar.e0(eVar) == cVar.e0(eVar2) && cVar.i(cVar.u(eVar), cVar.u(eVar2))) {
            if (cVar.r(eVar, eVar2)) {
                return true;
            }
            int iN0 = cVar.n0(eVar);
            for (int i7 = 0; i7 < iN0; i7++) {
                n0 n0VarZ = cVar.Z(eVar, i7);
                n0 n0VarZ2 = cVar.Z(eVar2, i7);
                if (cVar.f0(n0VarZ) == cVar.f0(n0VarZ2)) {
                    if (!cVar.f0(n0VarZ)) {
                        if (cVar.g(n0VarZ) == cVar.g(n0VarZ2)) {
                            w0 w0VarW = cVar.w(n0VarZ);
                            i9.l.b(w0VarW);
                            w0 w0VarW2 = cVar.w(n0VarZ2);
                            i9.l.b(w0VarW2);
                            if (!y(cVar, w0VarW, w0VarW2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean y(ob.c cVar, qb.d dVar, qb.d dVar2) {
        if (dVar == dVar2) {
            return true;
        }
        a0 a0VarX0 = cVar.x0(dVar);
        a0 a0VarX1 = cVar.x0(dVar2);
        if (a0VarX0 != null && a0VarX1 != null) {
            return x(cVar, a0VarX0, a0VarX1);
        }
        p pVarZ0 = cVar.z0(dVar);
        p pVarZ1 = cVar.z0(dVar2);
        return pVarZ0 != null && pVarZ1 != null && x(cVar, cVar.P(pVarZ0), cVar.P(pVarZ1)) && x(cVar, cVar.a(pVarZ0), cVar.a(pVarZ1));
    }

    public static r0 z(List list, p0 p0Var, x9.k kVar, ArrayList arrayList) {
        if (p0Var == null) {
            a(1);
            throw null;
        }
        if (kVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        r0 r0VarA = A(list, p0Var, kVar, arrayList, null);
        if (r0VarA != null) {
            return r0VarA;
        }
        throw new AssertionError("Substitution failed");
    }

    public abstract qb.e C(j0 j0Var, qb.d dVar);
}
