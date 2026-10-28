package ka;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements gb.o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f7405f = {i9.y.f6689a.g(new i9.r(d.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.a f7406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f7407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f7408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.i f7409e;

    public d(da.a aVar, da.y yVar, q qVar) {
        this.f7406b = aVar;
        this.f7407c = qVar;
        this.f7408d = new v(aVar, yVar, qVar);
        mb.n nVar = ((ja.a) aVar.f3847b).f6964a;
        aa.e eVar = new aa.e(15, this);
        mb.k kVar = (mb.k) nVar;
        kVar.getClass();
        this.f7409e = new mb.i(kVar, eVar);
    }

    @Override // gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        i(eVar, bVar);
        v vVar = this.f7408d;
        vVar.getClass();
        x9.h hVar = null;
        x9.e eVarV = vVar.v(eVar, null);
        if (eVarV != null) {
            return eVarV;
        }
        for (gb.o oVar : h()) {
            x9.h hVarA = oVar.a(eVar, bVar);
            if (hVarA != null) {
                if (!(hVarA instanceof x9.i) || !((x9.w) hVarA).G()) {
                    return hVarA;
                }
                if (hVar == null) {
                    hVar = hVarA;
                }
            }
        }
        return hVar;
    }

    @Override // gb.o
    public final Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i(eVar, bVar);
        gb.o[] oVarArrH = h();
        this.f7408d.getClass();
        Collection collectionS = u8.w.f13122a;
        for (gb.o oVar : oVarArrH) {
            collectionS = n4.h.s(collectionS, oVar.b(eVar, bVar));
        }
        return collectionS == null ? u8.y.f13124a : collectionS;
    }

    @Override // gb.o
    public final Set c() {
        gb.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (gb.o oVar : oVarArrH) {
            u8.u.c0(oVar.c(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f7408d.c());
        return linkedHashSet;
    }

    @Override // gb.q
    public final Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        gb.o[] oVarArrH = h();
        Collection collectionD = this.f7408d.d(fVar, kVar);
        for (gb.o oVar : oVarArrH) {
            collectionD = n4.h.s(collectionD, oVar.d(fVar, kVar));
        }
        return collectionD == null ? u8.y.f13124a : collectionD;
    }

    @Override // gb.o
    public final Set e() {
        gb.o[] oVarArrH = h();
        i9.l.e(oVarArrH, "<this>");
        HashSet hashSetC = a.a.C(oVarArrH.length == 0 ? u8.w.f13122a : new u8.n(0, oVarArrH));
        if (hashSetC == null) {
            return null;
        }
        hashSetC.addAll(this.f7408d.e());
        return hashSetC;
    }

    @Override // gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i(eVar, bVar);
        gb.o[] oVarArrH = h();
        Collection collectionF = this.f7408d.f(eVar, bVar);
        for (gb.o oVar : oVarArrH) {
            collectionF = n4.h.s(collectionF, oVar.f(eVar, bVar));
        }
        return collectionF == null ? u8.y.f13124a : collectionF;
    }

    @Override // gb.o
    public final Set g() {
        gb.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (gb.o oVar : oVarArrH) {
            u8.u.c0(oVar.g(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f7408d.g());
        return linkedHashSet;
    }

    public final gb.o[] h() {
        return (gb.o[]) k9.a.z(this.f7409e, f7405f[0]);
    }

    public final void i(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        a.a.Q(((ja.a) this.f7406b.f3847b).f6976n, bVar, this.f7407c, eVar);
    }

    public final String toString() {
        return "scope for " + this.f7407c;
    }
}
