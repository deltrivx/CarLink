package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6315a;

    public g(int i7) {
        this.f6315a = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f6315a == ((g) obj).f6315a;
    }

    public final int hashCode() {
        return this.f6315a;
    }

    public final String toString() {
        return a2.f.H(new StringBuilder("DefaultLazyKey(index="), this.f6315a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6315a);
    }
}
