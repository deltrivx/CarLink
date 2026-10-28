package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 implements r1.n {
    @Override // r1.p
    public final /* synthetic */ r1.p a(r1.p pVar) {
        return ob.a.g(this, pVar);
    }

    @Override // r1.p
    public final Object g(h9.n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // r1.p
    public final boolean h(h9.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public abstract r1.o i();

    public abstract void j(r1.o oVar);
}
