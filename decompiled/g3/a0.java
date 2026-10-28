package g3;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Choreographer f5823a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5823a.postFrameCallback(new b0(runnable));
    }
}
