package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f9930b;

    public /* synthetic */ u1(v1 v1Var, int i7) {
        this.f9929a = i7;
        this.f9930b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9929a) {
            case 0:
                ViewParent parent = this.f9930b.f9939d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                v1 v1Var = this.f9930b;
                v1Var.a();
                View view = v1Var.f9939d;
                if (view.isEnabled() && !view.isLongClickable() && v1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    v1Var.f9942g = true;
                    break;
                }
                break;
        }
    }
}
