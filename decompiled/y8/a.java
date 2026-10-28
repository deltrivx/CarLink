package y8;

import h9.n;
import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15104a;

    public a(g gVar) {
        this.f15104a = gVar;
    }

    @Override // y8.f
    public final g getKey() {
        return this.f15104a;
    }

    @Override // y8.h
    public h h(g gVar) {
        return u.F(this, gVar);
    }

    @Override // y8.h
    public f l(g gVar) {
        return u.A(this, gVar);
    }

    @Override // y8.h
    public final Object q(n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // y8.h
    public final h s(h hVar) {
        return u.G(this, hVar);
    }
}
