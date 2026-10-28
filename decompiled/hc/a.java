package hc;

import cc.a1;
import cc.b0;
import cc.r1;
import cc.s1;
import cc.t0;
import cc.w;
import cc.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f6495a = new s(0, "CLOSED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f6496b = new s(0, "UNDEFINED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f6497c = new s(0, "REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f6498d = new s(0, "NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0.g f6499e = new g0.g(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g0.g f6500f = new g0.g(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g0.g f6501g = new g0.g(6);

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(a2.f.E(i7, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(q qVar, long j5, h9.n nVar) {
        while (true) {
            if (qVar.f6535c >= j5 && !qVar.d()) {
                return qVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f6502a;
            Object obj = atomicReferenceFieldUpdater.get(qVar);
            s sVar = f6495a;
            if (obj == sVar) {
                return sVar;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) nVar.invoke(Long.valueOf(qVar.f6535c + 1), qVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        if (qVar.d()) {
                            qVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(qVar) == null);
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != f6495a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, y8.h hVar) {
        Throwable runtimeException;
        Iterator it = d.f6505a.iterator();
        while (it.hasNext()) {
            try {
                ((w) it.next()).p(th, hVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    t8.a.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            t8.a.a(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f6495a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(y8.h hVar, Object obj) {
        if (obj == f6498d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object objQ = hVar.q(f6500f, null);
            i9.l.c(objQ, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a2.f.N(objQ);
            throw null;
        }
        v vVar = (v) obj;
        r1[] r1VarArr = vVar.f6543b;
        int length = r1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        r1 r1Var = r1VarArr[length];
        i9.l.b(null);
        Object obj2 = vVar.f6542a[length];
        throw null;
    }

    public static final void h(Object obj, y8.c cVar) {
        if (!(cVar instanceof f)) {
            cVar.resumeWith(obj);
            return;
        }
        f fVar = (f) cVar;
        cc.u uVar = fVar.f6508d;
        a9.c cVar2 = fVar.f6509e;
        Throwable thA = t8.m.a(obj);
        Object rVar = thA == null ? obj : new cc.r(thA, false);
        if (uVar.v(cVar2.getContext())) {
            fVar.f6510f = rVar;
            fVar.f2632c = 1;
            uVar.g(cVar2.getContext(), fVar);
            return;
        }
        t0 t0VarA = s1.a();
        if (t0VarA.f2671c >= 4294967296L) {
            fVar.f6510f = rVar;
            fVar.f2632c = 1;
            t0VarA.y(fVar);
            return;
        }
        t0VarA.A(true);
        try {
            a1 a1Var = (a1) cVar2.getContext().l(cc.v.f2678b);
            if (a1Var == null || a1Var.b()) {
                Object obj2 = fVar.f6511g;
                y8.h context = cVar2.getContext();
                Object objL = l(context, obj2);
                x1 x1VarZ = objL != f6498d ? b0.z(cVar2, context, objL) : null;
                try {
                    cVar2.resumeWith(obj);
                    if (x1VarZ == null || x1VarZ.h0()) {
                        g(context, objL);
                    }
                } catch (Throwable th) {
                    if (x1VarZ == null || x1VarZ.h0()) {
                        g(context, objL);
                    }
                    throw th;
                }
            } else {
                fVar.resumeWith(t8.a.b(a1Var.j()));
            }
            while (t0VarA.C()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.h(th2);
            } finally {
                t0VarA.x(true);
            }
        }
    }

    public static final long i(String str, long j5, long j10, long j11) {
        String property;
        int i7 = t.f6539a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j5;
        }
        Long lQ0 = zb.q.q0(property);
        if (lQ0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lQ0.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(String str, int i7, int i10) {
        return (int) i(str, i7, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(y8.h hVar) {
        Object objQ = hVar.q(f6499e, 0);
        i9.l.b(objQ);
        return objQ;
    }

    public static final Object l(y8.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f6498d;
        }
        if (obj instanceof Integer) {
            return hVar.q(f6501g, new v(((Number) obj).intValue(), hVar));
        }
        a2.f.N(obj);
        throw null;
    }
}
