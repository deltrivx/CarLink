package e8;

import android.content.res.Configuration;
import b8.r2;
import b8.s2;
import c1.u2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4456b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4457c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4458d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4459e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4460f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f4461g = new a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4462h = new a(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f4463i = new a(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f4464j = new a(8);
    public static final a k = new a(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f4465l = new a(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f4466m = new a(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f4467n = new a(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f4468o = new a(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f4469p = new a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4470a;

    public /* synthetic */ a(int i7) {
        this.f4470a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4470a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("监听中...", null, sVar, 6, 2);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    i2.c.m("查看", null, sVar3, 6, 2);
                    i2.c.b(0, sVar3);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    u2.b("蓝牙名称", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 6, 0, 131070);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    g5.a.b(null, d.f4502a, sVar5, 48, 1);
                }
                break;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    List listJ = n3.l.J("显示悬浮窗", "安卓10+开机自启需要开启此权限");
                    List listI = n3.l.I(x6.a.i());
                    w7.f fVar = w7.f.f14170a;
                    fVar.f(listJ, listI, false, sVar6, 3078, 4);
                    List listJ2 = n3.l.J("忽略电池优化", "安卓11+开机自启需要开启此权限");
                    s.s sVar7 = x6.a.f14604a;
                    Object bVar = (z6.a) sVar7.a("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    if (bVar == null) {
                        bVar = new b7.b(1);
                        sVar7.b("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", bVar);
                    }
                    fVar.f(listJ2, n3.l.I(bVar), false, sVar6, 3462, 0);
                }
                break;
            case 6:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    i2.c.m("当前主题", null, sVar8, 6, 2);
                    i2.c.p("德赛西威系统主题监听", sVar8, 6);
                }
                break;
            case 7:
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    u2.b("按键映射", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 6, 0, 131070);
                }
                break;
            case 8:
                f1.s sVar10 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    u2.b("关键字", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 6, 0, 131070);
                }
                break;
            case 9:
                f1.s sVar11 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    u2.b("日志监听", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 6, 0, 131070);
                }
                break;
            case 10:
                f1.s sVar12 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar12.z()) {
                    sVar12.Q();
                } else {
                    u2.b("按键映射", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 6, 0, 131070);
                }
                break;
            case 11:
                f1.s sVar13 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar13.z()) {
                    sVar13.Q();
                } else {
                    g5.a.b(null, i.f4559c, sVar13, 48, 1);
                    a2.f.L(16, sVar13, r1.m.f11116a, sVar13);
                }
                break;
            case 12:
                f1.s sVar14 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar14.z()) {
                    sVar14.Q();
                } else {
                    i2.c.m("当前主题", null, sVar14, 6, 2);
                    i2.c.p("系统主题监听", sVar14, 6);
                }
                break;
            case 13:
                f1.s sVar15 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar15.z()) {
                    sVar15.Q();
                } else {
                    a.a.h(i.f4557a, i.f4558b, false, null, sVar15, 438, 8);
                }
                break;
            default:
                f1.s sVar16 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar16.z()) {
                    sVar16.Q();
                } else {
                    int i7 = (((Configuration) sVar16.j(r2.n0.f11342a)).uiMode & 48) == 32 ? 1 : 0;
                    s2.f1649c.getClass();
                    i2.c.m("当前: ".concat(r2.a(i7)), null, sVar16, 0, 2);
                    i2.c.b(0, sVar16);
                }
                break;
        }
        return t8.z.f12851a;
    }
}
