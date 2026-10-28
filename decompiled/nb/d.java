package nb;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8981a = new d();

    public static final boolean b(ob.c cVar, qb.e eVar) {
        w0 w0VarW;
        return cVar.o(eVar) || ((eVar instanceof qb.c) && (w0VarW = cVar.w(cVar.d0(cVar.n((qb.c) eVar)))) != null && cVar.o(cVar.D(w0VarW)));
    }

    public static final boolean c(ob.c cVar, j0 j0Var, qb.e eVar, qb.e eVar2, boolean z10) {
        Collection<qb.d> collectionE = cVar.e(eVar);
        if ((collectionE instanceof Collection) && collectionE.isEmpty()) {
            return false;
        }
        for (qb.d dVar : collectionE) {
            if (i9.l.a(cVar.w0(dVar), cVar.u(eVar2))) {
                return true;
            }
            if (z10 && n(f8981a, j0Var, eVar2, dVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(j0 j0Var, qb.e eVar, qb.h hVar) {
        c cVarM;
        i0 i0Var = i0.f9003c;
        ob.c cVar = j0Var.f9008c;
        cVar.c(eVar, hVar);
        if (cVar.f(hVar) || !cVar.v0(eVar)) {
            if (!cVar.t0(hVar)) {
                wb.g gVar = new wb.g();
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
                        qb.e eVarT = cVar.t(eVar2);
                        if (eVarT == null) {
                            eVarT = eVar2;
                        }
                        if (cVar.i(cVar.u(eVarT), hVar)) {
                            gVar.add(eVarT);
                            cVarM = i0Var;
                        } else {
                            cVarM = cVar.n0(eVarT) == 0 ? i0.f9002b : cVar.M(eVarT);
                        }
                        if (cVarM.equals(i0Var)) {
                            cVarM = null;
                        }
                        if (cVarM != null) {
                            Iterator it = cVar.s(cVar.u(eVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(cVarM.C(j0Var, (qb.d) it.next()));
                            }
                        }
                    }
                }
                j0Var.a();
                return gVar;
            }
            if (cVar.i(cVar.u(eVar), hVar)) {
                a0 a0VarT = cVar.t(eVar);
                if (a0VarT != null) {
                    eVar = a0VarT;
                }
                return n3.l.I(eVar);
            }
        }
        return u8.w.f13122a;
    }

    public static List e(j0 j0Var, qb.e eVar, qb.h hVar) {
        List listD = d(j0Var, eVar, hVar);
        ob.c cVar = j0Var.f9008c;
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                qb.g gVarY = cVar.y((qb.e) obj);
                int iB0 = cVar.b0(gVarY);
                int i7 = 0;
                while (true) {
                    if (i7 >= iB0) {
                        arrayList.add(obj);
                        break;
                    }
                    w0 w0VarW = cVar.w(cVar.v(gVarY, i7));
                    if ((w0VarW != null ? cVar.z0(w0VarW) : null) != null) {
                        break;
                    }
                    i7++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0202  */
    /* JADX WARN: Code duplicated, block: B:154:0x0261  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:? A[LOOP:12: B:31:0x008e->B:332:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:? A[LOOP:13: B:47:0x00cd->B:335:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean f(j0 j0Var, qb.d dVar, qb.d dVar2) {
        Boolean boolValueOf;
        Boolean bool;
        List<qb.e> listD;
        i0 i0Var;
        w0 w0VarW;
        k0 k0VarU;
        k0 k0VarU2;
        x9.r0 r0VarK;
        Collection collectionS;
        Iterator it;
        Collection collectionS2;
        Iterator it2;
        boolean z10;
        ob.c cVar = j0Var.f9008c;
        w0 w0VarD = j0Var.d(j0Var.e(dVar));
        w0 w0VarD2 = j0Var.d(j0Var.e(dVar2));
        a0 a0VarC = cVar.C(w0VarD);
        a0 a0VarD = cVar.D(w0VarD2);
        if (!cVar.b(a0VarC) && !cVar.b(a0VarD)) {
            cVar.q0(a0VarC);
            cVar.u0(a0VarC);
            cVar.u0(a0VarD);
            qb.c cVarH0 = cVar.h0(a0VarD);
            qb.d dVarE = cVarH0 != null ? cVar.E(cVarH0) : null;
            d dVar3 = f8981a;
            if (cVarH0 == null || dVarE == null) {
                k0VarU = cVar.u(a0VarD);
                if (cVar.h(k0VarU)) {
                    cVar.l(a0VarD);
                    collectionS2 = cVar.s(k0VarU);
                    if (!(collectionS2 instanceof Collection) && collectionS2.isEmpty()) {
                        z10 = true;
                        break;
                    }
                    it2 = collectionS2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = true;
                            break;
                        }
                        if (!n(dVar3, j0Var, a0VarC, (qb.d) it2.next())) {
                            z10 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z10);
                } else {
                    k0VarU2 = cVar.u(a0VarC);
                    if (a0VarC instanceof qb.c) {
                        r0VarK = k(cVar, a0VarD, a0VarC);
                        if (r0VarK == null && cVar.B(r0VarK, cVar.u(a0VarD))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (cVar.h(k0VarU2)) {
                            collectionS = cVar.s(k0VarU2);
                            if ((collectionS instanceof Collection) || !collectionS.isEmpty()) {
                                it = collectionS.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        r0VarK = k(cVar, a0VarD, a0VarC);
                                        if (r0VarK == null) {
                                        }
                                    } else if (!(((qb.d) it.next()) instanceof qb.c)) {
                                    }
                                }
                            } else {
                                r0VarK = k(cVar, a0VarD, a0VarC);
                                if (r0VarK == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (cVar.l(a0VarD)) {
                    dVarE = cVar.p(dVarE);
                } else if (cVar.e0(a0VarD)) {
                    dVarE = cVar.T(dVarE);
                }
                if (n(dVar3, j0Var, a0VarC, dVarE)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    k0VarU = cVar.u(a0VarD);
                    if (cVar.h(k0VarU)) {
                        cVar.l(a0VarD);
                        collectionS2 = cVar.s(k0VarU);
                        if (!(collectionS2 instanceof Collection)) {
                            it2 = collectionS2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                if (!n(dVar3, j0Var, a0VarC, (qb.d) it2.next())) {
                                    z10 = false;
                                    break;
                                }
                            }
                        } else {
                            it2 = collectionS2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                if (!n(dVar3, j0Var, a0VarC, (qb.d) it2.next())) {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    } else {
                        k0VarU2 = cVar.u(a0VarC);
                        if (a0VarC instanceof qb.c) {
                            r0VarK = k(cVar, a0VarD, a0VarC);
                            if (r0VarK == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (cVar.h(k0VarU2)) {
                                collectionS = cVar.s(k0VarU2);
                                if (collectionS instanceof Collection) {
                                    it = collectionS.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            r0VarK = k(cVar, a0VarD, a0VarC);
                                            if (r0VarK == null) {
                                            }
                                        } else if (!(((qb.d) it.next()) instanceof qb.c)) {
                                        }
                                    }
                                } else {
                                    it = collectionS.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            r0VarK = k(cVar, a0VarD, a0VarC);
                                            if (r0VarK == null) {
                                            }
                                        } else if (!(((qb.d) it.next()) instanceof qb.c)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                }
            }
        } else if (j0Var.f9006a) {
            boolValueOf = Boolean.TRUE;
        } else if (!cVar.l(a0VarC) || cVar.l(a0VarD)) {
            a0 a0VarA0 = cVar.A0(a0VarC);
            a0 a0VarA1 = cVar.A0(a0VarD);
            i9.l.e(cVar, "context");
            i9.l.e(a0VarA0, "a");
            i9.l.e(a0VarA1, "b");
            boolValueOf = Boolean.valueOf(c.y(cVar, a0VarA0, a0VarA1));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        qb.e eVarC = cVar.C(w0VarD);
        a0 a0VarD2 = cVar.D(w0VarD2);
        i0 i0Var2 = i0.f9003c;
        i0 i0Var3 = i0.f9002b;
        if (!cVar.l(a0VarD2) && !cVar.e0(eVarC) && !cVar.r0(eVarC) && ((!(eVarC instanceof qb.c) || !cVar.a0((qb.c) eVarC)) && !c.g(j0Var, eVarC, i0Var3))) {
            if (cVar.e0(a0VarD2) || c.g(j0Var, a0VarD2, i0.f9004d) || cVar.v0(eVarC)) {
                return false;
            }
            k0 k0VarU3 = cVar.u(a0VarD2);
            i9.l.e(k0VarU3, "end");
            if (!c.i(j0Var, eVarC, k0VarU3)) {
                j0Var.c();
                ArrayDeque arrayDeque = j0Var.f9012g;
                i9.l.b(arrayDeque);
                wb.i iVar = j0Var.f9013h;
                i9.l.b(iVar);
                arrayDeque.push(eVarC);
                loop0: while (true) {
                    if (arrayDeque.isEmpty()) {
                        j0Var.a();
                        return false;
                    }
                    qb.e eVar = (qb.e) arrayDeque.pop();
                    i9.l.b(eVar);
                    if (iVar.add(eVar)) {
                        i0 i0Var4 = cVar.l(eVar) ? i0Var2 : i0Var3;
                        if (i0Var4.equals(i0Var2)) {
                            i0Var4 = null;
                        }
                        if (i0Var4 == null) {
                            continue;
                        } else {
                            Iterator it3 = cVar.s(cVar.u(eVar)).iterator();
                            while (it3.hasNext()) {
                                qb.e eVarC2 = i0Var4.C(j0Var, (qb.d) it3.next());
                                if (c.i(j0Var, eVarC2, k0VarU3)) {
                                    j0Var.a();
                                    break loop0;
                                }
                                arrayDeque.add(eVarC2);
                            }
                        }
                    }
                }
            }
        }
        if (!cVar.o(eVarC) && !cVar.o(a0VarD2)) {
            bool = null;
        } else if (b(cVar, eVarC) && b(cVar, a0VarD2)) {
            bool = Boolean.TRUE;
        } else if (cVar.o(eVarC)) {
            if (c(cVar, j0Var, eVarC, a0VarD2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (cVar.o(a0VarD2)) {
            k0 k0VarU4 = cVar.u(eVarC);
            if (k0VarU4 instanceof v) {
                Collection collectionS3 = cVar.s(k0VarU4);
                if (!(collectionS3 instanceof Collection) || !collectionS3.isEmpty()) {
                    Iterator it4 = collectionS3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            a0 a0VarX0 = cVar.x0((qb.d) it4.next());
                            if (a0VarX0 == null || !cVar.o(a0VarX0)) {
                            }
                        } else if (!c(cVar, j0Var, a0VarD2, eVarC, true)) {
                            bool = null;
                        }
                    }
                } else if (!c(cVar, j0Var, a0VarD2, eVarC, true)) {
                    bool = null;
                }
            } else if (!c(cVar, j0Var, a0VarD2, eVarC, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        k0 k0VarU5 = cVar.u(a0VarD2);
        if ((cVar.i(cVar.u(eVarC), k0VarU5) && cVar.c0(k0VarU5) == 0) || cVar.k0(cVar.u(a0VarD2))) {
            return true;
        }
        i9.l.e(k0VarU5, "superConstructor");
        if (cVar.v0(eVarC)) {
            listD = e(j0Var, eVarC, k0VarU5);
        } else if (cVar.f(k0VarU5) || cVar.j0(k0VarU5)) {
            wb.g<qb.e> gVar = new wb.g();
            j0Var.c();
            ArrayDeque arrayDeque2 = j0Var.f9012g;
            i9.l.b(arrayDeque2);
            wb.i iVar2 = j0Var.f9013h;
            i9.l.b(iVar2);
            arrayDeque2.push(eVarC);
            while (!arrayDeque2.isEmpty()) {
                qb.e eVar2 = (qb.e) arrayDeque2.pop();
                i9.l.b(eVar2);
                if (iVar2.add(eVar2)) {
                    if (cVar.v0(eVar2)) {
                        gVar.add(eVar2);
                        i0Var = i0Var2;
                    } else {
                        i0Var = i0Var3;
                    }
                    if (i0Var.equals(i0Var2)) {
                        i0Var = null;
                    }
                    if (i0Var != null) {
                        Iterator it5 = cVar.s(cVar.u(eVar2)).iterator();
                        while (it5.hasNext()) {
                            arrayDeque2.add(i0Var.C(j0Var, (qb.d) it5.next()));
                        }
                    }
                }
            }
            j0Var.a();
            ArrayList arrayList = new ArrayList();
            for (qb.e eVar3 : gVar) {
                i9.l.b(eVar3);
                u8.u.c0(e(j0Var, eVar3, k0VarU5), arrayList);
            }
            listD = arrayList;
        } else {
            listD = d(j0Var, eVarC, k0VarU5);
        }
        listD.size();
        int i7 = 10;
        ArrayList<qb.e> arrayList2 = new ArrayList(u8.q.a0(listD, 10));
        for (qb.e eVar4 : listD) {
            a0 a0VarX1 = cVar.x0(j0Var.d(eVar4));
            if (a0VarX1 != null) {
                eVar4 = a0VarX1;
            }
            arrayList2.add(eVar4);
        }
        int size = arrayList2.size();
        if (size == 0) {
            k0 k0VarU6 = cVar.u(eVarC);
            if (cVar.f(k0VarU6)) {
                return cVar.g0(k0VarU6);
            }
            if (cVar.g0(cVar.u(eVarC))) {
                return true;
            }
            j0Var.c();
            ArrayDeque arrayDeque3 = j0Var.f9012g;
            i9.l.b(arrayDeque3);
            wb.i iVar3 = j0Var.f9013h;
            i9.l.b(iVar3);
            arrayDeque3.push(eVarC);
            while (!arrayDeque3.isEmpty()) {
                qb.e eVar5 = (qb.e) arrayDeque3.pop();
                i9.l.b(eVar5);
                if (iVar3.add(eVar5)) {
                    i0 i0Var5 = cVar.v0(eVar5) ? i0Var2 : i0Var3;
                    if (i0Var5.equals(i0Var2)) {
                        i0Var5 = null;
                    }
                    if (i0Var5 == null) {
                        continue;
                    } else {
                        Iterator it6 = cVar.s(cVar.u(eVar5)).iterator();
                        while (it6.hasNext()) {
                            qb.e eVarC3 = i0Var5.C(j0Var, (qb.d) it6.next());
                            if (cVar.g0(cVar.u(eVarC3))) {
                                j0Var.a();
                                return true;
                            }
                            arrayDeque3.add(eVarC3);
                        }
                    }
                }
            }
            j0Var.a();
            return false;
        }
        if (size == 1) {
            return m(j0Var, cVar.y((qb.e) u8.p.j0(arrayList2)), a0VarD2);
        }
        qb.a aVar = new qb.a(cVar.c0(k0VarU5));
        int iC0 = cVar.c0(k0VarU5);
        int i10 = 0;
        boolean z11 = false;
        while (i10 < iC0) {
            z11 = z11 || cVar.d(cVar.k(k0VarU5, i10)) != qb.i.OUT;
            if (!z11) {
                ArrayList arrayList3 = new ArrayList(u8.q.a0(arrayList2, i7));
                for (qb.e eVar6 : arrayList2) {
                    n0 n0VarH = cVar.H(eVar6, i10);
                    if (n0VarH != null) {
                        if (cVar.g(n0VarH) != qb.i.INV) {
                            n0VarH = null;
                        }
                        if (n0VarH != null && (w0VarW = cVar.w(n0VarH)) != null) {
                            arrayList3.add(w0VarW);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + eVar6 + ", subType: " + eVarC + ", superType: " + a0VarD2).toString());
                }
                aVar.add(cVar.G(cVar.S(arrayList3)));
            }
            i10++;
            i7 = 10;
        }
        if (!z11 && m(j0Var, aVar, a0VarD2)) {
            return true;
        }
        boolean zM = false;
        for (qb.e eVar7 : arrayList2) {
            if (!zM) {
                zM = m(j0Var, cVar.y(eVar7), a0VarD2);
            }
        }
        return zM;
    }

    public static boolean h(j0 j0Var, qb.d dVar, qb.d dVar2) {
        i9.l.e(dVar, "a");
        i9.l.e(dVar2, "b");
        ob.c cVar = j0Var.f9008c;
        if (dVar == dVar2) {
            return true;
        }
        if (l(cVar, dVar) && l(cVar, dVar2)) {
            w0 w0VarD = j0Var.d(j0Var.e(dVar));
            w0 w0VarD2 = j0Var.d(j0Var.e(dVar2));
            a0 a0VarC = cVar.C(w0VarD);
            if (!cVar.i(cVar.w0(w0VarD), cVar.w0(w0VarD2))) {
                return false;
            }
            if (cVar.n0(a0VarC) == 0) {
                return cVar.N(w0VarD) || cVar.N(w0VarD2) || cVar.l(a0VarC) == cVar.l(cVar.C(w0VarD2));
            }
        }
        d dVar3 = f8981a;
        return n(dVar3, j0Var, dVar, dVar2) && n(dVar3, j0Var, dVar2, dVar);
    }

    public static x9.r0 k(ob.c cVar, qb.d dVar, qb.d dVar2) {
        w0 w0VarW;
        int iN0 = cVar.n0(dVar);
        int i7 = 0;
        while (true) {
            if (i7 >= iN0) {
                return null;
            }
            n0 n0VarZ = cVar.Z(dVar, i7);
            n0 n0Var = cVar.f0(n0VarZ) ? null : n0VarZ;
            if (n0Var != null && (w0VarW = cVar.w(n0Var)) != null) {
                boolean z10 = cVar.i0(cVar.C(w0VarW)) && cVar.i0(cVar.C(dVar2));
                if (w0VarW.equals(dVar2) || (z10 && i9.l.a(cVar.w0(w0VarW), cVar.w0(dVar2)))) {
                    return cVar.k(cVar.w0(dVar), i7);
                }
                x9.r0 r0VarK = k(cVar, w0VarW, dVar2);
                if (r0VarK != null) {
                    return r0VarK;
                }
            }
            i7++;
        }
    }

    public static boolean l(ob.c cVar, qb.d dVar) {
        if (!cVar.q(cVar.w0(dVar))) {
            return false;
        }
        cVar.A(dVar);
        return (cVar.V(dVar) || cVar.r0(dVar) || cVar.m0(dVar)) ? false : true;
    }

    public static boolean m(j0 j0Var, qb.g gVar, qb.e eVar) {
        boolean zN;
        i9.l.e(gVar, "capturedSubArguments");
        ob.c cVar = j0Var.f9008c;
        k0 k0VarU = cVar.u(eVar);
        int iB0 = cVar.b0(gVar);
        int iC0 = cVar.c0(k0VarU);
        if (iB0 == iC0 && iB0 == cVar.n0(eVar)) {
            for (int i7 = 0; i7 < iC0; i7++) {
                n0 n0VarZ = cVar.Z(eVar, i7);
                w0 w0VarW = cVar.w(n0VarZ);
                if (w0VarW != null) {
                    n0 n0VarV = cVar.v(gVar, i7);
                    cVar.g(n0VarV);
                    w0 w0VarW2 = cVar.w(n0VarV);
                    i9.l.b(w0VarW2);
                    qb.i iVarD = cVar.d(cVar.k(k0VarU, i7));
                    qb.i iVarG = cVar.g(n0VarZ);
                    qb.i iVar = qb.i.INV;
                    if (iVarD == iVar) {
                        iVarD = iVarG;
                    } else if (iVarG != iVar && iVarD != iVarG) {
                        iVarD = null;
                    }
                    if (iVarD == null) {
                        return j0Var.f9006a;
                    }
                    if (iVarD == iVar) {
                        o(cVar, w0VarW2, w0VarW);
                        o(cVar, w0VarW, w0VarW2);
                    }
                    int i10 = j0Var.f9011f;
                    if (i10 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + w0VarW2).toString());
                    }
                    j0Var.f9011f = i10 + 1;
                    int iOrdinal = iVarD.ordinal();
                    d dVar = f8981a;
                    if (iOrdinal == 0) {
                        zN = n(dVar, j0Var, w0VarW, w0VarW2);
                    } else if (iOrdinal == 1) {
                        zN = n(dVar, j0Var, w0VarW2, w0VarW);
                    } else {
                        if (iOrdinal != 2) {
                            throw new cc.s();
                        }
                        zN = h(j0Var, w0VarW2, w0VarW);
                    }
                    j0Var.f9011f--;
                    if (!zN) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean n(d dVar, j0 j0Var, qb.d dVar2, qb.d dVar3) {
        i9.l.e(dVar2, "subType");
        i9.l.e(dVar3, "superType");
        if (dVar2 == dVar3) {
            return true;
        }
        if (j0Var.b(dVar2, dVar3)) {
            return f(j0Var, dVar2, dVar3);
        }
        return false;
    }

    public static void o(ob.c cVar, qb.d dVar, qb.d dVar2) {
        qb.d dVarX0 = cVar.x0(dVar);
        if (dVarX0 instanceof qb.c) {
            qb.c cVar2 = (qb.c) dVarX0;
            if (!cVar.j(cVar2) && cVar.f0(cVar.d0(cVar.n(cVar2))) && cVar.F(cVar2) == qb.b.f11022a) {
                cVar.w0(dVar2);
            }
        }
    }

    public static l p(w0 w0Var, boolean z10) {
        boolean zE;
        i9.l.e(w0Var, "type");
        if (w0Var instanceof l) {
            return (l) w0Var;
        }
        w0Var.D0();
        if ((w0Var.D0().l() instanceof x9.r0) || (w0Var instanceof ob.i)) {
            x9.h hVarL = w0Var.D0().l();
            aa.w0 w0Var2 = hVarL instanceof aa.w0 ? (aa.w0) hVarL : null;
            zE = true;
            if (w0Var2 == null || w0Var2.f446l) {
                zE = (z10 && (w0Var.D0().l() instanceof x9.r0)) ? u0.e(w0Var) : true ^ c.g(ob.f.f9639b.I(), c.l(w0Var), i0.f9002b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (w0Var instanceof p) {
            p pVar = (p) w0Var;
            i9.l.a(pVar.f9023b.D0(), pVar.f9024c.D0());
        }
        return new l(c.l(w0Var).H0(false), z10);
    }

    public void a(y9.h hVar, y9.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((y9.b) it.next()).a());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((y9.b) it2.next()).a());
        }
    }

    public p0 g(k0 k0Var, List list) {
        i9.l.e(k0Var, "typeConstructor");
        i9.l.e(list, "arguments");
        List listN = k0Var.n();
        i9.l.d(listN, "getParameters(...)");
        x9.r0 r0Var = (x9.r0) u8.p.t0(listN);
        if (r0Var == null || !r0Var.g0()) {
            return new s((x9.r0[]) listN.toArray(new x9.r0[0]), (n0[]) list.toArray(new n0[0]), false);
        }
        List listN2 = k0Var.n();
        i9.l.d(listN2, "getParameters(...)");
        ArrayList arrayList = new ArrayList(u8.q.a0(listN2, 10));
        Iterator it = listN2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x9.r0) it.next()).t());
        }
        return new g0(1, u8.b0.Z0(u8.p.O0(arrayList, list)));
    }

    public a0 i(da.a aVar, h0 h0Var, boolean z10, int i7, boolean z11) {
        h0 h0VarB0;
        x9.q0 q0Var = (x9.q0) aVar.f3848c;
        n0 n0VarJ = j(new f0(((lb.s) q0Var).E0(), x0.INVARIANT), aVar, null, i7);
        w wVarB = n0VarJ.b();
        i9.l.d(wVarB, "getType(...)");
        a0 a0VarB = c.b(wVarB);
        if (c.j(a0VarB)) {
            return a0VarB;
        }
        n0VarJ.a();
        a(a0VarB.getAnnotations(), h.a(h0Var));
        if (!c.j(a0VarB)) {
            if (c.j(a0VarB)) {
                h0VarB0 = a0VarB.C0();
            } else {
                h0 h0VarC0 = a0VarB.C0();
                u0.k kVar = h0.f8997b;
                i9.l.e(h0VarC0, "other");
                if (h0Var.isEmpty() && h0VarC0.isEmpty()) {
                    h0VarB0 = h0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) kVar.f12990b).values();
                    i9.l.d(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        g gVar = (g) h0Var.f12893a.get(iIntValue);
                        g gVar2 = (g) h0VarC0.f12893a.get(iIntValue);
                        if (gVar != null) {
                            if (gVar2 != null) {
                                gVar = new g(n3.l.r(gVar.f8992a, gVar2.f8992a));
                            }
                            gVar2 = gVar;
                        } else if (gVar2 == null) {
                            gVar2 = null;
                        } else if (gVar != null) {
                            gVar2 = new g(n3.l.r(gVar2.f8992a, gVar.f8992a));
                        }
                        wb.l.a(arrayList, gVar2);
                    }
                    h0VarB0 = u0.k.B0(arrayList);
                }
            }
            a0VarB = c.q(a0VarB, null, h0VarB0, 1);
        }
        a0 a0VarI = u0.i(a0VarB, z10);
        if (!z11) {
            return a0VarI;
        }
        aa.g gVar3 = ((aa.h) q0Var).f342h;
        i9.l.d(gVar3, "getTypeConstructor(...)");
        return c.E(a0VarI, c.u(gb.n.f6198b, (List) aVar.f3849d, h0Var, gVar3, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0 j(n0 n0Var, da.a aVar, x9.r0 r0Var, int i7) {
        x0 x0VarI;
        y9.a aVar2 = (x9.q0) aVar.f3848c;
        if (i7 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((aa.q) aVar2).getName());
        }
        if (n0Var.c()) {
            i9.l.b(r0Var);
            return u0.j(r0Var);
        }
        w wVarB = n0Var.b();
        i9.l.d(wVarB, "getType(...)");
        k0 k0VarD0 = wVarB.D0();
        i9.l.e(k0VarD0, "constructor");
        x9.h hVarL = k0VarD0.l();
        n0 n0Var2 = hVarL instanceof x9.r0 ? (n0) ((Map) aVar.f3850e).get(hVarL) : null;
        x0 x0Var = x0.INVARIANT;
        if (n0Var2 == null) {
            a0 a0VarB = c.b(n0Var.b().G0());
            if (!c.j(a0VarB) && u0.c(a0VarB, rb.a.f12309c, null)) {
                k0 k0VarD1 = a0VarB.D0();
                x9.h hVarL2 = k0VarD1.l();
                k0VarD1.n().size();
                a0VarB.B0().size();
                if (!(hVarL2 instanceof x9.r0)) {
                    int i10 = 0;
                    if (!(hVarL2 instanceof x9.q0)) {
                        a0 a0VarQ = q(a0VarB, aVar, i7);
                        r0.d(a0VarQ);
                        for (Object obj : a0VarQ.B0()) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                n3.l.Y();
                                throw null;
                            }
                            n0 n0Var3 = (n0) obj;
                            if (!n0Var3.c()) {
                                w wVarB2 = n0Var3.b();
                                i9.l.d(wVarB2, "getType(...)");
                                if (!u0.c(wVarB2, rb.a.f12308b, null)) {
                                }
                            }
                            i10 = i11;
                        }
                        return new f0(a0VarQ, n0Var.a());
                    }
                    x9.q0 q0Var = (x9.q0) hVarL2;
                    if (aVar.A(q0Var)) {
                        return new f0(pb.l.c(pb.k.RECURSIVE_TYPE_ALIAS, ((aa.q) q0Var).getName().f14247a), x0Var);
                    }
                    List listB0 = a0VarB.B0();
                    ArrayList arrayList = new ArrayList(u8.q.a0(listB0, 10));
                    for (Object obj2 : listB0) {
                        int i12 = i10 + 1;
                        if (i10 < 0) {
                            n3.l.Y();
                            throw null;
                        }
                        arrayList.add(j((n0) obj2, aVar, (x9.r0) k0VarD1.n().get(i10), i7 + 1));
                        i10 = i12;
                    }
                    List listN = ((aa.h) q0Var).f342h.n();
                    ArrayList arrayList2 = new ArrayList(u8.q.a0(listN, 10));
                    Iterator it = listN.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((x9.r0) it.next()).a());
                    }
                    return new f0(c.E(i(new da.a(aVar, q0Var, arrayList, u8.b0.Z0(u8.p.O0(arrayList2, arrayList)), 7), a0VarB.C0(), a0VarB.E0(), i7 + 1, false), q(a0VarB, aVar, i7)), n0Var.a());
                }
            }
            return n0Var;
        }
        if (n0Var2.c()) {
            i9.l.b(r0Var);
            return u0.j(r0Var);
        }
        w0 w0VarG0 = n0Var2.b().G0();
        x0 x0VarA = n0Var2.a();
        i9.l.d(x0VarA, "getProjectionKind(...)");
        x0 x0VarA2 = n0Var.a();
        i9.l.d(x0VarA2, "getProjectionKind(...)");
        if (x0VarA2 != x0VarA && x0VarA2 != x0Var && x0VarA == x0Var) {
            x0VarA = x0VarA2;
        }
        if (r0Var == null || (x0VarI = r0Var.I()) == null) {
            x0VarI = x0Var;
        }
        if (x0VarI == x0VarA || x0VarI == x0Var || x0VarA != x0Var) {
            x0Var = x0VarA;
        }
        a(wVarB.getAnnotations(), w0VarG0.getAnnotations());
        a0 a0VarI = u0.i(c.b(w0VarG0), wVarB.E0());
        h0 h0VarC0 = wVarB.C0();
        if (!c.j(a0VarI)) {
            if (c.j(a0VarI)) {
                h0VarC0 = a0VarI.C0();
            } else {
                h0 h0VarC1 = a0VarI.C0();
                h0VarC0.getClass();
                u0.k kVar = h0.f8997b;
                i9.l.e(h0VarC1, "other");
                if (!h0VarC0.isEmpty() || !h0VarC1.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) kVar.f12990b).values();
                    i9.l.d(collectionValues, "<get-values>(...)");
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        g gVar = (g) h0VarC0.f12893a.get(iIntValue);
                        g gVar2 = (g) h0VarC1.f12893a.get(iIntValue);
                        if (gVar != null) {
                            if (gVar2 != null) {
                                gVar = new g(n3.l.r(gVar.f8992a, gVar2.f8992a));
                            }
                            gVar2 = gVar;
                        } else if (gVar2 == null) {
                            gVar2 = null;
                        } else if (gVar != null) {
                            gVar2 = new g(n3.l.r(gVar2.f8992a, gVar.f8992a));
                        }
                        wb.l.a(arrayList3, gVar2);
                    }
                    h0VarC0 = u0.k.B0(arrayList3);
                }
            }
            a0VarI = c.q(a0VarI, null, h0VarC0, 1);
        }
        return new f0(a0VarI, x0Var);
    }

    public a0 q(a0 a0Var, da.a aVar, int i7) {
        k0 k0VarD0 = a0Var.D0();
        List listB0 = a0Var.B0();
        ArrayList arrayList = new ArrayList(u8.q.a0(listB0, 10));
        int i10 = 0;
        for (Object obj : listB0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                n3.l.Y();
                throw null;
            }
            n0 n0Var = (n0) obj;
            n0 n0VarJ = j(n0Var, aVar, (x9.r0) k0VarD0.n().get(i10), i7 + 1);
            if (!n0VarJ.c()) {
                n0VarJ = new f0(u0.h(n0VarJ.b(), n0Var.b().E0()), n0VarJ.a());
            }
            arrayList.add(n0VarJ);
            i10 = i11;
        }
        return c.q(a0Var, arrayList, null, 2);
    }
}
