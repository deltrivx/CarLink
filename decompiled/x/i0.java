package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f14392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, a9.c cVar) {
        super(cVar);
        this.f14392b = k0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f14391a = obj;
        this.f14393c |= Integer.MIN_VALUE;
        return k0.B0(this.f14392b, this);
    }
}
