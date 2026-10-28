package o7;

import c1.u2;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.w0;
import l8.j0;
import l8.l0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9463b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9464c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9465d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9466e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f9467f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f9468g = new a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f9469h = new a(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f9470i = new a(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f9471j = new a(8);
    public static final a k = new a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9472a;

    public /* synthetic */ a(int i7) {
        this.f9472a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f9472a;
        w0 w0Var = f1.n.f5051a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("设置", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, c.f9476c, sVar2, 48, 1);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    u2.b("确定退出应用吗？", androidx.compose.foundation.layout.c.f820a, 0L, n3.r.K(g5.a.n(22, sVar3), 4294967296L), null, 0L, new m3.k(3), n3.r.K(g5.a.n(80, sVar3), 4294967296L), 0, false, 0, 0, null, sVar3, 54, 0, 129524);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    sVar4.W(1849434622);
                    Object objK = sVar4.K();
                    if (objK == w0Var) {
                        objK = new n8.f(5);
                        sVar4.h0(objK);
                    }
                    sVar4.p(false);
                    i2.c.l("退出", 0L, 0L, (h9.a) objK, sVar4, 3078, 6);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    sVar5.W(1849434622);
                    Object objK2 = sVar5.K();
                    if (objK2 == w0Var) {
                        objK2 = new n8.f(6);
                        sVar5.h0(objK2);
                    }
                    sVar5.p(false);
                    i2.c.o("重启", (h9.a) objK2, sVar5, 54);
                }
                break;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    j.f9497b.h(n3.l.J("USB设备忽略", "USB设备忽略设置"), sVar6, 54);
                    k9.a.f(n3.l.J("USB传输包大小", "设置每个数据包的大小"), n3.l.J(new j0("稳定优先-4KB", new l0(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT), null, null, null, 28), new j0("兼容模式-8KB", new l0(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT), null, null, null, 28), new j0("标准传输-12KB", new l0(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ALL), null, null, null, 28), new j0("高性能-14KB", new l0(14336), null, null, null, 28), new j0("高速优选-16KB", new l0(16384), null, null, null, 28), new j0("极速模式-20KB", new l0(20480), null, null, null, 28)), new t8.j(Configs.FEATURE_CONFIG_USB_MTU, new l0(16384)), false, false, null, sVar6, 24582, 40);
                }
                break;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    i2.c.m("设置", null, sVar7, 6, 2);
                    i2.c.b(0, sVar7);
                }
                break;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    i2.c.m("请选择要忽略的USB设备", null, sVar8, 6, 2);
                }
                break;
            case 8:
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                }
                break;
            default:
                f1.s sVar10 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    i2.c.m("设置", null, sVar10, 6, 2);
                    i2.c.b(0, sVar10);
                }
                break;
        }
        return zVar;
    }
}
