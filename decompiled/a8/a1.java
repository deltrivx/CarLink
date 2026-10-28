package a8;

import android.bluetooth.BluetoothDevice;
import b8.m2;
import b8.n2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f73b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f75d;

    public a1(n2 n2Var, h9.k kVar, h9.a aVar) {
        this.f72a = 7;
        this.f74c = n2Var;
        this.f73b = kVar;
        this.f75d = aVar;
    }

    public /* synthetic */ a1(Object obj, f1.b1 b1Var, Object obj2, int i7) {
        this.f72a = i7;
        this.f73b = obj;
        this.f75d = b1Var;
        this.f74c = obj2;
    }

    public /* synthetic */ a1(Object obj, Object obj2, f1.b1 b1Var, int i7) {
        this.f72a = i7;
        this.f73b = obj;
        this.f74c = obj2;
        this.f75d = b1Var;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f72a;
        final int i10 = 1;
        f1.w0 w0Var = f1.n.f5051a;
        t8.z zVar = t8.z.f12851a;
        Object obj3 = this.f74c;
        Object obj4 = this.f75d;
        ?? r12 = this.f73b;
        final int i11 = 2;
        final int i12 = 0;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                final d1 d1Var = (d1) obj3;
                final h9.k kVar = (h9.k) r12;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(-1746271574);
                    boolean zF = sVar.f(kVar) | sVar.f(d1Var);
                    final f1.b1 b1Var = (f1.b1) obj4;
                    Object objK = sVar.K();
                    if (zF || objK == w0Var) {
                        objK = new h9.a(kVar, d1Var, b1Var, i12) { // from class: a8.z0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f294a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ h9.k f295b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f296c;

                            {
                                this.f294a = i12;
                                this.f296c = b1Var;
                            }

                            @Override // h9.a
                            public final Object invoke() {
                                int i13 = this.f294a;
                                t8.z zVar2 = t8.z.f12851a;
                                f1.b1 b1Var2 = this.f296c;
                                h9.k kVar2 = this.f295b;
                                switch (i13) {
                                    case 0:
                                        kVar2.invoke(new m2("BTSwitch", "蓝牙开关", (((Boolean) b1Var2.getValue()).booleanValue() ? "打开" : "关闭").concat("蓝牙"), new b8.v(((Boolean) b1Var2.getValue()).booleanValue())));
                                        break;
                                    case 1:
                                        if (((String) b1Var2.getValue()).length() != 0) {
                                            kVar2.invoke(new m2("NetWork", "网络请求", ob.a.q("请求 ", (String) b1Var2.getValue()), new b8.g1((String) b1Var2.getValue())));
                                        } else {
                                            hc.c cVar = n8.c.f8897a;
                                            n8.c.j(0, "链接不能为空");
                                        }
                                        break;
                                    default:
                                        kVar2.invoke(new m2("Wifi", "WiFi开关", (((Boolean) b1Var2.getValue()).booleanValue() ? "打开" : "关闭").concat("WiFi"), new b8.b2(((Boolean) b1Var2.getValue()).booleanValue())));
                                        break;
                                }
                                return zVar2;
                            }
                        };
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK, sVar, 6, 6);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                i1 i1Var = (i1) obj3;
                h9.k kVar2 = (h9.k) r12;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    sVar2.W(-1746271574);
                    boolean zF2 = sVar2.f(kVar2) | sVar2.f(i1Var);
                    f1.h1 h1Var = (f1.h1) obj4;
                    Object objK2 = sVar2.K();
                    if (zF2 || objK2 == w0Var) {
                        objK2 = new f1(kVar2, i1Var, h1Var);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK2, sVar2, 6, 6);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                final p1 p1Var = (p1) obj3;
                final h9.k kVar3 = (h9.k) r12;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    sVar3.W(-1746271574);
                    boolean zF3 = sVar3.f(kVar3) | sVar3.f(p1Var);
                    final f1.b1 b1Var2 = (f1.b1) obj4;
                    Object objK3 = sVar3.K();
                    if (zF3 || objK3 == w0Var) {
                        objK3 = new h9.a(kVar3, p1Var, b1Var2, i10) { // from class: a8.z0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f294a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ h9.k f295b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f296c;

                            {
                                this.f294a = i10;
                                this.f296c = b1Var2;
                            }

                            @Override // h9.a
                            public final Object invoke() {
                                int i13 = this.f294a;
                                t8.z zVar2 = t8.z.f12851a;
                                f1.b1 b1Var3 = this.f296c;
                                h9.k kVar4 = this.f295b;
                                switch (i13) {
                                    case 0:
                                        kVar4.invoke(new m2("BTSwitch", "蓝牙开关", (((Boolean) b1Var3.getValue()).booleanValue() ? "打开" : "关闭").concat("蓝牙"), new b8.v(((Boolean) b1Var3.getValue()).booleanValue())));
                                        break;
                                    case 1:
                                        if (((String) b1Var3.getValue()).length() != 0) {
                                            kVar4.invoke(new m2("NetWork", "网络请求", ob.a.q("请求 ", (String) b1Var3.getValue()), new b8.g1((String) b1Var3.getValue())));
                                        } else {
                                            hc.c cVar = n8.c.f8897a;
                                            n8.c.j(0, "链接不能为空");
                                        }
                                        break;
                                    default:
                                        kVar4.invoke(new m2("Wifi", "WiFi开关", (((Boolean) b1Var3.getValue()).booleanValue() ? "打开" : "关闭").concat("WiFi"), new b8.b2(((Boolean) b1Var3.getValue()).booleanValue())));
                                        break;
                                }
                                return zVar2;
                            }
                        };
                        sVar3.h0(objK3);
                    }
                    sVar3.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK3, sVar3, 6, 6);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                e2 e2Var = (e2) r12;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    sVar4.W(-1746271574);
                    boolean zF4 = sVar4.f(e2Var);
                    f1.b1 b1Var3 = (f1.b1) obj4;
                    f1.b1 b1Var4 = (f1.b1) obj3;
                    Object objK4 = sVar4.K();
                    if (zF4 || objK4 == w0Var) {
                        objK4 = new p(e2Var, b1Var3, b1Var4);
                        sVar4.h0(objK4);
                    }
                    sVar4.p(false);
                    i2.c.o("测试", (h9.a) objK4, sVar4, 6);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    ArrayList arrayList = new ArrayList(u8.q.a0(r12, 10));
                    for (String str : r12) {
                        arrayList.add(new l8.j0(str, new l8.m0(str), null, null, null, 28));
                    }
                    sVar5.W(-1633490746);
                    f1.b1 b1Var5 = (f1.b1) obj4;
                    f1.b1 b1Var6 = (f1.b1) obj3;
                    Object objK5 = sVar5.K();
                    if (objK5 == w0Var) {
                        objK5 = new y1(b1Var5, b1Var6, i12);
                        sVar5.h0(objK5);
                    }
                    sVar5.p(false);
                    g5.a.c(arrayList, null, 1, null, 0.0f, 0.0f, (h9.k) objK5, sVar5, 1573248, 58);
                }
                break;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                final f2 f2Var = (f2) obj3;
                final h9.k kVar4 = (h9.k) r12;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    sVar6.W(-1746271574);
                    boolean zF5 = sVar6.f(kVar4) | sVar6.f(f2Var);
                    final f1.b1 b1Var7 = (f1.b1) obj4;
                    Object objK6 = sVar6.K();
                    if (zF5 || objK6 == w0Var) {
                        objK6 = new h9.a(kVar4, f2Var, b1Var7, i11) { // from class: a8.z0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f294a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ h9.k f295b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f296c;

                            {
                                this.f294a = i11;
                                this.f296c = b1Var7;
                            }

                            @Override // h9.a
                            public final Object invoke() {
                                int i13 = this.f294a;
                                t8.z zVar2 = t8.z.f12851a;
                                f1.b1 b1Var8 = this.f296c;
                                h9.k kVar5 = this.f295b;
                                switch (i13) {
                                    case 0:
                                        kVar5.invoke(new m2("BTSwitch", "蓝牙开关", (((Boolean) b1Var8.getValue()).booleanValue() ? "打开" : "关闭").concat("蓝牙"), new b8.v(((Boolean) b1Var8.getValue()).booleanValue())));
                                        break;
                                    case 1:
                                        if (((String) b1Var8.getValue()).length() != 0) {
                                            kVar5.invoke(new m2("NetWork", "网络请求", ob.a.q("请求 ", (String) b1Var8.getValue()), new b8.g1((String) b1Var8.getValue())));
                                        } else {
                                            hc.c cVar = n8.c.f8897a;
                                            n8.c.j(0, "链接不能为空");
                                        }
                                        break;
                                    default:
                                        kVar5.invoke(new m2("Wifi", "WiFi开关", (((Boolean) b1Var8.getValue()).booleanValue() ? "打开" : "关闭").concat("WiFi"), new b8.b2(((Boolean) b1Var8.getValue()).booleanValue())));
                                        break;
                                }
                                return zVar2;
                            }
                        };
                        sVar6.h0(objK6);
                    }
                    sVar6.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK6, sVar6, 6, 6);
                }
                break;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    c8.n.f2521a.a(n3.l.J("查看应用日志", "查看当前应用和系统日志"), sVar7, 6);
                    n1.c cVarE = n1.h.e(217489622, new y(4, (List) r12), sVar7);
                    n1.c cVar = c8.c.f2470a;
                    sVar7.W(-1633490746);
                    p1.p pVar = (p1.p) obj3;
                    f1.b1 b1Var8 = (f1.b1) obj4;
                    Object objK7 = sVar7.K();
                    if (objK7 == w0Var) {
                        objK7 = new c8.c0(pVar, b1Var8, 0);
                        sVar7.h0(objK7);
                    }
                    sVar7.p(false);
                    a.a.h(cVarE, cVar, false, (h9.a) objK7, sVar7, 3510, 0);
                }
                break;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    d0.b bVar = d0.h.f3566a;
                    n2 n2Var = (n2) obj3;
                    h9.k kVar5 = (h9.k) r12;
                    h9.a aVar = (h9.a) obj4;
                    d0.s sVarA = d0.q.a(d0.h.g(g5.a.n(16, sVar8)), r1.c.f11104n, sVar8, 48);
                    long j5 = sVar8.T;
                    int i13 = (int) ((j5 >>> 32) ^ j5);
                    f1.q1 q1VarL = sVar8.l();
                    r1.p pVarC = r1.a.c(sVar8, r1.m.f11116a);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar8.a0();
                    if (sVar8.S) {
                        sVar8.k(a0Var);
                    } else {
                        sVar8.k0();
                    }
                    f1.b.w(sVar8, q2.i.f10708e, sVarA);
                    f1.b.w(sVar8, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar8.S || !i9.l.a(sVar8.K(), Integer.valueOf(i13))) {
                        ob.a.w(i13, sVar8, i13, hVar);
                    }
                    f1.b.w(sVar8, q2.i.f10706c, pVarC);
                    androidx.compose.material3.a.a(n2Var.f1627e, kVar5, null, false, null, sVar8, 0);
                    i2.c.m("删除", aVar, sVar8, 6, 0);
                    sVar8.p(true);
                }
                break;
            case 8:
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    Set<BluetoothDevice> set = (Set) r12;
                    ArrayList arrayList2 = new ArrayList(u8.q.a0(set, 10));
                    for (BluetoothDevice bluetoothDevice : set) {
                        String strValueOf = String.valueOf(bluetoothDevice.getName());
                        String name = bluetoothDevice.getName();
                        i9.l.d(name, "getName(...)");
                        arrayList2.add(new l8.j0(strValueOf, new l8.m0(name), null, null, null, 28));
                    }
                    sVar9.W(-1633490746);
                    f1.b1 b1Var9 = (f1.b1) obj4;
                    f1.b1 b1Var10 = (f1.b1) obj3;
                    Object objK8 = sVar9.K();
                    if (objK8 == w0Var) {
                        objK8 = new y1(b1Var9, b1Var10, i10);
                        sVar9.h0(objK8);
                    }
                    sVar9.p(false);
                    g5.a.c(arrayList2, null, 1, null, 0.0f, 0.0f, (h9.k) objK8, sVar9, 1573248, 58);
                }
                break;
            case 9:
                f1.s sVar10 = (f1.s) obj;
                h9.a aVar2 = (h9.a) obj3;
                h9.n nVar = (h9.n) r12;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    sVar10.W(-1746271574);
                    boolean zF6 = sVar10.f(nVar) | sVar10.f(aVar2);
                    f1.b1 b1Var11 = (f1.b1) obj4;
                    Object objK9 = sVar10.K();
                    if (zF6 || objK9 == w0Var) {
                        objK9 = new j1((Object) nVar, (Object) aVar2, b1Var11, 7);
                        sVar10.h0(objK9);
                    }
                    sVar10.p(false);
                    i2.c.o("默认", (h9.a) objK9, sVar10, 6);
                }
                break;
            default:
                f1.s sVar11 = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar11.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r1.p pVar2 = (r1.p) r12;
                    f1.b1 b1Var12 = (f1.b1) obj4;
                    Object objK10 = sVar11.K();
                    if (objK10 == w0Var) {
                        objK10 = new f8.h(b1Var12, 3);
                        sVar11.h0(objK10);
                    }
                    r1.p pVarD = androidx.compose.ui.layout.a.d(pVar2, (h9.k) objK10);
                    n1.c cVar2 = (n1.c) obj3;
                    o2.m0 m0VarD = d0.m.d(r1.c.f11092a, true);
                    long j10 = sVar11.T;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    f1.q1 q1VarL2 = sVar11.l();
                    r1.p pVarC2 = r1.a.c(sVar11, pVarD);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var2 = q2.i.f10705b;
                    sVar11.a0();
                    if (sVar11.S) {
                        sVar11.k(a0Var2);
                    } else {
                        sVar11.k0();
                    }
                    f1.b.w(sVar11, q2.i.f10708e, m0VarD);
                    f1.b.w(sVar11, q2.i.f10707d, q1VarL2);
                    q2.h hVar2 = q2.i.f10709f;
                    if (sVar11.S || !i9.l.a(sVar11.K(), Integer.valueOf(i14))) {
                        ob.a.w(i14, sVar11, i14, hVar2);
                    }
                    f1.b.w(sVar11, q2.i.f10706c, pVarC2);
                    cVar2.invoke(sVar11, 0);
                    sVar11.p(true);
                } else {
                    sVar11.Q();
                }
                break;
        }
        return zVar;
    }
}
