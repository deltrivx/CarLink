package d0;

import f1.q1;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.h0 f3586a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s.h0 f3587b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f3588c = l.f3582b;

    public static final void a(r1.p pVar, f1.s sVar, int i7) {
        sVar.Y(-211209833);
        int i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 3) != 2)) {
            long j5 = sVar.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            r1.p pVarC = r1.a.c(sVar, pVar);
            q1 q1VarL = sVar.l();
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, f3588c);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar);
            }
            sVar.p(true);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 2, pVar);
        }
    }

    public static final void b(o2.u0 u0Var, o2.v0 v0Var, o2.l0 l0Var, n3.o oVar, int i7, int i10, r1.h hVar) {
        r1.d dVar;
        Object objW = l0Var.w();
        k kVar = objW instanceof k ? (k) objW : null;
        o2.u0.h(u0Var, v0Var, ((kVar == null || (dVar = kVar.f3579o) == null) ? hVar : dVar).a((((long) v0Var.f9435a) << 32) | (((long) v0Var.f9436b) & 4294967295L), (((long) i7) << 32) | (((long) i10) & 4294967295L), oVar));
    }

    public static final s.h0 c(boolean z10) {
        s.h0 h0Var = new s.h0(9);
        r1.h hVar = r1.c.f11092a;
        h0Var.m(hVar, new p(hVar, z10));
        r1.h hVar2 = r1.c.f11093b;
        h0Var.m(hVar2, new p(hVar2, z10));
        r1.h hVar3 = r1.c.f11094c;
        h0Var.m(hVar3, new p(hVar3, z10));
        r1.h hVar4 = r1.c.f11095d;
        h0Var.m(hVar4, new p(hVar4, z10));
        r1.h hVar5 = r1.c.f11096e;
        h0Var.m(hVar5, new p(hVar5, z10));
        r1.h hVar6 = r1.c.f11097f;
        h0Var.m(hVar6, new p(hVar6, z10));
        r1.h hVar7 = r1.c.f11098g;
        h0Var.m(hVar7, new p(hVar7, z10));
        r1.h hVar8 = r1.c.f11099h;
        h0Var.m(hVar8, new p(hVar8, z10));
        r1.h hVar9 = r1.c.f11100i;
        h0Var.m(hVar9, new p(hVar9, z10));
        return h0Var;
    }

    public static final o2.m0 d(r1.h hVar, boolean z10) {
        o2.m0 m0Var = (o2.m0) (z10 ? f3586a : f3587b).g(hVar);
        return m0Var == null ? new p(hVar, z10) : m0Var;
    }
}
