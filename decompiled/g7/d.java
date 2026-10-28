package g7;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.d f5962c;

    public /* synthetic */ d(g gVar, a2.d dVar, int i7) {
        this.f5960a = i7;
        this.f5961b = gVar;
        this.f5962c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f5960a;
        a2.d dVar = this.f5962c;
        g gVar = this.f5961b;
        switch (i7) {
            case 0:
                if (!gVar.f5974f) {
                    Log.d("g", "Camera is closed, not requesting preview");
                } else {
                    gVar.f5969a.d(new d(gVar, dVar, 1));
                }
                break;
            default:
                i iVar = gVar.f5971c;
                Camera camera = iVar.f5984a;
                if (camera != null && iVar.f5988e) {
                    h hVar = iVar.f5994l;
                    hVar.f5980a = dVar;
                    camera.setOneShotPreviewCallback(hVar);
                    break;
                }
                break;
        }
    }
}
