package aa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f314b;

    public /* synthetic */ b(c cVar, int i7) {
        this.f313a = i7;
        this.f314b = cVar;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f313a;
        c cVar = this.f314b;
        switch (i7) {
            case 0:
                gb.o oVarT0 = cVar.t0();
                a aVar = new a(0, this);
                pb.i iVar = nb.u0.f9041a;
                if (pb.l.f(cVar)) {
                    return pb.l.c(pb.k.UNABLE_TO_SUBSTITUTE_TYPE, cVar.toString());
                }
                nb.k0 k0VarT = cVar.t();
                if (k0VarT == null) {
                    nb.u0.a(12);
                    throw null;
                }
                if (oVarT0 == null) {
                    nb.u0.a(13);
                    throw null;
                }
                List listD = nb.u0.d(k0VarT.n());
                nb.h0.f8997b.getClass();
                return nb.c.v(nb.h0.f8998c, k0VarT, listD, false, oVarT0, aVar);
            case 1:
                return new gb.i(cVar.t0());
            default:
                return new a0(cVar);
        }
    }
}
