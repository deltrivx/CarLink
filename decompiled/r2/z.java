package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s.x f11518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ec.c f11519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f11521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, a9.c cVar) {
        super(cVar);
        this.f11521d = b0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f11520c = obj;
        this.f11522e |= Integer.MIN_VALUE;
        return this.f11521d.g(this);
    }
}
