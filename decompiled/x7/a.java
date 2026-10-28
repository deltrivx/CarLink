package x7;

import c1.u2;
import f1.q1;
import f1.s;
import n3.r;
import o2.m0;
import q2.a0;
import r1.p;
import t8.z;
import w0.e1;
import y1.h0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14605b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14606c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14607d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14608e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f14609f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f14610g = new a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f14611h = new a(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f14612i = new a(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f14613j = new a(8);
    public static final a k = new a(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f14614l = new a(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f14615m = new a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14616a;

    public /* synthetic */ a(int i7) {
        this.f14616a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14616a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("设置", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    r1.h hVar = r1.c.f11096e;
                    p pVarA = androidx.compose.foundation.a.b(r1.m.f11116a, q.f14954h, h0.f14898a).a(androidx.compose.foundation.layout.c.f822c);
                    m0 m0VarD = d0.m.d(hVar, false);
                    long j5 = sVar2.T;
                    int i7 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar2.l();
                    p pVarC = r1.a.c(sVar2, pVarA);
                    q2.j.f10719d0.getClass();
                    a0 a0Var = q2.i.f10705b;
                    sVar2.a0();
                    if (sVar2.S) {
                        sVar2.k(a0Var);
                    } else {
                        sVar2.k0();
                    }
                    f1.b.w(sVar2, q2.i.f10708e, m0VarD);
                    f1.b.w(sVar2, q2.i.f10707d, q1VarL);
                    q2.h hVar2 = q2.i.f10709f;
                    if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i7))) {
                        ob.a.w(i7, sVar2, i7, hVar2);
                    }
                    f1.b.w(sVar2, q2.i.f10706c, pVarC);
                    u2.b("互联普通测试", null, q.f14951e, r.D(40), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 3462, 0, 131058);
                    sVar2.p(true);
                }
                break;
            case 2:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    i2.c.m("设置", null, sVar3, 6, 2);
                    i2.c.b(0, sVar3);
                }
                break;
            case 3:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    r1.h hVar3 = r1.c.f11096e;
                    p pVarA2 = androidx.compose.foundation.a.b(r1.m.f11116a, q.f14954h, h0.f14898a).a(androidx.compose.foundation.layout.c.f822c);
                    m0 m0VarD2 = d0.m.d(hVar3, false);
                    long j10 = sVar4.T;
                    int i10 = (int) (j10 ^ (j10 >>> 32));
                    q1 q1VarL2 = sVar4.l();
                    p pVarC2 = r1.a.c(sVar4, pVarA2);
                    q2.j.f10719d0.getClass();
                    a0 a0Var2 = q2.i.f10705b;
                    sVar4.a0();
                    if (sVar4.S) {
                        sVar4.k(a0Var2);
                    } else {
                        sVar4.k0();
                    }
                    f1.b.w(sVar4, q2.i.f10708e, m0VarD2);
                    f1.b.w(sVar4, q2.i.f10707d, q1VarL2);
                    q2.h hVar4 = q2.i.f10709f;
                    if (sVar4.S || !i9.l.a(sVar4.K(), Integer.valueOf(i10))) {
                        ob.a.w(i10, sVar4, i10, hVar4);
                    }
                    f1.b.w(sVar4, q2.i.f10706c, pVarC2);
                    u2.b("HUD普通测试", null, q.f14951e, r.D(40), null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 3462, 0, 131058);
                    sVar4.p(true);
                }
                break;
            case 4:
                s sVar5 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    sVar5.W(1849434622);
                    Object objK = sVar5.K();
                    if (objK == f1.n.f5051a) {
                        objK = new e1(10);
                        sVar5.h0(objK);
                    }
                    sVar5.p(false);
                    i2.c.o("重启", (h9.a) objK, sVar5, 54);
                }
                break;
            case 5:
                s sVar6 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    g5.a.b(null, b.f14618b, sVar6, 48, 1);
                    a2.f.L(16, sVar6, r1.m.f11116a, sVar6);
                }
                break;
            case 6:
                s sVar7 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    g5.a.b(null, b.f14621e, sVar7, 48, 1);
                }
                break;
            case 7:
                s sVar8 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    k kVar = k.f14658a;
                    kVar.b(null, sVar8, 48);
                    kVar.a(null, sVar8, 48);
                }
                break;
            case 8:
                s sVar9 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    r1.h hVar5 = r1.c.f11096e;
                    p pVarA3 = androidx.compose.foundation.a.b(r1.m.f11116a, q.f14952f, h0.f14898a).a(androidx.compose.foundation.layout.c.f822c);
                    m0 m0VarD3 = d0.m.d(hVar5, false);
                    long j11 = sVar9.T;
                    int i11 = (int) (j11 ^ (j11 >>> 32));
                    q1 q1VarL3 = sVar9.l();
                    p pVarC3 = r1.a.c(sVar9, pVarA3);
                    q2.j.f10719d0.getClass();
                    a0 a0Var3 = q2.i.f10705b;
                    sVar9.a0();
                    if (sVar9.S) {
                        sVar9.k(a0Var3);
                    } else {
                        sVar9.k0();
                    }
                    f1.b.w(sVar9, q2.i.f10708e, m0VarD3);
                    f1.b.w(sVar9, q2.i.f10707d, q1VarL3);
                    q2.h hVar6 = q2.i.f10709f;
                    if (sVar9.S || !i9.l.a(sVar9.K(), Integer.valueOf(i11))) {
                        ob.a.w(i11, sVar9, i11, hVar6);
                    }
                    f1.b.w(sVar9, q2.i.f10706c, pVarC3);
                    u2.b("HUD悬浮测试", null, q.f14951e, r.D(40), null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 3462, 0, 131058);
                    sVar9.p(true);
                }
                break;
            case 9:
                s sVar10 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    w7.f.f14170a.f(n3.l.J("显示悬浮窗", "需要开启显示悬浮窗权限"), n3.l.I(x6.a.i()), false, sVar10, 3462, 0);
                }
                break;
            case 10:
                s sVar11 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    r1.h hVar7 = r1.c.f11096e;
                    p pVarA4 = androidx.compose.foundation.a.b(r1.m.f11116a, q.f14952f, h0.f14898a).a(androidx.compose.foundation.layout.c.f822c);
                    m0 m0VarD4 = d0.m.d(hVar7, false);
                    long j12 = sVar11.T;
                    int i12 = (int) (j12 ^ (j12 >>> 32));
                    q1 q1VarL4 = sVar11.l();
                    p pVarC4 = r1.a.c(sVar11, pVarA4);
                    q2.j.f10719d0.getClass();
                    a0 a0Var4 = q2.i.f10705b;
                    sVar11.a0();
                    if (sVar11.S) {
                        sVar11.k(a0Var4);
                    } else {
                        sVar11.k0();
                    }
                    f1.b.w(sVar11, q2.i.f10708e, m0VarD4);
                    f1.b.w(sVar11, q2.i.f10707d, q1VarL4);
                    q2.h hVar8 = q2.i.f10709f;
                    if (sVar11.S || !i9.l.a(sVar11.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar11, i12, hVar8);
                    }
                    f1.b.w(sVar11, q2.i.f10706c, pVarC4);
                    u2.b("互联悬浮测试", null, q.f14951e, r.D(40), null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 3462, 0, 131058);
                    sVar11.p(true);
                }
                break;
            default:
                s sVar12 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar12.z()) {
                    sVar12.Q();
                } else {
                    i2.c.m("设置", null, sVar12, 6, 2);
                    i2.c.b(0, sVar12);
                }
                break;
        }
        return z.f12851a;
    }
}
