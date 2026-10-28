package v7;

import h9.k;
import i9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13633b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13634c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13635a;

    public /* synthetic */ a(int i7) {
        this.f13635a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f13635a) {
            case 0:
                return y.f6689a.b(((e) obj).getClass()).k();
            case 1:
                return y.f6689a.b(((e) obj).getClass()).k();
            case 2:
                return true;
            default:
                return true;
        }
    }
}
