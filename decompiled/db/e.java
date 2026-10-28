package db;

import aa.j0;
import aa.n0;
import aa.y0;
import h9.k;
import i9.x;
import java.util.Collection;
import u8.p;
import u9.i;
import wb.l;
import x9.d0;
import x9.h;
import x9.k0;
import x9.y;
import yb.j;
import yb.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3900a = 0;

    static {
        wa.e.e("value");
    }

    public static final boolean a(y0 y0Var) {
        Boolean boolH = l.h(n3.l.I(y0Var), a.f3892b, c.f3896i);
        i9.l.d(boolH, "ifAny(...)");
        return boolH.booleanValue();
    }

    public static x9.c b(x9.c cVar, k kVar) {
        i9.l.e(cVar, "<this>");
        return (x9.c) l.f(n3.l.I(cVar), new a(1), new d(new x(), kVar));
    }

    public static final wa.c c(x9.l lVar) {
        i9.l.e(lVar, "<this>");
        wa.d dVarH = h(lVar);
        if (!dVarH.d()) {
            dVarH = null;
        }
        if (dVarH != null) {
            return dVarH.g();
        }
        return null;
    }

    public static final x9.e d(y9.b bVar) {
        i9.l.e(bVar, "<this>");
        h hVarL = bVar.getType().D0().l();
        if (hVarL instanceof x9.e) {
            return (x9.e) hVarL;
        }
        return null;
    }

    public static final i e(x9.k kVar) {
        i9.l.e(kVar, "<this>");
        return j(kVar).k();
    }

    public static final wa.b f(h hVar) {
        x9.k kVarL;
        wa.b bVarF;
        if (hVar == null || (kVarL = hVar.l()) == null) {
            return null;
        }
        if (kVarL instanceof d0) {
            wa.c cVar = ((j0) ((d0) kVarL)).f364e;
            wa.e name = hVar.getName();
            i9.l.d(name, "getName(...)");
            return new wa.b(cVar, name);
        }
        if (!(kVarL instanceof x9.i) || (bVarF = f((h) kVarL)) == null) {
            return null;
        }
        wa.e name2 = hVar.getName();
        i9.l.d(name2, "getName(...)");
        return bVarF.d(name2);
    }

    public static final wa.c g(x9.k kVar) {
        i9.l.e(kVar, "<this>");
        wa.c cVarH = za.d.h(kVar);
        return cVarH != null ? cVarH : za.d.g(kVar.l()).a(kVar.getName()).g();
    }

    public static final wa.d h(x9.k kVar) {
        i9.l.e(kVar, "<this>");
        wa.d dVarG = za.d.g(kVar);
        i9.l.d(dVarG, "getFqName(...)");
        return dVarG;
    }

    public static final void i(y yVar) {
        i9.l.e(yVar, "<this>");
        if (yVar.V(ob.h.f9641a) != null) {
            throw new ClassCastException();
        }
    }

    public static final y j(x9.k kVar) {
        i9.l.e(kVar, "<this>");
        y yVarD = za.d.d(kVar);
        i9.l.d(yVarD, "getContainingModule(...)");
        return yVarD;
    }

    public static final x9.c k(x9.c cVar) {
        i9.l.e(cVar, "<this>");
        if (!(cVar instanceof x9.j0)) {
            return cVar;
        }
        k0 k0VarC0 = ((n0) ((x9.j0) cVar)).C0();
        i9.l.d(k0VarC0, "getCorrespondingProperty(...)");
        return k0VarC0;
    }

    public static final yb.i l(x9.c cVar) {
        i9.l.e(cVar, "<this>");
        j jVarK0 = u8.l.k0(new x9.c[]{cVar});
        Collection collectionM = cVar.m();
        i9.l.d(collectionM, "getOverriddenDescriptors(...)");
        return yb.l.P(u8.l.k0(new j[]{jVarK0, new yb.i(p.f0(collectionM), new b(1), o.f15282i)}));
    }
}
