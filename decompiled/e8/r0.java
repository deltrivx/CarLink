package e8;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import c1.u2;
import f1.k1;
import f1.q1;
import f1.w2;
import java.io.IOException;
import l0.m1;
import l0.r1;
import org.xmlpull.v1.XmlPullParserException;
import r2.j1;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4611b;

    public /* synthetic */ r0(int i7, Object obj) {
        this.f4610a = i7;
        this.f4611b = obj;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        int i7 = this.f4610a;
        q0.p pVar = q0.p.f10575a;
        f1.w0 w0Var = f1.n.f5051a;
        t8.z zVar = t8.z.f12851a;
        Object obj4 = this.f4611b;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj2;
                int iIntValue = ((Number) obj3).intValue();
                i9.l.e((d0.o0) obj, "$this$FilledTonalButton");
                if ((iIntValue & 17) == 16 && sVar.z()) {
                    sVar.Q();
                } else {
                    u2.b(((Boolean) ((f1.b1) obj4).getValue()).booleanValue() ? "监听" : "监听中", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                }
                return zVar;
            case 1:
                f1.s sVar2 = (f1.s) obj2;
                ((Number) obj3).intValue();
                sVar2.W(1582736677);
                n3.c cVar = (n3.c) sVar2.j(j1.f11276h);
                f3.d dVar = (f3.d) sVar2.j(j1.k);
                n3.o oVar = (n3.o) sVar2.j(j1.f11281n);
                b3.r0 r0Var = (b3.r0) obj4;
                boolean zF = sVar2.f(r0Var) | sVar2.d(oVar.ordinal());
                Object objK = sVar2.K();
                Object obj5 = objK;
                if (zF || objK == w0Var) {
                    b3.r0 r0VarH = b3.g0.h(r0Var, oVar);
                    sVar2.h0(r0VarH);
                    obj5 = r0VarH;
                }
                b3.r0 r0Var2 = (b3.r0) obj5;
                boolean zF2 = sVar2.f(dVar) | sVar2.f(r0Var2);
                Object objK2 = sVar2.K();
                Object obj6 = objK2;
                if (zF2 || objK2 == w0Var) {
                    b3.h0 h0Var = r0Var2.f1438a;
                    f3.n nVar = h0Var.f1361f;
                    f3.k kVar = h0Var.f1358c;
                    if (kVar == null) {
                        kVar = f3.k.f5258c;
                    }
                    f3.i iVar = h0Var.f1359d;
                    int i10 = iVar != null ? iVar.f5255a : 0;
                    f3.j jVar = h0Var.f1360e;
                    f3.p pVarB = ((f3.e) dVar).b(nVar, kVar, i10, jVar != null ? jVar.f5256a : 65535);
                    sVar2.h0(pVarB);
                    obj6 = pVarB;
                }
                w2 w2Var = (w2) obj6;
                Object objK3 = sVar2.K();
                Object obj7 = objK3;
                if (objK3 == w0Var) {
                    Object value = w2Var.getValue();
                    r1 r1Var = new r1();
                    r1Var.f7819a = oVar;
                    r1Var.f7820b = cVar;
                    r1Var.f7821c = dVar;
                    r1Var.f7822d = r0Var;
                    r1Var.f7823e = value;
                    r1Var.f7824f = l0.e1.a(r0Var, cVar, dVar, l0.e1.f7631a, 1);
                    sVar2.h0(r1Var);
                    obj7 = r1Var;
                }
                r1 r1Var2 = (r1) obj7;
                Object value2 = w2Var.getValue();
                if (oVar != r1Var2.f7819a || !i9.l.a(cVar, r1Var2.f7820b) || !i9.l.a(dVar, r1Var2.f7821c) || !i9.l.a(r0Var2, r1Var2.f7822d) || !i9.l.a(value2, r1Var2.f7823e)) {
                    r1Var2.f7819a = oVar;
                    r1Var2.f7820b = cVar;
                    r1Var2.f7821c = dVar;
                    r1Var2.f7822d = r0Var2;
                    r1Var2.f7823e = value2;
                    r1Var2.f7824f = l0.e1.a(r0Var2, cVar, dVar, l0.e1.f7631a, 1);
                }
                boolean zH = sVar2.h(r1Var2);
                Object objK4 = sVar2.K();
                Object obj8 = objK4;
                if (zH || objK4 == w0Var) {
                    cc.k kVar2 = new cc.k((int) (true ? 1 : 0), (Object) r1Var2);
                    sVar2.h0(kVar2);
                    obj8 = kVar2;
                }
                r1.p pVarB2 = androidx.compose.ui.layout.a.b((h9.o) obj8);
                sVar2.p(false);
                return pVarB2;
            case 2:
                f1.s sVar3 = (f1.s) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                i9.l.e((d0.t) obj, "$this$Card");
                if ((iIntValue2 & 17) == 16 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    r1.p pVarI = androidx.compose.foundation.layout.a.i(r1.m.f11116a, g5.a.n(16, sVar3), g5.a.n(4, sVar3));
                    h9.n nVar2 = (h9.n) obj4;
                    d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar3, 0);
                    long j5 = sVar3.T;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar3.l();
                    r1.p pVarC = r1.a.c(sVar3, pVarI);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar3.a0();
                    if (sVar3.S) {
                        sVar3.k(a0Var);
                    } else {
                        sVar3.k0();
                    }
                    f1.b.w(sVar3, q2.i.f10708e, sVarA);
                    f1.b.w(sVar3, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar3.S || !i9.l.a(sVar3.K(), Integer.valueOf(i11))) {
                        ob.a.w(i11, sVar3, i11, hVar);
                    }
                    f1.b.w(sVar3, q2.i.f10706c, pVarC);
                    nVar2.invoke(sVar3, 0);
                    sVar3.p(true);
                }
                return zVar;
            case 3:
                long j10 = ((y1.q) obj).f14960a;
                f1.s sVar4 = (f1.s) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= sVar4.e(j10) ? 4 : 2;
                }
                if (sVar4.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    q0.k.b(((o0.d) obj4).f9253c, j10, sVar4, (iIntValue3 << 3) & 112);
                } else {
                    sVar4.Q();
                }
                return zVar;
            case 4:
                long j11 = ((y1.q) obj).f14960a;
                f1.s sVar5 = (f1.s) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (sVar5.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    pVar.a((Drawable) obj4, sVar5, 48);
                } else {
                    sVar5.Q();
                }
                return zVar;
            case 5:
                long j12 = ((y1.q) obj).f14960a;
                f1.s sVar6 = (f1.s) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (sVar6.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    pVar.b(((RemoteAction) obj4).getIcon(), sVar6, 48);
                } else {
                    sVar6.Q();
                }
                return zVar;
            case 6:
                r1.p pVar2 = (r1.p) obj;
                f1.s sVar7 = (f1.s) obj2;
                ((Number) obj3).intValue();
                w0.w0 w0Var2 = (w0.w0) obj4;
                sVar7.W(-1914520728);
                n3.c cVar2 = (n3.c) sVar7.j(j1.f11276h);
                Object objK5 = sVar7.K();
                Object obj9 = objK5;
                if (objK5 == w0Var) {
                    k1 k1VarS = f1.b.s(new n3.m(0L));
                    sVar7.h0(k1VarS);
                    obj9 = k1VarS;
                }
                f1.b1 b1Var = (f1.b1) obj9;
                boolean zH2 = sVar7.h(w0Var2);
                Object objK6 = sVar7.K();
                Object obj10 = objK6;
                if (zH2 || objK6 == w0Var) {
                    a8.f1 f1Var = new a8.f1(20, w0Var2, b1Var);
                    sVar7.h0(f1Var);
                    obj10 = f1Var;
                }
                h9.a aVar = (h9.a) obj10;
                boolean zF3 = sVar7.f(cVar2);
                Object objK7 = sVar7.K();
                Object obj11 = objK7;
                if (zF3 || objK7 == w0Var) {
                    w0.a1 a1Var = new w0.a1(cVar2, b1Var, 0);
                    sVar7.h0(a1Var);
                    obj11 = a1Var;
                }
                v.m mVar = w0.t0.f13935a;
                r1.p pVarA = r1.a.a(pVar2, new m1(aVar, (h9.k) obj11));
                sVar7.p(false);
                return pVarA;
            default:
                r1.p pVar3 = (r1.p) obj;
                f1.s sVar8 = (f1.s) obj2;
                ((Number) obj3).intValue();
                t1 t1Var = (t1) obj4;
                sVar8.W(1980580247);
                n3.c cVar3 = (n3.c) sVar8.j(j1.f11276h);
                Object objK8 = sVar8.K();
                Object obj12 = objK8;
                if (objK8 == w0Var) {
                    k1 k1VarS2 = f1.b.s(new n3.m(0L));
                    sVar8.h0(k1VarS2);
                    obj12 = k1VarS2;
                }
                f1.b1 b1Var2 = (f1.b1) obj12;
                boolean zH3 = sVar8.h(t1Var);
                Object objK9 = sVar8.K();
                Object obj13 = objK9;
                if (zH3 || objK9 == w0Var) {
                    a8.f1 f1Var2 = new a8.f1(22, t1Var, b1Var2);
                    sVar8.h0(f1Var2);
                    obj13 = f1Var2;
                }
                h9.a aVar2 = (h9.a) obj13;
                boolean zF4 = sVar8.f(cVar3);
                Object objK10 = sVar8.K();
                Object obj14 = objK10;
                if (zF4 || objK10 == w0Var) {
                    w0.a1 a1Var2 = new w0.a1(cVar3, b1Var2, 2);
                    sVar8.h0(a1Var2);
                    obj14 = a1Var2;
                }
                v.m mVar2 = w0.t0.f13935a;
                r1.p pVarA2 = r1.a.a(pVar3, new m1(aVar2, (h9.k) obj14));
                sVar8.p(false);
                return pVarA2;
        }
    }
}
