package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f15339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f15341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, a9.c cVar) {
        super(cVar);
        this.f15341c = f0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15340b = obj;
        this.f15342d |= Integer.MIN_VALUE;
        return f0.F0(this.f15341c, null, this);
    }
}
