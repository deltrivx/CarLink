package ha;

import i9.l;
import i9.r;
import i9.y;
import java.util.Map;
import mb.k;
import o9.u;
import u9.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f6486g = {y.f6689a.g(new r(i.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mb.i f6487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(da.e eVar, da.a aVar) {
        super(aVar, eVar, n.f13193w);
        l.e(eVar, "annotation");
        l.e(aVar, "c");
        mb.n nVar = ((ja.a) aVar.f3847b).f6964a;
        aa.e eVar2 = new aa.e(12, this);
        k kVar = (k) nVar;
        kVar.getClass();
        this.f6487f = new mb.i(kVar, eVar2);
    }

    @Override // ha.b, y9.b
    public final Map b() {
        return (Map) k9.a.z(this.f6487f, f6486g[0]);
    }
}
