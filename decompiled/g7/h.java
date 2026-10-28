package g7;

import android.hardware.Camera;
import android.util.Log;
import com.baidu.carlifevehicle.R;
import f7.o;
import f7.v;
import f7.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.d f5980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f5981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5982c;

    public h(i iVar) {
        this.f5982c = iVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        v vVar = this.f5981b;
        a2.d dVar = this.f5980a;
        if (vVar == null || dVar == null) {
            Log.d("i", "Got preview callback, but no handler or resolution available");
            if (dVar != null) {
                new Exception("No resolution available");
                dVar.r();
                return;
            }
            return;
        }
        try {
            if (bArr == null) {
                throw new NullPointerException("No preview data received");
            }
            w wVar = new w(vVar.f5455a, vVar.f5456b, camera.getParameters().getPreviewFormat(), bArr, this.f5982c.k);
            if (this.f5982c.f5985b.facing == 1) {
                wVar.f5461e = true;
            }
            synchronized (((o) dVar.f20b).f5441h) {
                try {
                    o oVar = (o) dVar.f20b;
                    if (oVar.f5440g) {
                        oVar.f5436c.obtainMessage(R.id.zxing_decode, wVar).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RuntimeException e7) {
            Log.e("i", "Camera preview failed", e7);
            dVar.r();
        }
    }
}
