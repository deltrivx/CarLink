package p6;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f10299b;

    public /* synthetic */ d(Activity activity, int i7) {
        this.f10298a = i7;
        this.f10299b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i7 = this.f10298a;
        Activity activity = this.f10299b;
        switch (i7) {
            case 0:
                u6.a.b(activity);
                return;
            default:
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = u3.e.f13055g;
                Method method = u3.e.f13054f;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i10 != 26 && i10 != 27) || method != null) && (u3.e.f13053e != null || u3.e.f13052d != null)) {
                    try {
                        Object obj2 = u3.e.f13051c.get(activity);
                        if (obj2 != null && (obj = u3.e.f13050b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            u3.d dVar = new u3.d(activity);
                            application.registerActivityLifecycleCallbacks(dVar);
                            handler.post(new b4.a(9, dVar, obj2));
                            try {
                                if (i10 == 26 || i10 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new b4.a(10, application, dVar));
                                return;
                            } catch (Throwable th) {
                                handler.post(new b4.a(10, application, dVar));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}
