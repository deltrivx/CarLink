package i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x1.c f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f6570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f6574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, a9.c cVar) {
        super(cVar);
        this.f6574f = bVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        this.f6573e = obj;
        this.f6575g |= Integer.MIN_VALUE;
        return this.f6574f.a(null, this);
    }
}
