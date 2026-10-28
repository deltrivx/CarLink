package ha;

import ga.y;
import i9.l;
import n3.u;
import u8.b0;
import u9.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa.e f6473a = wa.e.e("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa.e f6474b = wa.e.e("allowedTargets");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wa.e f6475c = wa.e.e("value");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f6476d = b0.W0(new t8.j(n.f13190t, y.f6128c), new t8.j(n.f13193w, y.f6129d), new t8.j(n.f13194x, y.f6131f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static ia.g a(wa.c cVar, na.b bVar, da.a aVar) {
        da.e eVarA;
        l.e(cVar, "kotlinName");
        l.e(bVar, "annotationOwner");
        l.e(aVar, "c");
        if (cVar.equals(n.f13183m)) {
            wa.c cVar2 = y.f6130e;
            l.d(cVar2, "DEPRECATED_ANNOTATION");
            da.e eVarA2 = bVar.a(cVar2);
            if (eVarA2 != null) {
                return new g(eVarA2, aVar);
            }
        }
        wa.c cVar3 = (wa.c) f6476d.get(cVar);
        if (cVar3 == null || (eVarA = bVar.a(cVar3)) == null) {
            return null;
        }
        return b(aVar, eVarA, false);
    }

    public static ia.g b(da.a aVar, da.e eVar, boolean z10) {
        l.e(eVar, "annotation");
        l.e(aVar, "c");
        wa.b bVarA = da.d.a(g5.a.L(g5.a.G(eVar.f3868a)));
        wa.c cVar = y.f6128c;
        l.d(cVar, "TARGET_ANNOTATION");
        if (bVarA.equals(u.L(cVar))) {
            return new j(eVar, aVar);
        }
        wa.c cVar2 = y.f6129d;
        l.d(cVar2, "RETENTION_ANNOTATION");
        if (bVarA.equals(u.L(cVar2))) {
            return new i(eVar, aVar);
        }
        wa.c cVar3 = y.f6131f;
        l.d(cVar3, "DOCUMENTED_ANNOTATION");
        if (bVarA.equals(u.L(cVar3))) {
            return new b(aVar, eVar, n.f13194x);
        }
        wa.c cVar4 = y.f6130e;
        l.d(cVar4, "DEPRECATED_ANNOTATION");
        if (bVarA.equals(u.L(cVar4))) {
            return null;
        }
        return new ka.f(aVar, eVar, z10);
    }
}
