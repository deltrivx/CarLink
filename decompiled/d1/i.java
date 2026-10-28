package d1;

import f1.b1;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f3701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f3702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(float f10, b1 b1Var) {
        super(1);
        this.f3701a = f10;
        this.f3702b = b1Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        long j5 = ((x1.e) obj).f14535a;
        float fD = x1.e.d(j5);
        float f10 = this.f3701a;
        float f11 = fD * f10;
        float fB = x1.e.b(j5) * f10;
        b1 b1Var = this.f3702b;
        if (x1.e.d(((x1.e) b1Var.getValue()).f14535a) != f11 || x1.e.b(((x1.e) b1Var.getValue()).f14535a) != fB) {
            b1Var.setValue(new x1.e(n3.l.h(f11, fB)));
        }
        return z.f12851a;
    }
}
