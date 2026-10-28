package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f13894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3.q0 f13897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1 f13898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g3.q f13899g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(t tVar, String str, long j5, b3.q0 q0Var, t1 t1Var, g3.q qVar, y8.c cVar) {
        super(2, cVar);
        this.f13894b = tVar;
        this.f13895c = str;
        this.f13896d = j5;
        this.f13897e = q0Var;
        this.f13898f = t1Var;
        this.f13899g = qVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new q1(this.f13894b, this.f13895c, this.f13896d, this.f13897e, this.f13898f, this.f13899g, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7 = this.f13893a;
        String str = this.f13895c;
        if (i7 == 0) {
            t8.a.e(obj);
            this.f13893a = 1;
            t tVar = this.f13894b;
            tVar.getClass();
            if (str.length() == 0) {
                obj = null;
            } else {
                long j5 = this.f13896d;
                if (b3.q0.c(j5)) {
                    obj = null;
                } else {
                    obj = cc.b0.A(tVar.f13927a, new fc.i(tVar, new s(j5, str, tVar, null), (y8.c) null), this);
                }
            }
            z8.a aVar = z8.a.f15774a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        b3.q0 q0Var = (b3.q0) obj;
        t8.z zVar = t8.z.f12851a;
        if (q0Var != null) {
            long j10 = q0Var.f1430a;
            g3.q qVar = this.f13899g;
            long jB = b3.g0.b(qVar.a((int) (j10 >> 32)), qVar.a((int) (j10 & 4294967295L)));
            if (!b3.q0.a(jB, this.f13897e)) {
                t1 t1Var = this.f13898f;
                if (i9.l.a(t1Var.m().f5889a.f1353b, str) && qVar == t1Var.f13940b) {
                    t1Var.f13941c.invoke(t1.e(t1Var.m().f5889a, jB));
                    t1Var.f13959v = new b3.q0(jB);
                }
            }
        }
        return zVar;
    }
}
