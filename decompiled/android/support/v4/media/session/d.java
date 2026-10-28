package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {
    boolean A(KeyEvent keyEvent);

    void B(RatingCompat ratingCompat, Bundle bundle);

    void C(MediaDescriptionCompat mediaDescriptionCompat, int i7);

    String D();

    void E(boolean z10);

    PlaybackStateCompat F();

    int G();

    void H(int i7);

    void I();

    void J();

    void K(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void L();

    void M(int i7);

    void N();

    int O();

    void P(long j5);

    ParcelableVolumeInfo Q();

    void R(int i7);

    String S();

    long a();

    void b(String str, Bundle bundle);

    void c(b bVar);

    void d(RatingCompat ratingCompat);

    void e(Uri uri, Bundle bundle);

    void f(MediaDescriptionCompat mediaDescriptionCompat);

    boolean g();

    Bundle getExtras();

    void h(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent i();

    void j();

    void k(String str, Bundle bundle);

    void l();

    void m(int i7, int i10);

    CharSequence n();

    void next();

    void o();

    MediaMetadataCompat p();

    void previous();

    void q(String str, Bundle bundle);

    Bundle r();

    void s(b bVar);

    void stop();

    void t(String str, Bundle bundle);

    void u(String str, Bundle bundle);

    void v(int i7, int i10);

    void w();

    void x(Uri uri, Bundle bundle);

    void y(long j5);

    void z(float f10);
}
