package e8;

import b8.m2;
import b8.n2;
import cc.o1;
import com.baidu.carlife.sdk.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8.s f4656a;

    public x0(n8.s sVar) {
        this.f4656a = sVar;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            u8.u.c0(((n2) it.next()).f1625c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m2) it2.next()).f1617d);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof b8.x0) {
                arrayList3.add(obj2);
            }
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        t8.z zVar = t8.z.f12851a;
        n8.s sVar = this.f4656a;
        if (zIsEmpty) {
            o1 o1Var = sVar.f8943b;
            if (o1Var != null) {
                o1Var.a(null);
            }
            sVar.f8943b = null;
            return zVar;
        }
        try {
            sVar.a(null, new w0(0, arrayList3));
            return zVar;
        } catch (Exception e7) {
            hc.c cVar2 = n8.c.f8897a;
            n8.c.j(0, "不支持日志监听");
            Logger.INSTANCE.e("CarLife_Vehicle", e7.getMessage(), e7);
            return zVar;
        }
    }
}
