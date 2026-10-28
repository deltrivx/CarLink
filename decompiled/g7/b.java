package g7;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayList f5952g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Camera f5956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f5957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f5958f;

    static {
        ArrayList arrayList = new ArrayList(2);
        f5952g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public b(Camera camera, j jVar) {
        f7.n nVar = new f7.n(1, this);
        this.f5958f = new a(this);
        this.f5957e = new Handler(nVar);
        this.f5956d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        jVar.getClass();
        boolean zContains = f5952g.contains(focusMode);
        this.f5955c = zContains;
        Log.i("b", "Current focus mode '" + focusMode + "'; use auto focus? " + zContains);
        this.f5953a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f5953a && !this.f5957e.hasMessages(1)) {
            Handler handler = this.f5957e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (!this.f5955c || this.f5953a || this.f5954b) {
            return;
        }
        try {
            this.f5956d.autoFocus(this.f5958f);
            this.f5954b = true;
        } catch (RuntimeException e7) {
            Log.w("b", "Unexpected exception while focusing", e7);
            a();
        }
    }

    public final void c() {
        this.f5953a = true;
        this.f5954b = false;
        this.f5957e.removeMessages(1);
        if (this.f5955c) {
            try {
                this.f5956d.cancelAutoFocus();
            } catch (RuntimeException e7) {
                Log.w("b", "Unexpected exception while cancelling focusing", e7);
            }
        }
    }
}
