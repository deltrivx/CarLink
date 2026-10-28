package k4;

import android.os.Parcel;
import android.os.Parcelable;
import p1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f7309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7308b = new a();
    public static final Parcelable.Creator<b> CREATOR = new o(1);

    public b() {
        this.f7309a = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f7309a = parcelable == null ? f7308b : parcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f7309a = parcelable == f7308b ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f7309a, i7);
    }
}
