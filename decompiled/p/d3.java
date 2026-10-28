package p;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.a f9700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f9701b;

    public d3(e3 e3Var) {
        this.f9701b = e3Var;
        Context context = e3Var.f9704a.getContext();
        CharSequence charSequence = e3Var.f9711h;
        o.a aVar = new o.a();
        aVar.f9098e = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        aVar.f9100g = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        aVar.f9104l = null;
        aVar.f9105m = null;
        aVar.f9106n = false;
        aVar.f9107o = false;
        aVar.f9108p = 16;
        aVar.f9102i = context;
        aVar.f9094a = charSequence;
        this.f9700a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e3 e3Var = this.f9701b;
        Window.Callback callback = e3Var.k;
        if (callback == null || !e3Var.f9714l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f9700a);
    }
}
