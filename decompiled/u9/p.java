package u9;

import aa.i0;
import aa.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nb.x0;
import x9.t;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f13213a;

    static {
        pb.l lVar = pb.l.f10415a;
        aa.s sVar = new aa.s(pb.l.f10416b, o.f13202f, 0);
        wa.e eVarF = o.f13203g.f14240a.f();
        mb.b bVar = mb.k.f8627e;
        i0 i0Var = new i0(sVar, eVarF, bVar);
        i0Var.f356h = x.f14750e;
        ga.o oVar = x9.o.f14721e;
        if (oVar == null) {
            i0.v0(9);
            throw null;
        }
        i0Var.f357i = oVar;
        List listI = n3.l.I(w0.F0(i0Var, x0.IN_VARIANCE, wa.e.e("T"), 0, bVar));
        if (i0Var.k != null) {
            throw new IllegalStateException("Type parameters are already set for " + i0Var.getName());
        }
        ArrayList arrayList = new ArrayList(listI);
        i0Var.k = arrayList;
        i0Var.f358j = new nb.i(i0Var, arrayList, i0Var.f359l, i0Var.f360m);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            i0.v0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((aa.m) ((t) it.next())).f478g = i0Var.n();
        }
        f13213a = i0Var;
    }
}
