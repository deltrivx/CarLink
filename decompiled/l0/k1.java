package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ z.a1 f7710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f7711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cc.y f7712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f7713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.k f7714f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(cc.y yVar, f1.b1 b1Var, b0.k kVar, y8.c cVar) {
        super(3, cVar);
        this.f7712d = yVar;
        this.f7713e = b1Var;
        this.f7714f = kVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j5 = ((x1.b) obj2).f14521a;
        f1.b1 b1Var = this.f7713e;
        b0.k kVar = this.f7714f;
        k1 k1Var = new k1(this.f7712d, b1Var, kVar, (y8.c) obj3);
        k1Var.f7710b = (z.a1) obj;
        k1Var.f7711c = j5;
        return k1Var.invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f7709a;
        cc.y yVar = this.f7712d;
        if (i7 == 0) {
            t8.a.e(obj);
            z.a1 a1Var = this.f7710b;
            cc.b0.s(yVar, null, new i1(this.f7713e, this.f7711c, this.f7714f, null, 0), 3);
            this.f7709a = 1;
            obj = a1Var.e(this);
            z8.a aVar = z8.a.f15774a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        cc.b0.s(yVar, null, new j1(this.f7713e, ((Boolean) obj).booleanValue(), this.f7714f, null), 3);
        return t8.z.f12851a;
    }
}
