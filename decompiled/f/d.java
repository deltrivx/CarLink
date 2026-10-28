package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a7.a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f4744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f4745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4747d;

    public d(IntentSender intentSender, Intent intent, int i7, int i10) {
        this.f4744a = intentSender;
        this.f4745b = intent;
        this.f4746c = i7;
        this.f4747d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        l.e(parcel, "dest");
        parcel.writeParcelable(this.f4744a, i7);
        parcel.writeParcelable(this.f4745b, i7);
        parcel.writeInt(this.f4746c);
        parcel.writeInt(this.f4747d);
    }
}
