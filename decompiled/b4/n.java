package b4;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1508a;

    public n(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f1508a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f1508a);
        super.run();
    }
}
