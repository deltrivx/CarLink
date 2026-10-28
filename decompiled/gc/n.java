package gc;

import cc.a2;
import cc.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec.h f6247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6248b;

    public n(ec.h hVar, int i7) {
        this.f6247a = hVar;
        this.f6248b = i7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        m mVar;
        Object obj2;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i7 = mVar.f6246c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                mVar.f6246c = i7 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj3 = mVar.f6244a;
        int i10 = mVar.f6246c;
        t8.z zVar = t8.z.f12851a;
        z8.a aVar = z8.a.f15774a;
        if (i10 == 0) {
            t8.a.e(obj3);
            u8.z zVar2 = new u8.z(this.f6248b, obj);
            mVar.f6246c = 1;
            if (this.f6247a.g(zVar2, mVar) != aVar) {
            }
        }
        if (i10 == 1) {
            t8.a.e(obj3);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj3);
        }
        mVar.f6246c = 2;
        y8.h context = mVar.getContext();
        b0.i(context);
        y8.c cVarL = n4.h.L(mVar);
        hc.f fVar = cVarL instanceof hc.f ? (hc.f) cVarL : null;
        if (fVar == null) {
            obj2 = zVar;
        } else {
            cc.u uVar = fVar.f6508d;
            if (uVar.v(context)) {
                fVar.f6510f = zVar;
                fVar.f2632c = 1;
                uVar.u(context, fVar);
            } else {
                y8.h hVarS = context.s(new a2(a2.f2588b));
                fVar.f6510f = zVar;
                fVar.f2632c = 1;
                uVar.u(hVarS, fVar);
            }
            obj2 = aVar;
        }
        if (obj2 != aVar) {
            obj2 = zVar;
        }
        return obj2 == aVar ? aVar : zVar;
    }
}
