package yb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import u8.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15263c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f15261a = i7;
        this.f15263c = obj;
        this.f15262b = obj2;
    }

    @Override // yb.j
    public final Iterator iterator() {
        switch (this.f15261a) {
            case 0:
                return new b(((j) this.f15263c).iterator(), (h9.k) this.f15262b);
            case 1:
                return new l1.c(this);
            default:
                c cVar = (c) this.f15263c;
                ArrayList arrayList = new ArrayList();
                Iterator it = cVar.iterator();
                while (true) {
                    u8.b bVar = (u8.b) it;
                    if (!bVar.hasNext()) {
                        t.b0(arrayList, (Comparator) this.f15262b);
                        return arrayList.iterator();
                    }
                    arrayList.add(bVar.next());
                }
                break;
        }
    }
}
