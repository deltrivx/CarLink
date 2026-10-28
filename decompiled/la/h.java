package la;

import gb.o;
import i9.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n3.n;
import nb.a0;
import nb.h0;
import nb.n0;
import nb.p;
import nb.w;
import nb.w0;
import u8.q;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a0 a0Var, a0 a0Var2) {
        super(a0Var, a0Var2);
        l.e(a0Var, "lowerBound");
        l.e(a0Var2, "upperBound");
        ob.e.f9637a.b(a0Var, a0Var2);
    }

    public static final ArrayList M0(ya.g gVar, w wVar) throws IOException {
        List<n0> listB0 = wVar.B0();
        ArrayList arrayList = new ArrayList(q.a0(listB0, 10));
        for (n0 n0Var : listB0) {
            l.e(n0Var, "typeProjection");
            StringBuilder sb2 = new StringBuilder();
            u8.p.p0(n3.l.I(n0Var), sb2, ", ", null, null, new ya.f(gVar, 0), 60);
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    public static final String N0(String str, String str2) {
        if (!j.s0(str, '<')) {
            return str;
        }
        return j.O0('<', str) + '<' + str2 + '>' + j.N0(str, '>', str);
    }

    @Override // nb.w
    public final w F0(ob.g gVar) {
        l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = this.f9023b;
        l.e(a0Var, "type");
        a0 a0Var2 = this.f9024c;
        l.e(a0Var2, "type");
        return new h(a0Var, a0Var2);
    }

    @Override // nb.w0
    public final w0 H0(boolean z10) {
        return new h(this.f9023b.H0(z10), this.f9024c.H0(z10));
    }

    @Override // nb.w0
    /* JADX INFO: renamed from: I0 */
    public final w0 F0(ob.g gVar) {
        l.e(gVar, "kotlinTypeRefiner");
        a0 a0Var = this.f9023b;
        l.e(a0Var, "type");
        a0 a0Var2 = this.f9024c;
        l.e(a0Var2, "type");
        return new h(a0Var, a0Var2);
    }

    @Override // nb.w0
    public final w0 J0(h0 h0Var) {
        l.e(h0Var, "newAttributes");
        return new h(this.f9023b.J0(h0Var), this.f9024c.J0(h0Var));
    }

    @Override // nb.p
    public final a0 K0() {
        return this.f9023b;
    }

    @Override // nb.p
    public final String L0(ya.g gVar, ya.g gVar2) throws IOException {
        a0 a0Var = this.f9023b;
        String strV = gVar.V(a0Var);
        a0 a0Var2 = this.f9024c;
        String strV2 = gVar.V(a0Var2);
        if (gVar2.f15196a.l()) {
            return "raw (" + strV + ".." + strV2 + ')';
        }
        if (a0Var2.B0().isEmpty()) {
            return gVar.D(strV, strV2, n.l0(this));
        }
        ArrayList arrayListM0 = M0(gVar, a0Var);
        ArrayList arrayListM1 = M0(gVar, a0Var2);
        String strQ0 = u8.p.q0(arrayListM0, ", ", null, null, g.f8302a, 30);
        ArrayList arrayListO0 = u8.p.O0(arrayListM0, arrayListM1);
        if (!arrayListO0.isEmpty()) {
            Iterator it = arrayListO0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strV2 = N0(strV2, strQ0);
                    break;
                }
                t8.j jVar = (t8.j) it.next();
                String str = (String) jVar.f12830a;
                String str2 = (String) jVar.f12831b;
                if (!l.a(str, j.H0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strV2 = N0(strV2, strQ0);
            break;
        }
        String strN0 = N0(strV, strQ0);
        return l.a(strN0, strV2) ? strN0 : gVar.D(strN0, strV2, n.l0(this));
    }

    @Override // nb.p, nb.w
    public final o U() {
        x9.h hVarL = D0().l();
        x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
        if (eVar != null) {
            o oVarS = eVar.S(new f());
            l.d(oVarS, "getMemberScope(...)");
            return oVarS;
        }
        throw new IllegalStateException(("Incorrect classifier: " + D0().l()).toString());
    }
}
