package p;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f9779b;

    public i(k kVar, g gVar) {
        this.f9779b = kVar;
        this.f9778a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.k kVar;
        k kVar2 = this.f9779b;
        o.m mVar = kVar2.f9800c;
        if (mVar != null && (kVar = mVar.f9180e) != null) {
            kVar.R(mVar);
        }
        View view = (View) kVar2.f9805h;
        if (view != null && view.getWindowToken() != null) {
            g gVar = this.f9778a;
            if (gVar.b()) {
                kVar2.f9815s = gVar;
            } else if (gVar.f9242e != null) {
                gVar.d(0, 0, false, false);
                kVar2.f9815s = gVar;
            }
        }
        kVar2.f9817u = null;
    }
}
