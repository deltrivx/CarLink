package l0;

import f1.w2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7621a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0.u uVar, h9.k kVar, n9.d dVar, w2 w2Var, y8.c cVar) {
        super(2, cVar);
        this.f7622b = uVar;
        this.f7623c = kVar;
        this.f7624d = dVar;
        this.f7625e = w2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k2.z zVar, b1 b1Var, w0.t1 t1Var, y8.c cVar) {
        super(2, cVar);
        this.f7623c = zVar;
        this.f7624d = b1Var;
        this.f7625e = t1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f7621a) {
            case 0:
                d0 d0Var = new d0((k2.z) this.f7623c, (b1) this.f7624d, (w0.t1) this.f7625e, cVar);
                d0Var.f7622b = obj;
                return d0Var;
            default:
                return new d0((f0.u) this.f7622b, (h9.k) this.f7623c, (n9.d) this.f7624d, (w2) this.f7625e, cVar);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f7621a) {
            case 0:
                d0 d0Var = (d0) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                d0Var.invokeSuspend(zVar);
                return zVar;
            default:
                d0 d0Var2 = (d0) create(yVar, cVar);
                t8.z zVar2 = t8.z.f12851a;
                d0Var2.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7621a) {
            case 0:
                t8.a.e(obj);
                cc.y yVar = (cc.y) this.f7622b;
                k2.z zVar = (k2.z) this.f7623c;
                y8.c cVar = null;
                cc.b0.s(yVar, null, new c0(zVar, (b1) this.f7624d, cVar, 0), 1);
                cc.b0.s(yVar, null, new b0.g(zVar, (w0.t1) this.f7625e, cVar, 10), 1);
                break;
            default:
                t8.a.e(obj);
                if (!((f0.u) this.f7622b).f4860i.a()) {
                    h9.k kVar = (h9.k) this.f7623c;
                    int iIntValue = ((Number) ((w2) this.f7625e).getValue()).intValue();
                    n9.d dVar = (n9.d) this.f7624d;
                    kVar.invoke(new Integer(n3.r.m(iIntValue, dVar.f8965a, dVar.f8966b)));
                }
                break;
        }
        return t8.z.f12851a;
    }
}
