package za;

import aa.j0;
import h9.n;
import java.util.Collection;
import nb.k0;
import u8.p;
import x9.d0;
import x9.n0;
import x9.r0;
import x9.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ob.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15790a = new b();

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        if (i7 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static n0 e(x9.b bVar) {
        while (bVar instanceof x9.c) {
            x9.c cVar = (x9.c) bVar;
            if (cVar.f() != 2) {
                break;
            }
            Collection collectionM = cVar.m();
            i9.l.d(collectionM, "getOverriddenDescriptors(...)");
            bVar = (x9.c) p.B0(collectionM);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.getSource();
    }

    @Override // ob.d
    public boolean b(k0 k0Var, k0 k0Var2) {
        if (k0Var == null) {
            a(0);
            throw null;
        }
        if (k0Var2 != null) {
            return k0Var.equals(k0Var2);
        }
        a(1);
        throw null;
    }

    public boolean c(x9.k kVar, x9.k kVar2, boolean z10) {
        if ((kVar instanceof x9.e) && (kVar2 instanceof x9.e)) {
            return i9.l.a(((x9.e) kVar).t(), ((x9.e) kVar2).t());
        }
        if ((kVar instanceof r0) && (kVar2 instanceof r0)) {
            return d((r0) kVar, (r0) kVar2, z10, a.f15789a);
        }
        if (!(kVar instanceof x9.b) || !(kVar2 instanceof x9.b)) {
            return ((kVar instanceof d0) && (kVar2 instanceof d0)) ? i9.l.a(((j0) ((d0) kVar)).f364e, ((j0) ((d0) kVar2)).f364e) : i9.l.a(kVar, kVar2);
        }
        x9.b bVar = (x9.b) kVar;
        x9.b bVar2 = (x9.b) kVar2;
        if (!bVar.equals(bVar2)) {
            if (i9.l.a(bVar.getName(), bVar2.getName()) && ((!(bVar instanceof w) || !(bVar2 instanceof w) || ((w) bVar).G() == ((w) bVar2).G()) && ((!i9.l.a(bVar.l(), bVar2.l()) || (z10 && i9.l.a(e(bVar), e(bVar2)))) && !d.o(bVar) && !d.o(bVar2)))) {
                x9.k kVarL = bVar.l();
                x9.k kVarL2 = bVar2.l();
                if (((kVarL instanceof x9.c) || (kVarL2 instanceof x9.c)) ? false : c(kVarL, kVarL2, z10)) {
                    j jVar = new j(new k2.i(bVar, bVar2, z10));
                    if (jVar.m(bVar, bVar2, null, true).b() != 1 || jVar.m(bVar2, bVar, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean d(r0 r0Var, r0 r0Var2, boolean z10, n nVar) {
        i9.l.e(r0Var, "a");
        i9.l.e(r0Var2, "b");
        if (r0Var.equals(r0Var2)) {
            return true;
        }
        if (i9.l.a(r0Var.l(), r0Var2.l())) {
            return false;
        }
        x9.k kVarL = r0Var.l();
        x9.k kVarL2 = r0Var2.l();
        return (((kVarL instanceof x9.c) || (kVarL2 instanceof x9.c)) ? ((Boolean) nVar.invoke(kVarL, kVarL2)).booleanValue() : c(kVarL, kVarL2, z10)) && r0Var.getIndex() == r0Var2.getIndex();
    }
}
