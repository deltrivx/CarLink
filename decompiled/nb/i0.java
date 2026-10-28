package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f9002b = new i0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f9003c = new i0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f9004d = new i0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9005a;

    public /* synthetic */ i0(int i7) {
        this.f9005a = i7;
    }

    @Override // nb.c
    public final qb.e C(j0 j0Var, qb.d dVar) {
        switch (this.f9005a) {
            case 0:
                i9.l.e(j0Var, "state");
                i9.l.e(dVar, "type");
                return j0Var.f9008c.C(dVar);
            case 1:
                i9.l.e(j0Var, "state");
                i9.l.e(dVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                i9.l.e(j0Var, "state");
                i9.l.e(dVar, "type");
                return j0Var.f9008c.D(dVar);
        }
    }
}
