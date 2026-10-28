package r9;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f11677b;

    public /* synthetic */ f0(g0 g0Var, int i7) {
        this.f11676a = i7;
        this.f11677b = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[LOOP:2: B:35:0x00d6->B:161:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x022a  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00f1, please report this as an issue */
    @Override // h9.a
    public final Object invoke() throws IOException {
        s9.w wVarP;
        GenericDeclaration declaredConstructor;
        s9.w wVarP2;
        x9.k kVarL;
        Member memberR;
        yb.g gVar;
        Object next;
        List listX;
        Iterator it;
        x9.t tVar;
        int i7 = this.f11676a;
        Object objD = null;
        g0 g0Var = this.f11677b;
        switch (i7) {
            case 0:
                wa.b bVar = v1.f11778a;
                x9.t tVarJ = g0Var.j();
                e0 e0Var = g0Var.f11682c;
                n3.n nVarC = v1.c(tVarJ);
                boolean z10 = nVarC instanceof j;
                s9.a aVar = s9.a.f12648b;
                if (z10) {
                    if (g0Var.l()) {
                        Class clsA = e0Var.a();
                        List listK = g0Var.k();
                        ArrayList arrayList = new ArrayList(u8.q.a0(listK, 10));
                        Iterator it2 = listK.iterator();
                        while (it2.hasNext()) {
                            String strB = ((v0) ((o9.n) it2.next())).b();
                            i9.l.b(strB);
                            arrayList.add(strB);
                        }
                        return new s9.c(clsA, arrayList, aVar);
                    }
                    String str = ((j) nVarC).f11696c.f13713e;
                    e0Var.getClass();
                    i9.l.e(str, "desc");
                    Class clsA2 = e0Var.a();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) e0Var.p(str, false).f12990b).toArray(new Class[0]);
                        objD = clsA2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (nVarC instanceof k) {
                    x9.t tVarJ2 = g0Var.j();
                    x9.k kVarL2 = tVarJ2.l();
                    i9.l.d(kVarL2, "getContainingDeclaration(...)");
                    if (za.f.d(kVarL2) && (tVarJ2 instanceof x9.j) && ((x9.j) tVarJ2).x()) {
                        x9.t tVarJ3 = g0Var.j();
                        String str2 = ((k) nVarC).f11701c.f13713e;
                        List listX2 = g0Var.j().X();
                        i9.l.d(listX2, "getValueParameters(...)");
                        return new s9.b0(tVarJ3, e0Var, str2, listX2);
                    }
                    va.e eVar = ((k) nVarC).f11701c;
                    objD = e0Var.d(eVar.f13712d, eVar.f13713e);
                } else if (nVarC instanceof i) {
                    objD = ((i) nVarC).f11692c;
                    i9.l.c(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
                } else {
                    if (!(nVarC instanceof h)) {
                        if (!(nVarC instanceof g)) {
                            throw new cc.s();
                        }
                        List list = ((g) nVarC).f11680c;
                        Class clsA3 = e0Var.a();
                        ArrayList arrayList2 = new ArrayList(u8.q.a0(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((Method) it3.next()).getName());
                        }
                        return new s9.c(clsA3, arrayList2, aVar, s9.b.f12651a, list);
                    }
                    objD = ((h) nVarC).f11688c;
                    i9.l.c(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
                }
                if (objD instanceof Constructor) {
                    wVarP = g0Var.n((Constructor) objD, g0Var.j(), false);
                } else {
                    if (!(objD instanceof Method)) {
                        throw new cc.a0(2, "Could not compute caller for function: " + g0Var.j() + " (member = " + objD + ')');
                    }
                    Method method = (Method) objD;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        wVarP = g0Var.m() ? new s9.r(method, n3.n.W(g0Var.f11684e, g0Var.j())) : new s9.v(method);
                    } else if (((h0.a0) g0Var.j()).getAnnotations().g(x1.f11793a) != null) {
                        wVarP = g0Var.m() ? new s9.s(method, false, 4) : new s9.v(method, true, 4, 1);
                    } else {
                        wVarP = g0Var.p(method, false);
                    }
                }
                return n3.n.c0(wVarP, g0Var.j(), false);
            default:
                wa.b bVar2 = v1.f11778a;
                x9.t tVarJ4 = g0Var.j();
                e0 e0Var2 = g0Var.f11682c;
                n3.n nVarC2 = v1.c(tVarJ4);
                if (!(nVarC2 instanceof k)) {
                    boolean z11 = nVarC2 instanceof j;
                    s9.a aVar2 = s9.a.f12647a;
                    if (z11) {
                        if (g0Var.l()) {
                            Class clsA4 = e0Var2.a();
                            List listK2 = g0Var.k();
                            ArrayList arrayList3 = new ArrayList(u8.q.a0(listK2, 10));
                            Iterator it4 = listK2.iterator();
                            while (it4.hasNext()) {
                                String strB2 = ((v0) ((o9.n) it4.next())).b();
                                i9.l.b(strB2);
                                arrayList3.add(strB2);
                            }
                            return new s9.c(clsA4, arrayList3, aVar2);
                        }
                        String str3 = ((j) nVarC2).f11696c.f13713e;
                        e0Var2.getClass();
                        i9.l.e(str3, "desc");
                        Class clsA5 = e0Var2.a();
                        ArrayList arrayList4 = new ArrayList();
                        e0.b(arrayList4, (ArrayList) e0Var2.p(str3, false).f12990b, true);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                            declaredConstructor = clsA5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (nVarC2 instanceof g) {
                        List list2 = ((g) nVarC2).f11680c;
                        Class clsA6 = e0Var2.a();
                        ArrayList arrayList5 = new ArrayList(u8.q.a0(list2, 10));
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(((Method) it5.next()).getName());
                        }
                        return new s9.c(clsA6, arrayList5, aVar2, s9.b.f12651a, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    x9.t tVarJ5 = g0Var.j();
                    x9.k kVarL3 = tVarJ5.l();
                    i9.l.d(kVarL3, "getContainingDeclaration(...)");
                    if (za.f.d(kVarL3) && (tVarJ5 instanceof x9.j) && ((x9.j) tVarJ5).x()) {
                        throw new cc.a0(2, g0Var.j().l() + " cannot have default arguments");
                    }
                    x9.t tVarJ6 = g0Var.j();
                    List listX3 = tVarJ6.X();
                    i9.l.d(listX3, "getValueParameters(...)");
                    if (listX3.isEmpty()) {
                        kVarL = tVarJ6.l();
                        i9.l.d(kVarL, "getContainingDeclaration(...)");
                        if (za.f.f(kVarL)) {
                            memberR = g0Var.g().r();
                            i9.l.b(memberR);
                            if (Modifier.isStatic(memberR.getModifiers())) {
                                gVar = new yb.g(db.e.l(tVarJ6));
                                while (true) {
                                    if (gVar.hasNext()) {
                                        next = gVar.next();
                                        listX = ((x9.c) next).X();
                                        i9.l.d(listX, "getValueParameters(...)");
                                        if (listX.isEmpty()) {
                                            it = listX.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    continue;
                                                } else if (((aa.y0) it.next()).D0()) {
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                if (next instanceof x9.t) {
                                }
                            }
                        }
                    } else {
                        Iterator it6 = listX3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                kVarL = tVarJ6.l();
                                i9.l.d(kVarL, "getContainingDeclaration(...)");
                                if (za.f.f(kVarL)) {
                                    memberR = g0Var.g().r();
                                    i9.l.b(memberR);
                                    if (Modifier.isStatic(memberR.getModifiers())) {
                                        gVar = new yb.g(db.e.l(tVarJ6));
                                        while (true) {
                                            if (gVar.hasNext()) {
                                                next = gVar.next();
                                                listX = ((x9.c) next).X();
                                                i9.l.d(listX, "getValueParameters(...)");
                                                if (listX.isEmpty()) {
                                                    it = listX.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            continue;
                                                        } else if (((aa.y0) it.next()).D0()) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        tVar = next instanceof x9.t ? (x9.t) next : null;
                                    }
                                }
                            } else if (((aa.y0) it6.next()).D0()) {
                            }
                        }
                    }
                    if (tVar != null) {
                        va.e eVar2 = ((k) v1.c(tVar)).f11701c;
                        declaredConstructor = e0Var2.c(eVar2.f13712d, eVar2.f13713e, true);
                    } else {
                        va.e eVar3 = ((k) nVarC2).f11701c;
                        String str4 = eVar3.f13712d;
                        String str5 = eVar3.f13713e;
                        Member memberR2 = g0Var.g().r();
                        i9.l.b(memberR2);
                        declaredConstructor = e0Var2.c(str4, str5, !Modifier.isStatic(memberR2.getModifiers()));
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    wVarP2 = g0Var.n((Constructor) declaredConstructor, g0Var.j(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    wVarP2 = null;
                } else if (((h0.a0) g0Var.j()).getAnnotations().g(x1.f11793a) != null) {
                    x9.k kVarL4 = g0Var.j().l();
                    i9.l.c(kVarL4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((x9.e) kVarL4).u()) {
                        wVarP2 = g0Var.p((Method) declaredConstructor, g0Var.g().s());
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        wVarP2 = g0Var.m() ? new s9.s(method2, false, 4) : new s9.v(method2, true, 4, 1);
                    }
                } else {
                    wVarP2 = g0Var.p((Method) declaredConstructor, g0Var.g().s());
                }
                if (wVarP2 != null) {
                    return n3.n.c0(wVarP2, g0Var.j(), true);
                }
                return null;
        }
    }
}
