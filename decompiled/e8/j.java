package e8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static String a(int i7) {
        Object next;
        b9.b bVar = g0.f4544e;
        bVar.getClass();
        i9.b bVar2 = new i9.b(6, bVar);
        do {
            if (!bVar2.hasNext()) {
                next = null;
                break;
            }
            next = bVar2.next();
        } while (((g0) next).f4546b != i7);
        g0 g0Var = (g0) next;
        return g0Var != null ? g0Var.f4545a : "未知状态";
    }

    public static String b(int i7, int i10) {
        Object next;
        b9.b bVar = k.f4569f;
        bVar.getClass();
        i9.b bVar2 = new i9.b(6, bVar);
        while (true) {
            if (!bVar2.hasNext()) {
                next = null;
                break;
            }
            next = bVar2.next();
            k kVar = (k) next;
            if (kVar.f4571b == i7 && kVar.f4572c == i10) {
                break;
            }
        }
        k kVar2 = (k) next;
        return kVar2 != null ? kVar2.f4570a : "未知状态";
    }
}
