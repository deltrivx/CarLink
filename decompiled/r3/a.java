package r3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f11526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(t tVar, int i7) {
        super(1);
        this.f11525a = i7;
        this.f11526b = tVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f11525a) {
            case 0:
                return new e8.p(9, this.f11526b);
            default:
                t tVar = this.f11526b;
                if (tVar.f11591e.f11584a) {
                    tVar.f11590d.invoke();
                }
                return t8.z.f12851a;
        }
    }
}
