package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2.z f7609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f7610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(k2.z zVar, b1 b1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f7607a = i7;
        this.f7609c = zVar;
        this.f7610d = b1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f7607a) {
            case 0:
                return new c0(this.f7609c, this.f7610d, cVar, 0);
            case 1:
                return new c0(this.f7609c, this.f7610d, cVar, 1);
            default:
                return new c0(this.f7609c, this.f7610d, cVar, 2);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f7607a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f7607a;
        final int i10 = 0;
        final b1 b1Var = this.f7610d;
        k2.z zVar = this.f7609c;
        z8.a aVar = z8.a.f15774a;
        t8.z zVar2 = t8.z.f12851a;
        final int i11 = 1;
        switch (i7) {
            case 0:
                int i12 = this.f7608b;
                if (i12 == 0) {
                    t8.a.e(obj);
                    this.f7608b = 1;
                    if (q0.l(zVar, b1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return zVar2;
            case 1:
                int i13 = this.f7608b;
                if (i13 == 0) {
                    t8.a.e(obj);
                    this.f7608b = 1;
                    Object objL = n4.h.l(zVar, new x0(b1Var, (y8.c) null, i10), this);
                    if (objL != aVar) {
                        objL = zVar2;
                    }
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return zVar2;
            default:
                int i14 = this.f7608b;
                if (i14 == 0) {
                    t8.a.e(obj);
                    this.f7608b = 1;
                    v0 v0Var = new v0(b1Var, 0);
                    h9.a aVar2 = new h9.a() { // from class: l0.w0
                        @Override // h9.a
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    b1Var.b();
                                    break;
                                default:
                                    b1Var.onCancel();
                                    break;
                            }
                            return t8.z.f12851a;
                        }
                    };
                    h9.a aVar3 = new h9.a() { // from class: l0.w0
                        @Override // h9.a
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    b1Var.b();
                                    break;
                                default:
                                    b1Var.onCancel();
                                    break;
                            }
                            return t8.z.f12851a;
                        }
                    };
                    b3.a aVar4 = new b3.a(16, b1Var);
                    float f10 = z.y.f15597a;
                    Object objL2 = n4.h.l(zVar, new z.u(new w0.e1(12), new i9.w(), null, new cc.k(5, v0Var), aVar4, aVar3, new w0.b1(aVar2, 3), null), this);
                    if (objL2 != aVar) {
                        objL2 = zVar2;
                    }
                    if (objL2 != aVar) {
                        objL2 = zVar2;
                    }
                    if (objL2 != aVar) {
                        objL2 = zVar2;
                    }
                    if (objL2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return zVar2;
        }
    }
}
