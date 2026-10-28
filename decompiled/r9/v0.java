package r9;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements o9.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f11773e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o9.m f11776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f11777d;

    static {
        i9.r rVar = new i9.r(v0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        i9.z zVar = i9.y.f6689a;
        f11773e = new o9.u[]{zVar.g(rVar), ob.a.v(v0.class, "annotations", "getAnnotations()Ljava/util/List;", 0, zVar)};
    }

    public v0(r rVar, int i7, o9.m mVar, h9.a aVar) {
        this.f11774a = rVar;
        this.f11775b = i7;
        this.f11776c = mVar;
        this.f11777d = n4.h.R(null, aVar);
        n4.h.R(null, new t0(this, 0));
    }

    public final x9.i0 a() {
        o9.u uVar = f11773e[0];
        Object objInvoke = this.f11777d.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return (x9.i0) objInvoke;
    }

    public final String b() {
        x9.i0 i0VarA = a();
        aa.y0 y0Var = i0VarA instanceof aa.y0 ? (aa.y0) i0VarA : null;
        if (y0Var != null && !y0Var.l().C()) {
            wa.e name = y0Var.getName();
            i9.l.d(name, "getName(...)");
            if (!name.f14248b) {
                return name.b();
            }
        }
        return null;
    }

    public final n1 c() {
        nb.w type = a().getType();
        i9.l.d(type, "getType(...)");
        return new n1(type, new t0(this, 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return i9.l.a(this.f11774a, v0Var.f11774a) && this.f11775b == v0Var.f11775b;
    }

    public final int hashCode() {
        return (this.f11774a.hashCode() * 31) + this.f11775b;
    }

    public final String toString() throws IOException {
        String strB;
        ya.g gVar = u1.f11769a;
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = this.f11776c.ordinal();
        if (iOrdinal == 0) {
            sb2.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb2.append("extension receiver parameter");
        } else {
            if (iOrdinal != 2) {
                throw new cc.s();
            }
            sb2.append("parameter #" + this.f11775b + ' ' + b());
        }
        sb2.append(" of ");
        x9.c cVarJ = this.f11774a.j();
        if (cVarJ instanceof x9.k0) {
            strB = u1.c((x9.k0) cVarJ);
        } else {
            if (!(cVarJ instanceof x9.t)) {
                throw new IllegalStateException(("Illegal callable: " + cVarJ).toString());
            }
            strB = u1.b((x9.t) cVarJ);
        }
        sb2.append(strB);
        return sb2.toString();
    }
}
