package a8;

import c1.g2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f133b;

    public /* synthetic */ h1(f1.h1 h1Var, int i7) {
        this.f132a = i7;
        this.f133b = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        int i7 = this.f132a;
        f1.w0 w0Var = f1.n.f5051a;
        t8.z zVar = t8.z.f12851a;
        f1.h1 h1Var = this.f133b;
        int i10 = 2;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("延迟执行", null, sVar, 6, 2);
                    r1.m mVar = r1.m.f11116a;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(mVar, 0.0f, 6, 0.0f, 0.0f, 13);
                    d0.n0 n0VarA = d0.l0.a(d0.h.f3566a, r1.c.f11101j, sVar, 0);
                    long j5 = sVar.T;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL = sVar.l();
                    r1.p pVarC = r1.a.c(sVar, pVarK);
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
                    float f10 = h1Var.f();
                    n9.a aVar = new n9.a(1.0f, 60.0f);
                    r1.p pVarB = androidx.compose.foundation.layout.c.b(mVar, 27);
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        z10 = false;
                        objK = new g1(h1Var, 0);
                        sVar.h0(objK);
                    } else {
                        z10 = false;
                    }
                    sVar.p(z10);
                    g2.b(f10, (h9.k) objK, pVarB, false, aVar, 0, null, null, null, sVar, 197040, 456);
                    sVar.p(true);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m(h1Var.f() + "秒", null, sVar2, 0, 2);
                    i2.c.b(0, sVar2);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    a.a.h(n1.h.e(1771809718, new h1(h1Var, 0), sVar3), n1.h.e(1600970261, new h1(h1Var, 1), sVar3), false, null, sVar3, 438, 8);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, n1.h.e(-1593928435, new h1(h1Var, i10), sVar4), sVar4, 48, 1);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    i2.c.m("选择亮度值", null, sVar5, 6, 2);
                    r1.m mVar2 = r1.m.f11116a;
                    r1.p pVarK2 = androidx.compose.foundation.layout.a.k(mVar2, 0.0f, 6, 0.0f, 0.0f, 13);
                    d0.n0 n0VarA2 = d0.l0.a(d0.h.f3566a, r1.c.f11101j, sVar5, 0);
                    long j10 = sVar5.T;
                    int i12 = (int) (j10 ^ (j10 >>> 32));
                    f1.q1 q1VarL2 = sVar5.l();
                    r1.p pVarC2 = r1.a.c(sVar5, pVarK2);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var2 = q2.i.f10705b;
                    sVar5.a0();
                    if (sVar5.S) {
                        sVar5.k(a0Var2);
                    } else {
                        sVar5.k0();
                    }
                    f1.b.w(sVar5, q2.i.f10708e, n0VarA2);
                    f1.b.w(sVar5, q2.i.f10707d, q1VarL2);
                    q2.h hVar2 = q2.i.f10709f;
                    if (sVar5.S || !i9.l.a(sVar5.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar5, i12, hVar2);
                    }
                    f1.b.w(sVar5, q2.i.f10706c, pVarC2);
                    int i13 = e8.f0.f4526h;
                    float f11 = h1Var.f();
                    n9.a aVar2 = new n9.a(1.0f, 255.0f);
                    r1.p pVarB2 = androidx.compose.foundation.layout.c.b(mVar2, 27);
                    sVar5.W(5004770);
                    Object objK2 = sVar5.K();
                    if (objK2 == w0Var) {
                        objK2 = new g1(h1Var, 2);
                        sVar5.h0(objK2);
                    }
                    sVar5.p(false);
                    g2.b(f11, (h9.k) objK2, pVarB2, false, aVar2, 0, null, null, null, sVar5, 197040, 456);
                    sVar5.p(true);
                }
                break;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    int i14 = e8.f0.f4526h;
                    i2.c.m(h1Var.f() + "nit", null, sVar6, 0, 2);
                    i2.c.b(0, sVar6);
                }
                break;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    i2.c.m("选择亮度值", null, sVar7, 6, 2);
                    r1.m mVar3 = r1.m.f11116a;
                    r1.p pVarK3 = androidx.compose.foundation.layout.a.k(mVar3, 0.0f, 6, 0.0f, 0.0f, 13);
                    d0.n0 n0VarA3 = d0.l0.a(d0.h.f3566a, r1.c.f11101j, sVar7, 0);
                    long j11 = sVar7.T;
                    int i15 = (int) (j11 ^ (j11 >>> 32));
                    f1.q1 q1VarL3 = sVar7.l();
                    r1.p pVarC3 = r1.a.c(sVar7, pVarK3);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var3 = q2.i.f10705b;
                    sVar7.a0();
                    if (sVar7.S) {
                        sVar7.k(a0Var3);
                    } else {
                        sVar7.k0();
                    }
                    f1.b.w(sVar7, q2.i.f10708e, n0VarA3);
                    f1.b.w(sVar7, q2.i.f10707d, q1VarL3);
                    q2.h hVar3 = q2.i.f10709f;
                    if (sVar7.S || !i9.l.a(sVar7.K(), Integer.valueOf(i15))) {
                        ob.a.w(i15, sVar7, i15, hVar3);
                    }
                    f1.b.w(sVar7, q2.i.f10706c, pVarC3);
                    float f12 = h1Var.f();
                    n9.a aVar3 = new n9.a(1.0f, 500.0f);
                    r1.p pVarB3 = androidx.compose.foundation.layout.c.b(mVar3, 27);
                    sVar7.W(5004770);
                    Object objK3 = sVar7.K();
                    if (objK3 == w0Var) {
                        objK3 = new g1(h1Var, 5);
                        sVar7.h0(objK3);
                    }
                    sVar7.p(false);
                    g2.b(f12, (h9.k) objK3, pVarB3, false, aVar3, 0, null, null, null, sVar7, 197040, 456);
                    sVar7.p(true);
                }
                break;
            default:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    i2.c.m(h1Var.f() + "lux", null, sVar8, 0, 2);
                    i2.c.b(0, sVar8);
                }
                break;
        }
        return zVar;
    }
}
