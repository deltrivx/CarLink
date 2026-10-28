package r2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f11320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.c f11321b;

    public l0(Configuration configuration, w2.c cVar) {
        this.f11320a = configuration;
        this.f11321b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f11320a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f11321b.f14089a.entrySet().iterator();
        while (it.hasNext()) {
            w2.a aVar = (w2.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f14086b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f11321b.f14089a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        this.f11321b.f14089a.clear();
    }
}
