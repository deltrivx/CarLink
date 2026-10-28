package gc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6228a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f6231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc.e f6232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, fc.e eVar, Object obj, y8.c cVar) {
        super(2, cVar);
        this.f6231d = kVar;
        this.f6232e = eVar;
        this.f6230c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, fc.e eVar, y8.c cVar) {
        super(2, cVar);
        this.f6231d = kVar;
        this.f6232e = eVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f6228a) {
            case 0:
                return new h(this.f6231d, this.f6232e, this.f6230c, cVar);
            default:
                h hVar = new h(this.f6231d, this.f6232e, cVar);
                hVar.f6230c = obj;
                return hVar;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f6228a) {
            case 0:
                break;
        }
        return ((h) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [a9.i, h9.o] */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6228a) {
            case 0:
                int i7 = this.f6229b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    ?? r10 = this.f6231d.f6243e;
                    Object obj2 = this.f6230c;
                    this.f6229b = 1;
                    Object objInvoke = r10.invoke(this.f6232e, obj2, this);
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
                int i10 = this.f6229b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    cc.y yVar = (cc.y) this.f6230c;
                    i9.x xVar = new i9.x();
                    k kVar = this.f6231d;
                    fc.d dVar = kVar.f6227d;
                    j jVar = new j(xVar, yVar, kVar, this.f6232e, 0);
                    this.f6229b = 1;
                    Object objL = dVar.l(jVar, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objL == aVar2) {
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
