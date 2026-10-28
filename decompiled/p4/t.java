package p4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a7.a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10227b;

    public t(int i7, String str) {
        this.f10226a = str;
        this.f10227b = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10226a);
        parcel.writeInt(this.f10227b);
    }
}
