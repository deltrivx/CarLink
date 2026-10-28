package cc;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends jc.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2632c;

    public j0(int i7) {
        super(0L, false);
        this.f2632c = i7;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract y8.c c();

    public Throwable d(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            return rVar.f2662a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        b0.o(new a0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            y8.c cVarC = c();
            i9.l.c(cVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            hc.f fVar = (hc.f) cVarC;
            a9.c cVar = fVar.f6509e;
            Object obj = fVar.f6511g;
            y8.h context = cVar.getContext();
            Object objL = hc.a.l(context, obj);
            a1 a1Var = null;
            x1 x1VarZ = objL != hc.a.f6498d ? b0.z(cVar, context, objL) : null;
            try {
                y8.h context2 = cVar.getContext();
                Object objI = i();
                Throwable thD = d(objI);
                if (thD == null) {
                    int i7 = this.f2632c;
                    boolean z10 = true;
                    if (i7 != 1 && i7 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        a1Var = (a1) context2.l(v.f2678b);
                    }
                }
                if (a1Var != null && !a1Var.b()) {
                    CancellationException cancellationExceptionJ = a1Var.j();
                    b(cancellationExceptionJ);
                    cVar.resumeWith(t8.a.b(cancellationExceptionJ));
                } else if (thD != null) {
                    cVar.resumeWith(t8.a.b(thD));
                } else {
                    cVar.resumeWith(g(objI));
                }
            } finally {
                if (x1VarZ == null || x1VarZ.h0()) {
                    hc.a.g(context, objL);
                }
            }
        } catch (Throwable th) {
            h(th);
        }
    }
}
