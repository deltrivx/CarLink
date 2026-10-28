package f0;

import x.v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f4846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a9.i f4847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f4849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, a9.c cVar) {
        super(cVar);
        this.f4849d = uVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f4848c = obj;
        this.f4850e |= Integer.MIN_VALUE;
        return this.f4849d.c(null, null, this);
    }
}
