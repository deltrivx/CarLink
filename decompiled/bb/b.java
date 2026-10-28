package bb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.k f1679b;

    public b(List list, h9.k kVar) {
        super(list);
        this.f1679b = kVar;
    }

    @Override // bb.g
    public final nb.w a(x9.y yVar) {
        x9.h hVarL;
        i9.l.e(yVar, "module");
        nb.w wVar = (nb.w) this.f1679b.invoke(yVar);
        if (!u9.i.z(wVar) && (((hVarL = wVar.D0().l()) == null || u9.i.s(hVarL) == null) && !u9.i.C(wVar, u9.n.W.f14240a) && !u9.i.C(wVar, u9.n.X.f14240a) && !u9.i.C(wVar, u9.n.Y.f14240a))) {
            u9.i.C(wVar, u9.n.Z.f14240a);
        }
        return wVar;
    }
}
