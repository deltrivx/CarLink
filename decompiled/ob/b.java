package ob;

import nb.a0;
import nb.j0;
import nb.r0;
import nb.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends nb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f9636b;

    public b(c cVar, r0 r0Var) {
        this.f9635a = cVar;
        this.f9636b = r0Var;
    }

    @Override // nb.c
    public final qb.e C(j0 j0Var, qb.d dVar) {
        i9.l.e(j0Var, "state");
        i9.l.e(dVar, "type");
        c cVar = this.f9635a;
        a0 a0VarQ = cVar.Q(this.f9636b.g(cVar.C(dVar), x0.INVARIANT));
        i9.l.b(a0VarQ);
        return a0VarQ;
    }
}
