package jc;

import cc.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f7124c;

    public j(Runnable runnable, long j5, boolean z10) {
        super(j5, z10);
        this.f7124c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7124c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f7124c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.l(runnable));
        sb2.append(", ");
        sb2.append(this.f7122a);
        sb2.append(", ");
        return a2.f.I(sb2, this.f7123b ? "Blocking" : "Non-blocking", ']');
    }
}
