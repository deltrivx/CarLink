package x2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3.e f14555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c3.e eVar, a9.c cVar) {
        super(cVar);
        this.f14555b = eVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f14554a = obj;
        this.f14556c |= Integer.MIN_VALUE;
        return this.f14555b.b(0.0f, this);
    }
}
