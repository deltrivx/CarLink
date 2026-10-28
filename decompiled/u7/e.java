package u7;

import androidx.compose.foundation.layout.FillElement;
import c1.u2;
import d0.m;
import d0.q;
import f1.b1;
import f1.n;
import f1.q1;
import f1.s;
import f1.w0;
import f1.w1;
import f3.k;
import i9.l;
import java.util.Iterator;
import l8.y;
import n3.r;
import o2.m0;
import o7.u;
import o7.v;
import q2.a0;
import q2.i;
import q2.j;
import r1.p;
import t8.z;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements t7.g {
    @Override // t7.g
    public final void a() {
    }

    @Override // t7.g
    public final String b() {
        return "悬浮时间";
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0202  */
    /* JADX WARN: Code duplicated, block: B:61:0x0206  */
    /* JADX WARN: Code duplicated, block: B:66:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x026f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0274  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a3 A[LOOP:0: B:72:0x029d->B:74:0x02a3, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // t7.g
    public final void c(final int i7, s sVar) {
        char c10;
        int i10;
        r1.h hVar;
        int i11;
        int i12;
        long jD;
        long jK;
        long jK2;
        k kVar;
        Iterator it;
        final int i13;
        s sVar2 = sVar;
        sVar2.Y(1845450903);
        if ((i7 & 1) != 0 || !sVar2.z()) {
            b1 b1VarK = f1.b.k(h.f13085o, sVar2);
            boolean z10 = ((u) f1.b.k(u.f9520p, sVar2).getValue()).f9521a == v.f9536c;
            if (((h) b1VarK.getValue()).f13086a || z10) {
                ((h) b1VarK.getValue()).getClass();
                if (z10 && ((h) b1VarK.getValue()).f13086a) {
                    sVar2.W(1849434622);
                    Object objK = sVar2.K();
                    w0 w0Var = n.f5051a;
                    if (objK == w0Var) {
                        String str = ((h) b1VarK.getValue()).f13092g;
                        g.f13079c.getClass();
                        objK = f1.b.s(f.a(str));
                        sVar2.h0(objK);
                    }
                    b1 b1Var = (b1) objK;
                    sVar2.p(false);
                    sVar2.W(-1633490746);
                    boolean zF = sVar2.f(b1VarK);
                    Object objK2 = sVar2.K();
                    if (zF || objK2 == w0Var) {
                        objK2 = new b0.g(b1VarK, b1Var, (y8.c) null);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    f1.b.f(sVar2, (h9.n) objK2, z.f12851a);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f822c;
                    r1.h hVar2 = r1.c.f11092a;
                    m0 m0VarD = m.d(hVar2, false);
                    long j5 = sVar2.T;
                    int i14 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar2.l();
                    p pVarC = r1.a.c(sVar2, fillElement);
                    j.f10719d0.getClass();
                    a0 a0Var = i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    q2.h hVar3 = i.f10708e;
                    f1.b.w(sVar2, hVar3, m0VarD);
                    q2.h hVar4 = i.f10707d;
                    f1.b.w(sVar2, hVar4, q1VarL);
                    q2.h hVar5 = i.f10709f;
                    if (sVar2.S) {
                        c10 = ' ';
                    } else {
                        c10 = ' ';
                        if (!l.a(sVar2.K(), Integer.valueOf(i14))) {
                        }
                        q2.h hVar6 = i.f10706c;
                        f1.b.w(sVar2, hVar6, pVarC);
                        i10 = ((h) b1VarK.getValue()).f13087b;
                        if (i10 != 1) {
                            hVar = hVar2;
                        } else if (i10 != 2) {
                            hVar = r1.c.f11098g;
                        } else if (i10 != 3) {
                            hVar = r1.c.f11094c;
                        } else {
                            hVar = r1.c.f11100i;
                        }
                        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f819a;
                        r1.m mVar = r1.m.f11116a;
                        p pVarA = bVar.a(mVar, hVar);
                        hc.c cVar = n8.c.f8897a;
                        p pVarO = n4.h.o(androidx.compose.foundation.layout.a.i(pVarA, n8.c.h(((h) b1VarK.getValue()).f13091f), n8.c.h(((h) b1VarK.getValue()).f13090e)), k0.e.a(n8.c.h(((h) b1VarK.getValue()).f13089d)));
                        String strH0 = zb.j.H0(((h) b1VarK.getValue()).f13088c, "#");
                        n3.l.q(16);
                        p pVarB = androidx.compose.foundation.a.b(pVarO, h0.d(Long.parseLong(strH0, 16)), h0.f14898a);
                        m0 m0VarD2 = m.d(hVar2, false);
                        long j10 = sVar2.T;
                        i11 = (int) (j10 ^ (j10 >>> c10));
                        q1 q1VarL2 = sVar2.l();
                        p pVarC2 = r1.a.c(sVar2, pVarB);
                        sVar2.a0();
                        if (sVar2.S) {
                            sVar2.k(a0Var);
                        } else {
                            sVar2.k0();
                        }
                        f1.b.w(sVar2, hVar3, m0VarD2);
                        f1.b.w(sVar2, hVar4, q1VarL2);
                        if (sVar2.S || !l.a(sVar2.K(), Integer.valueOf(i11))) {
                            ob.a.w(i11, sVar2, i11, hVar5);
                        }
                        f1.b.w(sVar2, hVar6, pVarC2);
                        p pVarI = androidx.compose.foundation.layout.a.i(mVar, n8.c.h(((h) b1VarK.getValue()).f13097m), n8.c.h(((h) b1VarK.getValue()).f13096l));
                        d0.s sVarA = q.a(d0.h.f3568c, r1.c.f11103m, sVar2, 0);
                        long j11 = sVar2.T;
                        i12 = (int) (j11 ^ (j11 >>> c10));
                        q1 q1VarL3 = sVar2.l();
                        p pVarC3 = r1.a.c(sVar2, pVarI);
                        sVar2.a0();
                        if (sVar2.S) {
                            sVar2.k(a0Var);
                        } else {
                            sVar2.k0();
                        }
                        f1.b.w(sVar2, hVar3, sVarA);
                        f1.b.w(sVar2, hVar4, q1VarL3);
                        if (sVar2.S || !l.a(sVar2.K(), Integer.valueOf(i12))) {
                            ob.a.w(i12, sVar2, i12, hVar5);
                        }
                        f1.b.w(sVar2, hVar6, pVarC3);
                        String strH1 = zb.j.H0(((h) b1VarK.getValue()).f13093h, "#");
                        n3.l.q(16);
                        jD = h0.d(Long.parseLong(strH1, 16));
                        jK = r.K(n8.c.h(((h) b1VarK.getValue()).f13094i), 4294967296L);
                        jK2 = r.K(n8.c.h(((h) b1VarK.getValue()).k), 4294967296L);
                        if (((h) b1VarK.getValue()).f13095j) {
                            kVar = k.f5260e;
                        } else {
                            kVar = null;
                        }
                        sVar2.W(-214478759);
                        it = u8.l.v0(new String[]{((t8.j) b1Var.getValue()).f12830a, ((t8.j) b1Var.getValue()).f12831b}).iterator();
                        while (it.hasNext()) {
                            long j12 = jK;
                            k kVar2 = kVar;
                            u2.b((String) it.next(), null, jD, j12, kVar2, 0L, null, jK2, 0, false, 0, 0, null, sVar, 0, 0, 130002);
                            jK = j12;
                            kVar = kVar2;
                            sVar2 = sVar;
                        }
                        sVar2.p(false);
                        i13 = 1;
                        sVar2.p(true);
                        sVar2.p(true);
                        sVar2.p(true);
                    }
                    ob.a.w(i14, sVar2, i14, hVar5);
                    q2.h hVar7 = i.f10706c;
                    f1.b.w(sVar2, hVar7, pVarC);
                    i10 = ((h) b1VarK.getValue()).f13087b;
                    if (i10 != 1) {
                        hVar = hVar2;
                    } else if (i10 != 2) {
                        hVar = r1.c.f11098g;
                    } else if (i10 != 3) {
                        hVar = r1.c.f11094c;
                    } else {
                        hVar = r1.c.f11100i;
                    }
                    androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f819a;
                    r1.m mVar2 = r1.m.f11116a;
                    p pVarA2 = bVar2.a(mVar2, hVar);
                    hc.c cVar2 = n8.c.f8897a;
                    p pVarO2 = n4.h.o(androidx.compose.foundation.layout.a.i(pVarA2, n8.c.h(((h) b1VarK.getValue()).f13091f), n8.c.h(((h) b1VarK.getValue()).f13090e)), k0.e.a(n8.c.h(((h) b1VarK.getValue()).f13089d)));
                    String strH2 = zb.j.H0(((h) b1VarK.getValue()).f13088c, "#");
                    n3.l.q(16);
                    p pVarB2 = androidx.compose.foundation.a.b(pVarO2, h0.d(Long.parseLong(strH2, 16)), h0.f14898a);
                    m0 m0VarD3 = m.d(hVar2, false);
                    long j13 = sVar2.T;
                    i11 = (int) (j13 ^ (j13 >>> c10));
                    q1 q1VarL4 = sVar2.l();
                    p pVarC4 = r1.a.c(sVar2, pVarB2);
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, hVar3, m0VarD3);
                    f1.b.w(sVar2, hVar4, q1VarL4);
                    if (sVar2.S) {
                        ob.a.w(i11, sVar2, i11, hVar5);
                    } else {
                        ob.a.w(i11, sVar2, i11, hVar5);
                    }
                    f1.b.w(sVar2, hVar7, pVarC4);
                    p pVarI2 = androidx.compose.foundation.layout.a.i(mVar2, n8.c.h(((h) b1VarK.getValue()).f13097m), n8.c.h(((h) b1VarK.getValue()).f13096l));
                    d0.s sVarA2 = q.a(d0.h.f3568c, r1.c.f11103m, sVar2, 0);
                    long j14 = sVar2.T;
                    i12 = (int) (j14 ^ (j14 >>> c10));
                    q1 q1VarL5 = sVar2.l();
                    p pVarC5 = r1.a.c(sVar2, pVarI2);
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, hVar3, sVarA2);
                    f1.b.w(sVar2, hVar4, q1VarL5);
                    if (sVar2.S) {
                        ob.a.w(i12, sVar2, i12, hVar5);
                    } else {
                        ob.a.w(i12, sVar2, i12, hVar5);
                    }
                    f1.b.w(sVar2, hVar7, pVarC5);
                    String strH3 = zb.j.H0(((h) b1VarK.getValue()).f13093h, "#");
                    n3.l.q(16);
                    jD = h0.d(Long.parseLong(strH3, 16));
                    jK = r.K(n8.c.h(((h) b1VarK.getValue()).f13094i), 4294967296L);
                    jK2 = r.K(n8.c.h(((h) b1VarK.getValue()).k), 4294967296L);
                    if (((h) b1VarK.getValue()).f13095j) {
                        kVar = k.f5260e;
                    } else {
                        kVar = null;
                    }
                    sVar2.W(-214478759);
                    it = u8.l.v0(new String[]{((t8.j) b1Var.getValue()).f12830a, ((t8.j) b1Var.getValue()).f12831b}).iterator();
                    while (it.hasNext()) {
                        long j15 = jK;
                        k kVar3 = kVar;
                        u2.b((String) it.next(), null, jD, j15, kVar3, 0L, null, jK2, 0, false, 0, 0, null, sVar, 0, 0, 130002);
                        jK = j15;
                        kVar = kVar3;
                        sVar2 = sVar;
                    }
                    sVar2.p(false);
                    i13 = 1;
                    sVar2.p(true);
                    sVar2.p(true);
                    sVar2.p(true);
                }
            }
            final int i15 = 0;
            w1 w1VarR = sVar2.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n(this, i7, i15) { // from class: u7.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f13076a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f13077b;

                    {
                        this.f13076a = i15;
                        this.f13077b = this;
                    }

                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = this.f13076a;
                        s sVar3 = (s) obj;
                        ((Integer) obj2).getClass();
                        switch (i16) {
                            case 0:
                                this.f13077b.c(f1.b.y(1), sVar3);
                                break;
                            default:
                                this.f13077b.c(f1.b.y(1), sVar3);
                                break;
                        }
                        return z.f12851a;
                    }
                };
                return;
            }
            return;
        }
        sVar2.Q();
        i13 = 1;
        w1 w1VarR2 = sVar2.r();
        if (w1VarR2 != null) {
            w1VarR2.f5192d = new h9.n(this, i7, i13) { // from class: u7.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f13076a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f13077b;

                {
                    this.f13076a = i13;
                    this.f13077b = this;
                }

                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = this.f13076a;
                    s sVar3 = (s) obj;
                    ((Integer) obj2).getClass();
                    switch (i16) {
                        case 0:
                            this.f13077b.c(f1.b.y(1), sVar3);
                            break;
                        default:
                            this.f13077b.c(f1.b.y(1), sVar3);
                            break;
                    }
                    return z.f12851a;
                }
            };
        }
    }

    @Override // t7.g
    public final void d(boolean z10, h9.a aVar, s sVar, int i7) {
        l.e(aVar, "onDismissRequest");
        sVar.Y(-582704369);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2);
        if ((i10 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            b1 b1VarK = f1.b.k(h.f13085o, sVar);
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == n.f5051a) {
                objK = new y(aVar, 8);
                sVar.h0(objK);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK, 0L, false, 0, null, null, null, null, n1.h.e(746841478, new g8.h(b1VarK, 14), sVar), sVar, i10 & 14, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q7.c(this, z10, aVar, i7, 3);
        }
    }

    @Override // t7.g
    public final String e() {
        return "连接后显示时间";
    }

    @Override // t7.g
    public final String getName() {
        return "Time";
    }
}
