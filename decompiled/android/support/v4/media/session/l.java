package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.transport.aoa.UsbAccessoryStarter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o9.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Binder implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f590c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f591b;

    public l(m mVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f591b = new AtomicReference(mVar);
    }

    @Override // android.support.v4.media.session.d
    public final boolean A(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void B(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void C(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String D() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void E(boolean z10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PlaybackStateCompat F() {
        long j5;
        m mVar = (m) this.f591b.get();
        if (mVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = mVar.f597f;
        MediaMetadataCompat mediaMetadataCompat = mVar.f598g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        float f10 = playbackStateCompat.f563d;
        long j10 = playbackStateCompat.f567h;
        int i7 = playbackStateCompat.f560a;
        long j11 = playbackStateCompat.f561b;
        long j12 = -1;
        if (j11 == -1) {
            return playbackStateCompat;
        }
        if ((i7 != 3 && i7 != 4 && i7 != 5) || j10 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = ((long) (f10 * (jElapsedRealtime - j10))) + j11;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f543a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j12 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j12 < 0 || j13 <= j12) {
            j5 = j13 < 0 ? 0L : j13;
        } else {
            j5 = j12;
        }
        ArrayList arrayList = new ArrayList();
        long j14 = playbackStateCompat.f562c;
        long j15 = playbackStateCompat.f564e;
        int i10 = playbackStateCompat.f565f;
        CharSequence charSequence = playbackStateCompat.f566g;
        ArrayList arrayList2 = playbackStateCompat.f568i;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f560a, j5, j14, playbackStateCompat.f563d, j15, i10, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.f569j, playbackStateCompat.k);
    }

    @Override // android.support.v4.media.session.d
    public final int G() {
        return ((m) this.f591b.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.d
    public final void H(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void I() {
    }

    @Override // android.support.v4.media.session.d
    public final void J() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void K(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void L() {
    }

    @Override // android.support.v4.media.session.d
    public final void M(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void N() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final int O() {
        return ((m) this.f591b.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.d
    public final void P(long j5) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final ParcelableVolumeInfo Q() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void R(int i7) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final String S() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long a() {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.d
    public final void b(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void c(b bVar) {
        m mVar = (m) this.f591b.get();
        if (mVar == null) {
            return;
        }
        mVar.f596e.register(bVar, new x4.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (mVar.f595d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void d(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void e(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final boolean g() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void h(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final PendingIntent i() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void j() {
    }

    @Override // android.support.v4.media.session.d
    public final void k(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void l() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void m(int i7, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final CharSequence n() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void o() {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i7) {
            case 1:
                K(parcel.readString(), (Bundle) e0.f(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) e0.f(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zA = A((KeyEvent) e0.f(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.f575b = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) iInterfaceQueryLocalInterface;
                    }
                }
                c(bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.f575b = strongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (b) iInterfaceQueryLocalInterface2;
                    }
                }
                s(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zG = g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 6:
                String strS = S();
                parcel2.writeNoException();
                parcel2.writeString(strS);
                return true;
            case 7:
                String strD = D();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 8:
                PendingIntent pendingIntentI = i();
                parcel2.writeNoException();
                e0.V(parcel2, pendingIntentI);
                return true;
            case 9:
                long jA = a();
                parcel2.writeNoException();
                parcel2.writeLong(jA);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoQ = Q();
                parcel2.writeNoException();
                e0.V(parcel2, parcelableVolumeInfoQ);
                return true;
            case 11:
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                parcel.readString();
                m(i11, i12);
                parcel2.writeNoException();
                return true;
            case 12:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                parcel.readString();
                v(i13, i14);
                parcel2.writeNoException();
                return true;
            case 13:
                J();
                parcel2.writeNoException();
                return true;
            case 14:
                t(parcel.readString(), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                u(parcel.readString(), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                x((Uri) e0.f(parcel, Uri.CREATOR), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                P(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                o();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                w();
                parcel2.writeNoException();
                return true;
            case 23:
                N();
                parcel2.writeNoException();
                return true;
            case 24:
                y(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                d((RatingCompat) e0.f(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                b(parcel.readString(), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                MediaMetadataCompat mediaMetadataCompatP = p();
                parcel2.writeNoException();
                e0.V(parcel2, mediaMetadataCompatP);
                return true;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                PlaybackStateCompat playbackStateCompatF = F();
                parcel2.writeNoException();
                e0.V(parcel2, playbackStateCompatF);
                return true;
            case ServiceTypes.KEYCODE_TEL /* 29 */:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceN = n();
                parcel2.writeNoException();
                if (charSequenceN == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(charSequenceN, parcel2, 1);
                return true;
            case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                e0.V(parcel2, extras);
                return true;
            case 32:
                j();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case ServiceTypes.KEYCODE_VR_START /* 33 */:
                l();
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                q(parcel.readString(), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                k(parcel.readString(), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                e((Uri) e0.f(parcel, Uri.CREATOR), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                int iO = O();
                parcel2.writeNoException();
                parcel2.writeInt(iO);
                return true;
            case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                M(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                h((MediaDescriptionCompat) e0.f(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                C((MediaDescriptionCompat) e0.f(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                f((MediaDescriptionCompat) e0.f(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                H(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                I();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                E(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                int iG = G();
                parcel2.writeNoException();
                parcel2.writeInt(iG);
                return true;
            case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                R(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                z(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleR = r();
                parcel2.writeNoException();
                e0.V(parcel2, bundleR);
                return true;
            case UsbAccessoryStarter.AOA_GET_PROTOCOL /* 51 */:
                B((RatingCompat) e0.f(parcel, RatingCompat.CREATOR), (Bundle) e0.f(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }

    @Override // android.support.v4.media.session.d
    public final MediaMetadataCompat p() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final Bundle r() {
        ((m) this.f591b.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final void s(b bVar) {
        m mVar = (m) this.f591b.get();
        if (mVar == null) {
            return;
        }
        mVar.f596e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (mVar.f595d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void t(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void v(int i7, int i10) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void y(long j5) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void z(float f10) {
        throw new AssertionError();
    }
}
