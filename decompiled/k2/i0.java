package k2;

import cc.o1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o1 f7221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f7223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, a9.c cVar) {
        super(cVar);
        this.f7223c = l0Var;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f7222b = obj;
        this.f7224d |= Integer.MIN_VALUE;
        return this.f7223c.h(0L, null, this);
    }
}
