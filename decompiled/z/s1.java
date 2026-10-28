package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f15501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f15502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, y8.c cVar) {
        super(2, cVar);
        this.f15502d = t1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        s1 s1Var = new s1(this.f15502d, cVar);
        s1Var.f15501c = ((n3.t) obj).f8763a;
        return s1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        long j5 = ((n3.t) obj).f8763a;
        s1 s1Var = new s1(this.f15502d, (y8.c) obj2);
        s1Var.f15501c = j5;
        return s1Var.invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        long j5;
        long j10;
        long j11;
        long j12;
        long j13;
        int i7 = this.f15500b;
        t1 t1Var = this.f15502d;
        z8.a aVar = z8.a.f15774a;
        if (i7 == 0) {
            t8.a.e(obj);
            j5 = this.f15501c;
            j2.d dVar = t1Var.f15522f;
            this.f15501c = j5;
            this.f15500b = 1;
            obj = dVar.b(j5, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i7 == 1) {
            j5 = this.f15501c;
            t8.a.e(obj);
        } else {
            if (i7 == 2) {
                j10 = this.f15499a;
                j5 = this.f15501c;
                t8.a.e(obj);
                j11 = ((n3.t) obj).f8763a;
                j2.d dVar2 = t1Var.f15522f;
                long jD = n3.t.d(j10, j11);
                this.f15501c = j5;
                this.f15499a = j11;
                this.f15500b = 3;
                obj = dVar2.a(jD, j11, this);
                if (obj != aVar) {
                    j12 = j5;
                    j13 = j11;
                }
                return aVar;
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.f15499a;
            j12 = this.f15501c;
            t8.a.e(obj);
        }
        return new n3.t(n3.t.d(j12, n3.t.d(j13, ((n3.t) obj).f8763a)));
        long jD2 = n3.t.d(j5, ((n3.t) obj).f8763a);
        this.f15501c = j5;
        this.f15499a = jD2;
        this.f15500b = 2;
        obj = t1Var.a(jD2, this);
        if (obj != aVar) {
            j10 = jD2;
            j11 = ((n3.t) obj).f8763a;
            j2.d dVar3 = t1Var.f15522f;
            long jD3 = n3.t.d(j10, j11);
            this.f15501c = j5;
            this.f15499a = j11;
            this.f15500b = 3;
            obj = dVar3.a(jD3, j11, this);
            if (obj != aVar) {
                j12 = j5;
                j13 = j11;
                return new n3.t(n3.t.d(j12, n3.t.d(j13, ((n3.t) obj).f8763a)));
            }
        }
        return aVar;
    }
}
