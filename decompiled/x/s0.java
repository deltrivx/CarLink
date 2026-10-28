package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f14475b;

    public /* synthetic */ s0(t0 t0Var, int i7) {
        this.f14474a = i7;
        this.f14475b = t0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f14474a) {
            case 0:
                this.f14475b.C0();
                return t8.z.f12851a;
            case 1:
                return new x1.b(this.f14475b.f14485w);
            default:
                o2.w wVar = (o2.w) this.f14475b.f14483u.getValue();
                return new x1.b(wVar != null ? wVar.E(0L) : 9205357640488583168L);
        }
    }
}
