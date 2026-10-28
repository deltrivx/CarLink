package la;

import android.support.v4.media.session.r;
import gb.o;
import i9.l;
import java.util.ArrayList;
import java.util.List;
import nb.a0;
import nb.f0;
import nb.h0;
import nb.k0;
import nb.n0;
import nb.p0;
import nb.s0;
import nb.w;
import nb.x0;
import o9.e0;
import pb.k;
import t8.j;
import u8.q;
import u9.i;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8300d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f8301b = new r(new e());

    static {
        s0 s0Var = s0.f9034b;
        f8299c = a.a(e0.R(s0Var, false, null, 5), b.f8291c, false, null, null, 61);
        f8300d = a.a(e0.R(s0Var, false, null, 5), b.f8290b, false, null, null, 61);
    }

    @Override // nb.p0
    public final n0 d(w wVar) {
        return new f0(h(wVar, new a(s0.f9034b, false, false, null, 62)));
    }

    public final j g(a0 a0Var, x9.e eVar, a aVar) {
        if (a0Var.D0().n().isEmpty()) {
            return new j(a0Var, Boolean.FALSE);
        }
        if (i.z(a0Var)) {
            n0 n0Var = (n0) a0Var.B0().get(0);
            x0 x0VarA = n0Var.a();
            w wVarB = n0Var.b();
            l.d(wVarB, "getType(...)");
            return new j(nb.c.t(n3.l.I(new f0(h(wVarB, aVar), x0VarA)), a0Var.C0(), a0Var.D0(), a0Var.E0()), Boolean.FALSE);
        }
        if (nb.c.j(a0Var)) {
            return new j(pb.l.c(k.ERROR_RAW_TYPE, a0Var.D0().toString()), Boolean.FALSE);
        }
        o oVarS = eVar.S(this);
        l.d(oVarS, "getMemberScope(...)");
        h0 h0VarC0 = a0Var.C0();
        k0 k0VarT = eVar.t();
        l.d(k0VarT, "getTypeConstructor(...)");
        List<r0> listN = eVar.t().n();
        l.d(listN, "getParameters(...)");
        ArrayList arrayList = new ArrayList(q.a0(listN, 10));
        for (r0 r0Var : listN) {
            l.b(r0Var);
            r rVar = this.f8301b;
            arrayList.add(e.a(r0Var, aVar, rVar, rVar.A(r0Var, aVar)));
        }
        return new j(nb.c.v(h0VarC0, k0VarT, arrayList, a0Var.E0(), oVarS, new aa.a(eVar, this, a0Var, aVar)), Boolean.TRUE);
    }

    public final w h(w wVar, a aVar) {
        x9.h hVarL = wVar.D0().l();
        if (hVarL instanceof r0) {
            aVar.getClass();
            return h(this.f8301b.A((r0) hVarL, a.a(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(hVarL instanceof x9.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + hVarL).toString());
        }
        x9.h hVarL2 = nb.c.D(wVar).D0().l();
        if (hVarL2 instanceof x9.e) {
            j jVarG = g(nb.c.l(wVar), (x9.e) hVarL, f8299c);
            a0 a0Var = (a0) jVarG.f12830a;
            boolean zBooleanValue = ((Boolean) jVarG.f12831b).booleanValue();
            j jVarG2 = g(nb.c.D(wVar), (x9.e) hVarL2, f8300d);
            a0 a0Var2 = (a0) jVarG2.f12830a;
            return (zBooleanValue || ((Boolean) jVarG2.f12831b).booleanValue()) ? new h(a0Var, a0Var2) : nb.c.e(a0Var, a0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + hVarL2 + "\" while for lower it's \"" + hVarL + '\"').toString());
    }
}
