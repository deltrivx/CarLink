package ya;

import aa.a0;
import aa.q0;
import aa.r0;
import aa.x;
import aa.y0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nb.n0;
import nb.u0;
import nb.w;
import nb.w0;
import nb.y;
import o9.u;
import x9.c0;
import x9.d0;
import x9.h0;
import x9.k0;
import x9.l0;
import x9.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f15193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f15194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f15195e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t8.o f15197b = t8.a.d(new l0(2, this));

    static {
        n3.n.R0(d.f15175b);
        n3.n.R0(d.f15177d);
        n3.n.R0(d.f15178e);
        n3.n.R0(d.f15179f);
        n3.n.R0(d.f15180g);
        n3.n.R0(d.f15181h);
        f15193c = n3.n.R0(d.f15182i);
        n3.n.R0(d.f15183j);
        f15194d = n3.n.R0(d.k);
        f15195e = n3.n.R0(d.f15184l);
        n3.n.R0(d.f15176c);
    }

    public g(k kVar) {
        this.f15196a = kVar;
    }

    public static void U(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public static boolean g0(w wVar) {
        if (!n4.h.O(wVar)) {
            return false;
        }
        List listB0 = wVar.B0();
        if (listB0 != null && listB0.isEmpty()) {
            return true;
        }
        Iterator it = listB0.iterator();
        while (it.hasNext()) {
            if (((n0) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void l(g gVar, k0 k0Var, StringBuilder sb2) throws IOException {
        boolean zP = gVar.p();
        k kVar = gVar.f15196a;
        if (!zP) {
            j jVar = kVar.f15223g;
            u[] uVarArr = k.Y;
            if (!((Boolean) jVar.a(kVar, uVarArr[5])).booleanValue()) {
                List listI0 = k0Var.i0();
                i9.l.d(listI0, "getContextReceiverParameters(...)");
                gVar.A(sb2, listI0);
                if (gVar.o().contains(h.ANNOTATIONS)) {
                    gVar.w(sb2, k0Var, null);
                    x xVarH0 = k0Var.h0();
                    if (xVarH0 != null) {
                        gVar.w(sb2, xVarH0, y9.d.FIELD);
                    }
                    x xVarF0 = k0Var.f0();
                    if (xVarF0 != null) {
                        gVar.w(sb2, xVarF0, y9.d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((p) kVar.H.a(kVar, uVarArr[32])) == p.f15252b) {
                        q0 q0VarB = k0Var.b();
                        if (q0VarB != null) {
                            gVar.w(sb2, q0VarB, y9.d.PROPERTY_GETTER);
                        }
                        r0 r0VarC = k0Var.c();
                        if (r0VarC != null) {
                            gVar.w(sb2, r0VarC, y9.d.PROPERTY_SETTER);
                            List listX = r0VarC.X();
                            i9.l.d(listX, "getValueParameters(...)");
                            y0 y0Var = (y0) u8.p.A0(listX);
                            i9.l.b(y0Var);
                            gVar.w(sb2, y0Var, y9.d.SETTER_PARAMETER);
                        }
                    }
                }
                ga.o oVarD = k0Var.d();
                i9.l.d(oVarD, "getVisibility(...)");
                gVar.e0(oVarD, sb2);
                gVar.L(sb2, gVar.o().contains(h.CONST) && k0Var.v(), "const");
                gVar.I(k0Var, sb2);
                gVar.K(sb2, k0Var);
                gVar.Q(sb2, k0Var);
                gVar.L(sb2, gVar.o().contains(h.LATEINIT) && k0Var.j0(), "lateinit");
                gVar.H(sb2, k0Var);
            }
            gVar.b0(k0Var, sb2, false);
            List typeParameters = k0Var.getTypeParameters();
            i9.l.d(typeParameters, "getTypeParameters(...)");
            gVar.a0(sb2, typeParameters, true);
            gVar.S(sb2, k0Var);
        }
        gVar.N(k0Var, sb2, true);
        sb2.append(": ");
        w type = k0Var.getType();
        i9.l.d(type, "getType(...)");
        sb2.append(gVar.V(type));
        gVar.T(sb2, k0Var);
        gVar.F(k0Var, sb2);
        List typeParameters2 = k0Var.getTypeParameters();
        i9.l.d(typeParameters2, "getTypeParameters(...)");
        gVar.f0(sb2, typeParameters2);
    }

    public static x9.x t(x9.w wVar) {
        boolean z10 = wVar instanceof x9.e;
        x9.x xVar = x9.x.f14750e;
        x9.f fVar = x9.f.f14702b;
        x9.x xVar2 = x9.x.f14747b;
        if (z10) {
            return ((x9.e) wVar).f() == fVar ? xVar : xVar2;
        }
        x9.k kVarL = wVar.l();
        x9.e eVar = kVarL instanceof x9.e ? (x9.e) kVarL : null;
        if (eVar == null || !(wVar instanceof x9.c)) {
            return xVar2;
        }
        x9.c cVar = (x9.c) wVar;
        Collection collectionM = cVar.m();
        i9.l.d(collectionM, "getOverriddenDescriptors(...)");
        boolean zIsEmpty = collectionM.isEmpty();
        x9.x xVar3 = x9.x.f14749d;
        if (!zIsEmpty && eVar.i() != xVar2) {
            return xVar3;
        }
        if (eVar.f() != fVar || i9.l.a(cVar.d(), x9.o.f14717a)) {
            return xVar2;
        }
        return cVar.i() == xVar ? xVar : xVar3;
    }

    public final void A(StringBuilder sb2, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            int i10 = i7 + 1;
            a0 a0Var = (a0) it.next();
            w(sb2, a0Var, y9.d.RECEIVER);
            w type = a0Var.getType();
            i9.l.d(type, "getType(...)");
            sb2.append(E(type));
            if (i7 == n3.l.A(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i7 = i10;
        }
    }

    public final void B(StringBuilder sb2, nb.a0 a0Var) {
        w(sb2, a0Var, null);
        if (nb.c.j(a0Var)) {
            boolean z10 = a0Var instanceof pb.i;
            k kVar = this.f15196a;
            if (z10 && ((pb.i) a0Var).f10382d.f10414b && ((Boolean) kVar.V.a(kVar, k.Y[47])).booleanValue()) {
                pb.l lVar = pb.l.f10415a;
                if (z10) {
                    boolean z11 = ((pb.i) a0Var).f10382d.f10414b;
                }
                nb.k0 k0VarD0 = a0Var.D0();
                i9.l.c(k0VarD0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(C(((pb.j) k0VarD0).f10388b[0]));
            } else {
                if (!z10 || ((Boolean) kVar.X.a(kVar, k.Y[49])).booleanValue()) {
                    sb2.append(a0Var.D0().toString());
                } else {
                    sb2.append(((pb.i) a0Var).f10386h);
                }
                sb2.append(W(a0Var.B0()));
            }
        } else {
            nb.k0 k0VarD1 = a0Var.D0();
            x9.h hVarL = a0Var.D0().l();
            a2.b bVarA = v.a(a0Var, hVarL instanceof x9.i ? (x9.i) hVarL : null, 0);
            if (bVarA == null) {
                sb2.append(X(k0VarD1));
                sb2.append(W(a0Var.B0()));
            } else {
                R(sb2, bVarA);
            }
        }
        if (a0Var.E0()) {
            sb2.append("?");
        }
        if (a0Var instanceof nb.l) {
            sb2.append(" & Any");
        }
    }

    public final String C(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return a2.f.G("<font color=red><b>", str, "</b></font>");
        }
        throw new cc.s();
    }

    public final String D(String str, String str2, u9.i iVar) {
        i9.l.e(str, "lowerRendered");
        i9.l.e(str2, "upperRendered");
        if (n3.r.d0(str, str2)) {
            return zb.q.o0(str2, "(") ? a2.f.G("(", str, ")!") : str.concat("!");
        }
        String strP0 = zb.j.P0(n().a(iVar.j(u9.n.C), this), "Collection");
        String strQ = n3.r.Q(str, strP0.concat("Mutable"), str2, strP0, strP0.concat("(Mutable)"));
        if (strQ != null) {
            return strQ;
        }
        String strQ2 = n3.r.Q(str, strP0.concat("MutableMap.MutableEntry"), str2, strP0.concat("Map.Entry"), strP0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strQ2 != null) {
            return strQ2;
        }
        String strP1 = zb.j.P0(n().a(iVar.k("Array"), this), "Array");
        String strQ3 = n3.r.Q(str, strP1.concat(m("Array<")), str2, strP1.concat(m("Array<out ")), strP1.concat(m("Array<(out) ")));
        if (strQ3 != null) {
            return strQ3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String E(w wVar) throws IOException {
        String strV = V(wVar);
        if ((!g0(wVar) || u0.e(wVar)) && !(wVar instanceof nb.l)) {
            return strV;
        }
        return "(" + strV + ')';
    }

    public final void F(x9.u0 u0Var, StringBuilder sb2) {
        bb.g gVarT;
        String strZ;
        k kVar = this.f15196a;
        if (!((Boolean) kVar.f15236u.a(kVar, k.Y[19])).booleanValue() || (gVarT = u0Var.T()) == null || (strZ = z(gVarT)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(m(strZ));
    }

    public final String G(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new cc.s();
            }
            k kVar = this.f15196a;
            if (!((Boolean) kVar.W.a(kVar, k.Y[48])).booleanValue()) {
                return a2.f.G("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void H(StringBuilder sb2, x9.c cVar) {
        String str;
        if (o().contains(h.MEMBER_KIND) && s() && cVar.f() != 1) {
            sb2.append("/*");
            int iF = cVar.f();
            if (iF == 1) {
                str = "DECLARATION";
            } else if (iF == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iF == 3) {
                str = "DELEGATION";
            } else {
                if (iF != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb2.append(n3.l.Z(str));
            sb2.append("*/ ");
        }
    }

    public final void I(x9.w wVar, StringBuilder sb2) {
        L(sb2, wVar.s(), "external");
        boolean z10 = false;
        L(sb2, o().contains(h.EXPECT) && wVar.G(), "expect");
        if (o().contains(h.ACTUAL) && wVar.u0()) {
            z10 = true;
        }
        L(sb2, z10, "actual");
    }

    public final void J(x9.x xVar, StringBuilder sb2, x9.x xVar2) {
        k kVar = this.f15196a;
        if (((Boolean) kVar.f15231p.a(kVar, k.Y[14])).booleanValue() || xVar != xVar2) {
            L(sb2, o().contains(h.MODALITY), n3.l.Z(xVar.name()));
        }
    }

    public final void K(StringBuilder sb2, x9.c cVar) {
        if (za.d.s(cVar) && cVar.i() == x9.x.f14747b) {
            return;
        }
        k kVar = this.f15196a;
        if (((n) kVar.B.a(kVar, k.Y[26])) == n.f15244a && cVar.i() == x9.x.f14749d && !cVar.m().isEmpty()) {
            return;
        }
        x9.x xVarI = cVar.i();
        i9.l.d(xVarI, "getModality(...)");
        J(xVarI, sb2, t(cVar));
    }

    public final void L(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(G(str));
            sb2.append(" ");
        }
    }

    public final String M(wa.e eVar, boolean z10) {
        String strM = m(n3.r.O(eVar));
        k kVar = this.f15196a;
        return (((Boolean) kVar.W.a(kVar, k.Y[48])).booleanValue() && q() == s.f15255b && z10) ? a2.f.G("<b>", strM, "</b>") : strM;
    }

    public final void N(x9.k kVar, StringBuilder sb2, boolean z10) {
        wa.e name = kVar.getName();
        i9.l.d(name, "getName(...)");
        sb2.append(M(name, z10));
    }

    public final void O(StringBuilder sb2, w wVar) throws IOException {
        w0 w0VarG0 = wVar.G0();
        nb.a aVar = w0VarG0 instanceof nb.a ? (nb.a) w0VarG0 : null;
        if (aVar == null) {
            P(sb2, wVar);
            return;
        }
        nb.a0 a0Var = aVar.f8974c;
        nb.a0 a0Var2 = aVar.f8973b;
        k kVar = this.f15196a;
        j jVar = kVar.R;
        u[] uVarArr = k.Y;
        boolean zBooleanValue = ((Boolean) jVar.a(kVar, uVarArr[42])).booleanValue();
        q qVar = s.f15255b;
        if (zBooleanValue) {
            P(sb2, a0Var2);
            if (((Boolean) kVar.S.a(kVar, uVarArr[43])).booleanValue()) {
                if (q() == qVar) {
                    sb2.append("<font color=\"808080\"><i>");
                }
                sb2.append(" /* ");
                sb2.append("from: ");
                P(sb2, a0Var);
                sb2.append(" */");
                if (q() == qVar) {
                    sb2.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        P(sb2, a0Var);
        if (((Boolean) kVar.Q.a(kVar, uVarArr[41])).booleanValue()) {
            if (q() == qVar) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* ");
            sb2.append("= ");
            P(sb2, a0Var2);
            sb2.append(" */");
            if (q() == qVar) {
                sb2.append("</i></font>");
            }
        }
    }

    public final void P(StringBuilder sb2, w wVar) throws IOException {
        wa.e eVarB;
        String strM;
        k kVar = this.f15196a;
        if ((wVar instanceof y) && kVar.l()) {
            mb.i iVar = ((y) wVar).f9059d;
            if (iVar.f8621c == mb.j.f8622a || iVar.f8621c == mb.j.f8623b) {
                sb2.append("<Not computed yet>");
                return;
            }
        }
        w0 w0VarG0 = wVar.G0();
        if (w0VarG0 instanceof nb.p) {
            sb2.append(((nb.p) w0VarG0).L0(this, this));
            return;
        }
        if (!(w0VarG0 instanceof nb.a0)) {
            throw new cc.s();
        }
        nb.a0 a0Var = (nb.a0) w0VarG0;
        if (a0Var.equals(u0.f9042b) || a0Var.D0() == u0.f9041a.f10380b) {
            sb2.append("???");
            return;
        }
        nb.k0 k0VarD0 = a0Var.D0();
        if ((k0VarD0 instanceof pb.j) && ((pb.j) k0VarD0).f10387a == pb.k.UNINFERRED_TYPE_VARIABLE) {
            if (!((Boolean) kVar.f15235t.a(kVar, k.Y[18])).booleanValue()) {
                sb2.append("???");
                return;
            }
            nb.k0 k0VarD1 = a0Var.D0();
            i9.l.c(k0VarD1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(C(((pb.j) k0VarD1).f10388b[0]));
            return;
        }
        if (nb.c.j(a0Var)) {
            B(sb2, a0Var);
            return;
        }
        if (!g0(a0Var)) {
            B(sb2, a0Var);
            return;
        }
        int length = sb2.length();
        ((g) this.f15197b.getValue()).w(sb2, a0Var, null);
        boolean z10 = sb2.length() != length;
        w wVarH = n4.h.H(a0Var);
        List listE = n4.h.E(a0Var);
        boolean zQ = n4.h.Q(a0Var);
        boolean zE0 = a0Var.E0();
        boolean z11 = zE0 || (z10 && wVarH != null);
        if (z11) {
            if (zQ) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    n3.l.H(zb.j.C0(sb2));
                    if (sb2.charAt(zb.j.w0(sb2) - 1) != ')') {
                        sb2.insert(zb.j.w0(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator it = listE.subList(0, n3.l.A(listE)).iterator();
            while (it.hasNext()) {
                O(sb2, (w) it.next());
                sb2.append(", ");
            }
            O(sb2, (w) u8.p.s0(listE));
            sb2.append(") ");
        }
        L(sb2, zQ, "suspend");
        if (wVarH != null) {
            boolean z12 = (g0(wVarH) && !wVarH.E0()) || n4.h.Q(wVarH) || !wVarH.getAnnotations().isEmpty() || (wVarH instanceof nb.l);
            if (z12) {
                sb2.append("(");
            }
            O(sb2, wVarH);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!n4.h.O(a0Var) || a0Var.getAnnotations().g(u9.n.f13186p) == null || a0Var.B0().size() > 1) {
            int i7 = 0;
            for (n0 n0Var : n4.h.J(a0Var)) {
                int i10 = i7 + 1;
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (((Boolean) kVar.U.a(kVar, k.Y[45])).booleanValue()) {
                    w wVarB = n0Var.b();
                    i9.l.d(wVarB, "getType(...)");
                    eVarB = n4.h.B(wVarB);
                } else {
                    eVarB = null;
                }
                if (eVarB != null) {
                    sb2.append(M(eVarB, false));
                    sb2.append(": ");
                }
                i9.l.e(n0Var, "typeProjection");
                StringBuilder sb3 = new StringBuilder();
                u8.p.p0(n3.l.I(n0Var), sb3, ", ", null, null, new f(this, 0), 60);
                sb2.append(sb3.toString());
                i7 = i10;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            strM = m("->");
        } else {
            if (iOrdinal != 1) {
                throw new cc.s();
            }
            strM = "&rarr;";
        }
        sb2.append(strM);
        sb2.append(" ");
        n4.h.O(a0Var);
        w wVarB2 = ((n0) u8.p.s0(a0Var.B0())).b();
        i9.l.d(wVarB2, "getType(...)");
        O(sb2, wVarB2);
        if (z11) {
            sb2.append(")");
        }
        if (zE0) {
            sb2.append("?");
        }
    }

    public final void Q(StringBuilder sb2, x9.c cVar) {
        if (o().contains(h.OVERRIDE) && !cVar.m().isEmpty()) {
            k kVar = this.f15196a;
            if (((n) kVar.B.a(kVar, k.Y[26])) != n.f15245b) {
                L(sb2, true, "override");
                if (s()) {
                    sb2.append("/*");
                    sb2.append(cVar.m().size());
                    sb2.append("*/ ");
                }
            }
        }
    }

    public final void R(StringBuilder sb2, a2.b bVar) {
        a2.b bVar2 = (a2.b) bVar.f14d;
        x9.i iVar = (x9.i) bVar.f12b;
        if (bVar2 != null) {
            R(sb2, bVar2);
            sb2.append('.');
            wa.e name = iVar.getName();
            i9.l.d(name, "getName(...)");
            sb2.append(M(name, false));
        } else {
            nb.k0 k0VarT = iVar.t();
            i9.l.d(k0VarT, "getTypeConstructor(...)");
            sb2.append(X(k0VarT));
        }
        sb2.append(W((List) bVar.f13c));
    }

    public final void S(StringBuilder sb2, x9.c cVar) {
        a0 a0VarE0 = cVar.e0();
        if (a0VarE0 != null) {
            w(sb2, a0VarE0, y9.d.RECEIVER);
            w type = a0VarE0.getType();
            i9.l.d(type, "getType(...)");
            sb2.append(E(type));
            sb2.append(".");
        }
    }

    public final void T(StringBuilder sb2, x9.c cVar) {
        a0 a0VarE0;
        k kVar = this.f15196a;
        if (((Boolean) kVar.F.a(kVar, k.Y[30])).booleanValue() && (a0VarE0 = cVar.e0()) != null) {
            sb2.append(" on ");
            w type = a0VarE0.getType();
            i9.l.d(type, "getType(...)");
            sb2.append(V(type));
        }
    }

    public final String V(w wVar) throws IOException {
        i9.l.e(wVar, "type");
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f15196a;
        O(sb2, (w) ((h9.k) kVar.f15240y.a(kVar, k.Y[23])).invoke(wVar));
        return sb2.toString();
    }

    public final String W(List list) throws IOException {
        i9.l.e(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m("<"));
        u8.p.p0(list, sb2, ", ", null, null, new f(this, 0), 60);
        sb2.append(m(">"));
        return sb2.toString();
    }

    public final String X(nb.k0 k0Var) {
        i9.l.e(k0Var, "typeConstructor");
        x9.h hVarL = k0Var.l();
        if ((hVarL instanceof x9.r0) || (hVarL instanceof x9.e) || (hVarL instanceof x9.q0)) {
            i9.l.e(hVarL, "klass");
            return pb.l.f(hVarL) ? hVarL.t().toString() : n().a(hVarL, this);
        }
        if (hVarL == null) {
            return k0Var instanceof nb.v ? ((nb.v) k0Var).c(d.f15185m) : k0Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + hVarL.getClass()).toString());
    }

    public final void Y(x9.r0 r0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(m("<"));
        }
        if (s()) {
            sb2.append("/*");
            sb2.append(r0Var.getIndex());
            sb2.append("*/ ");
        }
        L(sb2, r0Var.B(), "reified");
        String str = r0Var.I().f9055a;
        boolean z11 = true;
        L(sb2, str.length() > 0, str);
        w(sb2, r0Var, null);
        N(r0Var, sb2, z10);
        int size = r0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            w wVar = (w) r0Var.getUpperBounds().iterator().next();
            if (wVar == null) {
                u9.i.a(141);
                throw null;
            }
            if (!u9.i.y(wVar) || !wVar.E0()) {
                sb2.append(" : ");
                sb2.append(V(wVar));
            }
        } else if (z10) {
            for (w wVar2 : r0Var.getUpperBounds()) {
                if (wVar2 == null) {
                    u9.i.a(141);
                    throw null;
                }
                if (!u9.i.y(wVar2) || !wVar2.E0()) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    sb2.append(V(wVar2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(m(">"));
        }
    }

    public final void Z(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y((x9.r0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // ya.i
    public final void a() {
        this.f15196a.a();
    }

    public final void a0(StringBuilder sb2, List list, boolean z10) {
        k kVar = this.f15196a;
        if (((Boolean) kVar.f15238w.a(kVar, k.Y[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb2.append(m("<"));
        Z(sb2, list);
        sb2.append(m(">"));
        if (z10) {
            sb2.append(" ");
        }
    }

    @Override // ya.i
    public final void b() {
        this.f15196a.b();
    }

    public final void b0(x9.u0 u0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(u0Var instanceof y0)) {
            sb2.append(G(u0Var.d0() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    @Override // ya.i
    public final void c() {
        this.f15196a.c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public final void c0(y0 y0Var, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        if (z11) {
            sb2.append(G("value-parameter"));
            sb2.append(" ");
        }
        if (s()) {
            sb2.append("/*");
            sb2.append(y0Var.f471f);
            sb2.append("*/ ");
        }
        w(sb2, y0Var, null);
        L(sb2, y0Var.f473h, "crossinline");
        L(sb2, y0Var.f474i, "noinline");
        k kVar = this.f15196a;
        j jVar = kVar.f15233r;
        u[] uVarArr = k.Y;
        boolean z13 = false;
        if (((Boolean) jVar.a(kVar, uVarArr[16])).booleanValue()) {
            x9.b bVarE0 = y0Var.l();
            aa.m mVar = bVarE0 instanceof aa.m ? (aa.m) bVarE0 : null;
            if (mVar == null || !mVar.D) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12) {
            L(sb2, ((Boolean) kVar.f15234s.a(kVar, uVarArr[17])).booleanValue(), "actual");
        }
        w type = y0Var.getType();
        i9.l.d(type, "getType(...)");
        w wVar = y0Var.f475j;
        w wVar2 = wVar == null ? type : wVar;
        L(sb2, wVar != null, "vararg");
        if (z12 || (z11 && !p())) {
            b0(y0Var, sb2, z12);
        }
        if (z10) {
            N(y0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(V(wVar2));
        F(y0Var, sb2);
        if (s() && wVar != null) {
            sb2.append(" /*");
            sb2.append(V(type));
            sb2.append("*/");
        }
        if (((h9.k) kVar.f15241z.a(kVar, uVarArr[24])) != null) {
            if (kVar.l() ? y0Var.D0() : db.e.a(y0Var)) {
                z13 = true;
            }
        }
        if (z13) {
            StringBuilder sb3 = new StringBuilder(" = ");
            h9.k kVar2 = (h9.k) kVar.f15241z.a(kVar, uVarArr[24]);
            i9.l.b(kVar2);
            sb3.append((String) kVar2.invoke(y0Var));
            sb2.append(sb3.toString());
        }
    }

    @Override // ya.i
    public final void d(Set set) {
        i9.l.e(set, "<set-?>");
        this.f15196a.d(set);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void d0(StringBuilder sb2, List list, boolean z10) {
        boolean z11;
        k kVar = this.f15196a;
        int iOrdinal = ((o) kVar.E.a(kVar, k.Y[29])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z11 = z10 ? false : true;
            } else if (iOrdinal != 2) {
                throw new cc.s();
            }
        }
        int size = list.size();
        r().getClass();
        i9.l.e(sb2, "builder");
        sb2.append("(");
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            int i10 = i7 + 1;
            y0 y0Var = (y0) it.next();
            r().getClass();
            i9.l.e(y0Var, "parameter");
            c0(y0Var, z11, sb2, false);
            r().getClass();
            if (i7 != size - 1) {
                sb2.append(", ");
            }
            i7 = i10;
        }
        r().getClass();
        sb2.append(")");
    }

    @Override // ya.i
    public final void e() {
        this.f15196a.e();
    }

    public final boolean e0(ga.o oVar, StringBuilder sb2) {
        if (!o().contains(h.VISIBILITY)) {
            return false;
        }
        k kVar = this.f15196a;
        j jVar = kVar.f15229n;
        u[] uVarArr = k.Y;
        if (((Boolean) jVar.a(kVar, uVarArr[12])).booleanValue()) {
            oVar = x9.o.f(oVar.f6101a.k());
        }
        if (!((Boolean) kVar.f15230o.a(kVar, uVarArr[13])).booleanValue() && i9.l.a(oVar, x9.o.f14726j)) {
            return false;
        }
        sb2.append(G(oVar.f6101a.d()));
        sb2.append(" ");
        return true;
    }

    @Override // ya.i
    public final void f(c cVar) {
        this.f15196a.f(cVar);
    }

    public final void f0(StringBuilder sb2, List list) throws IOException {
        k kVar = this.f15196a;
        if (((Boolean) kVar.f15238w.a(kVar, k.Y[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x9.r0 r0Var = (x9.r0) it.next();
            List upperBounds = r0Var.getUpperBounds();
            i9.l.d(upperBounds, "getUpperBounds(...)");
            for (w wVar : u8.p.h0(upperBounds)) {
                StringBuilder sb3 = new StringBuilder();
                wa.e name = r0Var.getName();
                i9.l.d(name, "getName(...)");
                sb3.append(M(name, false));
                sb3.append(" : ");
                i9.l.b(wVar);
                sb3.append(V(wVar));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(G("where"));
        sb2.append(" ");
        u8.p.p0(arrayList, sb2, ", ", null, null, null, 124);
    }

    @Override // ya.i
    public final void g() {
        this.f15196a.g();
    }

    @Override // ya.i
    public final void h() {
        this.f15196a.h();
    }

    @Override // ya.i
    public final void i() {
        this.f15196a.i();
    }

    @Override // ya.i
    public final void j() {
        this.f15196a.j();
    }

    @Override // ya.i
    public final void k(o oVar) {
        this.f15196a.k(oVar);
    }

    public final String m(String str) {
        return q().a(str);
    }

    public final c n() {
        k kVar = this.f15196a;
        return (c) kVar.f15218b.a(kVar, k.Y[0]);
    }

    public final Set o() {
        k kVar = this.f15196a;
        return (Set) kVar.f15221e.a(kVar, k.Y[3]);
    }

    public final boolean p() {
        k kVar = this.f15196a;
        return ((Boolean) kVar.f15222f.a(kVar, k.Y[4])).booleanValue();
    }

    public final s q() {
        k kVar = this.f15196a;
        return (s) kVar.D.a(kVar, k.Y[28]);
    }

    public final e r() {
        k kVar = this.f15196a;
        return (e) kVar.C.a(kVar, k.Y[27]);
    }

    public final boolean s() {
        k kVar = this.f15196a;
        return ((Boolean) kVar.f15226j.a(kVar, k.Y[8])).booleanValue();
    }

    public final String u(x9.k kVar) {
        x9.k kVarL;
        String str;
        i9.l.e(kVar, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        kVar.J(new wb.b(this), sb2);
        k kVar2 = this.f15196a;
        j jVar = kVar2.f15219c;
        u[] uVarArr = k.Y;
        if (((Boolean) jVar.a(kVar2, uVarArr[1])).booleanValue() && !(kVar instanceof d0) && !(kVar instanceof h0) && (kVarL = kVar.l()) != null && !(kVarL instanceof x9.y)) {
            sb2.append(" ");
            int iOrdinal = q().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new cc.s();
                }
                str = "<i>defined in</i>";
            }
            sb2.append(str);
            sb2.append(" ");
            wa.d dVarG = za.d.g(kVarL);
            i9.l.d(dVarG, "getFqName(...)");
            sb2.append(dVarG.c() ? "root package" : m(n3.r.P(wa.d.e(dVarG))));
            if (((Boolean) kVar2.f15220d.a(kVar2, uVarArr[2])).booleanValue() && (kVarL instanceof d0) && (kVar instanceof x9.l)) {
                ((x9.l) kVar).getSource().getClass();
            }
        }
        return sb2.toString();
    }

    public final String v(y9.b bVar, y9.d dVar) throws IOException {
        List listJ0;
        aa.m mVarP;
        List listX;
        k kVar = this.f15196a;
        j jVar = kVar.N;
        i9.l.e(bVar, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (dVar != null) {
            sb2.append(dVar.f15123a + ':');
        }
        w type = bVar.getType();
        sb2.append(V(type));
        u[] uVarArr = k.Y;
        if (((a) jVar.a(kVar, uVarArr[38])).f15169a) {
            Map mapB = bVar.b();
            List list = null;
            x9.e eVarD = ((Boolean) kVar.I.a(kVar, uVarArr[33])).booleanValue() ? db.e.d(bVar) : null;
            if (eVarD != null && (mVarP = eVarD.P()) != null && (listX = mVarP.X()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listX) {
                    if (((y0) obj).D0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((y0) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = u8.w.f13122a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapB.containsKey((wa.e) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(u8.q.a0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((wa.e) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(u8.q.a0(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                wa.e eVar = (wa.e) entry.getKey();
                bb.g gVar = (bb.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(eVar.b());
                sb3.append(" = ");
                sb3.append(!list.contains(eVar) ? z(gVar) : "...");
                arrayList5.add(sb3.toString());
            }
            ArrayList arrayListX0 = u8.p.x0(arrayList5, arrayList4);
            if (arrayListX0.size() <= 1) {
                listJ0 = u8.p.J0(arrayListX0);
            } else {
                Object[] array = arrayListX0.toArray(new Comparable[0]);
                Comparable[] comparableArr = (Comparable[]) array;
                i9.l.e(comparableArr, "<this>");
                if (comparableArr.length > 1) {
                    Arrays.sort(comparableArr);
                }
                listJ0 = u8.l.j0(array);
            }
            if (((a) jVar.a(kVar, k.Y[38])).f15170b || !listJ0.isEmpty()) {
                u8.p.p0(listJ0, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (s() && (nb.c.j(type) || (type.D0().l() instanceof c0))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    public final void w(StringBuilder sb2, y9.a aVar, y9.d dVar) {
        if (o().contains(h.ANNOTATIONS)) {
            boolean z10 = aVar instanceof w;
            k kVar = this.f15196a;
            Set setM = z10 ? kVar.m() : (Set) kVar.K.a(kVar, k.Y[35]);
            h9.k kVar2 = (h9.k) kVar.M.a(kVar, k.Y[37]);
            for (y9.b bVar : aVar.getAnnotations()) {
                if (!u8.p.g0(setM, bVar.a()) && !i9.l.a(bVar.a(), u9.n.f13188r) && (kVar2 == null || ((Boolean) kVar2.invoke(bVar)).booleanValue())) {
                    sb2.append(v(bVar, dVar));
                    if (((Boolean) kVar.J.a(kVar, k.Y[34])).booleanValue()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    public final void y(x9.i iVar, StringBuilder sb2) {
        List listQ = iVar.q();
        i9.l.d(listQ, "getDeclaredTypeParameters(...)");
        List listN = iVar.t().n();
        i9.l.d(listN, "getParameters(...)");
        if (s() && iVar.H() && listN.size() > listQ.size()) {
            sb2.append(" /*captured type parameters: ");
            Z(sb2, listN.subList(listQ.size(), listN.size()));
            sb2.append("*/");
        }
    }

    public final String z(bb.g gVar) {
        k kVar = this.f15196a;
        h9.k kVar2 = (h9.k) kVar.f15237v.a(kVar, k.Y[20]);
        if (kVar2 != null) {
            return (String) kVar2.invoke(gVar);
        }
        if (gVar instanceof bb.b) {
            Iterable iterable = (Iterable) ((bb.b) gVar).f1683a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strZ = z((bb.g) it.next());
                if (strZ != null) {
                    arrayList.add(strZ);
                }
            }
            return u8.p.q0(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof bb.a) {
            return zb.j.H0(v((y9.b) ((bb.a) gVar).f1683a, null), "@");
        }
        if (!(gVar instanceof bb.s)) {
            return gVar.toString();
        }
        bb.r rVar = (bb.r) ((bb.s) gVar).f1683a;
        if (rVar instanceof bb.p) {
            return ((bb.p) rVar).f1690a + "::class";
        }
        if (!(rVar instanceof bb.q)) {
            throw new cc.s();
        }
        bb.f fVar = ((bb.q) rVar).f1691a;
        String str = fVar.f1681a.a().f14240a.f14243a;
        for (int i7 = 0; i7 < fVar.f1682b; i7++) {
            str = "kotlin.Array<" + str + '>';
        }
        return ob.a.B(str, "::class");
    }
}
