package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f15599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var, a9.c cVar) {
        super(cVar);
        this.f15599b = a1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15598a = obj;
        this.f15600c |= Integer.MIN_VALUE;
        return this.f15599b.d(this);
    }
}
