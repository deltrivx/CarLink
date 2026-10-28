package ob;

import i9.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.a0;
import nb.d0;
import nb.f0;
import nb.h0;
import nb.j0;
import nb.k0;
import nb.l0;
import nb.n0;
import nb.r0;
import nb.u0;
import nb.v;
import nb.w;
import nb.w0;
import nb.x0;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hc.s f9641a = new hc.s(3, "KotlinTypeRefiner");

    public static boolean A(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return ((k0) hVar).o();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static boolean B(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return nb.c.j((w) dVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static boolean C(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            x9.h hVarL = ((k0) hVar).l();
            x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
            return (eVar != null ? eVar.o0() : null) instanceof x9.u;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static boolean D(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return hVar instanceof bb.n;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static boolean E(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return hVar instanceof v;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static boolean F(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        return (dVar instanceof a0) && ((a0) dVar).E0();
    }

    public static boolean G(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return u9.i.I((k0) hVar, u9.n.f13167b);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static boolean H(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return u0.e((w) dVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I(qb.f fVar) {
        if (fVar instanceof w) {
            return u9.i.G((w) fVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(fVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, fVar.getClass(), sb2).toString());
    }

    public static boolean J(qb.c cVar) {
        if (cVar instanceof i) {
            return ((i) cVar).f9647g;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, cVar.getClass(), sb2).toString());
    }

    public static boolean K(n0 n0Var) {
        i9.l.e(n0Var, "$receiver");
        if (n0Var instanceof n0) {
            return n0Var.c();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(n0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, n0Var.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(qb.e eVar) {
        i9.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(qb.e eVar) {
        i9.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    public static a0 N(nb.p pVar) {
        if (pVar instanceof nb.p) {
            return pVar.f9023b;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(pVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, pVar.getClass(), sb2).toString());
    }

    public static w0 O(qb.c cVar) {
        if (cVar instanceof i) {
            return ((i) cVar).f9644d;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, cVar.getClass(), sb2).toString());
    }

    public static w0 P(qb.d dVar) {
        if (dVar instanceof w0) {
            return nb.c.m((w0) dVar, false);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static int Q(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return ((k0) hVar).n().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static Collection R(c cVar, qb.e eVar) {
        k0 k0VarU = cVar.u(eVar);
        if (k0VarU instanceof bb.n) {
            return ((bb.n) k0VarU).f1688a;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    public static n0 S(ab.b bVar) {
        i9.l.e(bVar, "$receiver");
        if (bVar instanceof j) {
            return ((j) bVar).f9648a;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, bVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b T(c cVar, qb.e eVar) {
        if (eVar instanceof a0) {
            w wVar = (w) eVar;
            return new b(cVar, new r0(l0.f9017b.g(wVar.D0(), wVar.B0())));
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    public static Collection U(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            Collection collectionM = ((k0) hVar).m();
            i9.l.d(collectionM, "getSupertypes(...)");
            return collectionM;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static k0 V(qb.e eVar) {
        i9.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return ((a0) eVar).D0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    public static j W(qb.c cVar) {
        if (cVar instanceof i) {
            return ((i) cVar).f9643c;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, cVar.getClass(), sb2).toString());
    }

    public static a0 X(nb.p pVar) {
        if (pVar instanceof nb.p) {
            return pVar.f9024c;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(pVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, pVar.getClass(), sb2).toString());
    }

    public static a0 Y(qb.e eVar, boolean z10) {
        i9.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return ((a0) eVar).H0(z10);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    public static qb.d Z(c cVar, qb.d dVar) {
        if (dVar instanceof qb.e) {
            return cVar.L((qb.e) dVar);
        }
        if (!(dVar instanceof nb.p)) {
            throw new IllegalStateException("sealed");
        }
        nb.p pVar = (nb.p) dVar;
        return cVar.s0(cVar.L(cVar.l0(pVar)), cVar.L(cVar.z(pVar)));
    }

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        switch (i7) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i7) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(qb.h hVar, qb.h hVar2) {
        i9.l.e(hVar, "c1");
        i9.l.e(hVar2, "c2");
        if (!(hVar instanceof k0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(hVar);
            sb2.append(", ");
            throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
        }
        if (hVar2 instanceof k0) {
            return hVar.equals(hVar2);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(hVar2);
        sb3.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar2.getClass(), sb3).toString());
    }

    public static int c(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return ((w) dVar).B0().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static qb.g d(qb.e eVar) {
        i9.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            return (qb.g) eVar;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    public static qb.c e(c cVar, qb.f fVar) {
        i9.l.e(fVar, "$receiver");
        if (fVar instanceof a0) {
            if (fVar instanceof d0) {
                return cVar.x(((d0) fVar).f8982b);
            }
            if (fVar instanceof i) {
                return (i) fVar;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(fVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, fVar.getClass(), sb2).toString());
    }

    public static nb.l f(qb.e eVar) {
        i9.l.e(eVar, "$receiver");
        if (eVar instanceof a0) {
            if (eVar instanceof nb.l) {
                return (nb.l) eVar;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
    }

    public static nb.p g(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            w0 w0VarG0 = ((w) dVar).G0();
            if (w0VarG0 instanceof nb.p) {
                return (nb.p) w0VarG0;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static a0 h(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            w0 w0VarG0 = ((w) dVar).G0();
            if (w0VarG0 instanceof a0) {
                return (a0) w0VarG0;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static f0 i(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return n3.n.Q((w) dVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static a0 j(qb.e eVar) {
        List listB0;
        ArrayList arrayList;
        if (!(eVar instanceof a0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(eVar);
            sb2.append(", ");
            throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
        }
        a0 a0Var = (a0) eVar;
        f fVar = f.f9638a;
        lb.e eVar2 = null;
        if (a0Var.B0().size() == a0Var.D0().n().size() && ((listB0 = a0Var.B0()) == null || !listB0.isEmpty())) {
            Iterator it = listB0.iterator();
            while (it.hasNext()) {
                x0 x0VarA = ((n0) it.next()).a();
                x0 x0Var = x0.INVARIANT;
                if (x0VarA != x0Var) {
                    List listN = a0Var.D0().n();
                    i9.l.d(listN, "getParameters(...)");
                    ArrayList<t8.j> arrayListO0 = u8.p.O0(listB0, listN);
                    arrayList = new ArrayList(u8.q.a0(arrayListO0, 10));
                    for (t8.j jVar : arrayListO0) {
                        n0 n0VarQ = (n0) jVar.f12830a;
                        x9.r0 r0Var = (x9.r0) jVar.f12831b;
                        if (n0VarQ.a() != x0Var) {
                            w0 w0VarG0 = (n0VarQ.c() || n0VarQ.a() != x0.IN_VARIANCE) ? null : n0VarQ.b().G0();
                            i9.l.b(r0Var);
                            n0VarQ = n3.n.Q(new i(qb.b.f11022a, new j(n0VarQ, eVar2, r0Var, 6), w0VarG0, (h0) null, false, 56));
                        }
                        arrayList.add(n0VarQ);
                    }
                    r0 r0Var2 = new r0(l0.f9017b.g(a0Var.D0(), arrayList));
                    int size = listB0.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        n0 n0Var = (n0) listB0.get(i7);
                        n0 n0Var2 = (n0) arrayList.get(i7);
                        if (n0Var.a() != x0Var) {
                            List upperBounds = ((x9.r0) a0Var.D0().n().get(i7)).getUpperBounds();
                            i9.l.d(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(fVar.J(r0Var2.g((w) it2.next(), x0Var).G0()));
                            }
                            if (!n0Var.c() && n0Var.a() == x0.OUT_VARIANCE) {
                                arrayList2.add(fVar.J(n0Var.b().G0()));
                            }
                            w wVarB = n0Var2.b();
                            i9.l.c(wVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            j jVar2 = ((i) wVarB).f9643c;
                            jVar2.getClass();
                            jVar2.f9649b = new lb.e(2, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return nb.c.t(arrayList, a0Var.C0(), a0Var.D0(), a0Var.E0());
        }
        return null;
    }

    public static qb.b k(qb.c cVar) {
        if (cVar instanceof i) {
            return ((i) cVar).f9642b;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, cVar.getClass(), sb2).toString());
    }

    public static j0 l(boolean z10, f fVar, f fVar2, int i7) {
        if ((i7 & 4) != 0) {
            fVar = f.f9639b;
        }
        f fVar3 = fVar;
        if ((i7 & 8) != 0) {
            fVar2 = f.f9638a;
        }
        return new j0(z10, true, fVar3, fVar2, g.f9640a);
    }

    public static w0 m(c cVar, qb.e eVar, qb.e eVar2) {
        i9.l.e(eVar, "lowerBound");
        i9.l.e(eVar2, "upperBound");
        if (!(eVar instanceof a0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(cVar);
            sb2.append(", ");
            throw new IllegalArgumentException(a.p(y.f6689a, cVar.getClass(), sb2).toString());
        }
        if (eVar2 instanceof a0) {
            return nb.c.e((a0) eVar, (a0) eVar2);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(cVar);
        sb3.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, cVar.getClass(), sb3).toString());
    }

    public static final String n(k0 k0Var) {
        StringBuilder sb2 = new StringBuilder();
        o("type: " + k0Var, sb2);
        o("hashCode: " + k0Var.hashCode(), sb2);
        o("javaClass: " + k0Var.getClass().getCanonicalName(), sb2);
        for (x9.k kVarL = k0Var.l(); kVarL != null; kVarL = kVarL.l()) {
            o("fqName: " + ya.g.f15193c.u(kVarL), sb2);
            o("javaClass: " + kVarL.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    public static final void o(String str, StringBuilder sb2) {
        i9.l.e(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    public static n0 p(qb.d dVar, int i7) {
        i9.l.e(dVar, "$receiver");
        if (dVar instanceof w) {
            return (n0) ((w) dVar).B0().get(i7);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static x9.r0 q(qb.h hVar, int i7) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            Object obj = ((k0) hVar).n().get(i7);
            i9.l.d(obj, "get(...)");
            return (x9.r0) obj;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static w0 r(c cVar, n0 n0Var) {
        i9.l.e(n0Var, "$receiver");
        if (cVar.f0(n0Var)) {
            return null;
        }
        if (n0Var instanceof n0) {
            return n0Var.b().G0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(n0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, n0Var.getClass(), sb2).toString());
    }

    public static x9.r0 s(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            x9.h hVarL = ((k0) hVar).l();
            if (hVarL instanceof x9.r0) {
                return (x9.r0) hVarL;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static qb.i t(n0 n0Var) {
        i9.l.e(n0Var, "$receiver");
        if (n0Var instanceof n0) {
            x0 x0VarA = n0Var.a();
            i9.l.d(x0VarA, "getProjectionKind(...)");
            return n3.r.q(x0VarA);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(n0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, n0Var.getClass(), sb2).toString());
    }

    public static boolean u(qb.d dVar, wa.c cVar) {
        i9.l.e(dVar, "$receiver");
        i9.l.e(cVar, "fqName");
        if (dVar instanceof w) {
            return ((w) dVar).getAnnotations().i(cVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, dVar.getClass(), sb2).toString());
    }

    public static boolean v(x9.r0 r0Var, qb.h hVar) {
        if (hVar == null ? true : hVar instanceof k0) {
            return n3.n.A0(r0Var, (k0) hVar, 4);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(r0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, r0Var.getClass(), sb2).toString());
    }

    public static boolean w(qb.e eVar, qb.e eVar2) {
        i9.l.e(eVar, "a");
        i9.l.e(eVar2, "b");
        if (!(eVar instanceof a0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(eVar);
            sb2.append(", ");
            throw new IllegalArgumentException(a.p(y.f6689a, eVar.getClass(), sb2).toString());
        }
        if (eVar2 instanceof a0) {
            return ((a0) eVar).B0() == ((a0) eVar2).B0();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(eVar2);
        sb3.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, eVar2.getClass(), sb3).toString());
    }

    public static boolean x(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return u9.i.I((k0) hVar, u9.n.f13166a);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static boolean y(qb.h hVar) {
        i9.l.e(hVar, "$receiver");
        if (hVar instanceof k0) {
            return ((k0) hVar).l() instanceof x9.e;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }

    public static boolean z(qb.h hVar) {
        if (hVar instanceof k0) {
            x9.h hVarL = ((k0) hVar).l();
            x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
            return (eVar == null || eVar.i() != x.f14747b || eVar.f() == x9.f.f14703c || eVar.f() == x9.f.f14704d || eVar.f() == x9.f.f14705e) ? false : true;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar);
        sb2.append(", ");
        throw new IllegalArgumentException(a.p(y.f6689a, hVar.getClass(), sb2).toString());
    }
}
