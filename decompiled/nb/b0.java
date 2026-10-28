package nb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f8975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gb.o f8978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9.k f8979f;

    public b0(k0 k0Var, List list, boolean z10, gb.o oVar, h9.k kVar) {
        i9.l.e(k0Var, "constructor");
        i9.l.e(list, "arguments");
        i9.l.e(oVar, "memberScope");
        this.f8975b = k0Var;
        this.f8976c = list;
        this.f8977d = z10;
        this.f8978e = oVar;
        this.f8979f = kVar;
        if (!(oVar instanceof pb.g) || (oVar instanceof pb.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + oVar + '\n' + k0Var);
    }

    @Override // nb.w
    public final List B0() {
        return this.f8976c;
    }

    @Override // nb.w
    public final h0 C0() {
        h0.f8997b.getClass();
        return h0.f8998c;
    }

    @Override // nb.w
    public final k0 D0() {
        return this.f8975b;
    }

    @Override // nb.w
    public final boolean E0() {
        return this.f8977d;
    }

    @Override // nb.w
    public final w F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = (a0) this.f8979f.invoke(gVar);
        return a0Var == null ? this : a0Var;
    }

    @Override // nb.w0
    /* JADX INFO: renamed from: I0 */
    public final w0 F0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = (a0) this.f8979f.invoke(gVar);
        return a0Var == null ? this : a0Var;
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        if (z10 == this.f8977d) {
            return this;
        }
        return z10 ? new z(this, 1) : new z(this, 0);
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return h0Var.isEmpty() ? this : new c0(this, h0Var);
    }

    @Override // nb.w
    public final gb.o U() {
        return this.f8978e;
    }
}
