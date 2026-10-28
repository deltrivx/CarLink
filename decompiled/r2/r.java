package r2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, int i10) {
        super(1);
        this.f11378a = i10;
        this.f11379b = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f11378a) {
            case 0:
                return Boolean.valueOf(((w1.s) obj).E0(this.f11379b));
            case 1:
                return Boolean.valueOf(((View) obj).getId() == this.f11379b);
            default:
                return Boolean.valueOf(((w1.s) obj).E0(this.f11379b));
        }
    }
}
