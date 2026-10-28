package ga;

import aa.s0;
import java.util.List;
import nb.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements za.e {
    @Override // za.e
    public final int a() {
        return 2;
    }

    @Override // za.e
    public final int b(x9.b bVar, x9.b bVar2, x9.e eVar) {
        i9.l.e(bVar, "superDescriptor");
        i9.l.e(bVar2, "subDescriptor");
        if (bVar2 instanceof ia.e) {
            ia.e eVar2 = (ia.e) bVar2;
            if (eVar2.getTypeParameters().isEmpty()) {
                za.i iVarI = za.j.i(bVar, bVar2);
                if ((iVarI != null ? iVarI.b() : 0) == 0) {
                    List listX = eVar2.X();
                    i9.l.d(listX, "getValueParameters(...)");
                    yb.q qVarS = yb.l.S(u8.p.f0(listX), d.f6056e);
                    nb.w wVar = eVar2.f478g;
                    i9.l.b(wVar);
                    yb.i iVarP = yb.l.P(u8.l.k0(new yb.j[]{qVarS, new u8.o(3, wVar)}));
                    aa.a0 a0Var = eVar2.f480i;
                    yb.g gVar = new yb.g(yb.l.P(u8.l.k0(new yb.j[]{iVarP, u8.p.f0(n3.l.K(a0Var != null ? a0Var.getType() : null))})));
                    while (gVar.hasNext()) {
                        nb.w wVar2 = (nb.w) gVar.next();
                        if (wVar2.B0().isEmpty() || (wVar2.G0() instanceof la.h)) {
                        }
                    }
                    x9.b bVarBuild = (x9.b) bVar.e(new r0(new la.f()));
                    if (bVarBuild != null) {
                        if (bVarBuild instanceof s0) {
                            s0 s0Var = (s0) bVarBuild;
                            if (!s0Var.getTypeParameters().isEmpty()) {
                                bVarBuild = s0Var.s0().D().build();
                                i9.l.b(bVarBuild);
                            }
                        }
                        int iB = za.j.f15799c.n(bVarBuild, bVar2, false).b();
                        a2.f.O(iB, "getResult(...)");
                        if (h.f6081a[e1.d.b(iB)] == 1) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 3;
    }
}
