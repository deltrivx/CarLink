package y7;

import com.baidu.carlife.sdk.util.Logger;
import f1.b1;
import f1.n;
import f1.s;
import f1.w1;
import i9.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import t8.j;
import t8.m;
import u8.b0;
import u8.p;
import u8.x;
import v7.f;
import v7.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f15101a = h.f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15102b = f.Settings;

    @Override // v7.e
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [t8.l] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // v7.e
    public final void b(int i7, s sVar) {
        Object objB;
        sVar.Y(861690342);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            if (objK == n.f5051a) {
                try {
                    ServiceLoader serviceLoaderLoad = ServiceLoader.load(v7.e.class);
                    l.d(serviceLoaderLoad, "load(...)");
                    yb.h hVar = new yb.h(p.f0(serviceLoaderLoad), true, new b(1));
                    b bVar = b.f15098b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    yb.b bVar2 = new yb.b(hVar.iterator(), bVar);
                    while (bVar2.hasNext()) {
                        Object next = bVar2.next();
                        v7.e eVar = (v7.e) next;
                        j jVar = new j(eVar.g(), Integer.valueOf(eVar.e()));
                        Object arrayList = linkedHashMap.get(jVar);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(jVar, arrayList);
                        }
                        ((List) arrayList).add(next);
                    }
                    List<j> listE0 = p.E0(b0.Y0(linkedHashMap), new c(0));
                    objB = new LinkedHashMap();
                    for (j jVar2 : listE0) {
                        objB.put(((j) jVar2.f12830a).f12830a, p.E0((List) jVar2.f12831b, new c(1)));
                    }
                } catch (Throwable th) {
                    objB = t8.a.b(th);
                }
                Throwable thA = m.a(objB);
                Object obj = objB;
                if (thA != null) {
                    Logger.INSTANCE.e("OptionLoader", ob.a.q("模块加载失败: ", thA.getMessage()));
                    obj = x.f13123a;
                }
                objK = f1.b.s((Map) obj);
                sVar.h0(objK);
            }
            sVar.p(false);
            for (Map.Entry entry : ((Map) ((b1) objK).getValue()).entrySet()) {
                g5.a.b((String) entry.getKey(), n1.h.e(304208298, new z7.h(1, (List) entry.getValue()), sVar), sVar, 48, 0);
            }
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a(i7, 0, this);
        }
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        n3.l.c(sVar);
    }

    @Override // v7.e
    public final h d() {
        return this.f15101a;
    }

    @Override // v7.e
    public final int e() {
        return 0;
    }

    @Override // v7.e
    public final int f() {
        return 999;
    }

    @Override // v7.e
    public final String g() {
        return "";
    }

    @Override // v7.e
    public final f h() {
        return this.f15102b;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        n3.l.g(sVar);
    }
}
