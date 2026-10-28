package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements o9.v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f11735d = {i9.y.f6689a.g(new i9.r(o1.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.r0 f11736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f11737b = n4.h.R(null, new aa.e(27, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f11738c;

    public o1(p1 p1Var, x9.r0 r0Var) {
        Class cls;
        a0 a0VarB;
        Object objJ;
        this.f11736a = r0Var;
        if (p1Var == null) {
            x9.k kVarL = r0Var.l();
            i9.l.d(kVarL, "getContainingDeclaration(...)");
            if (kVarL instanceof x9.e) {
                objJ = b((x9.e) kVarL);
            } else {
                if (!(kVarL instanceof x9.c)) {
                    throw new cc.a0(2, "Unknown type parameter container: " + kVarL);
                }
                x9.k kVarL2 = ((x9.c) kVarL).l();
                i9.l.d(kVarL2, "getContainingDeclaration(...)");
                if (kVarL2 instanceof x9.e) {
                    a0VarB = b((x9.e) kVarL2);
                } else {
                    lb.k kVar = kVarL instanceof lb.k ? (lb.k) kVarL : null;
                    if (kVar == null) {
                        throw new cc.a0(2, "Non-class callable descriptor must be deserialized: " + kVarL);
                    }
                    lb.j jVarZ = kVar.Z();
                    pa.g gVar = jVarZ instanceof pa.g ? (pa.g) jVarZ : null;
                    ca.c cVar = gVar != null ? gVar.f10340c : null;
                    ca.c cVar2 = cVar instanceof ca.c ? cVar : null;
                    if (cVar2 == null || (cls = cVar2.f2576a) == null) {
                        throw new cc.a0(2, "Container of deserialized member is not resolved: " + kVar);
                    }
                    a0VarB = (a0) g5.a.O(cls);
                }
                objJ = kVarL.J(new l0.o0(17, a0VarB), t8.z.f12851a);
            }
            p1Var = (p1) objJ;
        }
        this.f11738c = p1Var;
    }

    public static a0 b(x9.e eVar) {
        Class clsK = x1.k(eVar);
        a0 a0Var = (a0) (clsK != null ? g5.a.O(clsK) : null);
        if (a0Var != null) {
            return a0Var;
        }
        throw new cc.a0(2, "Type parameter container is not resolved: " + eVar.l());
    }

    public final String a() {
        String strB = this.f11736a.getName().b();
        i9.l.d(strB, "asString(...)");
        return strB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return i9.l.a(this.f11738c, o1Var.f11738c) && a().equals(o1Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f11738c.hashCode() * 31);
    }

    public final String toString() {
        o9.y yVar;
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = this.f11736a.I().ordinal();
        if (iOrdinal == 0) {
            yVar = o9.y.f9570a;
        } else if (iOrdinal == 1) {
            yVar = o9.y.f9571b;
        } else {
            if (iOrdinal != 2) {
                throw new cc.s();
            }
            yVar = o9.y.f9572c;
        }
        int iOrdinal2 = yVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                sb2.append("in ");
            } else {
                if (iOrdinal2 != 2) {
                    throw new cc.s();
                }
                sb2.append("out ");
            }
        }
        sb2.append(a());
        return sb2.toString();
    }
}
