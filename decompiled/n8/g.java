package n8;

import java.net.Inet4Address;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f8900b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f8901c = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8902a;

    public /* synthetic */ g(int i7) {
        this.f8902a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f8902a) {
            case 0:
                break;
        }
        return Boolean.valueOf(obj instanceof Inet4Address);
    }
}
