package j;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6834b;

    public /* synthetic */ l(Context context, int i7) {
        this.f6833a = i7;
        this.f6834b = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    @Override // java.lang.Runnable
    public final void run() {
        a4.e eVar;
        Object systemService;
        Context context;
        switch (this.f6833a) {
            case 0:
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 33) {
                    Context context2 = this.f6834b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i7 >= 33) {
                            s.g gVar = q.f6845g;
                            gVar.getClass();
                            s.b bVar = new s.b(gVar);
                            while (true) {
                                if (bVar.hasNext()) {
                                    q qVar = (q) ((WeakReference) bVar.next()).get();
                                    if (qVar != null && (context = ((b0) qVar).k) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                eVar = new a4.e(new a4.i(n.a(systemService)));
                            } else {
                                eVar = a4.e.f32b;
                            }
                        } else {
                            eVar = q.f6841c;
                            if (eVar == null) {
                                eVar = a4.e.f32b;
                            }
                        }
                        if (eVar.f33a.isEmpty()) {
                            String strF = u3.f.f(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                n.b(systemService2, m.a(strF));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                q.f6844f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new l(this.f6834b, 2));
                break;
            default:
                z4.e.t(this.f6834b, new z4.c(), z4.e.f15718a, false);
                break;
        }
    }
}
