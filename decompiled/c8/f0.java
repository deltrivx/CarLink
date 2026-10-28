package c8;

import a8.a1;
import a8.k1;
import b8.j2;
import b8.m2;
import b8.n2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.l0;
import d0.n0;
import f1.b1;
import f1.q1;
import f1.w0;
import f1.w1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f2498a = new f0();

    public final void a(final String str, final List list, final List list2, final h9.k kVar, f1.s sVar, final int i7) {
        i9.l.e(list, "selectedItems");
        i9.l.e(kVar, "onValueChange");
        sVar.Y(1806146216);
        int i10 = i7 | (sVar.h(list) ? 32 : 16) | (sVar.h(list2) ? 256 : 128);
        if ((i10 & 9363) == 9362 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVarE = n1.h.e(1464527697, new u(0, str), sVar);
            n1.c cVar = c.f2474e;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new a8.k(b1Var, 19);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK2, sVar, 3126, 4);
            sVar.W(539741570);
            Throwable th = null;
            boolean z10 = true;
            if (list.isEmpty()) {
                d0.d dVar = d0.h.f3569d;
                r1.p pVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f820a, 0.0f, 16, 1);
                n0 n0VarA = l0.a(dVar, r1.c.f11101j, sVar, 6);
                long j5 = sVar.T;
                int i11 = (int) (j5 ^ (j5 >>> 32));
                q1 q1VarL = sVar.l();
                r1.p pVarC = r1.a.c(sVar, pVarJ);
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
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                    ob.a.w(i11, sVar, i11, hVar);
                }
                f1.b.w(sVar, q2.i.f10706c, pVarC);
                i2.c.m("未添加", null, sVar, 6, 2);
                sVar.p(true);
            }
            sVar.p(false);
            sVar.W(539753770);
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    Throwable th2 = th;
                    n3.l.Y();
                    throw th2;
                }
                m2 m2Var = (m2) obj;
                sVar.U(-1154188944, Integer.valueOf(m2Var.hashCode()));
                n1.c cVarE2 = n1.h.e(677780520, new v(0, m2Var), sVar);
                n1.c cVarE3 = n1.h.e(283376681, new x(i12, kVar, list), sVar);
                if (i12 == n3.l.A(list)) {
                    z10 = false;
                }
                Throwable th3 = th;
                a.a.h(cVarE2, cVarE3, z10, null, sVar, 54, 8);
                sVar.p(false);
                i12 = i13;
                th = th3;
                z10 = true;
            }
            sVar.p(false);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new a8.k(b1Var, 20);
                sVar.h0(objK3);
            }
            h9.a aVar = (h9.a) objK3;
            sVar.p(false);
            sVar.W(-1746271574);
            boolean zH = sVar.h(list);
            Object objK4 = sVar.K();
            if (zH || objK4 == w0Var) {
                objK4 = new s(kVar, list, b1Var);
                sVar.h0(objK4);
            }
            sVar.p(false);
            b(list2, zBooleanValue, aVar, (h9.k) objK4, sVar, ((i10 >> 6) & 14) | 24960);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n(str, list, list2, kVar, i7) { // from class: c8.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f2550b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f2551c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ List f2552d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ h9.k f2553e;

                @Override // h9.n
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = f1.b.y(27655);
                    this.f2549a.a(this.f2550b, this.f2551c, this.f2552d, this.f2553e, (f1.s) obj2, iY);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public final void b(List list, boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(-1012233280);
        if ((i7 & 6) == 0) {
            i10 = i7 | (sVar.h(list) ? 4 : 2);
        } else {
            i10 = i7;
        }
        int i11 = i10 | (sVar.g(z10) ? 32 : 16) | (sVar.h(kVar) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = f1.b.s(null);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            float fN = g5.a.n(64, sVar);
            float fN2 = g5.a.n(16, sVar);
            int i12 = list.size() > 6 ? 2 : 1;
            l8.n.a(z10, aVar, 0L, false, 0, null, null, null, null, n1.h.e(69323127, new a0((fN + fN2) * Math.min(((list.size() + i12) - 1) / i12, 6), fN2, i12, list, kVar, b1Var), sVar), sVar, (i11 >> 3) & 126, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new o(this, list, z10, aVar, kVar, i7);
        }
    }

    public final void c(List list, f1.s sVar, int i7) {
        List listJ;
        sVar.Y(546645292);
        if (((i7 | 6) & 19) == 18 && sVar.z()) {
            sVar.Q();
            listJ = list;
        } else {
            listJ = n3.l.J("添加任务", "利用按键或日志触发执行指定操作");
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            Object obj2 = objK;
            if (objK == obj) {
                p1.p pVar = new p1.p();
                n2.Companion.getClass();
                pVar.addAll(j2.a());
                sVar.h0(pVar);
                obj2 = pVar;
            }
            p1.p pVar2 = (p1.p) obj2;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == obj) {
                objC = f1.b.s(null);
                sVar.h0(objC);
            }
            b1 b1Var = (b1) objC;
            sVar.p(false);
            pVar2.getClass();
            j1.c cVar = p1.q.e(pVar2).f10103c;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == obj) {
                objK2 = new b0(pVar2, null, 0);
                sVar.h0(objK2);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK2, cVar);
            d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar, 0);
            long j5 = sVar.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, r1.m.f11116a);
            q2.j.f10719d0.getClass();
            h9.a aVar = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, sVarA);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            g5.a.b(null, n1.h.e(-314060499, new a1(listJ, pVar2, b1Var, 6), sVar), sVar, 48, 1);
            g5.a.b("任务列表", n1.h.e(-896332010, new d0(pVar2, b1Var, 0), sVar), sVar, 54, 0);
            sVar.p(true);
            if (((n2) b1Var.getValue()) != null) {
                n2 n2Var = (n2) b1Var.getValue();
                i9.l.b(n2Var);
                sVar.W(5004770);
                Object objK3 = sVar.K();
                if (objK3 == obj) {
                    objK3 = new a8.k(b1Var, 18);
                    sVar.h0(objK3);
                }
                h9.a aVar2 = (h9.a) objK3;
                Object objC2 = a2.f.C(sVar, false, -1633490746);
                if (objC2 == obj) {
                    objC2 = new p(0, pVar2, b1Var);
                    sVar.h0(objC2);
                }
                sVar.p(false);
                d(n2Var, aVar2, (h9.k) objC2, sVar, 3504);
            }
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 3, this, listJ);
        }
    }

    public final void d(n2 n2Var, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        int i10;
        h9.k kVar2;
        sVar.Y(-1915574207);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(n2Var) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            kVar2 = kVar;
            i10 |= sVar.h(kVar2) ? 256 : 128;
        } else {
            kVar2 = kVar;
        }
        int i11 = i10;
        if ((i11 & 147) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(n2Var.f1624b);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(n2Var.f1625c);
                sVar.h0(objC);
            }
            b1 b1Var2 = (b1) objC;
            Object objC2 = a2.f.C(sVar, false, 1849434622);
            if (objC2 == w0Var) {
                objC2 = f1.b.s(n2Var.f1626d);
                sVar.h0(objC2);
            }
            b1 b1Var3 = (b1) objC2;
            sVar.p(false);
            l8.n.a(true, aVar, 0L, false, 0, null, n1.h.e(302746234, new a8.o(aVar, 8), sVar), null, n1.h.e(-1663240520, new a8.s(kVar2, n2Var, b1Var2, b1Var3, b1Var, 5), sVar), n1.h.e(-1279560662, new k1(3, b1Var, b1Var2, b1Var3), sVar), sVar, (i11 & 112) | 817889286, 380);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q(this, n2Var, aVar, kVar, i7, 0);
        }
    }

    public final void e(final n2 n2Var, final boolean z10, final h9.k kVar, final h9.a aVar, final h9.a aVar2, f1.s sVar, final int i7) {
        sVar.Y(1330288837);
        int i10 = i7 | (sVar.h(n2Var) ? 4 : 2) | (sVar.g(z10) ? 32 : 16) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(aVar2) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
        if ((i10 & 9363) == 9362 && sVar.z()) {
            sVar.Q();
        } else {
            a.a.h(n1.h.e(-747034564, new v(1, n2Var), sVar), n1.h.e(1462089917, new a1(n2Var, kVar, aVar), sVar), !z10, aVar2, sVar, ((i10 >> 3) & 7168) | 54, 0);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n(n2Var, z10, kVar, aVar, aVar2, i7) { // from class: c8.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n2 f2540b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f2541c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ h9.k f2542d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ h9.a f2543e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ h9.a f2544f;

                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = f1.b.y(ServiceTypes.MSG_MEDIA_INIT);
                    this.f2539a.e(this.f2540b, this.f2541c, this.f2542d, this.f2543e, this.f2544f, (f1.s) obj, iY);
                    return t8.z.f12851a;
                }
            };
        }
    }
}
