package r2;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f11141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i7) {
        super(1);
        this.f11140a = i7;
        this.f11141b = b0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f11140a) {
            case 0:
                b0 b0Var = this.f11141b;
                return Boolean.valueOf(b0Var.f11169d.getParent().requestSendAccessibilityEvent(b0Var.f11169d, (AccessibilityEvent) obj));
            default:
                l2 l2Var = (l2) obj;
                if (l2Var.f11323b.contains(l2Var)) {
                    b0 b0Var2 = this.f11141b;
                    b0Var2.f11169d.getSnapshotObserver().a(l2Var, b0Var2.P, new k2.d(5, l2Var, b0Var2));
                }
                return t8.z.f12851a;
        }
    }
}
