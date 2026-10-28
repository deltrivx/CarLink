package u0;

import android.os.CancellationSignal;
import b3.q0;
import cc.o1;
import l0.u0;
import w0.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12987b;

    public /* synthetic */ i(int i7, Object obj) {
        this.f12986a = i7;
        this.f12987b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f12986a) {
            case 0:
                t1 t1Var = (t1) this.f12987b;
                if (t1Var != null) {
                    u0 u0Var = t1Var.f13942d;
                    if (u0Var != null) {
                        u0Var.e(q0.f1428b);
                    }
                    u0 u0Var2 = t1Var.f13942d;
                    if (u0Var2 != null) {
                        u0Var2.f(q0.f1428b);
                    }
                }
                break;
            default:
                ((o1) this.f12987b).a(null);
                break;
        }
    }
}
