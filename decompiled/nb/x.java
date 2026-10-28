package nb;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9049a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f9050b;

    public x(gb.o oVar, List list, h0 h0Var, k0 k0Var, boolean z10) {
        this.f9050b = k0Var;
    }

    public x(List list, h0 h0Var, k0 k0Var, boolean z10) {
        this.f9050b = k0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        ob.g gVar = (ob.g) obj;
        switch (this.f9049a) {
            case 0:
                i9.l.e(gVar, "refiner");
                this.f9050b.l();
                break;
            default:
                i9.l.e(gVar, "kotlinTypeRefiner");
                this.f9050b.l();
                break;
        }
        return null;
    }
}
