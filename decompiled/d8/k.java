package d8;

import b8.a1;
import b8.h2;
import b8.u0;
import i9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f3816b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f3817c = new k(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f3818d = new k(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f3819e = new k(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3820a;

    public /* synthetic */ k(int i7) {
        this.f3820a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f3820a) {
            case 0:
                return Boolean.valueOf(obj instanceof u0);
            case 1:
                return Boolean.valueOf(obj instanceof a1);
            case 2:
                return y.f6689a.b(((h2) obj).getClass()).k();
            case 3:
                String strL = y.f6689a.b(((h2) obj).getClass()).l();
                return strL != null ? strL : "Unknown";
            default:
                return true;
        }
    }
}
