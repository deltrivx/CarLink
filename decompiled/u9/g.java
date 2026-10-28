package u9;

import aa.c0;
import aa.h0;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f13138b;

    public /* synthetic */ g(i iVar, int i7) {
        this.f13137a = i7;
        this.f13138b = iVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f13137a) {
            case 0:
                wa.e eVar = (wa.e) obj;
                h0 h0VarL = this.f13138b.l();
                wa.c cVar = o.k;
                gb.k kVar = ((c0) h0VarL.F(cVar)).f326g;
                if (kVar == null) {
                    i.a(11);
                    throw null;
                }
                x9.h hVarA = kVar.a(eVar, fa.b.f5502a);
                if (hVarA == null) {
                    throw new AssertionError("Built-in class " + cVar.a(eVar) + " is not found");
                }
                if (hVarA instanceof x9.e) {
                    return (x9.e) hVarA;
                }
                throw new AssertionError("Must be a class descriptor " + eVar + ", but was " + hVarA);
            default:
                y yVar = (y) obj;
                i9.l.e(yVar, "module");
                return yVar.k().h(this.f13138b.v());
        }
    }
}
