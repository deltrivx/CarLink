package h0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6308b = new ArrayList();

    @Override // r1.p
    public final /* synthetic */ r1.p a(r1.p pVar) {
        return ob.a.g(this, pVar);
    }

    @Override // r1.p
    public final Object g(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // r1.p
    public final boolean h(h9.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(a9.c cVar) throws Throwable {
        d dVar;
        i9.x xVar;
        Throwable th;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i7 = dVar.f6299d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f6299d = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f6297b;
        int i10 = dVar.f6299d;
        ArrayList arrayList = this.f6308b;
        if (i10 == 0) {
            t8.a.e(obj);
            if (!this.f6307a) {
                i9.x xVar2 = new i9.x();
                try {
                    dVar.f6296a = xVar2;
                    dVar.f6299d = 1;
                    cc.l lVar = new cc.l(1, n4.h.L(dVar));
                    lVar.p();
                    xVar2.f6688a = lVar;
                    arrayList.add(lVar);
                    Object objO = lVar.o();
                    z8.a aVar = z8.a.f15774a;
                    if (objO == aVar) {
                        return aVar;
                    }
                    xVar = xVar2;
                    Object obj2 = xVar.f6688a;
                    i9.b0.a(arrayList);
                    arrayList.remove(obj2);
                } catch (Throwable th2) {
                    xVar = xVar2;
                    th = th2;
                    Object obj3 = xVar.f6688a;
                    i9.b0.a(arrayList);
                    arrayList.remove(obj3);
                    throw th;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = dVar.f6296a;
            try {
                t8.a.e(obj);
                Object obj4 = xVar.f6688a;
                i9.b0.a(arrayList);
                arrayList.remove(obj4);
            } catch (Throwable th3) {
                th = th3;
                Object obj5 = xVar.f6688a;
                i9.b0.a(arrayList);
                arrayList.remove(obj5);
                throw th;
            }
        }
        return t8.z.f12851a;
    }
}
