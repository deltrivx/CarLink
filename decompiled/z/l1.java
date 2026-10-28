package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15431b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(long j5, y8.c cVar) {
        super(2, cVar);
        this.f15431b = j5;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        l1 l1Var = new l1(this.f15431b, cVar);
        l1Var.f15430a = obj;
        return l1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        l1 l1Var = (l1) create((r1) obj, (y8.c) obj2);
        t8.z zVar = t8.z.f12851a;
        l1Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        t1 t1Var = ((r1) this.f15430a).f15482a;
        t1Var.c(t1Var.k, this.f15431b, 1);
        return t8.z.f12851a;
    }
}
