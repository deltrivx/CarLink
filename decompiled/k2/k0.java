package k2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f7236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, a9.a aVar) {
        super(aVar);
        this.f7236b = l0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f7235a = obj;
        this.f7237c |= Integer.MIN_VALUE;
        return this.f7236b.j(0L, null, this);
    }
}
