package a8;

import b8.m2;
import b8.n2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f226f;

    public s(g0 g0Var, String str, h9.k kVar, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3) {
        this.f221a = 1;
        this.f226f = str;
        this.f222b = kVar;
        this.f223c = b1Var;
        this.f224d = b1Var2;
        this.f225e = b1Var3;
    }

    public s(h9.k kVar, e8.t0 t0Var, f1.b1 b1Var, f1.h1 h1Var, f1.b1 b1Var2) {
        this.f221a = 6;
        this.f222b = kVar;
        this.f226f = t0Var;
        this.f223c = b1Var;
        this.f225e = h1Var;
        this.f224d = b1Var2;
    }

    public /* synthetic */ s(h9.k kVar, Object obj, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, int i7) {
        this.f221a = i7;
        this.f222b = kVar;
        this.f226f = obj;
        this.f223c = b1Var;
        this.f224d = b1Var2;
        this.f225e = b1Var3;
    }

    public /* synthetic */ s(Object obj, f1.b1 b1Var, Object obj2, Object obj3, Object obj4, int i7) {
        this.f221a = i7;
        this.f222b = obj;
        this.f223c = b1Var;
        this.f226f = obj2;
        this.f224d = obj3;
        this.f225e = obj4;
    }

    public s(t8.j jVar, h9.k kVar, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3) {
        this.f221a = 9;
        this.f226f = jVar;
        this.f222b = kVar;
        this.f223c = b1Var;
        this.f224d = b1Var2;
        this.f225e = b1Var3;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f221a) {
            case 0:
                final g0 g0Var = (g0) this.f226f;
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(-1224400529);
                    boolean zF = sVar.f((h9.k) this.f222b) | sVar.f(g0Var);
                    final h9.k kVar = (h9.k) this.f222b;
                    final f1.b1 b1Var = (f1.b1) this.f224d;
                    final f1.b1 b1Var2 = (f1.b1) this.f225e;
                    Object objK = sVar.K();
                    if (zF || objK == f1.n.f5051a) {
                        final int i7 = 0;
                        final f1.b1 b1Var3 = this.f223c;
                        objK = new h9.a(kVar, g0Var, b1Var3, b1Var, b1Var2, i7) { // from class: a8.r

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f209a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ h9.k f210b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f211c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f212d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f213e;

                            {
                                this.f209a = i7;
                                this.f211c = b1Var3;
                                this.f212d = b1Var;
                                this.f213e = b1Var2;
                            }

                            @Override // h9.a
                            public final Object invoke() {
                                int i10 = this.f209a;
                                t8.z zVar = t8.z.f12851a;
                                f1.b1 b1Var4 = this.f213e;
                                f1.b1 b1Var5 = this.f212d;
                                f1.b1 b1Var6 = this.f211c;
                                h9.k kVar2 = this.f210b;
                                switch (i10) {
                                    case 0:
                                        if (((String) b1Var6.getValue()).length() == 0 || ((String) b1Var5.getValue()).length() == 0) {
                                            hc.c cVar = n8.c.f8897a;
                                            n8.c.j(0, "请先选择应用包名及活动");
                                        } else {
                                            kVar2.invoke(new m2("AppOpen", "打开应用", ob.a.q("打开 ", (String) b1Var4.getValue()), new b8.g((String) b1Var6.getValue(), (String) b1Var5.getValue())));
                                        }
                                        break;
                                    case 1:
                                        if (((String) b1Var6.getValue()).length() == 0) {
                                            hc.c cVar2 = n8.c.f8897a;
                                            n8.c.j(0, "名称不能为空");
                                        } else if (((String) b1Var5.getValue()).length() >= 8) {
                                            kVar2.invoke(new m2("Hotspot", "热点开关", (((Boolean) b1Var4.getValue()).booleanValue() ? "打开" : "关闭").concat("热点"), new b8.r0((String) b1Var6.getValue(), (String) b1Var5.getValue(), ((Boolean) b1Var4.getValue()).booleanValue())));
                                        } else {
                                            hc.c cVar3 = n8.c.f8897a;
                                            n8.c.j(0, "密码不能少于8位");
                                        }
                                        break;
                                    default:
                                        if (((String) b1Var6.getValue()).length() != 0) {
                                            kVar2.invoke(new m2("LogLine", "系统日志", "关键字: " + ((String) b1Var5.getValue()) + " 监听: " + ((String) b1Var6.getValue()), new b8.x0((String) b1Var6.getValue(), (String) b1Var5.getValue(), ((Boolean) b1Var4.getValue()).booleanValue())));
                                        } else {
                                            hc.c cVar4 = n8.c.f8897a;
                                            n8.c.j(0, "按键映射不能为空");
                                        }
                                        break;
                                }
                                return zVar;
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
                int iIntValue = ((Number) obj2).intValue();
                h9.k kVar2 = (h9.k) this.f222b;
                if ((iIntValue & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    String str = (String) this.f226f;
                    Boolean bool = (Boolean) this.f223c.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    i9.l.e(str, "packageName");
                    sVar2.W(-223955819);
                    sVar2.W(1849434622);
                    Object objK2 = sVar2.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (objK2 == w0Var) {
                        objK2 = f1.b.s(null);
                        sVar2.h0(objK2);
                    }
                    f1.b1 b1Var4 = (f1.b1) objK2;
                    sVar2.p(false);
                    sVar2.W(-1746271574);
                    boolean zF2 = sVar2.f(str) | sVar2.g(zBooleanValue);
                    Object objK3 = sVar2.K();
                    if (zF2 || objK3 == w0Var) {
                        objK3 = new d0(str, zBooleanValue, b1Var4, null);
                        sVar2.h0(objK3);
                    }
                    sVar2.p(false);
                    f1.b.g(str, bool, (h9.n) objK3, sVar2);
                    List<String> list = (List) b1Var4.getValue();
                    sVar2.p(false);
                    if (list == null || list.isEmpty()) {
                        sVar2.W(514305804);
                        g5.a.b(null, n1.h.e(-376039126, new y(0, list), sVar2), sVar2, 48, 1);
                        sVar2.p(false);
                    } else {
                        sVar2.W(514837051);
                        ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
                        for (String str2 : list) {
                            arrayList.add(new l8.j0(str2, new l8.m0(str2), null, null, null, 28));
                        }
                        n1.c cVar = c.f93c;
                        sVar2.W(-1746271574);
                        boolean zF3 = sVar2.f(kVar2);
                        f1.b1 b1Var5 = (f1.b1) this.f224d;
                        f1.b1 b1Var6 = (f1.b1) this.f225e;
                        Object objK4 = sVar2.K();
                        if (zF3 || objK4 == w0Var) {
                            objK4 = new x(kVar2, b1Var5, b1Var6, 0);
                            sVar2.h0(objK4);
                        }
                        sVar2.p(false);
                        g5.a.c(arrayList, null, 1, cVar, 0.0f, 0.0f, (h9.k) objK4, sVar2, 3456, 50);
                        sVar2.p(false);
                    }
                }
                break;
            case 2:
                x0 x0Var = (x0) this.f226f;
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    sVar3.W(-1224400529);
                    boolean zF4 = sVar3.f((h9.k) this.f222b) | sVar3.h(x0Var);
                    h9.k kVar3 = (h9.k) this.f222b;
                    f1.b1 b1Var7 = (f1.b1) this.f224d;
                    f1.h1 h1Var = (f1.h1) this.f225e;
                    Object objK5 = sVar3.K();
                    if (zF4 || objK5 == f1.n.f5051a) {
                        objK5 = new r0(kVar3, x0Var, this.f223c, b1Var7, h1Var);
                        sVar3.h0(objK5);
                    }
                    sVar3.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK5, sVar3, 6, 6);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                h9.n nVar = (h9.n) this.f222b;
                f1.b1 b1Var8 = (f1.b1) this.f225e;
                f1.b1 b1Var9 = (f1.b1) this.f224d;
                if ((iIntValue2 & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    f1.b1 b1Var10 = this.f223c;
                    File[] fileArr = (File[]) b1Var10.getValue();
                    ArrayList arrayList2 = new ArrayList(fileArr.length);
                    for (File file : fileArr) {
                        String name = file.getName();
                        i9.l.d(name, "getName(...)");
                        l8.l0 l0Var = new l8.l0(file.hashCode());
                        String path = file.getPath();
                        i9.l.d(path, "getPath(...)");
                        arrayList2.add(new l8.j0(name, l0Var, path, null, null, 24));
                    }
                    n1.c cVarE = n1.h.e(-1112569037, new w0((n8.q) this.f226f, b1Var10, b1Var9, b1Var8, 0), sVar4);
                    sVar4.W(-1746271574);
                    boolean zF5 = sVar4.f(nVar);
                    Object objK6 = sVar4.K();
                    if (zF5 || objK6 == f1.n.f5051a) {
                        objK6 = new u0(nVar, b1Var8, b1Var9, 0);
                        sVar4.h0(objK6);
                    }
                    sVar4.p(false);
                    g5.a.c(arrayList2, null, 1, cVarE, 0.0f, 0.0f, (h9.k) objK6, sVar4, 3456, 50);
                }
                break;
            case 4:
                final l1 l1Var = (l1) this.f226f;
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    sVar5.W(-1224400529);
                    boolean zF6 = sVar5.f((h9.k) this.f222b) | sVar5.f(l1Var);
                    final h9.k kVar4 = (h9.k) this.f222b;
                    final f1.b1 b1Var11 = (f1.b1) this.f224d;
                    final f1.b1 b1Var12 = (f1.b1) this.f225e;
                    Object objK7 = sVar5.K();
                    if (zF6 || objK7 == f1.n.f5051a) {
                        final int i10 = 1;
                        final f1.b1 b1Var13 = this.f223c;
                        objK7 = new h9.a(kVar4, l1Var, b1Var13, b1Var11, b1Var12, i10) { // from class: a8.r

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f209a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ h9.k f210b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f211c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f212d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f213e;

                            {
                                this.f209a = i10;
                                this.f211c = b1Var13;
                                this.f212d = b1Var11;
                                this.f213e = b1Var12;
                            }

                            @Override // h9.a
                            public final Object invoke() {
                                int i11 = this.f209a;
                                t8.z zVar = t8.z.f12851a;
                                f1.b1 b1Var14 = this.f213e;
                                f1.b1 b1Var15 = this.f212d;
                                f1.b1 b1Var16 = this.f211c;
                                h9.k kVar5 = this.f210b;
                                switch (i11) {
                                    case 0:
                                        if (((String) b1Var16.getValue()).length() == 0 || ((String) b1Var15.getValue()).length() == 0) {
                                            hc.c cVar2 = n8.c.f8897a;
                                            n8.c.j(0, "请先选择应用包名及活动");
                                        } else {
                                            kVar5.invoke(new m2("AppOpen", "打开应用", ob.a.q("打开 ", (String) b1Var14.getValue()), new b8.g((String) b1Var16.getValue(), (String) b1Var15.getValue())));
                                        }
                                        break;
                                    case 1:
                                        if (((String) b1Var16.getValue()).length() == 0) {
                                            hc.c cVar3 = n8.c.f8897a;
                                            n8.c.j(0, "名称不能为空");
                                        } else if (((String) b1Var15.getValue()).length() >= 8) {
                                            kVar5.invoke(new m2("Hotspot", "热点开关", (((Boolean) b1Var14.getValue()).booleanValue() ? "打开" : "关闭").concat("热点"), new b8.r0((String) b1Var16.getValue(), (String) b1Var15.getValue(), ((Boolean) b1Var14.getValue()).booleanValue())));
                                        } else {
                                            hc.c cVar4 = n8.c.f8897a;
                                            n8.c.j(0, "密码不能少于8位");
                                        }
                                        break;
                                    default:
                                        if (((String) b1Var16.getValue()).length() != 0) {
                                            kVar5.invoke(new m2("LogLine", "系统日志", "关键字: " + ((String) b1Var15.getValue()) + " 监听: " + ((String) b1Var16.getValue()), new b8.x0((String) b1Var16.getValue(), (String) b1Var15.getValue(), ((Boolean) b1Var14.getValue()).booleanValue())));
                                        } else {
                                            hc.c cVar5 = n8.c.f8897a;
                                            n8.c.j(0, "按键映射不能为空");
                                        }
                                        break;
                                }
                                return zVar;
                            }
                        };
                        sVar5.h0(objK7);
                    }
                    sVar5.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK7, sVar5, 6, 6);
                }
                break;
            case 5:
                n2 n2Var = (n2) this.f226f;
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    sVar6.W(-1224400529);
                    boolean zF7 = sVar6.f((h9.k) this.f222b) | sVar6.h(n2Var);
                    h9.k kVar5 = (h9.k) this.f222b;
                    f1.b1 b1Var14 = (f1.b1) this.f224d;
                    f1.b1 b1Var15 = (f1.b1) this.f225e;
                    Object objK8 = sVar6.K();
                    if (zF7 || objK8 == f1.n.f5051a) {
                        objK8 = new v0(kVar5, n2Var, this.f223c, b1Var14, b1Var15, 1);
                        sVar6.h0(objK8);
                    }
                    sVar6.p(false);
                    i2.c.l("保存", 0L, 0L, (h9.a) objK8, sVar6, 6, 6);
                }
                break;
            case 6:
                e8.t0 t0Var = (e8.t0) this.f226f;
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    sVar7.W(-1224400529);
                    boolean zF8 = sVar7.f((h9.k) this.f222b) | sVar7.f(t0Var);
                    h9.k kVar6 = (h9.k) this.f222b;
                    f1.h1 h1Var2 = (f1.h1) this.f225e;
                    f1.b1 b1Var16 = (f1.b1) this.f224d;
                    Object objK9 = sVar7.K();
                    if (zF8 || objK9 == f1.n.f5051a) {
                        objK9 = new r0(kVar6, t0Var, this.f223c, h1Var2, b1Var16);
                        sVar7.h0(objK9);
                    }
                    sVar7.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK9, sVar7, 6, 6);
                }
                break;
            case 7:
                final e8.y0 y0Var = (e8.y0) this.f226f;
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    sVar8.W(-1224400529);
                    boolean zF9 = sVar8.f((h9.k) this.f222b) | sVar8.f(y0Var);
                    final h9.k kVar7 = (h9.k) this.f222b;
                    final f1.b1 b1Var17 = (f1.b1) this.f224d;
                    final f1.b1 b1Var18 = (f1.b1) this.f225e;
                    Object objK10 = sVar8.K();
                    if (zF9 || objK10 == f1.n.f5051a) {
                        final int i11 = 2;
                        final f1.b1 b1Var19 = this.f223c;
                        objK10 = new h9.a(kVar7, y0Var, b1Var19, b1Var17, b1Var18, i11) { // from class: a8.r

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f209a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ h9.k f210b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f211c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f212d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ f1.b1 f213e;

                            {
                                this.f209a = i11;
                                this.f211c = b1Var19;
                                this.f212d = b1Var17;
                                this.f213e = b1Var18;
                            }

                            @Override // h9.a
                            public final Object invoke() {
                                int i12 = this.f209a;
                                t8.z zVar = t8.z.f12851a;
                                f1.b1 b1Var110 = this.f213e;
                                f1.b1 b1Var111 = this.f212d;
                                f1.b1 b1Var112 = this.f211c;
                                h9.k kVar8 = this.f210b;
                                switch (i12) {
                                    case 0:
                                        if (((String) b1Var112.getValue()).length() == 0 || ((String) b1Var111.getValue()).length() == 0) {
                                            hc.c cVar2 = n8.c.f8897a;
                                            n8.c.j(0, "请先选择应用包名及活动");
                                        } else {
                                            kVar8.invoke(new m2("AppOpen", "打开应用", ob.a.q("打开 ", (String) b1Var110.getValue()), new b8.g((String) b1Var112.getValue(), (String) b1Var111.getValue())));
                                        }
                                        break;
                                    case 1:
                                        if (((String) b1Var112.getValue()).length() == 0) {
                                            hc.c cVar3 = n8.c.f8897a;
                                            n8.c.j(0, "名称不能为空");
                                        } else if (((String) b1Var111.getValue()).length() >= 8) {
                                            kVar8.invoke(new m2("Hotspot", "热点开关", (((Boolean) b1Var110.getValue()).booleanValue() ? "打开" : "关闭").concat("热点"), new b8.r0((String) b1Var112.getValue(), (String) b1Var111.getValue(), ((Boolean) b1Var110.getValue()).booleanValue())));
                                        } else {
                                            hc.c cVar4 = n8.c.f8897a;
                                            n8.c.j(0, "密码不能少于8位");
                                        }
                                        break;
                                    default:
                                        if (((String) b1Var112.getValue()).length() != 0) {
                                            kVar8.invoke(new m2("LogLine", "系统日志", "关键字: " + ((String) b1Var111.getValue()) + " 监听: " + ((String) b1Var112.getValue()), new b8.x0((String) b1Var112.getValue(), (String) b1Var111.getValue(), ((Boolean) b1Var110.getValue()).booleanValue())));
                                        } else {
                                            hc.c cVar5 = n8.c.f8897a;
                                            n8.c.j(0, "按键映射不能为空");
                                        }
                                        break;
                                }
                                return zVar;
                            }
                        };
                        sVar8.h0(objK10);
                    }
                    sVar8.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK10, sVar8, 6, 6);
                }
                break;
            case 8:
                e8.h1 h1Var3 = (e8.h1) this.f226f;
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    sVar9.W(-1224400529);
                    boolean zF10 = sVar9.f((h9.k) this.f222b) | sVar9.h(h1Var3);
                    h9.k kVar8 = (h9.k) this.f222b;
                    f1.b1 b1Var20 = (f1.b1) this.f224d;
                    f1.b1 b1Var21 = (f1.b1) this.f225e;
                    Object objK11 = sVar9.K();
                    if (zF10 || objK11 == f1.n.f5051a) {
                        objK11 = new v0(kVar8, h1Var3, this.f223c, b1Var20, b1Var21, 2);
                        sVar9.h0(objK11);
                    }
                    sVar9.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK11, sVar9, 6, 6);
                }
                break;
            case 9:
                t8.j jVar = (t8.j) this.f226f;
                f1.s sVar10 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    sVar10.W(-1224400529);
                    boolean zF11 = sVar10.f(jVar) | sVar10.f((h9.k) this.f222b);
                    h9.k kVar9 = (h9.k) this.f222b;
                    f1.b1 b1Var22 = (f1.b1) this.f224d;
                    f1.b1 b1Var23 = (f1.b1) this.f225e;
                    Object objK12 = sVar10.K();
                    if (zF11 || objK12 == f1.n.f5051a) {
                        objK12 = new v0(jVar, kVar9, this.f223c, b1Var22, b1Var23, 3);
                        sVar10.h0(objK12);
                    }
                    sVar10.p(false);
                    i2.c.l("保存", 0L, 0L, (h9.a) objK12, sVar10, 6, 6);
                }
                break;
            default:
                f1.s sVar11 = (f1.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (sVar11.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r1.p pVar = (r1.p) this.f222b;
                    Object objK13 = sVar11.K();
                    if (objK13 == f1.n.f5051a) {
                        objK13 = new f8.h(this.f223c, 4);
                        sVar11.h0(objK13);
                    }
                    r1.p pVarD = androidx.compose.ui.layout.a.d(pVar, (h9.k) objK13);
                    n1.c cVar2 = (n1.c) this.f226f;
                    s0.c cVar3 = (s0.c) this.f224d;
                    h9.a aVar = (h9.a) this.f225e;
                    o2.m0 m0VarD = d0.m.d(r1.c.f11092a, true);
                    long j5 = sVar11.T;
                    int i12 = (int) (j5 ^ (j5 >>> 32));
                    f1.q1 q1VarL = sVar11.l();
                    r1.p pVarC = r1.a.c(sVar11, pVarD);
                    q2.j.f10719d0.getClass();
                    q2.a0 a0Var = q2.i.f10705b;
                    sVar11.a0();
                    if (sVar11.S) {
                        sVar11.k(a0Var);
                    } else {
                        sVar11.k0();
                    }
                    f1.b.w(sVar11, q2.i.f10708e, m0VarD);
                    f1.b.w(sVar11, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar11.S || !i9.l.a(sVar11.K(), Integer.valueOf(i12))) {
                        ob.a.w(i12, sVar11, i12, hVar);
                    }
                    f1.b.w(sVar11, q2.i.f10706c, pVarC);
                    cVar2.invoke(sVar11, 0);
                    cVar3.b(aVar, sVar11, 6);
                    sVar11.p(true);
                } else {
                    sVar11.Q();
                }
                break;
        }
        return t8.z.f12851a;
    }
}
