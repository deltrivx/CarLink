package bb;

import nb.a0;
import nb.f0;
import nb.h0;
import nb.w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends g {
    public s(wa.b bVar, int i7) {
        super(new q(new f(bVar, i7)));
    }

    @Override // bb.g
    public final nb.w a(x9.y yVar) {
        nb.w wVarC;
        i9.l.e(yVar, "module");
        h0.f8997b.getClass();
        h0 h0Var = h0.f8998c;
        u9.i iVarK = yVar.k();
        iVarK.getClass();
        x9.e eVarJ = iVarK.j(u9.n.Q.g());
        Object obj = this.f1683a;
        r rVar = (r) obj;
        if (rVar instanceof p) {
            wVarC = ((p) obj).f1690a;
        } else {
            if (!(rVar instanceof q)) {
                throw new cc.s();
            }
            f fVar = ((q) obj).f1691a;
            wa.b bVar = fVar.f1681a;
            int i7 = fVar.f1682b;
            x9.e eVarD = x9.v.d(yVar, bVar);
            if (eVarD == null) {
                wVarC = pb.l.c(pb.k.UNRESOLVED_KCLASS_CONSTANT_VALUE, bVar.toString(), String.valueOf(i7));
            } else {
                a0 a0VarN = eVarD.n();
                i9.l.d(a0VarN, "getDefaultType(...)");
                w0 w0VarI0 = n3.n.I0(a0VarN);
                for (int i10 = 0; i10 < i7; i10++) {
                    w0VarI0 = yVar.k().h(w0VarI0);
                }
                wVarC = w0VarI0;
            }
        }
        return nb.c.s(h0Var, eVarJ, n3.l.I(new f0(wVarC)));
    }
}
