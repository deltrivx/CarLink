package pa;

import java.util.Set;
import ra.e0;
import x9.d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f10330b = n3.r.W(qa.a.CLASS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f10331c = u8.l.M0(new qa.a[]{qa.a.FILE_FACADE, qa.a.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ta.e f10332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ta.e f10333e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jb.i f10334a;

    static {
        new ta.e(new int[]{1, 1, 2}, false);
        f10332d = new ta.e(new int[]{1, 1, 11}, false);
        f10333e = new ta.e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final lb.p a(d0 d0Var, ca.c cVar) {
        t8.j jVarH;
        i9.l.e(cVar, "kotlinClass");
        qa.b bVar = cVar.f2577b;
        String[] strArr = bVar.f11001c;
        if (strArr == null) {
            strArr = bVar.f11002d;
        }
        if (strArr != null) {
            if (!f10331c.contains(bVar.f10999a)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            ta.e eVar = bVar.f11000b;
            String[] strArr2 = bVar.f11003e;
            if (strArr2 != null) {
                try {
                    try {
                        jVarH = va.g.h(strArr, strArr2);
                    } catch (xa.q e7) {
                        throw new IllegalStateException("Could not read data from " + cVar.a(), e7);
                    }
                } catch (Throwable th) {
                    c().f7020c.getClass();
                    if (eVar.b(e())) {
                        throw th;
                    }
                    jVarH = null;
                }
                if (jVarH != null) {
                    va.f fVar = (va.f) jVarH.f12830a;
                    e0 e0Var = (e0) jVarH.f12831b;
                    d(cVar);
                    f(cVar);
                    g gVar = new g(cVar, e0Var, fVar, b(cVar));
                    return new lb.p(d0Var, e0Var, fVar, eVar, gVar, c(), "scope for " + gVar + " in " + d0Var, d.f10329a);
                }
            }
        }
        return null;
    }

    public final lb.i b(ca.c cVar) {
        c().f7020c.getClass();
        int i7 = cVar.f2577b.f11005g;
        return ((i7 & 16) == 0 || (i7 & 32) != 0) ? lb.i.f8333a : lb.i.f8334b;
    }

    public final jb.i c() {
        jb.i iVar = this.f10334a;
        if (iVar != null) {
            return iVar;
        }
        i9.l.j("components");
        throw null;
    }

    public final jb.o d(ca.c cVar) {
        c().f7020c.getClass();
        if (cVar.f2577b.f11000b.b(e())) {
            return null;
        }
        ta.e eVar = cVar.f2577b.f11000b;
        ta.e eVar2 = ta.e.f12885g;
        ta.e eVarE = e();
        ta.e eVarE2 = e();
        boolean z10 = eVar.f12887f;
        eVarE2.getClass();
        ta.e eVar3 = z10 ? eVar2 : ta.e.f12886h;
        int i7 = eVar3.f12855b;
        int i10 = eVarE2.f12855b;
        if (i7 > i10 || (i7 >= i10 && eVar3.f12856c > eVarE2.f12856c)) {
            eVarE2 = eVar3;
        }
        return new jb.o(eVar, eVar2, eVarE, eVarE2, cVar.a(), da.d.a(cVar.f2576a));
    }

    public final ta.e e() {
        c().f7020c.getClass();
        return ta.e.f12885g;
    }

    public final boolean f(ca.c cVar) {
        c().f7020c.getClass();
        c().f7020c.getClass();
        qa.b bVar = cVar.f2577b;
        return (bVar.f11005g & 2) != 0 && bVar.f11000b.equals(f10332d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    public final jb.d g(ca.c cVar) {
        t8.j jVarF;
        qa.b bVar = cVar.f2577b;
        String[] strArr = bVar.f11001c;
        if (strArr == null) {
            strArr = bVar.f11002d;
        }
        if (strArr != null) {
            if (!f10330b.contains(bVar.f10999a)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            ta.e eVar = bVar.f11000b;
            String[] strArr2 = bVar.f11003e;
            if (strArr2 != null) {
                try {
                    try {
                        jVarF = va.g.f(strArr, strArr2);
                    } catch (xa.q e7) {
                        throw new IllegalStateException("Could not read data from " + cVar.a(), e7);
                    }
                } catch (Throwable th) {
                    c().f7020c.getClass();
                    if (eVar.b(e())) {
                        throw th;
                    }
                    jVarF = null;
                }
                if (jVarF != null) {
                    va.f fVar = (va.f) jVarF.f12830a;
                    ra.k kVar = (ra.k) jVarF.f12831b;
                    d(cVar);
                    f(cVar);
                    return new jb.d(fVar, kVar, eVar, new o(cVar, b(cVar)));
                }
            }
        }
        return null;
    }
}
