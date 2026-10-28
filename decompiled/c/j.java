package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1734a = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f1735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p4.l f1737d;

    public j(p4.l lVar) {
        this.f1737d = lVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i9.l.e(runnable, "runnable");
        this.f1735b = runnable;
        View decorView = this.f1737d.getWindow().getDecorView();
        i9.l.d(decorView, "window.decorView");
        if (!this.f1736c) {
            decorView.postOnAnimation(new androidx.lifecycle.z(2, this));
        } else if (i9.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f1735b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1734a) {
                this.f1736c = false;
                this.f1737d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1735b = null;
        y yVar = (y) this.f1737d.f1777g.getValue();
        synchronized (yVar.f1795a) {
            z10 = yVar.f1796b;
        }
        if (z10) {
            this.f1736c = false;
            this.f1737d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1737d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
