package j2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f6908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, a9.c cVar) {
        super(cVar);
        this.f6908d = gVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f6907c = obj;
        this.f6909e |= Integer.MIN_VALUE;
        return this.f6908d.l(0L, 0L, this);
    }
}
