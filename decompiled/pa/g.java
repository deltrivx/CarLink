package pa;

import ra.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements lb.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb.b f10338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb.b f10339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca.c f10340c;

    public g(ca.c cVar, e0 e0Var, va.f fVar, lb.i iVar) {
        i9.l.e(cVar, "kotlinClass");
        i9.l.e(e0Var, "packageProto");
        i9.l.e(fVar, "nameResolver");
        eb.b bVar = new eb.b(eb.b.e(da.d.a(cVar.f2576a)));
        qa.b bVar2 = cVar.f2577b;
        eb.b bVarC = null;
        String str = bVar2.f10999a != qa.a.MULTIFILE_CLASS_PART ? null : bVar2.f11004f;
        if (str != null && str.length() > 0) {
            bVarC = eb.b.c(str);
        }
        this.f10338a = bVar;
        this.f10339b = bVarC;
        this.f10340c = cVar;
        xa.m mVar = ua.k.f13311m;
        i9.l.d(mVar, "packageModuleName");
        Integer num = (Integer) n3.n.n0(e0Var, mVar);
        if (num != null) {
            fVar.getString(num.intValue());
        }
    }

    @Override // lb.j
    public final String E() {
        return a2.f.I(new StringBuilder("Class '"), a().a().f14240a.f14243a, '\'');
    }

    public final wa.b a() {
        wa.c cVar;
        eb.b bVar = this.f10338a;
        String str = bVar.f4664a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = wa.c.f14239c;
            if (cVar == null) {
                eb.b.a(9);
                throw null;
            }
        } else {
            cVar = new wa.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strD = bVar.d();
        i9.l.d(strD, "getInternalName(...)");
        return new wa.b(cVar, wa.e.e(zb.j.N0(strD, '/', strD)));
    }

    public final String toString() {
        return g.class.getSimpleName() + ": " + this.f10338a;
    }
}
