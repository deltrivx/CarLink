package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9.r0[] f9030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0[] f9031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9032d;

    public s(x9.r0[] r0VarArr, n0[] n0VarArr, boolean z10) {
        i9.l.e(r0VarArr, "parameters");
        i9.l.e(n0VarArr, "arguments");
        this.f9030b = r0VarArr;
        this.f9031c = n0VarArr;
        this.f9032d = z10;
    }

    @Override // nb.p0
    public final boolean b() {
        return this.f9032d;
    }

    @Override // nb.p0
    public final n0 d(w wVar) {
        x9.h hVarL = wVar.D0().l();
        x9.r0 r0Var = hVarL instanceof x9.r0 ? (x9.r0) hVarL : null;
        if (r0Var != null) {
            int index = r0Var.getIndex();
            x9.r0[] r0VarArr = this.f9030b;
            if (index < r0VarArr.length && i9.l.a(r0VarArr[index].t(), r0Var.t())) {
                return this.f9031c[index];
            }
        }
        return null;
    }

    @Override // nb.p0
    public final boolean e() {
        return this.f9031c.length == 0;
    }
}
