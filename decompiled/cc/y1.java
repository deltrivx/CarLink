package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements y8.f, y8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f2688a = new y1();

    @Override // y8.f
    public final y8.g getKey() {
        return this;
    }

    @Override // y8.h
    public final y8.h h(y8.g gVar) {
        return n3.u.F(this, gVar);
    }

    @Override // y8.h
    public final y8.f l(y8.g gVar) {
        return n3.u.A(this, gVar);
    }

    @Override // y8.h
    public final Object q(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // y8.h
    public final y8.h s(y8.h hVar) {
        return n3.u.G(this, hVar);
    }
}
