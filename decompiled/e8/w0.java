package e8;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4647b;

    public /* synthetic */ w0(int i7, ArrayList arrayList) {
        this.f4646a = i7;
        this.f4647b = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    @Override // h9.k
    public final Object invoke(Object obj) {
        Object next;
        b8.x0 x0Var;
        b8.x0 x0Var2;
        int i7 = this.f4646a;
        t8.z zVar = t8.z.f12851a;
        ArrayList arrayList = this.f4647b;
        switch (i7) {
            case 0:
                String str = (String) obj;
                i9.l.e(str, "line");
                if (!zb.j.r0(str, "任务触发", false)) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            x0Var2 = (b8.x0) next;
                        } else {
                            next = null;
                        }
                        x0Var = (b8.x0) next;
                        if (x0Var != null) {
                            hc.c cVar = d8.v.f3842a;
                            d8.v.a(new b8.x0(x0Var.f1666b, x0Var.f1667c, x0Var.f1668d));
                        }
                        break;
                    } while (!zb.j.r0(str, x0Var2.f1666b, x0Var2.f1668d));
                    x0Var = (b8.x0) next;
                    if (x0Var != null) {
                        hc.c cVar2 = d8.v.f3842a;
                        d8.v.a(new b8.x0(x0Var.f1666b, x0Var.f1667c, x0Var.f1668d));
                    }
                }
                break;
            default:
                o2.u0 u0Var = (o2.u0) obj;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    o2.u0.f(u0Var, (o2.v0) arrayList.get(i10), 0, 0);
                }
                break;
        }
        return zVar;
    }
}
