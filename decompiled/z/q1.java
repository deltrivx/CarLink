package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1 f15460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i9.w f15461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1 f15465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i9.w f15466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f15467h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(t1 t1Var, i9.w wVar, long j5, y8.c cVar) {
        super(2, cVar);
        this.f15465f = t1Var;
        this.f15466g = wVar;
        this.f15467h = j5;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        q1 q1Var = new q1(this.f15465f, this.f15466g, this.f15467h, cVar);
        q1Var.f15464e = obj;
        return q1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((r1) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        t1 t1Var;
        i9.w wVar;
        long j5;
        t1 t1Var2;
        int i7 = this.f15463d;
        x0 x0Var = x0.f15592b;
        if (i7 == 0) {
            t8.a.e(obj);
            r1 r1Var = (r1) this.f15464e;
            t1Var = this.f15465f;
            p1 p1Var = new p1(t1Var, r1Var);
            h hVar = t1Var.f15519c;
            i9.w wVar2 = this.f15466g;
            long j10 = wVar2.f6687a;
            x0 x0Var2 = t1Var.f15520d;
            long j11 = this.f15467h;
            float fD = t1Var.d(x0Var2 == x0Var ? n3.t.b(j11) : n3.t.c(j11));
            this.f15464e = t1Var;
            this.f15460a = t1Var;
            this.f15461b = wVar2;
            this.f15462c = j10;
            this.f15463d = 1;
            hVar.getClass();
            obj = cc.b0.A(androidx.compose.foundation.gestures.a.f795c, new g(fD, hVar, p1Var, null), this);
            z8.a aVar = z8.a.f15774a;
            if (obj == aVar) {
                return aVar;
            }
            wVar = wVar2;
            j5 = j10;
            t1Var2 = t1Var;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = this.f15462c;
            wVar = this.f15461b;
            t1Var = this.f15460a;
            t1Var2 = (t1) this.f15464e;
            t8.a.e(obj);
        }
        float fD2 = t1Var2.d(((Number) obj).floatValue());
        wVar.f6687a = t1Var.f15520d == x0Var ? n3.t.a(j5, fD2, 0.0f, 2) : n3.t.a(j5, 0.0f, fD2, 1);
        return t8.z.f12851a;
    }
}
