package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5229b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(int i7, y8.c cVar, int i10) {
        super(i7, cVar);
        this.f5228a = i10;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f5228a) {
            case 0:
                y1 y1Var = new y1(2, cVar, 0);
                y1Var.f5229b = obj;
                return y1Var;
            default:
                y1 y1Var2 = new y1(2, cVar, 1);
                y1Var2.f5229b = obj;
                return y1Var2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5228a) {
            case 0:
                return ((y1) create((x1) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((y1) create((fc.a0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5228a) {
            case 0:
                t8.a.e(obj);
                return Boolean.valueOf(((x1) this.f5229b) == x1.f5197a);
            default:
                t8.a.e(obj);
                return Boolean.valueOf(((fc.a0) this.f5229b) != fc.a0.f5515a);
        }
    }
}
