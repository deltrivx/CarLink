package r1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f11112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f11113b;

    public j(p pVar, p pVar2) {
        this.f11112a = pVar;
        this.f11113b = pVar2;
    }

    @Override // r1.p
    public final /* synthetic */ p a(p pVar) {
        return ob.a.g(this, pVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i9.l.a(this.f11112a, jVar.f11112a) && i9.l.a(this.f11113b, jVar.f11113b);
    }

    @Override // r1.p
    public final Object g(h9.n nVar, Object obj) {
        return this.f11113b.g(nVar, this.f11112a.g(nVar, obj));
    }

    @Override // r1.p
    public final boolean h(h9.k kVar) {
        return this.f11112a.h(kVar) && this.f11113b.h(kVar);
    }

    public final int hashCode() {
        return (this.f11113b.hashCode() * 31) + this.f11112a.hashCode();
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("["), (String) g(i.f11111a, ""), ']');
    }
}
