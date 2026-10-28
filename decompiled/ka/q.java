package ka;

import aa.j0;
import l0.o0;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f7468m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final da.y f7469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final da.a f7470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mb.i f7471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f7472j;
    public final mb.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y9.h f7473l;

    static {
        i9.r rVar = new i9.r(q.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        i9.z zVar = i9.y.f6689a;
        f7468m = new o9.u[]{zVar.g(rVar), ob.a.v(q.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, zVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(da.a aVar, da.y yVar) {
        i9.l.e(aVar, "outerContext");
        ja.a aVar2 = (ja.a) aVar.f3847b;
        super(aVar2.f6977o, yVar.f3890a);
        this.f7469g = yVar;
        da.a aVarQ = a.a.q(aVar, this, null, 6);
        this.f7470h = aVarQ;
        aVar2.f6967d.c().f7020c.getClass();
        ta.e eVar = ta.e.f12885g;
        ja.a aVar3 = (ja.a) aVarQ.f3847b;
        mb.n nVar = aVar3.f6964a;
        p pVar = new p(this, 0);
        mb.k kVar = (mb.k) nVar;
        kVar.getClass();
        this.f7471i = new mb.i(kVar, pVar);
        this.f7472j = new d(aVarQ, yVar, this);
        p pVar2 = new p(this, 1);
        mb.k kVar2 = (mb.k) nVar;
        kVar2.getClass();
        this.k = new mb.c(kVar2, pVar2);
        this.f7473l = aVar3.f6984v.f6118b ? y9.g.f15129a : g5.a.b0(aVarQ, yVar);
        ((mb.k) nVar).a(new p(this, 2));
    }

    @Override // x9.d0
    public final gb.o U() {
        return this.f7472j;
    }

    @Override // h0.a0, y9.a
    public final y9.h getAnnotations() {
        return this.f7473l;
    }

    @Override // aa.j0, aa.r, x9.l
    public final n0 getSource() {
        return new o0(13, this);
    }

    @Override // aa.j0, aa.q
    public final String toString() {
        return "Lazy Java package fragment: " + this.f364e + " of module " + ((ja.a) this.f7470h.f3847b).f6977o;
    }
}
