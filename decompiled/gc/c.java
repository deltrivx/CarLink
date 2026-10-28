package gc;

import i9.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y8.c[] f6216a = new y8.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hc.s f6217b = new hc.s(0, "NULL");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hc.s f6218c = new hc.s(0, "UNINITIALIZED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hc.s f6219d = new hc.s(0, "DONE");

    public static final Object a(y8.h hVar, Object obj, Object obj2, h9.n nVar, y8.c cVar) {
        Object objInvoke;
        Object objL = hc.a.l(hVar, obj2);
        try {
            y yVar = new y(cVar, hVar);
            if (ob.a.A(nVar)) {
                b0.d(2, nVar);
                objInvoke = nVar.invoke(obj, yVar);
            } else {
                objInvoke = n4.h.i0(nVar, obj, yVar);
            }
            hc.a.g(hVar, objL);
            if (objInvoke == z8.a.f15774a) {
                i9.l.e(cVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            hc.a.g(hVar, objL);
            throw th;
        }
    }
}
