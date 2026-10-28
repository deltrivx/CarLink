package t7;

import com.baidu.carlife.sdk.util.Logger;
import f1.b1;
import f1.n;
import f1.s;
import f1.w0;
import f1.w1;
import i9.l;
import i9.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import o7.o;
import t8.m;
import u8.p;
import u8.w;
import v7.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12813c;

    public f() throws IOException {
        Object objB;
        List list = w.f13122a;
        this.f12811a = "显示设置";
        this.f12812b = 2;
        try {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(g.class);
            l.d(serviceLoaderLoad, "load(...)");
            yb.b bVar = new yb.b(p.f0(serviceLoaderLoad).iterator(), e.f12808b);
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
                objB = list;
            }
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        Throwable thA = m.a(objB);
        if (thA != null) {
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("模块加载失败: ", thA.getMessage()));
            objB = list;
        }
        List list2 = (List) objB;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            String name = ((g) obj).getName();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add(obj);
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
            String str = (String) entry2.getKey();
            List list3 = (List) entry2.getValue();
            Logger.INSTANCE.e("CarLife_Vehicle", y.f6689a.b(g.class).l() + " 中 name 重复：'" + str + "'，模块：" + p.q0(list3, null, null, null, e.f12809c, 31));
        } else {
            list = list2;
        }
        this.f12813c = list;
    }

    @Override // v7.e
    public final void a() {
        Iterator it = this.f12813c.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        n3.l.d(sVar);
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        sVar.Y(1199684095);
        if ((((sVar.h(this) ? 4 : 2) | i7) & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            Iterator it = this.f12813c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).c(0, sVar);
            }
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c(this, i7, 0);
        }
    }

    @Override // v7.e
    public final h d() {
        return h.f13652c;
    }

    @Override // v7.e
    public final int e() {
        return this.f12812b;
    }

    @Override // v7.e
    public final int f() {
        return 999;
    }

    @Override // v7.e
    public final String g() {
        return this.f12811a;
    }

    @Override // v7.e
    public final v7.f h() {
        return v7.f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        sVar.Y(1535326716);
        if ((((sVar.h(this) ? 4 : 2) | i7) & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVar = b.f12799a;
            n1.c cVar2 = b.f12800b;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o(b1Var, 9);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVar, cVar2, false, (h9.a) objK2, sVar, 3510, 0);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new o(b1Var, 10);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, b.f12802d, null, null, null, n1.h.e(2071201189, new d(this, 1), sVar), sVar, 1572912, 956);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c(this, i7, 1);
        }
    }
}
