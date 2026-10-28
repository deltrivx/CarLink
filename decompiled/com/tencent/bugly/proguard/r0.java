package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String name = activity.getClass().getName();
        if (s.f3489l == null || s.f3489l.getName().equals(name)) {
            al.c(">>> %s onCreated <<<", name);
            aa aaVarB = aa.b();
            if (aaVarB != null) {
                aaVarB.L.add(s.a(name, "onCreated"));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String name = activity.getClass().getName();
        if (s.f3489l == null || s.f3489l.getName().equals(name)) {
            al.c(">>> %s onDestroyed <<<", name);
            aa aaVarB = aa.b();
            if (aaVarB != null) {
                aaVarB.L.add(s.a(name, "onDestroyed"));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String name = activity.getClass().getName();
        if (s.f3489l == null || s.f3489l.getName().equals(name)) {
            al.c(">>> %s onPaused <<<", name);
            aa aaVarB = aa.b();
            if (aaVarB == null) {
                return;
            }
            aaVarB.L.add(s.a(name, "onPaused"));
            long jCurrentTimeMillis = System.currentTimeMillis();
            aaVarB.A = jCurrentTimeMillis;
            aaVarB.B = jCurrentTimeMillis - aaVarB.f3075z;
            long unused = s.f3486h = jCurrentTimeMillis;
            if (aaVarB.B < 0) {
                aaVarB.B = 0L;
            }
            aaVarB.f3074y = "background";
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String name = activity.getClass().getName();
        if (s.f3489l == null || s.f3489l.getName().equals(name)) {
            al.c(">>> %s onResumed <<<", name);
            aa aaVarB = aa.b();
            if (aaVarB == null) {
                return;
            }
            aaVarB.L.add(s.a(name, "onResumed"));
            aaVarB.f3074y = name;
            long jCurrentTimeMillis = System.currentTimeMillis();
            aaVarB.f3075z = jCurrentTimeMillis;
            aaVarB.C = jCurrentTimeMillis - s.f3487i;
            long j5 = aaVarB.f3075z - s.f3486h;
            if (j5 > (s.f3484f > 0 ? s.f3484f : s.f3483e)) {
                aaVarB.c();
                s.g();
                al.a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j5 / 1000), Long.valueOf(s.f3483e / 1000));
                if (s.f3485g % s.f3481c == 0) {
                    s.f3480b.a(4, s.f3490m);
                    return;
                }
                s.f3480b.a(4, false);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - s.f3488j > s.f3482d) {
                    long unused = s.f3488j = jCurrentTimeMillis2;
                    al.a("add a timer to upload hot start user info", new Object[0]);
                    if (s.f3490m) {
                        ak.a().a(new p0(s.f3480b, null, true), s.f3482d);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        al.c(">>> %s onStart <<<", activity.getClass().getName());
        aa.b().a(activity.hashCode(), true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        al.c(">>> %s onStop <<<", activity.getClass().getName());
        aa.b().a(activity.hashCode(), false);
    }
}
