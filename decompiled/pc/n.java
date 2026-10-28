package pc;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc.a f10477a;

    public n(mc.a aVar) {
        this.f10477a = aVar;
    }

    @Override // mc.a
    public void a(rc.s sVar, Object obj) {
        int iH = h(obj);
        nc.e eVarD = d();
        i9.l.e(eVarD, "descriptor");
        rc.s sVarA = sVar.a(eVarD);
        Iterator itG = g(obj);
        for (int i7 = 0; i7 < iH; i7++) {
            sVarA.o(d(), i7, this.f10477a, itG.next());
        }
        sVarA.t(eVarD);
    }

    @Override // pc.a
    public void j(oc.a aVar, int i7, Object obj) {
        m(i7, obj, aVar.t(d(), i7, this.f10477a, null));
    }

    public abstract void m(int i7, Object obj, Object obj2);
}
