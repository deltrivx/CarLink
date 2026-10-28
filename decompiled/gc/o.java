package gc;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc.d[] f6250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f6252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec.h f6253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fc.d[] dVarArr, int i7, AtomicInteger atomicInteger, ec.h hVar, y8.c cVar) {
        super(2, cVar);
        this.f6250b = dVarArr;
        this.f6251c = i7;
        this.f6252d = atomicInteger;
        this.f6253e = hVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new o(this.f6250b, this.f6251c, this.f6252d, this.f6253e, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6249a;
        AtomicInteger atomicInteger = this.f6252d;
        ec.h hVar = this.f6253e;
        try {
            if (i7 == 0) {
                t8.a.e(obj);
                fc.d[] dVarArr = this.f6250b;
                int i10 = this.f6251c;
                fc.d dVar = dVarArr[i10];
                n nVar = new n(hVar, i10);
                this.f6249a = 1;
                Object objL = dVar.l(nVar, this);
                z8.a aVar = z8.a.f15774a;
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8.a.e(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                k9.a.n(hVar);
            }
            return t8.z.f12851a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                k9.a.n(hVar);
            }
            throw th;
        }
    }
}
