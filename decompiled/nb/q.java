package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p implements j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, a0 a0Var2) {
        super(a0Var, a0Var2);
        i9.l.e(a0Var, "lowerBound");
        i9.l.e(a0Var2, "upperBound");
    }

    @Override // nb.w
    public final w F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = this.f9023b;
        i9.l.e(a0Var, "type");
        a0 a0Var2 = this.f9024c;
        i9.l.e(a0Var2, "type");
        return new q(a0Var, a0Var2);
    }

    @Override // nb.w0
    public final w0 H0(boolean z10) {
        return c.e(this.f9023b.H0(z10), this.f9024c.H0(z10));
    }

    @Override // nb.w0
    /* JADX INFO: renamed from: I0 */
    public final w0 F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = this.f9023b;
        i9.l.e(a0Var, "type");
        a0 a0Var2 = this.f9024c;
        i9.l.e(a0Var2, "type");
        return new q(a0Var, a0Var2);
    }

    @Override // nb.w0
    public final w0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return c.e(this.f9023b.J0(h0Var), this.f9024c.J0(h0Var));
    }

    @Override // nb.p
    public final a0 K0() {
        return this.f9023b;
    }

    @Override // nb.p
    public final String L0(ya.g gVar, ya.g gVar2) {
        boolean zL = gVar2.f15196a.l();
        a0 a0Var = this.f9024c;
        a0 a0Var2 = this.f9023b;
        if (!zL) {
            return gVar.D(gVar.V(a0Var2), gVar.V(a0Var), n3.n.l0(this));
        }
        return "(" + gVar.V(a0Var2) + ".." + gVar.V(a0Var) + ')';
    }

    @Override // nb.j
    public final boolean p0() {
        a0 a0Var = this.f9023b;
        return (a0Var.D0().l() instanceof x9.r0) && i9.l.a(a0Var.D0(), this.f9024c.D0());
    }

    @Override // nb.p
    public final String toString() {
        return "(" + this.f9023b + ".." + this.f9024c + ')';
    }

    @Override // nb.j
    public final w0 v0(w wVar) {
        w0 w0VarE;
        i9.l.e(wVar, "replacement");
        w0 w0VarG0 = wVar.G0();
        if (w0VarG0 instanceof p) {
            w0VarE = w0VarG0;
        } else {
            if (!(w0VarG0 instanceof a0)) {
                throw new cc.s();
            }
            a0 a0Var = (a0) w0VarG0;
            w0VarE = c.e(a0Var, a0Var.H0(true));
        }
        return c.h(w0VarE, w0VarG0);
    }
}
