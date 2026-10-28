package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new q(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f559e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f555a);
        parcel.writeInt(this.f557c);
        parcel.writeInt(this.f558d);
        parcel.writeInt(this.f559e);
        parcel.writeInt(this.f556b);
    }
}
