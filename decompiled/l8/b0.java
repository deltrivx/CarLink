package l8;

import a8.f1;
import a8.g1;
import c1.g2;
import f1.h1;
import f1.q1;
import f1.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8107a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t8.j f8108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f8109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f8110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8111e;

    public b0(List list, t8.j jVar, h1 h1Var, h1 h1Var2) {
        this.f8111e = list;
        this.f8108b = jVar;
        this.f8109c = h1Var;
        this.f8110d = h1Var2;
    }

    public b0(t8.j jVar, h1 h1Var, h1 h1Var2, List list) {
        this.f8108b = jVar;
        this.f8109c = h1Var;
        this.f8110d = h1Var2;
        this.f8111e = list;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x021f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0223  */
    /* JADX WARN: Code duplicated, block: B:44:0x022e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0359  */
    /* JADX WARN: Code duplicated, block: B:51:0x0377  */
    /* JADX WARN: Code duplicated, block: B:53:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x03db  */
    /* JADX WARN: Code duplicated, block: B:65:0x03fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        final h1 h1Var;
        boolean z10;
        f1.s sVar;
        t8.z zVar;
        q2.h hVar;
        q2.h hVar2;
        float f10;
        ?? r8;
        int i7;
        e2.f fVarB;
        q2.h hVar3;
        Object objK;
        Object objM;
        boolean zF;
        Object obj3;
        int i10 = this.f8107a;
        t8.z zVar2 = t8.z.f12851a;
        List list = this.f8111e;
        final t8.j jVar = this.f8108b;
        h1 h1Var2 = this.f8109c;
        w0 w0Var = f1.n.f5051a;
        final h1 h1Var3 = this.f8110d;
        switch (i10) {
            case 0:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m((String) u8.p.k0(list), null, sVar2, 0, 2);
                    r1.m mVar = r1.m.f11116a;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(mVar, 0.0f, 6, 0.0f, 0.0f, 13);
                    d0.n0 n0VarA = d0.l0.a(d0.h.f3566a, r1.c.f11101j, sVar2, 0);
                    long j5 = sVar2.T;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar2.l();
                    r1.p pVarC = r1.a.c(sVar2, pVarK);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, q2.i.f10708e, n0VarA);
                    f1.b.w(sVar2, q2.i.f10707d, q1VarL);
                    q2.h hVar4 = q2.i.f10709f;
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i11))) {
                        ob.a.w(i11, sVar2, i11, hVar4);
                    }
                    f1.b.w(sVar2, q2.i.f10706c, pVarC);
                    float f11 = h1Var2.f();
                    int iIntValue = ((Number) jVar.f12831b).intValue();
                    n9.a aVar = (n9.a) jVar.f12830a;
                    r1.p pVarB = androidx.compose.foundation.layout.c.b(mVar, g5.a.n(27, sVar2));
                    sVar2.W(5004770);
                    Object objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = new g1(h1Var2, 8);
                        sVar2.h0(objK2);
                    }
                    h9.k kVar = (h9.k) objK2;
                    Object objC = a2.f.C(sVar2, false, -1633490746);
                    if (objC == w0Var) {
                        objC = new f1(h1Var2, h1Var3);
                        sVar2.h0(objC);
                    }
                    sVar2.p(false);
                    g2.b(f11, kVar, pVarB, false, aVar, iIntValue, (h9.a) objC, null, null, sVar2, 1572912, 392);
                    sVar2.p(true);
                }
                return zVar2;
            default:
                f1.s sVar3 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Object obj4 = jVar.f12831b;
                if ((iIntValue2 & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                    return zVar2;
                }
                sVar3.W(-226828628);
                int iIntValue3 = ((Number) obj4).intValue();
                r1.m mVar2 = r1.m.f11116a;
                if (iIntValue3 == 0) {
                    e2.f fVarB2 = i2.c.f6601a;
                    if (fVarB2 == null) {
                        e2.e eVar = new e2.e("Rounded.RemoveCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = e2.i0.f4202a;
                        y1.n0 n0Var = new y1.n0(y1.q.f14948b);
                        e2.g gVar = new e2.g();
                        ArrayList arrayList = gVar.f4168a;
                        gVar.i(12.0f, 2.0f);
                        arrayList.add(new e2.l(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f));
                        gVar.j(4.48f, 10.0f, 10.0f, 10.0f);
                        gVar.j(10.0f, -4.48f, 10.0f, -10.0f);
                        arrayList.add(new e2.q(17.52f, 2.0f, 12.0f, 2.0f));
                        gVar.c();
                        gVar.i(16.0f, 13.0f);
                        gVar.g(8.0f, 13.0f);
                        gVar.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        gVar.j(0.45f, -1.0f, 1.0f, -1.0f);
                        gVar.f(8.0f);
                        gVar.d(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        gVar.j(-0.45f, 1.0f, -1.0f, 1.0f);
                        gVar.c();
                        e2.e.a(eVar, arrayList, n0Var);
                        fVarB2 = eVar.b();
                        i2.c.f6601a = fVarB2;
                    }
                    long j10 = ((c1.w) sVar3.j(c1.y.f2319a)).A;
                    r1.p pVarH = androidx.compose.foundation.layout.c.h(mVar2, g5.a.n(30, sVar3));
                    sVar3.W(1849434622);
                    Object objK3 = sVar3.K();
                    if (objK3 == w0Var) {
                        objK3 = ob.a.m(sVar3);
                    }
                    b0.k kVar2 = (b0.k) objK3;
                    z10 = false;
                    boolean z11 = false;
                    sVar3.p(false);
                    sVar3.W(-1746271574);
                    boolean zF2 = sVar3.f(jVar);
                    Object objK4 = sVar3.K();
                    if (zF2 || objK4 == w0Var) {
                        h1Var = h1Var2;
                        final boolean z12 = z11 ? 1 : 0;
                        objK4 = new h9.a() { // from class: l8.c0
                            @Override // h9.a
                            public final Object invoke() {
                                switch (z12) {
                                    case 0:
                                        h1 h1Var4 = h1Var;
                                        if (h1Var4.f() > ((n9.a) jVar.f12830a).f8963a) {
                                            h1Var4.g(h1Var4.f() - 1);
                                            h1Var3.g(h1Var4.f());
                                        }
                                        break;
                                    default:
                                        h1 h1Var5 = h1Var;
                                        if (h1Var5.f() < ((n9.a) jVar.f12830a).f8964b) {
                                            h1Var5.g(h1Var5.f() + 1);
                                            h1Var3.g(h1Var5.f());
                                        }
                                        break;
                                }
                                return t8.z.f12851a;
                            }
                        };
                        sVar3.h0(objK4);
                    } else {
                        h1Var = h1Var2;
                    }
                    sVar3.p(false);
                    c1.k0.b(fVarB2, null, androidx.compose.foundation.a.c(pVarH, kVar2, null, false, (h9.a) objK4, 28), j10, sVar3, 48, 0);
                    sVar = sVar3;
                } else {
                    h1Var = h1Var2;
                    z10 = false;
                    sVar = sVar3;
                }
                sVar.p(z10);
                d0.d dVar = d0.h.f3569d;
                r1.p pVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.l(g5.a.n(16, sVar), 0.0f, 2), g5.a.n(4, sVar), 0.0f, 2);
                r1.g gVar2 = r1.c.f11101j;
                d0.n0 n0VarA2 = d0.l0.a(dVar, gVar2, sVar, 6);
                long j11 = sVar.T;
                int i13 = (int) (j11 ^ (j11 >>> 32));
                q1 q1VarL2 = sVar.l();
                r1.p pVarC2 = r1.a.c(sVar, pVarJ);
                q2.j.f10719d0.getClass();
                q2.a0 a0Var2 = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var2);
                } else {
                    sVar.k0();
                }
                q2.h hVar5 = q2.i.f10708e;
                f1.b.w(sVar, hVar5, n0VarA2);
                q2.h hVar6 = q2.i.f10707d;
                f1.b.w(sVar, hVar6, q1VarL2);
                q2.h hVar7 = q2.i.f10709f;
                if (!sVar.S) {
                    zVar = zVar2;
                    if (!i9.l.a(sVar.K(), Integer.valueOf(i13))) {
                    }
                    hVar = q2.i.f10706c;
                    f1.b.w(sVar, hVar, pVarC2);
                    i2.c.m(String.valueOf(h1Var.f()), null, sVar, 0, 2);
                    sVar.p(true);
                    sVar.W(-226800816);
                    if (((Number) obj4).intValue() == 0) {
                        fVarB = g5.a.f5917a;
                        if (fVarB != null) {
                            hVar3 = hVar7;
                        } else {
                            e2.e eVar2 = new e2.e("Rounded.AddCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i14 = e2.i0.f4202a;
                            y1.n0 n0Var2 = new y1.n0(y1.q.f14948b);
                            e2.g gVar3 = new e2.g();
                            ArrayList arrayList2 = gVar3.f4168a;
                            hVar3 = hVar7;
                            gVar3.i(12.0f, 2.0f);
                            arrayList2.add(new e2.l(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f));
                            gVar3.j(4.48f, 10.0f, 10.0f, 10.0f);
                            gVar3.j(10.0f, -4.48f, 10.0f, -10.0f);
                            arrayList2.add(new e2.q(17.52f, 2.0f, 12.0f, 2.0f));
                            gVar3.c();
                            gVar3.i(16.0f, 13.0f);
                            gVar3.f(-3.0f);
                            gVar3.l(3.0f);
                            gVar3.d(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                            gVar3.j(-1.0f, -0.45f, -1.0f, -1.0f);
                            gVar3.l(-3.0f);
                            gVar3.g(8.0f, 13.0f);
                            gVar3.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                            gVar3.j(0.45f, -1.0f, 1.0f, -1.0f);
                            gVar3.f(3.0f);
                            gVar3.g(11.0f, 8.0f);
                            gVar3.d(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                            gVar3.j(1.0f, 0.45f, 1.0f, 1.0f);
                            gVar3.l(3.0f);
                            gVar3.f(3.0f);
                            gVar3.d(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                            gVar3.j(-0.45f, 1.0f, -1.0f, 1.0f);
                            gVar3.c();
                            e2.e.a(eVar2, arrayList2, n0Var2);
                            fVarB = eVar2.b();
                            g5.a.f5917a = fVarB;
                        }
                        e2.f fVar = fVarB;
                        long j12 = ((c1.w) sVar.j(c1.y.f2319a)).A;
                        r1.p pVarH2 = androidx.compose.foundation.layout.c.h(mVar2, g5.a.n(30, sVar));
                        sVar.W(1849434622);
                        objK = sVar.K();
                        objM = objK;
                        if (objK == w0Var) {
                            objM = ob.a.m(sVar);
                        }
                        b0.k kVar3 = (b0.k) objM;
                        sVar.p(false);
                        sVar.W(-1746271574);
                        zF = sVar.f(jVar);
                        Object objK5 = sVar.K();
                        obj3 = objK5;
                        if (zF || objK5 == w0Var) {
                            final int i15 = 1;
                            h9.a aVar2 = new h9.a() { // from class: l8.c0
                                @Override // h9.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            h1 h1Var4 = h1Var;
                                            if (h1Var4.f() > ((n9.a) jVar.f12830a).f8963a) {
                                                h1Var4.g(h1Var4.f() - 1);
                                                h1Var3.g(h1Var4.f());
                                            }
                                            break;
                                        default:
                                            h1 h1Var5 = h1Var;
                                            if (h1Var5.f() < ((n9.a) jVar.f12830a).f8964b) {
                                                h1Var5.g(h1Var5.f() + 1);
                                                h1Var3.g(h1Var5.f());
                                            }
                                            break;
                                    }
                                    return t8.z.f12851a;
                                }
                            };
                            sVar.h0(aVar2);
                            obj3 = aVar2;
                        }
                        h9.a aVar3 = (h9.a) obj3;
                        r8 = 0;
                        sVar.p(false);
                        hVar2 = hVar3;
                        f10 = 0.0f;
                        c1.k0.b(fVar, null, androidx.compose.foundation.a.c(pVarH2, kVar3, null, false, aVar3, 28), j12, sVar, 48, 0);
                    } else {
                        hVar5 = hVar5;
                        hVar = hVar;
                        hVar6 = hVar6;
                        hVar2 = hVar7;
                        f10 = 0.0f;
                        r8 = 0;
                    }
                    sVar.p(r8);
                    r1.p pVarJ2 = androidx.compose.foundation.layout.a.j(mVar2, g5.a.n(4, sVar), f10, 2);
                    d0.n0 n0VarA3 = d0.l0.a(d0.h.f3566a, gVar2, sVar, r8);
                    long j13 = sVar.T;
                    i7 = (int) (j13 ^ (j13 >>> 32));
                    q1 q1VarL3 = sVar.l();
                    r1.p pVarC3 = r1.a.c(sVar, pVarJ2);
                    sVar.a0();
                    if (sVar.S) {
                        sVar.k(a0Var2);
                    } else {
                        sVar.k0();
                    }
                    f1.b.w(sVar, hVar5, n0VarA3);
                    f1.b.w(sVar, hVar6, q1VarL3);
                    if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                        ob.a.w(i7, sVar, i7, hVar2);
                    }
                    f1.b.w(sVar, hVar, pVarC3);
                    i2.c.m((String) u8.p.s0(list), null, sVar, 0, 2);
                    sVar.p(true);
                    return zVar;
                }
                zVar = zVar2;
                ob.a.w(i13, sVar, i13, hVar7);
                hVar = q2.i.f10706c;
                f1.b.w(sVar, hVar, pVarC2);
                i2.c.m(String.valueOf(h1Var.f()), null, sVar, 0, 2);
                sVar.p(true);
                sVar.W(-226800816);
                if (((Number) obj4).intValue() == 0) {
                    fVarB = g5.a.f5917a;
                    if (fVarB != null) {
                        hVar3 = hVar7;
                    } else {
                        e2.e eVar3 = new e2.e("Rounded.AddCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i16 = e2.i0.f4202a;
                        y1.n0 n0Var3 = new y1.n0(y1.q.f14948b);
                        e2.g gVar4 = new e2.g();
                        ArrayList arrayList3 = gVar4.f4168a;
                        hVar3 = hVar7;
                        gVar4.i(12.0f, 2.0f);
                        arrayList3.add(new e2.l(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f));
                        gVar4.j(4.48f, 10.0f, 10.0f, 10.0f);
                        gVar4.j(10.0f, -4.48f, 10.0f, -10.0f);
                        arrayList3.add(new e2.q(17.52f, 2.0f, 12.0f, 2.0f));
                        gVar4.c();
                        gVar4.i(16.0f, 13.0f);
                        gVar4.f(-3.0f);
                        gVar4.l(3.0f);
                        gVar4.d(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        gVar4.j(-1.0f, -0.45f, -1.0f, -1.0f);
                        gVar4.l(-3.0f);
                        gVar4.g(8.0f, 13.0f);
                        gVar4.d(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        gVar4.j(0.45f, -1.0f, 1.0f, -1.0f);
                        gVar4.f(3.0f);
                        gVar4.g(11.0f, 8.0f);
                        gVar4.d(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        gVar4.j(1.0f, 0.45f, 1.0f, 1.0f);
                        gVar4.l(3.0f);
                        gVar4.f(3.0f);
                        gVar4.d(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        gVar4.j(-0.45f, 1.0f, -1.0f, 1.0f);
                        gVar4.c();
                        e2.e.a(eVar3, arrayList3, n0Var3);
                        fVarB = eVar3.b();
                        g5.a.f5917a = fVarB;
                    }
                    e2.f fVar2 = fVarB;
                    long j14 = ((c1.w) sVar.j(c1.y.f2319a)).A;
                    r1.p pVarH3 = androidx.compose.foundation.layout.c.h(mVar2, g5.a.n(30, sVar));
                    sVar.W(1849434622);
                    objK = sVar.K();
                    objM = objK;
                    if (objK == w0Var) {
                        objM = ob.a.m(sVar);
                    }
                    b0.k kVar4 = (b0.k) objM;
                    sVar.p(false);
                    sVar.W(-1746271574);
                    zF = sVar.f(jVar);
                    Object objK6 = sVar.K();
                    obj3 = objK6;
                    if (zF) {
                        final int i17 = 1;
                        h9.a aVar4 = new h9.a() { // from class: l8.c0
                            @Override // h9.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        h1 h1Var4 = h1Var;
                                        if (h1Var4.f() > ((n9.a) jVar.f12830a).f8963a) {
                                            h1Var4.g(h1Var4.f() - 1);
                                            h1Var3.g(h1Var4.f());
                                        }
                                        break;
                                    default:
                                        h1 h1Var5 = h1Var;
                                        if (h1Var5.f() < ((n9.a) jVar.f12830a).f8964b) {
                                            h1Var5.g(h1Var5.f() + 1);
                                            h1Var3.g(h1Var5.f());
                                        }
                                        break;
                                }
                                return t8.z.f12851a;
                            }
                        };
                        sVar.h0(aVar4);
                        obj3 = aVar4;
                    } else {
                        final int i18 = 1;
                        h9.a aVar5 = new h9.a() { // from class: l8.c0
                            @Override // h9.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        h1 h1Var4 = h1Var;
                                        if (h1Var4.f() > ((n9.a) jVar.f12830a).f8963a) {
                                            h1Var4.g(h1Var4.f() - 1);
                                            h1Var3.g(h1Var4.f());
                                        }
                                        break;
                                    default:
                                        h1 h1Var5 = h1Var;
                                        if (h1Var5.f() < ((n9.a) jVar.f12830a).f8964b) {
                                            h1Var5.g(h1Var5.f() + 1);
                                            h1Var3.g(h1Var5.f());
                                        }
                                        break;
                                }
                                return t8.z.f12851a;
                            }
                        };
                        sVar.h0(aVar5);
                        obj3 = aVar5;
                    }
                    h9.a aVar6 = (h9.a) obj3;
                    r8 = 0;
                    sVar.p(false);
                    hVar2 = hVar3;
                    f10 = 0.0f;
                    c1.k0.b(fVar2, null, androidx.compose.foundation.a.c(pVarH3, kVar4, null, false, aVar6, 28), j14, sVar, 48, 0);
                } else {
                    hVar5 = hVar5;
                    hVar = hVar;
                    hVar6 = hVar6;
                    hVar2 = hVar7;
                    f10 = 0.0f;
                    r8 = 0;
                }
                sVar.p(r8);
                r1.p pVarJ3 = androidx.compose.foundation.layout.a.j(mVar2, g5.a.n(4, sVar), f10, 2);
                d0.n0 n0VarA4 = d0.l0.a(d0.h.f3566a, gVar2, sVar, r8);
                long j15 = sVar.T;
                i7 = (int) (j15 ^ (j15 >>> 32));
                q1 q1VarL4 = sVar.l();
                r1.p pVarC4 = r1.a.c(sVar, pVarJ3);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var2);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, n0VarA4);
                f1.b.w(sVar, hVar6, q1VarL4);
                if (sVar.S) {
                    ob.a.w(i7, sVar, i7, hVar2);
                } else {
                    ob.a.w(i7, sVar, i7, hVar2);
                }
                f1.b.w(sVar, hVar, pVarC4);
                i2.c.m((String) u8.p.s0(list), null, sVar, 0, 2);
                sVar.p(true);
                return zVar;
        }
    }
}
