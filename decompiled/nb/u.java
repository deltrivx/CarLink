package nb;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9040b;

    public /* synthetic */ u(int i7, Object obj) {
        this.f9039a = i7;
        this.f9040b = obj;
    }

    public u(Comparator comparator) {
        this.f9039a = 2;
        this.f9040b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9039a) {
            case 0:
                w wVar = (w) obj;
                h9.k kVar = (h9.k) this.f9040b;
                i9.l.b(wVar);
                String string = kVar.invoke(wVar).toString();
                w wVar2 = (w) obj2;
                i9.l.b(wVar2);
                return n3.n.X(string, kVar.invoke(wVar2).toString());
            case 1:
                long jLongValue = ((Number) obj).longValue();
                s.y yVar = (s.y) this.f9040b;
                return n3.n.X(Integer.valueOf(yVar.c(jLongValue)), Integer.valueOf(yVar.c(((Number) obj2).longValue())));
            case 2:
                int iCompare = ((Comparator) this.f9040b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return q2.h0.S.compare(((y2.m) obj).f15019c, ((y2.m) obj2).f15019c);
            default:
                int iCompare2 = ((u) this.f9040b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : n3.n.X(Integer.valueOf(((y2.m) obj).f15023g), Integer.valueOf(((y2.m) obj2).f15023g));
        }
    }
}
