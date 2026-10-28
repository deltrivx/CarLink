package g7;

import android.hardware.Camera;
import androidx.lifecycle.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5951a;

    public a(b bVar) {
        this.f5951a = bVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z10, Camera camera) {
        this.f5951a.f5957e.post(new z(10, this));
    }
}
