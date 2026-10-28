package za;

import aa.q0;
import nb.a0;
import nb.w;
import x9.k0;
import x9.s0;
import x9.u;
import x9.u0;
import x9.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    static {
        wa.c cVar = new wa.c("kotlin.jvm.JvmInline");
        cVar.b();
        wa.e eVarF = cVar.f14240a.f();
        wa.c cVar2 = wa.c.f14239c;
        n4.h.h0(eVarF).f14240a.c();
    }

    public static final boolean a(x9.c cVar) {
        s0 s0VarO0;
        i9.l.e(cVar, "<this>");
        if (!(cVar instanceof q0)) {
            return false;
        }
        k0 k0VarC0 = ((q0) cVar).C0();
        i9.l.d(k0VarC0, "getCorrespondingProperty(...)");
        if (k0VarC0.e0() != null) {
            return false;
        }
        x9.k kVarL = k0VarC0.l();
        x9.e eVar = kVarL instanceof x9.e ? (x9.e) kVarL : null;
        if (eVar == null || (s0VarO0 = eVar.o0()) == null) {
            return false;
        }
        wa.e name = k0VarC0.getName();
        i9.l.d(name, "getName(...)");
        return s0VarO0.a(name);
    }

    public static final boolean b(x9.k kVar) {
        i9.l.e(kVar, "<this>");
        return (kVar instanceof x9.e) && (((x9.e) kVar).o0() instanceof u);
    }

    public static final boolean c(w wVar) {
        i9.l.e(wVar, "<this>");
        x9.h hVarL = wVar.D0().l();
        if (hVarL != null) {
            return b(hVarL);
        }
        return false;
    }

    public static final boolean d(x9.k kVar) {
        i9.l.e(kVar, "<this>");
        return (kVar instanceof x9.e) && (((x9.e) kVar).o0() instanceof z);
    }

    public static final boolean e(u0 u0Var) {
        if (u0Var.e0() != null) {
            return false;
        }
        x9.k kVarL = u0Var.l();
        wa.e eVar = null;
        x9.e eVar2 = kVarL instanceof x9.e ? (x9.e) kVarL : null;
        if (eVar2 != null) {
            int i7 = db.e.f3900a;
            s0 s0VarO0 = eVar2.o0();
            u uVar = s0VarO0 instanceof u ? (u) s0VarO0 : null;
            if (uVar != null) {
                eVar = uVar.f14741a;
            }
        }
        return i9.l.a(eVar, u0Var.getName());
    }

    public static final boolean f(x9.k kVar) {
        i9.l.e(kVar, "<this>");
        return b(kVar) || d(kVar);
    }

    public static final boolean g(w wVar) {
        x9.h hVarL = wVar.D0().l();
        if (hVarL != null) {
            return f(hVarL);
        }
        return false;
    }

    public static final boolean h(w wVar) {
        i9.l.e(wVar, "<this>");
        x9.h hVarL = wVar.D0().l();
        return (hVarL == null || !d(hVarL) || nb.u0.e(wVar)) ? false : true;
    }

    public static final a0 i(w wVar) {
        i9.l.e(wVar, "<this>");
        x9.h hVarL = wVar.D0().l();
        x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
        if (eVar != null) {
            int i7 = db.e.f3900a;
            s0 s0VarO0 = eVar.o0();
            u uVar = s0VarO0 instanceof u ? (u) s0VarO0 : null;
            if (uVar != null) {
                return (a0) uVar.f14742b;
            }
        }
        return null;
    }
}
