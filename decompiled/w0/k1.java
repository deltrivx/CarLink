package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a9.i implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f13835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(t1 t1Var, y8.c cVar, int i7) {
        super(1, cVar);
        this.f13833a = i7;
        this.f13835c = t1Var;
    }

    @Override // a9.a
    public final y8.c create(y8.c cVar) {
        switch (this.f13833a) {
            case 0:
                return new k1(this.f13835c, cVar, 0);
            default:
                return new k1(this.f13835c, cVar, 1);
        }
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y8.c cVar = (y8.c) obj;
        switch (this.f13833a) {
            case 0:
                break;
        }
        return ((k1) create(cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f13833a) {
            case 0:
                int i7 = this.f13834b;
                t1 t1Var = this.f13835c;
                z8.a aVar = z8.a.f15774a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        t8.a.e(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                this.f13834b = 1;
                if (t1Var.r(this) == aVar) {
                    return aVar;
                }
                this.f13834b = 2;
                if (t1.b(t1Var, this) == aVar) {
                    return aVar;
                }
                return t8.z.f12851a;
            default:
                int i10 = this.f13834b;
                t1 t1Var2 = this.f13835c;
                z8.a aVar2 = z8.a.f15774a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        t8.a.e(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    t1Var2.A = true;
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                this.f13834b = 1;
                if (t1Var2.r(this) == aVar2) {
                    return aVar2;
                }
                this.f13834b = 2;
                if (t1.b(t1Var2, this) == aVar2) {
                    return aVar2;
                }
                t1Var2.A = true;
                return t8.z.f12851a;
        }
    }
}
