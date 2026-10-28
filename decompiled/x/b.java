package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.a1 f14310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.k f14312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f14313g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z.a1 a1Var, long j5, b0.k kVar, f fVar, y8.c cVar) {
        super(2, cVar);
        this.f14310d = a1Var;
        this.f14311e = j5;
        this.f14312f = kVar;
        this.f14313g = fVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        b bVar = new b(this.f14310d, this.f14311e, this.f14312f, this.f14313g, cVar);
        bVar.f14309c = obj;
        return bVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r14.a(r1, r17) == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r14.a(r2, r17) == r9) goto L40;
     */
    @Override // a9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
