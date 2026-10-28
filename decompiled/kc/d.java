package kc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f7516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f7518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, a9.c cVar) {
        super(cVar);
        this.f7518c = eVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f7517b = obj;
        this.f7519d |= Integer.MIN_VALUE;
        return this.f7518c.d(this);
    }
}
