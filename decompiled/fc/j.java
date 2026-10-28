package fc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8.t f5560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d8.t tVar, y8.c cVar) {
        super(cVar);
        this.f5560b = tVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f5559a = obj;
        this.f5561c |= Integer.MIN_VALUE;
        return this.f5560b.h(null, this);
    }
}
