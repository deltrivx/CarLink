package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new q(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaDescriptionCompat f548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f549b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f548a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f549b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f548a + ", Id=" + this.f549b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        this.f548a.writeToParcel(parcel, i7);
        parcel.writeLong(this.f549b);
    }
}
