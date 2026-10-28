package r2;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cc.l f11426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f11427b;

    public t0(cc.l lVar, f1.m1 m1Var, h9.k kVar) {
        this.f11426a = lVar;
        this.f11427b = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        Object objB;
        try {
            objB = this.f11427b.invoke(Long.valueOf(j5));
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        this.f11426a.resumeWith(objB);
    }
}
