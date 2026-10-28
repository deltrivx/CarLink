package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ z.a1 f14495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f14496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f14497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, y8.c cVar) {
        super(3, cVar);
        this.f14497d = xVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j5 = ((x1.b) obj2).f14521a;
        w wVar = new w(this.f14497d, (y8.c) obj3);
        wVar.f14495b = (z.a1) obj;
        wVar.f14496c = j5;
        return wVar.invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        int i7 = this.f14494a;
        t8.z zVar = t8.z.f12851a;
        if (i7 == 0) {
            t8.a.e(obj);
            z.a1 a1Var = this.f14495b;
            long j5 = this.f14496c;
            x xVar = this.f14497d;
            if (xVar.f14354v) {
                this.f14494a = 1;
                b0.k kVar = xVar.f14349q;
                z8.a aVar = z8.a.f15774a;
                if (kVar == null || (objG = cc.b0.g(new b(a1Var, j5, kVar, xVar, null), this)) != aVar) {
                    objG = zVar;
                }
                if (objG == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        return zVar;
    }
}
