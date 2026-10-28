package k2;

import w0.t0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j5, l0 l0Var, y8.c cVar) {
        super(2, cVar);
        this.f7225a = 0;
        this.f7227c = j5;
        this.f7228d = l0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, long j5, y8.c cVar, int i7) {
        super(2, cVar);
        this.f7225a = i7;
        this.f7228d = obj;
        this.f7227c = j5;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f7225a) {
            case 0:
                return new j0(this.f7227c, (l0) this.f7228d, cVar);
            case 1:
                return new j0((q3.i) this.f7228d, this.f7227c, cVar, 1);
            default:
                return new j0((v.c) this.f7228d, this.f7227c, cVar, 2);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f7225a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((j0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        cc.l lVar;
        switch (this.f7225a) {
            case 0:
                int i7 = this.f7226b;
                long j5 = this.f7227c;
                z8.a aVar = z8.a.f15774a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        t8.a.e(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    lVar = ((l0) this.f7228d).f7248c;
                    if (lVar != null) {
                        lVar.resumeWith(t8.a.b(new p(j5)));
                    }
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                this.f7226b = 1;
                if (cc.b0.h(j5 - 8, this) == aVar) {
                    return aVar;
                }
                this.f7226b = 2;
                if (cc.b0.h(8L, this) == aVar) {
                    return aVar;
                }
                lVar = ((l0) this.f7228d).f7248c;
                if (lVar != null) {
                    lVar.resumeWith(t8.a.b(new p(j5)));
                }
                return t8.z.f12851a;
            case 1:
                int i10 = this.f7226b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    j2.d dVar = ((q3.i) this.f7228d).f10896a;
                    this.f7226b = 1;
                    Object objB = dVar.b(this.f7227c, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objB == aVar2) {
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
                int i11 = this.f7226b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    v.c cVar = (v.c) this.f7228d;
                    x1.b bVar = new x1.b(this.f7227c);
                    v.g0 g0Var = t0.f13938d;
                    this.f7226b = 1;
                    Object objC = v.c.c(cVar, bVar, g0Var, null, this, 12);
                    z8.a aVar3 = z8.a.f15774a;
                    if (objC == aVar3) {
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
