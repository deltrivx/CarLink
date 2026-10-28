package nb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends a0 {
    @Override // nb.w
    public final List B0() {
        return M0().B0();
    }

    @Override // nb.w
    public h0 C0() {
        return M0().C0();
    }

    @Override // nb.w
    public final k0 D0() {
        return M0().D0();
    }

    @Override // nb.w
    public boolean E0() {
        return M0().E0();
    }

    public abstract a0 M0();

    @Override // nb.w0
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a0 I0(ob.g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        a0 a0VarM0 = M0();
        i9.l.e(a0VarM0, "type");
        return O0(a0VarM0);
    }

    public abstract m O0(a0 a0Var);

    @Override // nb.w
    public final gb.o U() {
        return M0().U();
    }
}
