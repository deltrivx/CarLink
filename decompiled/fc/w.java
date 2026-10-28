package fc;

import cc.a1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f5602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f5603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f5604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1 f5605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f5607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, y8.c cVar) {
        super(cVar);
        this.f5607f = xVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f5606e = obj;
        this.f5608g |= Integer.MIN_VALUE;
        x.j(this.f5607f, null, this);
        return z8.a.f15774a;
    }
}
