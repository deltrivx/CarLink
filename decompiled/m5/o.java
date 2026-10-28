package m5;

import k2.z;
import z.e2;
import z.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f8514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(l lVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f8511a = i7;
        this.f8514d = lVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f8511a) {
            case 0:
                o oVar = new o(this.f8514d, cVar, 0);
                oVar.f8513c = obj;
                return oVar;
            default:
                o oVar2 = new o(this.f8514d, cVar, 1);
                oVar2.f8513c = obj;
                return oVar2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f8511a) {
            case 0:
                break;
        }
        return ((o) create(zVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8511a) {
            case 0:
                int i7 = this.f8512b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    z zVar = (z) this.f8513c;
                    c8.k kVar = new c8.k(20, this.f8514d);
                    this.f8512b = 1;
                    Object objE = e2.e(zVar, null, kVar, this, 7);
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
            default:
                int i10 = this.f8512b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    z zVar2 = (z) this.f8513c;
                    p pVar = new p(this.f8514d, 0);
                    this.f8512b = 1;
                    Object objE2 = y.e(zVar2, pVar, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objE2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
        }
    }
}
