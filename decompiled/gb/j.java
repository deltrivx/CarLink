package gb;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f6189b;

    public /* synthetic */ j(h9.a aVar, int i7) {
        this.f6188a = i7;
        this.f6189b = aVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f6188a) {
            case 0:
                o oVar = (o) this.f6189b.invoke();
                return oVar instanceof k ? ((k) oVar).h() : oVar;
            default:
                return u8.p.M0((Iterable) this.f6189b.invoke());
        }
    }
}
