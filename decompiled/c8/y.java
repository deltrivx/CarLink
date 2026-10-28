package c8;

import aa.s0;
import android.view.InputDevice;
import android.view.KeyEvent;
import b8.m2;
import f1.b1;
import f1.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l0.i0;
import l0.o0;
import l0.q0;
import l0.u0;
import r2.k1;
import r2.n2;
import w0.t1;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2568c;

    public /* synthetic */ y(int i7, Object obj, Object obj2) {
        this.f2566a = i7;
        this.f2567b = obj;
        this.f2568c = obj2;
    }

    private final Object e(Object obj) {
        long j5;
        p1.j jVar = (p1.j) obj;
        synchronized (p1.l.f10057c) {
            j5 = p1.l.f10059e;
            p1.l.f10059e = ((long) 1) + j5;
        }
        return new p1.b(j5, jVar, (h9.k) this.f2567b, (h9.k) this.f2568c);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[LOOP:0: B:36:0x00b9->B:204:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    @Override // h9.k
    public final Object invoke(Object obj) {
        o0 o0VarA;
        String str;
        Class clsT;
        ca.c cVarW;
        x9.h hVarL;
        Object objC;
        ArrayList arrayListA;
        Iterator it;
        oa.e eVar;
        int i7 = 2;
        boolean zF = false;
        switch (this.f2566a) {
            case 0:
                m2 m2Var = (m2) obj;
                i9.l.e(m2Var, "it");
                ((b1) this.f2568c).setValue(null);
                ((h9.k) this.f2567b).invoke(m2Var);
                return t8.z.f12851a;
            case 1:
                t0 t0Var = (t0) this.f2567b;
                Object obj2 = t0Var.f5149b;
                cc.l lVar = (cc.l) this.f2568c;
                synchronized (obj2) {
                    ((ArrayList) t0Var.f5150c).remove(lVar);
                }
                return t8.z.f12851a;
            case 2:
                ka.o oVar = (ka.o) this.f2567b;
                da.a aVar = (da.a) this.f2568c;
                wa.e eVar2 = (wa.e) obj;
                i9.l.e(eVar2, "name");
                mb.i iVar = oVar.f7462r;
                x9.e eVar3 = oVar.f7458n;
                if (((Set) iVar.invoke()).contains(eVar2)) {
                    ca.b bVar = ((ja.a) aVar.f3847b).f6965b;
                    wa.b bVarF = db.e.f(eVar3);
                    i9.l.b(bVarF);
                    wa.b bVarD = bVarF.d(eVar2);
                    bVar.getClass();
                    wa.c cVar = bVarD.f14236a;
                    String strM0 = zb.q.m0(bVarD.f14237b.f14240a.f14243a, '.', '$');
                    if (!cVar.f14240a.c()) {
                        strM0 = cVar.f14240a.f14243a + '.' + strM0;
                    }
                    Class clsT2 = o9.e0.T(bVar.f2575a, strM0);
                    da.o oVar2 = clsT2 != null ? new da.o(clsT2) : null;
                    if (oVar2 == null) {
                        return null;
                    }
                    ka.j jVar = new ka.j(aVar, eVar3, oVar2, null);
                    ((ja.a) aVar.f3847b).f6981s.getClass();
                    return jVar;
                }
                if (!((Set) oVar.f7463s.invoke()).contains(eVar2)) {
                    da.u uVar = (da.u) ((Map) oVar.f7464t.invoke()).get(eVar2);
                    if (uVar == null) {
                        return null;
                    }
                    ja.a aVar2 = (ja.a) aVar.f3847b;
                    mb.n nVar = aVar2.f6964a;
                    ka.l lVar2 = new ka.l(oVar, i7);
                    mb.k kVar = (mb.k) nVar;
                    kVar.getClass();
                    return aa.w.B0(aVar2.f6964a, oVar.f7458n, eVar2, new mb.i(kVar, lVar2), g5.a.b0(aVar, uVar), aVar2.f6973j.c(uVar));
                }
                v8.b bVar2 = new v8.b(10);
                ((eb.a) ((ja.a) aVar.f3847b).f6986x).getClass();
                i9.l.e(eVar3, "thisDescriptor");
                i9.l.e(eVar2, "name");
                i9.l.e(aVar, "c");
                v8.b bVarN = n3.l.n(bVar2);
                int iC = bVarN.c();
                if (iC == 0) {
                    return null;
                }
                if (iC == 1) {
                    return (x9.e) u8.p.A0(bVarN);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + bVarN).toString());
            case 3:
                s0 s0Var = (s0) this.f2567b;
                ka.o oVar3 = (ka.o) this.f2568c;
                wa.e eVar4 = (wa.e) obj;
                i9.l.e(eVar4, "accessorName");
                return i9.l.a(s0Var.getName(), eVar4) ? n3.l.I(s0Var) : u8.p.x0(oVar3.O(eVar4), oVar3.N(eVar4));
            case 4:
                ka.v vVar = (ka.v) this.f2567b;
                da.a aVar3 = vVar.f7390b;
                da.a aVar4 = (da.a) this.f2568c;
                ja.a aVar5 = (ja.a) aVar4.f3847b;
                ka.r rVar = (ka.r) obj;
                i9.l.e(rVar, "request");
                ka.q qVar = vVar.f7480o;
                wa.b bVar3 = new wa.b(qVar.f364e, rVar.f7474a);
                da.o oVar4 = rVar.f7475b;
                if (oVar4 != null) {
                    ca.b bVar4 = aVar5.f6966c;
                    ((ja.a) aVar3.f3847b).f6967d.c().f7020c.getClass();
                    ta.e eVar5 = ta.e.f12885g;
                    bVar4.getClass();
                    i9.l.e(eVar5, "metadataVersion");
                    wa.c cVarC = oVar4.c();
                    o0VarA = (cVarC == null || (str = cVarC.f14240a.f14243a) == null || (clsT = o9.e0.T(bVar4.f2575a, str)) == null || (cVarW = a.a.w(clsT)) == null) ? null : new o0(12, cVarW);
                } else {
                    ca.b bVar5 = aVar5.f6966c;
                    ((ja.a) aVar3.f3847b).f6967d.c().f7020c.getClass();
                    o0VarA = bVar5.a(bVar3, ta.e.f12885g);
                }
                ca.c cVar2 = o0VarA != null ? (ca.c) o0VarA.f7772b : null;
                wa.b bVarA = cVar2 != null ? da.d.a(cVar2.f2576a) : null;
                if (bVarA != null && (bVarA.g() || bVarA.f14238c)) {
                    return null;
                }
                k9.a sVar = ka.t.f7477c;
                if (cVar2 != null) {
                    if (cVar2.f2577b.f10999a == qa.a.CLASS) {
                        pa.e eVar6 = ((ja.a) aVar3.f3847b).f6967d;
                        eVar6.getClass();
                        jb.d dVarG = eVar6.g(cVar2);
                        x9.e eVarA = dVarG == null ? null : eVar6.c().f7036t.a(da.d.a(cVar2.f2576a), dVarG);
                        if (eVarA != null) {
                            sVar = new ka.s(eVarA);
                        }
                    } else {
                        sVar = ka.u.f7478c;
                    }
                }
                if (sVar instanceof ka.s) {
                    return ((ka.s) sVar).f7476c;
                }
                if (sVar instanceof ka.u) {
                    return null;
                }
                if (!(sVar instanceof ka.t)) {
                    throw new cc.s();
                }
                if (oVar4 == null) {
                    ca.b bVar6 = aVar5.f6965b;
                    bVar6.getClass();
                    wa.c cVar3 = bVar3.f14236a;
                    String strM1 = zb.q.m0(bVar3.f14237b.f14240a.f14243a, '.', '$');
                    if (!cVar3.f14240a.c()) {
                        strM1 = cVar3.f14240a.f14243a + '.' + strM1;
                    }
                    Class clsT3 = o9.e0.T(bVar6.f2575a, strM1);
                    oVar4 = clsT3 != null ? new da.o(clsT3) : null;
                }
                wa.c cVarC2 = oVar4 != null ? oVar4.c() : null;
                if (cVarC2 == null || cVarC2.f14240a.c() || !cVarC2.b().equals(qVar.f364e)) {
                    return null;
                }
                ka.j jVar2 = new ka.j(aVar4, qVar, oVar4, null);
                aVar5.f6981s.getClass();
                return jVar2;
            case 5:
                KeyEvent keyEvent = ((i2.b) obj).f6600a;
                if (((u0) this.f2567b).a() == i0.f7679b && keyEvent.getKeyCode() == 4 && i2.c.K(keyEvent) == 1) {
                    ((t1) this.f2568c).g(null);
                    zF = true;
                }
                return Boolean.valueOf(zF);
            case 6:
                KeyEvent keyEvent2 = ((i2.b) obj).f6600a;
                w1.i iVar2 = (w1.i) this.f2567b;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && i2.c.K(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    if (q0.j(19, keyEvent2)) {
                        zF = ((w1.j) iVar2).f(5);
                    } else if (q0.j(20, keyEvent2)) {
                        zF = ((w1.j) iVar2).f(6);
                    } else if (q0.j(21, keyEvent2)) {
                        zF = ((w1.j) iVar2).f(3);
                    } else if (q0.j(22, keyEvent2)) {
                        zF = ((w1.j) iVar2).f(4);
                    } else if (q0.j(23, keyEvent2)) {
                        n2 n2Var = ((u0) this.f2568c).f7850c;
                        if (n2Var != null) {
                            ((k1) n2Var).b();
                        }
                        zF = true;
                    }
                }
                return Boolean.valueOf(zF);
            case 7:
                da.a aVar6 = (da.a) this.f2567b;
                lb.h hVar = (lb.h) this.f2568c;
                jb.k kVar2 = hVar.f8321l;
                wa.e eVar7 = (wa.e) obj;
                i9.l.e(eVar7, "name");
                ra.v vVar2 = (ra.v) ((LinkedHashMap) aVar6.f3847b).get(eVar7);
                if (vVar2 != null) {
                    return aa.w.B0(kVar2.f7043a.f7018a, hVar, eVar7, (mb.i) aVar6.f3849d, new lb.a(kVar2.f7043a.f7018a, new aa.j(11, hVar, vVar2)), n0.f14716e0);
                }
                return null;
            case 8:
                oa.r rVar2 = (oa.r) this.f2567b;
                da.a aVar7 = (da.a) rVar2.f9625e;
                oa.a aVar8 = (oa.a) this.f2568c;
                i9.l.e(obj, "$this$extractNullability");
                qb.d dVar = aVar8.f9575a;
                y9.b bVar7 = (y9.b) obj;
                if (bVar7 instanceof ka.f) {
                    ((ja.a) aVar7.f3847b).f6982t.getClass();
                    if (((ka.f) bVar7).f7422g || ((ga.a) rVar2.f9626f) == ga.a.TYPE_PARAMETER_BOUNDS) {
                        zF = true;
                    } else if (dVar != null) {
                        wa.e eVar8 = u9.i.f13141e;
                        hVarL = ((nb.w) dVar).D0().l();
                        if (hVarL != null && u9.i.s(hVarL) != null) {
                            ((ja.a) aVar7.f3847b).f6979q.getClass();
                            objC = ga.b.c(bVar7, u9.n.f13190t);
                            if (objC != null) {
                                arrayListA = ga.b.a(objC, false);
                                if (!arrayListA.isEmpty()) {
                                    it = arrayListA.iterator();
                                    while (it.hasNext()) {
                                        if (i9.l.a((String) it.next(), "TYPE")) {
                                            ((ja.a) aVar7.f3847b).f6982t.getClass();
                                            zF = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (dVar != null) {
                    wa.e eVar9 = u9.i.f13141e;
                    hVarL = ((nb.w) dVar).D0().l();
                    if (hVarL != null) {
                        ((ja.a) aVar7.f3847b).f6979q.getClass();
                        objC = ga.b.c(bVar7, u9.n.f13190t);
                        if (objC != null) {
                            arrayListA = ga.b.a(objC, false);
                            if (!arrayListA.isEmpty()) {
                                it = arrayListA.iterator();
                                while (it.hasNext()) {
                                    if (i9.l.a((String) it.next(), "TYPE")) {
                                        ((ja.a) aVar7.f3847b).f6982t.getClass();
                                        zF = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(zF);
            case 9:
                oa.t tVar = (oa.t) this.f2567b;
                oa.e[] eVarArr = (oa.e[]) this.f2568c;
                int iIntValue = ((Number) obj).intValue();
                if (tVar == null || (eVar = (oa.e) tVar.f9631a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= eVarArr.length) ? oa.e.f9582e : eVarArr[iIntValue];
                }
                return eVar;
            case 10:
                return e(obj);
            default:
                x9.c cVar4 = (x9.c) obj;
                za.k kVar3 = (za.k) this.f2567b;
                x9.c cVar5 = (x9.c) this.f2568c;
                i9.l.e(cVar4, "second");
                kVar3.d(cVar5, cVar4);
                return t8.z.f12851a;
        }
    }
}
