package android.support.v4.media.session;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f587c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f589e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f585a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f586b = new j(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f588d = new WeakReference(null);

    public final void a(m mVar, Handler handler) {
        if (this.f587c) {
            this.f587c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatD = mVar.d();
            long j5 = playbackStateCompatD == null ? 0L : playbackStateCompatD.f564e;
            boolean z10 = playbackStateCompatD != null && playbackStateCompatD.f560a == 3;
            boolean z11 = (516 & j5) != 0;
            boolean z12 = (j5 & 514) != 0;
            if (z10 && z12) {
                b();
            } else {
                if (z10 || !z11) {
                    return;
                }
                c();
            }
        }
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public final void f(m mVar, Handler handler) {
        synchronized (this.f585a) {
            try {
                this.f588d = new WeakReference(mVar);
                i iVar = this.f589e;
                i iVar2 = null;
                if (iVar != null) {
                    iVar.removeCallbacksAndMessages(null);
                }
                if (mVar != null && handler != null) {
                    iVar2 = new i(this, handler.getLooper());
                }
                this.f589e = iVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
