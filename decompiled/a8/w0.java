package a8;

import c1.u2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f271e;

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f267a = i7;
        this.f268b = obj;
        this.f269c = obj2;
        this.f270d = obj3;
        this.f271e = obj4;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q2.a0 a0Var;
        boolean z10;
        Object objC;
        int i7 = this.f267a;
        f1.w0 w0Var = f1.n.f5051a;
        Object obj4 = this.f270d;
        Object obj5 = this.f268b;
        Object obj6 = this.f269c;
        Object obj7 = this.f271e;
        switch (i7) {
            case 0:
                l8.j0 j0Var = (l8.j0) obj;
                f1.s sVar = (f1.s) obj2;
                ((Number) obj3).intValue();
                i9.l.e(j0Var, "item");
                d0.d dVar = d0.h.f3570e;
                r1.g gVar = r1.c.k;
                r1.p pVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.f820a, g5.a.n(12, sVar), g5.a.n(8, sVar));
                n8.q qVar = (n8.q) obj5;
                f1.b1 b1Var = (f1.b1) obj6;
                f1.b1 b1Var2 = (f1.b1) obj4;
                f1.b1 b1Var3 = (f1.b1) obj7;
                d0.n0 n0VarA = d0.l0.a(dVar, gVar, sVar, 54);
                long j5 = sVar.T;
                int i10 = (int) (j5 ^ (j5 >>> 32));
                f1.q1 q1VarL = sVar.l();
                r1.p pVarC = r1.a.c(sVar, pVarI);
                q2.j.f10719d0.getClass();
                q2.a0 a0Var2 = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var2);
                } else {
                    sVar.k0();
                }
                q2.h hVar = q2.i.f10708e;
                f1.b.w(sVar, hVar, n0VarA);
                q2.h hVar2 = q2.i.f10707d;
                f1.b.w(sVar, hVar2, q1VarL);
                q2.h hVar3 = q2.i.f10709f;
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
                    ob.a.w(i10, sVar, i10, hVar3);
                }
                q2.h hVar4 = q2.i.f10706c;
                f1.b.w(sVar, hVar4, pVarC);
                d0.b bVar = d0.h.f3566a;
                d0.n0 n0VarA2 = d0.l0.a(bVar, gVar, sVar, 48);
                long j10 = sVar.T;
                int i11 = (int) (j10 ^ (j10 >>> 32));
                f1.q1 q1VarL2 = sVar.l();
                r1.m mVar = r1.m.f11116a;
                r1.p pVarC2 = r1.a.c(sVar, mVar);
                sVar.a0();
                if (sVar.S) {
                    a0Var = a0Var2;
                    sVar.k(a0Var);
                } else {
                    a0Var = a0Var2;
                    sVar.k0();
                }
                f1.b.w(sVar, hVar, n0VarA2);
                f1.b.w(sVar, hVar2, q1VarL2);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                    ob.a.w(i11, sVar, i11, hVar3);
                }
                f1.b.w(sVar, hVar4, pVarC2);
                d0.c.a(sVar, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(4, sVar)));
                e2.f fVarB = n3.n.f8748b;
                if (fVarB == null) {
                    e2.e eVar = new e2.e("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = e2.i0.f4202a;
                    y1.n0 n0Var = new y1.n0(y1.q.f14948b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new e2.o(8.0f, 5.0f));
                    arrayList.add(new e2.a0(14.0f));
                    arrayList.add(new e2.v(11.0f, -7.0f));
                    arrayList.add(e2.k.f4210c);
                    e2.e.a(eVar, arrayList, n0Var);
                    fVarB = eVar.b();
                    n3.n.f8748b = fVarB;
                }
                c1.k0.b(fVarB, "Icons", androidx.compose.foundation.layout.c.h(mVar, g5.a.n(24, sVar)), 0L, sVar, 48, 8);
                d0.c.a(sVar, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(12, sVar)));
                u2.b(j0Var.f8196a, null, 0L, n3.r.K(g5.a.n(18, sVar), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131062);
                sVar.p(true);
                d0.n0 n0VarA3 = d0.l0.a(bVar, gVar, sVar, 48);
                long j11 = sVar.T;
                int i13 = (int) (j11 ^ (j11 >>> 32));
                f1.q1 q1VarL3 = sVar.l();
                r1.p pVarC3 = r1.a.c(sVar, mVar);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar, n0VarA3);
                f1.b.w(sVar, hVar2, q1VarL3);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i13))) {
                    ob.a.w(i13, sVar, i13, hVar3);
                }
                f1.b.w(sVar, hVar4, pVarC3);
                u2.b("选择", null, 0L, n3.r.K(g5.a.n(18, sVar), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 6, 0, 131062);
                d0.c.a(sVar, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(24, sVar)));
                long jK = n3.r.K(g5.a.n(18, sVar), 4294967296L);
                r1.p pVarK = androidx.compose.foundation.layout.a.k(mVar, 0.0f, 0.0f, g5.a.n(16, sVar), 0.0f, 11);
                sVar.W(1849434622);
                Object objK = sVar.K();
                if (objK == w0Var) {
                    objK = ob.a.m(sVar);
                }
                b0.k kVar = (b0.k) objK;
                sVar.p(false);
                sVar.W(-1224400529);
                boolean zH = sVar.h(qVar) | sVar.h(j0Var);
                Object objK2 = sVar.K();
                if (zH || objK2 == w0Var) {
                    objK2 = new v0(qVar, j0Var, b1Var, b1Var2, b1Var3, 0);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                u2.b("删除", androidx.compose.foundation.a.c(pVarK, kVar, null, false, (h9.a) objK2, 28), 0L, jK, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 6, 0, 131060);
                sVar.p(true);
                sVar.p(true);
                return t8.z.f12851a;
            default:
                r1.p pVar = (r1.p) obj;
                f1.s sVar2 = (f1.s) obj2;
                ((Number) obj3).intValue();
                l0.u0 u0Var = (l0.u0) obj6;
                y1.n0 n0Var2 = (y1.n0) obj5;
                g3.w wVar = (g3.w) obj4;
                long j12 = wVar.f5890b;
                sVar2.W(-84507373);
                boolean zBooleanValue = ((Boolean) sVar2.j(r2.j1.f11290w)).booleanValue();
                boolean zG = sVar2.g(zBooleanValue);
                Object objK3 = sVar2.K();
                if (zG || objK3 == w0Var) {
                    objK3 = new u0.g(zBooleanValue);
                    sVar2.h0(objK3);
                }
                u0.g gVar2 = (u0.g) objK3;
                boolean z11 = n0Var2.f14942a != 16;
                if (((Boolean) ((r2.w1) ((r2.u2) sVar2.j(r2.j1.f11287t))).f11504a.getValue()).booleanValue() && u0Var.b() && b3.q0.c(j12) && z11) {
                    sVar2.W(-707487962);
                    b3.h hVar5 = wVar.f5889a;
                    b3.q0 q0Var = new b3.q0(j12);
                    boolean zH2 = sVar2.h(gVar2);
                    Object objK4 = sVar2.K();
                    if (zH2 || objK4 == w0Var) {
                        objK4 = new c1(gVar2, null, 19);
                        sVar2.h0(objK4);
                    }
                    f1.b.g(hVar5, q0Var, (h9.n) objK4, sVar2);
                    boolean zH3 = sVar2.h(gVar2) | sVar2.h((g3.q) obj7) | sVar2.f(wVar) | sVar2.h(u0Var) | sVar2.f(n0Var2);
                    g3.q qVar2 = (g3.q) obj7;
                    Object objK5 = sVar2.K();
                    if (zH3 || objK5 == w0Var) {
                        l0.c1 c1Var = new l0.c1(gVar2, qVar2, wVar, u0Var, n0Var2, 0);
                        sVar2.h0(c1Var);
                        objK5 = c1Var;
                    }
                    objC = androidx.compose.ui.draw.a.c(pVar, (h9.k) objK5);
                    z10 = false;
                    sVar2.p(false);
                } else {
                    z10 = false;
                    sVar2.W(-705473241);
                    sVar2.p(false);
                    objC = r1.m.f11116a;
                }
                sVar2.p(z10);
                return objC;
        }
    }
}
