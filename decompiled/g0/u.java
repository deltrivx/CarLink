package g0;

import x.v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f5732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a9.i f5733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f5735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, a9.c cVar) {
        super(cVar);
        this.f5735d = vVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f5734c = obj;
        this.f5736e |= Integer.MIN_VALUE;
        return this.f5735d.c(null, null, this);
    }
}
