package oa;

import nb.a0;
import nb.h0;
import nb.u0;
import nb.w;
import nb.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends nb.m implements nb.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f9590b;

    public g(a0 a0Var) {
        i9.l.e(a0Var, "delegate");
        this.f9590b = a0Var;
    }

    @Override // nb.m, nb.w
    public final boolean E0() {
        return false;
    }

    @Override // nb.a0, nb.w0
    public final w0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return new g(this.f9590b.J0(h0Var));
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        return z10 ? this.f9590b.H0(true) : this;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return new g(this.f9590b.J0(h0Var));
    }

    @Override // nb.m
    public final a0 M0() {
        return this.f9590b;
    }

    @Override // nb.m
    public final nb.m O0(a0 a0Var) {
        return new g(a0Var);
    }

    @Override // nb.j
    public final boolean p0() {
        return true;
    }

    @Override // nb.j
    public final w0 v0(w wVar) {
        i9.l.e(wVar, "replacement");
        w0 w0VarG0 = wVar.G0();
        if (!u0.f(w0VarG0) && !u0.e(w0VarG0)) {
            return w0VarG0;
        }
        if (w0VarG0 instanceof a0) {
            a0 a0Var = (a0) w0VarG0;
            a0 a0VarH0 = a0Var.H0(false);
            return !u0.f(a0Var) ? a0VarH0 : new g(a0VarH0);
        }
        if (!(w0VarG0 instanceof nb.p)) {
            throw new cc.s();
        }
        nb.p pVar = (nb.p) w0VarG0;
        a0 a0Var2 = pVar.f9023b;
        a0 a0VarH1 = a0Var2.H0(false);
        if (u0.f(a0Var2)) {
            a0VarH1 = new g(a0VarH1);
        }
        a0 a0Var3 = pVar.f9024c;
        a0 a0VarH2 = a0Var3.H0(false);
        if (u0.f(a0Var3)) {
            a0VarH2 = new g(a0VarH2);
        }
        return nb.c.F(nb.c.e(a0VarH1, a0VarH2), nb.c.f(w0VarG0));
    }
}
