package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.r;
import s.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f542c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaMetadata f544b;

    static {
        f fVar = new f(0);
        f542c = fVar;
        fVar.put("android.media.metadata.TITLE", 1);
        fVar.put("android.media.metadata.ARTIST", 1);
        fVar.put("android.media.metadata.DURATION", 0);
        fVar.put("android.media.metadata.ALBUM", 1);
        fVar.put("android.media.metadata.AUTHOR", 1);
        fVar.put("android.media.metadata.WRITER", 1);
        fVar.put("android.media.metadata.COMPOSER", 1);
        fVar.put("android.media.metadata.COMPILATION", 1);
        fVar.put("android.media.metadata.DATE", 1);
        fVar.put("android.media.metadata.YEAR", 0);
        fVar.put("android.media.metadata.GENRE", 1);
        fVar.put("android.media.metadata.TRACK_NUMBER", 0);
        fVar.put("android.media.metadata.NUM_TRACKS", 0);
        fVar.put("android.media.metadata.DISC_NUMBER", 0);
        fVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        fVar.put("android.media.metadata.ART", 2);
        fVar.put("android.media.metadata.ART_URI", 1);
        fVar.put("android.media.metadata.ALBUM_ART", 2);
        fVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        fVar.put("android.media.metadata.USER_RATING", 3);
        fVar.put("android.media.metadata.RATING", 3);
        fVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        fVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        fVar.put("android.media.metadata.DISPLAY_ICON", 2);
        fVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        fVar.put("android.media.metadata.MEDIA_ID", 1);
        fVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        fVar.put("android.media.metadata.MEDIA_URI", 1);
        fVar.put("android.media.metadata.ADVERTISEMENT", 0);
        fVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new a7.a(10);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f543a = bundle2;
        r.t(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f543a = parcel.readBundle(r.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f543a);
    }
}
