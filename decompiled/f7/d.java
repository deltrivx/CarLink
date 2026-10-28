package f7;

import android.util.Log;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5384b;

    public /* synthetic */ d(int i7, Object obj) {
        this.f5383a = i7;
        this.f5384b = obj;
    }

    private final void a(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        switch (this.f5383a) {
            case 0:
                if (surfaceHolder != null) {
                    BarcodeView barcodeView = (BarcodeView) this.f5384b;
                    barcodeView.f5402p = new v(i10, i11);
                    barcodeView.e();
                } else {
                    int i12 = f.f5387z;
                    Log.e("f", "*** WARNING *** surfaceChanged() gave us a null surface!");
                }
                break;
            default:
                i9.l.e(surfaceHolder, "holder");
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f5383a) {
            case 0:
                break;
            default:
                i9.l.e(surfaceHolder, "holder");
                ((x7.o) this.f5384b).f14678c.i(surfaceHolder.getSurface());
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f5383a) {
            case 0:
                ((BarcodeView) this.f5384b).f5402p = null;
                break;
            default:
                i9.l.e(surfaceHolder, "holder");
                ((x7.o) this.f5384b).f14678c.i(null);
                break;
        }
    }
}
