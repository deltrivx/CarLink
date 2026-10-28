package ga;

import x9.k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements za.e {
    @Override // za.e
    public final int a() {
        return 3;
    }

    @Override // za.e
    public final int b(x9.b bVar, x9.b bVar2, x9.e eVar) {
        i9.l.e(bVar, "superDescriptor");
        i9.l.e(bVar2, "subDescriptor");
        if (!(bVar2 instanceof k0) || !(bVar instanceof k0)) {
            return 3;
        }
        k0 k0Var = (k0) bVar2;
        k0 k0Var2 = (k0) bVar;
        if (!i9.l.a(k0Var.getName(), k0Var2.getName())) {
            return 3;
        }
        if (i2.c.N(k0Var) && i2.c.N(k0Var2)) {
            return 1;
        }
        return (i2.c.N(k0Var) || i2.c.N(k0Var2)) ? 2 : 3;
    }
}
