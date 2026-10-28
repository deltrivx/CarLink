package y7;

import h9.k;
import i9.y;
import v7.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15098b = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15099a;

    public /* synthetic */ b(int i7) {
        this.f15099a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f15099a) {
            case 0:
                return y.f6689a.b(((v7.e) obj).getClass()).k();
            default:
                return Boolean.valueOf(((v7.e) obj).d() == h.f13652c);
        }
    }
}
