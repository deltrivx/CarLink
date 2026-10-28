package cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class h1 implements a1, n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2628a = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2629b = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public h1(boolean z10) {
        this._state$volatile = z10 ? b0.f2599j : b0.f2598i;
    }

    public static p U(hc.i iVar) {
        while (iVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.i.f6520b;
            hc.i iVarF = iVar.f();
            if (iVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (hc.i) obj;
                    if (!iVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarF;
            }
        }
        while (true) {
            iVar = iVar.h();
            if (!iVar.i()) {
                if (iVar instanceof p) {
                    return (p) iVar;
                }
                if (iVar instanceof j1) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof g1)) {
            if (obj instanceof x0) {
                return ((x0) obj).b() ? "Active" : "New";
            }
            return obj instanceof r ? "Cancelled" : "Completed";
        }
        g1 g1Var = (g1) obj;
        if (g1Var.e()) {
            return "Cancelling";
        }
        return g1.f2620b.get(g1Var) != 0 ? "Completing" : "Active";
    }

    public void A(Object obj) {
        y(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b4->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean B(Object obj) {
        Throwable thH;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z10;
        Throwable thC;
        hc.s sVar;
        x0 x0Var;
        j1 j1VarM;
        g1 g1Var;
        Object objC0;
        Object objC1 = b0.f2593d;
        if (L()) {
            do {
                Object obj3 = f2628a.get(this);
                if (obj3 instanceof x0) {
                    if (obj3 instanceof g1) {
                        if (g1.f2620b.get((g1) obj3) != 0) {
                        }
                    }
                    objC1 = c0(obj3, new r(H(obj), false));
                }
                objC1 = b0.f2593d;
                break;
            } while (objC1 == b0.f2595f);
            if (objC1 != b0.f2594e) {
                if (objC1 == b0.f2593d) {
                    thH = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f2628a;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof g1) {
                            synchronized (obj2) {
                                if (g1.f2622d.get((g1) obj2) == b0.f2597h) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    sVar = b0.f2596g;
                                } else {
                                    boolean zE = ((g1) obj2).e();
                                    if (thH == null) {
                                        thH = H(obj);
                                    }
                                    ((g1) obj2).a(thH);
                                    thC = zE ? null : ((g1) obj2).c();
                                    if (thC != null) {
                                        V(((g1) obj2).f2623a, thC);
                                    }
                                    sVar = b0.f2593d;
                                }
                            }
                        } else if (obj2 instanceof x0) {
                            if (thH == null) {
                                thH = H(obj);
                            }
                            x0Var = (x0) obj2;
                            if (x0Var.b()) {
                                j1VarM = M(x0Var);
                                if (j1VarM == null) {
                                    continue;
                                } else {
                                    g1Var = new g1(j1VarM, thH);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, x0Var, g1Var)) {
                                            V(j1VarM, thH);
                                            sVar = b0.f2593d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                                        }
                                    }
                                }
                            } else {
                                objC0 = c0(obj2, new r(thH, false));
                                if (objC0 != b0.f2593d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objC0 != b0.f2595f) {
                                    objC1 = objC0;
                                    break;
                                }
                            }
                        } else {
                            sVar = b0.f2596g;
                        }
                        objC1 = sVar;
                        break;
                    }
                }
                if (objC1 != b0.f2593d && objC1 != b0.f2594e) {
                    if (objC1 == b0.f2596g) {
                        return false;
                    }
                    y(objC1);
                    return true;
                }
            }
        } else {
            if (objC1 == b0.f2593d) {
                thH = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f2628a;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof g1) {
                        synchronized (obj2) {
                            if (g1.f2622d.get((g1) obj2) == b0.f2597h) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                sVar = b0.f2596g;
                            } else {
                                boolean zE2 = ((g1) obj2).e();
                                if (thH == null) {
                                    thH = H(obj);
                                }
                                ((g1) obj2).a(thH);
                                if (zE2) {
                                }
                                if (thC != null) {
                                    V(((g1) obj2).f2623a, thC);
                                }
                                sVar = b0.f2593d;
                            }
                        }
                    } else if (obj2 instanceof x0) {
                        if (thH == null) {
                            thH = H(obj);
                        }
                        x0Var = (x0) obj2;
                        if (x0Var.b()) {
                            j1VarM = M(x0Var);
                            if (j1VarM == null) {
                                continue;
                            } else {
                                g1Var = new g1(j1VarM, thH);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, x0Var, g1Var)) {
                                        V(j1VarM, thH);
                                        sVar = b0.f2593d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                                    }
                                }
                            }
                        } else {
                            objC0 = c0(obj2, new r(thH, false));
                            if (objC0 != b0.f2593d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objC0 != b0.f2595f) {
                                objC1 = objC0;
                                break;
                            }
                        }
                    } else {
                        sVar = b0.f2596g;
                    }
                    objC1 = sVar;
                    break;
                }
            }
            if (objC1 != b0.f2593d) {
                if (objC1 == b0.f2596g) {
                    return false;
                }
                y(objC1);
                return true;
            }
        }
        return true;
    }

    public void C(CancellationException cancellationException) {
        B(cancellationException);
    }

    public final boolean D(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        o oVar = (o) f2629b.get(this);
        if (oVar == null || oVar == l1.f2642a) {
            return z10;
        }
        return oVar.c(th) || z10;
    }

    public String E() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return B(th) && K();
    }

    public final void G(x0 x0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2629b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, l1.f2642a);
        }
        s sVar = null;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th = rVar != null ? rVar.f2662a : null;
        if (x0Var instanceof e1) {
            try {
                ((e1) x0Var).l(th);
                return;
            } catch (Throwable th2) {
                O(new s("Exception in completion handler " + x0Var + " for " + this, th2));
                return;
            }
        }
        j1 j1VarD = x0Var.d();
        if (j1VarD != null) {
            j1VarD.e(new hc.h(1), 1);
            Object obj2 = hc.i.f6519a.get(j1VarD);
            i9.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (hc.i iVarH = (hc.i) obj2; !iVarH.equals(j1VarD); iVarH = iVarH.h()) {
                if (iVarH instanceof e1) {
                    try {
                        ((e1) iVarH).l(th);
                    } catch (Throwable th3) {
                        if (sVar != null) {
                            t8.a.a(sVar, th3);
                        } else {
                            sVar = new s("Exception in completion handler " + iVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (sVar != null) {
                O(sVar);
            }
        }
    }

    public final Throwable H(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        h1 h1Var = (h1) ((n1) obj);
        Object obj2 = f2628a.get(h1Var);
        if (obj2 instanceof g1) {
            thC = ((g1) obj2).c();
        } else if (obj2 instanceof r) {
            thC = ((r) obj2).f2662a;
        } else {
            if (obj2 instanceof x0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new b1("Parent job is ".concat(b0(obj2)), thC, h1Var) : cancellationException;
    }

    public final Object I(g1 g1Var, Object obj) {
        Throwable thJ;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th = rVar != null ? rVar.f2662a : null;
        synchronized (g1Var) {
            g1Var.e();
            ArrayList<Throwable> arrayListF = g1Var.f(th);
            thJ = J(g1Var, arrayListF);
            if (thJ != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thJ && th2 != thJ && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        t8.a.a(thJ, th2);
                    }
                }
            }
        }
        if (thJ != null && thJ != th) {
            obj = new r(thJ, false);
        }
        if (thJ != null && (D(thJ) || N(thJ))) {
            i9.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            r.f2661b.compareAndSet((r) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2628a;
        Object y0Var = obj instanceof x0 ? new y0((x0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, g1Var, y0Var) && atomicReferenceFieldUpdater.get(this) == g1Var) {
        }
        G(g1Var, obj);
        return obj;
    }

    public final Throwable J(g1 g1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (g1Var.e()) {
                return new b1(E(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof t1) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof t1)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return false;
    }

    public final j1 M(x0 x0Var) {
        j1 j1VarD = x0Var.d();
        if (j1VarD != null) {
            return j1VarD;
        }
        if (x0Var instanceof n0) {
            return new j1();
        }
        if (x0Var instanceof e1) {
            Z((e1) x0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + x0Var).toString());
    }

    public boolean N(Throwable th) {
        return false;
    }

    public void O(s sVar) {
        throw sVar;
    }

    public final void P(a1 a1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2629b;
        l1 l1Var = l1.f2642a;
        if (a1Var == null) {
            atomicReferenceFieldUpdater.set(this, l1Var);
            return;
        }
        a1Var.start();
        o oVarR = a1Var.r(this);
        atomicReferenceFieldUpdater.set(this, oVarR);
        if (f2628a.get(this) instanceof x0) {
            return;
        }
        oVarR.a();
        atomicReferenceFieldUpdater.set(this, l1Var);
    }

    public final l0 Q(boolean z10, e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z11;
        boolean zE;
        e1Var.f2612d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f2628a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof n0;
            l1 l1Var = l1.f2642a;
            z11 = true;
            if (!z12) {
                if (!(obj instanceof x0)) {
                    z11 = false;
                    break;
                }
                x0 x0Var = (x0) obj;
                j1 j1VarD = x0Var.d();
                if (j1VarD == null) {
                    Z((e1) obj);
                } else {
                    if (e1Var.k()) {
                        g1 g1Var = x0Var instanceof g1 ? (g1) x0Var : null;
                        Throwable thC = g1Var != null ? g1Var.c() : null;
                        if (thC == null) {
                            zE = j1VarD.e(e1Var, 5);
                        } else if (z10) {
                            e1Var.l(thC);
                            return l1Var;
                        }
                    } else {
                        zE = j1VarD.e(e1Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                n0 n0Var = (n0) obj;
                if (n0Var.f2648a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, e1Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    Y(n0Var);
                }
            }
            return l1Var;
        }
        if (z11) {
            return e1Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            r rVar = obj2 instanceof r ? (r) obj2 : null;
            e1Var.l(rVar != null ? rVar.f2662a : null);
        }
        return l1Var;
    }

    public boolean R() {
        return this instanceof f;
    }

    public final Object S(Object obj) {
        Object objC0;
        do {
            objC0 = c0(f2628a.get(this), obj);
            if (objC0 == b0.f2593d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                r rVar = obj instanceof r ? (r) obj : null;
                throw new IllegalStateException(str, rVar != null ? rVar.f2662a : null);
            }
        } while (objC0 == b0.f2595f);
        return objC0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void V(j1 j1Var, Throwable th) {
        j1Var.e(new hc.h(4), 4);
        Object obj = hc.i.f6519a.get(j1Var);
        i9.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        s sVar = null;
        for (hc.i iVarH = (hc.i) obj; !iVarH.equals(j1Var); iVarH = iVarH.h()) {
            if ((iVarH instanceof e1) && ((e1) iVarH).k()) {
                try {
                    ((e1) iVarH).l(th);
                } catch (Throwable th2) {
                    if (sVar != null) {
                        t8.a.a(sVar, th2);
                    } else {
                        sVar = new s("Exception in completion handler " + iVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (sVar != null) {
            O(sVar);
        }
        D(th);
    }

    public void W(Object obj) {
    }

    public void X() {
    }

    public final void Y(n0 n0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var = new j1();
        Object w0Var = j1Var;
        if (!n0Var.f2648a) {
            w0Var = new w0(j1Var);
        }
        do {
            atomicReferenceFieldUpdater = f2628a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n0Var, w0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n0Var);
    }

    public final void Z(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var = new j1();
        e1Var.getClass();
        hc.i.f6520b.set(j1Var, e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hc.i.f6519a;
        atomicReferenceFieldUpdater2.set(j1Var, e1Var);
        loop0: while (atomicReferenceFieldUpdater2.get(e1Var) == e1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(e1Var, e1Var, j1Var)) {
                    j1Var.g(e1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(e1Var) == e1Var);
        }
        hc.i iVarH = e1Var.h();
        do {
            atomicReferenceFieldUpdater = f2628a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e1Var, iVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == e1Var);
    }

    @Override // cc.a1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new b1(E(), null, this);
        }
        C(cancellationException);
    }

    public final int a0(Object obj) {
        boolean z10 = obj instanceof n0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2628a;
        if (z10) {
            if (((n0) obj).f2648a) {
                return 0;
            }
            n0 n0Var = b0.f2599j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            X();
            return 1;
        }
        if (!(obj instanceof w0)) {
            return 0;
        }
        j1 j1Var = ((w0) obj).f2683a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        X();
        return 1;
    }

    @Override // cc.a1
    public boolean b() {
        Object obj = f2628a.get(this);
        return (obj instanceof x0) && ((x0) obj).b();
    }

    public final Object c0(Object obj, Object obj2) {
        if (!(obj instanceof x0)) {
            return b0.f2593d;
        }
        if (((obj instanceof n0) || (obj instanceof e1)) && !(obj instanceof p) && !(obj2 instanceof r)) {
            x0 x0Var = (x0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2628a;
            Object y0Var = obj2 instanceof x0 ? new y0((x0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, x0Var, y0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                    return b0.f2595f;
                }
            }
            W(obj2);
            G(x0Var, obj2);
            return obj2;
        }
        x0 x0Var2 = (x0) obj;
        j1 j1VarM = M(x0Var2);
        if (j1VarM == null) {
            return b0.f2595f;
        }
        g1 g1Var = x0Var2 instanceof g1 ? (g1) x0Var2 : null;
        if (g1Var == null) {
            g1Var = new g1(j1VarM, null);
        }
        synchronized (g1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g1.f2620b;
            if (atomicIntegerFieldUpdater.get(g1Var) != 0) {
                return b0.f2593d;
            }
            atomicIntegerFieldUpdater.set(g1Var, 1);
            if (g1Var != x0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2628a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, x0Var2, g1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != x0Var2) {
                        return b0.f2595f;
                    }
                }
            }
            boolean zE = g1Var.e();
            r rVar = obj2 instanceof r ? (r) obj2 : null;
            if (rVar != null) {
                g1Var.a(rVar.f2662a);
            }
            Throwable thC = zE ? null : g1Var.c();
            if (thC != null) {
                V(j1VarM, thC);
            }
            p pVarU = U(j1VarM);
            if (pVarU != null && d0(g1Var, pVarU, obj2)) {
                return b0.f2594e;
            }
            j1VarM.e(new hc.h(2), 2);
            p pVarU2 = U(j1VarM);
            return (pVarU2 == null || !d0(g1Var, pVarU2, obj2)) ? I(g1Var, obj2) : b0.f2594e;
        }
    }

    @Override // cc.a1
    public final Object d(a9.c cVar) {
        Object obj;
        t8.z zVar;
        do {
            obj = f2628a.get(this);
            boolean z10 = obj instanceof x0;
            zVar = t8.z.f12851a;
            if (!z10) {
                b0.i(cVar.getContext());
                return zVar;
            }
        } while (a0(obj) < 0);
        l lVar = new l(1, n4.h.L(cVar));
        lVar.p();
        int i7 = 1;
        lVar.s(new h(i7, b0.p(this, true, new n(lVar, i7))));
        Object objO = lVar.o();
        z8.a aVar = z8.a.f15774a;
        if (objO != aVar) {
            objO = zVar;
        }
        return objO == aVar ? objO : zVar;
    }

    public final boolean d0(g1 g1Var, p pVar, Object obj) {
        while (b0.p(pVar.f2651e, false, new f1(this, g1Var, pVar, obj)) == l1.f2642a) {
            pVar = U(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // y8.f
    public final y8.g getKey() {
        return v.f2678b;
    }

    @Override // y8.h
    public final y8.h h(y8.g gVar) {
        return n3.u.F(this, gVar);
    }

    @Override // cc.a1
    public final CancellationException j() {
        CancellationException cancellationException;
        Object obj = f2628a.get(this);
        if (!(obj instanceof g1)) {
            if (obj instanceof x0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof r)) {
                return new b1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((r) obj).f2662a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new b1(E(), th, this) : cancellationException;
        }
        Throwable thC = ((g1) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = E();
        }
        return new b1(strConcat, thC, this);
    }

    @Override // y8.h
    public final y8.f l(y8.g gVar) {
        return n3.u.A(this, gVar);
    }

    @Override // cc.a1
    public final l0 o(boolean z10, boolean z11, d1 d1Var) {
        return Q(z11, z10 ? new z0(d1Var) : new m0(1, d1Var));
    }

    @Override // y8.h
    public final Object q(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // cc.a1
    public final o r(h1 h1Var) {
        p pVar = new p(h1Var);
        pVar.f2612d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2628a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (n0Var.f2648a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                Y(n0Var);
            } else {
                boolean z10 = obj instanceof x0;
                l1 l1Var = l1.f2642a;
                Throwable thC = null;
                if (!z10) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    r rVar = obj2 instanceof r ? (r) obj2 : null;
                    pVar.l(rVar != null ? rVar.f2662a : null);
                    return l1Var;
                }
                j1 j1VarD = ((x0) obj).d();
                if (j1VarD != null) {
                    if (j1VarD.e(pVar, 7)) {
                        break;
                    }
                    boolean zE = j1VarD.e(pVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof g1) {
                        thC = ((g1) obj3).c();
                    } else {
                        r rVar2 = obj3 instanceof r ? (r) obj3 : null;
                        if (rVar2 != null) {
                            thC = rVar2.f2662a;
                        }
                    }
                    pVar.l(thC);
                    if (zE) {
                        break;
                    }
                    return l1Var;
                }
                Z((e1) obj);
            }
        }
        return pVar;
    }

    @Override // y8.h
    public final y8.h s(y8.h hVar) {
        return n3.u.G(this, hVar);
    }

    @Override // cc.a1
    public final boolean start() {
        int iA0;
        do {
            iA0 = a0(f2628a.get(this));
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    @Override // cc.a1
    public final l0 t(h9.k kVar) {
        return Q(true, new m0(1, kVar));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(T() + '{' + b0(f2628a.get(this)) + '}');
        sb2.append('@');
        sb2.append(b0.l(this));
        return sb2.toString();
    }

    public void y(Object obj) {
    }
}
