package jb;

import aa.f0;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa.c f7083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wa.c cVar, ta.f fVar, f0 f0Var, n0 n0Var) {
        super(fVar, f0Var, n0Var);
        i9.l.e(cVar, "fqName");
        i9.l.e(fVar, "nameResolver");
        this.f7083d = cVar;
    }

    @Override // jb.w
    public final wa.c a() {
        return this.f7083d;
    }
}
