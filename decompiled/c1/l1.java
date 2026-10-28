package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.x2 f1979a = new f1.x2(x.f2280j);

    public static final y1.l0 a(int i7, f1.s sVar) {
        k1 k1Var = (k1) sVar.j(f1979a);
        switch (e1.d.b(i7)) {
            case 0:
                return k1Var.f1967e;
            case 1:
                return b(k1Var.f1967e);
            case 2:
                return k1Var.f1963a;
            case 3:
                return b(k1Var.f1963a);
            case 4:
                return k0.e.f7143a;
            case 5:
                return k1Var.f1966d;
            case 6:
                k0.d dVar = k1Var.f1966d;
                float f10 = (float) 0.0d;
                return k0.d.b(dVar, new k0.b(f10), null, new k0.b(f10), 6);
            case 7:
                return b(k1Var.f1966d);
            case 8:
                return k1Var.f1965c;
            case 9:
                return y1.h0.f14898a;
            case 10:
                return k1Var.f1964b;
            default:
                throw new cc.s();
        }
    }

    public static final k0.d b(k0.d dVar) {
        float f10 = (float) 0.0d;
        return k0.d.b(dVar, null, new k0.b(f10), new k0.b(f10), 3);
    }
}
