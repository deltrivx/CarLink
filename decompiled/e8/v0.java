package e8;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import b8.p2;
import b8.q2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4640e;

    public /* synthetic */ v0(f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, f1.b1 b1Var4, int i7) {
        this.f4636a = i7;
        this.f4637b = b1Var;
        this.f4638c = b1Var2;
        this.f4639d = b1Var3;
        this.f4640e = b1Var4;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4636a;
        f1.b1 b1Var = this.f4640e;
        f1.b1 b1Var2 = this.f4639d;
        f1.b1 b1Var3 = this.f4638c;
        f1.w0 w0Var = f1.n.f5051a;
        f1.b1 b1Var4 = this.f4637b;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f820a;
                    float f10 = 4;
                    r1.p pVarK = androidx.compose.foundation.layout.a.k(fillElement, 0.0f, f10, 0.0f, f10, 5);
                    String str = (String) b1Var4.getValue();
                    sVar.W(5004770);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        objK = new a8.u(b1Var4, 20);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    c1.b1.a(str, (h9.k) objK, pVarK, false, null, g.f4540a, null, false, null, null, null, false, 5, 0, null, null, sVar, 1573296, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR, 8126392);
                    r1.p pVarK2 = androidx.compose.foundation.layout.a.k(fillElement, 0.0f, f10, 0.0f, f10, 5);
                    String str2 = (String) b1Var3.getValue();
                    sVar.W(5004770);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new a8.u(b1Var3, 21);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    c1.b1.a(str2, (h9.k) objK2, pVarK2, false, null, g.f4541b, n1.h.e(-182162347, new a8.w(b1Var2, 25), sVar), false, null, null, null, true, 0, 0, null, null, sVar, 806879664, 12582912, 8256952);
                    boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
                    sVar.W(5004770);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new a8.k(b1Var2, 28);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(1520444318, new a8.q(b1Var3, b1Var2, 1), sVar), sVar, 48, 1020);
                    List listJ = n3.l.J("忽略大小写", "是否忽略大小写");
                    List listJ2 = n3.l.J(new l8.j0("忽略", new l8.k0(true), null, null, null, 28), new l8.j0("不忽略", new l8.k0(false), null, null, null, 28));
                    sVar.W(5004770);
                    Object objK4 = sVar.K();
                    if (objK4 == w0Var) {
                        objK4 = new a8.u(b1Var, 22);
                        sVar.h0(objK4);
                    }
                    sVar.p(false);
                    k9.a.d(listJ, listJ2, null, 0, false, (h9.k) objK4, sVar, ServiceTypes.MSG_MEDIA_DATA, 28);
                    w7.f.f14170a.e(n3.l.J("系统日志权限", "监听系统日志需要开启此权限"), "android.permission.READ_LOGS", "获取系统日志权限需要执行下方Adb命令, 执行完毕后退出应用重新打开即可", false, sVar, 25014);
                    i2.c.j(n3.l.I("日志中若有变化的数字需要手动删除,只保留关键部分"), sVar, 6);
                }
                return zVar;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, n1.h.e(1965674855, new v0(this.f4637b, this.f4638c, this.f4639d, this.f4640e, 0), sVar2), sVar2, 48, 1);
                }
                return zVar;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    sVar3.W(1849434622);
                    Object objK5 = sVar3.K();
                    if (objK5 == w0Var) {
                        p2 p2Var = q2.Companion;
                        p2Var.getClass();
                        try {
                            InputStream inputStreamOpen = ((Context) q2.f1637e.getValue()).getAssets().open("region_location.json");
                            i9.l.d(inputStreamOpen, "open(...)");
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, zb.a.f15804a), ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
                            try {
                                String strR = i2.c.R(bufferedReader);
                                bufferedReader.close();
                                qc.b bVar = qc.b.f11032d;
                                bVar.getClass();
                                objK5 = (List) bVar.a(new pc.c(p2Var.serializer()), strR);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    g5.a.m(bufferedReader, th);
                                    throw th2;
                                }
                            }
                        } catch (Exception e7) {
                            Logger.INSTANCE.e("ThemeRegion", ob.a.q("加载 region_location.json 出错: ", e7.getMessage()));
                            objK5 = n3.l.I(new q2());
                        }
                        sVar3.h0(objK5);
                    }
                    List list = (List) objK5;
                    Object objC = a2.f.C(sVar3, false, 1849434622);
                    if (objC == w0Var) {
                        objC = f1.b.s(new t8.j("", ""));
                        sVar3.h0(objC);
                    }
                    f1.b1 b1Var5 = (f1.b1) objC;
                    sVar3.p(false);
                    List listJ3 = n3.l.J("选择省份", "当前所在省份");
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (hashSet.add(((q2) obj3).f1638a)) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str3 = ((q2) it.next()).f1638a;
                        arrayList2.add(new l8.j0(str3, new l8.m0(str3), null, null, null, 28));
                    }
                    sVar3.W(5004770);
                    Object objK6 = sVar3.K();
                    if (objK6 == w0Var) {
                        objK6 = new a8.u(b1Var4, 25);
                        sVar3.h0(objK6);
                    }
                    sVar3.p(false);
                    k9.a.d(listJ3, arrayList2, null, 0, false, (h9.k) objK6, sVar3, ServiceTypes.MSG_MEDIA_DATA, 28);
                    int i10 = f1.f4534f;
                    sVar3.U(-1171804815, (String) b1Var4.getValue());
                    List listJ4 = n3.l.J("选择市区", "设置后可自动获取日出日落时间");
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list) {
                        if (i9.l.a(((q2) obj4).f1638a, (String) b1Var4.getValue())) {
                            arrayList3.add(obj4);
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList<q2> arrayList4 = new ArrayList();
                    for (Object obj5 : arrayList3) {
                        if (hashSet2.add(((q2) obj5).f1639b)) {
                            arrayList4.add(obj5);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(u8.q.a0(arrayList4, 10));
                    for (q2 q2Var : arrayList4) {
                        String str4 = q2Var.f1639b;
                        arrayList5.add(new l8.j0(str4, new l8.m0(str4), q2Var.f1640c + "|" + q2Var.f1641d, null, null, 24));
                        sVar3 = sVar3;
                    }
                    sVar3.W(-1746271574);
                    Object objK7 = sVar3.K();
                    if (objK7 == w0Var) {
                        objK7 = new l(3, b1Var3, b1Var2, b1Var5);
                        sVar3.h0(objK7);
                    }
                    sVar3.p(false);
                    k9.a.d(listJ4, arrayList5, null, 0, false, (h9.k) objK7, sVar3, ServiceTypes.MSG_MEDIA_DATA, 28);
                    sVar3.p(false);
                    List listJ5 = n3.l.J("触发条件", "选择触发条件");
                    List listJ6 = n3.l.J(new l8.j0("日出至日落", new l8.k0(true), null, null, null, 28), new l8.j0("日落至日出", new l8.k0(false), null, null, null, 28));
                    sVar3.W(5004770);
                    Object objK8 = sVar3.K();
                    if (objK8 == w0Var) {
                        objK8 = new a8.u(b1Var, 26);
                        sVar3.h0(objK8);
                    }
                    sVar3.p(false);
                    k9.a.d(listJ5, listJ6, null, 0, false, (h9.k) objK8, sVar3, ServiceTypes.MSG_MEDIA_DATA, 28);
                    i2.c.j(n3.l.I("日出: " + ((t8.j) b1Var5.getValue()).f12830a + " 日落: " + ((t8.j) b1Var5.getValue()).f12831b), sVar3, 0);
                }
                return zVar;
            default:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, n1.h.e(401014815, new v0(this.f4637b, this.f4638c, this.f4639d, this.f4640e, 2), sVar4), sVar4, 48, 1);
                }
                return zVar;
        }
    }
}
