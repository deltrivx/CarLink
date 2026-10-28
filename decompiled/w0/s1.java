package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1 f13923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f13925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, a9.c cVar) {
        super(cVar);
        this.f13925c = t1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f13924b = obj;
        this.f13926d |= Integer.MIN_VALUE;
        return this.f13925c.r(this);
    }
}
