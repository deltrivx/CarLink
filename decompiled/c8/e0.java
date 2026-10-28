package c8;

import b8.g2;
import b8.h2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f2489b = new e0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f2490c = new e0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f2491d = new e0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f2492e = new e0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2493a;

    public /* synthetic */ e0(int i7) {
        this.f2493a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f2493a) {
            case 0:
                return i9.y.f6689a.b(((h2) obj).getClass()).k();
            case 1:
                String strL = i9.y.f6689a.b(((h2) obj).getClass()).l();
                return strL != null ? strL : "Unknown";
            case 2:
                return i9.y.f6689a.b(((h2) obj).getClass()).k();
            case 3:
                String strL2 = i9.y.f6689a.b(((h2) obj).getClass()).l();
                return strL2 != null ? strL2 : "Unknown";
            case 4:
                return Boolean.valueOf(((h2) obj).getType() == g2.f1593a);
            default:
                return Boolean.valueOf(((h2) obj).getType() == g2.f1594b);
        }
    }
}
