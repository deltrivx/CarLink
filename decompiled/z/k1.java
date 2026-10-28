package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f15426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f15427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(m1 m1Var, long j5, y8.c cVar, int i7) {
        super(2, cVar);
        this.f15424a = i7;
        this.f15426c = m1Var;
        this.f15427d = j5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, y8.c cVar) {
        super(2, cVar);
        this.f15424a = 3;
        this.f15426c = m1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15424a) {
            case 0:
                return new k1(this.f15426c, this.f15427d, cVar, 0);
            case 1:
                return new k1(this.f15426c, this.f15427d, cVar, 1);
            case 2:
                return new k1(this.f15426c, this.f15427d, cVar, 2);
            default:
                k1 k1Var = new k1(this.f15426c, cVar);
                k1Var.f15427d = ((x1.b) obj).f14521a;
                return k1Var;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15424a) {
            case 0:
                return ((k1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 1:
                return ((k1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 2:
                return ((k1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                long j5 = ((x1.b) obj).f14521a;
                k1 k1Var = new k1(this.f15426c, (y8.c) obj2);
                k1Var.f15427d = j5;
                return k1Var.invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f15424a) {
            case 0:
                int i7 = this.f15425b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    t1 t1Var = this.f15426c.E;
                    long j5 = this.f15427d;
                    this.f15425b = 1;
                    Object objB = t1Var.b(j5, false, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            case 1:
                int i10 = this.f15425b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    t1 t1Var2 = this.f15426c.E;
                    l1 l1Var = new l1(this.f15427d, null);
                    this.f15425b = 1;
                    Object objF = t1Var2.f(x.v0.f14492b, l1Var, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            case 2:
                int i11 = this.f15425b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    t1 t1Var3 = this.f15426c.E;
                    long j10 = this.f15427d;
                    this.f15425b = 1;
                    Object objB2 = t1Var3.b(j10, true, this);
                    z8.a aVar3 = z8.a.f15774a;
                    if (objB2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            default:
                int i12 = this.f15425b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return obj;
                }
                t8.a.e(obj);
                long j11 = this.f15427d;
                t1 t1Var4 = this.f15426c.E;
                this.f15425b = 1;
                Object objA = androidx.compose.foundation.gestures.a.a(t1Var4, j11, this);
                z8.a aVar4 = z8.a.f15774a;
                return objA == aVar4 ? aVar4 : objA;
        }
    }
}
