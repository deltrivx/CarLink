package f7;

import android.graphics.Rect;
import android.util.Log;
import com.baidu.carlifevehicle.R;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5386b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f5385a = i7;
        this.f5386b = obj;
    }

    private final void b() {
    }

    private final void d(Exception exc) {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    public final void a() {
        int i7 = this.f5385a;
        Object obj = this.f5386b;
        switch (i7) {
            case 0:
                Iterator it = ((BarcodeView) obj).f5397j.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
                break;
            case 1:
                j jVar = (j) obj;
                if (jVar.k) {
                    Log.d("j", "Camera closed; finishing activity");
                    jVar.f5417a.finish();
                }
                break;
        }
    }

    public final void c(Exception exc) {
        switch (this.f5385a) {
            case 0:
                Iterator it = ((BarcodeView) this.f5386b).f5397j.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c(exc);
                }
                break;
            case 1:
                j jVar = (j) this.f5386b;
                jVar.b(jVar.f5417a.getString(R.string.zxing_msg_camera_framework_bug));
                break;
        }
    }

    public final void e() {
        switch (this.f5385a) {
            case 0:
                Iterator it = ((BarcodeView) this.f5386b).f5397j.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).e();
                }
                break;
            case 1:
                break;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f5386b;
                f fVar = viewfinderView.f2909i;
                if (fVar != null) {
                    Rect framingRect = fVar.getFramingRect();
                    v previewSize = viewfinderView.f2909i.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.f2910j = framingRect;
                        viewfinderView.k = previewSize;
                    }
                }
                viewfinderView.invalidate();
                break;
        }
    }

    public final void g() {
        switch (this.f5385a) {
            case 0:
                Iterator it = ((BarcodeView) this.f5386b).f5397j.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).g();
                }
                break;
        }
    }

    public final void j() {
        switch (this.f5385a) {
            case 0:
                Iterator it = ((BarcodeView) this.f5386b).f5397j.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).j();
                }
                break;
        }
    }
}
