package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f15402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, long j5, y8.c cVar, int i7) {
        super(2, cVar);
        this.f15399a = i7;
        this.f15402d = j0Var;
        this.f15403e = j5;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15399a) {
            case 0:
                i0 i0Var = new i0(this.f15402d, this.f15403e, cVar, 0);
                i0Var.f15401c = obj;
                return i0Var;
            default:
                i0 i0Var2 = new i0(this.f15402d, this.f15403e, cVar, 1);
                i0Var2.f15401c = obj;
                return i0Var2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f15399a) {
            case 0:
                break;
        }
        return ((i0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f15399a;
        t8.z zVar = t8.z.f12851a;
        long j5 = this.f15403e;
        z8.a aVar = z8.a.f15774a;
        j0 j0Var = this.f15402d;
        switch (i7) {
            case 0:
                int i10 = this.f15400b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                cc.y yVar = (cc.y) this.f15401c;
                h9.o oVar = j0Var.C;
                x1.b bVar = new x1.b(j5);
                this.f15400b = 1;
                return oVar.invoke(yVar, bVar, this) == aVar ? aVar : zVar;
            default:
                int i11 = this.f15400b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                cc.y yVar2 = (cc.y) this.f15401c;
                h9.o oVar2 = j0Var.D;
                long jF = n3.t.f(j0Var.E ? -1.0f : 1.0f, j5);
                x0 x0Var = j0Var.A;
                g0 g0Var = h0.f15396a;
                Float f10 = new Float(x0Var == x0.f15591a ? n3.t.c(jF) : n3.t.b(jF));
                this.f15400b = 1;
                return oVar2.invoke(yVar2, f10, this) == aVar ? aVar : zVar;
        }
    }
}
