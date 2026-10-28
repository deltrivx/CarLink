package w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r1.o implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h9.k f14032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f14033p;

    @Override // w1.e
    public final void r(r rVar) {
        if (i9.l.a(this.f14033p, rVar)) {
            return;
        }
        this.f14033p = rVar;
        this.f14032o.invoke(rVar);
    }
}
