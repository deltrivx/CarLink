package p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a7.a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10166b;

    public c(Parcel parcel) {
        this.f10165a = parcel.createStringArrayList();
        this.f10166b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f10165a);
        parcel.writeTypedList(this.f10166b);
    }
}
