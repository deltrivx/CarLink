package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15545a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15547c;

    public /* synthetic */ u0(int i7, y8.c cVar) {
        super(i7, cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, y8.c cVar) {
        super(2, cVar);
        this.f15547c = w0Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15545a) {
            case 0:
                return new u0((w0) this.f15547c, cVar);
            default:
                u0 u0Var = new u0(2, cVar);
                u0Var.f15547c = obj;
                return u0Var;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f15545a) {
            case 0:
                break;
        }
        return ((u0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        cc.y yVar;
        switch (this.f15545a) {
            case 0:
                int i7 = this.f15546b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return obj;
                }
                t8.a.e(obj);
                ec.h hVar = (ec.h) ((w0) this.f15547c).f15577f;
                this.f15546b = 1;
                Object objG = cc.b0.g(new b0.g(hVar, (y8.c) null, 25), this);
                z8.a aVar = z8.a.f15774a;
                return objG == aVar ? aVar : objG;
            default:
                int i10 = this.f15546b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    yVar = (cc.y) this.f15547c;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (cc.y) this.f15547c;
                    t8.a.e(obj);
                }
                while (cc.b0.r(yVar.u())) {
                    u7.d dVar = new u7.d(28);
                    this.f15547c = yVar;
                    this.f15546b = 1;
                    Object objM = f1.b.q(getContext()).m(dVar, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objM == aVar2) {
                        return aVar2;
                    }
                }
                return t8.z.f12851a;
        }
    }
}
