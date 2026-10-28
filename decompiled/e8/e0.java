package e8;

import b8.j1;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4517a;

    public /* synthetic */ e0(int i7) {
        this.f4517a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4517a) {
            case 0:
                return n3.n.X(Integer.valueOf(((b8.b0) obj).f1568c), Integer.valueOf(((b8.b0) obj2).f1568c));
            default:
                return n3.n.X(Integer.valueOf(((j1) obj).f1603c), Integer.valueOf(((j1) obj2).f1603c));
        }
    }
}
