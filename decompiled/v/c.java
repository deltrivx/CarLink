package v;

import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f13324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f13326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f13327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f13328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f13329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f13330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f13331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f13332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f13333j;

    public c(Object obj, w0 w0Var, Object obj2) {
        this.f13324a = w0Var;
        this.f13325b = obj2;
        k kVar = new k(w0Var, obj, null, 60);
        this.f13326c = kVar;
        this.f13327d = f1.b.s(Boolean.FALSE);
        this.f13328e = f1.b.s(obj);
        this.f13329f = new c0();
        new g0(obj2);
        p pVar = kVar.f13388c;
        boolean z10 = pVar instanceof l;
        p pVar2 = z10 ? d.f13340e : pVar instanceof m ? d.f13341f : pVar instanceof n ? d.f13342g : d.f13343h;
        this.f13330g = pVar2;
        p pVar3 = z10 ? d.f13336a : pVar instanceof m ? d.f13337b : pVar instanceof n ? d.f13338c : d.f13339d;
        this.f13331h = pVar3;
        this.f13332i = pVar2;
        this.f13333j = pVar3;
    }

    public /* synthetic */ c(Object obj, w0 w0Var, Object obj2, int i7) {
        this(obj, w0Var, (i7 & 4) != 0 ? null : obj2);
    }

    public static final Object a(c cVar, Object obj) {
        w0 w0Var = cVar.f13324a;
        p pVar = cVar.f13333j;
        p pVar2 = cVar.f13332i;
        if (!i9.l.a(pVar2, cVar.f13330g) || !i9.l.a(pVar, cVar.f13331h)) {
            p pVar3 = (p) w0Var.f13471a.invoke(obj);
            int iB = pVar3.b();
            boolean z10 = false;
            for (int i7 = 0; i7 < iB; i7++) {
                if (pVar3.a(i7) < pVar2.a(i7) || pVar3.a(i7) > pVar.a(i7)) {
                    pVar3.e(n3.r.l(pVar3.a(i7), pVar2.a(i7), pVar.a(i7)), i7);
                    z10 = true;
                }
            }
            if (z10) {
                return w0Var.f13472b.invoke(pVar3);
            }
        }
        return obj;
    }

    public static final void b(c cVar) {
        k kVar = cVar.f13326c;
        kVar.f13388c.d();
        kVar.f13389d = Long.MIN_VALUE;
        cVar.f13327d.setValue(Boolean.FALSE);
    }

    public static Object c(c cVar, Object obj, j jVar, h9.k kVar, a9.i iVar, int i7) {
        Object objInvoke = cVar.f13324a.f13472b.invoke(cVar.f13326c.f13388c);
        h9.k kVar2 = (i7 & 8) != 0 ? null : kVar;
        Object objD = cVar.d();
        w0 w0Var = cVar.f13324a;
        return c0.a(cVar.f13329f, new a(cVar, objInvoke, new m0(jVar, w0Var, objD, obj, (p) w0Var.f13471a.invoke(objInvoke)), cVar.f13326c.f13389d, kVar2, null), iVar);
    }

    public final Object d() {
        return this.f13326c.f13387b.getValue();
    }

    public final Object e(Object obj, y8.c cVar) {
        Object objA = c0.a(this.f13329f, new b(this, obj, null), cVar);
        return objA == z8.a.f15774a ? objA : t8.z.f12851a;
    }
}
