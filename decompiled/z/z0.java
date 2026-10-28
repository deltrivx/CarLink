package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f15606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, a9.c cVar) {
        super(cVar);
        this.f15606b = a1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15605a = obj;
        this.f15607c |= Integer.MIN_VALUE;
        return this.f15606b.e(this);
    }
}
