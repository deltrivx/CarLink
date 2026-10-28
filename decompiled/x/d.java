package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f14340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.m f14341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, b0.m mVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f14338a = i7;
        this.f14340c = fVar;
        this.f14341d = mVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f14338a) {
            case 0:
                return new d(this.f14340c, this.f14341d, cVar, 0);
            case 1:
                return new d(this.f14340c, this.f14341d, cVar, 1);
            default:
                return new d(this.f14340c, this.f14341d, cVar, 2);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f14338a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f14338a) {
            case 0:
                int i7 = this.f14339b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    b0.k kVar = this.f14340c.f14349q;
                    if (kVar != null) {
                        b0.l lVar = new b0.l(this.f14341d);
                        this.f14339b = 1;
                        Object objA = kVar.a(lVar, this);
                        z8.a aVar = z8.a.f15774a;
                        if (objA == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            case 1:
                int i10 = this.f14339b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    b0.k kVar2 = this.f14340c.f14349q;
                    if (kVar2 != null) {
                        this.f14339b = 1;
                        Object objA2 = kVar2.a(this.f14341d, this);
                        z8.a aVar2 = z8.a.f15774a;
                        if (objA2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            default:
                int i11 = this.f14339b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    b0.k kVar3 = this.f14340c.f14349q;
                    if (kVar3 != null) {
                        b0.n nVar = new b0.n(this.f14341d);
                        this.f14339b = 1;
                        Object objA3 = kVar3.a(nVar, this);
                        z8.a aVar3 = z8.a.f15774a;
                        if (objA3 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
        }
    }
}
