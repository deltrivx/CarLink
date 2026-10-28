package a8;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b8.s2;
import c1.u2;
import f1.w2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f158c;

    public /* synthetic */ k0(int i7, Object obj, Object obj2) {
        this.f156a = i7;
        this.f157b = obj;
        this.f158c = obj2;
    }

    private final Object e(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        Context context = (Context) this.f157b;
        int i7 = iIntValue & 3;
        t8.z zVar = t8.z.f12851a;
        if (i7 == 2 && sVar.z()) {
            sVar.Q();
            return zVar;
        }
        sVar.W(1849434622);
        Object objK = sVar.K();
        y8.c cVar = null;
        f1.w0 w0Var = f1.n.f5051a;
        if (objK == w0Var) {
            Object systemService = context.getSystemService("usb");
            objK = systemService instanceof UsbManager ? (UsbManager) systemService : null;
            sVar.h0(objK);
        }
        UsbManager usbManager = (UsbManager) objK;
        Object objC = a2.f.C(sVar, false, 1849434622);
        if (objC == w0Var) {
            objC = new p1.p();
            sVar.h0(objC);
        }
        p1.p pVar = (p1.p) objC;
        sVar.p(false);
        sVar.W(-1633490746);
        boolean zH = sVar.h(usbManager);
        Object objK2 = sVar.K();
        if (zH || objK2 == w0Var) {
            objK2 = new l8.t(usbManager, pVar, cVar, 2);
            sVar.h0(objK2);
        }
        sVar.p(false);
        f1.b.f(sVar, (h9.n) objK2, zVar);
        sVar.W(-1746271574);
        boolean zH2 = sVar.h(usbManager) | sVar.h(context);
        Object objK3 = sVar.K();
        if (zH2 || objK3 == w0Var) {
            objK3 = new u0(context, usbManager, pVar, 9);
            sVar.h0(objK3);
        }
        sVar.p(false);
        f1.b.c(zVar, (h9.k) objK3, sVar);
        g5.a.b(null, n1.h.e(-779107994, new k0(20, pVar, (p1.p) this.f158c), sVar), sVar, 48, 1);
        return zVar;
    }

    private final Object f(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zF = sVar.f((s0.e) this.f157b);
            s0.e eVar = (s0.e) this.f157b;
            Object objK = sVar.K();
            if (zF || objK == f1.n.f5051a) {
                objK = f1.b.o(new c.k0(0, eVar, s0.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 2));
                sVar.h0(objK);
            }
            q0.k.a((s0.b) this.f158c, (o0.c) ((w2) objK).getValue(), sVar, 0);
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }

    private final Object g(Object obj, Object obj2) {
        long j5;
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        t8.z zVar = t8.z.f12851a;
        int i7 = 2;
        if (iIntValue == 2 && sVar.z()) {
            sVar.Q();
            return zVar;
        }
        d0.d dVar = d0.h.f3569d;
        FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
        View view = (View) this.f157b;
        f1.b1 b1Var = (f1.b1) this.f158c;
        d0.n0 n0VarA = d0.l0.a(dVar, r1.c.f11101j, sVar, 6);
        long j10 = sVar.T;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        f1.q1 q1VarL = sVar.l();
        r1.p pVarC = r1.a.c(sVar, fillElement);
        q2.j.f10719d0.getClass();
        q2.a0 a0Var = q2.i.f10705b;
        sVar.a0();
        if (sVar.S) {
            sVar.k(a0Var);
        } else {
            sVar.k0();
        }
        f1.b.w(sVar, q2.i.f10708e, n0VarA);
        f1.b.w(sVar, q2.i.f10707d, q1VarL);
        q2.h hVar = q2.i.f10709f;
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
            ob.a.w(i10, sVar, i10, hVar);
        }
        f1.b.w(sVar, q2.i.f10706c, pVarC);
        sVar.W(1357118917);
        b9.b<v7.f> bVar = v7.f.f13644g;
        ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
        for (v7.f fVar : bVar) {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar = (b0.k) objK;
            sVar.p(false);
            sVar.W(-1746271574);
            boolean zH = sVar.h(view) | sVar.d(fVar.ordinal());
            Object objK2 = sVar.K();
            if (zH || objK2 == w0Var) {
                objK2 = new j1((Object) view, (Object) fVar, b1Var, 9);
                sVar.h0(objK2);
            }
            h9.a aVar = (h9.a) objK2;
            sVar.p(false);
            r1.m mVar = r1.m.f11116a;
            r1.p pVarC2 = androidx.compose.foundation.a.c(mVar, kVar, null, false, aVar, 28);
            o2.m0 m0VarD = d0.m.d(r1.c.f11092a, false);
            long j11 = sVar.T;
            int i11 = (int) (j11 ^ (j11 >>> 32));
            f1.q1 q1VarL2 = sVar.l();
            r1.p pVarC3 = r1.a.c(sVar, pVarC2);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var2 = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var2);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD);
            f1.b.w(sVar, q2.i.f10707d, q1VarL2);
            q2.h hVar2 = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar2);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC3);
            String str = fVar.f13645a;
            long jK = n3.r.K(g5.a.n(22, sVar), 4294967296L);
            if (((v7.f) b1Var.getValue()) == fVar) {
                sVar.W(-1114334092);
                j5 = ((c1.w) sVar.j(c1.y.f2319a)).f2225a;
            } else {
                sVar.W(-1114332839);
                j5 = ((c1.w) sVar.j(c1.y.f2319a)).f2238o;
            }
            sVar.p(false);
            f1.s sVar2 = sVar;
            t8.z zVar2 = zVar;
            u2.b(str, androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.a.j(mVar, g5.a.n(16, sVar), 0.0f, i7), 0.0f, g5.a.n(6, sVar), 0.0f, g5.a.n(16, sVar), 5), j5, jK, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131056);
            sVar = sVar2;
            sVar.p(true);
            arrayList = arrayList;
            arrayList.add(zVar2);
            zVar = zVar2;
            b1Var = b1Var;
            view = view;
            i7 = 2;
        }
        t8.z zVar3 = zVar;
        sVar.p(false);
        sVar.p(true);
        return zVar3;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    private final Object h(Object obj, Object obj2) {
        boolean z10;
        w0.y yVar;
        w0.p pVarD;
        float fT;
        w0.y yVar2;
        w0.p pVarD2;
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        w0.w0 w0Var = (w0.w0) this.f158c;
        int i7 = 1;
        int i10 = 0;
        if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ((n1.c) this.f157b).invoke(sVar, 0);
            if (w0Var.h() && ((Boolean) w0Var.f13987i.getValue()).booleanValue()) {
                w0.z zVarG = w0Var.g();
                if (zVarG == null ? true : i9.l.a(zVarG.f14018a, zVarG.f14019b)) {
                    sVar.W(2013602667);
                    sVar.p(false);
                } else {
                    sVar.W(-1736225307);
                    w0.z zVarG2 = w0Var.g();
                    if (zVarG2 == null) {
                        sVar.W(2011629175);
                        sVar.p(false);
                        z10 = false;
                    } else {
                        sVar.W(2011629176);
                        sVar.W(-1736222526);
                        List listJ = n3.l.J(Boolean.TRUE, Boolean.FALSE);
                        int size = listJ.size();
                        int i11 = 0;
                        while (i11 < size) {
                            boolean zBooleanValue = ((Boolean) listJ.get(i11)).booleanValue();
                            boolean zG = sVar.g(zBooleanValue);
                            Object objK = sVar.K();
                            f1.w0 w0Var2 = f1.n.f5051a;
                            if (zG || objK == w0Var2) {
                                objK = new w0.p1(zBooleanValue, w0Var);
                                sVar.h0(objK);
                            }
                            l0.b1 b1Var = (l0.b1) objK;
                            boolean zG2 = sVar.g(zBooleanValue);
                            Object objK2 = sVar.K();
                            if (zG2 || objK2 == w0Var2) {
                                objK2 = zBooleanValue ? new w0.f0(w0Var, i10) : new w0.f0(w0Var, i7);
                                sVar.h0(objK2);
                            }
                            h9.a aVar = (h9.a) objK2;
                            m3.j jVar = zBooleanValue ? zVarG2.f14018a.f14009a : zVarG2.f14019b.f14009a;
                            if (zBooleanValue) {
                                w0.z zVarG3 = w0Var.g();
                                if (zVarG3 == null || (pVarD2 = w0Var.d((yVar2 = zVarG3.f14018a))) == null) {
                                    fT = 0.0f;
                                } else {
                                    int i12 = yVar2.f14010b;
                                    b3.o0 o0Var = (b3.o0) pVarD2.f13876c.invoke();
                                    if (o0Var != null) {
                                        fT = l0.q0.t(o0Var, i12);
                                    } else {
                                        fT = 0.0f;
                                    }
                                }
                            } else {
                                w0.z zVarG4 = w0Var.g();
                                if (zVarG4 == null || (pVarD = w0Var.d((yVar = zVarG4.f14019b))) == null) {
                                    fT = 0.0f;
                                } else {
                                    int i13 = yVar.f14010b;
                                    b3.o0 o0Var2 = (b3.o0) pVarD.f13876c.invoke();
                                    if (o0Var2 != null) {
                                        fT = l0.q0.t(o0Var2, i13);
                                    } else {
                                        fT = 0.0f;
                                    }
                                }
                            }
                            int i14 = size;
                            w0.i0 i0Var = new w0.i0(aVar);
                            int i15 = i11;
                            m3.j jVar2 = jVar;
                            boolean z11 = zVarG2.f14020c;
                            boolean zH = sVar.h(b1Var);
                            Object objK3 = sVar.K();
                            if (zH || objK3 == w0Var2) {
                                objK3 = new w0.g0(b1Var, i10);
                                sVar.h0(objK3);
                            }
                            w0.y0.d(i0Var, zBooleanValue, jVar2, z11, 0L, fT, new SuspendPointerInputElement(b1Var, null, (PointerInputEventHandler) objK3, 6), sVar, 0);
                            i11 = i15 + 1;
                            size = i14;
                            i7 = 1;
                            i10 = 0;
                        }
                        z10 = false;
                        sVar.p(false);
                        sVar.p(false);
                    }
                    sVar.p(z10);
                }
            } else {
                sVar.W(2013602667);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:139:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:143:0x0442  */
    /* JADX WARN: Code duplicated, block: B:144:0x0446  */
    /* JADX WARN: Code duplicated, block: B:149:0x0463  */
    /* JADX WARN: Code duplicated, block: B:152:0x0484  */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        char c10;
        int i7;
        Object objK;
        f1.w0 w0Var;
        int i10;
        Object objK2;
        f1.h1 h1Var;
        switch (this.f156a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                l0 l0Var = (l0) this.f158c;
                h9.k kVar = (h9.k) this.f157b;
                if ((iIntValue & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    b9.b<i0> bVar = i0.f141e;
                    ArrayList arrayList = new ArrayList(u8.q.a0(bVar, 10));
                    for (i0 i0Var : bVar) {
                        arrayList.add(new l8.j0(i0Var.f142a, new l8.l0(i0Var.f143b), null, null, null, 28));
                    }
                    sVar.W(-1633490746);
                    boolean zF = sVar.f(kVar) | sVar.f(l0Var);
                    Object objK3 = sVar.K();
                    if (zF || objK3 == f1.n.f5051a) {
                        objK3 = new j0(kVar, l0Var, 0);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    g5.a.c(arrayList, null, 0, null, 0.0f, 0.0f, (h9.k) objK3, sVar, 0, 62);
                }
                return t8.z.f12851a;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                d1 d1Var = (d1) this.f157b;
                if ((iIntValue2 & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    sVar2.W(-1633490746);
                    boolean zF2 = sVar2.f(d1Var);
                    f1.b1 b1Var = (f1.b1) this.f158c;
                    Object objK4 = sVar2.K();
                    if (zF2 || objK4 == f1.n.f5051a) {
                        objK4 = new k(d1Var, b1Var, 7);
                        sVar2.h0(objK4);
                    }
                    sVar2.p(false);
                    i2.c.o("测试", (h9.a) objK4, sVar2, 6);
                }
                return t8.z.f12851a;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                e1 e1Var = (e1) this.f158c;
                h9.k kVar2 = (h9.k) this.f157b;
                if ((iIntValue3 & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    b9.b<o7.w> bVar2 = o7.w.f9543e;
                    ArrayList arrayList2 = new ArrayList(u8.q.a0(bVar2, 10));
                    for (o7.w wVar : bVar2) {
                        arrayList2.add(new l8.j0(wVar.f9544a, new l8.l0(wVar.f9545b), null, null, null, 28));
                    }
                    sVar3.W(-1633490746);
                    boolean zF3 = sVar3.f(kVar2) | sVar3.f(e1Var);
                    Object objK5 = sVar3.K();
                    if (zF3 || objK5 == f1.n.f5051a) {
                        objK5 = new j0(kVar2, e1Var, 1);
                        sVar3.h0(objK5);
                    }
                    sVar3.p(false);
                    g5.a.c(arrayList2, null, 0, null, 0.0f, 0.0f, (h9.k) objK5, sVar3, 0, 62);
                }
                return t8.z.f12851a;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                n1 n1Var = (n1) this.f158c;
                h9.k kVar3 = (h9.k) this.f157b;
                if ((iIntValue4 & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    b9.b<b8.f2> bVar3 = b8.f2.f1586f;
                    ArrayList arrayList3 = new ArrayList(u8.q.a0(bVar3, 10));
                    for (b8.f2 f2Var : bVar3) {
                        arrayList3.add(new l8.j0(f2Var.f1587a, new l8.l0(f2Var.f1588b), null, null, null, 28));
                    }
                    sVar4.W(-1633490746);
                    boolean zF4 = sVar4.f(kVar3) | sVar4.f(n1Var);
                    Object objK6 = sVar4.K();
                    if (zF4 || objK6 == f1.n.f5051a) {
                        objK6 = new j0(kVar3, n1Var, 2);
                        sVar4.h0(objK6);
                    }
                    sVar4.p(false);
                    g5.a.c(arrayList3, null, 0, null, 0.0f, 0.0f, (h9.k) objK6, sVar4, 0, 62);
                }
                return t8.z.f12851a;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                u1 u1Var = (u1) this.f158c;
                h9.k kVar4 = (h9.k) this.f157b;
                if ((iIntValue5 & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    b9.b<s2> bVar4 = s2.f1651e;
                    ArrayList arrayList4 = new ArrayList(u8.q.a0(bVar4, 10));
                    for (s2 s2Var : bVar4) {
                        arrayList4.add(new l8.j0(s2Var.f1652a, new l8.l0(s2Var.f1653b), null, null, null, 28));
                    }
                    sVar5.W(-1633490746);
                    boolean zF5 = sVar5.f(kVar4) | sVar5.f(u1Var);
                    Object objK7 = sVar5.K();
                    if (zF5 || objK7 == f1.n.f5051a) {
                        objK7 = new j0(kVar4, u1Var, 3);
                        sVar5.h0(objK7);
                    }
                    sVar5.p(false);
                    g5.a.c(arrayList4, null, 0, null, 0.0f, 0.0f, (h9.k) objK7, sVar5, 0, 62);
                }
                return t8.z.f12851a;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                f2 f2Var2 = (f2) this.f157b;
                if ((iIntValue6 & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    sVar6.W(-1633490746);
                    boolean zF6 = sVar6.f(f2Var2);
                    f1.b1 b1Var2 = (f1.b1) this.f158c;
                    Object objK8 = sVar6.K();
                    if (zF6 || objK8 == f1.n.f5051a) {
                        objK8 = new k(f2Var2, b1Var2, 10);
                        sVar6.h0(objK8);
                    }
                    sVar6.p(false);
                    i2.c.o("测试", (h9.a) objK8, sVar6, 6);
                }
                return t8.z.f12851a;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                e8.w wVar2 = (e8.w) this.f158c;
                h9.k kVar5 = (h9.k) this.f157b;
                if ((iIntValue7 & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    b9.b<e8.k> bVar5 = e8.k.f4569f;
                    ArrayList arrayList5 = new ArrayList(u8.q.a0(bVar5, 10));
                    for (e8.k kVar6 : bVar5) {
                        arrayList5.add(new l8.j0(kVar6.f4570a, new l8.l0(kVar6.f4572c), String.valueOf(kVar6.f4571b), null, null, 24));
                    }
                    sVar7.W(-1633490746);
                    boolean zF7 = sVar7.f(kVar5) | sVar7.h(wVar2);
                    Object objK9 = sVar7.K();
                    if (zF7 || objK9 == f1.n.f5051a) {
                        objK9 = new c8.p(6, kVar5, wVar2);
                        sVar7.h0(objK9);
                    }
                    sVar7.p(false);
                    g5.a.c(arrayList5, null, 0, null, 0.0f, 0.0f, (h9.k) objK9, sVar7, 0, 62);
                }
                return t8.z.f12851a;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                e8.z zVar = (e8.z) this.f158c;
                h9.k kVar7 = (h9.k) this.f157b;
                if ((iIntValue8 & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    b9.b<e8.x> bVar6 = e8.x.f4653h;
                    ArrayList arrayList6 = new ArrayList(u8.q.a0(bVar6, 10));
                    for (e8.x xVar : bVar6) {
                        arrayList6.add(new l8.j0(xVar.f4654a, new l8.l0(xVar.f4655b), null, null, null, 28));
                    }
                    sVar8.W(-1633490746);
                    boolean zF8 = sVar8.f(kVar7) | sVar8.f(zVar);
                    Object objK10 = sVar8.K();
                    if (zF8 || objK10 == f1.n.f5051a) {
                        objK10 = new j0(kVar7, zVar, 4);
                        sVar8.h0(objK10);
                    }
                    sVar8.p(false);
                    g5.a.c(arrayList6, null, 0, null, 0.0f, 0.0f, (h9.k) objK10, sVar8, 0, 62);
                }
                return t8.z.f12851a;
            case 8:
                f1.s sVar9 = (f1.s) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                e8.c0 c0Var = (e8.c0) this.f158c;
                h9.k kVar8 = (h9.k) this.f157b;
                if ((iIntValue9 & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    sVar9.W(-1633490746);
                    boolean zF9 = sVar9.f(kVar8) | sVar9.f(c0Var);
                    Object objK11 = sVar9.K();
                    if (zF9 || objK11 == f1.n.f5051a) {
                        objK11 = new a5.e(kVar8, c0Var);
                        sVar9.h0(objK11);
                    }
                    sVar9.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK11, sVar9, 6, 6);
                }
                return t8.z.f12851a;
            case 9:
                f1.s sVar10 = (f1.s) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                e8.k0 k0Var = (e8.k0) this.f158c;
                h9.k kVar9 = (h9.k) this.f157b;
                if ((iIntValue10 & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    b9.b<e8.g0> bVar7 = e8.g0.f4544e;
                    ArrayList arrayList7 = new ArrayList(u8.q.a0(bVar7, 10));
                    for (e8.g0 g0Var : bVar7) {
                        arrayList7.add(new l8.j0(g0Var.f4545a, new l8.l0(g0Var.f4546b), null, null, null, 28));
                    }
                    sVar10.W(-1633490746);
                    boolean zF10 = sVar10.f(kVar9) | sVar10.f(k0Var);
                    Object objK12 = sVar10.K();
                    if (zF10 || objK12 == f1.n.f5051a) {
                        objK12 = new j0(kVar9, k0Var, 5);
                        sVar10.h0(objK12);
                    }
                    sVar10.p(false);
                    g5.a.c(arrayList7, null, 0, null, 0.0f, 0.0f, (h9.k) objK12, sVar10, 0, 62);
                }
                return t8.z.f12851a;
            case 10:
                f1.s sVar11 = (f1.s) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                e8.q0 q0Var = (e8.q0) this.f158c;
                h9.k kVar10 = (h9.k) this.f157b;
                if ((iIntValue11 & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    b9.b<s2> bVar8 = s2.f1651e;
                    ArrayList arrayList8 = new ArrayList(u8.q.a0(bVar8, 10));
                    for (s2 s2Var2 : bVar8) {
                        arrayList8.add(new l8.j0(s2Var2.f1652a, new l8.l0(s2Var2.f1653b), null, null, null, 28));
                    }
                    sVar11.W(-1633490746);
                    boolean zF11 = sVar11.f(kVar10) | sVar11.h(q0Var);
                    Object objK13 = sVar11.K();
                    if (zF11 || objK13 == f1.n.f5051a) {
                        objK13 = new j0(kVar10, q0Var, 6);
                        sVar11.h0(objK13);
                    }
                    sVar11.p(false);
                    g5.a.c(arrayList8, null, 0, null, 0.0f, 0.0f, (h9.k) objK13, sVar11, 0, 62);
                }
                return t8.z.f12851a;
            case 11:
                f1.s sVar12 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar12.z()) {
                    sVar12.Q();
                } else {
                    sVar12.W(5004770);
                    w1.o oVar = (w1.o) this.f157b;
                    Object objK14 = sVar12.K();
                    if (objK14 == f1.n.f5051a) {
                        objK14 = new a5.e(2, oVar);
                        sVar12.h0(objK14);
                    }
                    sVar12.p(false);
                    c1.g1.c((h9.a) objK14, androidx.compose.foundation.layout.a.f(-8, 0.0f, 2), false, null, null, null, null, n1.h.e(946583076, new e8.r0(0, (f1.b1) this.f158c), sVar12), sVar12, 805306422);
                }
                return t8.z.f12851a;
            case 12:
                f1.s sVar13 = (f1.s) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                e8.g1 g1Var = (e8.g1) this.f158c;
                h9.k kVar11 = (h9.k) this.f157b;
                if ((iIntValue12 & 3) == 2 && sVar13.z()) {
                    sVar13.Q();
                } else {
                    b9.b<s2> bVar9 = s2.f1651e;
                    ArrayList arrayList9 = new ArrayList(u8.q.a0(bVar9, 10));
                    for (s2 s2Var3 : bVar9) {
                        arrayList9.add(new l8.j0(s2Var3.f1652a, new l8.l0(s2Var3.f1653b), null, null, null, 28));
                    }
                    sVar13.W(-1633490746);
                    boolean zF12 = sVar13.f(kVar11) | sVar13.h(g1Var);
                    Object objK15 = sVar13.K();
                    if (zF12 || objK15 == f1.n.f5051a) {
                        objK15 = new j0(kVar11, g1Var, 7);
                        sVar13.h0(objK15);
                    }
                    sVar13.p(false);
                    g5.a.c(arrayList9, null, 0, null, 0.0f, 0.0f, (h9.k) objK15, sVar13, 0, 62);
                }
                return t8.z.f12851a;
            case 13:
                f1.s sVar14 = (f1.s) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                h0.t tVar = (h0.t) this.f157b;
                h0.s sVar15 = (h0.s) this.f158c;
                if (sVar14.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    h0.v vVar = (h0.v) tVar.f6389b.invoke();
                    int iD = sVar15.f6370c;
                    Object obj3 = sVar15.f6368a;
                    if ((iD >= vVar.a() || !vVar.b(iD).equals(obj3)) && (iD = vVar.d(obj3)) != -1) {
                        sVar15.f6370c = iD;
                    }
                    int i11 = iD;
                    if (i11 != -1) {
                        sVar14.W(-1664741271);
                        h0.z.d(vVar, tVar.f6388a, i11, sVar15.f6368a, sVar14, 0);
                        sVar14.p(false);
                    } else {
                        sVar14.W(-1664505826);
                        sVar14.p(false);
                    }
                    boolean zH = sVar14.h(sVar15);
                    Object objK16 = sVar14.K();
                    if (zH || objK16 == f1.n.f5051a) {
                        objK16 = new c8.k(13, sVar15);
                        sVar14.h0(objK16);
                    }
                    f1.b.c(obj3, (h9.k) objK16, sVar14);
                } else {
                    sVar14.Q();
                }
                return t8.z.f12851a;
            case 14:
                f1.s sVar16 = (f1.s) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (sVar16.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ((n1.c) this.f157b).invoke((h0.q0) this.f158c, sVar16, 0);
                } else {
                    sVar16.Q();
                }
                return t8.z.f12851a;
            case 15:
                f1.s sVar17 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar17.z()) {
                    sVar17.Q();
                } else {
                    f1.h1 h1Var2 = (f1.h1) this.f157b;
                    f1.h1 h1Var3 = (f1.h1) this.f158c;
                    d0.b bVar10 = d0.h.f3566a;
                    r1.g gVar = r1.c.f11101j;
                    d0.n0 n0VarA = d0.l0.a(bVar10, gVar, sVar17, 0);
                    long j5 = sVar17.T;
                    int i12 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL = sVar17.l();
                    r1.m mVar = r1.m.f11116a;
                    r1.p pVarC = r1.a.c(sVar17, mVar);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar17.a0();
                    if (sVar17.S) {
                        sVar17.k(a0Var);
                    } else {
                        sVar17.k0();
                    }
                    q2.h hVar = q2.i.f10708e;
                    f1.b.w(sVar17, hVar, n0VarA);
                    q2.h hVar2 = q2.i.f10707d;
                    f1.b.w(sVar17, hVar2, q1VarL);
                    q2.h hVar3 = q2.i.f10709f;
                    if (sVar17.S) {
                        c10 = ' ';
                    } else {
                        c10 = ' ';
                        if (!i9.l.a(sVar17.K(), Integer.valueOf(i12))) {
                        }
                        q2.h hVar4 = q2.i.f10706c;
                        f1.b.w(sVar17, hVar4, pVarC);
                        r1.p pVarQ = a2.f.Q();
                        d0.n0 n0VarA2 = d0.l0.a(bVar10, gVar, sVar17, 0);
                        long j10 = sVar17.T;
                        i7 = (int) (j10 ^ (j10 >>> c10));
                        f1.q1 q1VarL2 = sVar17.l();
                        r1.p pVarC2 = r1.a.c(sVar17, pVarQ);
                        sVar17.a0();
                        if (sVar17.S) {
                            sVar17.k(a0Var);
                        } else {
                            sVar17.k0();
                        }
                        f1.b.w(sVar17, hVar, n0VarA2);
                        f1.b.w(sVar17, hVar2, q1VarL2);
                        if (sVar17.S || !i9.l.a(sVar17.K(), Integer.valueOf(i7))) {
                            ob.a.w(i7, sVar17, i7, hVar3);
                        }
                        f1.b.w(sVar17, hVar4, pVarC2);
                        n9.d dVar = new n9.d(0, 23, 1);
                        int iF = h1Var2.f();
                        sVar17.W(5004770);
                        objK = sVar17.K();
                        w0Var = f1.n.f5051a;
                        if (objK == w0Var) {
                            objK = new g1(h1Var2, 6);
                            sVar17.h0(objK);
                        }
                        sVar17.p(false);
                        o9.e0.d("小时", dVar, iF, (h9.k) objK, sVar17, 3078);
                        sVar17.p(true);
                        d0.c.a(sVar17, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(10, sVar17)));
                        r1.p pVarQ2 = a2.f.Q();
                        d0.n0 n0VarA3 = d0.l0.a(bVar10, gVar, sVar17, 0);
                        long j11 = sVar17.T;
                        i10 = (int) (j11 ^ (j11 >>> c10));
                        f1.q1 q1VarL3 = sVar17.l();
                        r1.p pVarC3 = r1.a.c(sVar17, pVarQ2);
                        sVar17.a0();
                        if (sVar17.S) {
                            sVar17.k(a0Var);
                        } else {
                            sVar17.k0();
                        }
                        f1.b.w(sVar17, hVar, n0VarA3);
                        f1.b.w(sVar17, hVar2, q1VarL3);
                        if (sVar17.S || !i9.l.a(sVar17.K(), Integer.valueOf(i10))) {
                            ob.a.w(i10, sVar17, i10, hVar3);
                        }
                        f1.b.w(sVar17, hVar4, pVarC3);
                        n9.d dVar2 = new n9.d(0, 59, 1);
                        int iF2 = h1Var3.f();
                        sVar17.W(5004770);
                        objK2 = sVar17.K();
                        if (objK2 == w0Var) {
                            objK2 = new g1(h1Var3, 7);
                            sVar17.h0(objK2);
                        }
                        sVar17.p(false);
                        o9.e0.d("分钟", dVar2, iF2, (h9.k) objK2, sVar17, 3078);
                        sVar17.p(true);
                        sVar17.p(true);
                    }
                    ob.a.w(i12, sVar17, i12, hVar3);
                    q2.h hVar5 = q2.i.f10706c;
                    f1.b.w(sVar17, hVar5, pVarC);
                    r1.p pVarQ3 = a2.f.Q();
                    d0.n0 n0VarA4 = d0.l0.a(bVar10, gVar, sVar17, 0);
                    long j12 = sVar17.T;
                    i7 = (int) (j12 ^ (j12 >>> c10));
                    f1.q1 q1VarL4 = sVar17.l();
                    r1.p pVarC4 = r1.a.c(sVar17, pVarQ3);
                    sVar17.a0();
                    if (sVar17.S) {
                        sVar17.k(a0Var);
                    } else {
                        sVar17.k0();
                    }
                    f1.b.w(sVar17, hVar, n0VarA4);
                    f1.b.w(sVar17, hVar2, q1VarL4);
                    if (sVar17.S) {
                        ob.a.w(i7, sVar17, i7, hVar3);
                    } else {
                        ob.a.w(i7, sVar17, i7, hVar3);
                    }
                    f1.b.w(sVar17, hVar5, pVarC4);
                    n9.d dVar3 = new n9.d(0, 23, 1);
                    int iF3 = h1Var2.f();
                    sVar17.W(5004770);
                    objK = sVar17.K();
                    w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new g1(h1Var2, 6);
                        sVar17.h0(objK);
                    }
                    sVar17.p(false);
                    o9.e0.d("小时", dVar3, iF3, (h9.k) objK, sVar17, 3078);
                    sVar17.p(true);
                    d0.c.a(sVar17, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(10, sVar17)));
                    r1.p pVarQ4 = a2.f.Q();
                    d0.n0 n0VarA5 = d0.l0.a(bVar10, gVar, sVar17, 0);
                    long j13 = sVar17.T;
                    i10 = (int) (j13 ^ (j13 >>> c10));
                    f1.q1 q1VarL5 = sVar17.l();
                    r1.p pVarC5 = r1.a.c(sVar17, pVarQ4);
                    sVar17.a0();
                    if (sVar17.S) {
                        sVar17.k(a0Var);
                    } else {
                        sVar17.k0();
                    }
                    f1.b.w(sVar17, hVar, n0VarA5);
                    f1.b.w(sVar17, hVar2, q1VarL5);
                    if (sVar17.S) {
                        ob.a.w(i10, sVar17, i10, hVar3);
                    } else {
                        ob.a.w(i10, sVar17, i10, hVar3);
                    }
                    f1.b.w(sVar17, hVar5, pVarC5);
                    n9.d dVar4 = new n9.d(0, 59, 1);
                    int iF4 = h1Var3.f();
                    sVar17.W(5004770);
                    objK2 = sVar17.K();
                    if (objK2 == w0Var) {
                        objK2 = new g1(h1Var3, 7);
                        sVar17.h0(objK2);
                    }
                    sVar17.p(false);
                    o9.e0.d("分钟", dVar4, iF4, (h9.k) objK2, sVar17, 3078);
                    sVar17.p(true);
                    sVar17.p(true);
                }
                return t8.z.f12851a;
            case 16:
                f1.s sVar18 = (f1.s) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                h9.k kVar12 = (h9.k) this.f157b;
                List list = (List) this.f158c;
                if ((iIntValue15 & 3) == 2 && sVar18.z()) {
                    sVar18.Q();
                } else {
                    sVar18.W(1849434622);
                    Object objK17 = sVar18.K();
                    f1.w0 w0Var2 = f1.n.f5051a;
                    if (objK17 == w0Var2) {
                        f1.h1 h1Var4 = new f1.h1(Integer.parseInt((String) u8.p.k0(list)));
                        sVar18.h0(h1Var4);
                        objK17 = h1Var4;
                    }
                    f1.h1 h1Var5 = (f1.h1) objK17;
                    Object objC = a2.f.C(sVar18, false, 1849434622);
                    if (objC == w0Var2) {
                        f1.h1 h1Var6 = new f1.h1(Integer.parseInt((String) u8.p.s0(list)));
                        sVar18.h0(h1Var6);
                        objC = h1Var6;
                    }
                    f1.h1 h1Var7 = (f1.h1) objC;
                    sVar18.p(false);
                    Integer numValueOf = Integer.valueOf(h1Var5.f());
                    Integer numValueOf2 = Integer.valueOf(h1Var7.f());
                    sVar18.W(-1746271574);
                    boolean zF13 = sVar18.f(kVar12);
                    Object objK18 = sVar18.K();
                    y8.c cVar = null;
                    if (zF13 || objK18 == w0Var2) {
                        h1Var = h1Var5;
                        e0 e0Var = new e0(kVar12, h1Var, h1Var7, cVar, 3);
                        sVar18.h0(e0Var);
                        objK18 = e0Var;
                    } else {
                        h1Var = h1Var5;
                    }
                    sVar18.p(false);
                    f1.b.g(numValueOf, numValueOf2, (h9.n) objK18, sVar18);
                    g5.a.b(null, n1.h.e(1343980518, new k0(15, h1Var, h1Var7), sVar18), sVar18, 48, 1);
                }
                return t8.z.f12851a;
            case 17:
                f1.s sVar19 = (f1.s) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                h9.n nVar = (h9.n) this.f157b;
                if ((iIntValue16 & 3) == 2 && sVar19.z()) {
                    sVar19.Q();
                } else {
                    sVar19.W(-1633490746);
                    boolean zF14 = sVar19.f(nVar);
                    f1.b1 b1Var3 = (f1.b1) this.f158c;
                    Object objK19 = sVar19.K();
                    if (zF14 || objK19 == f1.n.f5051a) {
                        objK19 = new f1(8, nVar, b1Var3);
                        sVar19.h0(objK19);
                    }
                    sVar19.p(false);
                    i2.c.l("上传", 0L, 0L, (h9.a) objK19, sVar19, 6, 6);
                }
                return t8.z.f12851a;
            case 18:
                f1.s sVar20 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar20.z()) {
                    sVar20.Q();
                } else {
                    u2.b(((t8.j) this.f157b).f12830a + ((String) ((f1.b1) this.f158c).getValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar20, 0, 0, 131070);
                }
                return t8.z.f12851a;
            case 19:
                f1.s sVar21 = (f1.s) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                String str = (String) this.f158c;
                if ((iIntValue17 & 3) == 2 && sVar21.z()) {
                    sVar21.Q();
                } else {
                    String productName = ((UsbDevice) this.f157b).getProductName();
                    if (productName == null) {
                        productName = str;
                    }
                    i2.c.m(productName, null, sVar21, 0, 2);
                    i2.c.p(str, sVar21, 0);
                }
                return t8.z.f12851a;
            case 20:
                f1.s sVar22 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar22.z()) {
                    sVar22.Q();
                } else {
                    a.a.h(o7.d.f9481d, o7.d.f9482e, false, null, sVar22, 54, 12);
                    r1.p pVarC6 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.f822c, 66, 500);
                    p1.p pVar = (p1.p) this.f157b;
                    p1.p pVar2 = (p1.p) this.f158c;
                    o2.m0 m0VarD = d0.m.d(r1.c.f11092a, false);
                    long j14 = sVar22.T;
                    int i13 = (int) (j14 ^ (j14 >>> 32));
                    f1.q1 q1VarL6 = sVar22.l();
                    r1.p pVarC7 = r1.a.c(sVar22, pVarC6);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var2 = q2.i.f10705b;
                    sVar22.a0();
                    if (sVar22.S) {
                        sVar22.k(a0Var2);
                    } else {
                        sVar22.k0();
                    }
                    q2.h hVar6 = q2.i.f10708e;
                    f1.b.w(sVar22, hVar6, m0VarD);
                    q2.h hVar7 = q2.i.f10707d;
                    f1.b.w(sVar22, hVar7, q1VarL6);
                    q2.h hVar8 = q2.i.f10709f;
                    if (sVar22.S || !i9.l.a(sVar22.K(), Integer.valueOf(i13))) {
                        ob.a.w(i13, sVar22, i13, hVar8);
                    }
                    q2.h hVar9 = q2.i.f10706c;
                    f1.b.w(sVar22, hVar9, pVarC7);
                    sVar22.W(474099102);
                    if (pVar.isEmpty()) {
                        r1.p pVarJ = androidx.compose.foundation.layout.a.j(r1.m.f11116a, 0.0f, 10, 1);
                        d0.n0 n0VarA6 = d0.l0.a(d0.h.f3566a, r1.c.f11101j, sVar22, 0);
                        long j15 = sVar22.T;
                        int i14 = (int) (j15 ^ (j15 >>> 32));
                        f1.q1 q1VarL7 = sVar22.l();
                        r1.p pVarC8 = r1.a.c(sVar22, pVarJ);
                        sVar22.a0();
                        if (sVar22.S) {
                            sVar22.k(a0Var2);
                        } else {
                            sVar22.k0();
                        }
                        f1.b.w(sVar22, hVar6, n0VarA6);
                        f1.b.w(sVar22, hVar7, q1VarL7);
                        if (sVar22.S || !i9.l.a(sVar22.K(), Integer.valueOf(i14))) {
                            ob.a.w(i14, sVar22, i14, hVar8);
                        }
                        f1.b.w(sVar22, hVar9, pVarC8);
                        i2.c.m("请插入USB设备", null, sVar22, 6, 2);
                        sVar22.p(true);
                    }
                    Object objC2 = a2.f.C(sVar22, false, -1633490746);
                    if (objC2 == f1.n.f5051a) {
                        objC2 = new c8.p(15, pVar, pVar2);
                        sVar22.h0(objC2);
                    }
                    sVar22.p(false);
                    o9.e0.b(805306368, 511, null, null, null, sVar22, (h9.k) objC2, null, null, null, null, false);
                    sVar22.p(true);
                }
                return t8.z.f12851a;
            case 21:
                return e(obj, obj2);
            case 22:
                return f(obj, obj2);
            case 23:
                return g(obj, obj2);
            case 24:
                return h(obj, obj2);
            default:
                return Boolean.valueOf(i9.l.a((x9.k) obj, (x9.b) this.f157b) && i9.l.a((x9.k) obj2, (x9.b) this.f158c));
        }
    }
}
