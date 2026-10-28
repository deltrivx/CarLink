package bb;

import nb.a0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.b f1684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa.e f1685c;

    public i(wa.b bVar, wa.e eVar) {
        super(new t8.j(bVar, eVar));
        this.f1684b = bVar;
        this.f1685c = eVar;
    }

    @Override // bb.g
    public final nb.w a(x9.y yVar) {
        a0 a0VarN;
        i9.l.e(yVar, "module");
        wa.b bVar = this.f1684b;
        x9.e eVarD = x9.v.d(yVar, bVar);
        if (eVarD != null) {
            int i7 = za.d.f15791a;
            if (!za.d.n(eVarD, x9.f.f14703c)) {
                eVarD = null;
            }
            if (eVarD != null && (a0VarN = eVarD.n()) != null) {
                return a0VarN;
            }
        }
        return pb.l.c(pb.k.ERROR_ENUM_TYPE, bVar.toString(), this.f1685c.f14247a);
    }

    @Override // bb.g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1684b.f());
        sb2.append('.');
        sb2.append(this.f1685c);
        return sb2.toString();
    }
}
