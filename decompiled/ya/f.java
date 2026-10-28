package ya;

import java.io.IOException;
import nb.n0;
import nb.w;
import nb.x0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f15192b;

    public /* synthetic */ f(g gVar, int i7) {
        this.f15191a = i7;
        this.f15192b = gVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) throws IOException {
        switch (this.f15191a) {
            case 0:
                n0 n0Var = (n0) obj;
                i9.l.e(n0Var, "it");
                if (n0Var.c()) {
                    return "*";
                }
                w wVarB = n0Var.b();
                i9.l.d(wVarB, "getType(...)");
                String strV = this.f15192b.V(wVarB);
                if (n0Var.a() == x0.INVARIANT) {
                    return strV;
                }
                return n0Var.a() + ' ' + strV;
            default:
                w wVar = (w) obj;
                i9.l.b(wVar);
                return this.f15192b.V(wVar);
        }
    }
}
