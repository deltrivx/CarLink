package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends p implements v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f9026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f9027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, w wVar) {
        super(pVar.f9023b, pVar.f9024c);
        i9.l.e(pVar, "origin");
        i9.l.e(wVar, "enhancement");
        this.f9026d = pVar;
        this.f9027e = wVar;
    }

    @Override // nb.v0
    public final w D() {
        return this.f9027e;
    }

    @Override // nb.w
    public final w F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        p pVar = this.f9026d;
        i9.l.e(pVar, "type");
        w wVar = this.f9027e;
        i9.l.e(wVar, "type");
        return new r(pVar, wVar);
    }

    @Override // nb.w0
    public final w0 H0(boolean z10) {
        return c.F(this.f9026d.H0(z10), this.f9027e.G0().H0(z10));
    }

    @Override // nb.w0
    /* JADX INFO: renamed from: I0 */
    public final w0 F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        p pVar = this.f9026d;
        i9.l.e(pVar, "type");
        w wVar = this.f9027e;
        i9.l.e(wVar, "type");
        return new r(pVar, wVar);
    }

    @Override // nb.w0
    public final w0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return c.F(this.f9026d.J0(h0Var), this.f9027e);
    }

    @Override // nb.p
    public final a0 K0() {
        return this.f9026d.K0();
    }

    @Override // nb.p
    public final String L0(ya.g gVar, ya.g gVar2) {
        ya.k kVar = gVar2.f15196a;
        return ((Boolean) kVar.f15228m.a(kVar, ya.k.Y[11])).booleanValue() ? gVar.V(this.f9027e) : this.f9026d.L0(gVar, gVar2);
    }

    @Override // nb.p
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f9027e + ")] " + this.f9026d;
    }

    @Override // nb.v0
    public final w0 w0() {
        return this.f9026d;
    }
}
