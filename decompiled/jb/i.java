package jb;

import aa.f0;
import java.util.List;
import java.util.Set;
import x9.g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.k f7018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9.y f7019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f7020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f7023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f7024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f7025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fa.a f7026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f7027j;
    public final Iterable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final da.a f7028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f7029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z9.b f7030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z9.d f7031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xa.g f7032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ob.l f7033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f7034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f7035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f7036t;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(mb.k kVar, x9.y yVar, a2.d dVar, android.support.v4.media.session.r rVar, g0 g0Var, Iterable iterable, da.a aVar, z9.b bVar, z9.d dVar2, xa.g gVar, ob.l lVar, kb.d dVar3, int i7) {
        ob.l lVar2;
        j jVar = j.f7039e;
        j jVar2 = j.f7040f;
        if ((i7 & 65536) != 0) {
            ob.l.f9655b.getClass();
            lVar2 = ob.k.f9654b;
        } else {
            lVar2 = lVar;
        }
        this(kVar, yVar, dVar, rVar, g0Var, m.f7052a, jVar, iterable, aVar, bVar, dVar2, gVar, lVar2, dVar3, n3.l.I(nb.k.f9014a), (i7 & 524288) != 0 ? j.f7038d : jVar2);
    }

    public i(mb.k kVar, x9.y yVar, e eVar, a aVar, g0 g0Var, m mVar, n nVar, Iterable iterable, da.a aVar2, z9.b bVar, z9.d dVar, xa.g gVar, ob.l lVar, kb.d dVar2, List list, l lVar2) {
        j jVar = j.f7037c;
        j jVar2 = j.f7041g;
        i9.l.e(yVar, "moduleDescriptor");
        i9.l.e(gVar, "extensionRegistryLite");
        i9.l.e(lVar, "kotlinTypeChecker");
        i9.l.e(lVar2, "enumEntriesDeserializationSupport");
        this.f7018a = kVar;
        this.f7019b = yVar;
        this.f7020c = jVar;
        this.f7021d = eVar;
        this.f7022e = aVar;
        this.f7023f = g0Var;
        this.f7024g = jVar2;
        this.f7025h = mVar;
        this.f7026i = fa.a.f5501a;
        this.f7027j = nVar;
        this.k = iterable;
        this.f7028l = aVar2;
        this.f7029m = h.f7017a;
        this.f7030n = bVar;
        this.f7031o = dVar;
        this.f7032p = gVar;
        this.f7033q = lVar;
        this.f7034r = list;
        this.f7035s = lVar2;
        this.f7036t = new g(this);
    }

    public final k a(x9.d0 d0Var, ta.f fVar, f0 f0Var, ta.g gVar, ta.a aVar, lb.j jVar) {
        i9.l.e(fVar, "nameResolver");
        i9.l.e(aVar, "metadataVersion");
        return new k(this, fVar, d0Var, f0Var, gVar, aVar, jVar, null, u8.w.f13122a);
    }

    public final x9.e b(wa.b bVar) {
        i9.l.e(bVar, "classId");
        Set set = g.f7014c;
        return this.f7036t.a(bVar, null);
    }
}
