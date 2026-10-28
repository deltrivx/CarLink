package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f15610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(a1 a1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f15608a = i7;
        this.f15610c = a1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15608a) {
            case 0:
                return new z1(this.f15610c, cVar, 0);
            default:
                return new z1(this.f15610c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f15608a) {
            case 0:
                break;
        }
        return ((z1) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f15608a) {
            case 0:
                int i7 = this.f15609b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    this.f15609b = 1;
                    Object objD = this.f15610c.d(this);
                    z8.a aVar = z8.a.f15774a;
                    if (objD == aVar) {
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
                int i10 = this.f15609b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    this.f15609b = 1;
                    Object objD2 = this.f15610c.d(this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objD2 == aVar2) {
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
