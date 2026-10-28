package w0;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13755b;

    public /* synthetic */ c1(int i7, Object obj) {
        this.f13754a = i7;
        this.f13755b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13754a) {
            case 0:
                return ((Number) ((b3.a) this.f13755b).invoke(obj, obj2)).intValue();
            case 1:
                for (h9.k kVar : (h9.k[]) this.f13755b) {
                    int iX = n3.n.X((Comparable) kVar.invoke(obj), (Comparable) kVar.invoke(obj2));
                    if (iX != 0) {
                        return iX;
                    }
                }
                return 0;
            default:
                return ((Number) ((h9.n) this.f13755b).invoke(obj, obj2)).intValue();
        }
    }
}
