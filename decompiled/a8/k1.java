package a8;

import androidx.compose.foundation.layout.FillElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.h2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f162d;

    public /* synthetic */ k1(int i7, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3) {
        this.f159a = i7;
        this.f160b = b1Var;
        this.f161c = b1Var2;
        this.f162d = b1Var3;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f159a;
        int i10 = 4;
        f1.w0 w0Var = f1.n.f5051a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f162d;
        f1.b1 b1Var2 = this.f161c;
        f1.b1 b1Var3 = this.f160b;
        int i11 = 0;
        int i12 = 1;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(-1746271574);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        objK = new j1((Object) b1Var3, (Object) b1Var2, (Object) b1Var, i11);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    i2.c.o("测试", (h9.a) objK, sVar, 54);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    w7.f.f14170a.f(n3.l.J("后台定位", "可能需要开启此权限"), n3.l.J(x6.a.b(), x6.a.c(), x6.a.a()), false, sVar2, 3078, 4);
                    List listJ = n3.l.J("热点开关", "选择热点开关");
                    List listJ2 = n3.l.J(new l8.j0("打开热点", new l8.k0(true), null, null, null, 28), new l8.j0("关闭热点", new l8.k0(false), null, null, null, 28));
                    sVar2.W(5004770);
                    Object objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = new u(b1Var3, 5);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    k9.a.d(listJ, listJ2, null, 0, false, (h9.k) objK2, sVar2, ServiceTypes.MSG_MEDIA_DATA, 28);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
                    float f10 = 4;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(fillElement, 0.0f, f10, 0.0f, f10, 5);
                    String str = (String) b1Var2.getValue();
                    sVar2.W(5004770);
                    Object objK3 = sVar2.K();
                    int i13 = 6;
                    if (objK3 == w0Var) {
                        objK3 = new u(b1Var2, i13);
                        sVar2.h0(objK3);
                    }
                    sVar2.p(false);
                    c1.b1.a(str, (h9.k) objK3, pVarK, false, null, f.f116a, null, false, null, null, null, true, 0, 0, null, null, sVar2, 1573296, 12582912, 8257464);
                    r1.p pVarK2 = androidx.compose.foundation.layout.a.k(fillElement, 0.0f, f10, 0.0f, 0, 5);
                    String str2 = (String) b1Var.getValue();
                    sVar2.W(5004770);
                    Object objK4 = sVar2.K();
                    if (objK4 == w0Var) {
                        objK4 = new u(b1Var, 7);
                        sVar2.h0(objK4);
                    }
                    sVar2.p(false);
                    c1.b1.a(str2, (h9.k) objK4, pVarK2, false, null, f.f117b, null, false, null, null, null, true, 0, 0, null, null, sVar2, 1573296, 12582912, 8257464);
                    i2.c.j(n3.l.I("热点开关可能无效"), sVar2, 6);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(900011597, new k1(i12, b1Var3, b1Var2, b1Var), sVar3), sVar3, 48, 1);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, n1.h.e(394047123, new w(b1Var3, 19), sVar4), sVar4, 48, 1);
                    float fN = g5.a.n(16, sVar4);
                    r1.m mVar = r1.m.f11116a;
                    d0.c.a(sVar4, androidx.compose.foundation.layout.c.b(mVar, fN));
                    g5.a.b(null, n1.h.e(-1007422582, new w(b1Var2, 20), sVar4), sVar4, 48, 1);
                    d0.c.a(sVar4, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(16, sVar4)));
                    g5.a.b(null, n1.h.e(-1367882293, new w(b1Var, 21), sVar4), sVar4, 48, 1);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    List listJ3 = n3.l.J("开始时间", "设置开始时间");
                    int i14 = e8.h1.f4551f;
                    String str3 = (String) b1Var3.getValue();
                    sVar5.W(5004770);
                    Object objK5 = sVar5.K();
                    if (objK5 == w0Var) {
                        objK5 = new u(b1Var3, 27);
                        sVar5.h0(objK5);
                    }
                    sVar5.p(false);
                    o9.e0.e(listJ3, str3, false, (h9.k) objK5, sVar5, 3078);
                    List listJ4 = n3.l.J("结束时间", "设置结束时间");
                    String str4 = (String) b1Var2.getValue();
                    sVar5.W(5004770);
                    Object objK6 = sVar5.K();
                    if (objK6 == w0Var) {
                        objK6 = new u(b1Var2, 28);
                        sVar5.h0(objK6);
                    }
                    sVar5.p(false);
                    o9.e0.e(listJ4, str4, false, (h9.k) objK6, sVar5, 3078);
                    String str5 = (String) b1Var3.getValue();
                    String str6 = (String) b1Var2.getValue();
                    h2 h2Var = sVar5.G;
                    int i15 = h2Var.f4976g;
                    Object objF = f1.t.f(i15 < h2Var.f4977h ? h2Var.p(h2Var.f4971b, i15) : null, str5, str6);
                    if (objF == null) {
                        objF = new f1.r0(str5, str6);
                    }
                    sVar5.U(-224952439, objF);
                    List listJ5 = n3.l.J("触发条件", "选择触发条件");
                    List listJ6 = n3.l.J(new l8.j0(((String) b1Var3.getValue()) + "-" + ((String) b1Var2.getValue()) + " 之内", new l8.k0(true), null, null, null, 28), new l8.j0(((String) b1Var3.getValue()) + "-" + ((String) b1Var2.getValue()) + " 之外", new l8.k0(false), null, null, null, 28));
                    sVar5.W(5004770);
                    Object objK7 = sVar5.K();
                    if (objK7 == w0Var) {
                        objK7 = new u(b1Var, 29);
                        sVar5.h0(objK7);
                    }
                    sVar5.p(false);
                    k9.a.d(listJ5, listJ6, null, 0, false, (h9.k) objK7, sVar5, 221190, 12);
                    sVar5.p(false);
                }
                break;
            default:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    g5.a.b(null, n1.h.e(1796411959, new k1(i10, b1Var3, b1Var2, b1Var), sVar6), sVar6, 48, 1);
                }
                break;
        }
        return zVar;
    }
}
