package z;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2.z f15290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f15291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k3.a f15292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a8.u0 f15293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f15294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f15295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a8.l f15296i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k2.z zVar, f0 f0Var, k3.a aVar, a8.u0 u0Var, z zVar2, z zVar3, a8.l lVar, y8.c cVar) {
        super(2, cVar);
        this.f15290c = zVar;
        this.f15291d = f0Var;
        this.f15292e = aVar;
        this.f15293f = u0Var;
        this.f15294g = zVar2;
        this.f15295h = zVar3;
        this.f15296i = lVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        a0 a0Var = new a0(this.f15290c, this.f15291d, this.f15292e, this.f15293f, this.f15294g, this.f15295h, this.f15296i, cVar);
        a0Var.f15289b = obj;
        return a0Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        cc.y yVar;
        CancellationException cancellationException;
        ec.h hVar;
        int i7 = this.f15288a;
        t8.z zVar = t8.z.f12851a;
        f0 f0Var = this.f15291d;
        if (i7 == 0) {
            t8.a.e(obj);
            cc.y yVar2 = (cc.y) this.f15289b;
            try {
                k2.z zVar2 = this.f15290c;
                x0 x0Var = f0Var.f15367q;
                k3.a aVar = this.f15292e;
                a8.u0 u0Var = this.f15293f;
                z zVar3 = this.f15294g;
                z zVar4 = this.f15295h;
                a8.l lVar = this.f15296i;
                this.f15289b = yVar2;
                this.f15288a = 1;
                float f10 = y.f15597a;
                Object objL = n4.h.l(zVar2, new u(zVar4, new i9.w(), x0Var, aVar, lVar, zVar3, u0Var, null), this);
                z8.a aVar2 = z8.a.f15774a;
                if (objL != aVar2) {
                    objL = zVar;
                }
                if (objL == aVar2) {
                    return aVar2;
                }
            } catch (CancellationException e7) {
                e = e7;
                yVar = yVar2;
                cancellationException = e;
                hVar = f0Var.f15371u;
                if (hVar != null) {
                    hVar.x(k.f15419a);
                }
                if (!cc.b0.q(yVar)) {
                    throw cancellationException;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (cc.y) this.f15289b;
            try {
                t8.a.e(obj);
            } catch (CancellationException e10) {
                e = e10;
                cancellationException = e;
                hVar = f0Var.f15371u;
                if (hVar != null) {
                    hVar.x(k.f15419a);
                }
                if (!cc.b0.q(yVar)) {
                    throw cancellationException;
                }
            }
        }
        return zVar;
    }
}
