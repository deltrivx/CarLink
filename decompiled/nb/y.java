package nb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.n f9057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.a f9058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f9059d;

    public y(mb.n nVar, h9.a aVar) {
        i9.l.e(nVar, "storageManager");
        this.f9057b = nVar;
        this.f9058c = aVar;
        this.f9059d = new mb.i((mb.k) nVar, aVar);
    }

    @Override // nb.w
    public final List B0() {
        return H0().B0();
    }

    @Override // nb.w
    public final h0 C0() {
        return H0().C0();
    }

    @Override // nb.w
    public final k0 D0() {
        return H0().D0();
    }

    @Override // nb.w
    public final boolean E0() {
        return H0().E0();
    }

    @Override // nb.w
    public final w F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        return new y(this.f9057b, new aa.j(12, gVar, this));
    }

    @Override // nb.w
    public final w0 G0() {
        w wVarH0 = H0();
        while (wVarH0 instanceof y) {
            wVarH0 = ((y) wVarH0).H0();
        }
        i9.l.c(wVarH0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (w0) wVarH0;
    }

    public final w H0() {
        return (w) this.f9059d.invoke();
    }

    @Override // nb.w
    public final gb.o U() {
        return H0().U();
    }

    public final String toString() {
        mb.i iVar = this.f9059d;
        return (iVar.f8621c == mb.j.f8622a || iVar.f8621c == mb.j.f8623b) ? "<Not computed yet>" : H0().toString();
    }
}
