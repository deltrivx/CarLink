package x;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lc.a f14504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f14507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f14509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f14510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0 f14511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a9.i f14512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14513j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(v0 v0Var, z0 z0Var, h9.n nVar, Object obj, y8.c cVar) {
        super(2, cVar);
        this.f14510g = v0Var;
        this.f14511h = z0Var;
        this.f14512i = (a9.i) nVar;
        this.f14513j = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [a9.i, h9.n] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        y0 y0Var = new y0(this.f14510g, this.f14511h, this.f14512i, this.f14513j, cVar);
        y0Var.f14509f = obj;
        return y0Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [h9.n] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        x0 x0Var;
        z0 z0Var;
        ?? r8;
        lc.a aVar;
        x0 x0Var2;
        lc.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i7 = this.f14508e;
        z8.a aVar3 = z8.a.f15774a;
        try {
            try {
                if (i7 == 0) {
                    t8.a.e(obj);
                    y8.f fVarL = ((cc.y) this.f14509f).u().l(cc.v.f2678b);
                    i9.l.b(fVarL);
                    x0 x0Var3 = new x0(this.f14510g, (cc.a1) fVarL);
                    z0 z0Var2 = this.f14511h;
                    z0.a(z0Var2, x0Var3);
                    lc.c cVar = z0Var2.f14516b;
                    this.f14509f = x0Var3;
                    this.f14504a = cVar;
                    a9.i iVar = this.f14512i;
                    this.f14505b = iVar;
                    Object obj3 = this.f14513j;
                    this.f14506c = obj3;
                    this.f14507d = z0Var2;
                    this.f14508e = 1;
                    if (cVar.d(this) != aVar3) {
                        obj2 = obj3;
                        x0Var = x0Var3;
                        z0Var = z0Var2;
                        aVar = cVar;
                        r8 = iVar;
                    }
                    return aVar3;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z0Var = (z0) this.f14505b;
                    lc.a aVar4 = this.f14504a;
                    x0Var2 = (x0) this.f14509f;
                    try {
                        t8.a.e(obj);
                        aVar2 = aVar4;
                        atomicReference2 = z0Var.f14515a;
                        while (!atomicReference2.compareAndSet(x0Var2, null) && atomicReference2.get() == x0Var2) {
                        }
                        ((lc.c) aVar2).f(null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = z0Var.f14515a;
                        while (!atomicReference.compareAndSet(x0Var2, null)) {
                        }
                        throw th;
                    }
                }
                z0Var = this.f14507d;
                obj2 = this.f14506c;
                h9.n nVar = (h9.n) this.f14505b;
                lc.a aVar5 = this.f14504a;
                x0Var = (x0) this.f14509f;
                t8.a.e(obj);
                r8 = nVar;
                aVar = aVar5;
                this.f14509f = x0Var;
                this.f14504a = aVar;
                this.f14505b = z0Var;
                this.f14506c = null;
                this.f14507d = null;
                this.f14508e = 2;
                obj = r8.invoke(obj2, this);
                if (obj != aVar3) {
                    aVar2 = aVar;
                    x0Var2 = x0Var;
                    atomicReference2 = z0Var.f14515a;
                    while (!atomicReference2.compareAndSet(x0Var2, null)) {
                    }
                    ((lc.c) aVar2).f(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th2) {
                th = th2;
                x0Var2 = x0Var;
                atomicReference = z0Var.f14515a;
                while (!atomicReference.compareAndSet(x0Var2, null) && atomicReference.get() == x0Var2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((lc.c) 2).f(null);
            throw th3;
        }
    }
}
