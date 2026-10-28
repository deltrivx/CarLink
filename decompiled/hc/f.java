package hc;

import cc.b0;
import cc.j0;
import cc.s1;
import cc.t0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j0 implements a9.d, y8.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6507h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cc.u f6508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a9.c f6509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6511g;

    public f(cc.u uVar, a9.c cVar) {
        super(-1);
        this.f6508d = uVar;
        this.f6509e = cVar;
        this.f6510f = a.f6496b;
        this.f6511g = a.k(cVar.getContext());
    }

    @Override // cc.j0
    public final y8.c c() {
        return this;
    }

    @Override // a9.d
    public final a9.d getCallerFrame() {
        return this.f6509e;
    }

    @Override // y8.c
    public final y8.h getContext() {
        return this.f6509e.getContext();
    }

    @Override // cc.j0
    public final Object i() {
        Object obj = this.f6510f;
        this.f6510f = a.f6496b;
        return obj;
    }

    @Override // y8.c
    public final void resumeWith(Object obj) {
        Throwable thA = t8.m.a(obj);
        Object rVar = thA == null ? obj : new cc.r(thA, false);
        a9.c cVar = this.f6509e;
        y8.h context = cVar.getContext();
        cc.u uVar = this.f6508d;
        if (uVar.v(context)) {
            this.f6510f = rVar;
            this.f2632c = 0;
            uVar.g(cVar.getContext(), this);
            return;
        }
        t0 t0VarA = s1.a();
        if (t0VarA.f2671c >= 4294967296L) {
            this.f6510f = rVar;
            this.f2632c = 0;
            t0VarA.y(this);
            return;
        }
        t0VarA.A(true);
        try {
            y8.h context2 = cVar.getContext();
            Object objL = a.l(context2, this.f6511g);
            try {
                cVar.resumeWith(obj);
                a.g(context2, objL);
                while (t0VarA.C()) {
                }
            } catch (Throwable th) {
                a.g(context2, objL);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2);
            } finally {
                t0VarA.x(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f6508d + ", " + b0.x(this.f6509e) + ']';
    }
}
