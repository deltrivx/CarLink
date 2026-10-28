package nb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends w0 implements qb.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f9023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f9024c;

    public p(a0 a0Var, a0 a0Var2) {
        i9.l.e(a0Var, "lowerBound");
        i9.l.e(a0Var2, "upperBound");
        this.f9023b = a0Var;
        this.f9024c = a0Var2;
    }

    @Override // nb.w
    public final List B0() {
        return K0().B0();
    }

    @Override // nb.w
    public final h0 C0() {
        return K0().C0();
    }

    @Override // nb.w
    public final k0 D0() {
        return K0().D0();
    }

    @Override // nb.w
    public final boolean E0() {
        return K0().E0();
    }

    public abstract a0 K0();

    public abstract String L0(ya.g gVar, ya.g gVar2);

    @Override // nb.w
    public gb.o U() {
        return K0().U();
    }

    public String toString() {
        return ya.g.f15195e.V(this);
    }
}
