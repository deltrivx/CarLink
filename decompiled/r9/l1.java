package r9;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 extends r implements o9.u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f11708i = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f11709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r1 f11714h;

    public l1(e0 e0Var, String str, String str2, x9.k0 k0Var, Object obj) {
        this.f11709c = e0Var;
        this.f11710d = str;
        this.f11711e = str2;
        this.f11712f = obj;
        this.f11713g = t8.a.c(t8.i.f12827a, new f1(this, 0));
        this.f11714h = n4.h.R(k0Var, new f1(this, 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l1(e0 e0Var, x9.k0 k0Var) {
        i9.l.e(k0Var, "descriptor");
        String strB = k0Var.getName().b();
        i9.l.d(strB, "asString(...)");
        this(e0Var, strB, v1.b(k0Var).d(), k0Var, i9.c.f6670a);
    }

    public final boolean equals(Object obj) {
        l1 l1VarC = x1.c(obj);
        return l1VarC != null && i9.l.a(this.f11709c, l1VarC.f11709c) && i9.l.a(this.f11710d, l1VarC.f11710d) && i9.l.a(this.f11711e, l1VarC.f11711e) && i9.l.a(this.f11712f, l1VarC.f11712f);
    }

    @Override // r9.r
    public final s9.g g() {
        return q().g();
    }

    @Override // o9.b
    public final String getName() {
        return this.f11710d;
    }

    @Override // r9.r
    public final e0 h() {
        return this.f11709c;
    }

    public final int hashCode() {
        return this.f11711e.hashCode() + ob.a.l(this.f11710d, this.f11709c.hashCode() * 31, 31);
    }

    @Override // r9.r
    public final s9.g i() {
        q().getClass();
        return null;
    }

    @Override // r9.r
    public final boolean m() {
        return this.f11712f != i9.c.f6670a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, t8.h] */
    public final Member n() {
        if (!j().M()) {
            return null;
        }
        wa.b bVar = v1.f11778a;
        n3.r rVarB = v1.b(j());
        if (rVarB instanceof n) {
            n nVar = (n) rVarB;
            ta.f fVar = nVar.f11722j;
            ua.e eVar = nVar.f11721i;
            if ((eVar.f13256b & 16) == 16) {
                ua.c cVar = eVar.f13261g;
                int i7 = cVar.f13243b;
                if ((i7 & 1) != 1 || (i7 & 2) != 2) {
                    return null;
                }
                return this.f11709c.d(fVar.getString(cVar.f13244c), fVar.getString(cVar.f13245d));
            }
        }
        return (Field) this.f11713g.getValue();
    }

    @Override // o9.b
    public final boolean o() {
        return false;
    }

    @Override // r9.r
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final x9.k0 j() {
        Object objInvoke = this.f11714h.invoke();
        i9.l.d(objInvoke, "invoke(...)");
        return (x9.k0) objInvoke;
    }

    public abstract i1 q();

    public final String toString() {
        ya.g gVar = u1.f11769a;
        return u1.c(j());
    }
}
