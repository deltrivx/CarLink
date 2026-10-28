package gc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f6223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f6220a = i7;
        this.f6223d = fVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f6220a) {
            case 0:
                e eVar = new e(this.f6223d, cVar, 0);
                eVar.f6222c = obj;
                return eVar;
            default:
                e eVar2 = new e(this.f6223d, cVar, 1);
                eVar2.f6222c = obj;
                return eVar2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6220a) {
            case 0:
                return ((e) create((ec.u) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((e) create((fc.e) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6220a) {
            case 0:
                int i7 = this.f6221b;
                t8.z zVar = t8.z.f12851a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                ec.u uVar = (ec.u) this.f6222c;
                this.f6221b = 1;
                Object objC = this.f6223d.c(new x(uVar), this);
                z8.a aVar = z8.a.f15774a;
                if (objC != aVar) {
                    objC = zVar;
                }
                return objC == aVar ? aVar : zVar;
            default:
                int i10 = this.f6221b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    fc.e eVar = (fc.e) this.f6222c;
                    this.f6221b = 1;
                    Object objC2 = this.f6223d.c(eVar, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objC2 == aVar2) {
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
