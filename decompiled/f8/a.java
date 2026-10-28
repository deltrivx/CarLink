package f8;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.compose.foundation.layout.FillElement;
import b3.b0;
import b3.i0;
import b8.f2;
import b8.s2;
import c1.u2;
import d0.q;
import f1.q1;
import f1.s;
import fc.h0;
import h9.n;
import i9.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l8.j0;
import l8.l0;
import m3.k;
import n3.r;
import q2.a0;
import r1.m;
import r1.p;
import t8.j;
import t8.o;
import t8.z;
import w0.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5462b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5463c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5464d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5465e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5466f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f5467g = new a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f5468h = new a(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f5469i = new a(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f5470j = new a(8);
    public static final a k = new a(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f5471l = new a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5472a;

    public /* synthetic */ a(int i7) {
        this.f5472a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        String str;
        c cVar;
        char c10;
        String str2;
        Signature[] apkContentsSigners;
        ArrayList arrayList;
        int i7 = this.f5472a;
        int i10 = 5;
        m mVar = m.f11116a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("查看", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                return zVar;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m("查看", null, sVar2, 6, 2);
                    i2.c.b(0, sVar2);
                }
                return zVar;
            case 2:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, d.f5482f, sVar3, 48, 1);
                }
                return zVar;
            case 3:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    o oVar = n8.h.f8903a;
                    j jVarE = n8.h.e();
                    int iIntValue = ((Number) jVarE.f12830a).intValue();
                    int iIntValue2 = ((Number) jVarE.f12831b).intValue();
                    c cVar2 = new c("设备ID", (String) n8.h.f8904b.getValue());
                    c cVar3 = new c("设备名称", (String) n8.h.f8905c.getValue());
                    c cVar4 = new c("分辨率", iIntValue + "x" + iIntValue2);
                    c cVar5 = new c("刷新率", ((Number) n8.h.f8909g.getValue()).floatValue() + "Hz");
                    c cVar6 = new c("像素密度", ((Number) n8.h.f8907e.getValue()).intValue() + "DPI");
                    c cVar7 = new c("缩放倍率", String.valueOf(((Number) n8.h.f8908f.getValue()).floatValue()));
                    int i11 = n8.a.b().getResources().getDisplayMetrics().densityDpi;
                    if (i11 == 120) {
                        str = "ldpi";
                    } else if (i11 == 160) {
                        str = "mdpi";
                    } else if (i11 == 240) {
                        str = "hdpi";
                    } else if (i11 == 320) {
                        str = "xhdpi";
                    } else if (i11 != 480) {
                        str = i11 != 640 ? "unknown" : "xxxhdpi";
                    } else {
                        str = "xxhdpi";
                    }
                    c cVar8 = new c("资源目录", str);
                    c cVar9 = new c("系统版本", ob.a.q("Android ", n8.h.f8906d));
                    c cVar10 = new c("内网IP", n8.h.a());
                    try {
                        PackageManager packageManager = n8.a.b().getPackageManager();
                        c10 = 0;
                        try {
                            int i12 = Build.VERSION.SDK_INT;
                            PackageInfo packageInfo = i12 >= 28 ? packageManager.getPackageInfo("android", 134217728) : packageManager.getPackageInfo("android", 64);
                            if (i12 >= 28) {
                                SigningInfo signingInfo = packageInfo.signingInfo;
                                apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                            } else {
                                apkContentsSigners = packageInfo.signatures;
                            }
                            if (apkContentsSigners != null) {
                                arrayList = new ArrayList();
                                int length = apkContentsSigners.length;
                                int i13 = 0;
                                while (i13 < length) {
                                    Signature signature = apkContentsSigners[i13];
                                    o oVar2 = n8.h.f8903a;
                                    Signature[] signatureArr = apkContentsSigners;
                                    byte[] byteArray = signature.toByteArray();
                                    cVar = cVar8;
                                    try {
                                        l.d(byteArray, "toByteArray(...)");
                                        String strF = n8.h.f(byteArray);
                                        if (strF != null) {
                                            arrayList.add(strF);
                                        }
                                        i13++;
                                        apkContentsSigners = signatureArr;
                                        cVar8 = cVar;
                                    } catch (Exception unused) {
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            cVar = cVar8;
                            if (arrayList == null || arrayList.isEmpty()) {
                                str2 = "非原生签名";
                            } else {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str3 = (String) it.next();
                                        if (str3 == null ? false : str3.equalsIgnoreCase("C8:A2:E9:BC:CF:59:7C:2F:B6:DC:66:BE:E2:93:FC:13:F2:FC:47:EC:77:BC:6B:2B:0D:52:C1:1F:51:19:2A:B8")) {
                                            str2 = "原生签名(公签)";
                                        }
                                    } else {
                                        str2 = "非原生签名";
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                            cVar = cVar8;
                        }
                    } catch (Exception unused3) {
                        cVar = cVar8;
                        c10 = 0;
                    }
                    c cVar11 = new c("系统签名", str2);
                    c[] cVarArr = new c[10];
                    cVarArr[c10] = cVar2;
                    cVarArr[1] = cVar3;
                    cVarArr[2] = cVar4;
                    cVarArr[3] = cVar5;
                    cVarArr[4] = cVar6;
                    cVarArr[5] = cVar7;
                    cVarArr[6] = cVar;
                    cVarArr[7] = cVar9;
                    cVarArr[8] = cVar10;
                    cVarArr[9] = cVar11;
                    List listJ = n3.l.J(cVarArr);
                    int i14 = 0;
                    for (Object obj3 : listJ) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            n3.l.Y();
                            throw null;
                        }
                        c cVar12 = (c) obj3;
                        a.a.h(n1.h.e(-2027456441, new b(cVar12, 0), sVar4), n1.h.e(265199526, new b(cVar12, 1), sVar4), i14 != n3.l.A(listJ), null, sVar4, 54, 8);
                        i14 = i15;
                    }
                }
                return zVar;
            case 4:
                s sVar5 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    d0.d dVar = d0.h.f3569d;
                    r1.f fVar = r1.c.f11104n;
                    p pVarJ = androidx.compose.foundation.layout.a.j(mVar, 0.0f, g5.a.n(16, sVar5), 1);
                    d0.s sVarA = q.a(dVar, fVar, sVar5, 54);
                    long j5 = sVar5.T;
                    int i16 = (int) (j5 ^ (j5 >>> 32));
                    q1 q1VarL = sVar5.l();
                    p pVarC = r1.a.c(sVar5, pVarJ);
                    q2.j.f10719d0.getClass();
                    a0 a0Var = q2.i.f10705b;
                    sVar5.a0();
                    if (sVar5.S) {
                        sVar5.k(a0Var);
                    } else {
                        sVar5.k0();
                    }
                    f1.b.w(sVar5, q2.i.f10708e, sVarA);
                    f1.b.w(sVar5, q2.i.f10707d, q1VarL);
                    q2.h hVar = q2.i.f10709f;
                    if (sVar5.S || !l.a(sVar5.K(), Integer.valueOf(i16))) {
                        ob.a.w(i16, sVar5, i16, hVar);
                    }
                    f1.b.w(sVar5, q2.i.f10706c, pVarC);
                    n8.q qVar = i.f5500b;
                    qVar.getClass();
                    String strQ = ob.a.q("打开浏览器下载: ", n8.q.j());
                    long jK = r.K(g5.a.n(22, sVar5), 4294967296L);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
                    u2.b(strQ, fillElement, 0L, jK, null, 0L, new k(3), 0L, 0, false, 0, 0, null, sVar5, 48, 0, 130548);
                    a2.f.L(16, sVar5, mVar, sVar5);
                    String absolutePath = qVar.k.getAbsolutePath();
                    l.d(absolutePath, "getAbsolutePath(...)");
                    u2.b("建议车机连接手机热点, 如果无法打开请手动下载: ".concat(zb.j.H0(absolutePath, "/storage/emulated/0/")), fillElement, 0L, r.K(g5.a.n(20, sVar5), 4294967296L), null, 0L, new k(3), 0L, 0, false, 0, 0, null, sVar5, 48, 0, 130548);
                    sVar5.p(true);
                }
                return zVar;
            case 5:
                s sVar6 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    g5.a.b(null, d.f5484h, sVar6, 48, 1);
                    a2.f.L(16, sVar6, mVar, sVar6);
                    g5.a.b(null, d.f5486j, sVar6, 48, 1);
                }
                return zVar;
            case 6:
                s sVar7 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    p pVarJ2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.c(mVar, 2.0f), 0.0f, g5.a.n(16, sVar7), 1);
                    hc.c cVar13 = n8.c.f8897a;
                    i.f5500b.getClass();
                    n3.n.C(new y1.f(n8.c.b(n8.q.j())), "二维码", pVarJ2, sVar7, 48, 248);
                }
                return zVar;
            case 7:
                s sVar8 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    i iVar = i.f5499a;
                    List listJ2 = n3.l.J("按键测试", "按键消息测试");
                    h0 h0Var = n8.q.f8931l;
                    iVar.e(listJ2, false, sVar8, 518);
                    iVar.c(n3.l.J("Material颜色", "Material颜色预览"), false, sVar8, 518);
                    iVar.a(n3.l.J("系统信息", "查看当前系统信息"), false, sVar8, 566);
                }
                return zVar;
            case 8:
                s sVar9 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    sVar9.W(1849434622);
                    Object objK = sVar9.K();
                    Object obj4 = f1.n.f5051a;
                    Object obj5 = objK;
                    if (objK == obj4) {
                        p1.p pVar = new p1.p();
                        pVar.add(new j0("断开连接", new l0(0), null, null, new i0(11), 12));
                        b9.b<s2> bVar = s2.f1651e;
                        ArrayList arrayList2 = new ArrayList(u8.q.a0(bVar, 10));
                        for (s2 s2Var : bVar) {
                            arrayList2.add(new j0(s2Var.f1652a, new l0(s2Var.f1653b), null, null, new a5.e(i10, s2Var), 12));
                        }
                        pVar.addAll(arrayList2);
                        b9.b<f2> bVar2 = f2.f1586f;
                        ArrayList arrayList3 = new ArrayList(u8.q.a0(bVar2, 10));
                        for (f2 f2Var : bVar2) {
                            arrayList3.add(new j0(f2Var.f1587a, new l0(f2Var.f1588b), null, null, null, 28));
                        }
                        pVar.addAll(arrayList3);
                        sVar9.h0(pVar);
                        obj5 = pVar;
                    }
                    p1.p pVar2 = (p1.p) obj5;
                    Object objC = a2.f.C(sVar9, false, 1849434622);
                    if (objC == obj4) {
                        objC = new b0(18);
                        sVar9.h0(objC);
                    }
                    sVar9.p(false);
                    g5.a.c(pVar2, null, 0, null, 0.0f, 0.0f, (h9.k) objC, sVar9, 1572870, 62);
                }
                return zVar;
            case 9:
                s sVar10 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    i iVar2 = i.f5499a;
                    List listJ3 = n3.l.J("运行日志记录", "点击扫码下载日志文件");
                    h0 h0Var2 = n8.q.f8931l;
                    iVar2.b(listJ3, false, false, sVar10, 32822);
                    g5.a.g(n3.l.J("异常日志上报", "需要有网才能上报日志"), new j("TEST_LOGS_UPLOAD", Boolean.TRUE), false, null, sVar10, 438, 8);
                }
                return zVar;
            default:
                s sVar11 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    y0.b(null, d.f5485i, sVar11, 48);
                }
                return zVar;
        }
    }
}
