package l8;

import c1.u2;
import f1.q1;
import f1.w0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h9.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f8136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f8137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.o f8138e;

    public e(List list, float f10, j0 j0Var, h9.k kVar, h9.o oVar) {
        this.f8134a = list;
        this.f8135b = f10;
        this.f8136c = j0Var;
        this.f8137d = kVar;
        this.f8138e = oVar;
    }

    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        long j5;
        boolean z10;
        boolean z11;
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
        boolean zN = sVar.N(i7 & 1, (i7 & 147) != 146);
        t8.z zVar = t8.z.f12851a;
        if (!zN) {
            sVar.Q();
            return zVar;
        }
        j0 j0Var = (j0) this.f8134a.get(iIntValue);
        sVar.W(517035253);
        r1.g gVar = r1.c.k;
        d0.d dVar = d0.h.f3569d;
        r1.p pVarB = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.f820a, this.f8135b);
        t8.z zVar2 = null;
        j0 j0Var2 = this.f8136c;
        if (i9.l.a(j0Var2 != null ? j0Var2.f8197b : null, j0Var.f8197b)) {
            sVar.W(1679258777);
            j5 = ((c1.w) sVar.j(c1.y.f2319a)).f2229e;
            sVar.p(false);
        } else {
            sVar.W(1679262178);
            j5 = ((c1.w) sVar.j(c1.y.f2319a)).H;
            sVar.p(false);
        }
        r1.p pVarB2 = androidx.compose.foundation.a.b(pVarB, j5, k0.e.a(g5.a.n(12, sVar)));
        sVar.W(1849434622);
        Object objK = sVar.K();
        w0 w0Var = f1.n.f5051a;
        if (objK == w0Var) {
            objK = ob.a.m(sVar);
        }
        b0.k kVar = (b0.k) objK;
        sVar.p(false);
        sVar.W(-1633490746);
        boolean zH = sVar.h(j0Var);
        h9.k kVar2 = this.f8137d;
        boolean zF = zH | sVar.f(kVar2);
        Object objK2 = sVar.K();
        if (zF || objK2 == w0Var) {
            objK2 = new aa.j(10, j0Var, kVar2);
            sVar.h0(objK2);
        }
        sVar.p(false);
        r1.p pVarC = androidx.compose.foundation.a.c(pVarB2, kVar, null, false, (h9.a) objK2, 28);
        d0.n0 n0VarA = d0.l0.a(dVar, gVar, sVar, 54);
        long j10 = sVar.T;
        int i10 = (int) ((j10 >>> 32) ^ j10);
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
        f1.b.w(sVar, q2.i.f10708e, n0VarA);
        f1.b.w(sVar, q2.i.f10707d, q1VarL);
        q2.h hVar = q2.i.f10709f;
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
            ob.a.w(i10, sVar, i10, hVar);
        }
        f1.b.w(sVar, q2.i.f10706c, pVarC2);
        sVar.W(-1225530403);
        h9.o oVar = this.f8138e;
        if (oVar != null) {
            oVar.invoke(j0Var, sVar, 0);
            zVar2 = zVar;
        }
        sVar.p(false);
        sVar.W(-1225530555);
        if (zVar2 == null) {
            z11 = true;
            z10 = false;
            u2.b(j0Var.f8196a, null, 0L, n3.r.K(g5.a.n(18, sVar), 4294967296L), null, 0L, new m3.k(3), 0L, 0, false, 0, 0, null, sVar, 0, 0, 130550);
            sVar = sVar;
        } else {
            z10 = false;
            z11 = true;
        }
        sVar.p(z10);
        sVar.p(z11);
        sVar.p(z10);
        return zVar;
    }
}
