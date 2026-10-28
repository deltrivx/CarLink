package ob;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import nb.a0;
import nb.h0;
import nb.k0;
import nb.v;
import nb.w;
import nb.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f9666a = new u();

    public static ArrayList a(AbstractCollection abstractCollection, h9.n nVar) {
        ArrayList<a0> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        i9.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (!arrayList.isEmpty()) {
                for (a0 a0Var2 : arrayList) {
                    if (a0Var2 != a0Var) {
                        i9.l.b(a0Var2);
                        i9.l.b(a0Var);
                        if (((Boolean) nVar.invoke(a0Var2, a0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [nb.h0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, nb.h0, tb.d] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18, types: [nb.a0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, nb.a0, nb.w] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final a0 b(ArrayList arrayList) {
        a0 a0Var;
        a0 a0VarB;
        arrayList.size();
        ArrayList<a0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0 a0Var2 = (a0) it.next();
            if (a0Var2.D0() instanceof v) {
                Collection collectionM = a0Var2.D0().m();
                i9.l.d(collectionM, "getSupertypes(...)");
                Collection<w> collection = collectionM;
                ArrayList arrayList3 = new ArrayList(u8.q.a0(collection, 10));
                for (w wVar : collection) {
                    i9.l.b(wVar);
                    a0 a0VarD = nb.c.D(wVar);
                    if (a0Var2.E0()) {
                        a0VarD = a0VarD.H0(true);
                    }
                    arrayList3.add(a0VarD);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(a0Var2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        s sVarA = s.f9660a;
        while (it2.hasNext()) {
            sVarA = sVarA.a((w0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (a0 a0VarH0 : arrayList2) {
            if (sVarA == s.f9663d) {
                if (a0VarH0 instanceof i) {
                    i iVar = (i) a0VarH0;
                    a0VarH0 = new i(iVar.f9642b, iVar.f9643c, iVar.f9644d, iVar.f9645e, iVar.f9646f, true);
                }
                i9.l.e(a0VarH0, "<this>");
                a0 a0VarP = nb.d.p(a0VarH0, false);
                a0VarH0 = (a0VarP == null && (a0VarP = nb.c.n(a0VarH0)) == null) ? a0VarH0.H0(false) : a0VarP;
            }
            linkedHashSet.add(a0VarH0);
        }
        ArrayList arrayList4 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a0) it3.next()).C0());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it4.next();
        while (true) {
            a0Var = null;
            if (!it4.hasNext()) {
                break;
            }
            h0 h0Var = (h0) it4.next();
            next = (h0) next;
            next.getClass();
            u0.k kVar = h0.f8997b;
            i9.l.e(h0Var, "other");
            if (!next.isEmpty() || !h0Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) kVar.f12990b).values();
                i9.l.d(collectionValues, "<get-values>(...)");
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    nb.g gVar = (nb.g) next.f12893a.get(iIntValue);
                    nb.g gVar2 = (nb.g) h0Var.f12893a.get(iIntValue);
                    if (gVar != null) {
                        if (!i9.l.a(gVar2, gVar)) {
                            gVar = null;
                        }
                        gVar2 = gVar;
                    } else if (gVar2 == null || !i9.l.a(gVar, gVar2)) {
                        gVar2 = null;
                    }
                    wb.l.a(arrayList5, gVar2);
                }
                next = u0.k.B0(arrayList5);
            }
        }
        h0 h0Var2 = (h0) next;
        if (linkedHashSet.size() == 1) {
            a0VarB = (a0) u8.p.z0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new t(2, this, u.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 0));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    a0 a0Var3 = (a0) it6.next();
                    next2 = (a0) next2;
                    if (next2 != 0 && a0Var3 != null) {
                        k0 k0VarD0 = next2.D0();
                        k0 k0VarD1 = a0Var3.D0();
                        boolean z10 = k0VarD0 instanceof bb.n;
                        if (z10 && (k0VarD1 instanceof bb.n)) {
                            Set set = ((bb.n) k0VarD0).f1688a;
                            Set set2 = ((bb.n) k0VarD1).f1688a;
                            i9.l.e(set, "<this>");
                            i9.l.e(set2, "other");
                            Set setL0 = u8.p.L0(set);
                            u8.u.c0(set2, setL0);
                            bb.n nVar = new bb.n(setL0);
                            h0.f8997b.getClass();
                            h0 h0Var3 = h0.f8998c;
                            i9.l.e(h0Var3, "attributes");
                            next2 = nb.c.u(pb.l.a(pb.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), u8.w.f13122a, h0Var3, nVar, false);
                        } else if (z10) {
                            if (((bb.n) k0VarD0).f1688a.contains(a0Var3)) {
                                next2 = a0Var3;
                            }
                        } else if (!(k0VarD1 instanceof bb.n) || !((bb.n) k0VarD1).f1688a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                a0Var = (a0) next2;
            }
            if (a0Var != null) {
                a0VarB = a0Var;
            } else {
                l.f9655b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new t(2, k.f9654b, m.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 1));
                arrayListA2.isEmpty();
                a0VarB = arrayListA2.size() < 2 ? (a0) u8.p.z0(arrayListA2) : new v(linkedHashSet).b();
            }
        }
        return a0VarB.J0(h0Var2);
    }
}
