package x9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hc.s f14743a = new hc.s(3, "InvalidModuleNotifier");

    public static final a2.b a(nb.a0 a0Var, i iVar, int i7) {
        if (iVar == null || pb.l.f(iVar)) {
            return null;
        }
        int size = iVar.q().size() + i7;
        if (iVar.H()) {
            List listSubList = a0Var.B0().subList(i7, size);
            k kVarL = iVar.l();
            return new a2.b(iVar, listSubList, a(a0Var, kVarL instanceof i ? (i) kVarL : null, size));
        }
        if (size != a0Var.B0().size()) {
            za.d.o(iVar);
        }
        return new a2.b(iVar, a0Var.B0().subList(i7, a0Var.B0().size()), (a2.b) null);
    }

    public static final void b(g0 g0Var, wa.c cVar, ArrayList arrayList) {
        i9.l.e(g0Var, "<this>");
        i9.l.e(cVar, "fqName");
        g0Var.b(cVar, arrayList);
    }

    public static final List c(i iVar) {
        List listN;
        Object next;
        nb.k0 k0VarT;
        List listQ = iVar.q();
        i9.l.d(listQ, "getDeclaredTypeParameters(...)");
        if (!iVar.H() && !(iVar.l() instanceof b)) {
            return listQ;
        }
        int i7 = db.e.f3900a;
        db.b bVar = db.b.f3894b;
        yb.j jVarR = yb.l.R(iVar, bVar);
        List listU = yb.l.U(new yb.i(new yb.h(new u8.o(4, jVarR instanceof yb.e ? ((yb.e) jVarR).a() : new yb.d(jVarR, 1)), true, q.f14737d), q.f14738e, yb.o.f15282i));
        yb.j jVarR2 = yb.l.R(iVar, bVar);
        Iterator it = (jVarR2 instanceof yb.e ? ((yb.e) jVarR2).a() : new yb.d(jVarR2, 1)).iterator();
        do {
            listN = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof e));
        e eVar = (e) next;
        if (eVar != null && (k0VarT = eVar.t()) != null) {
            listN = k0VarT.n();
        }
        if (listN == null) {
            listN = u8.w.f13122a;
        }
        if (listU.isEmpty() && listN.isEmpty()) {
            List listQ2 = iVar.q();
            i9.l.d(listQ2, "getDeclaredTypeParameters(...)");
            return listQ2;
        }
        ArrayList<r0> arrayListX0 = u8.p.x0(listN, listU);
        ArrayList arrayList = new ArrayList(u8.q.a0(arrayListX0, 10));
        for (r0 r0Var : arrayListX0) {
            i9.l.b(r0Var);
            arrayList.add(new d(r0Var, iVar, listQ.size()));
        }
        return u8.p.x0(arrayList, listQ);
    }

    public static final e d(y yVar, wa.b bVar) {
        i9.l.e(yVar, "<this>");
        i9.l.e(bVar, "classId");
        h hVarE = e(yVar, bVar);
        if (hVarE instanceof e) {
            return (e) hVarE;
        }
        return null;
    }

    public static final h e(y yVar, wa.b bVar) {
        i9.l.e(yVar, "<this>");
        i9.l.e(bVar, "classId");
        if (yVar.V(za.k.f15802a) != null) {
            throw new ClassCastException();
        }
        h0 h0VarF = yVar.F(bVar.f14236a);
        wa.d dVar = bVar.f14237b.f14240a;
        dVar.getClass();
        List listE = wa.d.e(dVar);
        gb.k kVar = ((aa.c0) h0VarF).f326g;
        wa.e eVar = (wa.e) u8.p.k0(listE);
        fa.b bVar2 = fa.b.f5508g;
        h hVarA = kVar.a(eVar, bVar2);
        if (hVarA != null) {
            for (wa.e eVar2 : listE.subList(1, listE.size())) {
                if (hVarA instanceof e) {
                    h hVarA2 = ((e) hVarA).n0().a(eVar2, bVar2);
                    hVarA = hVarA2 instanceof e ? (e) hVarA2 : null;
                    if (hVarA != null) {
                    }
                }
            }
            return hVarA;
        }
        return null;
    }

    public static final e f(y yVar, wa.b bVar, da.a aVar) {
        i9.l.e(yVar, "<this>");
        i9.l.e(bVar, "classId");
        i9.l.e(aVar, "notFoundClasses");
        e eVarD = d(yVar, bVar);
        return eVarD != null ? eVarD : aVar.w(bVar, yb.l.U(yb.l.S(yb.l.R(bVar, r.f14740h), q.f14735b)));
    }

    public static final h g(k kVar) {
        k kVarL = kVar.l();
        if (kVarL == null || (kVar instanceof d0)) {
            return null;
        }
        if (!(kVarL.l() instanceof d0)) {
            return g(kVarL);
        }
        if (kVarL instanceof h) {
            return (h) kVarL;
        }
        return null;
    }

    public static final boolean h(g0 g0Var, wa.c cVar) {
        i9.l.e(g0Var, "<this>");
        i9.l.e(cVar, "fqName");
        return g0Var.a(cVar);
    }

    public static final ArrayList i(g0 g0Var, wa.c cVar) {
        i9.l.e(g0Var, "<this>");
        i9.l.e(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        b(g0Var, cVar, arrayList);
        return arrayList;
    }

    public static final e j(y yVar, wa.c cVar) {
        gb.o oVarN0;
        i9.l.e(yVar, "<this>");
        i9.l.e(cVar, "fqName");
        wa.d dVar = cVar.f14240a;
        if (!dVar.c()) {
            gb.k kVar = ((aa.c0) yVar.F(cVar.b())).f326g;
            wa.e eVarF = dVar.f();
            fa.b bVar = fa.b.f5502a;
            h hVarA = kVar.a(eVarF, bVar);
            e eVar = hVarA instanceof e ? (e) hVarA : null;
            if (eVar != null) {
                return eVar;
            }
            e eVarJ = j(yVar, cVar.b());
            h hVarA2 = (eVarJ == null || (oVarN0 = eVarJ.n0()) == null) ? null : oVarN0.a(dVar.f(), bVar);
            if (hVarA2 instanceof e) {
                return (e) hVarA2;
            }
        }
        return null;
    }
}
