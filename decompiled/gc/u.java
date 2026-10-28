package gc;

import cc.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends a9.c implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fc.e f6267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y8.h f6268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y8.h f6270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y8.c f6271e;

    public u(fc.e eVar, y8.h hVar) {
        super(s.f6265a, y8.i.f15108a);
        this.f6267a = eVar;
        this.f6268b = hVar;
        this.f6269c = ((Number) hVar.q(new g0.g(2), 0)).intValue();
    }

    public final Object g(y8.c cVar, Object obj) {
        y8.h context = cVar.getContext();
        b0.i(context);
        y8.h hVar = this.f6270d;
        if (hVar != context) {
            if (hVar instanceof q) {
                throw new IllegalStateException(zb.k.g0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) hVar).f6264b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.q(new b3.a(12, this), 0)).intValue() != this.f6269c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f6268b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f6270d = context;
        }
        this.f6271e = cVar;
        h9.o oVar = w.f6273a;
        fc.e eVar = this.f6267a;
        i9.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = oVar.invoke(eVar, obj, this);
        if (!i9.l.a(objInvoke, z8.a.f15774a)) {
            this.f6271e = null;
        }
        return objInvoke;
    }

    @Override // a9.a, a9.d
    public final a9.d getCallerFrame() {
        y8.c cVar = this.f6271e;
        if (cVar instanceof a9.d) {
            return (a9.d) cVar;
        }
        return null;
    }

    @Override // a9.c, y8.c
    public final y8.h getContext() {
        y8.h hVar = this.f6270d;
        return hVar == null ? y8.i.f15108a : hVar;
    }

    @Override // a9.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        try {
            Object objG = g(cVar, obj);
            return objG == z8.a.f15774a ? objG : t8.z.f12851a;
        } catch (Throwable th) {
            this.f6270d = new q(th, cVar.getContext());
            throw th;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = t8.m.a(obj);
        if (thA != null) {
            this.f6270d = new q(thA, getContext());
        }
        y8.c cVar = this.f6271e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return z8.a.f15774a;
    }
}
