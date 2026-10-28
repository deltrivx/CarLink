package r2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.d f11331a;

    public m0(w2.d dVar) {
        this.f11331a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        w2.d dVar = this.f11331a;
        synchronized (dVar) {
            dVar.f14090a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        w2.d dVar = this.f11331a;
        synchronized (dVar) {
            dVar.f14090a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        w2.d dVar = this.f11331a;
        synchronized (dVar) {
            dVar.f14090a.c();
        }
    }
}
