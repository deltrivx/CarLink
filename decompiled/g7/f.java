package g7;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.support.v4.media.session.r;
import android.util.Log;
import android.view.SurfaceHolder;
import com.baidu.carlifevehicle.R;
import f7.q;
import f7.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5967b;

    public /* synthetic */ f(g gVar, int i7) {
        this.f5966a = i7;
        this.f5967b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = null;
        switch (this.f5966a) {
            case 0:
                g gVar = this.f5967b;
                try {
                    Log.d("g", "Opening camera");
                    gVar.f5971c.c();
                    return;
                } catch (Exception e7) {
                    Handler handler = gVar.f5972d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e7).sendToTarget();
                    }
                    Log.e("g", "Failed to open camera", e7);
                    return;
                }
            case 1:
                g gVar2 = this.f5967b;
                i iVar = gVar2.f5971c;
                try {
                    Log.d("g", "Configuring camera");
                    iVar.b();
                    Handler handler2 = gVar2.f5972d;
                    if (handler2 != null) {
                        v vVar2 = iVar.f5993j;
                        if (vVar2 != null) {
                            int i7 = iVar.k;
                            if (i7 == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            vVar = i7 % 180 != 0 ? new v(vVar2.f5456b, vVar2.f5455a) : vVar2;
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, vVar).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    Handler handler3 = gVar2.f5972d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e10).sendToTarget();
                    }
                    Log.e("g", "Failed to configure camera", e10);
                    return;
                }
            case 2:
                g gVar3 = this.f5967b;
                i iVar2 = gVar3.f5971c;
                try {
                    Log.d("g", "Starting preview");
                    r rVar = gVar3.f5970b;
                    Camera camera = iVar2.f5984a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) rVar.f604b;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) rVar.f605c);
                    }
                    iVar2.f();
                    return;
                } catch (Exception e11) {
                    Handler handler4 = gVar3.f5972d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e11).sendToTarget();
                    }
                    Log.e("g", "Failed to start preview", e11);
                    return;
                }
            default:
                try {
                    Log.d("g", "Closing camera");
                    i iVar3 = this.f5967b.f5971c;
                    b bVar = iVar3.f5986c;
                    if (bVar != null) {
                        bVar.c();
                        iVar3.f5986c = null;
                    }
                    if (iVar3.f5987d != null) {
                        iVar3.f5987d = null;
                    }
                    Camera camera2 = iVar3.f5984a;
                    if (camera2 != null && iVar3.f5988e) {
                        camera2.stopPreview();
                        iVar3.f5994l.f5980a = null;
                        iVar3.f5988e = false;
                    }
                    i iVar4 = this.f5967b.f5971c;
                    Camera camera3 = iVar4.f5984a;
                    if (camera3 != null) {
                        camera3.release();
                        iVar4.f5984a = null;
                    }
                    break;
                } catch (Exception e12) {
                    Log.e("g", "Failed to close camera", e12);
                }
                g gVar4 = this.f5967b;
                gVar4.f5975g = true;
                gVar4.f5972d.sendEmptyMessage(R.id.zxing_camera_closed);
                q qVar = this.f5967b.f5969a;
                synchronized (qVar.f5449e) {
                    try {
                        int i10 = qVar.f5446b - 1;
                        qVar.f5446b = i10;
                        if (i10 == 0) {
                            qVar.h();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
