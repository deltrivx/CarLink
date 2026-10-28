package gc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f6233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f6236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, y8.c cVar) {
        super(cVar);
        this.f6236d = jVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f6235c = obj;
        this.f6237e |= Integer.MIN_VALUE;
        return this.f6236d.h(null, this);
    }
}
