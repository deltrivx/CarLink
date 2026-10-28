package gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6190b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6191c;

    public k(o oVar) {
        this.f6191c = oVar;
    }

    public k(mb.n nVar, h9.a aVar) {
        i9.l.e(nVar, "storageManager");
        this.f6191c = new mb.i((mb.k) nVar, new j(aVar, 0));
    }

    @Override // gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        return l().a(eVar, bVar);
    }

    @Override // gb.o
    public Collection b(wa.e eVar, fa.b bVar) {
        switch (this.f6190b) {
            case 1:
                i9.l.e(eVar, "name");
                return za.k.o(k(eVar, bVar), l.f6194d);
            default:
                return k(eVar, bVar);
        }
    }

    @Override // gb.o
    public final Set c() {
        return l().c();
    }

    @Override // gb.q
    public Collection d(f fVar, h9.k kVar) {
        switch (this.f6190b) {
            case 1:
                i9.l.e(fVar, "kindFilter");
                Collection collectionI = i(fVar, kVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((x9.k) obj) instanceof x9.b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return u8.p.x0(arrayList2, za.k.o(arrayList, l.f6195e));
            default:
                return i(fVar, kVar);
        }
    }

    @Override // gb.o
    public final Set e() {
        return l().e();
    }

    @Override // gb.o
    public Collection f(wa.e eVar, fa.b bVar) {
        switch (this.f6190b) {
            case 1:
                i9.l.e(eVar, "name");
                return za.k.o(j(eVar, bVar), l.f6193c);
            default:
                return j(eVar, bVar);
        }
    }

    @Override // gb.o
    public final Set g() {
        return l().g();
    }

    public final o h() {
        if (!(l() instanceof k)) {
            return l();
        }
        o oVarL = l();
        i9.l.c(oVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((k) oVarL).h();
    }

    public final Collection i(f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return l().d(fVar, kVar);
    }

    public final Collection j(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return l().f(eVar, bVar);
    }

    public final Collection k(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return l().b(eVar, bVar);
    }

    public final o l() {
        switch (this.f6190b) {
            case 0:
                return (o) ((mb.i) this.f6191c).invoke();
            default:
                return (o) this.f6191c;
        }
    }
}
