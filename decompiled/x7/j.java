package x7;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import f1.b1;
import f1.i0;
import f1.s;
import f1.w0;
import f1.w2;
import java.util.ArrayList;
import java.util.List;
import l8.j0;
import l8.l0;
import n8.w;
import n8.y;
import t8.z;
import u8.p;
import x.n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f14656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f14657c;

    public /* synthetic */ j(w2 w2Var, List list, int i7) {
        this.f14655a = i7;
        this.f14656b = w2Var;
        this.f14657c = list;
    }

    public static final t8.j e(DisplayManager displayManager, int i7) {
        Display display;
        Display[] displays = displayManager.getDisplays();
        i9.l.d(displays, "getDisplays(...)");
        int length = displays.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                display = null;
                break;
            }
            display = displays[i10];
            if (display.getDisplayId() == i7) {
                break;
            }
            i10++;
        }
        if (display != null) {
            return Build.VERSION.SDK_INT >= 23 ? new t8.j(Integer.valueOf(display.getMode().getPhysicalWidth()), Integer.valueOf(display.getMode().getPhysicalHeight())) : new t8.j(Integer.valueOf(display.getWidth()), Integer.valueOf(display.getHeight()));
        }
        return n8.h.e();
    }

    public static final t8.j f(DisplayManager displayManager, int i7) {
        Display display;
        Display[] displays = displayManager.getDisplays();
        i9.l.d(displays, "getDisplays(...)");
        int length = displays.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                display = null;
                break;
            }
            display = displays[i10];
            if (display.getDisplayId() == i7) {
                break;
            }
            i10++;
        }
        if (display != null) {
            return Build.VERSION.SDK_INT >= 23 ? new t8.j(Integer.valueOf(display.getMode().getPhysicalWidth()), Integer.valueOf(display.getMode().getPhysicalHeight())) : new t8.j(Integer.valueOf(display.getWidth()), Integer.valueOf(display.getHeight()));
        }
        return n8.h.e();
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        final w2 w2Var;
        Display display;
        Object obj3;
        w2 w2Var2;
        final w2 w2Var3;
        char c10;
        Display display2;
        int i7;
        j jVar = this;
        int i10 = jVar.f14655a;
        w0 w0Var = f1.n.f5051a;
        w2 w2Var4 = jVar.f14656b;
        z zVar = z.f12851a;
        List list = jVar.f14657c;
        int i11 = 2;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    Object systemService = n8.a.b().getSystemService("display");
                    i9.l.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
                    DisplayManager displayManager = (DisplayManager) systemService;
                    Display[] displays = displayManager.getDisplays();
                    i9.l.d(displays, "getDisplays(...)");
                    int length = displays.length;
                    int i12 = 0;
                    while (true) {
                        w2Var = jVar.f14656b;
                        if (i12 < length) {
                            display = displays[i12];
                            if (display.getDisplayId() != ((l) w2Var.getValue()).f14668h || display.getDisplayId() == 0) {
                                i12++;
                                jVar = this;
                            }
                        } else {
                            display = null;
                        }
                    }
                    sVar.W(1849434622);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        obj3 = null;
                        objK = f1.b.s(null);
                        sVar.h0(objK);
                    } else {
                        obj3 = null;
                    }
                    final b1 b1Var = (b1) objK;
                    Object objC = a2.f.C(sVar, false, 1849434622);
                    if (objC == w0Var) {
                        objC = f1.b.s(obj3);
                        sVar.h0(objC);
                    }
                    final b1 b1Var2 = (b1) objC;
                    sVar.p(false);
                    Object[] objArr = {display, Integer.valueOf(((l) w2Var.getValue()).f14669i), Integer.valueOf(((l) w2Var.getValue()).f14670j), Integer.valueOf(((l) w2Var.getValue()).k), Integer.valueOf(((l) w2Var.getValue()).f14671l), Integer.valueOf(((l) w2Var.getValue()).f14672m)};
                    sVar.W(-1224400529);
                    boolean zF = sVar.f(w2Var) | sVar.h(display);
                    Object objK2 = sVar.K();
                    if (zF || objK2 == w0Var) {
                        final int i13 = 0;
                        final Display display3 = display;
                        objK2 = new h9.k() { // from class: x7.h
                            @Override // h9.k
                            public final Object invoke(Object obj4) {
                                i0 i0Var = (i0) obj4;
                                switch (i13) {
                                    case 0:
                                        i9.l.e(i0Var, "$this$DisposableEffect");
                                        b1 b1Var3 = b1Var;
                                        w wVar = (w) b1Var3.getValue();
                                        if (wVar != null) {
                                            wVar.a();
                                        }
                                        b1 b1Var4 = b1Var2;
                                        y yVar = (y) b1Var4.getValue();
                                        if (yVar != null && yVar.isShowing()) {
                                            y yVar2 = (y) b1Var4.getValue();
                                            if (yVar2 != null) {
                                                yVar2.dismiss();
                                            }
                                            b1Var4.setValue(null);
                                        }
                                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                        w2 w2Var5 = w2Var;
                                        if (((l) w2Var5.getValue()).f14670j != 0) {
                                            layoutParams.width = ((l) w2Var5.getValue()).f14670j;
                                        }
                                        if (((l) w2Var5.getValue()).k != 0) {
                                            layoutParams.height = ((l) w2Var5.getValue()).k;
                                        }
                                        layoutParams.x = ((l) w2Var5.getValue()).f14671l;
                                        layoutParams.y = ((l) w2Var5.getValue()).f14672m;
                                        int i14 = ((l) w2Var5.getValue()).f14669i;
                                        Display display4 = display3;
                                        if (i14 == 1) {
                                            b1Var3.setValue(display4 != null ? new w(display4, null, layoutParams, b.k, 2) : null);
                                            w wVar2 = (w) b1Var3.getValue();
                                            if (wVar2 != null) {
                                                wVar2.b();
                                            }
                                        } else if (((l) w2Var5.getValue()).f14669i == 0) {
                                            b1Var4.setValue(display4 != null ? new y(display4, null, layoutParams, b.f14627l, 2) : null);
                                            y yVar3 = (y) b1Var4.getValue();
                                            if (yVar3 != null) {
                                                yVar3.show();
                                            }
                                        }
                                        return new i(b1Var3, b1Var4, 0);
                                    default:
                                        i9.l.e(i0Var, "$this$DisposableEffect");
                                        b1 b1Var5 = b1Var;
                                        w wVar3 = (w) b1Var5.getValue();
                                        if (wVar3 != null) {
                                            wVar3.a();
                                        }
                                        b1 b1Var6 = b1Var2;
                                        y yVar4 = (y) b1Var6.getValue();
                                        if (yVar4 != null && yVar4.isShowing()) {
                                            y yVar5 = (y) b1Var6.getValue();
                                            if (yVar5 != null) {
                                                yVar5.dismiss();
                                            }
                                            b1Var6.setValue(null);
                                        }
                                        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                                        w2 w2Var6 = w2Var;
                                        if (((l) w2Var6.getValue()).f14664d != 0) {
                                            layoutParams2.width = ((l) w2Var6.getValue()).f14664d;
                                        }
                                        if (((l) w2Var6.getValue()).f14665e != 0) {
                                            layoutParams2.height = ((l) w2Var6.getValue()).f14665e;
                                        }
                                        layoutParams2.x = ((l) w2Var6.getValue()).f14666f;
                                        layoutParams2.y = ((l) w2Var6.getValue()).f14667g;
                                        int i15 = ((l) w2Var6.getValue()).f14662b;
                                        Display display5 = display3;
                                        if (i15 == 1) {
                                            b1Var5.setValue(display5 != null ? new w(display5, null, layoutParams2, b.f14624h, 2) : null);
                                            w wVar4 = (w) b1Var5.getValue();
                                            if (wVar4 != null) {
                                                wVar4.b();
                                            }
                                        } else {
                                            b1Var6.setValue(display5 != null ? new y(display5, null, layoutParams2, b.f14625i, 2) : null);
                                            y yVar6 = (y) b1Var6.getValue();
                                            if (yVar6 != null) {
                                                yVar6.show();
                                            }
                                        }
                                        return new i(b1Var5, b1Var6, 1);
                                }
                            }
                        };
                        w2Var2 = w2Var;
                        sVar.h0(objK2);
                    } else {
                        w2Var2 = w2Var;
                    }
                    sVar.p(false);
                    f1.b.e(objArr, (h9.k) objK2, sVar);
                    Activity activity = (Activity) sVar.j(d.c.f3530a);
                    List listJ = n3.l.J(p.k0(list) + "类型", "选择投屏类型");
                    j0 j0Var = new j0("普通", new l0(0), null, null, null, 28);
                    l0 l0Var = new l0(1);
                    sVar.W(5004770);
                    boolean zH = sVar.h(activity);
                    Object objK3 = sVar.K();
                    if (zH || objK3 == w0Var) {
                        objK3 = new m7.f(activity, 1);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    List listJ2 = n3.l.J(j0Var, new j0("悬浮", l0Var, null, null, (h9.a) objK3, 12), new j0("高德协议", new l0(2), null, null, null, 28));
                    sVar.W(1849434622);
                    Object objK4 = sVar.K();
                    if (objK4 == w0Var) {
                        objK4 = new n1(2);
                        sVar.h0(objK4);
                    }
                    sVar.p(false);
                    k9.a.c(listJ, listJ2, "SECONDARY_HUD_TYPE", false, false, (h9.k) objK4, sVar, 196992, 24);
                    List listJ3 = n3.l.J("选择屏幕", "选择显示屏幕");
                    Display[] displays2 = displayManager.getDisplays();
                    i9.l.d(displays2, "getDisplays(...)");
                    ArrayList arrayList = new ArrayList(displays2.length);
                    for (Display display4 : displays2) {
                        arrayList.add(new j0(display4.getName() + " " + e(displayManager, display4.getDisplayId()).f12830a + "*" + e(displayManager, display4.getDisplayId()).f12831b, new l0(display4.getDisplayId()), null, null, null, 28));
                    }
                    sVar.W(1849434622);
                    Object objK5 = sVar.K();
                    if (objK5 == w0Var) {
                        objK5 = new n1(3);
                        sVar.h0(objK5);
                    }
                    sVar.p(false);
                    k9.a.c(listJ3, arrayList, "SECONDARY_HUD_ID", false, false, (h9.k) objK5, sVar, 196998, 24);
                    List listJ4 = n3.l.J("宽度", "px");
                    t8.j jVar2 = new t8.j("SECONDARY_HUD_WIDTH", Integer.valueOf(((l) w2Var2.getValue()).f14670j));
                    t8.j jVarJ = a2.f.J(new n9.a(0.0f, ((Number) e(displayManager, ((l) w2Var2.getValue()).f14668h).f12830a).intValue()), 0, sVar, 1849434622);
                    Object objK6 = sVar.K();
                    if (objK6 == w0Var) {
                        objK6 = new n1(4);
                        sVar.h0(objK6);
                    }
                    sVar.p(false);
                    a.a.i(listJ4, jVar2, jVarJ, false, (h9.k) objK6, sVar, 24582, 8);
                    List listJ5 = n3.l.J("高度", "px");
                    t8.j jVar3 = new t8.j("SECONDARY_HUD_HEIGHT", Integer.valueOf(((l) w2Var2.getValue()).k));
                    t8.j jVarJ2 = a2.f.J(new n9.a(0.0f, ((Number) e(displayManager, ((l) w2Var2.getValue()).f14668h).f12831b).intValue()), 0, sVar, 1849434622);
                    Object objK7 = sVar.K();
                    if (objK7 == w0Var) {
                        objK7 = new n1(5);
                        sVar.h0(objK7);
                    }
                    sVar.p(false);
                    a.a.i(listJ5, jVar3, jVarJ2, false, (h9.k) objK7, sVar, 24582, 8);
                    List listJ6 = n3.l.J("左偏移X", "px");
                    t8.j jVar4 = new t8.j("SECONDARY_HUD_OFFSET_X", Integer.valueOf(((l) w2Var2.getValue()).f14671l));
                    t8.j jVarJ3 = a2.f.J(new n9.a(0.0f, ((Number) e(displayManager, ((l) w2Var2.getValue()).f14668h).f12830a).intValue()), 0, sVar, 1849434622);
                    Object objK8 = sVar.K();
                    if (objK8 == w0Var) {
                        objK8 = new n1(6);
                        sVar.h0(objK8);
                    }
                    sVar.p(false);
                    a.a.i(listJ6, jVar4, jVarJ3, false, (h9.k) objK8, sVar, 24582, 8);
                    List listJ7 = n3.l.J("上偏移Y", "px");
                    t8.j jVar5 = new t8.j("SECONDARY_HUD_OFFSET_Y", Integer.valueOf(((l) w2Var2.getValue()).f14672m));
                    t8.j jVarJ4 = a2.f.J(new n9.a(0.0f, ((Number) e(displayManager, ((l) w2Var2.getValue()).f14668h).f12831b).intValue()), 0, sVar, 1849434622);
                    Object objK9 = sVar.K();
                    if (objK9 == w0Var) {
                        objK9 = new n1(1);
                        sVar.h0(objK9);
                    }
                    sVar.p(false);
                    a.a.i(listJ7, jVar5, jVarJ4, false, (h9.k) objK9, sVar, 24582, 8);
                    i2.c.j(n3.l.I("重启CarLife生效, 连接后显示(测试)"), sVar, 6);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(834306471, new j(w2Var4, list, 0), sVar2), sVar2, 48, 1);
                }
                break;
            case 2:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    Object systemService2 = n8.a.b().getSystemService("display");
                    i9.l.c(systemService2, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
                    DisplayManager displayManager2 = (DisplayManager) systemService2;
                    Display[] displays3 = displayManager2.getDisplays();
                    i9.l.d(displays3, "getDisplays(...)");
                    int length2 = displays3.length;
                    int i14 = 0;
                    while (true) {
                        w2Var3 = jVar.f14656b;
                        if (i14 < length2) {
                            Display display5 = displays3[i14];
                            c10 = 1;
                            if (display5.getDisplayId() != ((l) w2Var3.getValue()).f14661a || display5.getDisplayId() == 0) {
                                i14++;
                            } else {
                                display2 = display5;
                            }
                        } else {
                            c10 = 1;
                            display2 = null;
                        }
                    }
                    sVar3.W(1849434622);
                    Object objK10 = sVar3.K();
                    if (objK10 == w0Var) {
                        objK10 = f1.b.s(null);
                        sVar3.h0(objK10);
                    }
                    final b1 b1Var3 = (b1) objK10;
                    Object objC2 = a2.f.C(sVar3, false, 1849434622);
                    if (objC2 == w0Var) {
                        objC2 = f1.b.s(null);
                        sVar3.h0(objC2);
                    }
                    final b1 b1Var4 = (b1) objC2;
                    sVar3.p(false);
                    Integer numValueOf = Integer.valueOf(((l) w2Var3.getValue()).f14662b);
                    Integer numValueOf2 = Integer.valueOf(((l) w2Var3.getValue()).f14664d);
                    Integer numValueOf3 = Integer.valueOf(((l) w2Var3.getValue()).f14665e);
                    Integer numValueOf4 = Integer.valueOf(((l) w2Var3.getValue()).f14666f);
                    Integer numValueOf5 = Integer.valueOf(((l) w2Var3.getValue()).f14667g);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = display2;
                    objArr2[c10] = numValueOf;
                    objArr2[2] = numValueOf2;
                    objArr2[3] = numValueOf3;
                    objArr2[4] = numValueOf4;
                    objArr2[5] = numValueOf5;
                    sVar3.W(-1224400529);
                    boolean zF2 = sVar3.f(w2Var3) | sVar3.h(display2);
                    Object objK11 = sVar3.K();
                    if (zF2 || objK11 == w0Var) {
                        final int i15 = 1;
                        final Display display6 = display2;
                        objK11 = new h9.k() { // from class: x7.h
                            @Override // h9.k
                            public final Object invoke(Object obj4) {
                                i0 i0Var = (i0) obj4;
                                switch (i15) {
                                    case 0:
                                        i9.l.e(i0Var, "$this$DisposableEffect");
                                        b1 b1Var5 = b1Var3;
                                        w wVar = (w) b1Var5.getValue();
                                        if (wVar != null) {
                                            wVar.a();
                                        }
                                        b1 b1Var6 = b1Var4;
                                        y yVar = (y) b1Var6.getValue();
                                        if (yVar != null && yVar.isShowing()) {
                                            y yVar2 = (y) b1Var6.getValue();
                                            if (yVar2 != null) {
                                                yVar2.dismiss();
                                            }
                                            b1Var6.setValue(null);
                                        }
                                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                        w2 w2Var5 = w2Var3;
                                        if (((l) w2Var5.getValue()).f14670j != 0) {
                                            layoutParams.width = ((l) w2Var5.getValue()).f14670j;
                                        }
                                        if (((l) w2Var5.getValue()).k != 0) {
                                            layoutParams.height = ((l) w2Var5.getValue()).k;
                                        }
                                        layoutParams.x = ((l) w2Var5.getValue()).f14671l;
                                        layoutParams.y = ((l) w2Var5.getValue()).f14672m;
                                        int i16 = ((l) w2Var5.getValue()).f14669i;
                                        Display display7 = display6;
                                        if (i16 == 1) {
                                            b1Var5.setValue(display7 != null ? new w(display7, null, layoutParams, b.k, 2) : null);
                                            w wVar2 = (w) b1Var5.getValue();
                                            if (wVar2 != null) {
                                                wVar2.b();
                                            }
                                        } else if (((l) w2Var5.getValue()).f14669i == 0) {
                                            b1Var6.setValue(display7 != null ? new y(display7, null, layoutParams, b.f14627l, 2) : null);
                                            y yVar3 = (y) b1Var6.getValue();
                                            if (yVar3 != null) {
                                                yVar3.show();
                                            }
                                        }
                                        return new i(b1Var5, b1Var6, 0);
                                    default:
                                        i9.l.e(i0Var, "$this$DisposableEffect");
                                        b1 b1Var7 = b1Var3;
                                        w wVar3 = (w) b1Var7.getValue();
                                        if (wVar3 != null) {
                                            wVar3.a();
                                        }
                                        b1 b1Var8 = b1Var4;
                                        y yVar4 = (y) b1Var8.getValue();
                                        if (yVar4 != null && yVar4.isShowing()) {
                                            y yVar5 = (y) b1Var8.getValue();
                                            if (yVar5 != null) {
                                                yVar5.dismiss();
                                            }
                                            b1Var8.setValue(null);
                                        }
                                        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                                        w2 w2Var6 = w2Var3;
                                        if (((l) w2Var6.getValue()).f14664d != 0) {
                                            layoutParams2.width = ((l) w2Var6.getValue()).f14664d;
                                        }
                                        if (((l) w2Var6.getValue()).f14665e != 0) {
                                            layoutParams2.height = ((l) w2Var6.getValue()).f14665e;
                                        }
                                        layoutParams2.x = ((l) w2Var6.getValue()).f14666f;
                                        layoutParams2.y = ((l) w2Var6.getValue()).f14667g;
                                        int i17 = ((l) w2Var6.getValue()).f14662b;
                                        Display display8 = display6;
                                        if (i17 == 1) {
                                            b1Var7.setValue(display8 != null ? new w(display8, null, layoutParams2, b.f14624h, 2) : null);
                                            w wVar4 = (w) b1Var7.getValue();
                                            if (wVar4 != null) {
                                                wVar4.b();
                                            }
                                        } else {
                                            b1Var8.setValue(display8 != null ? new y(display8, null, layoutParams2, b.f14625i, 2) : null);
                                            y yVar6 = (y) b1Var8.getValue();
                                            if (yVar6 != null) {
                                                yVar6.show();
                                            }
                                        }
                                        return new i(b1Var7, b1Var8, 1);
                                }
                            }
                        };
                        sVar3.h0(objK11);
                    }
                    sVar3.p(false);
                    f1.b.e(objArr2, (h9.k) objK11, sVar3);
                    Activity activity2 = (Activity) sVar3.j(d.c.f3530a);
                    List listJ8 = n3.l.J(p.k0(list) + "类型", "选择投屏类型");
                    j0 j0Var2 = new j0("普通", new l0(0), null, null, null, 28);
                    l0 l0Var2 = new l0(1);
                    sVar3.W(5004770);
                    boolean zH2 = sVar3.h(activity2);
                    Object objK12 = sVar3.K();
                    if (zH2 || objK12 == w0Var) {
                        i7 = 2;
                        objK12 = new m7.f(activity2, 2);
                        sVar3.h0(objK12);
                    } else {
                        i7 = 2;
                    }
                    sVar3.p(false);
                    j0 j0Var3 = new j0("悬浮", l0Var2, null, null, (h9.a) objK12, 12);
                    j0[] j0VarArr = new j0[i7];
                    j0VarArr[0] = j0Var2;
                    j0VarArr[1] = j0Var3;
                    List listJ9 = n3.l.J(j0VarArr);
                    sVar3.W(1849434622);
                    Object objK13 = sVar3.K();
                    if (objK13 == w0Var) {
                        objK13 = new n1(7);
                        sVar3.h0(objK13);
                    }
                    sVar3.p(false);
                    k9.a.c(listJ8, listJ9, "SECONDARY_SCREEN_TYPE", false, false, (h9.k) objK13, sVar3, 196992, 24);
                    List listJ10 = n3.l.J("选择屏幕", "选择显示屏幕");
                    Display[] displays4 = displayManager2.getDisplays();
                    i9.l.d(displays4, "getDisplays(...)");
                    ArrayList arrayList2 = new ArrayList(displays4.length);
                    for (Display display7 : displays4) {
                        arrayList2.add(new j0(display7.getName() + " " + f(displayManager2, display7.getDisplayId()).f12830a + "*" + f(displayManager2, display7.getDisplayId()).f12831b, new l0(display7.getDisplayId()), null, null, null, 28));
                    }
                    sVar3.W(1849434622);
                    Object objK14 = sVar3.K();
                    if (objK14 == w0Var) {
                        objK14 = new n1(8);
                        sVar3.h0(objK14);
                    }
                    sVar3.p(false);
                    k9.a.c(listJ10, arrayList2, "SECONDARY_SCREEN_ID", false, false, (h9.k) objK14, sVar3, 196998, 24);
                    List listJ11 = n3.l.J("延迟投屏", "秒");
                    t8.j jVar6 = new t8.j("SECONDARY_SCREEN_DELAY", Integer.valueOf(((l) w2Var3.getValue()).f14663c));
                    t8.j jVarJ5 = a2.f.J(new n9.a(0.0f, 120.0f), 0, sVar3, 1849434622);
                    Object objK15 = sVar3.K();
                    if (objK15 == w0Var) {
                        objK15 = new n1(9);
                        sVar3.h0(objK15);
                    }
                    sVar3.p(false);
                    a.a.i(listJ11, jVar6, jVarJ5, false, (h9.k) objK15, sVar3, 24582, 8);
                    List listJ12 = n3.l.J("宽度", "px");
                    t8.j jVar7 = new t8.j("SECONDARY_SCREEN_WIDTH", Integer.valueOf(((l) w2Var3.getValue()).f14664d));
                    t8.j jVarJ6 = a2.f.J(new n9.a(0.0f, ((Number) f(displayManager2, ((l) w2Var3.getValue()).f14661a).f12830a).intValue()), 0, sVar3, 1849434622);
                    Object objK16 = sVar3.K();
                    if (objK16 == w0Var) {
                        objK16 = new n1(10);
                        sVar3.h0(objK16);
                    }
                    sVar3.p(false);
                    a.a.i(listJ12, jVar7, jVarJ6, false, (h9.k) objK16, sVar3, 24582, 8);
                    List listJ13 = n3.l.J("高度", "px");
                    t8.j jVar8 = new t8.j("SECONDARY_SCREEN_HEIGHT", Integer.valueOf(((l) w2Var3.getValue()).f14665e));
                    t8.j jVarJ7 = a2.f.J(new n9.a(0.0f, ((Number) f(displayManager2, ((l) w2Var3.getValue()).f14661a).f12831b).intValue()), 0, sVar3, 1849434622);
                    Object objK17 = sVar3.K();
                    if (objK17 == w0Var) {
                        objK17 = new n1(11);
                        sVar3.h0(objK17);
                    }
                    sVar3.p(false);
                    a.a.i(listJ13, jVar8, jVarJ7, false, (h9.k) objK17, sVar3, 24582, 8);
                    List listJ14 = n3.l.J("左偏移X", "px");
                    t8.j jVar9 = new t8.j("SECONDARY_SCREEN_OFFSET_X", Integer.valueOf(((l) w2Var3.getValue()).f14666f));
                    t8.j jVarJ8 = a2.f.J(new n9.a(0.0f, ((Number) f(displayManager2, ((l) w2Var3.getValue()).f14661a).f12830a).intValue()), 0, sVar3, 1849434622);
                    Object objK18 = sVar3.K();
                    if (objK18 == w0Var) {
                        objK18 = new n1(12);
                        sVar3.h0(objK18);
                    }
                    sVar3.p(false);
                    a.a.i(listJ14, jVar9, jVarJ8, false, (h9.k) objK18, sVar3, 24582, 8);
                    List listJ15 = n3.l.J("上偏移Y", "px");
                    t8.j jVar10 = new t8.j("SECONDARY_SCREEN_OFFSET_Y", Integer.valueOf(((l) w2Var3.getValue()).f14667g));
                    t8.j jVarJ9 = a2.f.J(new n9.a(0.0f, ((Number) f(displayManager2, ((l) w2Var3.getValue()).f14661a).f12831b).intValue()), 0, sVar3, 1849434622);
                    Object objK19 = sVar3.K();
                    if (objK19 == w0Var) {
                        objK19 = new n1(13);
                        sVar3.h0(objK19);
                    }
                    sVar3.p(false);
                    a.a.i(listJ15, jVar10, jVarJ9, false, (h9.k) objK19, sVar3, 24582, 8);
                    i2.c.j(n3.l.I("重启CarLife生效, 连接后显示(测试)"), sVar3, 6);
                }
                break;
            default:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, n1.h.e(-263039996, new j(w2Var4, list, i11), sVar4), sVar4, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
