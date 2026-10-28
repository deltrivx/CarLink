package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f601a;

    public /* synthetic */ q(int i7) {
        this.f601a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f601a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f550a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f555a = parcel.readInt();
                parcelableVolumeInfo.f557c = parcel.readInt();
                parcelableVolumeInfo.f558d = parcel.readInt();
                parcelableVolumeInfo.f559e = parcel.readInt();
                parcelableVolumeInfo.f556b = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f601a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i7];
            case 1:
                return new MediaSessionCompat$QueueItem[i7];
            case 2:
                return new MediaSessionCompat$Token[i7];
            case 3:
                return new ParcelableVolumeInfo[i7];
            default:
                return new PlaybackStateCompat[i7];
        }
    }
}
