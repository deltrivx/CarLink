package ha;

import aa.y0;
import h9.k;
import i9.l;
import nb.w;
import u9.n;
import x9.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6477a = new d();

    @Override // h9.k
    public final Object invoke(Object obj) {
        w type;
        y yVar = (y) obj;
        Object obj2 = e.f6478a;
        l.e(yVar, "module");
        y0 y0VarH = g5.a.H(c.f6474b, yVar.k().j(n.f13190t));
        return (y0VarH == null || (type = y0VarH.getType()) == null) ? pb.l.c(pb.k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
