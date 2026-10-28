package z7;

import f1.s;
import h9.n;
import java.util.Iterator;
import java.util.List;
import t8.z;
import u8.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15756b;

    public /* synthetic */ h(int i7, List list) {
        this.f15755a = i7;
        this.f15756b = list;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15755a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    List list = this.f15756b;
                    i2.c.m((String) p.k0(list), null, sVar, 0, 2);
                    i2.c.p((String) p.s0(list), sVar, 0);
                }
                break;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    Iterator it = this.f15756b.iterator();
                    while (it.hasNext()) {
                        ((v7.e) it.next()).i(0, sVar2);
                    }
                }
                break;
        }
        return z.f12851a;
    }
}
