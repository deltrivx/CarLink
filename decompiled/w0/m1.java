package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f13855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(t1 t1Var, boolean z10, y8.c cVar) {
        super(2, cVar);
        this.f13855b = t1Var;
        this.f13856c = z10;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new m1(this.f13855b, this.f13856c, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f13854a;
        t8.z zVar = t8.z.f12851a;
        t1 t1Var = this.f13855b;
        if (i7 == 0) {
            t8.a.e(obj);
            if (!b3.q0.c(t1Var.m().f5890b)) {
                r2.e1 e1Var = t1Var.f13945g;
                if (e1Var != null) {
                    r2.d1 d1VarA = c0.d.a(a.a.F(t1Var.m()));
                    this.f13854a = 1;
                    ((r2.g) e1Var).a(d1VarA);
                    z8.a aVar = z8.a.f15774a;
                    if (zVar == aVar) {
                        return aVar;
                    }
                }
            }
            return zVar;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8.a.e(obj);
        if (this.f13856c) {
            int iE = b3.q0.e(t1Var.m().f5890b);
            g3.w wVarE = t1.e(t1Var.m().f5889a, b3.g0.b(iE, iE));
            t1Var.f13941c.invoke(wVarE);
            t1Var.f13959v = new b3.q0(wVarE.f5890b);
            t1Var.p(l0.i0.f7678a);
            return zVar;
        }
        return zVar;
    }
}
