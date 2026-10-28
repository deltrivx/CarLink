package oa;

import aa.a0;
import nb.w;
import nb.w0;
import t8.z;

/* JADX INFO: loaded from: classes.dex */
public final class o implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f9612b = new o(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f9613c = new o(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f9614d = new o(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f9615e = new o(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9616a;

    public /* synthetic */ o(int i7) {
        this.f9616a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f9616a) {
            case 0:
                x9.c cVar = (x9.c) obj;
                i9.l.e(cVar, "it");
                a0 a0VarE0 = cVar.e0();
                i9.l.b(a0VarE0);
                return a0VarE0.getType();
            case 1:
                x9.c cVar2 = (x9.c) obj;
                i9.l.e(cVar2, "it");
                w wVarP = cVar2.p();
                i9.l.b(wVarP);
                return wVarP;
            case 2:
                w0 w0Var = (w0) obj;
                i9.l.e(w0Var, "it");
                return Boolean.valueOf(w0Var instanceof la.h);
            case 3:
                x9.h hVarL = ((w0) obj).D0().l();
                if (hVarL == null) {
                    return Boolean.FALSE;
                }
                wa.e name = hVarL.getName();
                wa.c cVar3 = w9.d.f14182f;
                return Boolean.valueOf(i9.l.a(name, cVar3.f14240a.f()) && i9.l.a(db.e.c(hVarL), cVar3));
            default:
                p pVar = (p) obj;
                i9.l.e(pVar, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                e eVar = m.f9605b;
                pVar.c(strConcat, eVar, eVar);
                return z.f12851a;
        }
    }
}
