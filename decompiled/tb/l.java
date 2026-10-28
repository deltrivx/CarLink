package tb;

import aa.y0;
import java.util.List;
import nb.a0;
import nb.f0;
import nb.h0;
import nb.u0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f12913b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f12914c = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12915a;

    public /* synthetic */ l(int i7) {
        this.f12915a = i7;
    }

    @Override // tb.e
    public final String a() {
        switch (this.f12915a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    @Override // tb.e
    public final boolean b(ia.e eVar) {
        a0 a0VarS;
        switch (this.f12915a) {
            case 0:
                y0 y0Var = (y0) eVar.X().get(1);
                u9.l lVar = u9.m.f13161d;
                i9.l.b(y0Var);
                x9.y yVarJ = db.e.j(y0Var);
                lVar.getClass();
                x9.e eVarD = x9.v.d(yVarJ, u9.n.R);
                if (eVarD == null) {
                    a0VarS = null;
                } else {
                    h0.f8997b.getClass();
                    h0 h0Var = h0.f8998c;
                    List listN = eVarD.t().n();
                    i9.l.d(listN, "getParameters(...)");
                    Object objA0 = u8.p.A0(listN);
                    i9.l.d(objA0, "single(...)");
                    a0VarS = nb.c.s(h0Var, eVarD, n3.l.I(new f0((r0) objA0)));
                }
                if (a0VarS == null) {
                    return false;
                }
                nb.w type = y0Var.getType();
                i9.l.d(type, "getType(...)");
                return ob.e.f9637a.b(a0VarS, u0.g(type, false));
            default:
                List<y0> listX = eVar.X();
                i9.l.d(listX, "getValueParameters(...)");
                if (!listX.isEmpty()) {
                    for (y0 y0Var2 : listX) {
                        i9.l.b(y0Var2);
                        if (db.e.a(y0Var2) || y0Var2.f475j != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // tb.e
    public final String c(ia.e eVar) {
        switch (this.f12915a) {
            case 0:
                break;
        }
        return n4.h.M(this, eVar);
    }
}
