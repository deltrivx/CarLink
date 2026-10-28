package t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ec.c f12729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f12731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, a9.c cVar2) {
        super(cVar2);
        this.f12731c = cVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f12730b = obj;
        this.f12732d |= Integer.MIN_VALUE;
        return this.f12731c.f(this);
    }
}
