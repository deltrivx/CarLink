package j2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, a9.c cVar) {
        super(cVar);
        this.f6899b = dVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f6898a = obj;
        this.f6900c |= Integer.MIN_VALUE;
        return this.f6899b.b(0L, this);
    }
}
