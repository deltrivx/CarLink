package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f11354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, a9.c cVar) {
        super(cVar);
        this.f11354b = p0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f11353a = obj;
        this.f11355c |= Integer.MIN_VALUE;
        this.f11354b.a(null, this);
        return z8.a.f15774a;
    }
}
