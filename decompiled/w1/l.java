package w1;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i9.n implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f14050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f14051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f14052d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14053a;

    static {
        int i7 = 1;
        f14050b = new l(i7, 0);
        f14051c = new l(i7, 1);
        f14052d = new l(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i7, int i10) {
        super(i7);
        this.f14053a = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f14053a) {
            case 0:
                return z.f12851a;
            case 1:
                return z.f12851a;
            case 2:
                return Boolean.valueOf(((s) obj).E0(7));
            default:
                return Boolean.valueOf(((s) obj).E0(7));
        }
    }
}
