package androidx.compose.foundation;

import b0.k;
import f1.n;
import f1.s;
import h9.o;
import r1.m;
import r1.p;
import x.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.a f778c;

    public b(n0 n0Var, boolean z10, h9.a aVar) {
        this.f776a = n0Var;
        this.f777b = z10;
        this.f778c = aVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj2;
        ((Number) obj3).intValue();
        sVar.W(-1525724089);
        Object objK = sVar.K();
        if (objK == n.f5051a) {
            objK = ob.a.m(sVar);
        }
        k kVar = (k) objK;
        p pVarA = c.a(m.f11116a, kVar, this.f776a).a(new ClickableElement(kVar, null, false, this.f777b, null, this.f778c));
        sVar.p(false);
        return pVarA;
    }
}
