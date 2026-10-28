package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new q(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f569j;
    public final Bundle k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PlaybackState f570l;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new v();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f574d;

        public CustomAction(Parcel parcel) {
            this.f571a = parcel.readString();
            this.f572b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f573c = parcel.readInt();
            this.f574d = parcel.readBundle(r.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f572b) + ", mIcon=" + this.f573c + ", mExtras=" + this.f574d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f571a);
            TextUtils.writeToParcel(this.f572b, parcel, i7);
            parcel.writeInt(this.f573c);
            parcel.writeBundle(this.f574d);
        }
    }

    public PlaybackStateCompat(int i7, long j5, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f560a = i7;
        this.f561b = j5;
        this.f562c = j10;
        this.f563d = f10;
        this.f564e = j11;
        this.f565f = i10;
        this.f566g = charSequence;
        this.f567h = j12;
        this.f568i = new ArrayList(arrayList);
        this.f569j = j13;
        this.k = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f560a = parcel.readInt();
        this.f561b = parcel.readLong();
        this.f563d = parcel.readFloat();
        this.f567h = parcel.readLong();
        this.f562c = parcel.readLong();
        this.f564e = parcel.readLong();
        this.f566g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f568i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f569j = parcel.readLong();
        this.k = parcel.readBundle(r.class.getClassLoader());
        this.f565f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f560a + ", position=" + this.f561b + ", buffered position=" + this.f562c + ", speed=" + this.f563d + ", updated=" + this.f567h + ", actions=" + this.f564e + ", error code=" + this.f565f + ", error message=" + this.f566g + ", custom actions=" + this.f568i + ", active item id=" + this.f569j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f560a);
        parcel.writeLong(this.f561b);
        parcel.writeFloat(this.f563d);
        parcel.writeLong(this.f567h);
        parcel.writeLong(this.f562c);
        parcel.writeLong(this.f564e);
        TextUtils.writeToParcel(this.f566g, parcel, i7);
        parcel.writeTypedList(this.f568i);
        parcel.writeLong(this.f569j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f565f);
    }
}
