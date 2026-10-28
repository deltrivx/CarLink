package d1;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.n f3715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j5, h9.n nVar) {
        super(2);
        this.f3714a = j5;
        this.f3715b = nVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            r.c(this.f3714a, this.f3715b, sVar, 0);
        }
        return z.f12851a;
    }
}
