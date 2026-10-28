package w9;

import aa.h0;
import i9.r;
import i9.y;
import java.util.Collection;
import o9.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements z9.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wa.e f14196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wa.b f14197h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f14198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f14199b = f.f14191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.i f14200c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f14194e = {y.f6689a.g(new r(g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f14193d = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wa.c f14195f = u9.o.k;

    static {
        wa.d dVar = u9.n.f13169c;
        f14196g = dVar.f();
        wa.c cVarG = dVar.g();
        f14197h = new wa.b(cVarG.b(), cVarG.f14240a.f());
    }

    public g(mb.k kVar, h0 h0Var) {
        this.f14198a = h0Var;
        this.f14200c = new mb.i(kVar, new aa.j(17, this, kVar));
    }

    @Override // z9.c
    public final Collection a(wa.c cVar) {
        i9.l.e(cVar, "packageFqName");
        if (!cVar.equals(f14195f)) {
            return u8.y.f13124a;
        }
        return n3.r.W((aa.o) k9.a.z(this.f14200c, f14194e[0]));
    }

    @Override // z9.c
    public final boolean b(wa.c cVar, wa.e eVar) {
        i9.l.e(cVar, "packageFqName");
        i9.l.e(eVar, "name");
        return eVar.equals(f14196g) && cVar.equals(f14195f);
    }

    @Override // z9.c
    public final x9.e c(wa.b bVar) {
        i9.l.e(bVar, "classId");
        if (!bVar.equals(f14197h)) {
            return null;
        }
        return (aa.o) k9.a.z(this.f14200c, f14194e[0]);
    }
}
