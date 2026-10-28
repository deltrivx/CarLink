package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i9.w f11595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f11596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n3.k f11597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f11599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(i9.w wVar, v vVar, n3.k kVar, long j5, long j10) {
        super(0);
        this.f11595a = wVar;
        this.f11596b = vVar;
        this.f11597c = kVar;
        this.f11598d = j5;
        this.f11599e = j10;
    }

    @Override // h9.a
    public final Object invoke() {
        v vVar = this.f11596b;
        this.f11595a.f6687a = vVar.getPositionProvider().a(this.f11597c, this.f11598d, vVar.getParentLayoutDirection(), this.f11599e);
        return t8.z.f12851a;
    }
}
