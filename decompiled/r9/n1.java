package r9;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements i9.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f11726e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb.w f11727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f11728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f11729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f11730d;

    static {
        i9.r rVar = new i9.r(n1.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        i9.z zVar = i9.y.f6689a;
        f11726e = new o9.u[]{zVar.g(rVar), ob.a.v(n1.class, "arguments", "getArguments()Ljava/util/List;", 0, zVar)};
    }

    public n1(nb.w wVar, h9.a aVar) {
        i9.l.e(wVar, "type");
        this.f11727a = wVar;
        r1 r1Var = aVar instanceof r1 ? (r1) aVar : null;
        this.f11728b = r1Var == null ? aVar != null ? n4.h.R(null, aVar) : null : r1Var;
        this.f11729c = n4.h.R(null, new m1(this, 0));
        this.f11730d = n4.h.R(null, new aa.j(15, this, aVar));
    }

    public final o9.d a(nb.w wVar) {
        nb.w wVarB;
        x9.h hVarL = wVar.D0().l();
        if (hVarL instanceof x9.e) {
            Class clsK = x1.k((x9.e) hVarL);
            if (clsK != null) {
                if (!clsK.isArray()) {
                    if (nb.u0.e(wVar)) {
                        return new a0(clsK);
                    }
                    Class cls = (Class) da.d.f3861b.get(clsK);
                    if (cls != null) {
                        clsK = cls;
                    }
                    return new a0(clsK);
                }
                nb.n0 n0Var = (nb.n0) u8.p.C0(wVar.B0());
                if (n0Var == null || (wVarB = n0Var.b()) == null) {
                    return new a0(clsK);
                }
                o9.d dVarA = a(wVarB);
                if (dVarA != null) {
                    return new a0(Array.newInstance((Class<?>) g5.a.L(n3.l.z(dVarA)), 0).getClass());
                }
                throw new cc.a0(2, "Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (hVarL instanceof x9.r0) {
                return new o1(null, (x9.r0) hVarL);
            }
            if (hVarL instanceof x9.q0) {
                throw new cc.a0("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final List b() {
        o9.u uVar = f11726e[1];
        Object objInvoke = this.f11730d.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final o9.d c() {
        o9.u uVar = f11726e[0];
        return (o9.d) this.f11729c.invoke();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return i9.l.a(this.f11727a, n1Var.f11727a) && i9.l.a(c(), n1Var.c()) && b().equals(n1Var.b());
    }

    public final int hashCode() {
        int iHashCode = this.f11727a.hashCode() * 31;
        o9.d dVarC = c();
        return b().hashCode() + ((iHashCode + (dVarC != null ? dVarC.hashCode() : 0)) * 31);
    }

    public final String toString() {
        ya.g gVar = u1.f11769a;
        return u1.d(this.f11727a);
    }
}
