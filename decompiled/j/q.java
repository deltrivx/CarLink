package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f6839a = new o(new p());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6840b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a4.e f6841c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a4.e f6842d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f6843e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f6844f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s.g f6845g = new s.g(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f6846h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f6847i = new Object();

    public static boolean b(Context context) {
        if (f6843e == null) {
            try {
                int i7 = g0.f6796a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) g0.class), Build.VERSION.SDK_INT >= 24 ? f0.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f6843e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f6843e = Boolean.FALSE;
            }
        }
        return f6843e.booleanValue();
    }

    public static void e(b0 b0Var) {
        synchronized (f6846h) {
            try {
                s.g gVar = f6845g;
                gVar.getClass();
                s.b bVar = new s.b(gVar);
                while (bVar.hasNext()) {
                    q qVar = (q) ((WeakReference) bVar.next()).get();
                    if (qVar == b0Var || qVar == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i7);

    public abstract void g(int i7);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
