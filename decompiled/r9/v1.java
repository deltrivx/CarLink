package r9;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa.b f11778a;

    static {
        wa.c cVar = new wa.c("java.lang.Void");
        f11778a = new wa.b(cVar.b(), cVar.f14240a.f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k a(x9.t tVar) {
        String strE = i2.c.E(tVar);
        if (strE == null) {
            if (tVar instanceof aa.q0) {
                String strB = db.e.k(tVar).getName().b();
                i9.l.d(strB, "asString(...)");
                strE = ga.x.a(strB);
            } else if (tVar instanceof aa.r0) {
                String strB2 = db.e.k(tVar).getName().b();
                i9.l.d(strB2, "asString(...)");
                strE = ga.x.b(strB2);
            } else {
                strE = ((aa.q) tVar).getName().b();
                i9.l.d(strE, "asString(...)");
            }
        }
        return new k(new va.e(strE, n3.n.Y(tVar, 1)));
    }

    public static n3.r b(x9.k0 k0Var) {
        i9.l.e(k0Var, "possiblyOverriddenProperty");
        x9.k0 k0VarA = ((x9.k0) za.d.t(k0Var)).a();
        i9.l.d(k0VarA, "getOriginal(...)");
        if (k0VarA instanceof lb.q) {
            lb.q qVar = (lb.q) k0VarA;
            ra.i0 i0Var = qVar.A;
            xa.m mVar = ua.k.f13303d;
            i9.l.d(mVar, "propertySignature");
            ua.e eVar = (ua.e) n3.n.n0(i0Var, mVar);
            if (eVar != null) {
                return new n(k0VarA, i0Var, eVar, qVar.B, qVar.C);
            }
        } else if (k0VarA instanceof ia.f) {
            ia.f fVar = (ia.f) k0VarA;
            x9.n0 source = fVar.getSource();
            ca.g gVar = source instanceof ca.g ? (ca.g) source : null;
            da.s sVar = gVar != null ? gVar.f2583a : null;
            if (sVar instanceof da.u) {
                return new l(((da.u) sVar).f3887a);
            }
            if (!(sVar instanceof da.x)) {
                throw new cc.a0(2, "Incorrect resolution sequence for Java field " + k0VarA + " (source = " + sVar + ')');
            }
            Method method = ((da.x) sVar).f3889a;
            aa.r0 r0Var = fVar.f421x;
            x9.n0 source2 = r0Var != null ? r0Var.getSource() : null;
            ca.g gVar2 = source2 instanceof ca.g ? (ca.g) source2 : null;
            da.s sVar2 = gVar2 != null ? gVar2.f2583a : null;
            da.x xVar = sVar2 instanceof da.x ? (da.x) sVar2 : null;
            return new m(method, xVar != null ? xVar.f3889a : null);
        }
        aa.q0 q0VarB = k0VarA.b();
        i9.l.b(q0VarB);
        k kVarA = a(q0VarB);
        aa.r0 r0VarC = k0VarA.c();
        return new o(kVarA, r0VarC != null ? a(r0VarC) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n3.n c(x9.t tVar) throws IOException {
        Method method;
        i9.l.e(tVar, "possiblySubstitutedFunction");
        x9.t tVarA = ((x9.t) za.d.t(tVar)).a();
        i9.l.d(tVarA, "getOriginal(...)");
        if (!(tVarA instanceof lb.b)) {
            if (tVarA instanceof ia.e) {
                x9.n0 source = ((ia.e) tVarA).getSource();
                ca.g gVar = source instanceof ca.g ? (ca.g) source : null;
                da.s sVar = gVar != null ? gVar.f2583a : null;
                da.x xVar = sVar instanceof da.x ? (da.x) sVar : null;
                if (xVar != null && (method = xVar.f3889a) != null) {
                    return new i(method);
                }
                throw new cc.a0(2, "Incorrect resolution sequence for Java method " + tVarA);
            }
            if (!(tVarA instanceof ia.b)) {
                aa.q qVar = (aa.q) tVarA;
                if ((qVar.getName().equals(u9.o.f13199c) && za.k.n(tVarA)) || ((qVar.getName().equals(u9.o.f13197a) && za.k.n(tVarA)) || (i9.l.a(qVar.getName(), w9.a.f14172e) && tVarA.X().isEmpty()))) {
                    return a(tVarA);
                }
                throw new cc.a0(2, "Unknown origin of " + tVarA + " (" + tVarA.getClass() + ')');
            }
            x9.n0 source2 = ((ia.b) tVarA).getSource();
            ca.g gVar2 = source2 instanceof ca.g ? (ca.g) source2 : null;
            Object obj = gVar2 != null ? gVar2.f2583a : null;
            if (obj instanceof da.r) {
                return new h(((da.r) obj).f3885a);
            }
            if (obj instanceof da.o) {
                Class cls = ((da.o) obj).f3881a;
                if (cls.isAnnotation()) {
                    return new g(cls);
                }
            }
            throw new cc.a0(2, "Incorrect resolution sequence for Java constructor " + tVarA + " (" + obj + ')');
        }
        lb.k kVar = (lb.k) tVarA;
        xa.a aVarA = kVar.A();
        if (aVarA instanceof ra.a0) {
            xa.g gVar3 = va.g.f13718a;
            va.e eVarC = va.g.c((ra.a0) aVarA, kVar.Y(), kVar.R());
            if (eVarC != null) {
                return new k(eVarC);
            }
        }
        if (aVarA instanceof ra.n) {
            xa.g gVar4 = va.g.f13718a;
            va.e eVarA = va.g.a((ra.n) aVarA, kVar.Y(), kVar.R());
            if (eVarA != null) {
                String str = eVarA.f13712d;
                String str2 = eVarA.f13713e;
                x9.k kVarL = tVar.l();
                i9.l.d(kVarL, "getContainingDeclaration(...)");
                if (za.f.b(kVarL)) {
                    return new k(eVarA);
                }
                x9.k kVarL2 = tVar.l();
                i9.l.d(kVarL2, "getContainingDeclaration(...)");
                if (!za.f.d(kVarL2)) {
                    return new j(eVarA);
                }
                x9.j jVar = (x9.j) tVar;
                if (jVar.x()) {
                    if (!i9.l.a(str, "constructor-impl") || !zb.q.i0(str2, ")V")) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                } else {
                    if (!i9.l.a(str, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                    x9.e eVarY = jVar.y();
                    i9.l.d(eVarY, "getConstructedClass(...)");
                    wa.b bVarF = db.e.f(eVarY);
                    i9.l.b(bVarF);
                    String strB = va.b.b(bVarF.b());
                    if (zb.q.i0(str2, ")V")) {
                        String str3 = zb.j.I0(str2, "V") + strB;
                        i9.l.e(str, "name");
                        i9.l.e(str3, "desc");
                        eVarA = new va.e(str, str3);
                    } else if (!zb.q.i0(str2, strB)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                }
                return new k(eVarA);
            }
        }
        return a(tVarA);
    }
}
