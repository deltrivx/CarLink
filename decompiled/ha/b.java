package ha;

import i9.l;
import i9.r;
import i9.y;
import java.util.Map;
import mb.k;
import mb.n;
import nb.a0;
import nb.w;
import o9.u;
import u8.p;
import u8.x;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b implements ia.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f6468e = {y.f6689a.g(new r(b.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.c f6469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f6470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.i f6471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final na.a f6472d;

    public b(da.a aVar, da.e eVar, wa.c cVar) {
        l.e(aVar, "c");
        ja.a aVar2 = (ja.a) aVar.f3847b;
        l.e(cVar, "fqName");
        this.f6469a = cVar;
        this.f6470b = eVar != null ? aVar2.f6973j.c(eVar) : n0.f14716e0;
        n nVar = aVar2.f6964a;
        aa.j jVar = new aa.j(4, aVar, this);
        k kVar = (k) nVar;
        kVar.getClass();
        this.f6471c = new mb.i(kVar, jVar);
        this.f6472d = eVar != null ? (na.a) p.l0(eVar.b()) : null;
    }

    @Override // y9.b
    public final wa.c a() {
        return this.f6469a;
    }

    @Override // y9.b
    public Map b() {
        return x.f13123a;
    }

    @Override // y9.b
    public final n0 getSource() {
        return this.f6470b;
    }

    @Override // y9.b
    public final w getType() {
        return (a0) k9.a.z(this.f6471c, f6468e[0]);
    }
}
