package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1 f15476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i9.u f15477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f15480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(w0 w0Var, a9.c cVar) {
        super(cVar);
        this.f15480e = w0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15479d = obj;
        this.f15481f |= Integer.MIN_VALUE;
        return w0.a(this.f15480e, null, null, 0.0f, 0.0f, this);
    }
}
