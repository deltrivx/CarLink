package androidx.versionedparcelable;

import a7.a;
import android.os.Parcel;
import android.os.Parcelable;
import g5.c;
import g5.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1098a;

    public ParcelImpl(Parcel parcel) {
        this.f1098a = new c(parcel).h();
    }

    public ParcelImpl(d dVar) {
        this.f1098a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new c(parcel).l(this.f1098a);
    }
}
