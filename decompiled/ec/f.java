package ec;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, a9.c cVar) {
        super(cVar);
        this.f4695b = hVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f4694a = obj;
        this.f4696c |= Integer.MIN_VALUE;
        Object objC = h.C(this.f4695b, this);
        return objC == z8.a.f15774a ? objC : new o(objC);
    }
}
