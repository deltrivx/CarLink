package a7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z6.a {
    public static final Parcelable.Creator<j> CREATOR = new a(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53d;

    public j(String str, String str2, int i7) {
        super(0);
        this.f51b = str;
        this.f52c = str2;
        this.f53d = i7;
    }

    @Override // z6.a
    public final int h() {
        return this.f53d;
    }

    @Override // z6.a
    public final String m() {
        return this.f52c;
    }

    @Override // z6.a
    public final String n() {
        return this.f51b;
    }

    @Override // z6.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f51b);
        parcel.writeString(this.f52c);
        parcel.writeInt(this.f53d);
    }
}
