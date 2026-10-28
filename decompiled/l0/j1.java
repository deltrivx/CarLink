package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1.b1 f7692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f7694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.k f7696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(f1.b1 b1Var, boolean z10, b0.k kVar, y8.c cVar) {
        super(2, cVar);
        this.f7694c = b1Var;
        this.f7695d = z10;
        this.f7696e = kVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new j1(this.f7694c, this.f7695d, this.f7696e, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        f1.b1 b1Var;
        int i7 = this.f7693b;
        if (i7 == 0) {
            t8.a.e(obj);
            b1Var = this.f7694c;
            b0.m mVar = (b0.m) b1Var.getValue();
            if (mVar != null) {
                b0.j nVar = this.f7695d ? new b0.n(mVar) : new b0.l(mVar);
                b0.k kVar = this.f7696e;
                if (kVar != null) {
                    this.f7692a = b1Var;
                    this.f7693b = 1;
                    Object objA = kVar.a(nVar, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
            }
            return t8.z.f12851a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b1Var = this.f7692a;
        t8.a.e(obj);
        b1Var.setValue(null);
        return t8.z.f12851a;
    }
}
