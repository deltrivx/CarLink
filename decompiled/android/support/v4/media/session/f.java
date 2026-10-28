package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f578a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f579b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f580c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaSessionCompat$Token f581d;

    public f(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f581d = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f552b);
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f547a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        if (this.f581d.a() == null) {
            return;
        }
        ArrayList arrayList = this.f579b;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f580c.put(null, new e());
            throw null;
        }
    }
}
