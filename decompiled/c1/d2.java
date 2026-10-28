package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f1860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(i2 i2Var, y8.c cVar) {
        super(3, cVar);
        this.f1860a = i2Var;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        d2 d2Var = new d2(this.f1860a, (y8.c) obj3);
        t8.z zVar = t8.z.f12851a;
        d2Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        this.f1860a.f1932l.invoke();
        return t8.z.f12851a;
    }
}
