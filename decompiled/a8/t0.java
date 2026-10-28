package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(i0.e eVar, q2.h1 h1Var, k2.d dVar, j1 j1Var, y8.c cVar) {
        super(2, cVar);
        this.f240c = eVar;
        this.f241d = h1Var;
        this.f242e = dVar;
        this.f243f = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(n8.q qVar, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, f1.b1 b1Var4, y8.c cVar) {
        super(2, cVar);
        this.f239b = qVar;
        this.f240c = b1Var;
        this.f241d = b1Var2;
        this.f242e = b1Var3;
        this.f243f = b1Var4;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f238a) {
            case 0:
                return new t0((n8.q) this.f239b, (f1.b1) this.f240c, (f1.b1) this.f241d, (f1.b1) this.f242e, (f1.b1) this.f243f, cVar);
            default:
                t0 t0Var = new t0((i0.e) this.f240c, (q2.h1) this.f241d, (k2.d) this.f242e, (j1) this.f243f, cVar);
                t0Var.f239b = obj;
                return t0Var;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f238a) {
            case 0:
                t0 t0Var = (t0) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                t0Var.invokeSuspend(zVar);
                return zVar;
            default:
                return ((t0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f238a) {
            case 0:
                t8.a.e(obj);
                f1.b1 b1Var = (f1.b1) this.f240c;
                if (((String) b1Var.getValue()).length() > 0) {
                    ((f1.b1) this.f241d).setValue(((n8.q) this.f239b).i());
                    ((f1.b1) this.f242e).setValue((String) b1Var.getValue());
                    x0.f((f1.b1) this.f243f, false);
                }
                return t8.z.f12851a;
            default:
                t8.a.e(obj);
                cc.y yVar = (cc.y) this.f239b;
                i0.e eVar = (i0.e) this.f240c;
                y8.c cVar = null;
                cc.b0.s(yVar, null, new b1.f(eVar, (q2.h1) this.f241d, (k2.d) this.f242e, cVar, 5), 3);
                return cc.b0.s(yVar, null, new b0.g(eVar, (j1) this.f243f, cVar, 8), 3);
        }
    }
}
