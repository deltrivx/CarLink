package o7;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9516a;

    public s(boolean z10) {
        this.f9516a = z10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            c1.v.a(this.f9516a, null, false, null, sVar, 48);
        }
        return z.f12851a;
    }
}
