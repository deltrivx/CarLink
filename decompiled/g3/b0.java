package g3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5831a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5832b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        switch (this.f5831a) {
            case 0:
                ((Runnable) this.f5832b).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new j.l((Context) this.f5832b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }
}
