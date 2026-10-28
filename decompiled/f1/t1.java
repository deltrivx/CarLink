package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5152a;

    public t1(h9.a aVar) {
        this.f5152a = new v0(aVar);
    }

    public abstract u1 a(Object obj);

    public z2 b() {
        return this.f5152a;
    }

    public final z2 c(u1 u1Var, z2 z2Var) {
        j0 j0Var;
        z2 z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        z2Var2 = null;
        if (z2Var instanceof j0) {
            if (u1Var.f5160b) {
                j0Var = (j0) z2Var;
                j0Var.f4995a.setValue(u1Var.c());
            }
        } else if (z2Var instanceof y2) {
            if ((u1Var.f5159a || u1Var.f5164f != null) && !u1Var.f5160b) {
                y2 y2Var = (y2) z2Var;
                if (i9.l.a(u1Var.c(), y2Var.f5230a)) {
                    z2Var2 = y2Var;
                }
            }
        } else if (z2Var instanceof d0) {
            u1Var.getClass();
        }
        if (z2Var2 != null) {
            z2Var2 = j0Var;
            return z2Var2;
        }
        if (!u1Var.f5160b) {
            z2Var2 = j0Var;
            return new y2(u1Var.c());
        }
        Object obj = u1Var.f5164f;
        q2 q2Var = (q2) u1Var.f5163e;
        if (q2Var == null) {
            z2Var2 = j0Var;
            q2Var = w0.f5187f;
        }
        z2Var2 = j0Var;
        return new j0(new k1(obj, q2Var));
    }
}
