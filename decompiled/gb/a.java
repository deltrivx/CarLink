package gb;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import u8.u;
import u8.y;
import x9.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o[] f6158c;

    public a(String str, o[] oVarArr) {
        this.f6157b = str;
        this.f6158c = oVarArr;
    }

    @Override // gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        x9.h hVar = null;
        for (o oVar : this.f6158c) {
            x9.h hVarA = oVar.a(eVar, bVar);
            if (hVarA != null) {
                if (!(hVarA instanceof x9.i) || !((w) hVarA).G()) {
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
        o[] oVarArr = this.f6158c;
        int length = oVarArr.length;
        if (length == 0) {
            return u8.w.f13122a;
        }
        if (length == 1) {
            return oVarArr[0].b(eVar, bVar);
        }
        Collection collectionS = null;
        for (o oVar : oVarArr) {
            collectionS = n4.h.s(collectionS, oVar.b(eVar, bVar));
        }
        return collectionS == null ? y.f13124a : collectionS;
    }

    @Override // gb.o
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f6158c) {
            u.c0(oVar.c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // gb.q
    public final Collection d(f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        o[] oVarArr = this.f6158c;
        int length = oVarArr.length;
        if (length == 0) {
            return u8.w.f13122a;
        }
        if (length == 1) {
            return oVarArr[0].d(fVar, kVar);
        }
        Collection collectionS = null;
        for (o oVar : oVarArr) {
            collectionS = n4.h.s(collectionS, oVar.d(fVar, kVar));
        }
        return collectionS == null ? y.f13124a : collectionS;
    }

    @Override // gb.o
    public final Set e() {
        o[] oVarArr = this.f6158c;
        i9.l.e(oVarArr, "<this>");
        return a.a.C(oVarArr.length == 0 ? u8.w.f13122a : new u8.n(0, oVarArr));
    }

    @Override // gb.o
    public final Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        o[] oVarArr = this.f6158c;
        int length = oVarArr.length;
        if (length == 0) {
            return u8.w.f13122a;
        }
        if (length == 1) {
            return oVarArr[0].f(eVar, bVar);
        }
        Collection collectionS = null;
        for (o oVar : oVarArr) {
            collectionS = n4.h.s(collectionS, oVar.f(eVar, bVar));
        }
        return collectionS == null ? y.f13124a : collectionS;
    }

    @Override // gb.o
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f6158c) {
            u.c0(oVar.g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.f6157b;
    }
}
