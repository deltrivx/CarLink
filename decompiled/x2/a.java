package x2;

import n3.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f14537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f14541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, a9.c cVar2) {
        super(cVar2);
        this.f14541f = cVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f14540e = obj;
        this.f14542g |= Integer.MIN_VALUE;
        return c.a(this.f14541f, null, null, this);
    }
}
