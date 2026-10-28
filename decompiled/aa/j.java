package aa;

import b8.h2;
import f1.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.i3;
import r9.m1;
import r9.n1;
import r9.v1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f363c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f361a = i7;
        this.f362b = obj;
        this.f363c = obj2;
    }

    public /* synthetic */ j(r rVar, Object obj, int i7) {
        this.f361a = i7;
        this.f363c = rVar;
        this.f362b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0297  */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, t8.h] */
    @Override // h9.a
    public final Object invoke() throws IOException {
        Collection collectionF;
        ArrayList arrayList;
        String strP;
        o9.x xVar;
        switch (this.f361a) {
            case 0:
                nb.h0.f8997b.getClass();
                return nb.c.u(new gb.k(mb.k.f8627e, new e(1, this)), Collections.EMPTY_LIST, nb.h0.f8998c, ((l) this.f363c).t(), false);
            case 1:
                wb.g gVar = new wb.g();
                Iterator it = ((z) this.f363c).m().iterator();
                while (it.hasNext()) {
                    gVar.add(((x9.t) it.next()).e((nb.r0) this.f362b));
                }
                return gVar;
            case 2:
                v0 v0Var = (v0) this.f362b;
                m mVar = (m) this.f363c;
                mb.n nVar = v0Var.D;
                x9.q0 q0Var = v0Var.E;
                y9.h annotations = mVar.getAnnotations();
                m mVar2 = mVar;
                int iF = mVar2.f();
                a2.f.O(iF, "getKind(...)");
                y9.a aVar = v0Var.E;
                x9.n0 source = ((r) aVar).getSource();
                i9.l.d(source, "getSource(...)");
                v0 v0Var2 = new v0(nVar, q0Var, mVar, v0Var, annotations, iF, source);
                v0.G.getClass();
                lb.s sVar = (lb.s) aVar;
                nb.r0 r0VarD = sVar.C0() == null ? null : nb.r0.d(sVar.D0());
                if (r0VarD == null) {
                    return null;
                }
                a0 a0Var = mVar2.f481j;
                a0 a0VarE = a0Var != null ? a0Var.e(r0VarD) : null;
                List listI0 = mVar2.i0();
                i9.l.d(listI0, "getContextReceiverParameters(...)");
                ArrayList arrayList2 = new ArrayList(u8.q.a0(listI0, 10));
                Iterator it2 = listI0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((a0) it2.next()).e(r0VarD));
                }
                h hVar = (h) aVar;
                List listQ = hVar.q();
                List listX = v0Var.X();
                nb.w wVar = v0Var.f478g;
                i9.l.b(wVar);
                v0Var2.H0(null, a0VarE, arrayList2, listQ, listX, wVar, x9.x.f14747b, hVar.f340f);
                return v0Var2;
            case 3:
                ((b1) this.f363c).setValue(((h2) this.f362b).getName());
                return t8.z.f12851a;
            case 4:
                nb.a0 a0VarN = ((ja.a) ((da.a) this.f362b).f3847b).f6977o.k().j(((ha.b) this.f363c).f6469a).n();
                i9.l.d(a0VarN, "getDefaultType(...)");
                return a0VarN;
            case 5:
                da.a aVar2 = (da.a) this.f362b;
                y9.h annotations2 = ((x9.g) this.f363c).getAnnotations();
                i9.l.e(aVar2, "<this>");
                i9.l.e(annotations2, "additionalAnnotations");
                return ((ja.a) aVar2.f3847b).f6979q.b((ga.v) aVar2.f3849d.getValue(), annotations2);
            case 6:
                da.a aVar3 = (da.a) this.f362b;
                y9.h hVar2 = (y9.h) this.f363c;
                i9.l.e(aVar3, "<this>");
                i9.l.e(hVar2, "additionalAnnotations");
                return ((ja.a) aVar3.f3847b).f6979q.b((ga.v) aVar3.f3849d.getValue(), hVar2);
            case 7:
                return new ka.q(((ja.d) this.f362b).f6993a, (da.y) this.f363c);
            case 8:
                i3 i3Var = (i3) this.f362b;
                ra.s0 s0Var = (ra.s0) this.f363c;
                jb.k kVar = (jb.k) i3Var.f9785b;
                return kVar.f7043a.f7022e.a(s0Var, kVar.f7044b);
            case 9:
                da.a aVar4 = (da.a) this.f362b;
                ka.v vVar = (ka.v) this.f363c;
                ca.b bVar = ((ja.a) aVar4.f3847b).f6965b;
                wa.c cVar = vVar.f7480o.f364e;
                bVar.getClass();
                i9.l.e(cVar, "packageFqName");
                return null;
            case 10:
                l8.j0 j0Var = (l8.j0) this.f362b;
                if (((Boolean) j0Var.f8200e.invoke()).booleanValue()) {
                    ((h9.k) this.f363c).invoke(j0Var);
                }
                return t8.z.f12851a;
            case 11:
                lb.h hVar3 = (lb.h) this.f362b;
                return u8.p.J0(hVar3.f8321l.f7043a.f7022e.h(hVar3.f8331v, (ra.v) this.f363c));
            case 12:
                ob.g gVar2 = (ob.g) this.f362b;
                qb.d dVar = (qb.d) ((nb.y) this.f363c).f9058c.invoke();
                gVar2.getClass();
                i9.l.e(dVar, "type");
                return (nb.w) dVar;
            case 13:
                ob.j jVar = (ob.j) this.f362b;
                ob.g gVar3 = (ob.g) this.f363c;
                Iterable iterable = (List) jVar.f9652e.getValue();
                if (iterable == null) {
                    iterable = u8.w.f13122a;
                }
                ArrayList arrayList3 = new ArrayList(u8.q.a0(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((nb.w0) it3.next()).F0(gVar3));
                }
                return arrayList3;
            case 14:
                r9.g0 g0Var = (r9.g0) this.f362b;
                String str = (String) this.f363c;
                r9.e0 e0Var = g0Var.f11682c;
                String str2 = g0Var.f11683d;
                e0Var.getClass();
                i9.l.e(str2, "signature");
                if (str.equals("<init>")) {
                    collectionF = u8.p.J0(e0Var.e());
                    arrayList = new ArrayList();
                    for (Object obj : collectionF) {
                        x9.j jVar2 = (x9.j) obj;
                        if (jVar2.x()) {
                            x9.i iVarL = jVar2.l();
                            i9.l.d(iVarL, "getContainingDeclaration(...)");
                            if (za.f.d(iVarL)) {
                                String strP2 = v1.c(jVar2).P();
                                if (!zb.q.o0(strP2, "constructor-impl") || !zb.q.i0(strP2, ")V")) {
                                    throw new IllegalArgumentException(("Invalid signature of " + jVar2 + ": " + strP2).toString());
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(zb.j.I0(strP2, "V"));
                                x9.i iVarL2 = jVar2.l();
                                i9.l.d(iVarL2, "getContainingDeclaration(...)");
                                wa.b bVarF = db.e.f(iVarL2);
                                i9.l.b(bVarF);
                                sb2.append(va.b.b(bVarF.b()));
                                strP = sb2.toString();
                            } else {
                                strP = v1.c(jVar2).P();
                            }
                        } else {
                            strP = v1.c(jVar2).P();
                        }
                        if (i9.l.a(strP, str2)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    collectionF = e0Var.f(wa.e.e(str));
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : collectionF) {
                        if (i9.l.a(v1.c((x9.t) obj2).P(), str2)) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList = arrayList4;
                }
                if (arrayList.size() == 1) {
                    return (x9.t) u8.p.A0(arrayList);
                }
                String strQ0 = u8.p.q0(collectionF, "\n", null, null, r9.b.f11656g, 30);
                StringBuilder sb3 = new StringBuilder("Function '");
                sb3.append(str);
                sb3.append("' (JVM signature: ");
                sb3.append(str2);
                sb3.append(") not resolved in ");
                sb3.append(e0Var);
                sb3.append(':');
                sb3.append(strQ0.length() == 0 ? " no members found" : "\n".concat(strQ0));
                throw new cc.a0(2, sb3.toString());
            case 15:
                n1 n1Var = (n1) this.f362b;
                h9.a aVar5 = (h9.a) this.f363c;
                List listB0 = n1Var.f11727a.B0();
                if (listB0.isEmpty()) {
                    return u8.w.f13122a;
                }
                t8.h hVarC = t8.a.c(t8.i.f12827a, new m1(n1Var, 1));
                ArrayList arrayList5 = new ArrayList(u8.q.a0(listB0, 10));
                int i7 = 0;
                for (Object obj3 : listB0) {
                    int i10 = i7 + 1;
                    if (i7 < 0) {
                        n3.l.Y();
                        throw null;
                    }
                    nb.n0 n0Var = (nb.n0) obj3;
                    if (n0Var.c()) {
                        xVar = o9.x.f9567c;
                    } else {
                        nb.w wVarB = n0Var.b();
                        i9.l.d(wVarB, "getType(...)");
                        n1 n1Var2 = new n1(wVarB, aVar5 != null ? new jb.q(n1Var, i7, hVarC) : null);
                        int iOrdinal = n0Var.a().ordinal();
                        if (iOrdinal == 0) {
                            xVar = new o9.x(o9.y.f9570a, n1Var2);
                        } else if (iOrdinal == 1) {
                            xVar = new o9.x(o9.y.f9571b, n1Var2);
                        } else {
                            if (iOrdinal != 2) {
                                throw new cc.s();
                            }
                            xVar = new o9.x(o9.y.f9572c, n1Var2);
                        }
                    }
                    arrayList5.add(xVar);
                    i7 = i10;
                }
                return arrayList5;
            case 16:
                Class cls = (Class) this.f362b;
                Map map = (Map) this.f363c;
                StringBuilder sb4 = new StringBuilder();
                sb4.append('@');
                sb4.append(cls.getCanonicalName());
                u8.p.p0(map.entrySet(), sb4, ", ", "(", ")", s9.e.f12677a, 48);
                return sb4.toString();
            case 17:
                w9.g gVar4 = (w9.g) this.f362b;
                mb.k kVar2 = (mb.k) this.f363c;
                h9.k kVar3 = gVar4.f14199b;
                h0 h0Var = gVar4.f14198a;
                o oVar = new o((x9.k) kVar3.invoke(h0Var), w9.g.f14196g, x9.x.f14750e, x9.f.f14702b, n3.l.I(h0Var.f344d.e()), kVar2);
                oVar.B0(new w9.a(kVar2, oVar), u8.y.f13124a, null);
                return oVar;
            case 18:
                w9.i iVar = (w9.i) this.f362b;
                mb.k kVar4 = (mb.k) this.f363c;
                h0 h0VarL = iVar.l();
                i9.l.d(h0VarL, "getBuiltInsModule(...)");
                return new w9.l(h0VarL, kVar4, new e(29, iVar));
            case 19:
                w9.l lVar = (w9.l) this.f362b;
                mb.k kVar5 = (mb.k) this.f363c;
                h0 h0Var2 = lVar.g().f14201a;
                w9.g.f14193d.getClass();
                return x9.v.f(h0Var2, w9.g.f14197h, new da.a(kVar5, lVar.g().f14201a)).n();
            default:
                ka.j jVar3 = (ka.j) this.f362b;
                x9.e eVar = (x9.e) this.f363c;
                da.a aVar6 = jVar3.f7432j;
                ja.a aVar7 = (ja.a) aVar6.f3847b;
                da.a aVar8 = new da.a(new ja.a(aVar7.f6964a, aVar7.f6965b, aVar7.f6966c, aVar7.f6967d, aVar7.f6968e, aVar7.f6969f, aVar7.f6971h, aVar7.f6972i, aVar7.f6973j, aVar7.k, aVar7.f6974l, aVar7.f6975m, aVar7.f6976n, aVar7.f6977o, aVar7.f6978p, aVar7.f6979q, aVar7.f6980r, aVar7.f6981s, aVar7.f6982t, aVar7.f6983u, aVar7.f6984v, aVar7.f6985w), (ja.f) aVar6.f3848c, (t8.h) aVar6.f3849d);
                x9.k kVarL = jVar3.l();
                i9.l.d(kVarL, "getContainingDeclaration(...)");
                return new ka.j(aVar8, kVarL, jVar3.f7430h, eVar);
        }
    }
}
