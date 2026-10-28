package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Binder implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f577b;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f577b = new WeakReference(null);
    }

    @Override // android.support.v4.media.session.b
    public final void T(PlaybackStateCompat playbackStateCompat) {
        if (this.f577b.get() != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i7) {
            case 1:
                parcel.readString();
                if (this.f577b.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 2:
                throw new AssertionError();
            case 3:
                T((PlaybackStateCompat) k9.a.g(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                throw new AssertionError();
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                parcel.readInt();
                if (this.f577b.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.f577b.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 12:
                parcel.readInt();
                if (this.f577b.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            case 13:
                if (this.f577b.get() != null) {
                    throw new ClassCastException();
                }
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
    }
}
