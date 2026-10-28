package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f14397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f14395a = i7;
        this.f14397c = k0Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f14395a) {
            case 0:
                return new j0(this.f14397c, cVar, 0);
            default:
                return new j0(this.f14397c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f14395a) {
            case 0:
                break;
        }
        return ((j0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14395a) {
            case 0:
                int i7 = this.f14396b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    this.f14396b = 1;
                    Object objA0 = k0.A0(this.f14397c, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objA0 == aVar) {
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
                int i10 = this.f14396b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    this.f14396b = 1;
                    Object objB0 = k0.B0(this.f14397c, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objB0 == aVar2) {
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
