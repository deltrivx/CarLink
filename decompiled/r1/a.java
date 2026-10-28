package r1;

import f1.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11089a = new e(-1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f11090b = new e(1.0f);

    public static final p a(p pVar, h9.o oVar) {
        return pVar.a(new k(oVar));
    }

    public static final p b(s sVar, p pVar) {
        if (pVar.h(l.f11115a)) {
            return pVar;
        }
        sVar.X(1219399079);
        p pVar2 = (p) pVar.g(new c1.n(1, sVar), m.f11116a);
        sVar.p(false);
        return pVar2;
    }

    public static final p c(s sVar, p pVar) {
        sVar.W(439770924);
        p pVarB = b(sVar, pVar);
        sVar.p(false);
        return pVarB;
    }
}
