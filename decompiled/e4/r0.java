package e4;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4396a;

    public r0(View view) {
        this.f4396a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f4396a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f4396a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j5) {
        View view = (View) this.f4396a.get();
        if (view != null) {
            view.animate().setDuration(j5);
        }
    }

    public final void d(s0 s0Var) {
        View view = (View) this.f4396a.get();
        if (view != null) {
            if (s0Var != null) {
                view.animate().setListener(new q0(s0Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f4396a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
