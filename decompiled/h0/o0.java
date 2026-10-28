package h0;

import x.o1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, int i7, y8.c cVar, int i10) {
        super(2, cVar);
        this.f6345a = i10;
        this.f6348d = obj;
        this.f6347c = i7;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f6345a) {
            case 0:
                return new o0((p0) this.f6348d, this.f6347c, cVar, 0);
            case 1:
                return new o0((o1) this.f6348d, this.f6347c, cVar, 1);
            default:
                return new o0((f0.u) this.f6348d, this.f6347c, cVar, 2);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f6345a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((o0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6345a) {
            case 0:
                int i7 = this.f6346b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    l0 l0Var = ((p0) this.f6348d).f6350p;
                    this.f6346b = 1;
                    Object objE = l0Var.e(this.f6347c, this);
                    z8.a aVar = z8.a.f15774a;
                    if (objE == aVar) {
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
                int i10 = this.f6346b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    o1 o1Var = (o1) this.f6348d;
                    this.f6346b = 1;
                    Object objS = n3.l.S(o1Var, this.f6347c - o1Var.f14445a.f(), this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objS == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            default:
                int i11 = this.f6346b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    f0.u uVar = (f0.u) this.f6348d;
                    this.f6346b = 1;
                    Object objI = f0.u.i(uVar, this.f6347c, this);
                    z8.a aVar3 = z8.a.f15774a;
                    if (objI == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
        }
    }
}
