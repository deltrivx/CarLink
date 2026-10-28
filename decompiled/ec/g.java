package ec;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a9.c cVar) {
        super(cVar);
        this.f4698b = hVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f4697a = obj;
        this.f4699c |= Integer.MIN_VALUE;
        Object objD = this.f4698b.D(null, 0, 0L, this);
        return objD == z8.a.f15774a ? objD : new o(objD);
    }
}
