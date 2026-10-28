package f7;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.baidu.carlifevehicle.R;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f5416n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureActivity f5417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecoratedBarcodeView f5418b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r5.f f5424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e6.h f5425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f5426j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5428m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5419c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5420d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5421e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5422f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5423g = false;
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a2.d f5427l = new a2.d(16, this);

    public j(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        e eVar = new e(1, this);
        this.f5428m = false;
        this.f5417a = captureActivity;
        this.f5418b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f5397j.add(eVar);
        this.f5426j = new Handler();
        this.f5424h = new r5.f(captureActivity, new g(this, 0));
        this.f5425i = new e6.h(captureActivity);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f5418b;
        g7.g gVar = decoratedBarcodeView.getBarcodeView().f5388a;
        if (gVar == null || gVar.f5975g) {
            this.f5417a.finish();
        } else {
            this.k = true;
        }
        decoratedBarcodeView.f2897a.g();
        this.f5424h.a();
    }

    public final void b(String str) {
        CaptureActivity captureActivity = this.f5417a;
        if (captureActivity.isFinishing() || this.f5423g || this.k) {
            return;
        }
        if (str.isEmpty()) {
            str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
        builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: f7.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                this.f5414a.f5417a.finish();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: f7.i
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f5415a.f5417a.finish();
            }
        });
        builder.show();
    }
}
