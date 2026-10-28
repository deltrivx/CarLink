package y1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f14881a;

    public d(e eVar) {
        this.f14881a = eVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 >= 40) {
            this.f14881a.getClass();
        }
    }
}
