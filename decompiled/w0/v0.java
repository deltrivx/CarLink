package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends a9.i implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f13971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, y8.c cVar, int i7) {
        super(1, cVar);
        this.f13969a = i7;
        this.f13971c = w0Var;
    }

    @Override // a9.a
    public final y8.c create(y8.c cVar) {
        switch (this.f13969a) {
            case 0:
                return new v0(this.f13971c, cVar, 0);
            default:
                return new v0(this.f13971c, cVar, 1);
        }
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y8.c cVar = (y8.c) obj;
        switch (this.f13969a) {
            case 0:
                break;
        }
        return ((v0) create(cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f13969a) {
            case 0:
                int i7 = this.f13970b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    this.f13970b = 1;
                    Object objA = w0.a(this.f13971c, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            default:
                int i10 = this.f13970b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    this.f13970b = 1;
                    Object objA2 = w0.a(this.f13971c, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objA2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
        }
    }
}
