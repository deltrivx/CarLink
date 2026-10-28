package m7;

import f1.s;
import h9.n;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f8603a = new k();

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            i2.c.m("设置", null, sVar, 6, 2);
            i2.c.b(0, sVar);
        }
        return z.f12851a;
    }
}
