package ob;

import i9.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nb.a0;
import nb.f0;
import nb.j0;
import nb.k0;
import nb.n0;
import nb.v;
import nb.w;
import nb.w0;
import nb.x0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9638a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f9639b = new f();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [nb.v] */
    /* JADX WARN: Type inference failed for: r0v2, types: [nb.v] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [x9.r0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static a0 K(a0 a0Var) {
        w wVarB;
        k0 k0VarD0 = a0Var.D0();
        ?? r8 = 0;
        if (k0VarD0 instanceof ab.c) {
            ab.c cVar = (ab.c) k0VarD0;
            n0 n0Var = cVar.f502a;
            n0 n0Var2 = n0Var.a() == x0.IN_VARIANCE ? n0Var : null;
            w0 w0VarG0 = (n0Var2 == null || (wVarB = n0Var2.b()) == null) ? null : wVarB.G0();
            if (cVar.f503b == null) {
                Collection collectionM = cVar.m();
                ArrayList arrayList = new ArrayList(u8.q.a0(collectionM, 10));
                Iterator it = collectionM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w) it.next()).G0());
                }
                cVar.f503b = new j(n0Var, new lb.e(1, arrayList), (r0) r8, 8);
            }
            j jVar = cVar.f503b;
            i9.l.b(jVar);
            return new i(qb.b.f11022a, jVar, w0VarG0, a0Var.C0(), a0Var.E0(), 32);
        }
        if (!(k0VarD0 instanceof v) || !a0Var.E0()) {
            return a0Var;
        }
        ?? r10 = (v) k0VarD0;
        LinkedHashSet linkedHashSet = r10.f9046b;
        ArrayList arrayList2 = new ArrayList(u8.q.a0(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            arrayList2.add(n3.n.E0((w) it2.next()));
            z10 = true;
        }
        if (z10) {
            w wVar = r10.f9045a;
            w0 w0VarE0 = wVar != null ? n3.n.E0(wVar) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            v vVar = new v(linkedHashSet2);
            vVar.f9045a = w0VarE0;
            r8 = vVar;
        }
        if (r8 != 0) {
            r10 = r8;
        }
        return r10.b();
    }

    @Override // ob.c
    public void A(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        h.g(dVar);
    }

    @Override // ob.c
    public a0 A0(qb.e eVar) {
        return h.Y(eVar, false);
    }

    @Override // ob.c
    public boolean B(r0 r0Var, qb.h hVar) {
        return h.v(r0Var, hVar);
    }

    @Override // ob.c
    public a0 C(qb.d dVar) {
        a0 a0VarN;
        i9.l.e(dVar, "<this>");
        nb.p pVarG = h.g(dVar);
        if (pVarG != null && (a0VarN = h.N(pVarG)) != null) {
            return a0VarN;
        }
        a0 a0VarH = h.h(dVar);
        i9.l.b(a0VarH);
        return a0VarH;
    }

    @Override // ob.c
    public a0 D(qb.d dVar) {
        a0 a0VarX;
        i9.l.e(dVar, "<this>");
        nb.p pVarG = h.g(dVar);
        if (pVarG != null && (a0VarX = h.X(pVarG)) != null) {
            return a0VarX;
        }
        a0 a0VarH = h.h(dVar);
        i9.l.b(a0VarH);
        return a0VarH;
    }

    @Override // ob.c
    public w0 E(qb.c cVar) {
        return h.O(cVar);
    }

    @Override // ob.c
    public qb.b F(qb.c cVar) {
        return h.k(cVar);
    }

    @Override // ob.c
    public f0 G(qb.d dVar) {
        return h.i(dVar);
    }

    @Override // ob.c
    public n0 H(qb.e eVar, int i7) {
        i9.l.e(eVar, "<this>");
        if (i7 < 0 || i7 >= h.c(eVar)) {
            return null;
        }
        return h.p(eVar, i7);
    }

    public j0 I() {
        return h.l(false, this, null, 24);
    }

    public w0 J(qb.d dVar) {
        w0 w0VarE;
        i9.l.e(dVar, "type");
        if (!(dVar instanceof w)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        w0 w0VarG0 = ((w) dVar).G0();
        if (w0VarG0 instanceof a0) {
            w0VarE = K((a0) w0VarG0);
        } else {
            if (!(w0VarG0 instanceof nb.p)) {
                throw new cc.s();
            }
            nb.p pVar = (nb.p) w0VarG0;
            a0 a0Var = pVar.f9024c;
            a0 a0Var2 = pVar.f9023b;
            a0 a0VarK = K(a0Var2);
            a0 a0VarK2 = K(a0Var);
            w0VarE = (a0VarK == a0Var2 && a0VarK2 == a0Var) ? w0VarG0 : nb.c.e(a0VarK, a0VarK2);
        }
        w wVarF = nb.c.f(w0VarG0);
        return nb.c.F(w0VarE, wVarF != null ? J(wVarF) : null);
    }

    @Override // ob.c
    public a0 L(qb.e eVar) {
        return h.Y(eVar, true);
    }

    @Override // ob.c
    public b M(qb.e eVar) {
        return h.T(this, eVar);
    }

    @Override // ob.c
    public boolean N(w0 w0Var) {
        i9.l.e(w0Var, "<this>");
        return h.F(C(w0Var)) != h.F(D(w0Var));
    }

    @Override // ob.c
    public a0 P(nb.p pVar) {
        return h.N(pVar);
    }

    @Override // ob.c
    public a0 Q(w wVar) {
        return h.h(wVar);
    }

    @Override // ob.c
    public w0 S(ArrayList arrayList) {
        a0 a0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (w0) u8.p.z0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            z10 = z10 || nb.c.j(w0Var);
            if (w0Var instanceof a0) {
                a0Var = (a0) w0Var;
            } else {
                if (!(w0Var instanceof nb.p)) {
                    throw new cc.s();
                }
                a0Var = ((nb.p) w0Var).f9023b;
                z11 = true;
            }
            arrayList2.add(a0Var);
        }
        if (z10) {
            return pb.l.c(pb.k.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        u uVar = u.f9666a;
        if (!z11) {
            return uVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(nb.c.D((w0) it2.next()));
        }
        return nb.c.e(uVar.b(arrayList2), uVar.b(arrayList3));
    }

    @Override // ob.c
    public w0 T(qb.d dVar) {
        return h.P(dVar);
    }

    @Override // ob.c
    public boolean V(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        a0 a0VarH = h.h(dVar);
        return (a0VarH != null ? h.f(a0VarH) : null) != null;
    }

    @Override // ob.c
    public n0 Z(qb.d dVar, int i7) {
        return h.p(dVar, i7);
    }

    @Override // ob.c
    public a0 a(nb.p pVar) {
        return h.X(pVar);
    }

    @Override // ob.c
    public boolean a0(qb.c cVar) {
        return h.J(cVar);
    }

    @Override // ob.c
    public boolean b(qb.e eVar) {
        return h.B(eVar);
    }

    @Override // ob.c
    public int b0(qb.g gVar) {
        i9.l.e(gVar, "<this>");
        if (gVar instanceof qb.e) {
            return h.c((qb.d) gVar);
        }
        if (gVar instanceof qb.a) {
            return ((qb.a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + y.f6689a.b(gVar.getClass())).toString());
    }

    @Override // ob.c
    public void c(qb.e eVar, qb.h hVar) {
    }

    @Override // ob.c
    public int c0(qb.h hVar) {
        return h.Q(hVar);
    }

    @Override // ob.c
    public qb.i d(r0 r0Var) {
        i9.l.e(r0Var, "$receiver");
        x0 x0VarI = r0Var.I();
        i9.l.d(x0VarI, "getVariance(...)");
        return n3.r.q(x0VarI);
    }

    @Override // ob.c
    public n0 d0(ab.b bVar) {
        return h.S(bVar);
    }

    @Override // ob.c
    public Collection e(qb.e eVar) {
        return h.R(this, eVar);
    }

    @Override // ob.c
    public boolean e0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        return h.f(eVar) != null;
    }

    @Override // ob.c
    public boolean f(qb.h hVar) {
        return h.y(hVar);
    }

    @Override // ob.c
    public boolean f0(n0 n0Var) {
        return h.K(n0Var);
    }

    @Override // ob.c
    public qb.i g(n0 n0Var) {
        return h.t(n0Var);
    }

    @Override // ob.c
    public boolean g0(qb.h hVar) {
        return h.G(hVar);
    }

    @Override // ob.c
    public boolean h(qb.h hVar) {
        return h.E(hVar);
    }

    @Override // ob.c
    public qb.c h0(qb.e eVar) {
        qb.f fVar;
        i9.l.e(eVar, "<this>");
        i9.l.e(eVar, "<this>");
        nb.l lVarF = h.f(eVar);
        if (lVarF == null || (fVar = lVarF.f9015b) == null) {
            fVar = (qb.f) eVar;
        }
        return h.e(this, fVar);
    }

    @Override // ob.c
    public boolean i(qb.h hVar, qb.h hVar2) {
        return h.b(hVar, hVar2);
    }

    @Override // ob.c
    public boolean i0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        a0 a0VarH = h.h(eVar);
        return (a0VarH != null ? h0(a0VarH) : null) != null;
    }

    @Override // ob.c
    public boolean j(qb.c cVar) {
        return cVar instanceof ab.a;
    }

    @Override // ob.c
    public boolean j0(qb.h hVar) {
        return h.D(hVar);
    }

    @Override // ob.c
    public r0 k(qb.h hVar, int i7) {
        return h.q(hVar, i7);
    }

    @Override // ob.c
    public boolean k0(qb.h hVar) {
        return h.x(hVar);
    }

    @Override // ob.c
    public boolean l(qb.d dVar) {
        return h.F(dVar);
    }

    @Override // ob.c
    public a0 l0(nb.p pVar) {
        return h.N(pVar);
    }

    public qb.d m(qb.d dVar) {
        a0 a0VarY;
        i9.l.e(dVar, "<this>");
        a0 a0VarH = h.h(dVar);
        return (a0VarH == null || (a0VarY = h.Y(a0VarH, true)) == null) ? dVar : a0VarY;
    }

    @Override // ob.c
    public boolean m0(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        return !i9.l.a(h.V(C(dVar)), h.V(D(dVar)));
    }

    @Override // ob.c
    public j n(qb.c cVar) {
        return h.W(cVar);
    }

    @Override // ob.c
    public int n0(qb.d dVar) {
        return h.c(dVar);
    }

    @Override // ob.c
    public boolean o(qb.e eVar) {
        return h.D(h.V(eVar));
    }

    @Override // ob.c
    public boolean o0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        return h.G(w0(eVar)) && !h.H(eVar);
    }

    @Override // ob.c
    public qb.d p(qb.d dVar) {
        return h.Z(this, dVar);
    }

    @Override // ob.c
    public boolean q(qb.h hVar) {
        return h.A(hVar);
    }

    @Override // ob.c
    public void q0(qb.e eVar) {
        h.M(eVar);
    }

    @Override // ob.c
    public boolean r(qb.e eVar, qb.e eVar2) {
        return h.w(eVar, eVar2);
    }

    @Override // ob.c
    public boolean r0(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        return dVar instanceof oa.g;
    }

    @Override // ob.c
    public Collection s(qb.h hVar) {
        return h.U(hVar);
    }

    @Override // ob.c
    public w0 s0(qb.f fVar, qb.f fVar2) {
        return h.m(this, fVar, fVar2);
    }

    @Override // ob.c
    public a0 t(qb.e eVar) {
        return h.j(eVar);
    }

    @Override // ob.c
    public boolean t0(qb.h hVar) {
        return h.z(hVar);
    }

    @Override // ob.c
    public k0 u(qb.e eVar) {
        return h.V(eVar);
    }

    @Override // ob.c
    public void u0(qb.e eVar) {
        h.L(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ob.c
    public n0 v(qb.g gVar, int i7) {
        i9.l.e(gVar, "<this>");
        if (gVar instanceof qb.f) {
            return h.p((qb.d) gVar, i7);
        }
        if (gVar instanceof qb.a) {
            E e7 = ((qb.a) gVar).get(i7);
            i9.l.d(e7, "get(...)");
            return (n0) e7;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + y.f6689a.b(gVar.getClass())).toString());
    }

    @Override // ob.c
    public boolean v0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        return h.y(h.V(eVar));
    }

    @Override // ob.c
    public w0 w(n0 n0Var) {
        return h.r(this, n0Var);
    }

    @Override // ob.c
    public k0 w0(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        a0 a0VarH = h.h(dVar);
        if (a0VarH == null) {
            a0VarH = C(dVar);
        }
        return h.V(a0VarH);
    }

    @Override // ob.c
    public qb.c x(a0 a0Var) {
        return h.e(this, a0Var);
    }

    @Override // ob.c
    public a0 x0(qb.d dVar) {
        return h.h(dVar);
    }

    @Override // ob.c
    public qb.g y(qb.e eVar) {
        return h.d(eVar);
    }

    @Override // ob.c
    public a0 z(nb.p pVar) {
        return h.X(pVar);
    }

    @Override // ob.c
    public nb.p z0(qb.d dVar) {
        return h.g(dVar);
    }
}
