package la;

import android.support.v4.media.session.r;
import cc.s;
import i9.l;
import java.util.List;
import nb.f0;
import nb.n0;
import nb.u0;
import nb.w;
import nb.x0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static n0 a(r0 r0Var, a aVar, r rVar, w wVar) {
        l.e(aVar, "typeAttr");
        l.e(rVar, "typeParameterUpperBoundEraser");
        if (!aVar.f8285c) {
            aVar = a.a(aVar, b.f8289a, false, null, null, 61);
        }
        int iOrdinal = aVar.f8284b.ordinal();
        x0 x0Var = x0.INVARIANT;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new f0(wVar, x0Var);
            }
            throw new s();
        }
        if (!r0Var.I().f9056b) {
            return new f0(db.e.e(r0Var).o(), x0Var);
        }
        List listN = wVar.D0().n();
        l.d(listN, "getParameters(...)");
        return !listN.isEmpty() ? new f0(wVar, x0.OUT_VARIANCE) : u0.k(r0Var, aVar);
    }
}
