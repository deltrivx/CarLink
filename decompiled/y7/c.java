package y7;

import java.util.Comparator;
import n3.n;
import t8.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15100a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15100a) {
            case 0:
                return n.X((Integer) ((j) ((j) obj).f12830a).f12831b, (Integer) ((j) ((j) obj2).f12830a).f12831b);
            default:
                return n.X(Integer.valueOf(((v7.e) obj).f()), Integer.valueOf(((v7.e) obj2).f()));
        }
    }
}
