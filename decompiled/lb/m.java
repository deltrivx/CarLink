package lb;

import u8.f0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f8339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f8340c;

    public /* synthetic */ m(n nVar, o oVar, int i7) {
        this.f8338a = i7;
        this.f8339b = nVar;
        this.f8340c = oVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f8338a) {
            case 0:
                return f0.g0(this.f8339b.f8342a.keySet(), this.f8340c.o());
            default:
                return f0.g0(this.f8339b.f8343b.keySet(), this.f8340c.p());
        }
    }
}
