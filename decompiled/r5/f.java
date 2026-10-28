package r5;

import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import e8.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureActivity f11630a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f7.g f11634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11635f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11632c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f11631b = new z0(2, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f11633d = new Handler();

    public f(CaptureActivity captureActivity, f7.g gVar) {
        this.f11630a = captureActivity;
        this.f11634e = gVar;
    }

    public final void a() {
        this.f11633d.removeCallbacksAndMessages(null);
        if (this.f11632c) {
            this.f11630a.unregisterReceiver(this.f11631b);
            this.f11632c = false;
        }
    }
}
