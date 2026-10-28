package c;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1721b;

    public /* synthetic */ g0(int i7, Object obj) {
        this.f1720a = i7;
        this.f1721b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f1720a) {
            case 0:
                ((f0) this.f1721b).invoke();
                break;
            case 1:
                ((j.b0) this.f1721b).C();
                break;
            case 2:
                ((Runnable) this.f1721b).run();
                break;
            default:
                h9.a aVar = (h9.a) this.f1721b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
        }
    }
}
