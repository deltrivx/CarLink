package za;

import java.util.Comparator;
import n3.n;
import x9.k0;
import x9.q0;
import x9.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f15792b = new g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15793a;

    public /* synthetic */ g(int i7) {
        this.f15793a = i7;
    }

    public static int a(x9.k kVar) {
        if (d.m(kVar)) {
            return 8;
        }
        if (kVar instanceof x9.j) {
            return 7;
        }
        if (kVar instanceof k0) {
            return ((k0) kVar).e0() == null ? 6 : 5;
        }
        if (kVar instanceof t) {
            return ((t) kVar).e0() == null ? 4 : 3;
        }
        if (kVar instanceof x9.e) {
            return 2;
        }
        return kVar instanceof q0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f15793a) {
            case 0:
                x9.k kVar = (x9.k) obj;
                x9.k kVar2 = (x9.k) obj2;
                int iA = a(kVar2) - a(kVar);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (d.m(kVar) && d.m(kVar2)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = kVar.getName().f14247a.compareTo(kVar2.getName().f14247a);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return n.X(db.e.g((x9.e) obj).f14240a.f14243a, db.e.g((x9.e) obj2).f14240a.f14243a);
        }
    }
}
