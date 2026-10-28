package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f1725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f1726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f1727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f1728d;

    public h0(e0 e0Var, e0 e0Var2, f0 f0Var, f0 f0Var2) {
        this.f1725a = e0Var;
        this.f1726b = e0Var2;
        this.f1727c = f0Var;
        this.f1728d = f0Var2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f1728d.invoke();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f1727c.invoke();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        i9.l.e(backEvent, "backEvent");
        this.f1726b.invoke(new b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        i9.l.e(backEvent, "backEvent");
        this.f1725a.invoke(new b(backEvent));
    }
}
