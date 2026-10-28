package sb;

import i9.l;
import nb.f0;
import nb.k0;
import nb.l0;
import nb.n0;
import nb.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l0 {
    @Override // nb.l0
    public final n0 g(k0 k0Var) {
        l.e(k0Var, "key");
        ab.b bVar = k0Var instanceof ab.b ? (ab.b) k0Var : null;
        if (bVar == null) {
            return null;
        }
        return bVar.a().c() ? new f0(bVar.a().b(), x0.OUT_VARIANCE) : bVar.a();
    }
}
