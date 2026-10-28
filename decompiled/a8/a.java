package a8;

import c1.u2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f54b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f55c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f57e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f58f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f59g = new a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f60h = new a(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f61i = new a(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f62j = new a(8);
    public static final a k = new a(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f63l = new a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64a;

    public /* synthetic */ a(int i7) {
        this.f64a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f64a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("选择", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    r1.h hVar = r1.c.f11096e;
                    r1.p pVarD = androidx.compose.foundation.layout.c.d(r1.m.f11116a, g5.a.n(110, sVar2), 0.0f, 2);
                    o2.m0 m0VarD = d0.m.d(hVar, false);
                    long j5 = sVar2.T;
                    int i7 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL = sVar2.l();
                    r1.p pVarC = r1.a.c(sVar2, pVarD);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
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
                    u2.b("加载中", androidx.compose.foundation.layout.c.f820a, 0L, n3.r.K(g5.a.n(18, sVar2), 4294967296L), null, 0L, new m3.k(3), 0L, 0, false, 0, 0, null, sVar2, 54, 0, 130548);
                    sVar2.p(true);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    w7.f.f14170a.f(n3.l.J("显示悬浮窗", "安卓10+开机自启需要开启此权限"), n3.l.I(x6.a.i()), false, sVar3, 3078, 4);
                    i2.c.j(n3.l.I("前台启动可能需要悬浮窗和后台弹出界面权限"), sVar3, 6);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, d.f102a, sVar4, 48, 1);
                    a2.f.L(16, sVar4, r1.m.f11116a, sVar4);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    i2.c.m("音频通道", null, sVar5, 6, 2);
                    i2.c.p("音频通道设置", sVar5, 6);
                }
                break;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    i2.c.m("选择音频", null, sVar6, 6, 2);
                    i2.c.p("选择音频文件", sVar6, 6);
                }
                break;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    u2.b("热点密码", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 6, 0, 131070);
                }
                break;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    u2.b("热点名称", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 6, 0, 131070);
                }
                break;
            case 8:
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    u2.b("请求链接", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 6, 0, 131070);
                }
                break;
            case 9:
                f1.s sVar10 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    u2.b("WiFi名称", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 6, 0, 131070);
                }
                break;
            default:
                f1.s sVar11 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    u2.b("WiFi密码(可为空)", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 6, 0, 131070);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
