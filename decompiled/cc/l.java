package cc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j0 implements j, a9.d, z1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2637f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2638g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2639h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y8.c f2640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y8.h f2641e;

    public l(int i7, y8.c cVar) {
        super(i7);
        this.f2640d = cVar;
        this.f2641e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f2589a;
    }

    public static Object A(m1 m1Var, Object obj, int i7, h9.o oVar) {
        if (obj instanceof r) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (oVar != null || (m1Var instanceof i)) {
            return new q(obj, m1Var instanceof i ? (i) m1Var : null, oVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void u(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final hc.s B(Object obj, h9.o oVar) {
        hc.s sVar = b0.f2590a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2638g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof m1)) {
                return null;
            }
            Object objA = A((m1) obj2, obj, this.f2632c, oVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objA)) {
                    if (!t()) {
                        m();
                    }
                    return sVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // cc.z1
    public final void a(hc.q qVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f2637f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i7));
        s(qVar);
    }

    @Override // cc.j0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2638g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof m1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof r) {
                return;
            }
            if (!(obj instanceof q)) {
                cancellationException2 = cancellationException;
                q qVar = new q(obj, (i) null, (h9.o) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            q qVar2 = (q) obj;
            if (qVar2.f2658e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            q qVarA = q.a(qVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, qVarA)) {
                    i iVar = qVar2.f2655b;
                    if (iVar != null) {
                        j(iVar, cancellationException);
                    }
                    h9.o oVar = qVar2.f2656c;
                    if (oVar != null) {
                        k(oVar, cancellationException, qVar2.f2654a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // cc.j0
    public final y8.c c() {
        return this.f2640d;
    }

    @Override // cc.j0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // cc.j
    public final void e(Object obj, h9.o oVar) {
        x(obj, this.f2632c, oVar);
    }

    @Override // cc.j
    public final hc.s f(Object obj, h9.o oVar) {
        return B(obj, oVar);
    }

    @Override // cc.j0
    public final Object g(Object obj) {
        return obj instanceof q ? ((q) obj).f2654a : obj;
    }

    @Override // a9.d
    public final a9.d getCallerFrame() {
        y8.c cVar = this.f2640d;
        if (cVar instanceof a9.d) {
            return (a9.d) cVar;
        }
        return null;
    }

    @Override // y8.c
    public final y8.h getContext() {
        return this.f2641e;
    }

    @Override // cc.j0
    public final Object i() {
        return f2638g.get(this);
    }

    public final void j(i iVar, Throwable th) {
        try {
            iVar.b(th);
        } catch (Throwable th2) {
            b0.o(new s("Exception in invokeOnCancellation handler for " + this, th2), this.f2641e);
        }
    }

    public final void k(h9.o oVar, Throwable th, Object obj) {
        y8.h hVar = this.f2641e;
        try {
            oVar.invoke(th, obj, hVar);
        } catch (Throwable th2) {
            b0.o(new s("Exception in resume onCancellation handler for " + this, th2), hVar);
        }
    }

    public final void l(hc.q qVar, Throwable th) {
        y8.h hVar = this.f2641e;
        int i7 = f2637f.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.h(i7, hVar);
        } catch (Throwable th2) {
            b0.o(new s("Exception in invokeOnCancellation handler for " + this, th2), hVar);
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2639h;
        l0 l0Var = (l0) atomicReferenceFieldUpdater.get(this);
        if (l0Var == null) {
            return;
        }
        l0Var.a();
        atomicReferenceFieldUpdater.set(this, l1.f2642a);
    }

    public final void n(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f2637f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i7 == 4;
                y8.c cVar = this.f2640d;
                if (!z10 && (cVar instanceof hc.f)) {
                    boolean z11 = i7 == 1 || i7 == 2;
                    int i12 = this.f2632c;
                    if (z11 == (i12 == 1 || i12 == 2)) {
                        hc.f fVar = (hc.f) cVar;
                        u uVar = fVar.f6508d;
                        y8.h context = fVar.f6509e.getContext();
                        if (uVar.v(context)) {
                            uVar.g(context, this);
                            return;
                        }
                        t0 t0VarA = s1.a();
                        if (t0VarA.f2671c >= 4294967296L) {
                            t0VarA.y(this);
                            return;
                        }
                        t0VarA.A(true);
                        try {
                            b0.v(this, cVar, true);
                            do {
                            } while (t0VarA.C());
                        } catch (Throwable th) {
                            try {
                                h(th);
                            } finally {
                                t0VarA.x(true);
                            }
                        }
                        return;
                    }
                }
                b0.v(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public final Object o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        a1 a1Var;
        boolean zT = t();
        do {
            atomicIntegerFieldUpdater = f2637f;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i10 = i7 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zT) {
                    v();
                }
                Object obj = f2638g.get(this);
                if (obj instanceof r) {
                    throw ((r) obj).f2662a;
                }
                int i11 = this.f2632c;
                if ((i11 != 1 && i11 != 2) || (a1Var = (a1) this.f2641e.l(v.f2678b)) == null || a1Var.b()) {
                    return g(obj);
                }
                CancellationException cancellationExceptionJ = a1Var.j();
                b(cancellationExceptionJ);
                throw cancellationExceptionJ;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((l0) f2639h.get(this)) == null) {
            q();
        }
        if (zT) {
            v();
        }
        return z8.a.f15774a;
    }

    public final void p() {
        l0 l0VarQ = q();
        if (l0VarQ == null || (f2638g.get(this) instanceof m1)) {
            return;
        }
        l0VarQ.a();
        f2639h.set(this, l1.f2642a);
    }

    public final l0 q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1 a1Var = (a1) this.f2641e.l(v.f2678b);
        if (a1Var == null) {
            return null;
        }
        l0 l0VarP = b0.p(a1Var, true, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = f2639h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, l0VarP)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return l0VarP;
    }

    public final void r(h9.k kVar) {
        s(new h(0, kVar));
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        Throwable thA = t8.m.a(obj);
        if (thA != null) {
            obj = new r(thA, false);
        }
        x(obj, this.f2632c, null);
    }

    public final void s(m1 m1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2638g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof i) || (obj instanceof hc.q)) {
                u(m1Var, obj);
                throw null;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!r.f2661b.compareAndSet(rVar, 0, 1)) {
                    u(m1Var, obj);
                    throw null;
                }
                if (obj instanceof m) {
                    Throwable th = rVar.f2662a;
                    if (m1Var instanceof i) {
                        j((i) m1Var, th);
                        return;
                    } else {
                        i9.l.c(m1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((hc.q) m1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof q)) {
                if (m1Var instanceof hc.q) {
                    return;
                }
                i9.l.c(m1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                q qVar = new q(obj, (i) m1Var, (h9.o) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            q qVar2 = (q) obj;
            if (qVar2.f2655b != null) {
                u(m1Var, obj);
                throw null;
            }
            if (m1Var instanceof hc.q) {
                return;
            }
            i9.l.c(m1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            i iVar = (i) m1Var;
            Throwable th2 = qVar2.f2658e;
            if (th2 != null) {
                j(iVar, th2);
                return;
            }
            q qVarA = q.a(qVar2, iVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean t() {
        if (this.f2632c != 2) {
            return false;
        }
        y8.c cVar = this.f2640d;
        i9.l.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return hc.f.f6507h.get((hc.f) cVar) != null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CancellableContinuation(");
        sb2.append(b0.x(this.f2640d));
        sb2.append("){");
        Object obj = f2638g.get(this);
        if (obj instanceof m1) {
            str = "Active";
        } else {
            str = obj instanceof m ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(b0.l(this));
        return sb2.toString();
    }

    public final void v() {
        y8.c cVar = this.f2640d;
        Throwable th = null;
        hc.f fVar = cVar instanceof hc.f ? (hc.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.f.f6507h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                hc.s sVar = hc.a.f6497c;
                if (obj != sVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, sVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == sVar);
            }
            if (th == null) {
                return;
            }
            m();
            w(th);
        }
    }

    @Override // cc.j
    public final boolean w(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2638g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof m1)) {
                return false;
            }
            m mVar = new m(this, th, (obj instanceof i) || (obj instanceof hc.q));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    m1 m1Var = (m1) obj;
                    if (m1Var instanceof i) {
                        j((i) obj, th);
                    } else if (m1Var instanceof hc.q) {
                        l((hc.q) obj, th);
                    }
                    if (!t()) {
                        m();
                    }
                    n(this.f2632c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void x(Object obj, int i7, h9.o oVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2638g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof m1)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    if (m.f2643c.compareAndSet(mVar, 0, 1)) {
                        if (oVar != null) {
                            k(oVar, mVar.f2662a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objA = A((m1) obj2, obj, i7, oVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objA)) {
                    if (!t()) {
                        m();
                    }
                    n(i7);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void y(u uVar) {
        y8.c cVar = this.f2640d;
        hc.f fVar = cVar instanceof hc.f ? (hc.f) cVar : null;
        x(t8.z.f12851a, (fVar != null ? fVar.f6508d : null) == uVar ? 4 : this.f2632c, null);
    }

    @Override // cc.j
    public final void z(Object obj) {
        n(this.f2632c);
    }
}
