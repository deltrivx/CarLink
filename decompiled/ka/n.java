package ka;

/* JADX INFO: loaded from: classes.dex */
public final class n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f7456b;

    public /* synthetic */ n(o oVar, int i7) {
        this.f7455a = i7;
        this.f7456b = oVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        wa.e eVar = (wa.e) obj;
        switch (this.f7455a) {
            case 0:
                i9.l.e(eVar, "it");
                return this.f7456b.N(eVar);
            default:
                i9.l.e(eVar, "it");
                return this.f7456b.O(eVar);
        }
    }
}
