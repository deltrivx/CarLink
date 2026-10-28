package c8;

import b8.h2;
import c1.u2;
import f1.b1;
import f1.q1;
import f1.w0;
import java.util.List;
import o2.m0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z implements h9.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f2569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f2570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.k f2571c;

    public z(List list, b1 b1Var, h9.k kVar) {
        this.f2569a = list;
        this.f2570b = b1Var;
        this.f2571c = kVar;
    }

    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        b1 b1Var;
        g0.j jVar = (g0.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        f1.s sVar = (f1.s) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (sVar.f(jVar) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i7 |= sVar.d(iIntValue) ? 32 : 16;
        }
        if (sVar.N(i7 & 1, (i7 & 147) != 146)) {
            h2 h2Var = (h2) this.f2569a.get(iIntValue);
            sVar.W(701257805);
            r1.h hVar = r1.c.f11096e;
            r1.p pVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.f820a, g5.a.n(64, sVar)), ((c1.w) sVar.j(c1.y.f2319a)).H, k0.e.a(g5.a.n(12, sVar)));
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar = (b0.k) objK;
            sVar.p(false);
            sVar.W(-1633490746);
            boolean zH = sVar.h(h2Var);
            Object objK2 = sVar.K();
            b1 b1Var2 = this.f2570b;
            if (zH || objK2 == w0Var) {
                objK2 = new aa.j(3, h2Var, b1Var2);
                sVar.h0(objK2);
            }
            sVar.p(false);
            r1.p pVarC = androidx.compose.foundation.a.c(pVarB, kVar, null, false, (h9.a) objK2, 28);
            m0 m0VarD = d0.m.d(hVar, false);
            long j5 = sVar.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            r1.p pVarC2 = r1.a.c(sVar, pVarC);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar2 = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar2);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC2);
            u2.b(h2Var.b(), null, 0L, n3.r.K(g5.a.n(18, sVar), 4294967296L), null, 0L, new m3.k(3), 0L, 0, false, 0, 0, null, sVar, 0, 0, 130550);
            boolean zA = i9.l.a((String) b1Var2.getValue(), h2Var.getName());
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                b1Var = b1Var2;
                objK3 = new aa.e(6, b1Var);
                sVar.h0(objK3);
            } else {
                b1Var = b1Var2;
            }
            h9.a aVar = (h9.a) objK3;
            sVar.p(false);
            sVar.W(-1633490746);
            h9.k kVar2 = this.f2571c;
            boolean zF = sVar.f(kVar2);
            Object objK4 = sVar.K();
            if (zF || objK4 == w0Var) {
                objK4 = new y(0, kVar2, b1Var);
                sVar.h0(objK4);
            }
            sVar.p(false);
            h2Var.c(zA, aVar, (h9.k) objK4, sVar, 48);
            sVar.p(true);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}
