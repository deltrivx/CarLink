package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f10756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1 f10759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, long j5, long j10, u1 u1Var) {
        super(0);
        this.f10756a = p0Var;
        this.f10757b = j5;
        this.f10758c = j10;
        this.f10759d = u1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        p0 p0Var = this.f10756a;
        p0Var.r0().f10747a = false;
        p0Var.r0().f10748b = this.f10757b;
        p0Var.r0().f10749c = this.f10758c;
        h9.k kVarD = this.f10759d.f10827a.d();
        if (kVarD != null) {
            kVarD.invoke(p0Var.r0());
        }
        return t8.z.f12851a;
    }
}
