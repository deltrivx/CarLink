package r9;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ya.g f11769a = ya.g.f15193c;

    public static void a(StringBuilder sb2, x9.c cVar) {
        aa.a0 a0VarG = x1.g(cVar);
        aa.a0 a0VarE0 = cVar.e0();
        if (a0VarG != null) {
            sb2.append(d(a0VarG.getType()));
            sb2.append(".");
        }
        boolean z10 = (a0VarG == null || a0VarE0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        if (a0VarE0 != null) {
            sb2.append(d(a0VarE0.getType()));
            sb2.append(".");
        }
        if (z10) {
            sb2.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(x9.t tVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        a(sb2, tVar);
        wa.e name = ((aa.q) tVar).getName();
        i9.l.d(name, "getName(...)");
        sb2.append(f11769a.M(name, true));
        List listX = tVar.X();
        i9.l.d(listX, "getValueParameters(...)");
        u8.p.p0(listX, sb2, ", ", "(", ")", b.f11657h, 48);
        sb2.append(": ");
        nb.w wVarP = tVar.p();
        i9.l.b(wVarP);
        sb2.append(d(wVarP));
        return sb2.toString();
    }

    public static String c(x9.k0 k0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k0Var.d0() ? "var " : "val ");
        a(sb2, k0Var);
        wa.e name = k0Var.getName();
        i9.l.d(name, "getName(...)");
        sb2.append(f11769a.M(name, true));
        sb2.append(": ");
        nb.w type = k0Var.getType();
        i9.l.d(type, "getType(...)");
        sb2.append(d(type));
        return sb2.toString();
    }

    public static String d(nb.w wVar) {
        i9.l.e(wVar, "type");
        return f11769a.V(wVar);
    }
}
