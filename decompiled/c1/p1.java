package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f2055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(m1 m1Var, boolean z10) {
        super(2);
        this.f2055a = m1Var;
        this.f2056b = z10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        a2.g gVar = (a2.g) obj;
        long j5 = ((x1.b) obj2).f14521a;
        t1 t1Var = t1.f2165a;
        a2.f.r(gVar, this.f2055a.a(this.f2056b, true), gVar.R(t1.f2166b) / 2.0f, j5, 120);
        return t8.z.f12851a;
    }
}
