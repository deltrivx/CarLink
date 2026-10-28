package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f11220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(g3 g3Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f11218a = i7;
        this.f11220c = g3Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f11218a) {
            case 0:
                return new e3(this.f11220c, cVar, 0);
            default:
                return new e3(this.f11220c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f11218a) {
            case 0:
                break;
        }
        return ((e3) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f11218a) {
            case 0:
                int i7 = this.f11219b;
                t8.z zVar = t8.z.f12851a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                u uVar = this.f11220c.f11242a;
                this.f11219b = 1;
                Object objG = uVar.f11478s.g(this);
                z8.a aVar = z8.a.f15774a;
                if (objG != aVar) {
                    objG = zVar;
                }
                return objG == aVar ? aVar : zVar;
            default:
                int i10 = this.f11219b;
                t8.z zVar2 = t8.z.f12851a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar2;
                }
                t8.a.e(obj);
                u uVar2 = this.f11220c.f11242a;
                this.f11219b = 1;
                Object objF = uVar2.f11480t.f(this);
                z8.a aVar2 = z8.a.f15774a;
                if (objF != aVar2) {
                    objF = zVar2;
                }
                return objF == aVar2 ? aVar2 : zVar2;
        }
    }
}
