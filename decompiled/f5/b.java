package f5;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5301a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5302b;

    public /* synthetic */ b() {
    }

    public b(e eVar) {
        this.f5302b = eVar;
    }

    private final void a(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f5301a) {
            case 0:
                ((e) this.f5302b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        switch (this.f5301a) {
            case 0:
                ((e) this.f5302b).scheduleSelf(runnable, j5);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f5302b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j5);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f5301a) {
            case 0:
                ((e) this.f5302b).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f5302b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
        }
    }
}
