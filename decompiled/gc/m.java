package gc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, y8.c cVar) {
        super(cVar);
        this.f6245b = nVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f6244a = obj;
        this.f6246c |= Integer.MIN_VALUE;
        return this.f6245b.h(null, this);
    }
}
