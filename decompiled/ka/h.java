package ka;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import nb.h0;
import nb.k0;
import nb.r0;
import nb.s0;
import nb.x0;
import x9.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends nb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7426c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f7427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa.c f7428e;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(j jVar) {
        this.f7428e = jVar;
        da.a aVar = jVar.f7432j;
        super(((ja.a) aVar.f3847b).f6964a);
        mb.n nVar = ((ja.a) aVar.f3847b).f6964a;
        g gVar = new g(jVar, 2);
        mb.k kVar = (mb.k) nVar;
        kVar.getClass();
        this.f7427d = new mb.i(kVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(lb.h hVar) {
        this.f7428e = hVar;
        jb.k kVar = hVar.f8321l;
        super(kVar.f7043a.f7018a);
        mb.k kVar2 = kVar.f7043a.f7018a;
        lb.d dVar = new lb.d(hVar, 6);
        kVar2.getClass();
        this.f7427d = new mb.i(kVar2, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:126:0x0313  */
    /* JADX WARN: Code duplicated, block: B:129:0x0320  */
    /* JADX WARN: Code duplicated, block: B:132:0x0329  */
    /* JADX WARN: Code duplicated, block: B:133:0x032e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0349  */
    /* JADX WARN: Code duplicated, block: B:143:0x035b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0369  */
    /* JADX WARN: Code duplicated, block: B:149:0x0384 A[LOOP:5: B:147:0x037e->B:149:0x0384, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:176:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x0208  */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x017a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Collection] */
    @Override // nb.f
    public final Collection b() {
        ?? arrayList;
        String str;
        wa.c cVar;
        wa.c cVar2;
        ArrayList arrayList2;
        nb.a0 a0VarS;
        ArrayList<na.d> arrayList3;
        x9.e eVar;
        nb.w wVarI;
        ArrayList arrayList4;
        nb.w wVarD0;
        ArrayList arrayList5;
        nb.w wVarB;
        k0 k0VarD0;
        k0 k0VarD1;
        String strB;
        wa.c cVarA;
        int i7 = this.f7426c;
        aa.c cVar3 = this.f7428e;
        switch (i7) {
            case 0:
                j jVar = (j) cVar3;
                da.a aVar = jVar.f7432j;
                Class cls = jVar.f7430h.f3881a;
                boolean zA = i9.l.a(cls, Object.class);
                u8.w wVar = u8.w.f13122a;
                if (zA) {
                    arrayList = wVar;
                } else {
                    e2.g gVar = new e2.g(2);
                    ArrayList arrayList6 = gVar.f4168a;
                    Type genericSuperclass = cls.getGenericSuperclass();
                    gVar.a(genericSuperclass != null ? genericSuperclass : Object.class);
                    gVar.b(cls.getGenericInterfaces());
                    List listJ = n3.l.J(arrayList6.toArray(new Type[arrayList6.size()]));
                    arrayList = new ArrayList(u8.q.a0(listJ, 10));
                    Iterator it = listJ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new da.q((Type) it.next()));
                    }
                }
                ArrayList arrayList7 = new ArrayList(arrayList.size());
                ArrayList arrayList8 = new ArrayList(0);
                ja.c cVar4 = jVar.f7442u;
                wa.c cVar5 = ga.y.f6138n;
                i9.l.d(cVar5, "PURELY_IMPLEMENTS_ANNOTATION");
                y9.b bVarG = cVar4.g(cVar5);
                if (bVarG != null) {
                    Object objB0 = u8.p.B0(bVarG.b().values());
                    bb.w wVar2 = objB0 instanceof bb.w ? (bb.w) objB0 : null;
                    if (wVar2 != null && (str = (String) wVar2.f1683a) != null) {
                        wa.i iVar = wa.i.f14280a;
                        int i10 = 0;
                        while (true) {
                            int length = str.length();
                            wa.i iVar2 = wa.i.f14282c;
                            if (i10 < length) {
                                char cCharAt = str.charAt(i10);
                                int iOrdinal = iVar.ordinal();
                                if (iOrdinal == 0) {
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        iVar = wa.i.f14281b;
                                        i10++;
                                    }
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        throw new cc.s();
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        iVar = wa.i.f14281b;
                                        i10++;
                                    }
                                } else {
                                    if (cCharAt == '.') {
                                        iVar = iVar2;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i10++;
                                }
                            } else {
                                cVar = iVar != iVar2 ? new wa.c(str) : null;
                            }
                        }
                    }
                }
                if (cVar == null || cVar.f14240a.c() || !cVar.c(u9.o.f13206j)) {
                    cVar = null;
                }
                x0 x0Var = x0.INVARIANT;
                if (cVar == null) {
                    LinkedHashMap linkedHashMap = ga.j.f6092a;
                    cVar2 = (wa.c) ga.j.f6093b.get(db.e.g(jVar));
                    if (cVar2 == null) {
                        a0VarS = null;
                    }
                    for (da.q qVar : arrayList) {
                        wVarD0 = ((a2.b) aVar.f3850e).d0(qVar, o9.e0.R(s0.f9033a, false, null, 7));
                        oa.d dVar = ((ja.a) aVar.f3847b).f6980r;
                        dVar.getClass();
                        arrayList5 = arrayList8;
                        wVarB = dVar.b(new oa.r(null, false, aVar, ga.a.TYPE_USE, true), wVarD0, wVar, null, false);
                        if (wVarB == null) {
                            wVarB = wVarD0;
                        }
                        if (wVarB.D0().l() instanceof x9.c0) {
                            arrayList5.add(qVar);
                        }
                        k0VarD0 = wVarB.D0();
                        if (a0VarS != null) {
                            k0VarD1 = a0VarS.D0();
                        } else {
                            k0VarD1 = null;
                        }
                        if (!i9.l.a(k0VarD0, k0VarD1) && !u9.i.y(wVarB)) {
                            arrayList7.add(wVarB);
                        }
                        arrayList8 = arrayList5;
                    }
                    arrayList3 = arrayList8;
                    eVar = jVar.f7431i;
                    if (eVar != null) {
                        wVarI = new r0(n3.r.t(eVar, jVar)).i(eVar.n(), x0Var);
                    } else {
                        wVarI = null;
                    }
                    wb.l.a(arrayList7, wVarI);
                    wb.l.a(arrayList7, a0VarS);
                    if (!arrayList3.isEmpty()) {
                        jb.m mVar = ((ja.a) aVar.f3847b).f6969f;
                        arrayList4 = new ArrayList(u8.q.a0(arrayList3, 10));
                        for (na.d dVar2 : arrayList3) {
                            i9.l.c(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList4.add(((da.q) dVar2).f3883a.toString());
                        }
                        mVar.b(jVar, arrayList4);
                    }
                    return !arrayList7.isEmpty() ? u8.p.J0(arrayList7) : n3.l.I(((ja.a) aVar.f3847b).f6977o.k().e());
                }
                cVar2 = cVar;
                x9.y yVar = ((ja.a) aVar.f3847b).f6977o;
                int i11 = db.e.f3900a;
                i9.l.e(yVar, "<this>");
                wa.d dVar3 = cVar2.f14240a;
                dVar3.c();
                x9.h hVarA = ((aa.c0) yVar.F(cVar2.b())).f326g.a(dVar3.f(), fa.b.f5509h);
                x9.e eVar2 = hVarA instanceof x9.e ? (x9.e) hVarA : null;
                if (eVar2 == null) {
                    a0VarS = null;
                } else {
                    int size = eVar2.t().n().size();
                    List listN = jVar.f7437p.n();
                    i9.l.d(listN, "getParameters(...)");
                    int size2 = listN.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(u8.q.a0(listN, 10));
                        Iterator it2 = listN.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new nb.f0(((x9.r0) it2.next()).n(), x0Var));
                        }
                    } else if (size2 == 1 && size > 1 && cVar == null) {
                        nb.f0 f0Var = new nb.f0(((x9.r0) u8.p.A0(listN)).n(), x0Var);
                        n9.d dVar4 = new n9.d(1, size, 1);
                        ArrayList arrayList9 = new ArrayList(u8.q.a0(dVar4, 10));
                        Iterator it3 = dVar4.iterator();
                        while (true) {
                            n9.c cVar6 = (n9.c) it3;
                            if (cVar6.f8970c) {
                                cVar6.nextInt();
                                arrayList9.add(f0Var);
                            } else {
                                arrayList2 = arrayList9;
                            }
                        }
                    } else {
                        a0VarS = null;
                    }
                    h0.f8997b.getClass();
                    a0VarS = nb.c.s(h0.f8998c, eVar2, arrayList2);
                }
                while (r4.hasNext()) {
                    wVarD0 = ((a2.b) aVar.f3850e).d0(qVar, o9.e0.R(s0.f9033a, false, null, 7));
                    oa.d dVar5 = ((ja.a) aVar.f3847b).f6980r;
                    dVar5.getClass();
                    arrayList5 = arrayList8;
                    wVarB = dVar5.b(new oa.r(null, false, aVar, ga.a.TYPE_USE, true), wVarD0, wVar, null, false);
                    if (wVarB == null) {
                        wVarB = wVarD0;
                    }
                    if (wVarB.D0().l() instanceof x9.c0) {
                        arrayList5.add(qVar);
                    }
                    k0VarD0 = wVarB.D0();
                    if (a0VarS != null) {
                        k0VarD1 = a0VarS.D0();
                    } else {
                        k0VarD1 = null;
                    }
                    if (!i9.l.a(k0VarD0, k0VarD1)) {
                        arrayList7.add(wVarB);
                    }
                    arrayList8 = arrayList5;
                }
                arrayList3 = arrayList8;
                eVar = jVar.f7431i;
                if (eVar != null) {
                    wVarI = new r0(n3.r.t(eVar, jVar)).i(eVar.n(), x0Var);
                } else {
                    wVarI = null;
                }
                wb.l.a(arrayList7, wVarI);
                wb.l.a(arrayList7, a0VarS);
                if (!arrayList3.isEmpty()) {
                    jb.m mVar2 = ((ja.a) aVar.f3847b).f6969f;
                    arrayList4 = new ArrayList(u8.q.a0(arrayList3, 10));
                    while (r5.hasNext()) {
                        i9.l.c(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                        arrayList4.add(((da.q) dVar2).f3883a.toString());
                    }
                    mVar2.b(jVar, arrayList4);
                }
                if (!arrayList7.isEmpty()) {
                }
            default:
                lb.h hVar = (lb.h) cVar3;
                ra.k kVar = hVar.f8315e;
                jb.k kVar2 = hVar.f8321l;
                aa.f0 f0Var2 = kVar2.f7046d;
                i9.l.e(kVar, "<this>");
                List list = kVar.f12043h;
                boolean zIsEmpty = list.isEmpty();
                ?? arrayList10 = list;
                if (zIsEmpty) {
                    arrayList10 = 0;
                }
                if (arrayList10 == 0) {
                    List<Integer> list2 = kVar.f12044i;
                    i9.l.d(list2, "getSupertypeIdList(...)");
                    arrayList10 = new ArrayList(u8.q.a0(list2, 10));
                    for (Integer num : list2) {
                        i9.l.b(num);
                        arrayList10.add(f0Var2.a(num.intValue()));
                    }
                }
                ArrayList arrayList11 = new ArrayList(u8.q.a0(arrayList10, 10));
                Iterator it4 = arrayList10.iterator();
                while (it4.hasNext()) {
                    arrayList11.add(kVar2.f7050h.l((ra.s0) it4.next()));
                }
                ArrayList arrayListX0 = u8.p.x0(kVar2.f7043a.f7030n.d(hVar), arrayList11);
                ArrayList<x9.c0> arrayList12 = new ArrayList();
                Iterator it5 = arrayListX0.iterator();
                while (it5.hasNext()) {
                    x9.h hVarL = ((nb.w) it5.next()).D0().l();
                    x9.c0 c0Var = hVarL instanceof x9.c0 ? (x9.c0) hVarL : null;
                    if (c0Var != null) {
                        arrayList12.add(c0Var);
                    }
                }
                if (!arrayList12.isEmpty()) {
                    jb.m mVar3 = kVar2.f7043a.f7025h;
                    ArrayList arrayList13 = new ArrayList(u8.q.a0(arrayList12, 10));
                    for (x9.c0 c0Var2 : arrayList12) {
                        wa.b bVarF = db.e.f(c0Var2);
                        if (bVarF == null || (cVarA = bVarF.a()) == null || (strB = cVarA.f14240a.f14243a) == null) {
                            strB = c0Var2.getName().b();
                            i9.l.d(strB, "asString(...)");
                        }
                        arrayList13.add(strB);
                    }
                    mVar3.b(hVar, arrayList13);
                }
                return u8.p.J0(arrayListX0);
        }
    }

    @Override // nb.f
    public final o0 d() {
        switch (this.f7426c) {
            case 0:
                return ((ja.a) ((j) this.f7428e).f7432j.f3847b).f6975m;
            default:
                return o0.f14732c;
        }
    }

    @Override // nb.b
    /* JADX INFO: renamed from: i */
    public final x9.e l() {
        switch (this.f7426c) {
            case 0:
                return (j) this.f7428e;
            default:
                return (lb.h) this.f7428e;
        }
    }

    @Override // nb.b, nb.k0
    public final x9.h l() {
        switch (this.f7426c) {
            case 0:
                return (j) this.f7428e;
            default:
                return (lb.h) this.f7428e;
        }
    }

    @Override // nb.k0
    public final List n() {
        switch (this.f7426c) {
            case 0:
                break;
        }
        return (List) this.f7427d.invoke();
    }

    @Override // nb.k0
    public final boolean o() {
        switch (this.f7426c) {
        }
        return true;
    }

    public final String toString() {
        switch (this.f7426c) {
            case 0:
                String strB = ((j) this.f7428e).getName().b();
                i9.l.d(strB, "asString(...)");
                return strB;
            default:
                String str = ((lb.h) this.f7428e).getName().f14247a;
                i9.l.d(str, "toString(...)");
                return str;
        }
    }
}
