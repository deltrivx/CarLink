package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a7.a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f546b;

    public RatingCompat(float f10, int i7) {
        this.f545a = i7;
        this.f546b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f545a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f545a);
        sb2.append(" rating=");
        float f10 = this.f546b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f545a);
        parcel.writeFloat(this.f546b);
    }
}
