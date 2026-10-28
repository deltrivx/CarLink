package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f15310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, a9.c cVar) {
        super(cVar);
        this.f15310b = f0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15309a = obj;
        this.f15311c |= Integer.MIN_VALUE;
        return f0.D0(this.f15310b, this);
    }
}
