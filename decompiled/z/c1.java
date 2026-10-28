package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i9.u f15332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f15333c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i9.u uVar, float f10, y8.c cVar) {
        super(2, cVar);
        this.f15332b = uVar;
        this.f15333c = f10;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        c1 c1Var = new c1(this.f15332b, this.f15333c, cVar);
        c1Var.f15331a = obj;
        return c1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        c1 c1Var = (c1) create((d1) obj, (y8.c) obj2);
        t8.z zVar = t8.z.f12851a;
        c1Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        this.f15332b.f6685a = ((d1) this.f15331a).a(this.f15333c);
        return t8.z.f12851a;
    }
}
