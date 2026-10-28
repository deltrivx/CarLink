package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends a9.i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15388a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i7, y8.c cVar, int i10) {
        super(i7, cVar);
        this.f15388a = i10;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15388a) {
            case 0:
                long j5 = ((x1.b) obj2).f14521a;
                g0 g0Var = new g0(3, (y8.c) obj3, 0);
                t8.z zVar = t8.z.f12851a;
                g0Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                ((Number) obj2).floatValue();
                g0 g0Var2 = new g0(3, (y8.c) obj3, 1);
                t8.z zVar2 = t8.z.f12851a;
                g0Var2.invokeSuspend(zVar2);
                return zVar2;
            default:
                long j10 = ((x1.b) obj2).f14521a;
                g0 g0Var3 = new g0(3, (y8.c) obj3, 2);
                t8.z zVar3 = t8.z.f12851a;
                g0Var3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f15388a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                break;
            case 1:
                t8.a.e(obj);
                break;
            default:
                t8.a.e(obj);
                break;
        }
        return zVar;
    }
}
