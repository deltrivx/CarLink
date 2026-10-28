package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.k f1841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.p f1842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b0.k kVar, p1.p pVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f1839a = i7;
        this.f1841c = kVar;
        this.f1842d = pVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f1839a) {
            case 0:
                return new d(this.f1841c, this.f1842d, cVar, 0);
            default:
                return new d(this.f1841c, this.f1842d, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f1839a) {
            case 0:
                break;
        }
        return ((d) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f1839a) {
            case 0:
                int i7 = this.f1840b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                fc.x xVar = this.f1841c.f1115a;
                c cVar = new c(this.f1842d, 0);
                this.f1840b = 1;
                xVar.getClass();
                fc.x.j(xVar, cVar, this);
                return z8.a.f15774a;
            default:
                int i10 = this.f1840b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                fc.x xVar2 = this.f1841c.f1115a;
                c cVar2 = new c(this.f1842d, 1);
                this.f1840b = 1;
                xVar2.getClass();
                fc.x.j(xVar2, cVar2, this);
                return z8.a.f15774a;
        }
    }
}
