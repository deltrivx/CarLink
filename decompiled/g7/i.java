package g7;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import f7.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f5983m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f5984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Camera.CameraInfo f5985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f5986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r5.a f5987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5989f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f5991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f5992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f5993j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f5990g = new j();
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f5994l = new h(this);

    public i(Context context) {
    }

    public final int a() {
        int i7 = this.f5991h.f5998b;
        int i10 = 0;
        if (i7 != 0) {
            if (i7 == 1) {
                i10 = 90;
            } else if (i7 == 2) {
                i10 = 180;
            } else if (i7 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f5985b;
        int i11 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
        Log.i("i", "Camera Display Orientation: " + i11);
        return i11;
    }

    public final void b() {
        if (this.f5984a == null) {
            throw new RuntimeException("Camera not open");
        }
        try {
            int iA = a();
            this.k = iA;
            this.f5984a.setDisplayOrientation(iA);
        } catch (Exception unused) {
            Log.w("i", "Failed to set rotation.");
        }
        try {
            d(false);
        } catch (Exception unused2) {
            try {
                d(true);
            } catch (Exception unused3) {
                Log.w("i", "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f5984a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f5993j = this.f5992i;
        } else {
            this.f5993j = new v(previewSize.width, previewSize.height);
        }
        this.f5994l.f5981b = this.f5993j;
    }

    public final void c() {
        int iA = r.A(this.f5990g.f5995a);
        Camera cameraOpen = iA == -1 ? null : Camera.open(iA);
        this.f5984a = cameraOpen;
        if (cameraOpen == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int iA2 = r.A(this.f5990g.f5995a);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f5985b = cameraInfo;
        Camera.getCameraInfo(iA2, cameraInfo);
    }

    public final void d(boolean z10) {
        String string;
        Camera.Parameters parameters = this.f5984a.getParameters();
        String str = this.f5989f;
        if (str == null) {
            this.f5989f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters == null) {
            Log.w("i", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("i", "Initial camera parameters: " + parameters.flatten());
        if (z10) {
            Log.w("i", "In camera config safe mode -- most settings will not be honored");
        }
        this.f5990g.getClass();
        int i7 = c.f5959a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String strA = c.a("focus mode", supportedFocusModes, "auto");
        if (!z10 && strA == null) {
            strA = c.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strA != null) {
            if (strA.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(strA));
            } else {
                parameters.setFocusMode(strA);
            }
        }
        if (!z10) {
            c.b(parameters, false);
            this.f5990g.getClass();
            this.f5990g.getClass();
            this.f5990g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new v(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new v(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f5992i = null;
        } else {
            l lVar = this.f5991h;
            int i10 = this.k;
            if (i10 == -1) {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
            boolean z11 = i10 % 180 != 0;
            v vVar = (v) lVar.f5999c;
            if (vVar == null) {
                vVar = null;
            } else if (z11) {
                vVar = new v(vVar.f5456b, vVar.f5455a);
            }
            n nVar = (n) lVar.f6000d;
            nVar.getClass();
            if (vVar != null) {
                Collections.sort(arrayList, new m(nVar, vVar));
            }
            Log.i("n", "Viewfinder size: " + vVar);
            Log.i("n", "Preview in order of preference: " + arrayList);
            v vVar2 = (v) arrayList.get(0);
            this.f5992i = vVar2;
            parameters.setPreviewSize(vVar2.f5455a, vVar2.f5456b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb2 = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                string = "[]";
            } else {
                StringBuilder sb3 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb3.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb3.append(", ");
                    }
                }
                sb3.append(']');
                string = sb3.toString();
            }
            sb2.append(string);
            Log.i("CameraConfiguration", sb2.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                for (int[] iArr2 : supportedPreviewFpsRange) {
                    int i11 = iArr2[0];
                    int i12 = iArr2[1];
                    if (i11 >= 10000 && i12 <= 20000) {
                        iArr = iArr2;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr3 = new int[2];
                    parameters.getPreviewFpsRange(iArr3);
                    if (Arrays.equals(iArr3, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("i", "Final camera parameters: " + parameters.flatten());
        this.f5984a.setParameters(parameters);
    }

    public final void e(boolean z10) {
        String flashMode;
        Camera camera = this.f5984a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z10 != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    b bVar = this.f5986c;
                    if (bVar != null) {
                        bVar.c();
                    }
                    Camera.Parameters parameters2 = this.f5984a.getParameters();
                    c.b(parameters2, z10);
                    this.f5990g.getClass();
                    this.f5984a.setParameters(parameters2);
                    b bVar2 = this.f5986c;
                    if (bVar2 != null) {
                        bVar2.f5953a = false;
                        bVar2.b();
                    }
                }
            } catch (RuntimeException e7) {
                Log.e("i", "Failed to set torch", e7);
            }
        }
    }

    public final void f() {
        Camera camera = this.f5984a;
        if (camera == null || this.f5988e) {
            return;
        }
        camera.startPreview();
        this.f5988e = true;
        this.f5986c = new b(this.f5984a, this.f5990g);
        j jVar = this.f5990g;
        r5.a aVar = new r5.a();
        aVar.f11625a = this;
        aVar.f11626b = new Handler();
        this.f5987d = aVar;
        jVar.getClass();
    }
}
