package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.o f15303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f15304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k2.v f15305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(h9.o oVar, a1 a1Var, k2.v vVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f15301a = i7;
        this.f15303c = oVar;
        this.f15304d = a1Var;
        this.f15305e = vVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15301a) {
            case 0:
                return new a2(this.f15303c, this.f15304d, this.f15305e, cVar, 0);
            default:
                return new a2(this.f15303c, this.f15304d, this.f15305e, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f15301a) {
            case 0:
                break;
        }
        return ((a2) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f15301a) {
            case 0:
                int i7 = this.f15302b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    x1.b bVar = new x1.b(this.f15305e.f7280c);
                    this.f15302b = 1;
                    Object objInvoke = this.f15303c.invoke(this.f15304d, bVar, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objInvoke == aVar) {
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
                int i10 = this.f15302b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    x1.b bVar2 = new x1.b(this.f15305e.f7280c);
                    this.f15302b = 1;
                    Object objInvoke2 = this.f15303c.invoke(this.f15304d, bVar2, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objInvoke2 == aVar2) {
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
