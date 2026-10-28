package t7;

import h9.k;
import i9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f12808b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f12809c = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12810a;

    public /* synthetic */ e(int i7) {
        this.f12810a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f12810a) {
            case 0:
                return y.f6689a.b(((g) obj).getClass()).k();
            default:
                String strL = y.f6689a.b(((g) obj).getClass()).l();
                return strL != null ? strL : "Unknown";
        }
    }
}
