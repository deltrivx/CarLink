package d1;

import f1.w2;
import v.p0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f3717b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p0 p0Var, int i7) {
        super(0);
        this.f3716a = i7;
        this.f3717b = p0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f3716a) {
            case 0:
                return Boolean.valueOf(((Number) this.f3717b.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) this.f3717b.getValue()).floatValue() > 0.0f);
        }
    }
}
