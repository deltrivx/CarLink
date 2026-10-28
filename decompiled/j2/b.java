package j2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, a9.c cVar) {
        super(cVar);
        this.f6896b = dVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f6895a = obj;
        this.f6897c |= Integer.MIN_VALUE;
        return this.f6896b.a(0L, 0L, this);
    }
}
