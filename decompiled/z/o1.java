package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i9.w f15437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f15439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(t1 t1Var, a9.c cVar) {
        super(cVar);
        this.f15439c = t1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15438b = obj;
        this.f15440d |= Integer.MIN_VALUE;
        return this.f15439c.a(0L, this);
    }
}
