package b4;

import android.os.Handler;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1511a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1514d;

    public /* synthetic */ q() {
    }

    public q(j.f fVar, View view, View view2) {
        this.f1514d = fVar;
        this.f1512b = view;
        this.f1513c = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f1511a) {
            case 0:
                try {
                    objCall = ((h) this.f1512b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f1514d).post(new a(1, (i) this.f1513c, objCall));
                break;
            default:
                j.f.a(((j.f) this.f1514d).f6775e, (View) this.f1512b, (View) this.f1513c);
                break;
        }
    }
}
