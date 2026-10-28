package a8;

import b8.h2;
import c1.u2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f266b;

    public /* synthetic */ w(f1.b1 b1Var, int i7) {
        this.f265a = i7;
        this.f266b = b1Var;
    }

    private final Object e(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            g5.a.b(null, n1.h.e(-1774097694, new w(this.f266b, 23), sVar), sVar, 48, 1);
        }
        return t8.z.f12851a;
    }

    private final Object f(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            r1.g gVar = r1.c.k;
            d0.b bVar = d0.h.f3567b;
            r1.p pVarK = androidx.compose.foundation.layout.a.k(r1.m.f11116a, 0.0f, 0.0f, 8, 0.0f, 11);
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar = (b0.k) objK;
            sVar.p(false);
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new k(this.f266b, 29);
                sVar.h0(objK2);
            }
            sVar.p(false);
            r1.p pVarC = androidx.compose.foundation.a.c(pVarK, kVar, null, false, (h9.a) objK2, 28);
            d0.n0 n0VarA = d0.l0.a(bVar, gVar, sVar, 54);
            long j5 = sVar.T;
            int i7 = (int) (j5 ^ (j5 >>> 32));
            f1.q1 q1VarL = sVar.l();
            r1.p pVarC2 = r1.a.c(sVar, pVarC);
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
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                ob.a.w(i7, sVar, i7, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC2);
            i2.c.m("选择", null, sVar, 6, 2);
            i2.c.i(0, sVar);
            sVar.p(true);
        }
        return t8.z.f12851a;
    }

    private final Object g(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            d0.n0 n0VarA = d0.l0.a(d0.h.f3570e, r1.c.k, sVar, 54);
            long j5 = sVar.T;
            int i7 = (int) (j5 ^ (j5 >>> 32));
            f1.q1 q1VarL = sVar.l();
            r1.m mVar = r1.m.f11116a;
            r1.p pVarC = r1.a.c(sVar, mVar);
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
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                ob.a.w(i7, sVar, i7, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            u2.b("下载", null, 0L, n3.r.K(g5.a.n(20, sVar), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 6, 0, 131062);
            d0.c.a(sVar, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(32, sVar)));
            f1.b1 b1Var = this.f266b;
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(-1633490746);
            boolean zF = sVar.f("TEST_LOGS_SAVE");
            Object objK = sVar.K();
            if (zF || objK == f1.n.f5051a) {
                objK = new f8.h(b1Var, 0);
                sVar.h0(objK);
            }
            sVar.p(false);
            androidx.compose.material3.a.a(zBooleanValue, (h9.k) objK, null, false, null, sVar, 0);
            sVar.p(true);
        }
        return t8.z.f12851a;
    }

    private final Object h(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            i2.c.d((String) this.f266b.getValue(), sVar, 0);
        }
        return t8.z.f12851a;
    }

    private final Object i(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new f0.k(this.f266b, 13);
                sVar.h0(objK);
            }
            sVar.p(false);
            i2.c.o("取消", (h9.a) objK, sVar, 54);
        }
        return t8.z.f12851a;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws IOException {
        Object objB;
        List list;
        Object objB2;
        List list2;
        int i7 = this.f265a;
        u8.w wVar = u8.w.f13122a;
        int i10 = 5;
        f1.w0 w0Var = f1.n.f5051a;
        int i11 = 1;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f266b;
        int i12 = 0;
        int i13 = 2;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("应用活动", null, sVar, 6, 2);
                    String str = (String) b1Var.getValue();
                    if (str.length() == 0) {
                        str = "选择应用活动";
                    }
                    i2.c.p(str, sVar, 0);
                }
                return zVar;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    List listJ = n3.l.J("活动显示", "是否显示全部活动");
                    List listJ2 = n3.l.J(new l8.j0("公开活动", new l8.k0(false), null, null, null, 28), new l8.j0("全部活动", new l8.k0(true), null, null, null, 28));
                    sVar2.W(5004770);
                    Object objK = sVar2.K();
                    if (objK == w0Var) {
                        objK = new u(b1Var, i11);
                        sVar2.h0(objK);
                    }
                    sVar2.p(false);
                    k9.a.d(listJ, listJ2, null, 0, false, (h9.k) objK, sVar2, 221190, 12);
                }
                return zVar;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(1188671366, new w(b1Var, i11), sVar3), sVar3, 48, 1);
                    a2.f.L(16, sVar3, r1.m.f11116a, sVar3);
                }
                return zVar;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    i2.c.m("应用包名", null, sVar4, 6, 2);
                    String str2 = (String) b1Var.getValue();
                    if (str2.length() == 0) {
                        str2 = "选择应用包名";
                    }
                    i2.c.p(str2, sVar4, 0);
                }
                return zVar;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    String str3 = (String) b1Var.getValue();
                    if (str3.length() == 0) {
                        str3 = "选择";
                    }
                    i2.c.m(str3, null, sVar5, 0, 2);
                    i2.c.b(0, sVar5);
                }
                return zVar;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    List listJ3 = n3.l.J("应用显示", "是否显示全部应用");
                    List listJ4 = n3.l.J(new l8.j0("可打开应用", new l8.k0(false), null, null, null, 28), new l8.j0("全部应用", new l8.k0(true), null, null, null, 28));
                    sVar6.W(5004770);
                    Object objK2 = sVar6.K();
                    if (objK2 == w0Var) {
                        objK2 = new u(b1Var, i13);
                        sVar6.h0(objK2);
                    }
                    sVar6.p(false);
                    k9.a.d(listJ3, listJ4, null, 0, false, (h9.k) objK2, sVar6, 221190, 12);
                }
                return zVar;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    g5.a.b(null, n1.h.e(-1250120863, new w(b1Var, i10), sVar7), sVar7, 48, 1);
                    a2.f.L(16, sVar7, r1.m.f11116a, sVar7);
                }
                return zVar;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    sVar8.W(5004770);
                    Object objK3 = sVar8.K();
                    if (objK3 == w0Var) {
                        objK3 = new k(b1Var, i10);
                        sVar8.h0(objK3);
                    }
                    sVar8.p(false);
                    i2.c.o("上传", (h9.a) objK3, sVar8, 54);
                }
                return zVar;
            case 8:
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    String str4 = (String) b1Var.getValue();
                    if (str4.length() == 0) {
                        str4 = "选择";
                    }
                    i2.c.m(str4, null, sVar9, 0, 2);
                    i2.c.b(0, sVar9);
                }
                return zVar;
            case 9:
                f1.s sVar10 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    w7.f.f14170a.f(n3.l.J("后台定位", "可能需要开启此权限"), n3.l.J(x6.a.f(), x6.a.e(), x6.a.d(), x6.a.b(), x6.a.c(), x6.a.a(), x6.a.g()), false, sVar10, 3078, 4);
                    List listJ5 = n3.l.J("蓝牙开关", "选择蓝牙开关");
                    List listJ6 = n3.l.J(new l8.j0("打开蓝牙", new l8.k0(true), null, null, null, 28), new l8.j0("关闭蓝牙", new l8.k0(false), null, null, null, 28));
                    sVar10.W(5004770);
                    Object objK4 = sVar10.K();
                    if (objK4 == w0Var) {
                        objK4 = new u(b1Var, 4);
                        sVar10.h0(objK4);
                    }
                    sVar10.p(false);
                    k9.a.d(listJ5, listJ6, null, 0, false, (h9.k) objK4, sVar10, ServiceTypes.MSG_MEDIA_DATA, 28);
                    i2.c.j(n3.l.I("Android 13+ 不允许直接开关蓝牙"), sVar10, 6);
                }
                return zVar;
            case 10:
                f1.s sVar11 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    g5.a.b(null, n1.h.e(1950436077, new w(b1Var, 9), sVar11), sVar11, 48, 1);
                }
                return zVar;
            case 11:
                f1.s sVar12 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar12.z()) {
                    sVar12.Q();
                } else {
                    sVar12.W(-1633490746);
                    Object objK5 = sVar12.K();
                    if (objK5 == w0Var) {
                        objK5 = new k(b1Var, 8);
                        sVar12.h0(objK5);
                    }
                    sVar12.p(false);
                    c1.g1.c((h9.a) objK5, androidx.compose.foundation.layout.a.f(-8, 0.0f, 2), false, null, null, null, null, g.f126b, sVar12, 805306422);
                }
                return zVar;
            case 12:
                f1.s sVar13 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar13.z()) {
                    sVar13.Q();
                } else {
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, 4, 0.0f, 0, 5);
                    String str5 = (String) b1Var.getValue();
                    sVar13.W(5004770);
                    Object objK6 = sVar13.K();
                    if (objK6 == w0Var) {
                        objK6 = new u(b1Var, 8);
                        sVar13.h0(objK6);
                    }
                    sVar13.p(false);
                    c1.b1.a(str5, (h9.k) objK6, pVarK, false, null, g.f125a, n1.h.e(1254004822, new w(b1Var, 11), sVar13), false, null, null, null, false, 5, 0, null, null, sVar13, 806879664, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR, 8125880);
                    i2.c.j(n3.l.I("发送一个网络请求"), sVar13, 6);
                }
                return zVar;
            case 13:
                f1.s sVar14 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar14.z()) {
                    sVar14.Q();
                } else {
                    g5.a.b(null, n1.h.e(1776726893, new w(b1Var, 12), sVar14), sVar14, 48, 1);
                }
                return zVar;
            case 14:
                f1.s sVar15 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar15.z()) {
                    sVar15.Q();
                } else {
                    w7.f.f14170a.f(n3.l.J("后台定位", "可能需要开启此权限"), n3.l.J(x6.a.f(), x6.a.e(), x6.a.d(), x6.a.b(), x6.a.c(), x6.a.a(), x6.a.g()), false, sVar15, 3078, 4);
                    List listJ7 = n3.l.J("WiFi开关", "选择WiFi开关");
                    List listJ8 = n3.l.J(new l8.j0("打开WiFi", new l8.k0(true), null, null, null, 28), new l8.j0("关闭WiFi", new l8.k0(false), null, null, null, 28));
                    sVar15.W(5004770);
                    Object objK7 = sVar15.K();
                    if (objK7 == w0Var) {
                        objK7 = new u(b1Var, 11);
                        sVar15.h0(objK7);
                    }
                    sVar15.p(false);
                    k9.a.d(listJ7, listJ8, null, 0, false, (h9.k) objK7, sVar15, ServiceTypes.MSG_MEDIA_DATA, 28);
                    i2.c.j(n3.l.I("安卓9以上系统可能无效"), sVar15, 6);
                }
                return zVar;
            case 15:
                f1.s sVar16 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar16.z()) {
                    sVar16.Q();
                } else {
                    g5.a.b(null, n1.h.e(119335527, new w(b1Var, 14), sVar16), sVar16, 48, 1);
                }
                return zVar;
            case 16:
                f1.s sVar17 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar17.z()) {
                    sVar17.Q();
                } else {
                    c8.n nVar = c8.n.f2521a;
                    i2.c.m(((l8.j0) b1Var.getValue()).f8196a, null, sVar17, 0, 2);
                    i2.c.i(0, sVar17);
                }
                return zVar;
            case 17:
                f1.s sVar18 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar18.z()) {
                    sVar18.Q();
                } else {
                    sVar18.W(5004770);
                    Object objK8 = sVar18.K();
                    if (objK8 == w0Var) {
                        objK8 = new k(b1Var, 16);
                        sVar18.h0(objK8);
                    }
                    sVar18.p(false);
                    i2.c.o("退出", (h9.a) objK8, sVar18, 54);
                }
                return zVar;
            case 18:
                f1.s sVar19 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar19.z()) {
                    sVar19.Q();
                } else {
                    String str6 = ((Boolean) b1Var.getValue()).booleanValue() ? "停止" : "监听";
                    sVar19.W(5004770);
                    Object objK9 = sVar19.K();
                    if (objK9 == w0Var) {
                        objK9 = new k(b1Var, 17);
                        sVar19.h0(objK9);
                    }
                    sVar19.p(false);
                    i2.c.l(str6, 0L, 0L, (h9.a) objK9, sVar19, 3072, 6);
                }
                return zVar;
            case 19:
                f1.s sVar20 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar20.z()) {
                    sVar20.Q();
                } else {
                    int i14 = 12;
                    r1.p pVarK2 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, 4, 0.0f, 12, 5);
                    String str7 = (String) b1Var.getValue();
                    sVar20.W(5004770);
                    Object objK10 = sVar20.K();
                    if (objK10 == w0Var) {
                        objK10 = new u(b1Var, i14);
                        sVar20.h0(objK10);
                    }
                    sVar20.p(false);
                    c1.b1.a(str7, (h9.k) objK10, pVarK2, false, null, c8.c.f2473d, null, false, null, null, null, true, 0, 0, null, null, sVar20, 1573296, 12582912, 8257464);
                }
                return zVar;
            case 20:
                f1.s sVar21 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar21.z()) {
                    sVar21.Q();
                } else {
                    List list3 = (List) b1Var.getValue();
                    try {
                        ServiceLoader serviceLoaderLoad = ServiceLoader.load(h2.class);
                        i9.l.d(serviceLoaderLoad, "load(...)");
                        yb.b bVar = new yb.b(new yb.h(u8.p.f0(serviceLoaderLoad), true, new c8.e0(4)).iterator(), c8.e0.f2489b);
                        if (bVar.hasNext()) {
                            Object next = bVar.next();
                            if (bVar.hasNext()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(next);
                                while (bVar.hasNext()) {
                                    arrayList.add(bVar.next());
                                }
                                objB = arrayList;
                            } else {
                                objB = n3.l.I(next);
                            }
                        } else {
                            objB = wVar;
                        }
                    } catch (Throwable th) {
                        objB = t8.a.b(th);
                    }
                    Throwable thA = t8.m.a(objB);
                    if (thA != null) {
                        Logger.INSTANCE.e("OptionLoader", ob.a.q("模块加载失败: ", thA.getMessage()));
                        objB = wVar;
                    }
                    List list4 = (List) objB;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : list4) {
                        String name = ((h2) obj3).getName();
                        Object arrayList2 = linkedHashMap.get(name);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(name, arrayList2);
                        }
                        ((List) arrayList2).add(obj3);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((List) entry.getValue()).size() > 1) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        String str8 = (String) entry2.getKey();
                        List list5 = (List) entry2.getValue();
                        Logger.INSTANCE.e("CarLife_Vehicle", i9.y.f6689a.b(h2.class).l() + " 中 name 重复：'" + str8 + "'，模块：" + u8.p.q0(list5, null, null, null, c8.e0.f2490c, 31));
                        list = wVar;
                    } else {
                        list = list4;
                    }
                    sVar21.W(5004770);
                    Object objK11 = sVar21.K();
                    if (objK11 == w0Var) {
                        objK11 = new u(b1Var, 13);
                        sVar21.h0(objK11);
                    }
                    sVar21.p(false);
                    c8.f0.f2498a.a("触发条件", list3, list, (h9.k) objK11, sVar21, 27654);
                }
                return zVar;
            case 21:
                f1.s sVar22 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar22.z()) {
                    sVar22.Q();
                } else {
                    List list6 = (List) b1Var.getValue();
                    try {
                        ServiceLoader serviceLoaderLoad2 = ServiceLoader.load(h2.class);
                        i9.l.d(serviceLoaderLoad2, "load(...)");
                        yb.b bVar2 = new yb.b(new yb.h(u8.p.f0(serviceLoaderLoad2), true, new c8.e0(5)).iterator(), c8.e0.f2491d);
                        if (bVar2.hasNext()) {
                            Object next2 = bVar2.next();
                            if (bVar2.hasNext()) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(next2);
                                while (bVar2.hasNext()) {
                                    arrayList3.add(bVar2.next());
                                }
                                objB2 = arrayList3;
                            } else {
                                objB2 = n3.l.I(next2);
                            }
                        } else {
                            objB2 = wVar;
                        }
                    } catch (Throwable th2) {
                        objB2 = t8.a.b(th2);
                    }
                    Throwable thA2 = t8.m.a(objB2);
                    if (thA2 != null) {
                        Logger.INSTANCE.e("OptionLoader", ob.a.q("模块加载失败: ", thA2.getMessage()));
                        objB2 = wVar;
                    }
                    List list7 = (List) objB2;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Object obj4 : list7) {
                        String name2 = ((h2) obj4).getName();
                        Object arrayList4 = linkedHashMap3.get(name2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap3.put(name2, arrayList4);
                        }
                        ((List) arrayList4).add(obj4);
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                        if (((List) entry3.getValue()).size() > 1) {
                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap4.entrySet().iterator();
                    if (it2.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) it2.next();
                        String str9 = (String) entry4.getKey();
                        List list8 = (List) entry4.getValue();
                        Logger.INSTANCE.e("CarLife_Vehicle", i9.y.f6689a.b(h2.class).l() + " 中 name 重复：'" + str9 + "'，模块：" + u8.p.q0(list8, null, null, null, c8.e0.f2492e, 31));
                        list2 = wVar;
                    } else {
                        list2 = list7;
                    }
                    sVar22.W(5004770);
                    Object objK12 = sVar22.K();
                    if (objK12 == w0Var) {
                        objK12 = new u(b1Var, 14);
                        sVar22.h0(objK12);
                    }
                    sVar22.p(false);
                    c8.f0.f2498a.a("执行动作", list6, list2, (h9.k) objK12, sVar22, 27654);
                }
                return zVar;
            case 22:
                f1.s sVar23 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar23.z()) {
                    sVar23.Q();
                } else {
                    int i15 = e8.w.f4641e;
                    i2.c.m(((l8.j0) b1Var.getValue()).f8196a, null, sVar23, 0, 2);
                    i2.c.i(0, sVar23);
                }
                return zVar;
            case 23:
                f1.s sVar24 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar24.z()) {
                    sVar24.Q();
                } else {
                    r1.p pVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.f820a, g5.a.n(300, sVar24), 0.0f, 2);
                    d0.s sVarA = d0.q.a(d0.h.f3568c, r1.c.f11103m, sVar24, 0);
                    long j5 = sVar24.T;
                    int i16 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL = sVar24.l();
                    r1.p pVarC = r1.a.c(sVar24, pVarD);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar24.a0();
                    if (sVar24.S) {
                        sVar24.k(a0Var);
                    } else {
                        sVar24.k0();
                    }
                    f1.b.w(sVar24, q2.i.f10708e, sVarA);
                    f1.b.w(sVar24, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar24.S || !i9.l.a(sVar24.K(), Integer.valueOf(i16))) {
                        ob.a.w(i16, sVar24, i16, hVar);
                    }
                    f1.b.w(sVar24, q2.i.f10706c, pVarC);
                    sVar24.W(-935358995);
                    int i17 = e8.w.f4641e;
                    if (((List) b1Var.getValue()).isEmpty()) {
                        a.a.h(e8.b.f4483b, e8.b.f4484c, false, null, sVar24, 438, 8);
                    }
                    sVar24.p(false);
                    sVar24.W(-935353722);
                    int i18 = 0;
                    for (Object obj5 : (List) b1Var.getValue()) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            n3.l.Y();
                            throw null;
                        }
                        l8.j0 j0Var = (l8.j0) obj5;
                        a.a.h(n1.h.e(-76518396, new e8.o(j0Var, i12), sVar24), n1.h.e(-491565981, new e8.o(j0Var, i11), sVar24), i18 != n3.l.A((List) b1Var.getValue()), null, sVar24, 54, 8);
                        i18 = i19;
                    }
                    sVar24.p(false);
                    sVar24.p(true);
                }
                return zVar;
            case 24:
                return e(obj, obj2);
            case 25:
                return f(obj, obj2);
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return g(obj, obj2);
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return h(obj, obj2);
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                return i(obj, obj2);
            default:
                f1.s sVar25 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar25.z()) {
                    sVar25.Q();
                } else {
                    i2.c.m(((l8.j0) b1Var.getValue()).f8196a, null, sVar25, 0, 2);
                    i2.c.i(0, sVar25);
                }
                return zVar;
        }
    }
}
