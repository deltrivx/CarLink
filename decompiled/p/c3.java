package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends k4.b {
    public static final Parcelable.Creator<c3> CREATOR = new p1.o(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9694d;

    public c3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9693c = parcel.readInt();
        this.f9694d = parcel.readInt() != 0;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f9693c);
        parcel.writeInt(this.f9694d ? 1 : 0);
    }
}
