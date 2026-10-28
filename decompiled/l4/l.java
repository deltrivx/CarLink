package l4;

import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.View;
import java.util.concurrent.ThreadPoolExecutor;
import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8017d;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i7) {
        this.f8014a = i7;
        this.f8015b = obj;
        this.f8016c = obj2;
        this.f8017d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8014a) {
            case 0:
                o0 o0Var = (o0) this.f8015b;
                k9.a aVar = (k9.a) this.f8016c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f8017d;
                try {
                    s sVarU = i2.c.u((Context) o0Var.f7772b);
                    if (sVarU == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) sVarU.f8038a;
                    synchronized (rVar.f8032d) {
                        rVar.f8034f = threadPoolExecutor;
                        break;
                    }
                    sVarU.f8038a.K(new m(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    aVar.F(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                q0.f fVar = (q0.f) this.f8015b;
                q0.d dVar = (q0.d) this.f8016c;
                q0.e eVar = (q0.e) this.f8017d;
                View view = fVar.f10542a;
                ActionMode actionModeStartActionMode = Build.VERSION.SDK_INT >= 23 ? view.startActionMode(new q0.l(dVar), 1) : view.startActionMode(new q0.n(dVar));
                i9.l.a(fVar.f10549h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    eVar.close();
                    return;
                }
                return;
        }
    }
}
