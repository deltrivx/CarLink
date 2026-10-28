package d1;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.n f3732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j5, h9.n nVar, int i7) {
        super(2);
        this.f3731a = j5;
        this.f3732b = nVar;
        this.f3733c = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = f1.b.y(this.f3733c | 1);
        r.c(this.f3731a, this.f3732b, (f1.s) obj, iY);
        return z.f12851a;
    }
}
