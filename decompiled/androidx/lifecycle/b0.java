package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends h {
    final /* synthetic */ c0 this$0;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static final class a extends h {
        final /* synthetic */ c0 this$0;

        public a(c0 c0Var) {
            this.this$0 = c0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            i9.l.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            i9.l.e(activity, "activity");
            c0 c0Var = this.this$0;
            int i7 = c0Var.f1016a + 1;
            c0Var.f1016a = i7;
            if (i7 == 1 && c0Var.f1019d) {
                c0Var.f1021f.d(n.ON_START);
                c0Var.f1019d = false;
            }
        }
    }

    public b0(c0 c0Var) {
        this.this$0 = c0Var;
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        i9.l.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = f0.f1028b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            i9.l.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((f0) fragmentFindFragmentByTag).f1029a = this.this$0.f1023h;
        }
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        i9.l.e(activity, "activity");
        c0 c0Var = this.this$0;
        int i7 = c0Var.f1017b - 1;
        c0Var.f1017b = i7;
        if (i7 == 0) {
            Handler handler = c0Var.f1020e;
            i9.l.b(handler);
            handler.postDelayed(c0Var.f1022g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        i9.l.e(activity, "activity");
        a0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        i9.l.e(activity, "activity");
        c0 c0Var = this.this$0;
        int i7 = c0Var.f1016a - 1;
        c0Var.f1016a = i7;
        if (i7 == 0 && c0Var.f1018c) {
            c0Var.f1021f.d(n.ON_STOP);
            c0Var.f1019d = true;
        }
    }
}
