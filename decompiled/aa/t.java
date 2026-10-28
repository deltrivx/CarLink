package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f433b;

    public /* synthetic */ t(v vVar, int i7) {
        this.f432a = i7;
        this.f433b = vVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f432a) {
            case 0:
                wa.e eVar = (wa.e) obj;
                if (eVar != null) {
                    v vVar = this.f433b;
                    return vVar.j(eVar, vVar.i().f(eVar, fa.b.f5507f));
                }
                v.h(8);
                throw null;
            default:
                wa.e eVar2 = (wa.e) obj;
                if (eVar2 != null) {
                    v vVar2 = this.f433b;
                    return vVar2.j(eVar2, vVar2.i().b(eVar2, fa.b.f5507f));
                }
                v.h(4);
                throw null;
        }
    }
}
