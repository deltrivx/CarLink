package j2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f6912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, a9.c cVar) {
        super(cVar);
        this.f6912c = gVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f6911b = obj;
        this.f6913d |= Integer.MIN_VALUE;
        return this.f6912c.u(0L, this);
    }
}
