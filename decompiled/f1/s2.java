package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.n f5140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f5141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(h9.n nVar, b1 b1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f5137a = i7;
        this.f5140d = nVar;
        this.f5141e = b1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f5137a) {
            case 0:
                s2 s2Var = new s2(this.f5140d, this.f5141e, cVar, 0);
                s2Var.f5139c = obj;
                return s2Var;
            default:
                s2 s2Var2 = new s2(this.f5140d, this.f5141e, cVar, 1);
                s2Var2.f5139c = obj;
                return s2Var2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f5137a) {
            case 0:
                break;
        }
        return ((s2) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5137a) {
            case 0:
                int i7 = this.f5138b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    s1 s1Var = new s1(this.f5141e, ((cc.y) this.f5139c).u());
                    this.f5138b = 1;
                    Object objInvoke = this.f5140d.invoke(s1Var, this);
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
                int i10 = this.f5138b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    s1 s1Var2 = new s1(this.f5141e, ((cc.y) this.f5139c).u());
                    this.f5138b = 1;
                    Object objInvoke2 = this.f5140d.invoke(s1Var2, this);
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
