package b3;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1348a;

    public /* synthetic */ g(int i7) {
        this.f1348a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1348a) {
            case 0:
                break;
        }
        return n3.n.X(Integer.valueOf(((f) obj).f1325b), Integer.valueOf(((f) obj2).f1325b));
    }
}
