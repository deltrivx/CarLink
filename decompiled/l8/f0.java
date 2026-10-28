package l8;

import com.baidu.carlife.sdk.util.Logger;
import f1.b1;
import f1.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f8149b;

    public /* synthetic */ f0(b1 b1Var, int i7) {
        this.f8148a = i7;
        this.f8149b = b1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        Object objB;
        int i7 = this.f8148a;
        w0 w0Var = f1.n.f5051a;
        t8.z zVar = t8.z.f12851a;
        b1 b1Var = this.f8149b;
        int i10 = 0;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    androidx.compose.material3.a.a(((Boolean) b1Var.getValue()).booleanValue(), null, null, false, null, sVar, 48);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    androidx.compose.material3.a.a(((Boolean) b1Var.getValue()).booleanValue(), null, null, false, null, sVar2, 48);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    sVar3.W(5004770);
                    Object objK = sVar3.K();
                    if (objK == w0Var) {
                        objK = new f0.k(b1Var, 28);
                        sVar3.h0(objK);
                    }
                    sVar3.p(false);
                    i2.c.o("取消", (h9.a) objK, sVar3, 54);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    sVar4.W(5004770);
                    Object objK2 = sVar4.K();
                    if (objK2 == w0Var) {
                        objK2 = new o7.o(b1Var, 1);
                        sVar4.h0(objK2);
                    }
                    sVar4.p(false);
                    i2.c.o("取消", (h9.a) objK2, sVar4, 54);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    sVar5.W(1849434622);
                    Object objK3 = sVar5.K();
                    if (objK3 == w0Var) {
                        objK3 = new p1.s();
                        sVar5.h0(objK3);
                    }
                    p1.s sVar6 = (p1.s) objK3;
                    sVar5.p(false);
                    v7.f fVar = (v7.f) b1Var.getValue();
                    Object obj3 = sVar6.get(fVar);
                    if (obj3 == null) {
                        try {
                            ServiceLoader serviceLoaderLoad = ServiceLoader.load(v7.e.class);
                            i9.l.d(serviceLoaderLoad, "load(...)");
                            objB = yb.l.U(new yb.c(2, new yb.c(0, new yb.h(u8.p.f0(serviceLoaderLoad), true, new v7.a(2)), v7.a.f13633b), new v7.b(i10)));
                        } catch (Throwable th) {
                            objB = t8.a.b(th);
                        }
                        Throwable thA = t8.m.a(objB);
                        if (thA != null) {
                            Logger.INSTANCE.e("OptionLoader", ob.a.q("模块加载失败: ", thA.getMessage()));
                            objB = u8.w.f13122a;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : (List) objB) {
                            if (((v7.e) obj4).h() == ((v7.f) b1Var.getValue())) {
                                arrayList.add(obj4);
                            }
                        }
                        sVar6.put(fVar, arrayList);
                        obj3 = arrayList;
                    }
                    Iterator it = ((List) obj3).iterator();
                    while (it.hasNext()) {
                        ((v7.e) it.next()).b(0, sVar5);
                    }
                }
                break;
            case 5:
                f1.s sVar7 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    i2.c.m((String) b1Var.getValue(), null, sVar7, 0, 2);
                    i2.c.b(0, sVar7);
                }
                break;
            case 6:
                f1.s sVar8 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    i2.c.m((String) b1Var.getValue(), null, sVar8, 0, 2);
                    i2.c.b(0, sVar8);
                }
                break;
            case 7:
                f1.s sVar9 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    i2.c.m((String) b1Var.getValue(), null, sVar9, 0, 2);
                    i2.c.b(0, sVar9);
                }
                break;
            default:
                f1.s sVar10 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    sVar10.W(5004770);
                    Object objK4 = sVar10.K();
                    if (objK4 == w0Var) {
                        objK4 = new o7.o(b1Var, 19);
                        sVar10.h0(objK4);
                    }
                    sVar10.p(false);
                    i2.c.o("关闭", (h9.a) objK4, sVar10, 54);
                }
                break;
        }
        return zVar;
    }
}
