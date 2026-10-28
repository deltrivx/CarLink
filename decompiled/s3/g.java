package s3;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Future {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12570d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f12571e = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f12572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f12573g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f12574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f12575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f12576c;

    static {
        n eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f12572f = eVar;
        if (th != null) {
            f12571e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12573g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f12576c;
        } while (!f12572f.V(gVar, fVar, f.f12567c));
        while (fVar != null) {
            Thread thread = fVar.f12568a;
            if (thread != null) {
                fVar.f12568a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f12569b;
        }
        do {
            cVar = gVar.f12575b;
        } while (!f12572f.T(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f12561a;
            cVar.f12561a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f12561a;
            try {
                throw null;
            } catch (RuntimeException e7) {
                f12571e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e7);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f12559a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f12573g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objD = d(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objD == this ? "this future" : String.valueOf(objD));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e7.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.f12574a;
        if (obj != null) {
            return false;
        }
        if (f12570d) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else {
            aVar = z10 ? a.f12557b : a.f12558c;
        }
        if (!f12572f.U(this, obj, aVar)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f12568a = null;
        while (true) {
            f fVar2 = this.f12576c;
            if (fVar2 == f.f12567c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f12569b;
                if (fVar2.f12568a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f12569b = fVar4;
                    if (fVar3.f12568a == null) {
                    }
                } else if (!f12572f.V(this, fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f12567c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f12574a;
        if (obj2 != null) {
            return c(obj2);
        }
        f fVar2 = this.f12576c;
        if (fVar2 != fVar) {
            f fVar3 = new f();
            do {
                n nVar = f12572f;
                nVar.F0(fVar3, fVar2);
                if (nVar.V(this, fVar2, fVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            e(fVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f12574a;
                    } while (obj == null);
                    return c(obj);
                }
                fVar2 = this.f12576c;
            } while (fVar2 != fVar);
        }
        return c(this.f12574a);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f12567c;
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12574a;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f12576c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                while (true) {
                    n nVar = f12572f;
                    nVar.F0(fVar3, fVar2);
                    if (nVar.V(this, fVar2, fVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12574a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                e(fVar3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        fVar2 = this.f12576c;
                        if (fVar2 == fVar) {
                        }
                    }
                }
            }
            return c(this.f12574a);
        }
        while (nanos > 0) {
            Object obj3 = this.f12574a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strB = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strB2 = ob.a.B(strB, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strB3 = strB2 + jConvert + " " + lowerCase;
                if (z10) {
                    strB3 = ob.a.B(strB3, ",");
                }
                strB2 = ob.a.B(strB3, " ");
            }
            if (z10) {
                strB2 = strB2 + nanos2 + " nanoseconds ";
            }
            strB = ob.a.B(strB2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(ob.a.B(strB, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strB + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12574a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12574a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f12574a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
