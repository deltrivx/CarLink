package kc;

import cc.j;
import cc.z1;
import h9.k;
import h9.n;
import h9.o;
import hc.q;
import hc.s;
import i9.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t8.z;
import u8.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements cc.i, f, z1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7520f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.h f7521a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7523c;
    private volatile /* synthetic */ Object state$volatile = h.f7527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f7522b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7524d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7525e = h.f7530d;

    public e(y8.h hVar) {
        this.f7521a = hVar;
    }

    @Override // cc.z1
    public final void a(q qVar, int i7) {
        this.f7523c = qVar;
        this.f7524d = i7;
    }

    @Override // cc.i
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7520f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f7528b) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f7529c)) {
                    ArrayList arrayList = this.f7522b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a();
                    }
                    this.f7525e = h.f7530d;
                    this.f7522b = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final Object c(a9.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7520f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.f7525e;
        ArrayList<c> arrayList = this.f7522b;
        if (arrayList != null) {
            for (c cVar3 : arrayList) {
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f7528b);
            this.f7525e = h.f7530d;
            this.f7522b = null;
        }
        Object objInvoke = cVar2.f7509c.invoke(cVar2.f7507a, cVar2.f7510d, obj2);
        a9.d dVar = cVar2.f7511e;
        return cVar2.f7510d == h.f7531e ? ((k) dVar).invoke(cVar) : ((n) dVar).invoke(objInvoke, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(a9.c cVar) {
        d dVar;
        Object obj;
        e eVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i7 = dVar.f7519d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f7519d = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj2 = dVar.f7517b;
        int i10 = dVar.f7519d;
        z8.a aVar = z8.a.f15774a;
        if (i10 == 0) {
            t8.a.e(obj2);
            dVar.f7516a = this;
            dVar.f7519d = 1;
            cc.l lVar = new cc.l(1, n4.h.L(dVar));
            lVar.p();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7520f;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                obj = z.f12851a;
                s sVar = h.f7527a;
                if (obj3 == sVar) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, lVar)) {
                            lVar.s(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof List)) {
                        if (!(obj3 instanceof c)) {
                            throw new IllegalStateException(("unexpected state: " + obj3).toString());
                        }
                        c cVar2 = (c) obj3;
                        Object obj4 = this.f7525e;
                        o oVar = cVar2.f7512f;
                        lVar.e(obj, oVar != null ? (o) oVar.invoke(this, cVar2.f7510d, obj4) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, sVar)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                c cVarE = e(it.next());
                                l.b(cVarE);
                                cVarE.f7513g = null;
                                cVarE.f7514h = -1;
                                f(cVarE, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            Object objO = lVar.o();
            if (objO == aVar) {
                obj = objO;
            }
            if (obj != aVar) {
                eVar = this;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj2);
            return obj2;
        }
        eVar = dVar.f7516a;
        t8.a.e(obj2);
        dVar.f7516a = null;
        dVar.f7519d = 2;
        Object objC = eVar.c(dVar);
        return objC == aVar ? aVar : objC;
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f7522b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((c) obj3).f7507a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z10) {
        Object obj = cVar.f7507a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7520f;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z10) {
            ArrayList arrayList = this.f7522b;
            l.b(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).f7507a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f7508b.invoke(obj, this, cVar.f7510d);
        if (this.f7525e != h.f7530d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z10) {
            ArrayList arrayList2 = this.f7522b;
            l.b(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.f7513g = this.f7523c;
        cVar.f7514h = this.f7524d;
        this.f7523c = null;
        this.f7524d = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7520f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof j)) {
                if (l.a(obj3, h.f7528b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (l.a(obj3, h.f7529c)) {
                    return 2;
                }
                if (l.a(obj3, h.f7527a)) {
                    List listI = n3.l.I(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listI)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListY0 = p.y0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListY0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            c cVarE = e(obj);
            if (cVarE != null) {
                o oVar = cVarE.f7512f;
                o oVar2 = oVar != null ? (o) oVar.invoke(this, cVarE.f7510d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, cVarE)) {
                        j jVar = (j) obj3;
                        this.f7525e = obj2;
                        s sVarF = jVar.f(z.f12851a, oVar2);
                        if (sVarF == null) {
                            this.f7525e = h.f7530d;
                            return 2;
                        }
                        jVar.z(sVarF);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }
}
