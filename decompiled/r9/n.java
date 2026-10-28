package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends n3.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x9.k0 f11719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ra.i0 f11720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ua.e f11721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ta.f f11722j;
    public final aa.f0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11723l;

    /* JADX WARN: Code duplicated, block: B:25:0x00e7  */
    public n(x9.k0 k0Var, ra.i0 i0Var, ua.e eVar, ta.f fVar, aa.f0 f0Var) {
        String string;
        String string2;
        i9.l.e(i0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(f0Var, "typeTable");
        this.f11719g = k0Var;
        this.f11720h = i0Var;
        this.f11721i = eVar;
        this.f11722j = fVar;
        this.k = f0Var;
        if ((eVar.f13256b & 4) == 4) {
            string2 = fVar.getString(eVar.f13259e.f13244c).concat(fVar.getString(eVar.f13259e.f13245d));
        } else {
            va.d dVarB = va.g.b(i0Var, fVar, f0Var, true);
            if (dVarB == null) {
                throw new cc.a0(2, "No field signature for property: " + k0Var);
            }
            String str = dVarB.f13710d;
            String str2 = dVarB.f13711e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ga.x.a(str));
            x9.k kVarL = k0Var.l();
            i9.l.d(kVarL, "getContainingDeclaration(...)");
            if (i9.l.a(k0Var.d(), x9.o.f14720d) && (kVarL instanceof lb.h)) {
                ra.k kVar = ((lb.h) kVarL).f8315e;
                xa.m mVar = ua.k.f13308i;
                i9.l.d(mVar, "classModuleName");
                Integer num = (Integer) n3.n.n0(kVar, mVar);
                String string3 = num != null ? fVar.getString(num.intValue()) : "main";
                zb.i iVar = wa.f.f14249a;
                iVar.getClass();
                String strReplaceAll = iVar.f15828a.matcher(string3).replaceAll("_");
                i9.l.d(strReplaceAll, "replaceAll(...)");
                string = "$".concat(strReplaceAll);
            } else if (i9.l.a(k0Var.d(), x9.o.f14717a) && (kVarL instanceof x9.d0)) {
                lb.j jVar = ((lb.q) k0Var).E;
                if (jVar instanceof pa.g) {
                    pa.g gVar = (pa.g) jVar;
                    if (gVar.f10339b != null) {
                        StringBuilder sb3 = new StringBuilder("$");
                        String strD = gVar.f10338a.d();
                        i9.l.d(strD, "getInternalName(...)");
                        sb3.append(wa.e.e(zb.j.N0(strD, '/', strD)).b());
                        string = sb3.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            sb2.append(string);
            sb2.append("()");
            sb2.append(str2);
            string2 = sb2.toString();
        }
        this.f11723l = string2;
    }

    @Override // n3.r
    public final String d() {
        return this.f11723l;
    }
}
