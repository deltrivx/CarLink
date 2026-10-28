package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f1879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(float f10, long j5) {
        super(1);
        this.f1879a = f10;
        this.f1880b = j5;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        a2.g gVar = (a2.g) obj;
        float f10 = this.f1879a;
        float f11 = 2;
        gVar.y(this.f1880b, n3.r.a(0.0f, gVar.R(f10) / f11), n3.r.a(x1.e.d(gVar.g()), gVar.R(f10) / f11), gVar.R(f10));
        return t8.z.f12851a;
    }
}
