package b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a7.a(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1103a;

    public void a(int i7, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f1103a == null) {
                    this.f1103a = new c(this);
                }
                parcel.writeStrongBinder(this.f1103a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
