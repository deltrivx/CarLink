package e4;

import android.view.Window;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class u1 extends t1 {
    @Override // e4.t1, k9.a
    public final void P(boolean z10) {
        if (!z10) {
            W(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
            return;
        }
        Window window = this.f4403d;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        V(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
    }
}
