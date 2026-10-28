package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f8986a;

    public e0(u9.i iVar) {
        i9.l.e(iVar, "kotlinBuiltIns");
        a0 a0VarP = iVar.p();
        i9.l.d(a0VarP, "getNullableAnyType(...)");
        this.f8986a = a0VarP;
    }

    @Override // nb.n0
    public final x0 a() {
        return x0.OUT_VARIANCE;
    }

    @Override // nb.n0
    public final w b() {
        return this.f8986a;
    }

    @Override // nb.n0
    public final boolean c() {
        return true;
    }

    @Override // nb.n0
    public final n0 d(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        return this;
    }
}
