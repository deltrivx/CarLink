package f7;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.lifecycle.z;
import com.journeyapps.barcodescanner.BarcodeView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f5454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, Context context) {
        super(context, 3);
        this.f5454a = qVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        int rotation;
        q qVar = this.f5454a;
        WindowManager windowManager = (WindowManager) qVar.f5447c;
        a2.d dVar = (a2.d) qVar.f5449e;
        if (windowManager == null || dVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == qVar.f5446b) {
            return;
        }
        qVar.f5446b = rotation;
        ((BarcodeView) dVar.f20b).f5390c.postDelayed(new z(8, dVar), 250L);
    }
}
