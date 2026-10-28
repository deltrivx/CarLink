package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f11424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, a9.c cVar) {
        super(cVar);
        this.f11424b = uVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f11423a = obj;
        this.f11425c |= Integer.MIN_VALUE;
        this.f11424b.O(null, this);
        return z8.a.f15774a;
    }
}
