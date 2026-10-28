package w7;

import a7.i;
import a7.j;
import f1.s;
import f1.w0;
import h9.n;
import java.util.List;
import n3.l;
import t8.z;
import w0.e1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14147b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14148c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14149d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14150e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f14151f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f14152g = new a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14153a;

    public /* synthetic */ a(int i7) {
        this.f14153a = i7;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f14153a;
        w0 w0Var = f1.n.f5051a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    List listJ = l.J("获取系统日志", "监听系统日志需要开启此权限");
                    f fVar = f.f14170a;
                    fVar.e(listJ, "android.permission.READ_LOGS", "获取系统日志权限需要执行下方Adb命令, 执行完毕后退出应用重新打开即可", false, sVar, 25014);
                    List listJ2 = l.J("应用详情", "打开应用详情页");
                    sVar.W(1849434622);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        objK = new e1(2);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    fVar.b(listJ2, false, (h9.a) objK, sVar, 3462, 2);
                    List listJ3 = l.J("系统设置", "打开系统设置页");
                    sVar.W(1849434622);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new e1(3);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    fVar.b(listJ3, false, (h9.a) objK2, sVar, 3510, 0);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    List listJ4 = l.J("无障碍服务", "模拟手动操作需要开启此权限");
                    f fVar2 = f.f14170a;
                    fVar2.a(listJ4, false, sVar2, 390);
                    fVar2.e(l.J("修改安全设置", "无障碍保活需要开启此权限"), "android.permission.WRITE_SECURE_SETTINGS", "修改安全设置权限需要执行下方Adb命令, 执行完毕后退出应用重新打开即可, 支持安卓6.0+", false, sVar2, 25014);
                    i2.c.j(l.I("USB连接自动点击确定，WLAN直连自动点击接受"), sVar2, 6);
                }
                break;
            case 2:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    i2.c.m("打开", null, sVar3, 6, 2);
                    i2.c.b(0, sVar3);
                }
                break;
            case 3:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    sVar4.W(1849434622);
                    Object objK3 = sVar4.K();
                    if (objK3 == w0Var) {
                        objK3 = new e1(4);
                        sVar4.h0(objK3);
                    }
                    sVar4.p(false);
                    i2.c.o("退出", (h9.a) objK3, sVar4, 54);
                }
                break;
            case 4:
                s sVar5 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    List listJ5 = l.J("显示悬浮窗", "安卓10+开机自启需要开启此权限");
                    List listI = l.I(x6.a.i());
                    f fVar3 = f.f14170a;
                    fVar3.f(listJ5, listI, false, sVar5, 3078, 4);
                    List listJ6 = l.J("忽略电池优化", "安卓11+开机自启需要开启此权限");
                    s.s sVar6 = x6.a.f14604a;
                    Object bVar = (z6.a) sVar6.a("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    if (bVar == null) {
                        bVar = new b7.b(1);
                        sVar6.b("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", bVar);
                    }
                    fVar3.f(listJ6, l.I(bVar), false, sVar5, 3462, 0);
                }
                break;
            default:
                s sVar7 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    List listJ7 = l.J("前台通知", "CarLife前台通知");
                    s.s sVar8 = x6.a.f14604a;
                    Object iVar = (z6.a) sVar8.a("android.permission.POST_NOTIFICATIONS");
                    if (iVar == null) {
                        iVar = new i(0);
                        sVar8.b("android.permission.POST_NOTIFICATIONS", iVar);
                    }
                    List listI2 = l.I(iVar);
                    f fVar4 = f.f14170a;
                    fVar4.f(listJ7, listI2, false, sVar7, 3078, 4);
                    List listJ8 = l.J("麦克风", "语音助手需要开启此权限");
                    z6.a jVar = (z6.a) sVar8.a("android.permission.RECORD_AUDIO");
                    if (jVar == null) {
                        jVar = new j("android.permission.RECORD_AUDIO", null, 23);
                        sVar8.b(jVar.n(), jVar);
                    }
                    fVar4.f(listJ8, l.I(jVar), false, sVar7, 3078, 4);
                    fVar4.f(l.J("附近设备", "扫描附近设备权限"), l.I(x6.a.g()), false, sVar7, 3078, 4);
                    fVar4.f(l.J("蓝牙相关", "蓝牙(扫描|连接|广播)权限"), l.J(x6.a.f(), x6.a.e(), x6.a.d()), false, sVar7, 3078, 4);
                    fVar4.f(l.J("后台定位", "无感连接需要开启此权限,选择始终允许"), l.J(x6.a.b(), x6.a.c(), x6.a.a()), false, sVar7, 3462, 0);
                }
                break;
        }
        return zVar;
    }
}
