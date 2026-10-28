package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends a9.i implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f13846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(t1 t1Var, y8.c cVar, int i7) {
        super(1, cVar);
        this.f13845a = i7;
        this.f13846b = t1Var;
    }

    @Override // a9.a
    public final y8.c create(y8.c cVar) {
        switch (this.f13845a) {
            case 0:
                return new l1(this.f13846b, cVar, 0);
            case 1:
                return new l1(this.f13846b, cVar, 1);
            case 2:
                return new l1(this.f13846b, cVar, 2);
            default:
                return new l1(this.f13846b, cVar, 3);
        }
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y8.c cVar = (y8.c) obj;
        switch (this.f13845a) {
            case 0:
                l1 l1Var = (l1) create(cVar);
                t8.z zVar = t8.z.f12851a;
                l1Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                l1 l1Var2 = (l1) create(cVar);
                t8.z zVar2 = t8.z.f12851a;
                l1Var2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                l1 l1Var3 = (l1) create(cVar);
                t8.z zVar3 = t8.z.f12851a;
                l1Var3.invokeSuspend(zVar3);
                return zVar3;
            default:
                l1 l1Var4 = (l1) create(cVar);
                t8.z zVar4 = t8.z.f12851a;
                l1Var4.invokeSuspend(zVar4);
                return zVar4;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f13845a;
        t8.z zVar = t8.z.f12851a;
        t1 t1Var = this.f13846b;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                t1Var.A = false;
                break;
            case 1:
                t8.a.e(obj);
                t1Var.f();
                break;
            case 2:
                t8.a.e(obj);
                t1Var.d(t1Var.A);
                break;
            default:
                t8.a.e(obj);
                t1Var.o();
                break;
        }
        return zVar;
    }
}
