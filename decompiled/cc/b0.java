package cc;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hc.s f2590a = new hc.s(0, "RESUME_TOKEN");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hc.s f2591b = new hc.s(0, "REMOVED_TASK");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hc.s f2592c = new hc.s(0, "CLOSED_EMPTY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hc.s f2593d = new hc.s(0, "COMPLETING_ALREADY");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hc.s f2594e = new hc.s(0, "COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hc.s f2595f = new hc.s(0, "COMPLETING_RETRY");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hc.s f2596g = new hc.s(0, "TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hc.s f2597h = new hc.s(0, "SEALED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n0 f2598i = new n0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n0 f2599j = new n0(true);

    public static final Object A(y8.h hVar, h9.n nVar, a9.c cVar) throws Throwable {
        y8.h context = cVar.getContext();
        y8.h hVarS = !((Boolean) hVar.q(new b3.a0(25), Boolean.FALSE)).booleanValue() ? context.s(hVar) : j(context, hVar, false);
        i(hVarS);
        if (hVarS == context) {
            hc.p pVar = new hc.p(cVar, hVarS);
            return o9.e0.Q(pVar, pVar, nVar);
        }
        y8.d dVar = y8.d.f15107a;
        if (i9.l.a(hVarS.l(dVar), context.l(dVar))) {
            x1 x1Var = new x1(hVarS, cVar);
            y8.h hVar2 = x1Var.f2587c;
            Object objL = hc.a.l(hVar2, null);
            try {
                return o9.e0.Q(x1Var, x1Var, nVar);
            } finally {
                hc.a.g(hVar2, objL);
            }
        }
        i0 i0Var = new i0(cVar, hVarS);
        try {
            hc.a.h(t8.z.f12851a, n4.h.L(n4.h.x(nVar, i0Var, i0Var)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i0.f2630e;
            do {
                int i7 = atomicIntegerFieldUpdater.get(i0Var);
                if (i7 != 0) {
                    if (i7 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objY = y(h1.f2628a.get(i0Var));
                    if (objY instanceof r) {
                        throw ((r) objY).f2662a;
                    }
                    return objY;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(i0Var, 0, 1));
            return z8.a.f15774a;
        } catch (Throwable th) {
            i0Var.resumeWith(t8.a.b(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(long j5, h9.n nVar, a9.c cVar) throws Throwable {
        v1 v1Var;
        i9.x xVar;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i7 = v1Var.f2682c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                v1Var.f2682c = i7 - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(cVar);
            }
        } else {
            v1Var = new v1(cVar);
        }
        Object obj = v1Var.f2681b;
        int i10 = v1Var.f2682c;
        if (i10 == 0) {
            t8.a.e(obj);
            if (j5 <= 0) {
                return null;
            }
            i9.x xVar2 = new i9.x();
            try {
                v1Var.f2680a = xVar2;
                v1Var.f2682c = 1;
                u1 u1Var = new u1(j5, v1Var);
                xVar2.f6688a = u1Var;
                Object objW = w(u1Var, nVar);
                z8.a aVar = z8.a.f15774a;
                return objW == aVar ? aVar : objW;
            } catch (t1 e7) {
                e = e7;
                xVar = xVar2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = v1Var.f2680a;
            try {
                t8.a.e(obj);
                return obj;
            } catch (t1 e10) {
                e = e10;
            }
        }
        if (e.f2674a == xVar.f6688a) {
            return null;
        }
        throw e;
    }

    public static final hc.c a(y8.h hVar) {
        if (hVar.l(v.f2678b) == null) {
            hVar = hVar.s(new c1(null));
        }
        return new hc.c(hVar);
    }

    public static q1 b() {
        return new q1(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(ArrayList arrayList, y8.c cVar) {
        if (arrayList.isEmpty()) {
            return u8.w.f13122a;
        }
        e0[] e0VarArr = (e0[]) arrayList.toArray(new e0[0]);
        e eVar = new e(e0VarArr);
        l lVar = new l(1, n4.h.L(cVar));
        lVar.p();
        int length = e0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i7 = 0; i7 < length; i7++) {
            k1 k1Var = e0VarArr[i7];
            ((h1) k1Var).start();
            c cVar2 = new c(eVar, lVar);
            cVar2.f2603f = p(k1Var, true, cVar2);
            cVarArr[i7] = cVar2;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar3 = cVarArr[i10];
            cVar3.getClass();
            c.f2601h.set(cVar3, dVar);
        }
        if (l.f2638g.get(lVar) instanceof m1) {
            lVar.s(dVar);
        } else {
            dVar.a();
        }
        return lVar.o();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void d(a9.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i7 = h0Var.f2627b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                h0Var.f2627b = i7 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(cVar);
            }
        } else {
            h0Var = new h0(cVar);
        }
        Object obj = h0Var.f2626a;
        int i10 = h0Var.f2627b;
        if (i10 == 0) {
            t8.a.e(obj);
            h0Var.f2627b = 1;
            l lVar = new l(1, n4.h.L(h0Var));
            lVar.p();
            if (lVar.o() == z8.a.f15774a) {
                return;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        throw new s();
    }

    public static final void e(y yVar, CancellationException cancellationException) {
        a1 a1Var = (a1) yVar.u().l(v.f2678b);
        if (a1Var != null) {
            a1Var.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + yVar).toString());
        }
    }

    public static final Object f(a1 a1Var, a9.c cVar) {
        a1Var.a(null);
        Object objD = a1Var.d(cVar);
        return objD == z8.a.f15774a ? objD : t8.z.f12851a;
    }

    public static final Object g(h9.n nVar, y8.c cVar) {
        hc.p pVar = new hc.p(cVar, cVar.getContext());
        return o9.e0.Q(pVar, pVar, nVar);
    }

    public static final Object h(long j5, y8.c cVar) {
        if (j5 > 0) {
            l lVar = new l(1, n4.h.L(cVar));
            lVar.p();
            if (j5 < Long.MAX_VALUE) {
                k(lVar.f2641e).e(j5, lVar);
            }
            Object objO = lVar.o();
            if (objO == z8.a.f15774a) {
                return objO;
            }
        }
        return t8.z.f12851a;
    }

    public static final void i(y8.h hVar) {
        a1 a1Var = (a1) hVar.l(v.f2678b);
        if (a1Var != null && !a1Var.b()) {
            throw a1Var.j();
        }
    }

    public static final y8.h j(y8.h hVar, y8.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.q(new b3.a0(25), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.q(new b3.a0(25), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.s(hVar2);
        }
        b3.a0 a0Var = new b3.a0(26);
        y8.i iVar = y8.i.f15108a;
        y8.h hVar3 = (y8.h) hVar.q(a0Var, iVar);
        Object objQ = hVar2;
        if (zBooleanValue2) {
            objQ = hVar2.q(new b3.a0(27), iVar);
        }
        return hVar3.s((y8.h) objQ);
    }

    public static final g0 k(y8.h hVar) {
        y8.f fVarL = hVar.l(y8.d.f15107a);
        g0 g0Var = fVarL instanceof g0 ? (g0) fVarL : null;
        return g0Var == null ? d0.f2608a : g0Var;
    }

    public static final String l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final a1 m(y8.h hVar) {
        a1 a1Var = (a1) hVar.l(v.f2678b);
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final l n(y8.c cVar) {
        l lVar;
        l lVar2;
        if (!(cVar instanceof hc.f)) {
            return new l(1, cVar);
        }
        hc.f fVar = (hc.f) cVar;
        hc.s sVar = hc.a.f6497c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.f.f6507h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, sVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, sVar)) {
                        lVar2 = (l) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != sVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f2638g;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof q) || ((q) obj2).f2657d == null) {
                l.f2637f.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.f2589a);
                lVar = lVar2;
            } else {
                lVar2.m();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, cVar);
    }

    public static final void o(Throwable th, y8.h hVar) {
        try {
            w wVar = (w) hVar.l(v.f2677a);
            if (wVar != null) {
                wVar.p(th, hVar);
            } else {
                hc.a.d(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                t8.a.a(runtimeException, th);
                th = runtimeException;
            }
            hc.a.d(th, hVar);
        }
    }

    public static final l0 p(a1 a1Var, boolean z10, e1 e1Var) {
        if (a1Var instanceof h1) {
            return ((h1) a1Var).Q(z10, e1Var);
        }
        return a1Var.o(e1Var.k(), z10, new d1(1, e1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 0));
    }

    public static final boolean q(y yVar) {
        a1 a1Var = (a1) yVar.u().l(v.f2678b);
        if (a1Var != null) {
            return a1Var.b();
        }
        return true;
    }

    public static final boolean r(y8.h hVar) {
        a1 a1Var = (a1) hVar.l(v.f2678b);
        if (a1Var != null) {
            return a1Var.b();
        }
        return true;
    }

    public static o1 s(y yVar, y8.h hVar, h9.n nVar, int i7) {
        if ((i7 & 1) != 0) {
            hVar = y8.i.f15108a;
        }
        z zVar = (i7 & 2) != 0 ? z.f2689a : z.f2692d;
        y8.h hVarT = t(yVar, hVar);
        o1 i1Var = zVar == z.f2690b ? new i1(hVarT, nVar) : new o1(hVarT, true);
        i1Var.g0(zVar, i1Var, nVar);
        return i1Var;
    }

    public static final y8.h t(y yVar, y8.h hVar) {
        y8.h hVarJ = j(yVar.u(), hVar, true);
        jc.e eVar = k0.f2635a;
        return (hVarJ == eVar || hVarJ.l(y8.d.f15107a) != null) ? hVarJ : hVarJ.s(eVar);
    }

    public static final Object u(Object obj) {
        return obj instanceof r ? t8.a.b(((r) obj).f2662a) : obj;
    }

    public static final void v(l lVar, y8.c cVar, boolean z10) {
        Object obj = l.f2638g.get(lVar);
        Throwable thD = lVar.d(obj);
        Object objB = thD != null ? t8.a.b(thD) : lVar.g(obj);
        if (!z10) {
            cVar.resumeWith(objB);
            return;
        }
        i9.l.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        hc.f fVar = (hc.f) cVar;
        a9.c cVar2 = fVar.f6509e;
        Object obj2 = fVar.f6511g;
        y8.h context = cVar2.getContext();
        Object objL = hc.a.l(context, obj2);
        x1 x1VarZ = objL != hc.a.f6498d ? z(cVar2, context, objL) : null;
        try {
            cVar2.resumeWith(objB);
        } finally {
            if (x1VarZ == null || x1VarZ.h0()) {
                hc.a.g(context, objL);
            }
        }
    }

    public static final Object w(u1 u1Var, h9.n nVar) throws Throwable {
        Object rVar;
        Object objS;
        p(u1Var, true, new m0(0, k(u1Var.f6533d.getContext()).c(u1Var.f2676e, u1Var, u1Var.f2587c)));
        try {
            if (nVar instanceof a9.a) {
                i9.b0.d(2, nVar);
                rVar = nVar.invoke(u1Var, u1Var);
            } else {
                rVar = n4.h.i0(nVar, u1Var, u1Var);
            }
        } catch (Throwable th) {
            rVar = new r(th, false);
        }
        z8.a aVar = z8.a.f15774a;
        if (rVar == aVar || (objS = u1Var.S(rVar)) == f2594e) {
            return aVar;
        }
        if (objS instanceof r) {
            Throwable th2 = ((r) objS).f2662a;
            if (!(th2 instanceof t1) || ((t1) th2).f2674a != u1Var) {
                throw th2;
            }
            if (rVar instanceof r) {
                throw ((r) rVar).f2662a;
            }
        } else {
            rVar = y(objS);
        }
        return rVar;
    }

    public static final String x(y8.c cVar) {
        Object objB;
        if (cVar instanceof hc.f) {
            return ((hc.f) cVar).toString();
        }
        try {
            objB = cVar + '@' + l(cVar);
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        if (t8.m.a(objB) != null) {
            objB = cVar.getClass().getName() + '@' + l(cVar);
        }
        return (String) objB;
    }

    public static final Object y(Object obj) {
        x0 x0Var;
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        return (y0Var == null || (x0Var = y0Var.f2687a) == null) ? obj : x0Var;
    }

    public static final x1 z(y8.c cVar, y8.h hVar, Object obj) {
        x1 x1Var = null;
        if ((cVar instanceof a9.d) && hVar.l(y1.f2688a) != null) {
            a9.d callerFrame = (a9.d) cVar;
            while (!(callerFrame instanceof i0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof x1) {
                    x1Var = (x1) callerFrame;
                    break;
                }
            }
            if (x1Var != null) {
                x1Var.i0(hVar, obj);
            }
        }
        return x1Var;
    }
}
