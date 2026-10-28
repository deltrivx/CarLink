package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f15562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, a9.c cVar) {
        super(cVar);
        this.f15562b = w0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f15561a = obj;
        this.f15563c |= Integer.MIN_VALUE;
        return this.f15562b.h(null, null, this);
    }
}
