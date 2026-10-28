package r2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends cc.u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t8.o f11389m = t8.a.d(k0.f11297g);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l9.b f11390n = new l9.b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f11391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f11392d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11398j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f1.m1 f11399l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11393e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u8.k f11394f = new u8.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f11395g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f11396h = new ArrayList();
    public final r0 k = new r0(this);

    public s0(Choreographer choreographer, Handler handler) {
        this.f11391c = choreographer;
        this.f11392d = handler;
        this.f11399l = new f1.m1(choreographer, this);
    }

    public static final void x(s0 s0Var) {
        boolean z10;
        do {
            Runnable runnableY = s0Var.y();
            while (runnableY != null) {
                runnableY.run();
                runnableY = s0Var.y();
            }
            synchronized (s0Var.f11393e) {
                if (s0Var.f11394f.isEmpty()) {
                    z10 = false;
                    s0Var.f11397i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // cc.u
    public final void g(y8.h hVar, Runnable runnable) {
        synchronized (this.f11393e) {
            this.f11394f.addLast(runnable);
            if (!this.f11397i) {
                this.f11397i = true;
                this.f11392d.post(this.k);
                if (!this.f11398j) {
                    this.f11398j = true;
                    this.f11391c.postFrameCallback(this.k);
                }
            }
        }
    }

    public final Runnable y() {
        Runnable runnable;
        synchronized (this.f11393e) {
            u8.k kVar = this.f11394f;
            runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
        }
        return runnable;
    }
}
