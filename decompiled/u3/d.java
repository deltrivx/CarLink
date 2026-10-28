package u3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f13044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13046d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13047e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13048f = false;

    public d(Activity activity) {
        this.f13044b = activity;
        this.f13045c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f13044b == activity) {
            this.f13044b = null;
            this.f13047e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f13047e || this.f13048f || this.f13046d) {
            return;
        }
        Object obj = this.f13043a;
        try {
            Object obj2 = e.f13051c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f13045c) {
                e.f13055g.postAtFrontOfQueue(new b4.a(11, e.f13050b.get(activity), obj2));
                this.f13048f = true;
                this.f13043a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f13044b == activity) {
            this.f13046d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
