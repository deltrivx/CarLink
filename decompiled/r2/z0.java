package r2;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends r1.o implements v2.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewGroup f11523o;

    @Override // v2.a
    public final Object v(q2.h1 h1Var, k2.d dVar, a9.c cVar) {
        long jE = h1Var.E(0L);
        x1.c cVar2 = (x1.c) dVar.invoke();
        x1.c cVarI = cVar2 != null ? cVar2.i(jE) : null;
        if (cVarI != null) {
            this.f11523o.requestRectangleOnScreen(y1.h0.z(cVarI), false);
        }
        return t8.z.f12851a;
    }
}
