package r2;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f11380a;

    public r0(s0 s0Var) {
        this.f11380a = s0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.f11380a.f11392d.removeCallbacks(this);
        s0.x(this.f11380a);
        s0 s0Var = this.f11380a;
        synchronized (s0Var.f11393e) {
            if (s0Var.f11398j) {
                s0Var.f11398j = false;
                ArrayList arrayList = s0Var.f11395g;
                s0Var.f11395g = s0Var.f11396h;
                s0Var.f11396h = arrayList;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((Choreographer.FrameCallback) arrayList.get(i7)).doFrame(j5);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        s0.x(this.f11380a);
        s0 s0Var = this.f11380a;
        synchronized (s0Var.f11393e) {
            if (s0Var.f11395g.isEmpty()) {
                s0Var.f11391c.removeFrameCallback(this);
                s0Var.f11398j = false;
            }
        }
    }
}
