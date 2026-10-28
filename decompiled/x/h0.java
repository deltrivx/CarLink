package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0.h f14380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f14382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, a9.c cVar) {
        super(cVar);
        this.f14382c = k0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f14381b = obj;
        this.f14383d |= Integer.MIN_VALUE;
        return k0.A0(this.f14382c, this);
    }
}
