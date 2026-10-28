package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f1882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f1883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(i2 i2Var, y8.c cVar) {
        super(3, cVar);
        this.f1883b = i2Var;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j5 = ((x1.b) obj2).f14521a;
        f2 f2Var = new f2(this.f1883b, (y8.c) obj3);
        f2Var.f1882a = j5;
        t8.z zVar = t8.z.f12851a;
        f2Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        long j5 = this.f1882a;
        i2 i2Var = this.f1883b;
        i2Var.f1934n.g((i2Var.f1929h ? i2Var.f1928g.f() - x1.b.d(j5) : x1.b.d(j5)) - i2Var.f1933m.f());
        return t8.z.f12851a;
    }
}
