package p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a7.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f10253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f10254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f10255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f10258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f10259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f10260h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f10253a);
        parcel.writeStringList(this.f10254b);
        parcel.writeTypedArray(this.f10255c, i7);
        parcel.writeInt(this.f10256d);
        parcel.writeString(this.f10257e);
        parcel.writeStringList(this.f10258f);
        parcel.writeTypedList(this.f10259g);
        parcel.writeTypedList(this.f10260h);
    }
}
