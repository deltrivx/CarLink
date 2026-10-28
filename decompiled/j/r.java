package j;

import android.view.ViewGroup;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import e4.l0;
import e4.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f6849b;

    public /* synthetic */ r(b0 b0Var, int i7) {
        this.f6848a = i7;
        this.f6849b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f6848a) {
            case 0:
                b0 b0Var = this.f6849b;
                if ((b0Var.Z & 1) != 0) {
                    b0Var.t(0);
                }
                if ((b0Var.Z & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0) {
                    b0Var.t(108);
                }
                b0Var.Y = false;
                b0Var.Z = 0;
                break;
            default:
                b0 b0Var2 = this.f6849b;
                b0Var2.f6742w.showAtLocation(b0Var2.f6741v, 55, 0, 0);
                r0 r0Var = b0Var2.f6744y;
                if (r0Var != null) {
                    r0Var.b();
                }
                if (b0Var2.f6745z && (viewGroup = b0Var2.A) != null && viewGroup.isLaidOut()) {
                    b0Var2.f6741v.setAlpha(0.0f);
                    r0 r0VarA = l0.a(b0Var2.f6741v);
                    r0VarA.a(1.0f);
                    b0Var2.f6744y = r0VarA;
                    r0VarA.d(new t(0, this));
                } else {
                    b0Var2.f6741v.setAlpha(1.0f);
                    b0Var2.f6741v.setVisibility(0);
                }
                break;
        }
    }
}
