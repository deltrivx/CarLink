package fc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gc.u f5511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.d f5513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a2.d dVar, y8.c cVar) {
        super(cVar);
        this.f5513c = dVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f5512b = obj;
        this.f5514d |= Integer.MIN_VALUE;
        return this.f5513c.l(null, this);
    }
}
