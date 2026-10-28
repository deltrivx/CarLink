package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t8.e f15376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h9.a f15377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2 f15380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var, a9.c cVar) {
        super(cVar);
        this.f15380e = g2Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15379d = obj;
        this.f15381f |= Integer.MIN_VALUE;
        return this.f15380e.a(null, null, this);
    }
}
