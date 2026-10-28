package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h9.k f5014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f5016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, y8.c cVar) {
        super(cVar);
        this.f5016c = m1Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f5015b = obj;
        this.f5017d |= Integer.MIN_VALUE;
        return this.f5016c.m(null, this);
    }
}
