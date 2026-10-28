package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/f0;", "Landroid/app/Fragment;", "<init>", "()V", "a2/d", "a", "androidx/lifecycle/d0", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public class f0 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1028b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.d f1029a;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final e0 Companion = new e0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            i9.l.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            i9.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            i9.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            i9.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            i9.l.e(activity, "activity");
            int i7 = f0.f1028b;
            d0.a(activity, n.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            i9.l.e(activity, "activity");
            int i7 = f0.f1028b;
            d0.a(activity, n.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            i9.l.e(activity, "activity");
            int i7 = f0.f1028b;
            d0.a(activity, n.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            i9.l.e(activity, "activity");
            int i7 = f0.f1028b;
            d0.a(activity, n.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            i9.l.e(activity, "activity");
            int i7 = f0.f1028b;
            d0.a(activity, n.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            i9.l.e(activity, "activity");
            int i7 = f0.f1028b;
            d0.a(activity, n.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            i9.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            i9.l.e(activity, "activity");
            i9.l.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            i9.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            i9.l.e(activity, "activity");
        }
    }

    public final void a(n nVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            i9.l.d(activity, "getActivity(...)");
            d0.a(activity, nVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(n.ON_DESTROY);
        this.f1029a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a2.d dVar = this.f1029a;
        if (dVar != null) {
            ((c0) dVar.f20b).a();
        }
        a(n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a2.d dVar = this.f1029a;
        if (dVar != null) {
            c0 c0Var = (c0) dVar.f20b;
            int i7 = c0Var.f1016a + 1;
            c0Var.f1016a = i7;
            if (i7 == 1 && c0Var.f1019d) {
                c0Var.f1021f.d(n.ON_START);
                c0Var.f1019d = false;
            }
        }
        a(n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(n.ON_STOP);
    }
}
