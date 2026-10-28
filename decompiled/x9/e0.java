package x9;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.c f14699b;

    public /* synthetic */ e0(wa.c cVar, int i7) {
        this.f14698a = i7;
        this.f14699b = cVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f14698a) {
            case 0:
                wa.c cVar = (wa.c) obj;
                i9.l.e(cVar, "it");
                return Boolean.valueOf(!cVar.f14240a.c() && cVar.b().equals(this.f14699b));
            default:
                y9.h hVar = (y9.h) obj;
                i9.l.e(hVar, "it");
                return hVar.g(this.f14699b);
        }
    }
}
