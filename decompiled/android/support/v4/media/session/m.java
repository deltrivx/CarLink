package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSession f592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaSessionCompat$Token f594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f595d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList f596e = new RemoteCallbackList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PlaybackStateCompat f597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaMetadataCompat f598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x4.a f600i;

    public m(Context context) {
        MediaSession mediaSessionA = a(context);
        this.f592a = mediaSessionA;
        l lVar = new l(this);
        this.f593b = lVar;
        this.f594c = new MediaSessionCompat$Token(mediaSessionA.getSessionToken(), lVar);
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context) {
        return new MediaSession(context, "MediaSession");
    }

    public final k b() {
        k kVar;
        synchronized (this.f595d) {
            kVar = this.f599h;
        }
        return kVar;
    }

    public x4.a c() {
        x4.a aVar;
        synchronized (this.f595d) {
            aVar = this.f600i;
        }
        return aVar;
    }

    public final PlaybackStateCompat d() {
        return this.f597f;
    }

    public final void e(k kVar, Handler handler) {
        synchronized (this.f595d) {
            try {
                this.f599h = kVar;
                this.f592a.setCallback(kVar == null ? null : kVar.f586b, handler);
                if (kVar != null) {
                    kVar.f(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(x4.a aVar) {
        synchronized (this.f595d) {
            this.f600i = aVar;
        }
    }
}
