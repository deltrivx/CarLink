package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f15326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0.b f15327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f15329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, a9.c cVar) {
        super(cVar);
        this.f15329d = f0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15328c = obj;
        this.f15330e |= Integer.MIN_VALUE;
        return f0.E0(this.f15329d, null, this);
    }
}
