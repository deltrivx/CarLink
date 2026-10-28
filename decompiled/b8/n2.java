package b8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {
    public static final j2 Companion = new j2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t8.h[] f1620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f1621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fc.h0 f1622h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1627e;

    static {
        b3.i0 i0Var = new b3.i0(3);
        t8.i iVar = t8.i.f12827a;
        f1620f = new t8.h[]{null, null, t8.a.c(iVar, i0Var), t8.a.c(iVar, new b3.i0(4)), null};
        f1621g = n3.l.J(new n2(0, "下一首", n3.l.I(new m2("KeyBoard", "物理按键监听", "单击87 阻止其他事件", new u0(87, 0, true))), n3.l.I(new m2("Message", "下一首", "发送按键消息16", new d1(16))), true), new n2(1, "上一首", n3.l.I(new m2("KeyBoard", "物理按键监听", "单击88 阻止其他事件", new u0(88, 0, true))), n3.l.I(new m2("Message", "上一首", "发送按键消息15", new d1(15))), true), new n2(2, "白天模式", n3.l.I(new m2("SunCycle", "系统主题", "系统切换到白天模式", new p1(0))), n3.l.I(new m2("Theme", "互联主题", "互联切换到白天模式", new s1(0))), true), new n2(3, "夜间模式", n3.l.I(new m2("SunCycle", "系统主题", "系统切换到夜间模式", new p1(1))), n3.l.I(new m2("Theme", "互联主题", "互联切换到夜间模式", new s1(1))), true), new n2(4, "连接后打开互联", n3.l.I(new m2("ConnectState", "CarLife已连接", "CarLife已连接", new f0(2))), n3.l.J(new m2("Delay", "延迟执行", "延迟5秒", new l0(5L)), new m2("AppSwitch", "前台启动", "前台启动", new m(0))), true), new n2(5, "断开后返回桌面", n3.l.I(new m2("ConnectState", "CarLife连接断开", "CarLife连接断开", new f0(3))), n3.l.I(new m2("AppSwitch", "返回桌面", "返回桌面", new m(3))), false), new n2(6, "连接服务自启", n3.l.I(new m2("AppState", "应用启动", "当应用启动时", new j(0))), n3.l.I(new m2("AppSwitch", "服务启动", "服务启动", new m(2))), true), new n2(7, "开机自启", n3.l.I(new m2("Boot", "系统启动", "当系统启动时", new y())), n3.l.I(new m2("AppSwitch", "静默启动", "静默启动", new m(1))), true), new n2(8, "返回", n3.l.I(new m2("KeyBoard", "物理按键监听", "单击4 阻止其他事件", new u0(4, 0, true))), n3.l.I(new m2("Message", "返回", "发送按键消息14", new d1(14))), true), new n2(9, "连接后打开导航", n3.l.I(new m2("ConnectState", "CarLife已连接", "CarLife已连接", new f0(2))), n3.l.J(new m2("Delay", "延迟执行", "延迟5秒", new l0(5L)), new m2("Message", "打开导航", "发送按键消息11", new m(11))), false));
        List listA = j2.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((n2) obj).f1627e) {
                arrayList.add(obj);
            }
        }
        f1622h = fc.y.b(arrayList);
    }

    public /* synthetic */ n2(int i7, int i10, String str, List list, List list2, boolean z10) {
        if (15 != (i7 & 15)) {
            pc.m0.e(i7, 15, i2.f1599a.d());
            throw null;
        }
        this.f1623a = i10;
        this.f1624b = str;
        this.f1625c = list;
        this.f1626d = list2;
        if ((i7 & 16) == 0) {
            this.f1627e = true;
        } else {
            this.f1627e = z10;
        }
    }

    public n2(int i7, String str, List list, List list2, boolean z10) {
        this.f1623a = i7;
        this.f1624b = str;
        this.f1625c = list;
        this.f1626d = list2;
        this.f1627e = z10;
    }

    public static n2 a(n2 n2Var, String str, List list, List list2, boolean z10, int i7) {
        String str2 = str;
        int i10 = n2Var.f1623a;
        if ((i7 & 2) != 0) {
            str2 = n2Var.f1624b;
        }
        if ((i7 & 4) != 0) {
            list = n2Var.f1625c;
        }
        if ((i7 & 8) != 0) {
            list2 = n2Var.f1626d;
        }
        if ((i7 & 16) != 0) {
            z10 = n2Var.f1627e;
        }
        boolean z11 = z10;
        n2Var.getClass();
        i9.l.e(str2, "label");
        i9.l.e(list, "trigger");
        i9.l.e(list2, "action");
        List list3 = list2;
        return new n2(i10, str2, list, list3, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.f1623a == n2Var.f1623a && i9.l.a(this.f1624b, n2Var.f1624b) && i9.l.a(this.f1625c, n2Var.f1625c) && i9.l.a(this.f1626d, n2Var.f1626d) && this.f1627e == n2Var.f1627e;
    }

    public final int hashCode() {
        return ((this.f1626d.hashCode() + ((this.f1625c.hashCode() + ob.a.l(this.f1624b, this.f1623a * 31, 31)) * 31)) * 31) + (this.f1627e ? 1231 : 1237);
    }

    public final String toString() {
        return "TaskerOption(id=" + this.f1623a + ", label=" + this.f1624b + ", trigger=" + this.f1625c + ", action=" + this.f1626d + ", enabled=" + this.f1627e + ")";
    }
}
