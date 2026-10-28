package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new a7.a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f4740b;

    public a(Intent intent, int i7) {
        this.f4739a = i7;
        this.f4740b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f4739a;
        if (i7 != -1) {
            strValueOf = i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb2.append(strValueOf);
        sb2.append(", data=");
        sb2.append(this.f4740b);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        l.e(parcel, "dest");
        parcel.writeInt(this.f4739a);
        Intent intent = this.f4740b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }
}
